package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class BubbleSizeCollection implements Iterable<Double> {
    private ArrayList<Double> zzUY = new ArrayList<>();
    private zzZ9D zzZB5;

    public static final class zzZ implements Iterator<Double> {
        private int zzXn = -1;
        private BubbleSizeCollection zzZB4;

        public zzZ(BubbleSizeCollection bubbleSizeCollection) {
            this.zzZB4 = bubbleSizeCollection;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.zzXn + 1;
            this.zzXn = i;
            return i < this.zzZB4.getCount();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        public Double next() {
            return Double.valueOf(this.zzZB4.get(this.zzXn));
        }
    }

    public BubbleSizeCollection(zzZ9D zzz9d) {
        this.zzZB5 = zzz9d;
    }

    private double zzOK(int i) {
        getCount();
        while (this.zzUY.size() <= i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, Double.valueOf(Double.NaN));
        }
        if (Double.isNaN(this.zzUY.get(i).doubleValue())) {
            this.zzUY.set(i, Double.valueOf(this.zzZB5.zzNB(i)));
        } else {
            com.aspose.words.internal.zzAN.zzL(this.zzUY.get(i).doubleValue(), this.zzZB5.zzNB(i));
        }
        return this.zzUY.get(i).doubleValue();
    }

    public final void clear() {
        this.zzUY.clear();
    }

    public double get(int i) {
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return zzOK(i);
    }

    public int getCount() {
        if (this.zzZB5.zz22()) {
            return this.zzZB5.getValueCount();
        }
        return 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Double> iterator() {
        return new zzZ(this);
    }

    public final void remove(int i) {
        if (this.zzUY.size() > i) {
            this.zzUY.remove(i);
        }
    }

    public void set(int i, double d) {
        if (!this.zzZB5.zz22()) {
            throw new IllegalStateException("This chart does not support bubble size.");
        }
        if (i < 0 || i >= getCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        while (this.zzUY.size() <= i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, Double.valueOf(Double.NaN));
        }
        this.zzUY.set(i, Double.valueOf(d));
        this.zzZB5.zzP(d, i);
    }

    public final void zzY(int i, double d) {
        while (this.zzUY.size() < i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzUY, Double.valueOf(Double.NaN));
        }
        this.zzUY.add(i, Double.valueOf(d));
    }
}
