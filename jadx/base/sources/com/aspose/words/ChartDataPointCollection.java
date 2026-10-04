package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataPointCollection implements Iterable<ChartDataPoint> {
    private com.aspose.words.internal.zzD3<ChartDataPoint> zzZyn = new com.aspose.words.internal.zzD3<>();
    private ChartSeries zzZyw;

    public static final class zzZ implements Iterator<ChartDataPoint> {
        private int zzXn = -1;
        private ArrayList<Integer> zzZyk;
        private int zzZyl;
        private ChartDataPointCollection zzZym;

        public zzZ(ChartDataPointCollection chartDataPointCollection) {
            zzW0 zzw0 = new zzW0(chartDataPointCollection.zzZyw);
            this.zzZym = chartDataPointCollection;
            this.zzZyl = zzw0.zz1Q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz39, reason: merged with bridge method [inline-methods] */
        public ChartDataPoint next() {
            return this.zzZym.get(this.zzXn);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzZym.zzZyw == null) {
                return false;
            }
            int i = this.zzXn;
            int i2 = this.zzZyl;
            if (i < i2 - 1) {
                this.zzXn = i + 1;
                return true;
            }
            if (this.zzZyk == null) {
                this.zzZyk = this.zzZym.zzO0(i2);
            }
            Iterator<Integer> it = this.zzZyk.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (this.zzXn < iIntValue) {
                    this.zzXn = iIntValue;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ChartDataPointCollection(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
    }

    private ChartDataPoint zzO1(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        ChartDataPoint chartDataPoint = this.zzZyn.get(i);
        if (chartDataPoint != null) {
            return chartDataPoint;
        }
        ChartDataPoint chartDataPoint2 = new ChartDataPoint(this.zzZyw.zz3I());
        chartDataPoint2.setIndex(i);
        zzW(chartDataPoint2);
        return chartDataPoint2;
    }

    public static boolean zzO2(int i) {
        return i == 10 || i == 11 || i == 15;
    }

    public void clearFormat() {
        Iterator<ChartDataPoint> it = this.zzZyn.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().clearFormat();
        }
    }

    public void copyFormat(int i, int i2) {
        com.aspose.words.internal.zzZ4.zzY(i, "sourceIndex");
        com.aspose.words.internal.zzZ4.zzY(i2, "destinationIndex");
        if (i == i2) {
            return;
        }
        get(i2).zzZ(get(i));
    }

    public ChartDataPoint get(int i) {
        return zzO1(i);
    }

    public int getCount() {
        int iZz1Q = new zzW0(this.zzZyw).zz1Q();
        return zzO0(iZz1Q).size() + iZz1Q;
    }

    public boolean hasDefaultFormat(int i) {
        ChartDataPoint chartDataPoint = this.zzZyn.get(i);
        return chartDataPoint == null || !chartDataPoint.zz3n();
    }

    @Override // java.lang.Iterable
    public Iterator<ChartDataPoint> iterator() {
        return new zzZ(this);
    }

    public final void remove(int i) {
        if (this.zzZyn.getCount() == 0) {
            return;
        }
        com.aspose.words.internal.zzD3<ChartDataPoint> zzd3 = new com.aspose.words.internal.zzD3<>(this.zzZyn.getCount());
        for (ChartDataPoint chartDataPoint : this.zzZyn.zzCJ()) {
            if (chartDataPoint.getIndex() != i) {
                if (chartDataPoint.getIndex() > i) {
                    chartDataPoint.setIndex(chartDataPoint.getIndex() - 1);
                }
                zzd3.add(chartDataPoint.getIndex(), chartDataPoint);
            }
        }
        this.zzZyn = zzd3;
    }

    public final Iterable<ChartDataPoint> zz3a() {
        return this.zzZyn.zzCJ();
    }

    public final boolean zz3b() {
        Iterator<ChartDataPoint> it = this.zzZyn.zzCJ().iterator();
        while (it.hasNext()) {
            if (it.next().zz3n()) {
                return true;
            }
        }
        return false;
    }

    public final ChartDataPointCollection zz3c() {
        ChartDataPointCollection chartDataPointCollection = new ChartDataPointCollection(this.zzZyw);
        for (ChartDataPoint chartDataPoint : this.zzZyn.zzCJ()) {
            if (chartDataPoint.zz3n()) {
                chartDataPointCollection.zzW(chartDataPoint.zz3g());
            }
        }
        return chartDataPointCollection;
    }

    public final ArrayList<Integer> zzO0(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (ChartDataPoint chartDataPoint : this.zzZyn.zzCJ()) {
            int index = chartDataPoint.getIndex();
            if (index >= i && chartDataPoint.zz3n()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, Integer.valueOf(index));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void zzO6(int i) {
        if (this.zzZyn.getCount() == 0) {
            return;
        }
        com.aspose.words.internal.zzD3<ChartDataPoint> zzd3 = new com.aspose.words.internal.zzD3<>(this.zzZyn.getCount());
        for (ChartDataPoint chartDataPoint : this.zzZyn.zzCJ()) {
            if (chartDataPoint.getIndex() >= i) {
                chartDataPoint.setIndex(chartDataPoint.getIndex() + 1);
            }
            zzd3.add(chartDataPoint.getIndex(), chartDataPoint);
        }
        this.zzZyn = zzd3;
    }

    public final void zzW(ChartDataPoint chartDataPoint) {
        this.zzZyn.set(chartDataPoint.getIndex(), chartDataPoint);
        chartDataPoint.zzX(this.zzZyw.zz2H());
    }

    public final boolean zzYG() {
        return this.zzZyn.getCount() > 0;
    }

    public final void zzZ(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
        Iterator<ChartDataPoint> it = this.zzZyn.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().zzZ(chartSeries.zz3I());
        }
    }
}
