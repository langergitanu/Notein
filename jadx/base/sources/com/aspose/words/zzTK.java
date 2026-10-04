package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzTK implements Iterable<zzTL> {
    private ArrayList<zzTL> zzZm = new ArrayList<>();

    public static final class zzZ implements Iterator<zzTL> {
        private int zzTL = -1;
        private zzTK zzZsA;
        private zzZ zzZsz;

        public zzZ(zzTK zztk) {
            this.zzZsA = zztk;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzZY6, reason: merged with bridge method [inline-methods] */
        public zzTL next() {
            zzZ zzz = this;
            while (zzz.zzZY7()) {
                zzz = zzz.zzZsz;
            }
            return zzz.zzZsA.zzMI(zzz.zzTL);
        }

        private boolean zzZY7() {
            return this.zzZsz != null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (zzZY7()) {
                if (this.zzZsz.hasNext()) {
                    return true;
                }
                this.zzZsz = null;
            }
            while (true) {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i == this.zzZsA.getCount()) {
                    return false;
                }
                if (next().zzbY() != 6) {
                    this.zzZsz = null;
                    return true;
                }
                zzZ zzz = (zzZ) ((zzS) next()).zzbZ().iterator();
                this.zzZsz = zzz;
                if (zzz.hasNext()) {
                    return true;
                }
                this.zzZsz = null;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzTL> iterator() {
        return new zzZ(this);
    }

    public final zzTL zzMI(int i) {
        if (i >= 0) {
            this.zzZm.size();
        }
        return this.zzZm.get(i);
    }

    public final void zzY(zzTL zztl) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zztl);
    }
}
