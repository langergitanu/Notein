package oOo00OoO;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: oOo00OoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, m80612d2 = {"LoOo00OoO/OooO0OO;", "LoOo00OoO/OooOoo;", "<init>", "()V", "", "now", "remainingNanos", "(J)J", "LoO00ooO/OooOooO;", "enter", "", "exit", "()Z", "timedOut", "LoOo00OoO/OooOoO;", "sink", "(LoOo00OoO/OooOoO;)LoOo00OoO/OooOoO;", "LoOo00OoO/OooOoo0;", "source", "(LoOo00OoO/OooOoo0;)LoOo00OoO/OooOoo0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(LoO0O000o/OooO00o;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "inQueue", "Z", "next", "LoOo00OoO/OooO0OO;", "timeoutAt", "J", "Companion", "OooO00o", "OooO0O0", "okio"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class C34523OooO0OO extends C34547OooOoo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C34523OooO0OO head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private C34523OooO0OO next;
    private long timeoutAt;

    /* JADX INFO: renamed from: oOo00OoO.OooO0OO$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        public static C34523OooO0OO OooO00o() throws InterruptedException {
            C34523OooO0OO c34523OooO0OO = C34523OooO0OO.head;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34523OooO0OO);
            C34523OooO0OO c34523OooO0OO2 = c34523OooO0OO.next;
            if (c34523OooO0OO2 == null) {
                long jNanoTime = System.nanoTime();
                C34523OooO0OO.condition.await(C34523OooO0OO.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C34523OooO0OO c34523OooO0OO3 = C34523OooO0OO.head;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34523OooO0OO3);
                if (c34523OooO0OO3.next != null || System.nanoTime() - jNanoTime < C34523OooO0OO.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C34523OooO0OO.head;
            }
            long jRemainingNanos = c34523OooO0OO2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                C34523OooO0OO.condition.await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            C34523OooO0OO c34523OooO0OO4 = C34523OooO0OO.head;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34523OooO0OO4);
            c34523OooO0OO4.next = c34523OooO0OO2.next;
            c34523OooO0OO2.next = null;
            return c34523OooO0OO2;
        }
    }

    /* JADX INFO: renamed from: oOo00OoO.OooO0OO$OooO0O0 */
    public static final class OooO0O0 extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            C34523OooO0OO c34523OooO0OOOooO00o;
            while (true) {
                try {
                    C34523OooO0OO.INSTANCE.getClass();
                    reentrantLock = C34523OooO0OO.lock;
                    reentrantLock.lock();
                    try {
                        c34523OooO0OOOooO00o = Companion.OooO00o();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c34523OooO0OOOooO00o == C34523OooO0OO.head) {
                    C34523OooO0OO.head = null;
                    return;
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                reentrantLock.unlock();
                if (c34523OooO0OOOooO00o != null) {
                    c34523OooO0OOOooO00o.timedOut();
                }
            }
        }
    }

    /* JADX INFO: renamed from: oOo00OoO.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C20362OooO0OO implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34544OooOoO f123719OooOo;

        public C20362OooO0OO(InterfaceC34544OooOoO interfaceC34544OooOoO) {
            this.f123719OooOo = interfaceC34544OooOoO;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            InterfaceC34544OooOoO interfaceC34544OooOoO = this.f123719OooOo;
            C34523OooO0OO c34523OooO0OO = C34523OooO0OO.this;
            c34523OooO0OO.enter();
            try {
                interfaceC34544OooOoO.close();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                if (c34523OooO0OO.exit()) {
                    throw c34523OooO0OO.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c34523OooO0OO.exit()) {
                    throw e;
                }
                throw c34523OooO0OO.access$newTimeoutException(e);
            } finally {
                c34523OooO0OO.exit();
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public final void flush() throws IOException {
            InterfaceC34544OooOoO interfaceC34544OooOoO = this.f123719OooOo;
            C34523OooO0OO c34523OooO0OO = C34523OooO0OO.this;
            c34523OooO0OO.enter();
            try {
                interfaceC34544OooOoO.flush();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                if (c34523OooO0OO.exit()) {
                    throw c34523OooO0OO.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c34523OooO0OO.exit()) {
                    throw e;
                }
                throw c34523OooO0OO.access$newTimeoutException(e);
            } finally {
                c34523OooO0OO.exit();
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final C34547OooOoo timeout() {
            return C34523OooO0OO.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f123719OooOo + ')';
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final void write(C34524OooO0Oo source, long j) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
            C34522OooO0O0.OooO0O0(source.f123723OooOo, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                C34543OooOo0o c34543OooOo0o = source.f123724OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                    }
                }
                InterfaceC34544OooOoO interfaceC34544OooOoO = this.f123719OooOo;
                C34523OooO0OO c34523OooO0OO = C34523OooO0OO.this;
                c34523OooO0OO.enter();
                try {
                    try {
                        interfaceC34544OooOoO.write(source, j2);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        if (c34523OooO0OO.exit()) {
                            throw c34523OooO0OO.access$newTimeoutException(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!c34523OooO0OO.exit()) {
                            throw e;
                        }
                        throw c34523OooO0OO.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c34523OooO0OO.exit();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: oOo00OoO.OooO0OO$OooO0Oo */
    public static final class OooO0Oo implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34548OooOoo0 f123721OooOo;

        public OooO0Oo(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
            this.f123721OooOo = interfaceC34548OooOoo0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            InterfaceC34548OooOoo0 interfaceC34548OooOoo0 = this.f123721OooOo;
            C34523OooO0OO c34523OooO0OO = C34523OooO0OO.this;
            c34523OooO0OO.enter();
            try {
                interfaceC34548OooOoo0.close();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                if (c34523OooO0OO.exit()) {
                    throw c34523OooO0OO.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c34523OooO0OO.exit()) {
                    throw e;
                }
                throw c34523OooO0OO.access$newTimeoutException(e);
            } finally {
                c34523OooO0OO.exit();
            }
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo sink, long j) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
            InterfaceC34548OooOoo0 interfaceC34548OooOoo0 = this.f123721OooOo;
            C34523OooO0OO c34523OooO0OO = C34523OooO0OO.this;
            c34523OooO0OO.enter();
            try {
                long j2 = interfaceC34548OooOoo0.read(sink, j);
                if (c34523OooO0OO.exit()) {
                    throw c34523OooO0OO.access$newTimeoutException(null);
                }
                return j2;
            } catch (IOException e) {
                if (c34523OooO0OO.exit()) {
                    throw c34523OooO0OO.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                c34523OooO0OO.exit();
            }
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final C34547OooOoo timeout() {
            return C34523OooO0OO.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f123721OooOo + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.OooOOO0.OooO0o(conditionNewCondition, "lock.newCondition()");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final IOException access$newTimeoutException(IOException cause) {
        return newTimeoutException(cause);
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion companion = INSTANCE;
            companion.getClass();
            companion.getClass();
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.inQueue = true;
                if (head == null) {
                    head = new C34523OooO0OO();
                    OooO0O0 oooO0O0 = new OooO0O0("Okio Watchdog");
                    oooO0O0.setDaemon(true);
                    oooO0O0.start();
                }
                long jNanoTime = System.nanoTime();
                if (timeoutNanos != 0 && hasDeadline) {
                    this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (timeoutNanos != 0) {
                    this.timeoutAt = timeoutNanos + jNanoTime;
                } else {
                    if (!hasDeadline) {
                        throw new AssertionError();
                    }
                    this.timeoutAt = deadlineNanoTime();
                }
                long jRemainingNanos = remainingNanos(jNanoTime);
                C34523OooO0OO c34523OooO0OO = head;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34523OooO0OO);
                while (c34523OooO0OO.next != null) {
                    C34523OooO0OO c34523OooO0OO2 = c34523OooO0OO.next;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34523OooO0OO2);
                    if (jRemainingNanos < c34523OooO0OO2.remainingNanos(jNanoTime)) {
                        break;
                    }
                    c34523OooO0OO = c34523OooO0OO.next;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34523OooO0OO);
                }
                this.next = c34523OooO0OO.next;
                c34523OooO0OO.next = this;
                if (c34523OooO0OO == head) {
                    INSTANCE.getClass();
                    condition.signal();
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        Companion companion = INSTANCE;
        companion.getClass();
        companion.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                return false;
            }
            this.inQueue = false;
            for (C34523OooO0OO c34523OooO0OO = head; c34523OooO0OO != null; c34523OooO0OO = c34523OooO0OO.next) {
                if (c34523OooO0OO.next == this) {
                    c34523OooO0OO.next = this.next;
                    this.next = null;
                    return false;
                }
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final InterfaceC34544OooOoO sink(InterfaceC34544OooOoO sink) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        return new C20362OooO0OO(sink);
    }

    public final InterfaceC34548OooOoo0 source(InterfaceC34548OooOoo0 source) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        return new OooO0Oo(source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(oO0O000o.OooO00o<? extends T> block) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
        enter();
        try {
            T tInvoke = block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return tInvoke;
        } catch (IOException e) {
            if (exit()) {
                throw access$newTimeoutException(e);
            }
            throw e;
        } finally {
            exit();
        }
    }
}
