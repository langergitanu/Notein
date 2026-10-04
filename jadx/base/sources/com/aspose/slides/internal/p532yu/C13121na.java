package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.na */
/* JADX INFO: loaded from: classes5.dex */
public class C13121na extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44137yj = C7019kk.m27443k4((Class<?>) C14047bz.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44136ks = C7019kk.m27443k4((Class<?>) C14047bz[].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44137yj;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6) {
        try {
            return C13850af.m65134wl(str);
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
        return ((C14047bz) C7019kk.m27464to(obj, C14047bz.class)).equals(obj2) ? 0 : -1;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44136ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        C14047bz c14047bz = new C14047bz();
        C14047bz[] c14047bzArr = {c14047bz};
        Exception exceptionM65092k4 = C13850af.m65092k4(str, c14047bzArr);
        c14047bzArr[0].CloneTo(c14047bz);
        if (exceptionM65092k4 != null) {
            return exceptionM65092k4;
        }
        c14047bz.CloneTo((C14047bz) objArr[0]);
        return null;
    }
}
