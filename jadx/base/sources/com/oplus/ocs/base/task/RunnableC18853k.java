package com.oplus.ocs.base.task;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.k */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18853k implements Runnable {

    /* JADX INFO: renamed from: a */
    private C18852j f57592a;

    /* JADX INFO: renamed from: b */
    private Task f57593b;

    public RunnableC18853k(C18852j c18852j, Task task) {
        this.f57592a = c18852j;
        this.f57593b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f57592a.m80537a() != null) {
            this.f57592a.m80537a().onSuccess(this.f57593b.getResult());
        }
    }
}
