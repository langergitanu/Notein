package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.internal.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class TaskCancelException extends Exception {
    public TaskCancelException() {
    }

    public TaskCancelException(String str) {
        super(OooO00o.OooO00o("[ErrorMessage]: ", str));
    }

    public TaskCancelException(Throwable th) {
        super(th);
    }
}
