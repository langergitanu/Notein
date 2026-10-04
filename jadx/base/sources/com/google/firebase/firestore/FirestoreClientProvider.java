package com.google.firebase.firestore;

import androidx.core.util.Consumer;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
final class FirestoreClientProvider {
    private AsyncQueue asyncQueue = new AsyncQueue();
    private FirestoreClient client;
    private final Function<AsyncQueue, FirestoreClient> clientFactory;

    public FirestoreClientProvider(Function<AsyncQueue, FirestoreClient> function) {
        this.clientFactory = function;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeIfShutdown$0(Runnable runnable) {
        this.asyncQueue.enqueueAndForgetEvenAfterShutdown(runnable);
    }

    public synchronized <T> T call(Function<FirestoreClient, T> function) {
        ensureConfigured();
        return function.apply(this.client);
    }

    public synchronized void ensureConfigured() {
        if (!isConfigured()) {
            this.client = this.clientFactory.apply(this.asyncQueue);
        }
    }

    public synchronized <T> T executeIfShutdown(Function<Executor, T> function, Function<Executor, T> function2) {
        Executor executor = new Executor() { // from class: com.google.firebase.firestore.OooOooo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f68096OooOo0o.lambda$executeIfShutdown$0(runnable);
            }
        };
        FirestoreClient firestoreClient = this.client;
        if (firestoreClient != null && !firestoreClient.isTerminated()) {
            return function2.apply(executor);
        }
        return function.apply(executor);
    }

    public AsyncQueue getAsyncQueue() {
        return this.asyncQueue;
    }

    public boolean isConfigured() {
        return this.client != null;
    }

    public synchronized void procedure(Consumer<FirestoreClient> consumer) {
        ensureConfigured();
        consumer.accept(this.client);
    }

    public synchronized Task<Void> terminate() {
        Task<Void> taskTerminate;
        ensureConfigured();
        taskTerminate = this.client.terminate();
        this.asyncQueue.shutdown();
        return taskTerminate;
    }
}
