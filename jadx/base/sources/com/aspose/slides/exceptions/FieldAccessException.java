package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class FieldAccessException extends MemberAccessException {
    public FieldAccessException() {
        super("The caller does not have permission to access this field.");
    }

    public FieldAccessException(String str) {
        super(str);
    }

    public FieldAccessException(String str, Exception exception) {
        super(str, exception);
    }
}
