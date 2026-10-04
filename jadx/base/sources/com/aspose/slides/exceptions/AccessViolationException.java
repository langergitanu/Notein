package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class AccessViolationException extends SystemException {
    public AccessViolationException() {
        super("Attempted to read or write protected memory. This is often an indication that other memory is corrupt.");
    }

    public AccessViolationException(String str) {
        super(str);
    }

    public AccessViolationException(String str, Throwable th) {
        super(str, th);
    }
}
