package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7E<TKey> {
    private static double zzna = -1.7976931348623157E308d;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private double[] zznb;
    private ArrayList<TKey> zznc;

    public class zzZ {
        private int zzTL = -1;
        private int zzV7;
        private zz7E<TKey> zzn9;

        public zzZ(zz7E<TKey> zz7e) {
            this.zzn9 = zz7e;
            this.zzV7 = ((zz7E) zz7e).zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != ((zz7E) this.zzn9).zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= ((zz7E) this.zzn9).zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (((zz7E) this.zzn9).zzVb[this.zzTL] < 0);
            return true;
        }

        public final double zzxu() {
            zzCN();
            return ((zz7E) this.zzn9).zznb[this.zzTL];
        }

        public final TKey zzxv() {
            zzCN();
            return (TKey) ((zz7E) this.zzn9).zznc.get(this.zzTL);
        }
    }

    public zz7E() {
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
        this.zznb = new double[iZzV9];
        this.zzV6 = -1;
    }

    private static boolean zzH(double d, double d2) {
        return d == d2;
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
        double[] dArr = new double[iZzV9];
        zzZKV.zzZ(this.zznb, 0, dArr, 0, this.zzZF);
        this.zznb = dArr;
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            int i3 = iArr2[i2] % iZzV9;
            iArr3[i2] = iArr[i3];
            iArr[i3] = i2;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    public static boolean zzZy(double d) {
        return zzH(d, zzna);
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
                zzZKV.zzZ(this.zznb, i2);
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

    public final double zzm(TKey tkey) {
        int iZzo = zzo(tkey);
        return iZzo >= 0 ? this.zznb[iZzo] : zzna;
    }

    public final zz7E<TKey>.zzZ zzxw() {
        return new zzZ(this);
    }

    private zz7E(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    public final void zzZ(TKey tkey, double d) {
        zzZ(tkey, d, true);
    }

    private void zzZ(TKey tkey, double d, boolean z) {
        int i;
        zzn(tkey);
        if (this.zzVc == null) {
            initialize(0);
        }
        int iHashCode = tkey.hashCode() & Integer.MAX_VALUE;
        int[] iArr = this.zzVc;
        int i2 = iArr[iHashCode % iArr.length];
        while (i2 >= 0) {
            if (this.zzVb[i2] == iHashCode && this.zznc.get(i2).equals(tkey)) {
                if (!z) {
                    this.zznb[i2] = d;
                    this.zzV7++;
                    return;
                }
                throw new IllegalStateException("A value with the specified key has already been added.");
            }
            i2 = this.zzVa[i2];
        }
        int i3 = this.zzV5;
        if (i3 > 0) {
            i = this.zzV6;
            this.zzV6 = this.zzVa[i];
            this.zzV5 = i3 - 1;
        } else {
            if (this.zzZF == this.zzVb.length) {
                zzWx();
            }
            i = this.zzZF;
            this.zzZF = i + 1;
        }
        int[] iArr2 = this.zzVc;
        int length = iHashCode % iArr2.length;
        this.zzVb[i] = iHashCode;
        this.zzVa[i] = iArr2[length];
        this.zznc.set(i, tkey);
        this.zznb[i] = d;
        this.zzVc[length] = i;
        this.zzV7++;
    }

    public final void zzY(TKey tkey, double d) {
        zzZ(tkey, d, false);
    }
}
