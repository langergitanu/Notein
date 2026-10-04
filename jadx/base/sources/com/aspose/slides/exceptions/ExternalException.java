package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class ExternalException extends SystemException {
    public ExternalException() {
        super("External component has thrown an exception.");
        super.setErrorCode(-2147467259);
    }

    public int getErrorCode() {
        return super.getHResult();
    }

    public ExternalException(String str) {
        super(str);
        super.setErrorCode(-2147467259);
    }

    public ExternalException(String str, int i) {
        super(str);
        super.setErrorCode(i);
    }

    public ExternalException(String str, Throwable th) {
        super(str, th);
        super.setErrorCode(-2147467259);
    }
}
