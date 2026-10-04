package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7416cl;
import com.aspose.slides.internal.p332p7.C7447cx;

/* JADX INFO: loaded from: classes3.dex */
class hhj {
    /* JADX INFO: renamed from: k4 */
    public static void m7150k4(IPatternFormat iPatternFormat, C7416cl c7416cl) {
        if (c7416cl == null) {
            return;
        }
        iPatternFormat.setPatternStyle(c7416cl.m29658kk());
        C1246ib.m7611k4(iPatternFormat.getForeColor(), c7416cl.m29659to());
        C1246ib.m7611k4(iPatternFormat.getBackColor(), c7416cl.m29655du());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7151x1(IPatternFormat iPatternFormat, final C7416cl c7416cl) {
        if (iPatternFormat == null) {
            return;
        }
        c7416cl.m29657k4(iPatternFormat.getPatternStyle());
        C1246ib.m7607k4(iPatternFormat.getForeColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.hhj.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7416cl) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_PatternFillPropertiesElementData.AddFgClr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7447cx invoke() {
                return c7416cl.m29656k4();
            }
        });
        C1246ib.m7607k4(iPatternFormat.getBackColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.hhj.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7416cl) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_PatternFillPropertiesElementData.AddBgClr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7447cx invoke() {
                return c7416cl.m29660x1();
            }
        });
    }
}
