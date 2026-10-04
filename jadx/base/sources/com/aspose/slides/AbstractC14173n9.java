package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14046bv;

/* JADX INFO: renamed from: com.aspose.slides.n9 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14173n9 {

    /* JADX INFO: renamed from: com.aspose.slides.n9$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m67895k4(List<C14857yq> list, ChartDataWorkbook chartDataWorkbook) {
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int size = list.size() - 1; size >= 0; size--) {
            for (int iM74063kk = list.get_Item(size).m74063kk(); iM74063kk >= list.get_Item(size).m74066x1(); iM74063kk--) {
                int iM74060du = list.get_Item(size).m74060du();
                while (true) {
                    if (iM74060du > list.get_Item(size).m74061h4()) {
                        break;
                    }
                    if (m67894k4(chartDataWorkbook.getCell(list.get_Item(size).m74062k4(), iM74060du, iM74063kk))) {
                        if (!z) {
                            z = true;
                        }
                        if (iM74060du < i) {
                            i = iM74060du;
                        }
                    } else {
                        iM74060du++;
                    }
                }
            }
        }
        if (z) {
            return i;
        }
        throw new InvalidOperationException("Numeric data not found");
    }

    /* JADX INFO: renamed from: x1 */
    public final int m67897x1(List<C14857yq> list, ChartDataWorkbook chartDataWorkbook) {
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C14857yq c14857yq = list.get_Item(i2);
            if (c14857yq.m74066x1() < i) {
                for (int iM74060du = c14857yq.m74060du(); iM74060du <= c14857yq.m74061h4(); iM74060du++) {
                    int iM74066x1 = c14857yq.m74066x1();
                    while (true) {
                        if (iM74066x1 > c14857yq.m74063kk() || iM74066x1 >= i) {
                            break;
                        }
                        if (m67894k4(chartDataWorkbook.getCell(list.get_Item(i2).m74062k4(), iM74060du, iM74066x1))) {
                            i = iM74066x1;
                            break;
                        }
                        iM74066x1++;
                    }
                }
            }
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        throw new InvalidOperationException("Numeric data not found");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67892k4(int i, IChartSeries iChartSeries) {
        while (iChartSeries.getDataPoints().size() > i) {
            iChartSeries.getDataPoints().removeAt(iChartSeries.getDataPoints().size() - 1);
        }
        while (iChartSeries.getDataPoints().size() < i) {
            ((ChartDataPointCollection) iChartSeries.getDataPoints()).m618k4();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo67898x1(List<C14857yq> list, IChartData iChartData) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67896k4(int i, IChartSeriesCollection iChartSeriesCollection) {
        while (iChartSeriesCollection.size() > i) {
            iChartSeriesCollection.removeAt(iChartSeriesCollection.size() - 1);
        }
        while (iChartSeriesCollection.size() < i) {
            iChartSeriesCollection.add(iChartSeriesCollection.size() == 0 ? ((ChartSeriesCollection) iChartSeriesCollection).m743k4().getType() : iChartSeriesCollection.get_Item(iChartSeriesCollection.size() - 1).getType());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo6299k4(List<C14857yq> list, IChartData iChartData) {
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67893k4(ChartDataWorkbook chartDataWorkbook, IChartSeries iChartSeries, C14857yq c14857yq, k4 k4Var) {
        if (c14857yq.m74064m9() > 0) {
            m67892k4(c14857yq.m74064m9(), iChartSeries);
            ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) iChartSeries.getDataPoints();
            int i = 0;
            for (int iM74060du = c14857yq.m74060du(); iM74060du <= c14857yq.m74061h4(); iM74060du++) {
                k4Var.mo6300k4(chartDataWorkbook.getCell(c14857yq.m74062k4(), iM74060du, c14857yq.m74066x1()), chartDataPointCollection.get_Item(i));
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67894k4(IChartDataCell iChartDataCell) {
        Object value;
        if (iChartDataCell == null || (value = iChartDataCell.getValue()) == null) {
            return false;
        }
        return C7019kk.m27469x1(value, Byte.class) || C7019kk.m27469x1(value, Integer.class) || C7019kk.m27469x1(value, Short.class) || C7019kk.m27469x1(value, Long.class) || C7019kk.m27469x1(value, C14046bv.class) || C7019kk.m27469x1(value, Double.class) || C7019kk.m27469x1(value, Float.class);
    }
}
