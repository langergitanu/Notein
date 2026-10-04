package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class KeyNotFoundException extends SystemException {
    public KeyNotFoundException() {
        super("The given key was not present in the dictionary.");
    }

    public KeyNotFoundException(String str) {
        super(str);
    }

    public KeyNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
