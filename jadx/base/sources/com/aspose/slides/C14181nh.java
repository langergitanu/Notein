package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7926ie;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8952ug;

/* JADX INFO: renamed from: com.aspose.slides.nh */
/* JADX INFO: loaded from: classes3.dex */
class C14181nh {
    /* JADX INFO: renamed from: k4 */
    public static void m68022k4(IChartTitle iChartTitle, C7926ie c7926ie, gnb gnbVar) {
        if (c7926ie == null) {
            return;
        }
        C14864yx.m74128k4(iChartTitle.getFormat(), c7926ie.m34085du(), gnbVar);
        shm.m70627k4(iChartTitle, c7926ie.m34091to(), c7926ie.m34086h4(), gnbVar);
        ((ChartTitle) iChartTitle).m754k4().m4117k4(c7926ie.m34090m9());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68023k4(IChartTitle iChartTitle, final C7926ie c7926ie, u8s u8sVar) {
        C0811bb c0811bbM754k4 = ((ChartTitle) iChartTitle).m754k4();
        C14864yx.m74127k4(iChartTitle.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.nh.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7926ie) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_AxisTitleElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c7926ie.m34092x1();
            }
        }, u8sVar, null, false);
        ITextFrame textFrameForOverriding = iChartTitle.getTextFrameForOverriding();
        if (textFrameForOverriding != null && textFrameForOverriding.getParagraphs().getCount() != 0) {
            hn7.m7242k4(textFrameForOverriding, (C8952ug) c7926ie.m34087k4().m37150k4("rich").m29542x1(), u8sVar);
        }
        C13691jl.m63396k4(iChartTitle.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.nh.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7926ie) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_AxisTitleElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c7926ie.m34089kk();
            }
        }, u8sVar, iChartTitle);
        c7926ie.m34088k4(c0811bbM754k4.m4121to());
    }
}
