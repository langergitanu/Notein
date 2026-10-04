package com.aspose.slides;

import com.aspose.slides.AbstractC14173n9;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class pt7 extends AbstractC14173n9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // com.aspose.slides.AbstractC14173n9
    /* JADX INFO: renamed from: k4 */
    public void mo6299k4(List<C14857yq> list, IChartData iChartData) {
        ChartDataWorkbook chartDataWorkbook = (ChartDataWorkbook) iChartData.getChartDataWorkbook();
        boolean z = false;
        C14857yq c14857yq = list.get_Item(0);
        int iM74065to = 0;
        for (int i = 0; i < list.size(); i++) {
            iM74065to += list.get_Item(i).m74065to();
        }
        int i2 = iM74065to > 1 ? iM74065to - 1 : iM74065to;
        int iM67895k4 = m67895k4(list, chartDataWorkbook) - c14857yq.m74060du();
        C14857yq c14857yq2 = iM74065to > 1 ? new C14857yq(c14857yq.m74062k4(), c14857yq.m74066x1(), c14857yq.m74066x1(), c14857yq.m74060du() + iM67895k4, c14857yq.m74061h4()) : null;
        m67896k4(i2, iChartData.getSeries());
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            C14857yq c14857yq3 = list.get_Item(i3);
            int iM74066x1 = c14857yq3.m74066x1();
            while (iM74066x1 <= c14857yq3.m74063kk()) {
                if (iM74066x1 != c14857yq.m74066x1() || c14857yq2 == null) {
                    ChartSeries chartSeries = (ChartSeries) iChartData.getSeries().get_Item(i4);
                    chartSeries.m728k4(new StringChartValue((ChartData) iChartData, new C0936ec(), z));
                    if (iM67895k4 > 0) {
                        for (?? r11 = z; r11 < iM67895k4; r11++) {
                            chartSeries.getName().getAsCells().add(chartDataWorkbook.getCell(c14857yq3.m74062k4(), c14857yq3.m74060du() + r11, iM74066x1));
                        }
                    }
                    C14857yq c14857yq4 = new C14857yq(c14857yq3.m74062k4(), iM74066x1, iM74066x1, c14857yq3.m74060du() + iM67895k4, c14857yq3.m74061h4());
                    if (c14857yq2 != null) {
                        AbstractC14173n9.m67893k4(chartDataWorkbook, chartSeries, c14857yq2, new AbstractC14173n9.k4() { // from class: com.aspose.slides.pt7.1
                            @Override // com.aspose.slides.AbstractC14173n9.k4
                            /* JADX INFO: renamed from: k4 */
                            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                                iChartDataPoint.getXValue().setAsCell(iChartDataCell);
                            }
                        });
                    }
                    AbstractC14173n9.m67893k4(chartDataWorkbook, chartSeries, c14857yq4, new AbstractC14173n9.k4() { // from class: com.aspose.slides.pt7.2
                        @Override // com.aspose.slides.AbstractC14173n9.k4
                        /* JADX INFO: renamed from: k4 */
                        public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                            iChartDataPoint.getYValue().setAsCell(iChartDataCell);
                        }
                    });
                    i4++;
                }
                iM74066x1++;
                z = false;
            }
            i3++;
            z = false;
        }
    }
}
