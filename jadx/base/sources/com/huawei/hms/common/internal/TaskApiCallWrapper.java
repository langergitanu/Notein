package com.huawei.hms.common.internal;

import o0O00OOO.C25834OooO0oO;

/* JADX INFO: loaded from: classes6.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> mTaskApiCall;
    private final C25834OooO0oO<TResult> mTaskCompletionSource;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, C25834OooO0oO<TResult> c25834OooO0oO) {
        super(1);
        this.mTaskApiCall = taskApiCall;
        this.mTaskCompletionSource = c25834OooO0oO;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.mTaskApiCall;
    }

    public C25834OooO0oO<TResult> getTaskCompletionSource() {
        return this.mTaskCompletionSource;
    }
}
