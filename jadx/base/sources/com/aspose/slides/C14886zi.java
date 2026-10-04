package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.zi */
/* JADX INFO: loaded from: classes3.dex */
class C14886zi implements IChartSeriesReadonlyCollection {

    /* JADX INFO: renamed from: k4 */
    private List<IChartSeries> f50566k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private ChartSeriesGroup f50567x1;

    public C14886zi(ChartSeriesGroup chartSeriesGroup) {
        this.f50567x1 = chartSeriesGroup;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f50566k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IChartSeriesReadonlyCollection
    public final IChartSeries get_Item(int i) {
        return this.f50566k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartSeries> iterator() {
        return this.f50566k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IChartSeries> iteratorJava() {
        return this.f50566k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m74526k4(IChartSeries iChartSeries) {
        return this.f50566k4.indexOf(iChartSeries);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f50566k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74528x1(ChartSeries chartSeries) {
        chartSeries.m727k4((ChartSeriesGroup) null);
        this.f50566k4.removeItem(chartSeries);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74527k4(ChartSeries chartSeries) {
        chartSeries.m727k4(this.f50567x1);
        this.f50566k4.addItem(chartSeries);
    }
}
