package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidOperationException extends SystemException {
    public InvalidOperationException() {
        super("Operation is not valid due to the current state of the object.");
    }

    public InvalidOperationException(String str) {
        super(str);
    }

    public InvalidOperationException(String str, Throwable th) {
        super(str, th);
    }
}
