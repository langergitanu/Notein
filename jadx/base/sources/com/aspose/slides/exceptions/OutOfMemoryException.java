package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class OutOfMemoryException extends OutOfMemoryError {
    public OutOfMemoryException() {
        super("There was not enough memory to continue the execution of the program");
    }

    public Throwable getInnerException() {
        return getCause();
    }

    public OutOfMemoryException(String str) {
        super(str);
    }

    public OutOfMemoryException(String str, Throwable th) {
        super(str);
        super.initCause(th);
    }
}
