package com.aspose.words.net.System;

/* JADX INFO: loaded from: classes5.dex */
public class OverflowException extends ArithmeticException {
    public OverflowException() {
        super("Arithmetic operation resulted in an overflow.");
    }

    public OverflowException(String str) {
        super(str);
    }

    public OverflowException(String str, Throwable th) {
        super(str);
        super.initCause(th);
    }
}
