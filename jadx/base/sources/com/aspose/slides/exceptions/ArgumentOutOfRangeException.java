package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ArgumentOutOfRangeException extends ArgumentException {

    /* JADX INFO: renamed from: k4 */
    private Object f4888k4;

    public ArgumentOutOfRangeException() {
        super("Specified argument was out of the range of valid values.");
    }

    @Override // com.aspose.slides.exceptions.ArgumentException, java.lang.Throwable
    public String getMessage() {
        Object obj = this.f4888k4;
        if (obj == null) {
            return super.getMessage();
        }
        String strM67402k4 = C14113y2.m67402k4("Actual value was {0}.", obj);
        if (super.getMessage() == null) {
            return strM67402k4;
        }
        return super.getMessage() + C14052dq.m66570kk() + strM67402k4;
    }

    public ArgumentOutOfRangeException(String str) {
        super("Specified argument was out of the range of valid values.", str);
    }

    public ArgumentOutOfRangeException(String str, Object obj, String str2) {
        super(str2, str);
        this.f4888k4 = obj;
    }

    public ArgumentOutOfRangeException(String str, String str2) {
        super(str2, str);
    }

    public ArgumentOutOfRangeException(String str, Throwable th) {
        super(str, th);
    }
}
