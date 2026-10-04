package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7943in;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8578q5;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.o1 */
/* JADX INFO: loaded from: classes3.dex */
class C14211o1 {
    /* JADX INFO: renamed from: k4 */
    public static void m68297k4(IChartPlotArea iChartPlotArea, C8578q5 c8578q5, gnb gnbVar) {
        if (c8578q5 == null) {
            throw new Exception("plotAreaElementData must not be null.");
        }
        C14864yx.m74128k4(iChartPlotArea.getFormat(), c8578q5.m39345dy(), gnbVar);
        ChartPlotArea chartPlotArea = (ChartPlotArea) iChartPlotArea;
        C14361qv c14361qvM709k4 = chartPlotArea.m709k4();
        rrr.m70334k4(c14361qvM709k4, c8578q5.m39352to());
        if (!C14064he.m66715kk(c14361qvM709k4.getWidth()) && !C14064he.m66715kk(c14361qvM709k4.getHeight()) && !C14064he.m66715kk(c14361qvM709k4.getX()) && !C14064he.m66715kk(c14361qvM709k4.getY())) {
            chartPlotArea.f1450k4 = false;
        }
        c14361qvM709k4.m69768k4(c8578q5.m39343c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68298k4(IChartPlotArea iChartPlotArea, final C8578q5 c8578q5, u8s u8sVar) {
        C14864yx.m74127k4(iChartPlotArea.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.o1.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8578q5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_PlotAreaElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8578q5.m39350kk();
            }
        }, u8sVar, null, false);
        C14361qv c14361qvM709k4 = ((ChartPlotArea) iChartPlotArea).m709k4();
        rrr.m70333k4(c14361qvM709k4, new AbstractC4685kk<C7943in>() { // from class: com.aspose.slides.o1.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8578q5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_PlotAreaElementData.AddLayout()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7943in invoke() {
                return c8578q5.m39348k4();
            }
        });
        c8578q5.m39349k4(c14361qvM709k4.m69765du());
    }
}
