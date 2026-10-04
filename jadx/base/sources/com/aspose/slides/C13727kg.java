package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C9135ws;

/* JADX INFO: renamed from: com.aspose.slides.kg */
/* JADX INFO: loaded from: classes3.dex */
class C13727kg {
    /* JADX INFO: renamed from: k4 */
    public static void m63826k4(p8h p8hVar, AbstractC4685kk<C7782go> abstractC4685kk, u8s u8sVar) {
        if (p8hVar.m68977x1() != null) {
            final C7782go c7782goInvoke = abstractC4685kk.invoke();
            h1b.m6959k4(p8hVar.m68977x1(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.kg.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7782goInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_CtrlPrElementData.AddRPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9135ws invoke() {
                    return c7782goInvoke.m32692k4();
                }
            }, u8sVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63827k4(p8h p8hVar, C7782go c7782go, gnb gnbVar) {
        if (c7782go != null) {
            if (p8hVar.m68977x1() == null) {
                p8hVar.m68974k4(new PortionFormat());
            }
            h1b.m6960k4(p8hVar.m68977x1(), c7782go.m32693x1(), gnbVar);
        }
    }
}
