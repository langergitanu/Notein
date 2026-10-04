package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXD {
    private static int zzV4;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzV8;
    private byte[] zzV9;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;

    public zzXD() {
        this((byte) 0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(0);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zzV9 = new byte[iZzV9];
        this.zzV8 = new int[iZzV9];
        this.zzV6 = -1;
    }

    private int zzU(byte b) {
        int[] iArr = this.zzVc;
        if (iArr == null) {
            return -1;
        }
        int i = 2147483647 & b;
        int i2 = iArr[i % iArr.length];
        while (i2 >= 0) {
            if (this.zzVb[i2] == i && zzY(this.zzV9[i2], b)) {
                return i2;
            }
            i2 = this.zzVa[i2];
        }
        return -1;
    }

    private void zzW(byte b, int i) {
        int i2;
        if (this.zzVc == null) {
            initialize(0);
        }
        int i3 = 2147483647 & b;
        int[] iArr = this.zzVc;
        int i4 = iArr[i3 % iArr.length];
        while (i4 >= 0) {
            if (this.zzVb[i4] == i3 && zzY(this.zzV9[i4], b)) {
                throw new IllegalStateException("A value with the specified key has already been added.");
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
        this.zzV9[i2] = b;
        this.zzV8[i2] = i;
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
        byte[] bArr = new byte[iZzV9];
        zzZKV.zzZ(this.zzV9, 0, bArr, 0, this.zzZF);
        this.zzV9 = bArr;
        int[] iArr4 = new int[iZzV9];
        zzZKV.zzZ(this.zzV8, 0, iArr4, 0, this.zzZF);
        this.zzV8 = iArr4;
        for (int i = 0; i < this.zzZF; i++) {
            int i2 = iArr2[i] % iZzV9;
            iArr3[i] = iArr[i2];
            iArr[i2] = i;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    private static boolean zzY(byte b, byte b2) {
        return b == b2;
    }

    public final int zzT(byte b) {
        int iZzU = zzU(b);
        return iZzU >= 0 ? this.zzV8[iZzU] : zzV4;
    }

    public final boolean zzV(byte b) {
        return zzU(b) >= 0;
    }

    public final void zzX(byte b, int i) {
        zzW(b, i);
    }

    private zzXD(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }
}
