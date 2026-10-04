package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.j */
/* JADX INFO: loaded from: classes9.dex */
final class C18852j<TResult> implements InterfaceC18844b<TResult> {

    /* JADX INFO: renamed from: a */
    private Executor f57589a;

    /* JADX INFO: renamed from: b */
    private final Object f57590b = new Object();

    /* JADX INFO: renamed from: c */
    private volatile OnSuccessListener<? super TResult> f57591c;

    public C18852j(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onSuccessListener, "OnSuccessListener is not null");
        this.f57589a = executor;
        this.f57591c = onSuccessListener;
    }

    /* JADX INFO: renamed from: a */
    public final OnSuccessListener<? super TResult> m80537a() {
        OnSuccessListener<? super TResult> onSuccessListener;
        synchronized (this.f57590b) {
            onSuccessListener = this.f57591c;
        }
        return onSuccessListener;
    }

    @Override // com.oplus.ocs.base.task.InterfaceC18844b
    /* JADX INFO: renamed from: a */
    public final void mo80533a(Task<TResult> task) {
        C18864d.m80554a(task, "task is not null");
        if (task.isSuccessful()) {
            synchronized (this.f57590b) {
                try {
                    if (this.f57591c == null) {
                        return;
                    }
                    this.f57589a.execute(new RunnableC18853k(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
