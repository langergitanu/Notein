package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXB {
    private static int zzV4 = Integer.MIN_VALUE;
    private zzXC[] zzUZ;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzV8;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;

    public zzXB() {
        this((byte) 0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(0);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zzUZ = new zzXC[iZzV9];
        this.zzV8 = new int[iZzV9];
        this.zzV6 = -1;
    }

    private void zzWx() {
        int iZzV9 = zzAN.zzV9(this.zzZF * 2);
        int[] iArr = new int[iZzV9];
        zzY(iArr);
        int[] iArr2 = new int[iZzV9];
        zzZKV.zzZ(this.zzVb, 0, iArr2, 0, this.zzZF);
        int[] iArr3 = new int[iZzV9];
        zzXC[] zzxcArr = new zzXC[iZzV9];
        zzZKV.zzZ(this.zzUZ, 0, zzxcArr, 0, this.zzZF);
        this.zzUZ = zzxcArr;
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

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    public final void zzZ(zzXC zzxc, int i) {
        zzY(zzxc, i);
    }

    private zzXB(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private int zzZ(zzXC zzxc) {
        if (this.zzVc == null) {
            return -1;
        }
        int iHashCode = zzxc.hashCode() & Integer.MAX_VALUE;
        int[] iArr = this.zzVc;
        int i = iArr[iHashCode % iArr.length];
        while (i >= 0) {
            if (this.zzVb[i] == iHashCode && zzXC.zzZ(this.zzUZ[i], zzxc)) {
                return i;
            }
            i = this.zzVa[i];
        }
        return -1;
    }

    private void zzY(zzXC zzxc, int i) {
        int i2;
        if (this.zzVc == null) {
            initialize(0);
        }
        int iHashCode = zzxc.hashCode() & Integer.MAX_VALUE;
        int[] iArr = this.zzVc;
        int i3 = iArr[iHashCode % iArr.length];
        while (i3 >= 0) {
            if (this.zzVb[i3] == iHashCode && zzXC.zzZ(this.zzUZ[i3], zzxc)) {
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
        this.zzUZ[i2] = zzxc;
        this.zzV8[i2] = i;
        iArr2[length] = i2;
        this.zzV7++;
    }

    public final int zzY(zzXC zzxc) {
        int iZzZ = zzZ(zzxc);
        if (iZzZ >= 0) {
            return this.zzV8[iZzZ];
        }
        return zzV4;
    }
}
