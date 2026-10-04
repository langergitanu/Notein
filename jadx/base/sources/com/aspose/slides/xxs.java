package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8532pl;
import com.aspose.slides.internal.p332p7.C9106we;

/* JADX INFO: loaded from: classes3.dex */
class xxs {
    /* JADX INFO: renamed from: k4 */
    public static MathRadical m73634k4(C8532pl c8532pl, gnb gnbVar) {
        MathRadical mathRadical = new MathRadical(jz7.m63584k4(c8532pl.m38972kk(), gnbVar), jz7.m63584k4(c8532pl.m38973x1(), gnbVar));
        if (c8532pl.m38970k4() != null) {
            mathRadical.setHideDegree(diq.m5108k4(c8532pl.m38970k4().m43643x1()));
            C13727kg.m63827k4(mathRadical.f2796k4, c8532pl.m38970k4().m43642kk(), gnbVar);
        }
        return mathRadical;
    }

    /* JADX INFO: renamed from: k4 */
    public static C8532pl m73635k4(MathRadical mathRadical, u8s u8sVar) {
        C8532pl c8532pl = new C8532pl();
        if (!mathRadical.m2003x1()) {
            final C9106we c9106we = new C9106we();
            c9106we.m43641k4(diq.m5107k4(mathRadical.getHideDegree()));
            C13727kg.m63826k4(mathRadical.f2796k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.xxs.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9106we) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_RadPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c9106we.m43640k4();
                }
            }, u8sVar);
            c8532pl.m38971k4(c9106we);
        }
        if (mathRadical.getBase() != null) {
            jz7.m63587k4(c8532pl.m38972kk(), mathRadical.getBase(), u8sVar);
        }
        if (mathRadical.getDegree() != null) {
            jz7.m63587k4(c8532pl.m38973x1(), mathRadical.getDegree(), u8sVar);
        }
        return c8532pl;
    }
}
