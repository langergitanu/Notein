package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes8.dex */
public class BackgroundQueue implements Executor {
    private Semaphore completedTasks = new Semaphore(0);
    private int pendingTaskCount = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        runnable.run();
        this.completedTasks.release();
    }

    public void drain() {
        try {
            this.completedTasks.acquire(this.pendingTaskCount);
            this.pendingTaskCount = 0;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Assert.fail("Interrupted while waiting for background task", e);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.pendingTaskCount++;
        Executors.BACKGROUND_EXECUTOR.execute(new Runnable() { // from class: com.google.firebase.firestore.util.OooOO0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68424OooOo0o.lambda$execute$0(runnable);
            }
        });
    }
}
