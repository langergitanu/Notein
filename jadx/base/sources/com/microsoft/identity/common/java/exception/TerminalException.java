package com.microsoft.identity.common.java.exception;

/* JADX INFO: loaded from: classes9.dex */
public class TerminalException extends RuntimeException implements IErrorInformation {
    private final String mErrorCode;

    public TerminalException(String str, Throwable th, String str2) {
        super(str, th);
        if (th == null) {
            throw new NullPointerException("cause is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("errorCode is marked non-null but is null");
        }
        this.mErrorCode = str2;
    }

    @Override // com.microsoft.identity.common.java.exception.IErrorInformation
    public String getErrorCode() {
        return this.mErrorCode;
    }

    public TerminalException(Throwable th, String str) {
        super(th);
        if (th == null) {
            throw new NullPointerException("cause is marked non-null but is null");
        }
        if (str != null) {
            this.mErrorCode = str;
            return;
        }
        throw new NullPointerException("errorCode is marked non-null but is null");
    }

    public TerminalException(String str) {
        if (str != null) {
            this.mErrorCode = str;
            return;
        }
        throw new NullPointerException("errorCode is marked non-null but is null");
    }

    public TerminalException(String str, String str2) {
        super(str);
        if (str2 != null) {
            this.mErrorCode = str2;
            return;
        }
        throw new NullPointerException("errorCode is marked non-null but is null");
    }
}
