package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14052dq;

/* JADX INFO: loaded from: classes3.dex */
public class Exception extends RuntimeException {

    /* JADX INFO: renamed from: b */
    private static final String f4892b = "Exception of type System.Exception was thrown.";

    /* JADX INFO: renamed from: a */
    int f4893a;

    public Exception() {
        super(f4892b);
    }

    public int getHResult() {
        return this.f4893a;
    }

    public Throwable getInnerException() {
        return getCause();
    }

    public AbstractC14068j5 getType() {
        return C7019kk.m27443k4(getClass());
    }

    public void setErrorCode(int i) {
        setHResult(i);
    }

    public void setHResult(int i) {
        this.f4893a = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        StringBuilder sb = (message == null || message.length() <= 0) ? new StringBuilder(getClass().toString()) : new StringBuilder(getClass().toString() + ": " + message);
        if (getCause() != null) {
            sb.append(" ---> ");
            sb.append(getCause().toString());
            sb.append(C14052dq.f47188k4);
            sb.append("   --- End of inner exception stack trace ---");
        }
        if (getStackTrace() != null && getStackTrace().length > 0) {
            for (StackTraceElement stackTraceElement : getStackTrace()) {
                sb.append(C14052dq.f47188k4);
                sb.append(stackTraceElement.toString());
            }
        }
        return sb.toString();
    }

    public Exception(String str) {
        super(str);
    }

    public Exception(String str, Throwable th) {
        super(str, th);
    }

    public Exception(Throwable th) {
        super(th);
    }
}
