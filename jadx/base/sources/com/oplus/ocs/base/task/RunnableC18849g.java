package com.oplus.ocs.base.task;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.g */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18849g implements Runnable {

    /* JADX INFO: renamed from: a */
    private C18848f f57582a;

    /* JADX INFO: renamed from: b */
    private Task f57583b;

    public RunnableC18849g(C18848f c18848f, Task task) {
        this.f57582a = c18848f;
        this.f57583b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f57582a.f57579a) {
            try {
                if (this.f57582a.m80535a() != null) {
                    this.f57582a.m80535a().onComplete(this.f57583b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
