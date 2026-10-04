package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClientException extends Exception {
    private Boolean canceled;

    public ClientException() {
        this.canceled = Boolean.FALSE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (getCause() == null) {
            return message;
        }
        return getCause().getMessage() + IOUtils.LINE_SEPARATOR_UNIX + message;
    }

    public Boolean isCanceledException() {
        return this.canceled;
    }

    public ClientException(String str) {
        super(OooO00o.OooO00o("[ErrorMessage]: ", str));
        this.canceled = Boolean.FALSE;
    }

    public ClientException(Throwable th) {
        super(th);
        this.canceled = Boolean.FALSE;
    }

    public ClientException(String str, Throwable th) {
        this(str, th, Boolean.FALSE);
    }

    public ClientException(String str, Throwable th, Boolean bool) {
        super(OooO00o.OooO00o("[ErrorMessage]: ", str), th);
        this.canceled = bool;
        OSSLog.logThrowable2Local(this);
    }
}
