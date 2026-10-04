package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8219lw;
import com.aspose.slides.internal.p332p7.C8448oj;
import com.aspose.slides.internal.p332p7.C9070vv;

/* JADX INFO: renamed from: com.aspose.slides.o0 */
/* JADX INFO: loaded from: classes3.dex */
class C14210o0 {
    /* JADX INFO: renamed from: k4 */
    public static MathFraction m68294k4(C8448oj c8448oj, gnb gnbVar) {
        MathFraction mathFraction = new MathFraction(jz7.m63584k4(c8448oj.m38300x1(), gnbVar), jz7.m63584k4(c8448oj.m38299kk(), gnbVar));
        if (c8448oj.m38297k4() != null) {
            if (c8448oj.m38297k4().m43329x1() != null) {
                mathFraction.setFractionType(C14649ut.m71888du(c8448oj.m38297k4().m43329x1().m36480k4()));
            }
            C13727kg.m63827k4(mathFraction.f2756k4, c8448oj.m38297k4().m43328kk(), gnbVar);
        }
        return mathFraction;
    }

    /* JADX INFO: renamed from: k4 */
    public static C8448oj m68295k4(MathFraction mathFraction, u8s u8sVar) {
        C8448oj c8448oj = new C8448oj();
        jz7.m63587k4(c8448oj.m38300x1(), mathFraction.getNumerator(), u8sVar);
        jz7.m63587k4(c8448oj.m38299kk(), mathFraction.getDenominator(), u8sVar);
        if (!mathFraction.m1990x1()) {
            final C9070vv c9070vv = new C9070vv();
            C8219lw c8219lw = new C8219lw();
            c8219lw.m36481k4(C14649ut.m71891h4(mathFraction.getFractionType()));
            c9070vv.m43327k4(c8219lw);
            C13727kg.m63826k4(mathFraction.f2756k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.o0.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9070vv) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_FPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c9070vv.m43326k4();
                }
            }, u8sVar);
            c8448oj.m38298k4(c9070vv);
        }
        return c8448oj;
    }
}
