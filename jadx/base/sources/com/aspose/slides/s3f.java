package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C9108wg;

/* JADX INFO: loaded from: classes3.dex */
class s3f {
    /* JADX INFO: renamed from: k4 */
    public static void m70436k4(IInnerShadow iInnerShadow, AbstractC4685kk<C9108wg> abstractC4685kk) {
        if (iInnerShadow == null) {
            return;
        }
        final C9108wg c9108wgInvoke = abstractC4685kk.invoke();
        c9108wgInvoke.m43656k4(iInnerShadow.getBlurRadius());
        c9108wgInvoke.m43657k4(iInnerShadow.getDirection());
        c9108wgInvoke.m43661x1(iInnerShadow.getDistance());
        C1246ib.m7609k4(iInnerShadow.getShadowColor(), new C7394ca.k4() { // from class: com.aspose.slides.s3f.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9108wgInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_InnerShadowEffectElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c9108wgInvoke.m43655k4(str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70437k4(IInnerShadow iInnerShadow, C9108wg c9108wg) {
        if (c9108wg == null) {
            return;
        }
        iInnerShadow.setBlurRadius(c9108wg.m43654k4());
        iInnerShadow.setDirection(c9108wg.m43658kk());
        iInnerShadow.setDistance(c9108wg.m43660x1());
        C1246ib.m7610k4(iInnerShadow.getShadowColor(), c9108wg.m43659to());
    }
}
