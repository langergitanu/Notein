package com.oplus.ocs.base.task;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.e */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18847e implements Runnable {

    /* JADX INFO: renamed from: a */
    private C18846d f57578a;

    public RunnableC18847e(C18846d c18846d) {
        this.f57578a = c18846d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f57578a.m80534a() != null) {
            this.f57578a.m80534a().onCanceled();
        }
    }
}
