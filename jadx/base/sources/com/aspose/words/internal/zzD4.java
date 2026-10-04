package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzD4 {
    private static int zzV4 = Integer.MIN_VALUE;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzV8;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private int zzuG;
    private int zzuH;
    private int[] zzuM;

    public static class zzZ {
        private int zzTL = -1;
        private int zzV7;
        private zzD4 zzuF;

        public zzZ(zzD4 zzd4) {
            this.zzuF = zzd4;
            this.zzV7 = zzd4.zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != this.zzuF.zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= this.zzuF.zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (this.zzuF.zzVb[this.zzTL] < 0);
            return true;
        }

        public final int zzCL() {
            zzCN();
            return this.zzuF.zzV8[this.zzTL];
        }

        public final int zzCM() {
            zzCN();
            return this.zzuF.zzuM[this.zzTL];
        }
    }

    public zzD4() {
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
        this.zzV8 = new int[iZzV9];
        this.zzV6 = -1;
    }

    private static boolean zz3(int i, int i2) {
        return i == i2;
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
        int[] iArr4 = new int[iZzV9];
        zzZKV.zzZ(this.zzuM, 0, iArr4, 0, this.zzZF);
        this.zzuM = iArr4;
        int[] iArr5 = new int[iZzV9];
        zzZKV.zzZ(this.zzV8, 0, iArr5, 0, this.zzZF);
        this.zzV8 = iArr5;
        for (int i = 0; i < this.zzZF; i++) {
            int i2 = iArr2[i] % iZzV9;
            iArr3[i] = iArr[i2];
            iArr[i2] = i;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    private static boolean zzb(int i, int i2) {
        return i == i2;
    }

    public final void add(int i, int i2) {
        zzY(i, i2, true);
    }

    public final void clear() {
        if (this.zzZF == 0) {
            return;
        }
        zzY(this.zzVc);
        zzZKV.zzX(this.zzVb, 0, this.zzZF);
        zzZKV.zzX(this.zzVa, 0, this.zzZF);
        zzZKV.zzX(this.zzuM, 0, this.zzZF);
        zzZKV.zzX(this.zzV8, 0, this.zzZF);
        this.zzV6 = -1;
        this.zzZF = 0;
        this.zzV5 = 0;
        this.zzV7++;
    }

    public final int get(int i) {
        int iZzVD = zzVD(i);
        return iZzVD >= 0 ? this.zzV8[iZzVD] : zzV4;
    }

    public final int getCount() {
        return this.zzZF - this.zzV5;
    }

    public final void set(int i, int i2) {
        zzY(i, i2, false);
    }

    public final zzZ zzCP() {
        return new zzZ(this);
    }

    public final boolean zzVA(int i) {
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            if (this.zzVb[i2] >= 0 && zzb(this.zzV8[i2], i)) {
                return true;
            }
        }
        return false;
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
                this.zzV8[i3] = this.zzuG;
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

    public zzD4(int i) {
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

    private void zzY(int i, int i2, boolean z) {
        int i3;
        if (this.zzVc == null) {
            initialize(0);
        }
        int i4 = Integer.MAX_VALUE & i;
        int[] iArr = this.zzVc;
        int i5 = iArr[i4 % iArr.length];
        while (i5 >= 0) {
            if (this.zzVb[i5] == i4 && zz3(this.zzuM[i5], i)) {
                if (!z) {
                    this.zzV8[i5] = i2;
                    this.zzV7++;
                    return;
                }
                throw new IllegalStateException("A value with the specified key has already been added.");
            }
            i5 = this.zzVa[i5];
        }
        int i6 = this.zzV5;
        if (i6 > 0) {
            i3 = this.zzV6;
            this.zzV6 = this.zzVa[i3];
            this.zzV5 = i6 - 1;
        } else {
            if (this.zzZF == this.zzVb.length) {
                zzWx();
            }
            i3 = this.zzZF;
            this.zzZF = i3 + 1;
        }
        int[] iArr2 = this.zzVc;
        int length = i4 % iArr2.length;
        this.zzVb[i3] = i4;
        this.zzVa[i3] = iArr2[length];
        this.zzuM[i3] = i;
        this.zzV8[i3] = i2;
        iArr2[length] = i3;
        this.zzV7++;
    }
}
