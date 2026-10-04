package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.m */
/* JADX INFO: loaded from: classes9.dex */
final class C18855m<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, InterfaceC18844b<TResult> {

    /* JADX INFO: renamed from: a */
    SuccessContinuation<TResult, TContinuationResult> f57596a;

    /* JADX INFO: renamed from: b */
    private Executor f57597b;

    /* JADX INFO: renamed from: c */
    private TaskImpl<TContinuationResult> f57598c;

    public C18855m(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation, TaskImpl<TContinuationResult> taskImpl) {
        C18864d.m80554a(executor, "executor is not null");
        C18864d.m80554a(successContinuation, "successContinuation is not null");
        C18864d.m80554a(taskImpl, "task is not null");
        this.f57597b = executor;
        this.f57596a = successContinuation;
        this.f57598c = taskImpl;
    }

    @Override // com.oplus.ocs.base.task.InterfaceC18844b
    /* JADX INFO: renamed from: a */
    public final void mo80533a(Task<TResult> task) {
        C18864d.m80554a(task, "task is not null");
        this.f57597b.execute(new RunnableC18856n(this, task));
    }

    @Override // com.oplus.ocs.base.task.OnCanceledListener
    public final void onCanceled() {
        this.f57598c.tryCancel();
    }

    @Override // com.oplus.ocs.base.task.OnFailureListener
    public final void onFailure(Exception exc) {
        C18864d.m80554a(exc, "param exception is not null");
        this.f57598c.setException(exc);
    }

    @Override // com.oplus.ocs.base.task.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f57598c.setResult(tcontinuationresult);
    }
}
