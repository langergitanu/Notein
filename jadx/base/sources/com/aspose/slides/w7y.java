package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8115ko;

/* JADX INFO: loaded from: classes3.dex */
class w7y {
    /* JADX INFO: renamed from: k4 */
    public static void m72648k4(IPresetShadow iPresetShadow, AbstractC4685kk<C8115ko> abstractC4685kk) {
        if (iPresetShadow == null) {
            return;
        }
        final C8115ko c8115koInvoke = abstractC4685kk.invoke();
        c8115koInvoke.m35585k4(iPresetShadow.getDirection());
        c8115koInvoke.m35584k4(iPresetShadow.getDistance());
        C1246ib.m7609k4(iPresetShadow.getShadowColor(), new C7394ca.k4() { // from class: com.aspose.slides.w7y.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8115koInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_PresetShadowEffectElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8115koInvoke.m35583k4(str);
            }
        });
        c8115koInvoke.m35586k4(iPresetShadow.getPreset());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72649k4(IPresetShadow iPresetShadow, C8115ko c8115ko) {
        if (c8115ko == null) {
            return;
        }
        iPresetShadow.setDirection(c8115ko.m35587kk());
        iPresetShadow.setDistance(c8115ko.m35589x1());
        C1246ib.m7610k4(iPresetShadow.getShadowColor(), c8115ko.m35588to());
        iPresetShadow.setPreset(c8115ko.m35582k4());
    }
}
