package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.remote.Stream.StreamCallback;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes8.dex */
abstract class AbstractStream<ReqT, RespT, CallbackT extends Stream.StreamCallback> implements Stream<CallbackT> {
    private static final long BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS;
    private static final double BACKOFF_FACTOR = 1.5d;
    private static final long BACKOFF_INITIAL_DELAY_MS;
    private static final long BACKOFF_MAX_DELAY_MS;
    private static final long HEALTHY_TIMEOUT_MS;
    private static final long IDLE_TIMEOUT_MS;
    final ExponentialBackoff backoff;
    private oO0OOo0o.OooO0o<ReqT, RespT> call;
    private final FirestoreChannel firestoreChannel;
    private AsyncQueue.DelayedTask healthCheck;
    private final AsyncQueue.TimerId healthTimerId;
    private AsyncQueue.DelayedTask idleTimer;
    private final AsyncQueue.TimerId idleTimerId;
    final CallbackT listener;
    private final C33101OoooOO0<ReqT, RespT> methodDescriptor;
    private final AsyncQueue workerQueue;
    private Stream.State state = Stream.State.Initial;
    private long closeCount = 0;
    private final AbstractStream<ReqT, RespT, CallbackT>.IdleTimeoutRunnable idleTimeoutRunnable = new IdleTimeoutRunnable();

    public class CloseGuardedRunner {
        private final long initialCloseCount;

        public CloseGuardedRunner(long j) {
            this.initialCloseCount = j;
        }

        public void run(Runnable runnable) {
            AbstractStream.this.workerQueue.verifyIsCurrentThread();
            if (AbstractStream.this.closeCount == this.initialCloseCount) {
                runnable.run();
            } else {
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    public class IdleTimeoutRunnable implements Runnable {
        public IdleTimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractStream.this.handleIdleCloseTimer();
        }
    }

    public class StreamObserver implements IncomingStreamObserver<RespT> {
        private final AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner dispatcher;
        private int responseCount = 0;

        public StreamObserver(AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner closeGuardedRunner) {
            this.dispatcher = closeGuardedRunner;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClose$3(o00Oo0 o00oo02) {
            if (o00oo02.OooO0o()) {
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractStream.this)));
            } else {
                Logger.warn(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractStream.this)), o00oo02);
            }
            AbstractStream.this.handleServerClose(o00oo02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onHeaders$0(C33094OoooO c33094OoooO) {
            Set<String> setUnmodifiableSet;
            if (Logger.isDebugEnabled()) {
                HashMap map = new HashMap();
                if (c33094OoooO.f119655OooO0O0 == 0) {
                    setUnmodifiableSet = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet(c33094OoooO.f119655OooO0O0);
                    for (int i = 0; i < c33094OoooO.f119655OooO0O0; i++) {
                        hashSet.add(new String(c33094OoooO.OooO0o0(i), 0));
                    }
                    setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                }
                for (String str : setUnmodifiableSet) {
                    if (Datastore.WHITE_LISTED_HEADERS.contains(str.toLowerCase(Locale.ENGLISH))) {
                        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
                        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
                        map.put(str, (String) c33094OoooO.OooO0OO(new C33094OoooO.OooO0O0(str, oooO00o)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractStream.this)), map);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNext$1(int i, Object obj) {
            if (Logger.isDebugEnabled()) {
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(AbstractStream.this)), Integer.valueOf(i), obj);
            }
            if (i == 1) {
                AbstractStream.this.onFirst(obj);
            } else {
                AbstractStream.this.onNext(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOpen$2() {
            Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractStream.this)));
            AbstractStream.this.onOpen();
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onClose(final o00Oo0 o00oo02) {
            this.dispatcher.run(new Runnable() { // from class: com.google.firebase.firestore.remote.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68365OooOo0o.lambda$onClose$3(o00oo02);
                }
            });
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onHeaders(final C33094OoooO c33094OoooO) {
            this.dispatcher.run(new Runnable() { // from class: com.google.firebase.firestore.remote.OooO0Oo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68363OooOo0o.lambda$onHeaders$0(c33094OoooO);
                }
            });
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onNext(final RespT respt) {
            final int i = this.responseCount + 1;
            this.dispatcher.run(new Runnable() { // from class: com.google.firebase.firestore.remote.OooO0OO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68360OooOo0o.lambda$onNext$1(i, respt);
                }
            });
            this.responseCount = i;
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onOpen() {
            this.dispatcher.run(new Runnable() { // from class: com.google.firebase.firestore.remote.OooO0o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68366OooOo0o.lambda$onOpen$2();
                }
            });
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        BACKOFF_INITIAL_DELAY_MS = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        BACKOFF_MAX_DELAY_MS = timeUnit2.toMillis(1L);
        IDLE_TIMEOUT_MS = timeUnit2.toMillis(1L);
        HEALTHY_TIMEOUT_MS = timeUnit.toMillis(10L);
        BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS = timeUnit.toMillis(10L);
    }

    public AbstractStream(FirestoreChannel firestoreChannel, C33101OoooOO0<ReqT, RespT> c33101OoooOO0, AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, AsyncQueue.TimerId timerId2, AsyncQueue.TimerId timerId3, CallbackT callbackt) {
        this.firestoreChannel = firestoreChannel;
        this.methodDescriptor = c33101OoooOO0;
        this.workerQueue = asyncQueue;
        this.idleTimerId = timerId2;
        this.healthTimerId = timerId3;
        this.listener = callbackt;
        this.backoff = new ExponentialBackoff(asyncQueue, timerId, BACKOFF_INITIAL_DELAY_MS, 1.5d, BACKOFF_MAX_DELAY_MS);
    }

    private void cancelHealthCheck() {
        AsyncQueue.DelayedTask delayedTask = this.healthCheck;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.healthCheck = null;
        }
    }

    private void cancelIdleCheck() {
        AsyncQueue.DelayedTask delayedTask = this.idleTimer;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.idleTimer = null;
        }
    }

