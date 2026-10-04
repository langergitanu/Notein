package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class PieSplitCustomPointCollection implements IPieSplitCustomPointCollection {

    /* JADX INFO: renamed from: k4 */
    private final IChartSeriesGroup f3035k4;

    /* JADX INFO: renamed from: x1 */
    private final List<IChartDataPoint> f3036x1 = new List<>();

    public PieSplitCustomPointCollection(IChartSeriesGroup iChartSeriesGroup) {
        this.f3035k4 = iChartSeriesGroup;
    }

    @Override // com.aspose.slides.IPieSplitCustomPointCollection
    public final void add(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        IChartDataPointCollection dataPoints = this.f3035k4.get_Item(0).getDataPoints();
        if (i >= dataPoints.size()) {
            throw new ArgumentException(C14113y2.m67402k4("Point with index '{0}' was not found", Integer.valueOf(i)), "dataPointIndex");
        }
        IChartDataPoint iChartDataPoint = dataPoints.get_Item(i);
        if (this.f3036x1.containsItem(iChartDataPoint)) {
            throw new ArgumentException("Data point is already added");
        }
        this.f3036x1.addItem(iChartDataPoint);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(IChartDataPoint iChartDataPoint) {
        m2265k4(iChartDataPoint);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f3036x1.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(IChartDataPoint iChartDataPoint) {
        return m2267kk(iChartDataPoint);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(IChartDataPoint[] iChartDataPointArr, int i) {
        m2266k4(iChartDataPointArr, i);
    }

    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IPieSplitCustomPointCollection
    public final IChartDataPoint get_Item(int i) {
        return this.f3036x1.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return this.f3036x1.isReadOnly();
    }

    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartDataPoint> iterator() {
        return this.f3036x1.iterator();
    }

    public final IGenericEnumerator<IChartDataPoint> iteratorJava() {
        return this.f3036x1.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2265k4(IChartDataPoint iChartDataPoint) {
        boolean zM27456k4;
        IGenericEnumerator<IChartDataPoint> it = this.f3035k4.get_Item(0).getDataPoints().iterator();
        while (it.hasNext()) {
            try {
                if (it.next() == iChartDataPoint) {
                    this.f3036x1.addItem(iChartDataPoint);
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        throw new ArgumentException("Coudn't find dataPoint in parent series. Allowed adding dataPoint only from same chart and parent series");
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m2267kk(IChartDataPoint iChartDataPoint) {
        return this.f3036x1.containsItem(iChartDataPoint);
    }

    @Override // com.aspose.slides.IPieSplitCustomPointCollection
    public final void remove(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        IChartDataPointCollection dataPoints = this.f3035k4.get_Item(0).getDataPoints();
        if (i >= dataPoints.size()) {
            throw new ArgumentException(C14113y2.m67402k4("Point with index '{0}' was not found", Integer.valueOf(i)), "dataPointIndex");
        }
        this.f3036x1.removeItem(dataPoints.get_Item(i));
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(IChartDataPoint iChartDataPoint) {
        return m2268x1(iChartDataPoint);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f3036x1.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m2268x1(IChartDataPoint iChartDataPoint) {
        return this.f3036x1.removeItem(iChartDataPoint);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2266k4(IChartDataPoint[] iChartDataPointArr, int i) {
        this.f3036x1.copyToTArray(iChartDataPointArr, i);
    }
}
