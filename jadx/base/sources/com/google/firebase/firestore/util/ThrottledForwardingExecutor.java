package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes8.dex */
class ThrottledForwardingExecutor implements Executor {
    private final Semaphore availableSlots;
    private final Executor executor;

    public ThrottledForwardingExecutor(int i, Executor executor) {
        this.availableSlots = new Semaphore(i);
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        runnable.run();
        this.availableSlots.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (!this.availableSlots.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.executor.execute(new Runnable() { // from class: com.google.firebase.firestore.util.OooOOO0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68428OooOo0o.lambda$execute$0(runnable);
                }
            });
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
