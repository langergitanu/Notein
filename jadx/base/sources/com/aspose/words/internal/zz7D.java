package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7D<TKey> {
    private static int zzV4 = Integer.MIN_VALUE;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzV8;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private zz7D<TKey>.zzY zzn7;
    private ArrayList<TKey> zznc;

    public class zzY implements Iterable<TKey> {
        private zz7D<TKey> zzn6;

        public class zzZ implements Iterator<TKey> {
            private zz7D<TKey>.zzZ zzn4;

            public zzZ(zz7D<TKey> zz7d) {
                this.zzn4 = zz7d.zzxt();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.zzn4.moveNext();
            }

            @Override // java.util.Iterator
            public final TKey next() {
                return this.zzn4.zzxv();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzY(zz7D<TKey> zz7d) {
            this.zzn6 = zz7d;
        }

        @Override // java.lang.Iterable
        public final Iterator<TKey> iterator() {
            return new zzZ(this.zzn6);
        }
    }

    public class zzZ {
        private int zzTL = -1;
        private int zzV7;
        private zz7D<TKey> zzn6;

        public zzZ(zz7D<TKey> zz7d) {
            this.zzn6 = zz7d;
            this.zzV7 = ((zz7D) zz7d).zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != ((zz7D) this.zzn6).zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= ((zz7D) this.zzn6).zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (((zz7D) this.zzn6).zzVb[this.zzTL] < 0);
            return true;
        }

        public final int zzCL() {
            zzCN();
            return ((zz7D) this.zzn6).zzV8[this.zzTL];
        }

        public final TKey zzxv() {
            zzCN();
            return (TKey) ((zz7D) this.zzn6).zznc.get(this.zzTL);
        }
    }

    public zz7D() {
        this((byte) 0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(0);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zznc = new ArrayList<>(iZzV9);
        for (int i2 = 0; i2 < iZzV9; i2++) {
            zzZQG.zzZ(this.zznc, (Object) null);
        }
        this.zzV8 = new int[iZzV9];
        this.zzV6 = -1;
    }

    public static boolean zzWm(int i) {
        return zzb(i, zzV4);
    }

    private void zzWx() {
        int iZzV9 = zzAN.zzV9(this.zzZF * 2);
        int[] iArr = new int[iZzV9];
        zzY(iArr);
        int[] iArr2 = new int[iZzV9];
        zzZKV.zzZ(this.zzVb, 0, iArr2, 0, this.zzZF);
        int[] iArr3 = new int[iZzV9];
        for (int i = this.zzZF; i < iZzV9; i++) {
            zzZQG.zzZ(this.zznc, (Object) null);
        }
        int[] iArr4 = new int[iZzV9];
        zzZKV.zzZ(this.zzV8, 0, iArr4, 0, this.zzZF);
        this.zzV8 = iArr4;
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            int i3 = iArr2[i2] % iZzV9;
            iArr3[i2] = iArr[i3];
            iArr[i3] = i2;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    private static boolean zzb(int i, int i2) {
        return i == i2;
    }

    private static <TKey> void zzn(TKey tkey) {
        if (tkey == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: key");
        }
    }

    private int zzo(TKey tkey) {
        zzn(tkey);
        if (this.zzVc == null) {
            return -1;
        }
        int iHashCode = tkey.hashCode() & Integer.MAX_VALUE;
        int[] iArr = this.zzVc;
        int i = iArr[iHashCode % iArr.length];
        while (i >= 0) {
            if (this.zzVb[i] == iHashCode && this.zznc.get(i).equals(tkey)) {
                return i;
            }
            i = this.zzVa[i];
        }
        return -1;
    }

    public final void clear() {
        if (this.zzZF == 0) {
            return;
        }
        zzY(this.zzVc);
        zzZKV.zzX(this.zzVb, 0, this.zzZF);
        zzZKV.zzX(this.zzVa, 0, this.zzZF);
        int i = 0;
        while (true) {
            int i2 = this.zzZF;
            if (i >= i2) {
                zzZKV.zzX(this.zzV8, 0, i2);
                this.zzV6 = -1;
                this.zzZF = 0;
                this.zzV5 = 0;
                this.zzV7++;
                return;
            }
            this.zznc.set(i, null);
            i++;
        }
    }

    public final boolean containsKey(TKey tkey) {
        return zzo(tkey) >= 0;
    }

    public final int get(TKey tkey) {
        int iZzo = zzo(tkey);
        return iZzo >= 0 ? this.zzV8[iZzo] : zzV4;
    }

    public final int getCount() {
        return this.zzZF - this.zzV5;
    }

    public final void set(TKey tkey, int i) {
        zzZ(tkey, i, false);
    }

    public final void zzP(TKey tkey, int i) {
        zzZ(tkey, i, true);
    }

    public final Iterable<TKey> zzxs() {
        if (this.zzn7 == null) {
            this.zzn7 = new zzY(this);
        }
        return this.zzn7;
    }

    public final zz7D<TKey>.zzZ zzxt() {
        return new zzZ(this);
    }

    private zz7D(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    private void zzZ(TKey tkey, int i, boolean z) {
        int i2;
        zzn(tkey);
        if (this.zzVc == null) {
            initialize(0);
        }
        int iHashCode = tkey.hashCode() & Integer.MAX_VALUE;
        int[] iArr = this.zzVc;
        int i3 = iArr[iHashCode % iArr.length];
        while (i3 >= 0) {
            if (this.zzVb[i3] == iHashCode && this.zznc.get(i3).equals(tkey)) {
                if (z) {
                    throw new IllegalStateException("A value with the specified key has already been added.");
                }
                this.zzV8[i3] = i;
                this.zzV7++;
                return;
            }
            i3 = this.zzVa[i3];
        }
        int i4 = this.zzV5;
        if (i4 > 0) {
            i2 = this.zzV6;
            this.zzV6 = this.zzVa[i2];
            this.zzV5 = i4 - 1;
        } else {
            if (this.zzZF == this.zzVb.length) {
                zzWx();
            }
            i2 = this.zzZF;
            this.zzZF = i2 + 1;
        }
        int[] iArr2 = this.zzVc;
        int length = iHashCode % iArr2.length;
        this.zzVb[i2] = iHashCode;
        this.zzVa[i2] = iArr2[length];
        this.zznc.set(i2, tkey);
        this.zzV8[i2] = i;
        this.zzVc[length] = i2;
        this.zzV7++;
    }
}
