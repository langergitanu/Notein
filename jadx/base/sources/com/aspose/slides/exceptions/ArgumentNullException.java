package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class ArgumentNullException extends ArgumentException {
    public ArgumentNullException() {
        super("Value cannot be null.");
    }

    public ArgumentNullException(String str) {
        super("Value cannot be null.", str);
    }

    public ArgumentNullException(String str, String str2) {
        super(str2, str);
    }

    public ArgumentNullException(String str, Throwable th) {
        super(str, th);
    }
}
