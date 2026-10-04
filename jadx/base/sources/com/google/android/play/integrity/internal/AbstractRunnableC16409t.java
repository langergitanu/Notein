package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.t */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractRunnableC16409t implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TaskCompletionSource f51578a;

    public AbstractRunnableC16409t() {
        this.f51578a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo74936a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f51578a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo74937b();

    /* JADX INFO: renamed from: c */
    public final TaskCompletionSource m75063c() {
        return this.f51578a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo74937b();
        } catch (Exception e) {
            mo74936a(e);
        }
    }

    public AbstractRunnableC16409t(TaskCompletionSource taskCompletionSource) {
        this.f51578a = taskCompletionSource;
    }
}
