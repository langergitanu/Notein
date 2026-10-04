package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzD6 {
    private static char zzuK = 65535;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private char[] zzuL;
    private int[] zzuM;

    public zzD6() {
        this((byte) 0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(0);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zzuM = new int[iZzV9];
        this.zzuL = new char[iZzV9];
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

    private void zzW(int i, char c) {
        int i2;
        if (this.zzVc == null) {
            initialize(0);
        }
        int i3 = Integer.MAX_VALUE & i;
        int[] iArr = this.zzVc;
        int i4 = iArr[i3 % iArr.length];
        while (i4 >= 0) {
            if (this.zzVb[i4] == i3 && zz3(this.zzuM[i4], i)) {
                this.zzuL[i4] = c;
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
        this.zzuL[i2] = c;
        iArr2[length] = i2;
        this.zzV7++;
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
        char[] cArr = new char[iZzV9];
        zzZKV.zzZ(this.zzuL, 0, cArr, 0, this.zzZF);
        this.zzuL = cArr;
        for (int i = 0; i < this.zzZF; i++) {
            int i2 = iArr2[i] % iZzV9;
            iArr3[i] = iArr[i2];
            iArr[i2] = i;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    private static boolean zzY(char c, char c2) {
        return c == c2;
    }

    public static boolean zzx(char c) {
        return zzY(c, zzuK);
    }

    public final char get(int i) {
        int iZzVD = zzVD(i);
        return iZzVD >= 0 ? this.zzuL[iZzVD] : zzuK;
    }

    public final void zzV(int i, char c) {
        zzW(i, c);
    }

    public final boolean zzVE(int i) {
        return zzVD(i) >= 0;
    }

    private zzD6(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }
}
