package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class BadImageFormatException extends SystemException {

    /* JADX INFO: renamed from: k4 */
    private String f4889k4;

    public BadImageFormatException() {
        super("Value does not fall within the expected range");
    }

    public String getFileName() {
        return this.f4889k4;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4889k4;
        if (str == null || str.length() <= 0) {
            return super.getMessage();
        }
        return super.getMessage() + C14052dq.m66570kk() + C14113y2.m67402k4("File name: {0}", this.f4889k4);
    }

    public BadImageFormatException(String str) {
        super(str);
    }

    public BadImageFormatException(String str, String str2) {
        super(str);
        this.f4889k4 = str2;
    }

    public BadImageFormatException(String str, String str2, Throwable th) {
        super(str, th);
        this.f4889k4 = str2;
    }

    public BadImageFormatException(String str, Throwable th) {
        super(str, th);
    }
}
