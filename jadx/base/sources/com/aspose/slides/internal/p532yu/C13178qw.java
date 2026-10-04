package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.qw */
/* JADX INFO: loaded from: classes5.dex */
public class C13178qw extends C13208ss {
    @Override // com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 40;
    }

    @Override // com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = mo60043m9().m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        C14046bv[] c14046bvArr = {new C14046bv()};
        Exception exceptionM65144x1 = C13850af.m65144x1(str2, c14046bvArr);
        C14046bv c14046bv = c14046bvArr[0];
        if (exceptionM65144x1 != null) {
            return exceptionM65144x1;
        }
        RuntimeException runtimeExceptionMo60170k4 = mo60043m9().mo60170k4(c14046bv.Clone(), this);
        if (runtimeExceptionMo60170k4 != null) {
            return runtimeExceptionMo60170k4;
        }
        objArr[0] = c14046bv.Clone();
        return null;
    }
}
