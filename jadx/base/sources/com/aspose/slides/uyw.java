package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C9314yu;

/* JADX INFO: loaded from: classes3.dex */
class uyw {
    /* JADX INFO: renamed from: k4 */
    public static void m71993k4(IOuterShadow iOuterShadow, AbstractC4685kk<C9314yu> abstractC4685kk) {
        if (iOuterShadow == null) {
            return;
        }
        final C9314yu c9314yuInvoke = abstractC4685kk.invoke();
        c9314yuInvoke.m45159k4(iOuterShadow.getBlurRadius());
        c9314yuInvoke.m45160k4(iOuterShadow.getDirection());
        c9314yuInvoke.m45168x1(iOuterShadow.getDistance());
        C1246ib.m7609k4(iOuterShadow.getShadowColor(), new C7394ca.k4() { // from class: com.aspose.slides.uyw.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9314yuInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_OuterShadowEffectElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c9314yuInvoke.m45157k4(str);
            }
        });
        c9314yuInvoke.m45158k4(iOuterShadow.getRectangleAlign());
        c9314yuInvoke.m45166to((float) iOuterShadow.getSkewHorizontal());
        c9314yuInvoke.m45152du((float) iOuterShadow.getSkewVertical());
        c9314yuInvoke.m45161k4(iOuterShadow.getRotateShadowWithShape());
        c9314yuInvoke.m45169x1((float) iOuterShadow.getScaleHorizontal());
        c9314yuInvoke.m45163kk((float) iOuterShadow.getScaleVertical());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71994k4(IOuterShadow iOuterShadow, C9314yu c9314yu) {
        if (c9314yu == null) {
            return;
        }
        iOuterShadow.setBlurRadius(c9314yu.m45156k4());
        iOuterShadow.setDirection(c9314yu.m45162kk());
        iOuterShadow.setDistance(c9314yu.m45167x1());
        C1246ib.m7610k4(iOuterShadow.getShadowColor(), c9314yu.m45155jd());
        iOuterShadow.setRectangleAlign(c9314yu.m45153dy());
        iOuterShadow.setSkewHorizontal(c9314yu.m45154h4());
        iOuterShadow.setSkewVertical(c9314yu.m45164m9());
        iOuterShadow.setRotateShadowWithShape(c9314yu.m45150c5());
        iOuterShadow.setScaleHorizontal(c9314yu.m45165to());
        iOuterShadow.setScaleVertical(c9314yu.m45151du());
    }
}
