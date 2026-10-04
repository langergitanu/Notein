package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8875tk;
import com.aspose.slides.internal.p332p7.C8952ug;

/* JADX INFO: renamed from: com.aspose.slides.m0 */
/* JADX INFO: loaded from: classes3.dex */
class C13816m0 {
    /* JADX INFO: renamed from: k4 */
    public static void m64657k4(IChart iChart, AbstractC4685kk<C8875tk> abstractC4685kk, u8s u8sVar) {
        if (iChart.hasDataTable()) {
            final C8875tk c8875tkInvoke = abstractC4685kk.invoke();
            IDataTable chartDataTable = iChart.getChartDataTable();
            c8875tkInvoke.m41784k4().m41466k4(chartDataTable.hasBorderHorizontal());
            c8875tkInvoke.m41790x1().m41466k4(chartDataTable.hasBorderVertical());
            c8875tkInvoke.m41786kk().m41466k4(chartDataTable.hasBorderOutline());
            c8875tkInvoke.m41788to().m41466k4(chartDataTable.getShowLegendKey());
            C14864yx.m74127k4(chartDataTable.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.m0.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8875tkInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DTableElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8875tkInvoke.m41779du();
                }
            }, u8sVar, null, false);
            C13691jl.m63395k4(chartDataTable.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.m0.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8875tkInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DTableElementData.AddTxPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8952ug invoke() {
                    return c8875tkInvoke.m41782h4();
                }
            }, u8sVar);
            c8875tkInvoke.m41785k4(((DataTable) chartDataTable).m1325k4().m5068k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64658k4(IChart iChart, C8875tk c8875tk, gnb gnbVar) {
        if (c8875tk == null) {
            iChart.setDataTable(false);
            return;
        }
        iChart.setDataTable(true);
        IDataTable chartDataTable = iChart.getChartDataTable();
        if (c8875tk.m41787m9() != null) {
            chartDataTable.setBorderHorizontal(c8875tk.m41787m9().m41467k4());
        }
        if (c8875tk.m41780dy() != null) {
            chartDataTable.setBorderVertical(c8875tk.m41780dy().m41467k4());
        }
        if (c8875tk.m41777c5() != null) {
            chartDataTable.setBorderOutline(c8875tk.m41777c5().m41467k4());
        }
        if (c8875tk.m41783jd() != null) {
            chartDataTable.setShowLegendKey(c8875tk.m41783jd().m41467k4());
        }
        C14864yx.m74128k4(chartDataTable.getFormat(), c8875tk.m41778ck(), gnbVar);
        C13691jl.m63398k4(chartDataTable.getTextFormat(), c8875tk.m41781fa(), gnbVar);
        ((DataTable) chartDataTable).m1325k4().m5069k4(c8875tk.m41789up());
    }
}
