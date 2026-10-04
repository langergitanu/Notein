package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class MissingFieldException extends MissingMemberException {
    public MissingFieldException() {
        super("Attempted to access a non-existing field.");
    }

    @Override // com.aspose.slides.exceptions.MissingMemberException, java.lang.Throwable
    public String getMessage() {
        Object[] objArr;
        if (this.className == null) {
            return super.getMessage();
        }
        C11697x1 c11697x1M55252to = C11697x1.m55252to();
        if (this.className == null || this.memberName == null) {
            objArr = new Object[0];
        } else {
            objArr = new Object[]{this.className + "." + this.memberName};
        }
        return C14113y2.m67391k4(c11697x1M55252to, "Field '{0}' not found.", objArr);
    }

    public MissingFieldException(String str) {
        super(str);
    }

    public MissingFieldException(String str, String str2) {
        this.className = str;
        this.memberName = str2;
    }

    public MissingFieldException(String str, Throwable th) {
        super(str, th);
    }
}
