package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartLegendEntryCollection implements Iterable<ChartLegendEntry> {
    private com.aspose.words.internal.zzD3<ChartLegendEntry> zzZy3 = new com.aspose.words.internal.zzD3<>();
    private zzEY zzZy4;

    public static class zzX {
        private int zzZy0 = -1;
        private int zzZxZ = -1;

        public final int zz2Q() {
            return this.zzZxZ;
        }

        public final int zz2R() {
            return this.zzZy0;
        }

        public final void zzNO(int i) {
            this.zzZxZ = i;
        }

        public final void zzNP(int i) {
            this.zzZy0 = i;
        }
    }

    public static final class zzY implements Iterator<ChartLegendEntry> {
        private int zzXn = -1;
        private int zzZF;
        private ChartLegendEntryCollection zzZy1;

        public zzY(ChartLegendEntryCollection chartLegendEntryCollection) {
            this.zzZy1 = chartLegendEntryCollection;
            this.zzZF = chartLegendEntryCollection.getCount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz2S, reason: merged with bridge method [inline-methods] */
        public ChartLegendEntry next() {
            return this.zzZy1.get(this.zzXn);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.zzXn + 1;
            this.zzXn = i;
            return i < this.zzZF;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class zzZ implements Comparator<ChartLegendEntry> {
        private boolean zzZy2;

        public zzZ(boolean z) {
            this.zzZy2 = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public int compare(ChartLegendEntry chartLegendEntry, ChartLegendEntry chartLegendEntry2) {
            int i = this.zzZy2 ? -1 : 1;
            if (chartLegendEntry != null) {
                return chartLegendEntry2 == null ? i : com.aspose.words.internal.zzZKR.zzZ7(chartLegendEntry.getIndex(), chartLegendEntry2.getIndex()) * i;
            }
            if (chartLegendEntry2 == null) {
                return 0;
            }
            return -i;
        }
    }

    public ChartLegendEntryCollection(zzEY zzey) {
        this.zzZy4 = zzey;
    }

    private zzX zzQ(ChartSeries chartSeries) {
        zzX zzx = new zzX();
        Iterator<zzGK> it = this.zzZy4.zz45().zzZJf().iterator();
        int i = 0;
        int size = 0;
        while (it.hasNext()) {
            for (ChartSeries chartSeries2 : it.next().zzZPj()) {
                if (chartSeries2 == chartSeries) {
                    zzx.zzNP(i);
                    zzx.zzNO(size);
                }
                i++;
                size += chartSeries2.zz2t().size();
            }
        }
        zzx.zzNO(chartSeries.zz2t().size() > 0 ? zzx.zz2Q() + i : -1);
        return zzx;
    }

    public final void clear() {
        this.zzZy3.clear();
    }

    public ChartLegendEntry get(int i) {
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        if (!this.zzZy3.zzVE(i)) {
            ChartLegendEntry chartLegendEntry = new ChartLegendEntry();
            chartLegendEntry.setIndex(i);
            zzZ(chartLegendEntry);
        }
        return this.zzZy3.get(i);
    }

    public int getCount() {
        zzEY zzey = this.zzZy4;
        if (zzey == null) {
            return this.zzZy3.getCount();
        }
        Iterator<zzGK> it = zzey.zz45().zzZJf().iterator();
        int size = 0;
        while (it.hasNext()) {
            Iterator<ChartSeries> it2 = it.next().zzZPj().iterator();
            while (it2.hasNext()) {
                size += it2.next().zz2t().size() + 1;
            }
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<ChartLegendEntry> iterator() {
        return new zzY(this);
    }

    public final Iterable<ChartLegendEntry> zz2T() {
        return this.zzZy3.zzCJ();
    }

    public final ChartLegendEntry zzNS(int i) {
        return this.zzZy3.get(i);
    }

    public final ChartLegendEntry zzR(ChartSeries chartSeries) {
        return get(zzQ(chartSeries).zz2R());
    }

    public final void zzS(ChartSeries chartSeries) {
        zzX zzxZzQ = zzQ(chartSeries);
        int size = chartSeries.zz2t().size();
        ArrayList<ChartLegendEntry> arrayListZzT = com.aspose.words.internal.zzZQG.zzT(this.zzZy3.zzCJ());
        Collections.sort(arrayListZzT, new zzZ(false));
        for (ChartLegendEntry chartLegendEntry : arrayListZzT) {
            int index = chartLegendEntry.getIndex();
            if (index >= zzxZzQ.zz2R()) {
                this.zzZy3.zzVG(index);
                if (index != zzxZzQ.zz2R() && (zzxZzQ.zz2Q() < 0 || index < zzxZzQ.zz2Q() || index >= zzxZzQ.zz2Q() + size)) {
                    int i = index - 1;
                    if (zzxZzQ.zz2Q() >= 0 && index > zzxZzQ.zz2Q()) {
                        i -= size;
                    }
                    chartLegendEntry.setIndex(i);
                    this.zzZy3.add(i, chartLegendEntry);
                }
            }
        }
    }

    public final void zzT(ChartSeries chartSeries) {
        ChartLegendEntry chartLegendEntry;
        int index;
        zzX zzxZzQ = zzQ(chartSeries);
        int iZz2R = zzxZzQ.zz2R();
        int iZz2Q = zzxZzQ.zz2Q() >= 0 ? zzxZzQ.zz2Q() - 1 : -1;
        int size = chartSeries.zz2t().size();
        ArrayList arrayListZzT = com.aspose.words.internal.zzZQG.zzT(this.zzZy3.zzCJ());
        Collections.sort(arrayListZzT, new zzZ(true));
        Iterator it = arrayListZzT.iterator();
        while (it.hasNext() && (index = (chartLegendEntry = (ChartLegendEntry) it.next()).getIndex()) >= iZz2R) {
            int i = index + 1;
            if (iZz2Q >= 0 && index >= iZz2Q) {
                i += size;
            }
            this.zzZy3.zzVG(index);
            chartLegendEntry.setIndex(i);
            this.zzZy3.add(i, chartLegendEntry);
        }
    }

    public final ChartLegendEntryCollection zzX(zzEY zzey) {
        ChartLegendEntryCollection chartLegendEntryCollection = new ChartLegendEntryCollection(zzey);
        if (this.zzZy3.getCount() != 0) {
            for (ChartLegendEntry chartLegendEntry : this.zzZy3.zzCJ()) {
                chartLegendEntryCollection.zzZy3.add(chartLegendEntry.getIndex(), chartLegendEntry.zz2U());
            }
        }
        return chartLegendEntryCollection;
    }

    public final void zzZ(ChartLegendEntry chartLegendEntry) {
        this.zzZy3.set(chartLegendEntry.getIndex(), chartLegendEntry);
        chartLegendEntry.zzY(this.zzZy4);
    }
}
