package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartYValueCollection implements Iterable<ChartYValue> {
    private ArrayList<ChartYValue> zzUY = new ArrayList<>();
    private zzZ9D zzZB5;

    public static final class zzZ implements Iterator<ChartYValue> {
        private int zzXn = -1;
        private ChartYValueCollection zzZxb;

        public zzZ(ChartYValueCollection chartYValueCollection) {
            this.zzZxb = chartYValueCollection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz1F, reason: merged with bridge method [inline-methods] */
        public ChartYValue next() {
            return this.zzZxb.get(this.zzXn);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.zzXn + 1;
            this.zzXn = i;
            return i < this.zzZxb.getCount();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ChartYValueCollection(zzZ9D zzz9d) {
        this.zzZB5 = zzz9d;
    }

    private int getValueType() {
        ChartYValue chartYValueZz1G = zz1G();
        return chartYValueZz1G != null ? chartYValueZz1G.getValueType() : this.zzZB5.zz28();
    }

    private ChartYValue zz1G() {
        for (ChartYValue chartYValue : this.zzUY) {
            if (chartYValue != null) {
                return chartYValue;
            }
        }
        return null;
    }

    private ChartYValue zzNv(int i) {
        getCount();
        while (this.zzUY.size() <= i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, (Object) null);
        }
        if (this.zzUY.get(i) == null) {
            this.zzUY.set(i, this.zzZB5.zzYn(i, getValueType()));
        } else {
            this.zzUY.get(i);
            this.zzZB5.zzYn(i, getValueType());
        }
        return this.zzUY.get(i);
    }

    public final void clear() {
        this.zzUY.clear();
    }

    public ChartYValue get(int i) {
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return zzNv(i);
    }

    public int getCount() {
        if (this.zzZB5.zz23()) {
            return this.zzZB5.getValueCount();
        }
        return 0;
    }

    @Override // java.lang.Iterable
    public Iterator<ChartYValue> iterator() {
        return new zzZ(this);
    }

    public final void remove(int i) {
        if (this.zzUY.size() > i) {
            this.zzUY.remove(i);
        }
    }

    public void set(int i, ChartYValue chartYValue) {
        if (!this.zzZB5.zz23()) {
            throw new IllegalStateException("This chart series does not support Y values.");
        }
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        zzY(i, chartYValue);
        this.zzZB5.zzY(chartYValue, i);
    }

    public final void zzY(int i, ChartYValue chartYValue) {
        zzZ(chartYValue);
        while (this.zzUY.size() <= i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, (Object) null);
        }
        this.zzUY.set(i, chartYValue);
    }

    public final void zzZ(int i, ChartYValue chartYValue) {
        zzZ(chartYValue);
        while (this.zzUY.size() < i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, (Object) null);
        }
        this.zzUY.add(i, chartYValue);
    }

    private void zzZ(ChartYValue chartYValue) {
        if (chartYValue == null) {
            return;
        }
        ChartYValue chartYValueZz1G = zz1G();
        if (chartYValueZz1G == null) {
            this.zzZB5.zzNz(chartYValue.getValueType());
        } else if (chartYValueZz1G.getValueType() != chartYValue.getValueType()) {
            throw new IllegalStateException("The value must be of the same type as the existing items in the collection.");
        }
    }
}
