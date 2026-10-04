package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzJQ<T> implements Iterable<T> {
    private ArrayList<T> zzZix;
    private boolean zzZiy;

    public final class zzZ implements Iterator<T> {
        private int zzTL = -1;
        private boolean zzYS;
        private ArrayList<T> zzZix;

        public zzZ(ArrayList<T> arrayList, boolean z) {
            this.zzZix = arrayList;
            this.zzYS = z;
        }

        private int getEndIndex() {
            if (this.zzYS) {
                return 0;
            }
            return this.zzZix.size() - 1;
        }

        private int getStartIndex() {
            if (this.zzYS) {
                return this.zzZix.size() - 1;
            }
            return 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzZix.size() == 0) {
                return false;
            }
            int i = this.zzTL;
            if (i == -1) {
                this.zzTL = getStartIndex();
                return true;
            }
            if (i == getEndIndex()) {
                return false;
            }
            if (this.zzYS) {
                this.zzTL--;
            } else {
                this.zzTL++;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.zzTL;
            if (i != -1) {
                return this.zzZix.get(i);
            }
            throw new IllegalStateException("An enumeration should be started before accessing current value.");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zzJQ(T t) {
        this(false);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZix, t);
    }

    public final void add(T t) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZix, t);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new zzZ(this.zzZix, this.zzZiy);
    }

    public final boolean zzZSu() {
        return this.zzZiy;
    }

    public zzJQ(boolean z) {
        this.zzZix = new ArrayList<>();
        this.zzZiy = z;
    }

    private zzJQ(Iterable<T> iterable, boolean z) {
        this(z);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzZix, (Iterable) iterable);
    }

    public zzJQ(ArrayList<T> arrayList, int i, int i2, boolean z) {
        this(com.aspose.words.internal.zzZQG.zzW(arrayList, i, i2), z);
    }
}
