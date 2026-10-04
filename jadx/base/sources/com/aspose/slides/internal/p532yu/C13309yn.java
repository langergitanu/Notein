package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.yn */
/* JADX INFO: loaded from: classes5.dex */
public class C13309yn extends C13197s7 {
    @Override // com.aspose.slides.internal.p532yu.C13197s7, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 53;
    }

    @Override // com.aspose.slides.internal.p532yu.C13197s7, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        if (str == null || str.length() == 0) {
            return new XmlSchemaException("The attribute value cannot be empty.", C14113y2.f47374k4);
        }
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44475dy.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        C12888a3 c12888a3 = new C12888a3();
        C12888a3[] c12888a3Arr = {c12888a3};
        RuntimeException runtimeExceptionM59989k4 = C12888a3.m59989k4(str2, 1, c12888a3Arr);
        c12888a3Arr[0].CloneTo(c12888a3);
        if (runtimeExceptionM59989k4 != null) {
            return runtimeExceptionM59989k4;
        }
        C14077m4 c14077m4 = new C14077m4();
        C14077m4[] c14077m4Arr = {c14077m4};
        RuntimeException runtimeExceptionM59998k4 = c12888a3.m59998k4(1, c14077m4Arr);
        c14077m4Arr[0].CloneTo(c14077m4);
        if (runtimeExceptionM59998k4 != null) {
            return runtimeExceptionM59998k4;
        }
        Exception exceptionMo60164k4 = AbstractC13279x6.f44475dy.mo60164k4(c14077m4.Clone(), this);
        if (exceptionMo60164k4 != null) {
            return exceptionMo60164k4;
        }
        c14077m4.CloneTo((C14077m4) objArr[0]);
        return null;
    }
}
