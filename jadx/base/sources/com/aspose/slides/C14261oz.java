package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8395ny;

/* JADX INFO: renamed from: com.aspose.slides.oz */
/* JADX INFO: loaded from: classes3.dex */
class C14261oz {
    /* JADX INFO: renamed from: k4 */
    public static void m68916k4(IGlow iGlow, AbstractC4685kk<C8395ny> abstractC4685kk) {
        if (iGlow == null) {
            return;
        }
        final C8395ny c8395nyInvoke = abstractC4685kk.invoke();
        C1246ib.m7609k4(iGlow.getColor(), new C7394ca.k4() { // from class: com.aspose.slides.oz.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8395nyInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_GlowEffectElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8395nyInvoke.m37912k4(str);
            }
        });
        c8395nyInvoke.m37913k4(iGlow.getRadius());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68917k4(IGlow iGlow, C8395ny c8395ny) {
        if (c8395ny == null) {
            return;
        }
        C1246ib.m7610k4(iGlow.getColor(), c8395ny.m37914x1());
        iGlow.setRadius(c8395ny.m37911k4());
    }
}
