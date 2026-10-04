package com.microsoft.identity.client.internal;

import com.microsoft.identity.client.exception.MsalException;

/* JADX INFO: loaded from: classes9.dex */
public class AsyncResult<T> {
    private MsalException mMsalException;
    private T mResult;

    public AsyncResult(T t, MsalException msalException) {
        this.mResult = t;
        this.mMsalException = msalException;
    }

    public MsalException getException() {
        return this.mMsalException;
    }

    public T getResult() {
        return this.mResult;
    }

    public boolean getSuccess() {
        return this.mMsalException == null;
    }
}
