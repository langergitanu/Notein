package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.f9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12980f9 extends C13208ss {
    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6) {
        try {
            C13143ou c13143ou = (C13143ou) C7019kk.m27452k4((Object) mo60043m9(), C13143ou.class);
            C14046bv c14046bvClone = C13850af.m65069ck(str).Clone();
            Exception exceptionM61351k4 = c13143ou.m61351k4(c14046bvClone.Clone(), 18, 4, true, true);
            if (exceptionM61351k4 == null) {
                return c14046bvClone;
            }
            throw exceptionM61351k4;
        } catch (XmlSchemaException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new XmlSchemaException(C13968ri.m65819k4("The value '{0}' is invalid according to its data type.", str), e2);
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C13208ss, com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        C14046bv[] c14046bvArr = {new C14046bv()};
        Exception exceptionM65091k4 = C13850af.m65091k4(str, c14046bvArr);
        C14046bv c14046bv = c14046bvArr[0];
        if (exceptionM65091k4 != null) {
            return exceptionM65091k4;
        }
        Exception exceptionM61351k4 = ((C13143ou) C7019kk.m27452k4((Object) mo60043m9(), C13143ou.class)).m61351k4(c14046bv.Clone(), 18, 4, true, true);
        if (exceptionM61351k4 != null) {
            return exceptionM61351k4;
        }
        c14046bv.CloneTo((C14046bv) objArr[0]);
        return null;
    }
}
