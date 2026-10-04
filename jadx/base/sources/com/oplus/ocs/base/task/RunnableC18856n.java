package com.oplus.ocs.base.task;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.n */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18856n implements Runnable {

    /* JADX INFO: renamed from: a */
    private C18855m f57599a;

    /* JADX INFO: renamed from: b */
    private Task f57600b;

    public RunnableC18856n(C18855m c18855m, Task task) {
        this.f57599a = c18855m;
        this.f57600b = task;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f57599a.f57596a.then((TResult) this.f57600b.getResult());
            if (taskThen == null) {
                this.f57599a.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.CURRENT_THREAD;
            taskThen.addOnSuccessListener(executor, this.f57599a);
            taskThen.addOnFailureListener(executor, this.f57599a);
            taskThen.addOnCanceledListener(executor, this.f57599a);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof Exception) {
                this.f57599a.onFailure((Exception) e.getCause());
            } else {
                this.f57599a.onFailure(e);
            }
        } catch (Exception e2) {
            this.f57599a.onFailure(e2);
        }
    }
}
