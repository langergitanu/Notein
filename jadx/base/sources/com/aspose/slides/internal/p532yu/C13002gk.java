package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14065ig;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.gk */
/* JADX INFO: loaded from: classes5.dex */
public class C13002gk extends C13327zj {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f43692yj = C7019kk.m27443k4((Class<?>) Long.TYPE);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f43690ks = C7019kk.m27443k4((Class<?>) long[].class);

    /* JADX INFO: renamed from: rv */
    private static final AbstractC12942dc f43691rv = new C13143ou(C7019kk.m27440jd(0L, 12).Clone(), C7019kk.m27440jd(-1L, 12).Clone());

    @Override // com.aspose.slides.internal.p532yu.C13327zj, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 48;
    }

    @Override // com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f43692yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        AbstractC12942dc abstractC12942dc = f43691rv;
        RuntimeException runtimeExceptionM60173k4 = abstractC12942dc.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        long[] jArr = {0};
        Exception exceptionM65118kk = C13850af.m65118kk(str2, jArr);
        long j = jArr[0];
        if (exceptionM65118kk != null) {
            return exceptionM65118kk;
        }
        RuntimeException runtimeExceptionMo60170k4 = abstractC12942dc.mo60170k4(C7019kk.m27440jd(Long.valueOf(j), 12).Clone(), this);
        if (runtimeExceptionMo60170k4 != null) {
            return runtimeExceptionMo60170k4;
        }
        objArr[0] = Long.valueOf(j);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C13327zj, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return f43691rv;
    }

    @Override // com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return C14065ig.m66720k4(((Long) C7019kk.m27464to(obj, Long.TYPE)).longValue(), obj2);
    }

    @Override // com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f43690ks;
    }
}
