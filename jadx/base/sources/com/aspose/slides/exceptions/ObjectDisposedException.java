package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectDisposedException extends InvalidOperationException {

    /* JADX INFO: renamed from: k4 */
    private String f4898k4;

    private ObjectDisposedException() {
        this((String) null, "Cannot access a disposed object.");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4898k4;
        if (str == null || str.length() <= 0) {
            return super.getMessage();
        }
        return super.getMessage() + C14052dq.m66570kk() + C14113y2.m67402k4("Object name: '{0}'.", this.f4898k4);
    }

    public String getObjectName() {
        String str = this.f4898k4;
        return str == null ? "" : str;
    }

    public ObjectDisposedException(String str) {
        this(str, "Cannot access a disposed object.");
    }

    public ObjectDisposedException(String str, String str2) {
        super(str2);
        this.f4898k4 = str;
    }

    public ObjectDisposedException(String str, Throwable th) {
        super(str, th);
    }
}
