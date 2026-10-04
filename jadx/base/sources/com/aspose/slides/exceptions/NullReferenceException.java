package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class NullReferenceException extends NullPointerException {
    public NullReferenceException() {
        super("Object reference not set to an instance of an object.");
    }

    public Throwable getInnerException() {
        return getCause();
    }

    public NullReferenceException(String str) {
        super(str);
    }

    public NullReferenceException(String str, Throwable th) {
        super(str);
        super.initCause(th);
    }
}
