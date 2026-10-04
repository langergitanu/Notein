package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super("Attempted to divide by zero.");
    }

    public DivideByZeroException(String str) {
        super(str);
    }

    public DivideByZeroException(String str, Throwable th) {
        super(str, th);
    }
}
