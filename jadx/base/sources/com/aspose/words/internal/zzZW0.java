package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZW0 {
    private static byte zz82;
    private byte[] zzAz;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private int[] zzuM;

    public zzZW0() {
        this((byte) 0);
    }

    private static int hashCode(int i) {
        long j = ((long) i) & 4294967295L;
        return ((int) (j ^ (j >>> 32))) & Integer.MAX_VALUE;
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(0);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zzuM = new int[iZzV9];
        this.zzAz = new byte[iZzV9];
        this.zzV6 = -1;
    }

    private static boolean zz3(int i, int i2) {
        return i == i2;
    }

    private int zzVD(int i) {
        if (this.zzVc == null) {
            return -1;
        }
        int iHashCode = hashCode(i);
        int[] iArr = this.zzVc;
        int i2 = iArr[iHashCode % iArr.length];
        while (i2 >= 0) {
            if (this.zzVb[i2] == iHashCode && zz3(this.zzuM[i2], i)) {
                return i2;
            }
            i2 = this.zzVa[i2];
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
        byte[] bArr = new byte[iZzV9];
        zzZKV.zzZ(this.zzAz, 0, bArr, 0, this.zzZF);
        this.zzAz = bArr;
        for (int i = 0; i < this.zzZF; i++) {
            int i2 = iArr2[i] % iZzV9;
            iArr3[i] = iArr[i2];
            iArr[i2] = i;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    private void zzX(int i, byte b) {
        int i2;
        if (this.zzVc == null) {
            initialize(0);
        }
        int iHashCode = hashCode(i);
        int[] iArr = this.zzVc;
        int i3 = iArr[iHashCode % iArr.length];
        while (i3 >= 0) {
            if (this.zzVb[i3] == iHashCode && zz3(this.zzuM[i3], i)) {
                throw new IllegalStateException("A value with the specified key has already been added.");
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
        this.zzuM[i2] = i;
        this.zzAz[i2] = b;
        iArr2[length] = i2;
        this.zzV7++;
    }

    public final byte get(int i) {
        int iZzVD = zzVD(i);
        return iZzVD >= 0 ? this.zzAz[iZzVD] : zz82;
    }

    public final boolean zzVE(int i) {
        return zzVD(i) >= 0;
    }

    public final void zzY(int i, byte b) {
        zzX(i, b);
    }

    private zzZW0(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }
}
