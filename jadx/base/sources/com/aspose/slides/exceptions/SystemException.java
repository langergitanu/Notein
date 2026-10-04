package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class SystemException extends Exception {
    public SystemException() {
        super("System error.");
        super.setErrorCode(-2146233087);
    }

    public SystemException(String str) {
        super(str);
        super.setErrorCode(-2146233087);
    }

    public SystemException(String str, Throwable th) {
        super(str, th);
        super.setErrorCode(-2146233087);
    }

    public SystemException(Throwable th) {
        super(th);
        super.setErrorCode(-2146233087);
    }
}
