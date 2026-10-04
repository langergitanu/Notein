package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidDataException extends SystemException {
    public InvalidDataException() {
        super("Found invalid data while decoding");
    }

    public InvalidDataException(String str) {
        super(str);
    }

    public InvalidDataException(String str, Throwable th) {
        super(str, th);
    }
}
