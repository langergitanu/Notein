package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class OverflowException extends ArithmeticException {
    public OverflowException() {
        super("Arithmetic operation resulted in an overflow.");
    }

    public OverflowException(String str) {
        super(str);
    }

    public OverflowException(String str, Throwable th) {
        super(str, th);
    }
}
