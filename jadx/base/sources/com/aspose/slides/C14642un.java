package com.aspose.slides;

import com.aspose.slides.AbstractC14173n9;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.un */
/* JADX INFO: loaded from: classes3.dex */
class C14642un extends AbstractC14173n9 {
    @Override // com.aspose.slides.AbstractC14173n9
    /* JADX INFO: renamed from: k4 */
    public void mo6299k4(List<C14857yq> list, IChartData iChartData) {
        ChartDataWorkbook chartDataWorkbook = (ChartDataWorkbook) iChartData.getChartDataWorkbook();
        int iM67897x1 = m67897x1(list, chartDataWorkbook);
        C14857yq c14857yq = list.get_Item(0);
        int iM67895k4 = m67895k4(list, chartDataWorkbook) - c14857yq.m74060du();
        int iM74063kk = (c14857yq.m74063kk() - iM67897x1) + 1;
        for (int i = 1; i < list.size(); i++) {
            C14857yq c14857yq2 = list.get_Item(i);
            iM74063kk += (c14857yq2.m74066x1() - c14857yq2.m74063kk()) + 1;
        }
        m67896k4(iM74063kk, iChartData.getSeries());
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C14857yq c14857yq3 = list.get_Item(i3);
            for (int iM74066x1 = c14857yq3.m74066x1(); iM74066x1 <= c14857yq3.m74063kk(); iM74066x1++) {
                if (iM74066x1 >= iM67897x1) {
                    final ChartSeries[] chartSeriesArr = {(ChartSeries) iChartData.getSeries().get_Item(i2)};
                    chartSeriesArr[0].m728k4(new StringChartValue((ChartData) iChartData, new C0936ec(), false));
                    if (iM67895k4 > 0) {
                        for (int i4 = 0; i4 < iM67895k4; i4++) {
                            chartSeriesArr[0].getName().getAsCells().add(chartDataWorkbook.getCell(c14857yq3.m74062k4(), c14857yq3.m74060du() + i4, iM74066x1));
                        }
                    }
                    AbstractC14173n9.m67893k4(chartDataWorkbook, chartSeriesArr[0], new C14857yq(c14857yq3.m74062k4(), iM74066x1, iM74066x1, c14857yq3.m74060du() + iM67895k4, c14857yq3.m74061h4()), new AbstractC14173n9.k4() { // from class: com.aspose.slides.un.1
                        @Override // com.aspose.slides.AbstractC14173n9.k4
                        /* JADX INFO: renamed from: k4 */
                        public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                            (ChartTypeCharacterizer.m759fa(chartSeriesArr[0].getType()) ? iChartDataPoint.getSizeValue() : iChartDataPoint.getValue()).setAsCell(iChartDataCell);
                        }
                    });
                    i2++;
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14173n9
    /* JADX INFO: renamed from: x1 */
    public void mo67898x1(List<C14857yq> list, IChartData iChartData) {
        ChartDataWorkbook chartDataWorkbook = (ChartDataWorkbook) iChartData.getChartDataWorkbook();
        C14857yq c14857yq = list.get_Item(0);
        iChartData.getCategories().clear();
        int iM67897x1 = m67897x1(list, chartDataWorkbook) - c14857yq.m74066x1();
        if (iM67897x1 == 0) {
            return;
        }
        int i = iM67897x1 - 1;
        String[] strArr = new String[i];
        for (int iM67895k4 = m67895k4(list, chartDataWorkbook); iM67895k4 <= c14857yq.m74061h4(); iM67895k4++) {
            for (int i2 = i; i2 >= 0; i2--) {
                IChartDataCell cell = chartDataWorkbook.getCell(c14857yq.m74062k4(), iM67895k4, c14857yq.m74066x1() + i2);
                if (i2 == i) {
                    iChartData.getCategories().add(cell);
                } else {
                    int i3 = i - i2;
                    if (cell.getValue() != null && !C14113y2.m67411k4(cell.getValue().toString()) && !C14113y2.m67363du(cell.getValue().toString(), strArr[i2])) {
                        iChartData.getCategories().get_Item(iChartData.getCategories().size() - 1).getGroupingLevels().setGroupingItem(i3, cell.getValue().toString());
                        strArr[i2] = cell.getValue().toString();
                    }
                }
            }
        }
    }
}
