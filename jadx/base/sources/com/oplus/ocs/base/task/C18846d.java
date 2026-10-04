package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.d */
/* JADX INFO: loaded from: classes9.dex */
final class C18846d<TResult> implements InterfaceC18844b<TResult> {

    /* JADX INFO: renamed from: a */
    private Executor f57575a;

    /* JADX INFO: renamed from: b */
    private final Object f57576b = new Object();

    /* JADX INFO: renamed from: c */
    private volatile OnCanceledListener f57577c;

    public C18846d(Executor executor, OnCanceledListener onCanceledListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onCanceledListener, "OnCanceledListener is not null");
        this.f57575a = executor;
        this.f57577c = onCanceledListener;
    }

    /* JADX INFO: renamed from: a */
    public final OnCanceledListener m80534a() {
        OnCanceledListener onCanceledListener;
        synchronized (this.f57576b) {
            onCanceledListener = this.f57577c;
        }
        return onCanceledListener;
    }

    @Override // com.oplus.ocs.base.task.InterfaceC18844b
    /* JADX INFO: renamed from: a */
    public final void mo80533a(Task task) {
        C18864d.m80554a(task, "Task is not null");
        if (task.isCanceled()) {
            synchronized (this.f57576b) {
                try {
                    if (this.f57577c == null) {
                        return;
                    }
                    this.f57575a.execute(new RunnableC18847e(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
