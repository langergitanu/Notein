package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class MethodAccessException extends MemberAccessException {
    public MethodAccessException() {
        super("Cannot access method.");
    }

    public MethodAccessException(String str) {
        super(str);
    }

    public MethodAccessException(String str, Throwable th) {
        super(str, th);
    }
}
