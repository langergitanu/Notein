package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class TargetInvocationException extends ApplicationException {
    public TargetInvocationException() {
        super("Exception has been thrown by the target of an invocation.");
    }

    public TargetInvocationException(String str) {
        super(str);
    }

    public TargetInvocationException(String str, Throwable th) {
        super(str, th);
    }

    public TargetInvocationException(Throwable th) {
        super("Exception has been thrown by the target of an invocation.", th);
    }
}
