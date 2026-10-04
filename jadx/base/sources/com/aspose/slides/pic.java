package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8692ro;

/* JADX INFO: loaded from: classes3.dex */
class pic {
    /* JADX INFO: renamed from: k4 */
    public static void m69101k4(IUpDownBarsManager iUpDownBarsManager, C8692ro c8692ro, gnb gnbVar) {
        if (c8692ro == null) {
            iUpDownBarsManager.setUpDownBars(false);
            return;
        }
        if (c8692ro.m40101to() != null) {
            iUpDownBarsManager.setGapWidth(c8692ro.m40101to().m37001k4() & 65535);
        }
        if (c8692ro.m40095du() != null) {
            C14864yx.m74128k4(iUpDownBarsManager.getUpBarsFormat(), c8692ro.m40095du().m41532x1(), gnbVar);
        }
        if (c8692ro.m40096h4() != null) {
            C14864yx.m74128k4(iUpDownBarsManager.getDownBarsFormat(), c8692ro.m40096h4().m41532x1(), gnbVar);
        }
        iUpDownBarsManager.setUpDownBars(true);
        ((UpDownBarsManager) iUpDownBarsManager).m3027k4().m73518k4(c8692ro.m40100m9());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69102k4(IUpDownBarsManager iUpDownBarsManager, final C8692ro c8692ro, u8s u8sVar) {
        c8692ro.m40097k4().m37002k4(iUpDownBarsManager.getGapWidth() & 65535);
        if (C14864yx.m74129k4(iUpDownBarsManager.getUpBarsFormat(), null)) {
            C14864yx.m74127k4(iUpDownBarsManager.getUpBarsFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.pic.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8692ro.m40102x1()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_UpDownBarElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8692ro.m40102x1().m41531k4();
                }
            }, u8sVar, null, false);
        }
        if (C14864yx.m74129k4(iUpDownBarsManager.getDownBarsFormat(), null)) {
            C14864yx.m74127k4(iUpDownBarsManager.getDownBarsFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.pic.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8692ro.m40099kk()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_UpDownBarElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8692ro.m40099kk().m41531k4();
                }
            }, u8sVar, null, false);
        }
        c8692ro.m40098k4(((UpDownBarsManager) iUpDownBarsManager).m3027k4().m73517k4());
    }
}
