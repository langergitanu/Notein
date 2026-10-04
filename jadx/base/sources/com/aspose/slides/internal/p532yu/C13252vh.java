package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.vh */
/* JADX INFO: loaded from: classes5.dex */
public class C13252vh extends C13043j2 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44426yj = C7019kk.m27443k4((Class<?>) Integer.TYPE);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44424ks = C7019kk.m27443k4((Class<?>) int[].class);

    /* JADX INFO: renamed from: rv */
    private static final AbstractC12942dc f44425rv = new C13143ou(C7019kk.m27440jd(Integer.MIN_VALUE, 9).Clone(), C7019kk.m27440jd(Integer.MAX_VALUE, 9).Clone());

    @Override // com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 44;
    }

    @Override // com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44426yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13178qw, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        AbstractC12942dc abstractC12942dc = f44425rv;
        RuntimeException runtimeExceptionM60173k4 = abstractC12942dc.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        int[] iArr = {0};
        Exception exceptionM65089k4 = C13850af.m65089k4(str2, iArr);
        int i = iArr[0];
        if (exceptionM65089k4 != null) {
            return exceptionM65089k4;
        }
        RuntimeException runtimeExceptionMo60168k4 = abstractC12942dc.mo60168k4(i, (AbstractC12892ae) this);
        if (runtimeExceptionMo60168k4 != null) {
            return runtimeExceptionMo60168k4;
        }
        objArr[0] = Integer.valueOf(i);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return f44425rv;
    }

    @Override // com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return C14057f9.m66581k4(((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue(), obj2);
    }

    @Override // com.aspose.slides.internal.p532yu.C13043j2, com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44424ks;
    }
}
