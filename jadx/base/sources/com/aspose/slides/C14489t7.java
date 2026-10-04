package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8964ul;

/* JADX INFO: renamed from: com.aspose.slides.t7 */
/* JADX INFO: loaded from: classes3.dex */
class C14489t7 {
    /* JADX INFO: renamed from: k4 */
    public static void m70979k4(IFillOverlay iFillOverlay, AbstractC4685kk<C8964ul> abstractC4685kk, u8s u8sVar) {
        if (iFillOverlay == null) {
            return;
        }
        final C8964ul c8964ulInvoke = abstractC4685kk.invoke();
        c8964ulInvoke.m42485k4(iFillOverlay.getBlend());
        C1169h1.m6956k4(iFillOverlay.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.t7.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8964ulInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_FillOverlayEffectElementData.AddFillProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8964ulInvoke.m42484k4(str);
            }
        }, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70980k4(IFillOverlay iFillOverlay, C8964ul c8964ul, gnb gnbVar) {
        if (c8964ul == null) {
            return;
        }
        iFillOverlay.setBlend(c8964ul.m42483k4());
        C1169h1.m6958k4(iFillOverlay.getFillFormat(), c8964ul.m42486x1(), gnbVar);
    }
}
