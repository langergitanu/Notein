package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p332p7.AbstractC8619qq;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.jv */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13703jv {
    /* JADX INFO: renamed from: k4 */
    public static ISingleCellChartValue m63555k4(IChartDataPoint iChartDataPoint, int i) {
        switch (i) {
            case 0:
                return iChartDataPoint.getXValue();
            case 1:
                return iChartDataPoint.getYValue();
            case 2:
                return iChartDataPoint.getBubbleSize();
            case 3:
                return iChartDataPoint.getValue();
            case 4:
                return ((ChartDataPoint) iChartDataPoint).getErrorBarsCustomValues().getXPlus();
            case 5:
                return ((ChartDataPoint) iChartDataPoint).getErrorBarsCustomValues().getXMinus();
            case 6:
                return ((ChartDataPoint) iChartDataPoint).getErrorBarsCustomValues().getYPlus();
            case 7:
                return ((ChartDataPoint) iChartDataPoint).getErrorBarsCustomValues().getYMinus();
            case 8:
                return iChartDataPoint.getSizeValue();
            case 9:
                return iChartDataPoint.getColorValue();
            default:
                throw new ArgumentOutOfRangeException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo6078k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo6079k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i, gnb gnbVar, boolean z);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo6080k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl);

    /* JADX INFO: renamed from: x1 */
    public final void m63557x1(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i) {
        int iMo34167k4 = abstractC8619qq.mo34167k4();
        C13751kx c13751kxM628kk = ((ChartDataPointCollection) iChartSeries.getDataPoints()).m628kk();
        switch (i) {
            case 0:
                iChartSeries.getDataPoints().setDataSourceTypeForXValues(iMo34167k4);
                c13751kxM628kk.m64227k4(abstractC8619qq.mo34169kk());
                return;
            case 1:
                iChartSeries.getDataPoints().setDataSourceTypeForYValues(iMo34167k4);
                c13751kxM628kk.m64231x1(abstractC8619qq.mo34169kk());
                return;
            case 2:
                iChartSeries.getDataPoints().setDataSourceTypeForBubbleSizes(iMo34167k4);
                c13751kxM628kk.m64228kk(abstractC8619qq.mo34169kk());
                return;
            case 3:
                iChartSeries.getDataPoints().setDataSourceTypeForValues(iMo34167k4);
                c13751kxM628kk.m64230to(abstractC8619qq.mo34169kk());
                return;
            case 4:
                ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues(iMo34167k4);
                c13751kxM628kk.m64226h4(abstractC8619qq.mo34169kk());
                return;
            case 5:
                ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues(iMo34167k4);
                c13751kxM628kk.m64225du(abstractC8619qq.mo34169kk());
                return;
            case 6:
                ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues(iMo34167k4);
                c13751kxM628kk.m64226h4(abstractC8619qq.mo34169kk());
                return;
            case 7:
                ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues(iMo34167k4);
                c13751kxM628kk.m64229m9(abstractC8619qq.mo34169kk());
                return;
            default:
                throw new ArgumentOutOfRangeException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo6081k4(IChartSeries iChartSeries, int i) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63556k4(String str, double[] dArr) {
        if (C14044b3.m66435k4(str, FrameMetricsAggregator.EVERY_DURATION, C11683c5.m55033ck(), dArr)) {
            return true;
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        if ("Infinity".equals(strM67440x1) || "INF".equals(str)) {
            dArr[0] = Double.POSITIVE_INFINITY;
            return true;
        }
        if ("-Infinity".equals(strM67440x1) || "-INF".equals(strM67440x1)) {
            dArr[0] = Double.NEGATIVE_INFINITY;
            return true;
        }
        if (CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strM67440x1)) {
            dArr[0] = -0.0d;
            return true;
        }
        if ("#N/A".equals(strM67440x1)) {
            dArr[0] = 0.0d;
            return true;
        }
        dArr[0] = 0.0d;
        return false;
    }
}
