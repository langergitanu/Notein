package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8201ln;
import com.aspose.slides.internal.p332p7.C9278ye;

/* JADX INFO: renamed from: com.aspose.slides.mx */
/* JADX INFO: loaded from: classes3.dex */
class C14147mx {
    /* JADX INFO: renamed from: k4 */
    public static MathBorderBox m67763k4(C8201ln c8201ln, gnb gnbVar) {
        if (c8201ln == null) {
            throw new ArgumentNullException("elementData");
        }
        MathBorderBox mathBorderBox = new MathBorderBox(jz7.m63584k4(c8201ln.m36336x1(), gnbVar));
        if (c8201ln.m36334k4() != null) {
            mathBorderBox.setHideTop(diq.m5108k4(c8201ln.m36334k4().m44973x1()));
            mathBorderBox.setHideBottom(diq.m5108k4(c8201ln.m36334k4().m44967kk()));
            mathBorderBox.setHideLeft(diq.m5108k4(c8201ln.m36334k4().m44971to()));
            mathBorderBox.setHideRight(diq.m5108k4(c8201ln.m36334k4().m44958du()));
            mathBorderBox.setStrikethroughHorizontal(diq.m5108k4(c8201ln.m36334k4().m44962h4()));
            mathBorderBox.setStrikethroughVertical(diq.m5108k4(c8201ln.m36334k4().m44969m9()));
            mathBorderBox.setStrikethroughBottomLeftToTopRight(diq.m5108k4(c8201ln.m36334k4().m44960dy()));
            mathBorderBox.setStrikethroughTopLeftToBottomRight(diq.m5108k4(c8201ln.m36334k4().m44957c5()));
            C13727kg.m63827k4(mathBorderBox.f2734k4, c8201ln.m36334k4().m44964jd(), gnbVar);
        }
        return mathBorderBox;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67764k4(MathBorderBox mathBorderBox, C8201ln c8201ln, u8s u8sVar) {
        if (mathBorderBox == null) {
            throw new ArgumentNullException("borderBox");
        }
        if (c8201ln == null) {
            throw new ArgumentNullException("elementData");
        }
        final C9278ye c9278ye = new C9278ye();
        if (mathBorderBox.getHideTop()) {
            c9278ye.m44966k4(diq.m5107k4(mathBorderBox.getHideTop()));
        }
        if (mathBorderBox.getHideBottom()) {
            c9278ye.m44974x1(diq.m5107k4(mathBorderBox.getHideBottom()));
        }
        if (mathBorderBox.getHideLeft()) {
            c9278ye.m44968kk(diq.m5107k4(mathBorderBox.getHideLeft()));
        }
        if (mathBorderBox.getHideRight()) {
            c9278ye.m44972to(diq.m5107k4(mathBorderBox.getHideRight()));
        }
        if (mathBorderBox.getStrikethroughHorizontal()) {
            c9278ye.m44959du(diq.m5107k4(mathBorderBox.getStrikethroughHorizontal()));
        }
        if (mathBorderBox.getStrikethroughVertical()) {
            c9278ye.m44963h4(diq.m5107k4(mathBorderBox.getStrikethroughVertical()));
        }
        if (mathBorderBox.getStrikethroughBottomLeftToTopRight()) {
            c9278ye.m44970m9(diq.m5107k4(mathBorderBox.getStrikethroughBottomLeftToTopRight()));
        }
        if (mathBorderBox.getStrikethroughTopLeftToBottomRight()) {
            c9278ye.m44961dy(diq.m5107k4(mathBorderBox.getStrikethroughTopLeftToBottomRight()));
        }
        C13727kg.m63826k4(mathBorderBox.f2734k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.mx.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9278ye) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_BorderBoxPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c9278ye.m44965k4();
            }
        }, u8sVar);
        c8201ln.m36335k4(c9278ye);
        jz7.m63587k4(c8201ln.m36336x1(), mathBorderBox.getBase(), u8sVar);
    }
}
