package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7999jg;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.yu */
/* JADX INFO: loaded from: classes3.dex */
class C14861yu {
    /* JADX INFO: renamed from: k4 */
    public static void m74088k4(IChart iChart, C9192xf c9192xf, C14786xh c14786xh) {
        IGenericEnumerator<IChartSeriesGroup> it = iChart.getChartData().getSeriesGroups().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IChartSeries> it2 = ((ChartSeriesGroup) it.next()).getSeries().iterator();
                while (it2.hasNext()) {
                    try {
                        C13728kh.m63864k4(it2.next(), c9192xf.m44321kk().m31298to().m32993x1().m34687x1(), c9192xf, c14786xh);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74089k4(IChartData iChartData, C9192xf c9192xf, C14144mu c14144mu) {
        IChartSeries iChartSeriesM745k4;
        C7999jg c7999jgM32993x1 = c9192xf.m44321kk().m31298to().m32993x1();
        ChartSeriesGroup chartSeriesGroup = null;
        for (int i = 0; i < c7999jgM32993x1.m34686to().length; i++) {
            C8324nc c8324nc = c7999jgM32993x1.m34686to()[i];
            int iM74713k4 = C14908zp.m74713k4(c9192xf.m44321kk().m31298to(), c8324nc);
            boolean z = iM74713k4 == 77;
            if (chartSeriesGroup == null || iM74713k4 == 77) {
                iChartSeriesM745k4 = ((ChartSeriesCollection) iChartData.getSeries()).m745k4(iM74713k4, z);
                chartSeriesGroup = (ChartSeriesGroup) iChartSeriesM745k4.getParentSeriesGroup();
            } else {
                iChartSeriesM745k4 = ((ChartSeriesCollection) iChartData.getSeries()).m744k4(iM74713k4, chartSeriesGroup, z);
            }
            ((ChartSeries) C7019kk.m27452k4((Object) iChartSeriesM745k4, ChartSeries.class)).m726k4().m64751k4(((long) i) & 4294967295L);
            if (iChartData.getCategories().size() == 0) {
                C14298pq.m69186k4((ChartCategoryCollection) iChartData.getCategories(), c8324nc, c9192xf);
            }
            C13728kh.m63863k4(iChartSeriesM745k4, c8324nc, c9192xf, c14144mu);
        }
    }
}
