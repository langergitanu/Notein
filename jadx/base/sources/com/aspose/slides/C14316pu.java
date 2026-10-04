package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7809gy;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C9192xf;

/* JADX INFO: renamed from: com.aspose.slides.pu */
/* JADX INFO: loaded from: classes3.dex */
class C14316pu {
    /* JADX INFO: renamed from: k4 */
    public static void m69253k4(IChartPlotArea iChartPlotArea, C7809gy c7809gy, gnb gnbVar) {
        ChartPlotArea chartPlotArea = (ChartPlotArea) iChartPlotArea;
        chartPlotArea.f1450k4 = true;
        C14361qv c14361qvM709k4 = chartPlotArea.m709k4();
        c14361qvM709k4.m69767k4(c7809gy.m32987du());
        c14361qvM709k4.m69774x1(c7809gy.m32993x1().m34682du());
        c14361qvM709k4.m69769k4(c7809gy.m32992to());
        if (c7809gy.m32993x1().m34685kk() != null) {
            c14361qvM709k4.m69771kk(c7809gy.m32993x1().m34685kk().m43603kk());
            C14864yx.m74128k4(iChartPlotArea.getFormat(), c7809gy.m32993x1().m34685kk().m43604x1(), gnbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69254k4(IChartPlotArea iChartPlotArea, C9192xf c9192xf, C14786xh c14786xh) {
        final C7809gy c7809gyM31298to = c9192xf.m44321kk().m31298to();
        C14361qv c14361qvM709k4 = ((ChartPlotArea) iChartPlotArea).m709k4();
        c7809gyM31298to.m32990k4(c14361qvM709k4.m69772to());
        c7809gyM31298to.m32989k4(c14361qvM709k4.m69766k4());
        c7809gyM31298to.m32993x1().m34684k4(c14361qvM709k4.m69773x1());
        c7809gyM31298to.m32993x1().m34683k4();
        c7809gyM31298to.m32993x1().m34685kk().m43602k4(c14361qvM709k4.m69770kk());
        C14864yx.m74127k4(iChartPlotArea.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.pu.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7809gyM31298to.m32993x1().m34685kk()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_PlotSurfaceElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c7809gyM31298to.m32993x1().m34685kk().m43601k4();
            }
        }, c14786xh.m73359k4().m70580k4(), null, false);
    }
}
