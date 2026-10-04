package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.c6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12925c6 extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f43483yj = C7019kk.m27443k4((Class<?>) Character.TYPE);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f43482ks = C7019kk.m27443k4((Class<?>) char[].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f43483yj;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6) {
        try {
            return Character.valueOf(C13850af.m65075jd(str));
        } catch (XmlSchemaException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new XmlSchemaException(C13968ri.m65819k4("The value '{0}' is invalid according to its data type.", str), e2);
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return C14117yj.m67526k4(((Character) C7019kk.m27464to(obj, Character.TYPE)).charValue(), obj2);
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f43482ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        char[] cArr = {0};
        Exception exceptionM65086k4 = C13850af.m65086k4(str, cArr);
        char c = cArr[0];
        if (exceptionM65086k4 != null) {
            return exceptionM65086k4;
        }
        objArr[0] = Character.valueOf(c);
        return null;
    }
}
