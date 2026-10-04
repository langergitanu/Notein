package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class LegendEntryCollection implements ILegendEntryCollection {

    /* JADX INFO: renamed from: k4 */
    private Chart f2595k4;

    public LegendEntryCollection(Chart chart) {
        this.f2595k4 = chart;
    }

    @Override // com.aspose.slides.ILegendEntryCollection
    public final int getCount() {
        if (gfh.m6622k4(this.f2595k4) || (this.f2595k4.getChartData().getSeries().size() == 1 && (ChartTypeCharacterizer.isChartTypePie(this.f2595k4.getChartData().getSeries().get_Item(0).getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(this.f2595k4.getChartData().getSeries().get_Item(0).getType())))) {
            return this.f2595k4.getChartData().getSeries().get_Item(0).getDataPoints().size();
        }
        int size = this.f2595k4.getChartData().getSeries().size();
        IGenericEnumerator<IChartSeries> it = this.f2595k4.getChartData().getSeries().iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (chartSeries.getTrendLines() != null) {
                    size += chartSeries.getTrendLines().getCount();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return size;
    }

    @Override // com.aspose.slides.ILegendEntryCollection
    public final ILegendEntryProperties get_Item(int i) {
        if ((this.f2595k4.getChartData().getSeries().size() > 0 && ygk.m73875k4(this.f2595k4.getChartData().getSeries())) || (this.f2595k4.getChartData().getSeries().size() == 1 && (ChartTypeCharacterizer.isChartTypePie(this.f2595k4.getChartData().getSeries().get_Item(0).getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(this.f2595k4.getChartData().getSeries().get_Item(0).getType())))) {
            return ((ChartDataPoint) this.f2595k4.getChartData().getSeries().get_Item(0).getDataPoints().get_Item(i)).getRelatedLegendEntry();
        }
        List list = new List();
        List list2 = new List();
        IGenericEnumerator<ITrendline> it = this.f2595k4.getChartData().getSeries().iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (!chartSeries.m739x1()) {
                    list.addItem(chartSeries.getRelatedLegendEntry());
                    if (chartSeries.getTrendLines() != null) {
                        it = chartSeries.getTrendLines().iterator();
                        while (it.hasNext()) {
                            try {
                                list2.addItem(((Trendline) it.next()).getRelatedLegendEntry());
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        list.addRange(list2);
        return (ILegendEntryProperties) list.get_Item(i);
    }
}
