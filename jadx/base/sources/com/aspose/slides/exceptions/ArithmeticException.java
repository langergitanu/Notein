package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class ArithmeticException extends java.lang.ArithmeticException {
    public ArithmeticException() {
        super("Overflow or underflow in the arithmetic operation.");
    }

    public Throwable getInnerException() {
        return getCause();
    }

    public ArithmeticException(String str) {
        super(str);
    }

    public ArithmeticException(String str, Throwable th) {
        super(str);
        super.initCause(th);
    }
}
