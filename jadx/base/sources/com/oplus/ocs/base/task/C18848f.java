package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.f */
/* JADX INFO: loaded from: classes9.dex */
final class C18848f<TResult> implements InterfaceC18844b<TResult> {

    /* JADX INFO: renamed from: a */
    final Object f57579a = new Object();

    /* JADX INFO: renamed from: b */
    private Executor f57580b;

    /* JADX INFO: renamed from: c */
    private volatile OnCompleteListener<TResult> f57581c;

    public C18848f(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onCompleteListener, "OnCompleteListener is not null");
        this.f57580b = executor;
        this.f57581c = onCompleteListener;
    }

    /* JADX INFO: renamed from: a */
    public final OnCompleteListener<TResult> m80535a() {
        OnCompleteListener<TResult> onCompleteListener;
        synchronized (this.f57579a) {
            onCompleteListener = this.f57581c;
        }
        return onCompleteListener;
    }

    @Override // com.oplus.ocs.base.task.InterfaceC18844b
    /* JADX INFO: renamed from: a */
    public final void mo80533a(Task<TResult> task) {
        C18864d.m80554a(task, "Task is not null");
        synchronized (this.f57579a) {
            try {
                if (this.f57581c == null) {
                    return;
                }
                this.f57580b.execute(new RunnableC18849g(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
