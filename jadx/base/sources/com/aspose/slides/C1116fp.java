package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8107km;
import com.aspose.slides.internal.p332p7.C8952ug;

/* JADX INFO: renamed from: com.aspose.slides.fp */
/* JADX INFO: loaded from: classes3.dex */
class C1116fp {
    /* JADX INFO: renamed from: k4 */
    public static void m6240k4(IChartTitle iChartTitle, C8107km c8107km, gnb gnbVar) {
        if (c8107km == null) {
            return;
        }
        iChartTitle.getChart().setTitle(true);
        C0811bb c0811bbM754k4 = ((ChartTitle) iChartTitle).m754k4();
        iChartTitle.setOverlay(c8107km.m35529h4());
        C14864yx.m74128k4(iChartTitle.getFormat(), c8107km.m35528dy(), gnbVar);
        shm.m70627k4(iChartTitle, c8107km.m35535m9(), c8107km.m35526c5(), gnbVar);
        c0811bbM754k4.m4116k4(c8107km.m35536to());
        c0811bbM754k4.m4123x1(c8107km.m35527du());
        c0811bbM754k4.m4117k4(c8107km.m35530jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6241k4(IChartTitle iChartTitle, final C8107km c8107km, u8s u8sVar) {
        C0811bb c0811bbM754k4 = ((ChartTitle) iChartTitle).m754k4();
        C14864yx.m74127k4(iChartTitle.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.fp.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8107km) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_ChartTitleElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8107km.m35537x1();
            }
        }, u8sVar, null, false);
        ITextFrame textFrameForOverriding = iChartTitle.getTextFrameForOverriding();
        if (textFrameForOverriding != null && textFrameForOverriding.getParagraphs().getCount() != 0) {
            hn7.m7242k4(textFrameForOverriding, (C8952ug) c8107km.m35531k4().m37150k4("rich").m29542x1(), u8sVar);
        }
        C13691jl.m63396k4(iChartTitle.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.fp.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8107km) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_ChartTitleElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c8107km.m35534kk();
            }
        }, u8sVar, iChartTitle);
        c8107km.m35533k4(iChartTitle.getOverlay());
        c8107km.m35532k4(c0811bbM754k4.m4122x1());
        c8107km.m35538x1(c0811bbM754k4.m4120kk());
    }
}
