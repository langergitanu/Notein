package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7422cn;
import com.aspose.slides.internal.p332p7.C7537e7;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C7794gs;

/* JADX INFO: renamed from: com.aspose.slides.fd */
/* JADX INFO: loaded from: classes3.dex */
class C1096fd {
    /* JADX INFO: renamed from: k4 */
    public static MathBox m6117k4(C7537e7 c7537e7, gnb gnbVar) {
        if (c7537e7 == null) {
            throw new ArgumentNullException("elementData");
        }
        MathBox mathBox = new MathBox(jz7.m63584k4(c7537e7.m30799kk(), gnbVar));
        if (c7537e7.m30800x1() != null) {
            C7794gs c7794gsM30800x1 = c7537e7.m30800x1();
            mathBox.setOperatorEmulator(diq.m5108k4(c7794gsM30800x1.m32877x1()));
            mathBox.setNoBreak(diq.m5109x1(c7794gsM30800x1.m32872kk()));
            mathBox.setDifferential(diq.m5108k4(c7794gsM30800x1.m32875to()));
            mathBox.setAlignmentPoint(diq.m5108k4(c7794gsM30800x1.m32868h4()));
            if (c7794gsM30800x1.m32867du() != null) {
                mathBox.setExplicitBreak(c7794gsM30800x1.m32867du().m29688k4());
            }
            C13727kg.m63827k4(mathBox.f2741k4, c7794gsM30800x1.m32874m9(), gnbVar);
        }
        return mathBox;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6118k4(MathBox mathBox, C7537e7 c7537e7, u8s u8sVar) {
        if (mathBox == null) {
            throw new ArgumentNullException("groupBox");
        }
        if (c7537e7 == null) {
            throw new ArgumentNullException("elementData");
        }
        final C7794gs c7794gsM30798k4 = c7537e7.m30798k4();
        if (mathBox.getOperatorEmulator()) {
            c7794gsM30798k4.m32871k4(diq.m5107k4(mathBox.getOperatorEmulator()));
        }
        if (!mathBox.getNoBreak()) {
            c7794gsM30798k4.m32878x1(diq.m5107k4(mathBox.getNoBreak()));
        }
        if (mathBox.getDifferential()) {
            c7794gsM30798k4.m32873kk(diq.m5107k4(mathBox.getDifferential()));
        }
        if (mathBox.getAlignmentPoint()) {
            c7794gsM30798k4.m32876to(diq.m5107k4(mathBox.getAlignmentPoint()));
        }
        if ((mathBox.getExplicitBreak() & 255) > 0) {
            C7422cn c7422cn = new C7422cn();
            c7422cn.m29689k4(mathBox.getExplicitBreak());
            c7794gsM30798k4.m32870k4(c7422cn);
        }
        C13727kg.m63826k4(mathBox.f2741k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.fd.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7794gsM30798k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_BoxPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c7794gsM30798k4.m32869k4();
            }
        }, u8sVar);
        jz7.m63587k4(c7537e7.m30799kk(), mathBox.getBase(), u8sVar);
    }
}
