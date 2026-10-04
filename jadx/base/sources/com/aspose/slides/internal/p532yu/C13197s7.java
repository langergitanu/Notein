package com.aspose.slides.internal.p532yu;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.s7 */
/* JADX INFO: loaded from: classes5.dex */
public class C13197s7 extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44281yj = C7019kk.m27443k4((Class<?>) C14077m4.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44280ks = C7019kk.m27443k4((Class<?>) C14077m4[].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 17;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: ix */
    public int mo60021ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44281yj;
    }

    /* JADX INFO: renamed from: k4 */
    public int m61461k4(C14077m4 c14077m4, C14077m4 c14077m42) {
        return c14077m4.compareTo(c14077m42);
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return AbstractC13279x6.f44475dy;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return m61461k4((C14077m4) C7019kk.m27464to(obj, C14077m4.class), (C14077m4) C7019kk.m27464to(obj2, C14077m4.class));
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44280ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
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
        C14077m4 c14077m4 = new C14077m4();
        C14077m4[] c14077m4Arr = {c14077m4};
        RuntimeException runtimeExceptionM65098k4 = C13850af.m65098k4(str2, c14077m4Arr);
        c14077m4Arr[0].CloneTo(c14077m4);
        if (runtimeExceptionM65098k4 != null) {
            return runtimeExceptionM65098k4;
        }
        Exception exceptionMo60164k4 = AbstractC13279x6.f44475dy.mo60164k4(c14077m4.Clone(), this);
        if (exceptionMo60164k4 != null) {
            return exceptionMo60164k4;
        }
        c14077m4.CloneTo((C14077m4) objArr[0]);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C13069kn.m61061k4(c12943dd);
    }
}
