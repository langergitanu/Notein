package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzD3<TValue> {
    private ArrayList<TValue> zzUY;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private TValue zza;
    private zzD3<TValue>.zzY zzuE;
    private int zzuH;
    private int[] zzuM;

    public class zzY implements Iterable<TValue> {
        private zzD3<TValue> zzuD;

        public class zzZ implements Iterator<TValue> {
            private zzD3<TValue>.zzZ zzuB;

            public zzZ(zzD3<TValue> zzd3) {
                this.zzuB = zzd3.zzCK();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.zzuB.moveNext();
            }

            @Override // java.util.Iterator
            public final TValue next() {
                return this.zzuB.zzCI();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzY(zzD3<TValue> zzd3) {
            this.zzuD = zzd3;
        }

        @Override // java.lang.Iterable
        public final Iterator<TValue> iterator() {
            return new zzZ(this.zzuD);
        }
    }

    public class zzZ {
        private int zzTL = -1;
        private int zzV7;
        private zzD3<TValue> zzuD;

        public zzZ(zzD3<TValue> zzd3) {
            this.zzuD = zzd3;
            this.zzV7 = ((zzD3) zzd3).zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != ((zzD3) this.zzuD).zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= ((zzD3) this.zzuD).zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (((zzD3) this.zzuD).zzVb[this.zzTL] < 0);
            return true;
        }

        public final TValue zzCI() {
            zzCN();
            return (TValue) ((zzD3) this.zzuD).zzUY.get(this.zzTL);
        }

        public final int zzCM() {
            zzCN();
            return ((zzD3) this.zzuD).zzuM[this.zzTL];
        }
    }

    public zzD3() {
        this(0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(i);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zzuM = new int[iZzV9];
        this.zzUY = new ArrayList<>(iZzV9);
        for (int i2 = 0; i2 < iZzV9; i2++) {
            zzZQG.zzZ(this.zzUY, (Object) null);
        }
        this.zzV6 = -1;
    }

    private static boolean zz3(int i, int i2) {
        return i == i2;
    }

    private static <TValue> boolean zzI(TValue tvalue, TValue tvalue2) {
        return tvalue == null ? tvalue2 == null : tvalue.equals(tvalue2);
    }

    private int zzVD(int i) {
        int[] iArr = this.zzVc;
        if (iArr == null) {
            return -1;
        }
        int i2 = Integer.MAX_VALUE & i;
        int i3 = iArr[i2 % iArr.length];
        while (i3 >= 0) {
            if (this.zzVb[i3] == i2 && zz3(this.zzuM[i3], i)) {
                return i3;
            }
            i3 = this.zzVa[i3];
        }
        return -1;
    }

    private void zzWx() {
        int iZzV9 = zzAN.zzV9(this.zzZF * 2);
        int[] iArr = new int[iZzV9];
        zzY(iArr);
        int[] iArr2 = new int[iZzV9];
        zzZKV.zzZ(this.zzVb, 0, iArr2, 0, this.zzZF);
        int[] iArr3 = new int[iZzV9];
        int[] iArr4 = new int[iZzV9];
        zzZKV.zzZ(this.zzuM, 0, iArr4, 0, this.zzZF);
        this.zzuM = iArr4;
        for (int i = this.zzZF; i < iZzV9; i++) {
            zzZQG.zzZ(this.zzUY, (Object) null);
        }
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            int i3 = iArr2[i2] % iZzV9;
            iArr3[i2] = iArr[i3];
            iArr[i3] = i2;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    public final void add(int i, TValue tvalue) {
        zzZ(i, tvalue, true);
    }

    public final void clear() {
        if (this.zzZF == 0) {
            return;
        }
        zzY(this.zzVc);
        zzZKV.zzX(this.zzVb, 0, this.zzZF);
        zzZKV.zzX(this.zzVa, 0, this.zzZF);
        zzZKV.zzX(this.zzuM, 0, this.zzZF);
        for (int i = 0; i < this.zzZF; i++) {
            this.zzUY.set(i, null);
        }
        this.zzV6 = -1;
        this.zzZF = 0;
        this.zzV5 = 0;
        this.zzV7++;
    }

    public final boolean containsValue(TValue tvalue) {
        for (int i = 0; i < this.zzZF; i++) {
            if (this.zzVb[i] >= 0 && zzI(this.zzUY.get(i), tvalue)) {
                return true;
            }
        }
        return false;
    }

    public final TValue get(int i) {
        int iZzVD = zzVD(i);
        if (iZzVD >= 0) {
            return this.zzUY.get(iZzVD);
        }
        return null;
    }

    public final int getCount() {
        return this.zzZF - this.zzV5;
    }

    public final void set(int i, TValue tvalue) {
        zzZ(i, tvalue, false);
    }

    public final Iterable<TValue> zzCJ() {
        zzD3<TValue>.zzY zzy = this.zzuE;
        if (zzy != null) {
            return zzy;
        }
        zzD3<TValue>.zzY zzy2 = new zzY(this);
        this.zzuE = zzy2;
        return zzy2;
    }

    public final zzD3<TValue>.zzZ zzCK() {
        return new zzZ(this);
    }

    public final boolean zzVE(int i) {
        return zzVD(i) >= 0;
    }

    public final boolean zzVG(int i) {
        int[] iArr = this.zzVc;
        if (iArr == null) {
            return false;
        }
        int i2 = Integer.MAX_VALUE & i;
        int length = i2 % iArr.length;
        int i3 = iArr[length];
        int i4 = -1;
        while (i3 >= 0) {
            if (this.zzVb[i3] == i2 && zz3(this.zzuM[i3], i)) {
                if (i4 < 0) {
                    this.zzVc[length] = this.zzVa[i3];
                } else {
                    int[] iArr2 = this.zzVa;
                    iArr2[i4] = iArr2[i3];
                }
                this.zzVb[i3] = -1;
                this.zzVa[i3] = this.zzV6;
                this.zzuM[i3] = this.zzuH;
                this.zzUY.set(i3, this.zza);
                this.zzV6 = i3;
                this.zzV5++;
                this.zzV7++;
                return true;
            }
            i4 = i3;
            i3 = this.zzVa[i3];
        }
        return false;
    }

    public zzD3(int i) {
        zzZ4.zzY(i, "capacity");
        if (i > 0) {
            initialize(i);
        }
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    private void zzZ(int i, TValue tvalue, boolean z) {
        int i2;
        if (this.zzVc == null) {
            initialize(0);
        }
        int i3 = Integer.MAX_VALUE & i;
        int[] iArr = this.zzVc;
        int i4 = iArr[i3 % iArr.length];
        while (i4 >= 0) {
            if (this.zzVb[i4] == i3 && zz3(this.zzuM[i4], i)) {
                if (z) {
                    throw new IllegalStateException("A value with the specified key has already been added.");
                }
                this.zzUY.set(i4, tvalue);
                this.zzV7++;
                return;
            }
            i4 = this.zzVa[i4];
        }
        int i5 = this.zzV5;
        if (i5 > 0) {
            i2 = this.zzV6;
            this.zzV6 = this.zzVa[i2];
            this.zzV5 = i5 - 1;
        } else {
            if (this.zzZF == this.zzVb.length) {
                zzWx();
            }
            i2 = this.zzZF;
            this.zzZF = i2 + 1;
        }
        int[] iArr2 = this.zzVc;
        int length = i3 % iArr2.length;
        this.zzVb[i2] = i3;
        this.zzVa[i2] = iArr2[length];
        this.zzuM[i2] = i;
        this.zzUY.set(i2, tvalue);
        this.zzVc[length] = i2;
        this.zzV7++;
    }

    public zzD3(zzD3<TValue> zzd3) {
        this(zzd3 != null ? zzd3.getCount() : 0);
        zzZ4.zzY((Object) zzd3, "dictionary");
        zzD3<TValue>.zzZ zzzZzCK = zzd3.zzCK();
        while (zzzZzCK.moveNext()) {
            zzZ(zzzZzCK.zzCM(), zzzZzCK.zzCI(), true);
        }
    }
}
