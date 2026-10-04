package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;

/* JADX INFO: loaded from: classes9.dex */
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: a */
    private TaskImpl<TResult> f57553a = new TaskImpl<>();

    public Task<TResult> getTask() {
        return this.f57553a;
    }

    public void setException(Exception exc) {
        C18864d.m80553a(exc);
        this.f57553a.setException(exc);
    }

    public void setResult(TResult tresult) {
        this.f57553a.setResult(tresult);
    }

    public boolean trySetException(Exception exc) {
        C18864d.m80553a(exc);
        return this.f57553a.trySetException(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.f57553a.trySetResult(tresult);
    }
}
