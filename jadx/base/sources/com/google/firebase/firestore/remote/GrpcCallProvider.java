package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import com.google.firestore.p565v1.FirestoreGrpc;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import oO0OOo0o.AbstractC33059OooO0O0;
import oO0OOo0o.AbstractC33081Oooo;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0OOo0o.C33101OoooOO0;

/* JADX INFO: loaded from: classes8.dex */
public class GrpcCallProvider {
    private static final int CONNECTIVITY_ATTEMPT_TIMEOUT_MS = 15000;
    private static final String LOG_TAG = "GrpcCallProvider";
    private static Supplier<AbstractC33081Oooo<?>> overrideChannelBuilderSupplier;
    private final AsyncQueue asyncQueue;
    private oO0OOo0o.OooO0OO callOptions;
    private Task<AbstractC33093Oooo0oo> channelTask;
    private AsyncQueue.DelayedTask connectivityAttemptTimer;
    private final Context context;
    private final DatabaseInfo databaseInfo;
    private final AbstractC33059OooO0O0 firestoreHeaders;

    public GrpcCallProvider(AsyncQueue asyncQueue, Context context, DatabaseInfo databaseInfo, AbstractC33059OooO0O0 abstractC33059OooO0O0) {
        this.asyncQueue = asyncQueue;
        this.context = context;
        this.databaseInfo = databaseInfo;
        this.firestoreHeaders = abstractC33059OooO0O0;
        initChannelTask();
    }

    private void clearConnectivityAttemptTimer() {
        if (this.connectivityAttemptTimer != null) {
            Logger.debug(LOG_TAG, "Clearing the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer.cancel();
            this.connectivityAttemptTimer = null;
        }
    }

    private AbstractC33093Oooo0oo initChannel(Context context, DatabaseInfo databaseInfo) {
        AbstractC33081Oooo<?> abstractC33081Oooo;
        try {
            ProviderInstaller.installIfNeeded(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e) {
            Logger.warn(LOG_TAG, "Failed to update ssl context: %s", e);
        }
        Supplier<AbstractC33081Oooo<?>> supplier = overrideChannelBuilderSupplier;
        if (supplier != null) {
            abstractC33081Oooo = supplier.get();
        } else {
            AbstractC33081Oooo<?> abstractC33081OoooOooO0O0 = AbstractC33081Oooo.OooO0O0(databaseInfo.getHost());
            if (!databaseInfo.isSslEnabled()) {
                abstractC33081OoooOooO0O0.OooO0Oo();
            }
            abstractC33081Oooo = abstractC33081OoooOooO0O0;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        abstractC33081Oooo.OooO0OO();
        oO000Oo0.OooO00o oooO00o = new oO000Oo0.OooO00o(abstractC33081Oooo);
        oooO00o.f114821OooO0O0 = context;
        return oooO00o.OooO00o();
    }

    private void initChannelTask() {
        this.channelTask = Tasks.call(Executors.BACKGROUND_EXECUTOR, new Callable() { // from class: com.google.firebase.firestore.remote.OooOo00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68398OooOo0o.lambda$initChannelTask$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$createClientCall$0(C33101OoooOO0 c33101OoooOO0, Task task) throws Exception {
        return Tasks.forResult(((AbstractC33093Oooo0oo) task.getResult()).OooO0oO(c33101OoooOO0, this.callOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AbstractC33093Oooo0oo lambda$initChannelTask$6() throws Exception {
        final AbstractC33093Oooo0oo abstractC33093Oooo0ooInitChannel = initChannel(this.context, this.databaseInfo);
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.remote.OooOo0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68400OooOo0o.lambda$initChannelTask$5(abstractC33093Oooo0ooInitChannel);
            }
        });
        this.callOptions = ((FirestoreGrpc.FirestoreStub) ((FirestoreGrpc.FirestoreStub) FirestoreGrpc.newStub(abstractC33093Oooo0ooInitChannel).withCallCredentials(this.firestoreHeaders)).withExecutor(this.asyncQueue.getExecutor())).getCallOptions();
        Logger.debug(LOG_TAG, "Channel successfully reset.", new Object[0]);
        return abstractC33093Oooo0ooInitChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$1(AbstractC33093Oooo0oo abstractC33093Oooo0oo) {
        Logger.debug(LOG_TAG, "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        clearConnectivityAttemptTimer();
        resetChannel(abstractC33093Oooo0oo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$3(final AbstractC33093Oooo0oo abstractC33093Oooo0oo) {
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.remote.OooOOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68387OooOo0o.lambda$onConnectivityStateChange$2(abstractC33093Oooo0oo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetChannel$4(AbstractC33093Oooo0oo abstractC33093Oooo0oo) {
        abstractC33093Oooo0oo.OooOOO0();
        initChannelTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivityStateChange, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onConnectivityStateChange$2(final AbstractC33093Oooo0oo abstractC33093Oooo0oo) {
        oO0OOo0o.OooOOO oooOOOOooOO0 = abstractC33093Oooo0oo.OooOO0();
        Logger.debug(LOG_TAG, "Current gRPC connectivity state: " + oooOOOOooOO0, new Object[0]);
        clearConnectivityAttemptTimer();
        if (oooOOOOooOO0 == oO0OOo0o.OooOOO.f119553OooOo0o) {
            Logger.debug(LOG_TAG, "Setting the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: com.google.firebase.firestore.remote.OooOOOo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68385OooOo0o.lambda$onConnectivityStateChange$1(abstractC33093Oooo0oo);
                }
            });
        }
        abstractC33093Oooo0oo.OooOO0O(oooOOOOooOO0, new RunnableC22702OooOOo0(0, this, abstractC33093Oooo0oo));
    }

    private void resetChannel(AbstractC33093Oooo0oo abstractC33093Oooo0oo) {
        this.asyncQueue.enqueueAndForget(new RunnableC22704OooOo0(0, this, abstractC33093Oooo0oo));
    }

    public <ReqT, RespT> Task<oO0OOo0o.OooO0o<ReqT, RespT>> createClientCall(final C33101OoooOO0<ReqT, RespT> c33101OoooOO0) {
        return (Task<oO0OOo0o.OooO0o<ReqT, RespT>>) this.channelTask.continueWithTask(this.asyncQueue.getExecutor(), new Continuation() { // from class: com.google.firebase.firestore.remote.OooOOoo
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f68392OooOo0o.lambda$createClientCall$0(c33101OoooOO0, task);
            }
        });
    }

    public void shutdown() {
        try {
            AbstractC33093Oooo0oo abstractC33093Oooo0oo = (AbstractC33093Oooo0oo) Tasks.await(this.channelTask);
            abstractC33093Oooo0oo.OooOO0o();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (abstractC33093Oooo0oo.OooO0oo(1L)) {
                    return;
                }
                Logger.debug("FirestoreChannel", "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                abstractC33093Oooo0oo.OooOOO0();
                if (abstractC33093Oooo0oo.OooO0oo(60L)) {
                    return;
                }
                Logger.warn("FirestoreChannel", "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                abstractC33093Oooo0oo.OooOOO0();
                Logger.warn("FirestoreChannel", "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            Logger.warn("FirestoreChannel", "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Logger.warn("FirestoreChannel", "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e);
        }
    }
}
