package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.gf */
/* JADX INFO: loaded from: classes5.dex */
public class C12999gf extends C13278x5 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f43689yj = C7019kk.m27443k4((Class<?>) Byte.TYPE);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f43687ks = C7019kk.m27443k4((Class<?>) byte[].class);

    /* JADX INFO: renamed from: rv */
    private static final AbstractC12942dc f43688rv = new C13143ou(C14046bv.m66465k4(0), C14046bv.m66465k4(255));

    @Override // com.aspose.slides.internal.p532yu.C13278x5, com.aspose.slides.internal.p532yu.C13030ig, com.aspose.slides.internal.p532yu.C13002gk, com.aspose.slides.internal.p532yu.C13327zj, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 51;
    }

    @Override // com.aspose.slides.internal.p532yu.C13278x5, com.aspose.slides.internal.p532yu.C13030ig, com.aspose.slides.internal.p532yu.C13002gk, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f43689yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C13278x5, com.aspose.slides.internal.p532yu.C13030ig, com.aspose.slides.internal.p532yu.C13002gk, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        AbstractC12942dc abstractC12942dc = f43688rv;
        RuntimeException runtimeExceptionM60173k4 = abstractC12942dc.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        byte[] bArr = {0};
        Exception exceptionM65141x1 = C13850af.m65141x1(str2, bArr);
        byte b = bArr[0];
        if (exceptionM65141x1 != null) {
            return exceptionM65141x1;
        }
        RuntimeException runtimeExceptionMo60172k4 = abstractC12942dc.mo60172k4((short) (b & 255), (AbstractC12892ae) this);
        if (runtimeExceptionMo60172k4 != null) {
            return runtimeExceptionMo60172k4;
        }
        objArr[0] = Byte.valueOf(b);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C13278x5, com.aspose.slides.internal.p532yu.C13030ig, com.aspose.slides.internal.p532yu.C13002gk, com.aspose.slides.internal.p532yu.C13327zj, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return f43688rv;
    }

    @Override // com.aspose.slides.internal.p532yu.C13278x5, com.aspose.slides.internal.p532yu.C13030ig, com.aspose.slides.internal.p532yu.C13002gk, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return C14098up.m67318k4(((Byte) C7019kk.m27464to(obj, Byte.TYPE)).byteValue(), obj2);
    }

    @Override // com.aspose.slides.internal.p532yu.C13278x5, com.aspose.slides.internal.p532yu.C13030ig, com.aspose.slides.internal.p532yu.C13002gk, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f43687ks;
    }
}
