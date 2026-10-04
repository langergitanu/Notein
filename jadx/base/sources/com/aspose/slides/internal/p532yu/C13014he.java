package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.he */
/* JADX INFO: loaded from: classes5.dex */
public class C13014he extends C13252vh {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f43711yj = C7019kk.m27443k4((Class<?>) Short.TYPE);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f43709ks = C7019kk.m27443k4((Class<?>) short[].class);

    /* JADX INFO: renamed from: rv */
    private static final AbstractC12942dc f43710rv = new C13143ou(C7019kk.m27440jd(Short.MIN_VALUE, 7).Clone(), C7019kk.m27440jd(Short.MAX_VALUE, 7).Clone());

    @Override // com.aspose.slides.internal.p532yu.C13252vh, com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 45;
    }

    @Override // com.aspose.slides.internal.p532yu.C13252vh, com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f43711yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C13252vh, com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        AbstractC12942dc abstractC12942dc = f43710rv;
        RuntimeException runtimeExceptionM60173k4 = abstractC12942dc.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        short[] sArr = {0};
        Exception exceptionM65096k4 = C13850af.m65096k4(str2, sArr);
        short s = sArr[0];
        if (exceptionM65096k4 != null) {
            return exceptionM65096k4;
        }
        RuntimeException runtimeExceptionMo60172k4 = abstractC12942dc.mo60172k4(s, (AbstractC12892ae) this);
        if (runtimeExceptionMo60172k4 != null) {
            return runtimeExceptionMo60172k4;
        }
        objArr[0] = Short.valueOf(s);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C13252vh, com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return f43710rv;
    }

    @Override // com.aspose.slides.internal.p532yu.C13252vh, com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return C14088s7.m67173k4(((Short) C7019kk.m27464to(obj, Short.TYPE)).shortValue(), obj2);
    }

    @Override // com.aspose.slides.internal.p532yu.C13252vh, com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f43709ks;
    }
}
