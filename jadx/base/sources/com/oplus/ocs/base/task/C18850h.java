package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.h */
/* JADX INFO: loaded from: classes9.dex */
final class C18850h<TResult> implements InterfaceC18844b<TResult> {

    /* JADX INFO: renamed from: a */
    private Executor f57584a;

    /* JADX INFO: renamed from: b */
    private final Object f57585b = new Object();

    /* JADX INFO: renamed from: c */
    private volatile OnFailureListener f57586c;

    public C18850h(Executor executor, OnFailureListener onFailureListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onFailureListener, "OnFailureListener is not null");
        this.f57584a = executor;
        this.f57586c = onFailureListener;
    }

    /* JADX INFO: renamed from: a */
    public final OnFailureListener m80536a() {
        OnFailureListener onFailureListener;
        synchronized (this.f57585b) {
            onFailureListener = this.f57586c;
        }
        return onFailureListener;
    }

    @Override // com.oplus.ocs.base.task.InterfaceC18844b
    /* JADX INFO: renamed from: a */
    public final void mo80533a(Task<TResult> task) {
        C18864d.m80554a(task, "Task is not null");
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.f57585b) {
            try {
                if (this.f57586c == null) {
                    return;
                }
                this.f57584a.execute(new RunnableC18851i(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