    private void close(Stream.State state, o00Oo0 o00oo02) {
        Assert.hardAssert(isStarted(), "Only started streams should be closed.", new Object[0]);
        Stream.State state2 = Stream.State.Error;
        Assert.hardAssert(state == state2 || o00oo02.OooO0o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.workerQueue.verifyIsCurrentThread();
        if (Datastore.isMissingSslCiphers(o00oo02)) {
            Util.crashMainThread(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", o00oo02.f119730OooO0OO));
        }
        cancelIdleCheck();
        cancelHealthCheck();
        this.backoff.cancel();
        this.closeCount++;
        o00Oo0.OooO00o oooO00o = o00oo02.f119728OooO00o;
        if (oooO00o == o00Oo0.OooO00o.OK) {
            this.backoff.reset();
        } else if (oooO00o == o00Oo0.OooO00o.RESOURCE_EXHAUSTED) {
            Logger.debug(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.backoff.resetToMax();
        } else if (oooO00o == o00Oo0.OooO00o.UNAUTHENTICATED && this.state != Stream.State.Healthy) {
            this.firestoreChannel.invalidateToken();
        } else if (oooO00o == o00Oo0.OooO00o.UNAVAILABLE) {
            Throwable th = o00oo02.f119730OooO0OO;
            if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
                this.backoff.setTemporaryMaxDelay(BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS);
            }
        }
        if (state != state2) {
            Logger.debug(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            tearDown();
        }
        if (this.call != null) {
            if (o00oo02.OooO0o()) {
                Logger.debug(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.call.halfClose();
                } catch (IllegalStateException e) {
                    Logger.debug(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e);
                }
            }
            this.call = null;
        }
        this.state = state;
        this.listener.onClose(o00oo02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIdleCloseTimer() {
        if (isOpen()) {
            close(Stream.State.Initial, o00Oo0.f119717OooO0o0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOpen$0() {
        if (isOpen()) {
            this.state = Stream.State.Healthy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performBackoff$1() {
        Stream.State state = this.state;
        Assert.hardAssert(state == Stream.State.Backoff, "State should still be backoff but was %s", state);
        this.state = Stream.State.Initial;
        start();
        Assert.hardAssert(isStarted(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOpen() {
        this.state = Stream.State.Open;
        this.listener.onOpen();
        if (this.healthCheck == null) {
            this.healthCheck = this.workerQueue.enqueueAfterDelay(this.healthTimerId, HEALTHY_TIMEOUT_MS, new Runnable() { // from class: com.google.firebase.firestore.remote.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68358OooOo0o.lambda$onOpen$0();
                }
            });
        }
    }

    private void performBackoff() {
        Assert.hardAssert(this.state == Stream.State.Error, "Should only perform backoff in an error state", new Object[0]);
        this.state = Stream.State.Backoff;
        this.backoff.backoffAndRun(new Runnable() { // from class: com.google.firebase.firestore.remote.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                this.f68357OooOo0o.lambda$performBackoff$1();
            }
        });
    }

    public void handleServerClose(o00Oo0 o00oo02) {
        Assert.hardAssert(isStarted(), "Can't handle server close on non-started stream!", new Object[0]);
        close(Stream.State.Error, o00oo02);
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public void inhibitBackoff() {
        Assert.hardAssert(!isStarted(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.workerQueue.verifyIsCurrentThread();
        this.state = Stream.State.Initial;
        this.backoff.reset();
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public boolean isOpen() {
        this.workerQueue.verifyIsCurrentThread();
        Stream.State state = this.state;
        return state == Stream.State.Open || state == Stream.State.Healthy;
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public boolean isStarted() {
        this.workerQueue.verifyIsCurrentThread();
        Stream.State state = this.state;
        return state == Stream.State.Starting || state == Stream.State.Backoff || isOpen();
    }

    public void markIdle() {
        if (isOpen() && this.idleTimer == null) {
            this.idleTimer = this.workerQueue.enqueueAfterDelay(this.idleTimerId, IDLE_TIMEOUT_MS, this.idleTimeoutRunnable);
        }
    }

    public abstract void onFirst(RespT respt);

    public abstract void onNext(RespT respt);

    @Override // com.google.firebase.firestore.remote.Stream
    public void start() {
        this.workerQueue.verifyIsCurrentThread();
        Assert.hardAssert(this.call == null, "Last call still set", new Object[0]);
        Assert.hardAssert(this.idleTimer == null, "Idle timer still set", new Object[0]);
        Stream.State state = this.state;
        if (state == Stream.State.Error) {
            performBackoff();
            return;
        }
        Assert.hardAssert(state == Stream.State.Initial, "Already started", new Object[0]);
        this.call = this.firestoreChannel.runBidiStreamingRpc(this.methodDescriptor, new StreamObserver(new CloseGuardedRunner(this.closeCount)));
        this.state = Stream.State.Starting;
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public void stop() {
        if (isStarted()) {
            close(Stream.State.Initial, o00Oo0.f119717OooO0o0);
        }
    }

    public void tearDown() {
    }

    public void writeRequest(ReqT reqt) {
        this.workerQueue.verifyIsCurrentThread();
        Logger.debug(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        cancelIdleCheck();
        this.call.sendMessage(reqt);
    }
}
