package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
public class TrendlineCollection extends DomObject<ChartSeries> implements ITrendlineCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<ITrendline> f3624k4;

    public TrendlineCollection(ChartSeries chartSeries) {
        super(chartSeries);
        this.f3624k4 = new List<>();
    }

    @Override // com.aspose.slides.ITrendlineCollection
    public final ITrendline add(int i) {
        Trendline trendline = new Trendline(this);
        trendline.setTrendlineType(i);
        this.f3624k4.addItem(trendline);
        return trendline;
    }

    @Override // com.aspose.slides.ITrendlineCollection
    public final int getCount() {
        return this.f3624k4.size();
    }

    @Override // com.aspose.slides.ITrendlineCollection
    public final ITrendline get_Item(int i) {
        return this.f3624k4.get_Item(i);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ITrendline> iterator() {
        return this.f3624k4.iterator();
    }

    public final IGenericEnumerator<ITrendline> iteratorJava() {
        return this.f3624k4.iteratorJava();
    }

    @Override // com.aspose.slides.ITrendlineCollection
    public final void remove(ITrendline iTrendline) {
        this.f3624k4.removeItem(iTrendline);
    }
}
