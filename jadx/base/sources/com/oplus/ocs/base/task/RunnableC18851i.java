package com.oplus.ocs.base.task;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.i */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18851i implements Runnable {

    /* JADX INFO: renamed from: a */
    private C18850h f57587a;

    /* JADX INFO: renamed from: b */
    private Task f57588b;

    public RunnableC18851i(C18850h c18850h, Task task) {
        this.f57587a = c18850h;
        this.f57588b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f57587a.m80536a() != null) {
            this.f57587a.m80536a().onFailure(this.f57588b.getException());
        }
    }
}
