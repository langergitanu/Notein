package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7303b7;
import com.aspose.slides.internal.p332p7.C7312bc;
import com.aspose.slides.internal.p332p7.C7782go;

/* JADX INFO: loaded from: classes3.dex */
class pbm {
    /* JADX INFO: renamed from: k4 */
    public static MathLimit m69010k4(C7303b7 c7303b7, gnb gnbVar) {
        MathLimit mathLimit = new MathLimit(jz7.m63584k4(c7303b7.m28736kk(), gnbVar), jz7.m63584k4(c7303b7.m28737to(), gnbVar), true);
        if (c7303b7.m28738x1() != null) {
            C13727kg.m63827k4(mathLimit.f2772k4, c7303b7.m28738x1().m28812x1(), gnbVar);
        }
        return mathLimit;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7303b7 m69011k4(MathLimit mathLimit, u8s u8sVar) {
        C7303b7 c7303b7 = new C7303b7();
        jz7.m63587k4(c7303b7.m28736kk(), mathLimit.getBase(), u8sVar);
        jz7.m63587k4(c7303b7.m28737to(), mathLimit.getLimit(), u8sVar);
        p8h p8hVar = mathLimit.f2772k4;
        if (!p8hVar.m68975k4()) {
            final C7312bc c7312bcM28735k4 = c7303b7.m28735k4();
            C13727kg.m63826k4(p8hVar, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.pbm.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7312bcM28735k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_LimUppPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c7312bcM28735k4.m28811k4();
                }
            }, u8sVar);
        }
        return c7303b7;
    }
}
