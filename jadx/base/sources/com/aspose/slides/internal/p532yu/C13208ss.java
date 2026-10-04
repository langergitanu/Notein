package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ss */
/* JADX INFO: loaded from: classes5.dex */
public class C13208ss extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44381yj = C7019kk.m27443k4((Class<?>) C14046bv.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44379ks = C7019kk.m27443k4((Class<?>) C14046bv[].class);

    /* JADX INFO: renamed from: rv */
    private static final AbstractC12942dc f44380rv = new C13143ou(C14046bv.f47167k4.Clone(), C14046bv.f47170x1.Clone());

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 14;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: ix */
    public int mo60021ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44381yj;
    }

    /* JADX INFO: renamed from: k4 */
    public int m61597k4(C14046bv c14046bv, C14046bv c14046bv2) {
        return c14046bv.compareTo(c14046bv2);
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return f44380rv;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return 4088;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return m61597k4((C14046bv) C7019kk.m27464to(obj, C14046bv.class), (C14046bv) C7019kk.m27464to(obj2, C14046bv.class));
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44379ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        AbstractC12942dc abstractC12942dc = f44380rv;
        RuntimeException runtimeExceptionM60173k4 = abstractC12942dc.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        C14046bv[] c14046bvArr = {new C14046bv()};
        Exception exceptionM65091k4 = C13850af.m65091k4(str2, c14046bvArr);
        C14046bv c14046bv = c14046bvArr[0];
        if (exceptionM65091k4 != null) {
            return exceptionM65091k4;
        }
        RuntimeException runtimeExceptionMo60170k4 = abstractC12942dc.mo60170k4(c14046bv.Clone(), this);
        if (runtimeExceptionMo60170k4 != null) {
            return runtimeExceptionMo60170k4;
        }
        c14046bv.CloneTo((C14046bv) objArr[0]);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C13007gz.m60657k4(c12943dd);
    }
}
