package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7613ey;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8229lz;

/* JADX INFO: renamed from: com.aspose.slides.yb */
/* JADX INFO: loaded from: classes3.dex */
class C14841yb {
    /* JADX INFO: renamed from: k4 */
    public static MathFunction m73800k4(C7613ey c7613ey, gnb gnbVar) {
        MathFunction mathFunction = new MathFunction(jz7.m63584k4(c7613ey.m31430kk(), gnbVar), jz7.m63584k4(c7613ey.m31431to(), gnbVar));
        if (c7613ey.m31432x1() != null) {
            C13727kg.m63827k4(mathFunction.f2759k4, c7613ey.m31432x1().m36529x1(), gnbVar);
        }
        return mathFunction;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7613ey m73801k4(MathFunction mathFunction, u8s u8sVar) {
        C7613ey c7613ey = new C7613ey();
        jz7.m63587k4(c7613ey.m31430kk(), mathFunction.getName(), u8sVar);
        jz7.m63587k4(c7613ey.m31431to(), mathFunction.getBase(), u8sVar);
        if (!mathFunction.f2759k4.m68975k4()) {
            final C8229lz c8229lzM31429k4 = c7613ey.m31429k4();
            C13727kg.m63826k4(mathFunction.f2759k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.yb.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8229lzM31429k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_FuncPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c8229lzM31429k4.m36528k4();
                }
            }, u8sVar);
        }
        return c7613ey;
    }
}
