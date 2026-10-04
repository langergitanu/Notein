package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartXValueCollection implements Iterable<ChartXValue> {
    private ArrayList<ChartXValue> zzUY = new ArrayList<>();
    private zzZ9D zzZB5;

    public static final class zzZ implements Iterator<ChartXValue> {
        private int zzXn = -1;
        private ChartXValueCollection zzZxc;

        public zzZ(ChartXValueCollection chartXValueCollection) {
            this.zzZxc = chartXValueCollection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz1H, reason: merged with bridge method [inline-methods] */
        public ChartXValue next() {
            return this.zzZxc.get(this.zzXn);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.zzXn + 1;
            this.zzXn = i;
            return i < this.zzZxc.getCount();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ChartXValueCollection(zzZ9D zzz9d) {
        this.zzZB5 = zzz9d;
    }

    private int getValueType() {
        ChartXValue chartXValueZz1I = zz1I();
        return chartXValueZz1I != null ? chartXValueZz1I.getValueType() : this.zzZB5.zz29();
    }

    private ChartXValue zz1I() {
        for (ChartXValue chartXValue : this.zzUY) {
            if (chartXValue != null) {
                return chartXValue;
            }
        }
        return null;
    }

    private ChartXValue zzNw(int i) {
        getCount();
        while (this.zzUY.size() <= i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, (Object) null);
        }
        if (this.zzUY.get(i) == null) {
            this.zzUY.set(i, this.zzZB5.zzYo(i, getValueType()));
        } else {
            this.zzUY.get(i);
            this.zzZB5.zzYo(i, getValueType());
        }
        return this.zzUY.get(i);
    }

    public final void clear() {
        this.zzUY.clear();
    }

    public ChartXValue get(int i) {
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return zzNw(i);
    }

    public int getCount() {
        if (this.zzZB5.zz24()) {
            return this.zzZB5.getValueCount();
        }
        return 0;
    }

    public final void insert(int i, ChartXValue chartXValue) {
        zzZ(chartXValue);
        while (this.zzUY.size() < i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, (Object) null);
        }
        this.zzUY.add(i, chartXValue);
    }

    @Override // java.lang.Iterable
    public Iterator<ChartXValue> iterator() {
        return new zzZ(this);
    }

    public final void remove(int i) {
        if (this.zzUY.size() > i) {
            this.zzUY.remove(i);
        }
    }

    public void set(int i, ChartXValue chartXValue) {
        if (!this.zzZB5.zz24()) {
            throw new IllegalStateException("This chart series does not support X values.");
        }
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        zzZ(i, chartXValue);
        this.zzZB5.zzY(chartXValue, i);
    }

    public final void zzZ(int i, ChartXValue chartXValue) {
        zzZ(chartXValue);
        while (this.zzUY.size() <= i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, (Object) null);
        }
        this.zzUY.set(i, chartXValue);
    }

    private void zzZ(ChartXValue chartXValue) {
        if (chartXValue == null) {
            return;
        }
        ChartXValue chartXValueZz1I = zz1I();
        if (chartXValueZz1I == null) {
            this.zzZB5.zzNA(chartXValue.getValueType());
        } else if (chartXValueZz1I.getValueType() != chartXValue.getValueType()) {
            throw new IllegalStateException("The value must be of the same type as the existing items in the collection.");
        }
    }
}
