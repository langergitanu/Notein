package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.c */
/* JADX INFO: loaded from: classes9.dex */
final class C18845c<TResult, TContinuationResult> implements InterfaceC18844b<TResult> {

    /* JADX INFO: renamed from: a */
    Continuation<TResult, TContinuationResult> f57572a;

    /* JADX INFO: renamed from: b */
    TaskImpl<TContinuationResult> f57573b;

    /* JADX INFO: renamed from: c */
    private Executor f57574c;

    public C18845c(Executor executor, Continuation<TResult, TContinuationResult> continuation, TaskImpl<TContinuationResult> taskImpl) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(continuation, "Continuation is not null");
        C18864d.m80554a(taskImpl, "TaskImpl is not null");
        this.f57574c = executor;
        this.f57572a = continuation;
        this.f57573b = taskImpl;
    }

    @Override // com.oplus.ocs.base.task.InterfaceC18844b
    /* JADX INFO: renamed from: a */
    public final void mo80533a(Task<TResult> task) {
        C18864d.m80554a(task, "Task is not null");
        this.f57574c.execute(new RunnableC18854l(this, task));
    }
}
