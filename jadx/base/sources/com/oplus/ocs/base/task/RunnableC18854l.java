package com.oplus.ocs.base.task;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.l */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18854l implements Runnable {

    /* JADX INFO: renamed from: a */
    private Task f57594a;

    /* JADX INFO: renamed from: b */
    private C18845c f57595b;

    public RunnableC18854l(C18845c c18845c, Task task) {
        this.f57595b = c18845c;
        this.f57594a = task;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        Object objThen;
        if (this.f57594a.isCanceled()) {
            this.f57595b.f57573b.tryCancel();
            return;
        }
        try {
            objThen = this.f57595b.f57572a.then((Task<TResult>) this.f57594a);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof Exception) {
                this.f57595b.f57573b.setException((Exception) e.getCause());
            } else {
                this.f57595b.f57573b.setException(e);
            }
            objThen = null;
        } catch (Exception e2) {
            this.f57595b.f57573b.setException(e2);
            objThen = null;
        }
        this.f57595b.f57573b.setResult((TContinuationResult) objThen);
    }
}
