package com.aspose.slides;

import com.aspose.slides.AbstractC14173n9;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.fu */
/* JADX INFO: loaded from: classes3.dex */
class C1121fu extends AbstractC14173n9 {
    @Override // com.aspose.slides.AbstractC14173n9
    /* JADX INFO: renamed from: k4 */
    public void mo6299k4(List<C14857yq> list, IChartData iChartData) {
        C14857yq c14857yq;
        int i;
        char c;
        char c2;
        List<C14857yq> list2 = list;
        ChartDataWorkbook chartDataWorkbook = (ChartDataWorkbook) iChartData.getChartDataWorkbook();
        char c3 = 0;
        C14857yq c14857yq2 = list2.get_Item(0);
        int iM74065to = 0;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            iM74065to += list2.get_Item(i2).m74065to();
        }
        int i3 = iM74065to - 1;
        int i4 = i3 % 2;
        char c4 = 2;
        int i5 = i3 / 2;
        if (i4 != 0) {
            i5++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        int iM67895k4 = m67895k4(list2, chartDataWorkbook) - c14857yq2.m74060du();
        C14857yq c14857yq3 = iM74065to > 1 ? new C14857yq(c14857yq2.m74062k4(), c14857yq2.m74066x1(), c14857yq2.m74066x1(), c14857yq2.m74060du() + iM67895k4, c14857yq2.m74061h4()) : null;
        m67896k4(i5, iChartData.getSeries());
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        while (i6 < list2.size()) {
            C14857yq c14857yq4 = list2.get_Item(i6);
            int iM74066x1 = c14857yq4.m74066x1();
            while (iM74066x1 <= c14857yq4.m74063kk()) {
                if (iM74066x1 != c14857yq2.m74066x1() || c14857yq3 == null) {
                    final ChartSeries[] chartSeriesArr = {(ChartSeries) iChartData.getSeries().get_Item(i7)};
                    if (z) {
                        c14857yq = c14857yq2;
                    } else {
                        c14857yq = c14857yq2;
                        char c5 = 0;
                        chartSeriesArr[c3].m728k4(new StringChartValue((ChartData) iChartData, new C0936ec(), false));
                        if (iM67895k4 > 0) {
                            int i8 = 0;
                            while (i8 < iM67895k4) {
                                chartSeriesArr[c5].getName().getAsCells().add(chartDataWorkbook.getCell(c14857yq4.m74062k4(), c14857yq4.m74060du() + i8, iM74066x1));
                                i8++;
                                c5 = 0;
                            }
                        }
                    }
                    i = iM74066x1;
                    C14857yq c14857yq5 = new C14857yq(c14857yq4.m74062k4(), i, i, c14857yq4.m74060du() + iM67895k4, c14857yq4.m74061h4());
                    c = 2;
                    if (iM74065to <= 2) {
                        chartSeriesArr[0].getDataPoints().setDataSourceTypeForBubbleSizes(2);
                    }
                    if (z) {
                        AbstractC14173n9.m67893k4(chartDataWorkbook, iChartData.getSeries().get_Item(i7), c14857yq5, new AbstractC14173n9.k4() { // from class: com.aspose.slides.fu.1
                            @Override // com.aspose.slides.AbstractC14173n9.k4
                            /* JADX INFO: renamed from: k4 */
                            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                                iChartDataPoint.getBubbleSize().setAsCell(iChartDataCell);
                            }
                        });
                        i7++;
                        z = false;
                        c2 = 0;
                    } else {
                        c2 = 0;
                        AbstractC14173n9.m67893k4(chartDataWorkbook, chartSeriesArr[0], c14857yq5, new AbstractC14173n9.k4() { // from class: com.aspose.slides.fu.2
                            @Override // com.aspose.slides.AbstractC14173n9.k4
                            /* JADX INFO: renamed from: k4 */
                            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                                iChartDataPoint.getYValue().setAsCell(iChartDataCell);
                                if (iChartDataPoint.getXValue().getAsCell() != null) {
                                    iChartDataPoint.getXValue().setAsCell(null);
                                }
                                if (chartSeriesArr[0].getDataPoints().getDataSourceTypeForBubbleSizes() == 2) {
                                    iChartDataPoint.getBubbleSize().setAsLiteralDouble(1.0d);
                                }
                            }
                        });
                        if (c14857yq3 != null) {
                            AbstractC14173n9.m67893k4(chartDataWorkbook, chartSeriesArr[0], c14857yq3, new AbstractC14173n9.k4() { // from class: com.aspose.slides.fu.3
                                @Override // com.aspose.slides.AbstractC14173n9.k4
                                /* JADX INFO: renamed from: k4 */
                                public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                                    iChartDataPoint.getXValue().setAsCell(iChartDataCell);
                                }
                            });
                        }
                        z = true;
                    }
                } else {
                    c2 = c3;
                    c14857yq = c14857yq2;
                    c = c4;
                    i = iM74066x1;
                }
                iM74066x1 = i + 1;
                c4 = c;
                c3 = c2;
                c14857yq2 = c14857yq;
            }
            i6++;
            list2 = list;
            c3 = c3;
        }
    }
}
