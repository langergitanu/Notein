package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C7871ho;
import com.aspose.slides.internal.p332p7.C8168lb;
import com.aspose.slides.internal.p332p7.C8717rw;
import com.aspose.slides.internal.p332p7.C8880tn;

/* JADX INFO: renamed from: com.aspose.slides.nv */
/* JADX INFO: loaded from: classes3.dex */
class C14202nv {
    /* JADX INFO: renamed from: k4 */
    public static C7871ho m68216k4(MathArray mathArray, u8s u8sVar) {
        if (mathArray == null || mathArray.m1969x1()) {
            return null;
        }
        final C7871ho c7871ho = new C7871ho();
        if (mathArray.getBaseJustification() != 0) {
            C8880tn c8880tn = new C8880tn();
            c8880tn.m41813k4(C14649ut.m71889dy(mathArray.getBaseJustification()));
            c7871ho.m33544k4(c8880tn);
        }
        c7871ho.m33545k4(diq.m5107k4(mathArray.getMaximumDistribution()));
        c7871ho.m33550x1(diq.m5107k4(mathArray.getObjectDistribution()));
        C8168lb c8168lb = new C8168lb();
        c8168lb.m35976k4((byte) mathArray.getRowSpacingRule());
        c7871ho.m33542k4(c8168lb);
        C8717rw c8717rw = new C8717rw();
        c8717rw.m40588k4(mathArray.getRowSpacing());
        c7871ho.m33543k4(c8717rw);
        C13727kg.m63826k4(mathArray.m1968k4(), new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.nv.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7871ho) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_EqArrPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c7871ho.m33541k4();
            }
        }, u8sVar);
        return c7871ho;
    }

    /* JADX INFO: renamed from: k4 */
    public static wo2 m68217k4(C7871ho c7871ho, gnb gnbVar) {
        if (c7871ho == null) {
            return null;
        }
        wo2 wo2Var = new wo2();
        if (c7871ho.m33549x1() != null) {
            wo2Var.m72846k4(C14649ut.m71896m9(c7871ho.m33549x1().m41812k4()));
        }
        wo2Var.m72848k4(diq.m5108k4(c7871ho.m33546kk()));
        wo2Var.m72853x1(diq.m5108k4(c7871ho.m33548to()));
        if (c7871ho.m33539du() != null) {
            wo2Var.m72852x1(c7871ho.m33539du().m35975k4() & 255);
        }
        if (c7871ho.m33540h4() != null) {
            wo2Var.m72847k4(c7871ho.m33540h4().m40587k4());
        }
        C13727kg.m63827k4(wo2Var.m72844h4(), c7871ho.m33547m9(), gnbVar);
        return wo2Var;
    }
}
