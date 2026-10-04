package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ArgumentException extends SystemException {

    /* JADX INFO: renamed from: k4 */
    private String f4887k4;

    public ArgumentException() {
        super("Value does not fall within the expected range.");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4887k4;
        if (str == null || str.length() <= 0) {
            return super.getMessage();
        }
        return super.getMessage() + C14052dq.m66570kk() + C14113y2.m67402k4("Parameter name: {0}", this.f4887k4);
    }

    public String getParamName() {
        return this.f4887k4;
    }

    public ArgumentException(String str) {
        super(str);
    }

    public ArgumentException(String str, String str2) {
        super(str);
        this.f4887k4 = str2;
    }

    public ArgumentException(String str, String str2, Throwable th) {
        super(str, th);
        this.f4887k4 = str2;
    }

    public ArgumentException(String str, Throwable th) {
        super(str, th);
    }
}
