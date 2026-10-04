package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7662fd;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8487p0;

/* JADX INFO: loaded from: classes3.dex */
class zm1 {
    /* JADX INFO: renamed from: k4 */
    public static MathLimit m74571k4(C8487p0 c8487p0, gnb gnbVar) {
        MathLimit mathLimit = new MathLimit(jz7.m63584k4(c8487p0.m38553kk(), gnbVar), jz7.m63584k4(c8487p0.m38554to(), gnbVar), false);
        if (c8487p0.m38555x1() != null) {
            C13727kg.m63827k4(mathLimit.f2772k4, c8487p0.m38555x1().m31743x1(), gnbVar);
        }
        return mathLimit;
    }

    /* JADX INFO: renamed from: k4 */
    public static C8487p0 m74572k4(MathLimit mathLimit, u8s u8sVar) {
        C8487p0 c8487p0 = new C8487p0();
        jz7.m63587k4(c8487p0.m38553kk(), mathLimit.getBase(), u8sVar);
        jz7.m63587k4(c8487p0.m38554to(), mathLimit.getLimit(), u8sVar);
        if (!mathLimit.f2772k4.m68975k4()) {
            final C7662fd c7662fdM38552k4 = c8487p0.m38552k4();
            C13727kg.m63826k4(mathLimit.f2772k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.zm1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7662fdM38552k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_LimLowPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c7662fdM38552k4.m31742k4();
                }
            }, u8sVar);
        }
        return c8487p0;
    }
}
