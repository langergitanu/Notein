package com.oplus.ocs.base.task;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.a */
/* JADX INFO: loaded from: classes9.dex */
final class RunnableC18843a implements Runnable {

    /* JADX INFO: renamed from: a */
    private Callable f57570a;

    /* JADX INFO: renamed from: b */
    private TaskImpl f57571b;

    public RunnableC18843a(TaskImpl taskImpl, Callable callable) {
        this.f57571b = taskImpl;
        this.f57570a = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f57571b.setResult(this.f57570a.call());
        } catch (Exception e) {
            this.f57571b.setException(e);
        }
    }
}
