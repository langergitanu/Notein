package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz2Y implements Iterable<zz30> {
    private boolean zzYZA;
    private ArrayList<zz4A> zzZ9n;

    public static final class zzZ implements Iterator<zz30> {
        private boolean zzYZA;
        private zz30 zzYZw;
        private boolean zzYZx;
        private ArrayList<zz4A> zzZ9n;
        private int zzYZz = -1;
        private int zzYZy = -1;

        public zzZ(ArrayList<zz4A> arrayList, boolean z) {
            this.zzZ9n = arrayList;
            this.zzYZA = z;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int size;
            int i;
            this.zzYZw = null;
            ArrayList<zz4A> arrayList = this.zzZ9n;
            boolean z = false;
            if (arrayList == null || (i = this.zzYZz) >= (size = arrayList.size()) || size == 0) {
                return false;
            }
            if (i < 0) {
                this.zzYZz = 0;
                this.zzYZy = -1;
            }
            zz4A zz4a = this.zzZ9n.get(this.zzYZz);
            int size2 = zz4a.zzMf().size();
            boolean z2 = this.zzYZx;
            if (!z2) {
                this.zzYZy++;
            }
            if (this.zzYZy >= (this.zzYZA ? 2 : 1) + size2) {
                int i2 = this.zzYZz + 1;
                this.zzYZz = i2;
                this.zzYZy = 0;
                if (i2 >= size) {
                    return false;
                }
            }
            int i3 = this.zzYZy;
            if (i3 == size2) {
                this.zzYZw = zz4a.zzZxp().zzZHc();
            } else if (i3 == size2 + 1) {
                this.zzYZw = zz4a.zzZxo();
            } else {
                if (z2) {
                    this.zzYZw = ((zz0P) zz4a.zzMf().get(this.zzYZy)).zzZsY().zzZHc();
                } else {
                    zz47 zz47Var = zz4a.zzMf().get(this.zzYZy);
                    this.zzYZw = zz47Var.zzZx5();
                    zz0P zz0p = (zz0P) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0P.class);
                    if (zz0p != null && zz0p.zzZsY() != null && !zz0p.zzZsY().isEmpty() && zz0p.zzZsY().zzZx9()) {
                        z = true;
                    }
                }
                this.zzYZx = z;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ zz30 next() {
            return this.zzYZw;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zz2Y(ArrayList<zz4A> arrayList, boolean z) {
        this.zzZ9n = arrayList;
        this.zzYZA = z;
    }

    @Override // java.lang.Iterable
    public final Iterator<zz30> iterator() {
        return new zzZ(this.zzZ9n, this.zzYZA);
    }
}
