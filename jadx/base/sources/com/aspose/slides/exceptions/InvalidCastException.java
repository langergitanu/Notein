package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidCastException extends ClassCastException {
    public InvalidCastException() {
        super("Specified cast is not valid.");
    }

    public Throwable getInnerException() {
        return getCause();
    }

    public InvalidCastException(String str) {
        super(str);
    }

    public InvalidCastException(String str, Throwable th) {
        super(str);
        super.initCause(th);
    }
}
