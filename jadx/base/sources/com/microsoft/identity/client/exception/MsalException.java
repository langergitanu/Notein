package com.microsoft.identity.client.exception;

import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.exception.BaseException;

/* JADX INFO: loaded from: classes9.dex */
public class MsalException extends BaseException {
    public MsalException() {
    }

    @Override // com.microsoft.identity.common.java.exception.BaseException, com.microsoft.identity.common.java.exception.IErrorInformation
    public String getErrorCode() {
        return super.getErrorCode();
    }

    @Override // com.microsoft.identity.common.java.exception.BaseException, java.lang.Throwable
    public String getMessage() {
        return !MsalUtils.isEmpty(super.getMessage()) ? super.getMessage() : "";
    }

    public MsalException(String str) {
        super(str);
    }

    public MsalException(String str, String str2) {
        super(str, str2);
    }

    public MsalException(String str, String str2, Throwable th) {
        super(str, str2, th);
    }
}
