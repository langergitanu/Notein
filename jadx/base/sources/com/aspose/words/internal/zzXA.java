package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXA<TValue> {
    private ArrayList<TValue> zzUY;
    private zzXC[] zzUZ;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;

    public zzXA() {
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
        this.zzUY = new ArrayList<>(iZzV9);
        for (int i2 = 0; i2 < iZzV9; i2++) {
            zzZQG.zzZ(this.zzUY, (Object) null);
        }
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

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    public final TValue zzX(zzXC zzxc) {
        int iZzZ = zzZ(zzxc);
        if (iZzZ >= 0) {
            return this.zzUY.get(iZzZ);
        }
        return null;
    }

    public final void zzZ(zzXC zzxc, TValue tvalue) {
        zzZ(zzxc, tvalue, true);
    }

    private zzXA(byte b) {
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

    public final void zzY(zzXC zzxc, TValue tvalue) {
        zzZ(zzxc, tvalue, false);
    }

    private void zzZ(zzXC zzxc, TValue tvalue, boolean z) {
        int i;
        if (this.zzVc == null) {
            initialize(0);
        }
        int iHashCode = zzxc.hashCode() & Integer.MAX_VALUE;
        int[] iArr = this.zzVc;
        int i2 = iArr[iHashCode % iArr.length];
        while (i2 >= 0) {
            if (this.zzVb[i2] == iHashCode && zzXC.zzZ(this.zzUZ[i2], zzxc)) {
                if (!z) {
                    this.zzUY.set(i2, tvalue);
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
        this.zzUZ[i] = zzxc;
        this.zzUY.set(i, tvalue);
        this.zzVc[length] = i;
        this.zzV7++;
    }
}
