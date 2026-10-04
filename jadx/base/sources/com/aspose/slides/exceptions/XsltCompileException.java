package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
public class XsltCompileException extends XsltException {
    public XsltCompileException() {
    }

    public XsltCompileException(RuntimeException runtimeException, String str, int i, int i2) {
        super(i != 0 ? "XSLT compile error at {0}({1},{2}). See InnerException for details." : "XSLT compile error.", new String[]{str, C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()), C14057f9.m66586k4(i2, (InterfaceC14073kp) C11697x1.m55250kk())}, str, i, i2, runtimeException);
    }

    public XsltCompileException(String str) {
        super(str);
    }

    public XsltCompileException(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
    }
}
