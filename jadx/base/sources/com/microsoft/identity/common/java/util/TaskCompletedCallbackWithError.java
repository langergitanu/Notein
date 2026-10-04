package com.microsoft.identity.common.java.util;

/* JADX INFO: loaded from: classes9.dex */
public interface TaskCompletedCallbackWithError<T, U> extends TaskCompletedCallback<T> {
    void onError(U u);
}
