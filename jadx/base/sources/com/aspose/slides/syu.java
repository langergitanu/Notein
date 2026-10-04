package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C9086w4;

/* JADX INFO: loaded from: classes3.dex */
class syu {
    /* JADX INFO: renamed from: k4 */
    public static C9086w4 m70903k4(MathNaryOperator mathNaryOperator, u8s u8sVar) {
        final C9086w4 c9086w4 = new C9086w4();
        c9086w4.m43482k4(C13811lv.m64603k4(mathNaryOperator.getOperator()));
        c9086w4.m43481k4(flz.m6200k4(mathNaryOperator.getLimitLocation()));
        c9086w4.m43483k4(diq.m5107k4(mathNaryOperator.getGrowToMatchOperandHeight()));
        c9086w4.m43489x1(diq.m5107k4(mathNaryOperator.getHideSubscript()));
        c9086w4.m43485kk(diq.m5107k4(mathNaryOperator.getHideSuperscript()));
        C13727kg.m63826k4(mathNaryOperator.getControlCharacterProperties(), new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.syu.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9086w4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_NaryPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c9086w4.m43480k4();
            }
        }, u8sVar);
        return c9086w4;
    }

    /* JADX INFO: renamed from: k4 */
    public static wjx m70904k4(C9086w4 c9086w4, gnb gnbVar) {
        if (c9086w4 == null) {
            return null;
        }
        wjx wjxVar = new wjx();
        wjxVar.setOperator(C13811lv.m64602k4(c9086w4.m43488x1()));
        wjxVar.setLimitLocation(flz.m6199k4(c9086w4.m43484kk()));
        wjxVar.setGrowToMatchOperandHeight(diq.m5108k4(c9086w4.m43487to()));
        wjxVar.setHideSubscript(diq.m5108k4(c9086w4.m43478du()));
        wjxVar.setHideSuperscript(diq.m5108k4(c9086w4.m43479h4()));
        C13727kg.m63827k4(wjxVar.m72774x1(), c9086w4.m43486m9(), gnbVar);
        return wjxVar;
    }
}
