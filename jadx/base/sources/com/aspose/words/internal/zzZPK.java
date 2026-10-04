package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZPK extends zzZPU {
    static int[] zzZZk = {0, 31, 59, 90, 120, 151, 181, 212, 243, StyleIdentifier.GRID_TABLE_1_LIGHT, 304, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1};
    static int[] zzZZj = {0, 31, 60, 91, 121, 152, 182, 213, 244, StyleIdentifier.GRID_TABLE_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1};

    private int zzC(int i, int i2, int i3) {
        int iZzZg = zzZg(i, i3);
        if (i2 == 13 && zzZk(iZzZg, 0) == 0) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Month");
        }
        if (i2 <= 0 || i2 > 13) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Month");
        }
        return iZzZg;
    }

    private boolean zzQW(int i) {
        return zzZk(i, 0) != 0;
    }

    private static int zzQX(int i) {
        if (i % 4 != 0) {
            return 0;
        }
        return (i % 100 != 0 || i % 400 == 0) ? 1 : 0;
    }

    private void zzQY(int i) {
        if (i == 0) {
            i = zzkk();
        }
        if (i < zzG(zzk6()) || i > zzG(zzk5())) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_InvalidEraValue");
        }
    }

    private boolean zzY(int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        int i4;
        if (i3 <= 0 || i3 > 30) {
            return false;
        }
        int iZzZf = i3 - 1;
        for (int i5 = 1; i5 < i2; i5++) {
            iZzZf += zzZf(i, i5);
        }
        int iZzZk = zzZk(i, 1);
        int iZzZk2 = zzZk(i, 2);
        int iZzQX = zzQX(i);
        int[] iArr4 = iZzQX == 1 ? zzZZj : zzZZk;
        iArr3[0] = iZzZk2;
        if (iZzZk > 1) {
            iArr3[0] = iZzZk2 + iArr4[iZzZk - 1];
        }
        int i6 = iArr3[0] + iZzZf;
        iArr3[0] = i6;
        int i7 = iZzQX + StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        if (i6 > i7) {
            iArr[0] = i + 1;
            iArr3[0] = iArr3[0] - i7;
        } else {
            iArr[0] = i;
        }
        iArr2[0] = 1;
        while (true) {
            i4 = iArr2[0];
            if (i4 >= 12 || iArr4[i4] >= iArr3[0]) {
                break;
            }
            iArr2[0] = i4 + 1;
        }
        iArr3[0] = iArr3[0] - iArr4[i4 - 1];
        return true;
    }

    private int zzZf(int i, int i2) {
        return (zzZk(i, 3) & (32768 >> (i2 + (-1)))) == 0 ? 29 : 30;
    }

    private int zzZg(int i, int i2) {
        zzQY(i2);
        int iZzZj = zzZj(i, i2);
        if (iZzZj < zzk8() || iZzZj > zzk7()) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
        }
        return iZzZj;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzE(zzZQ9 zzzq9) {
        zzYx(zzzq9.zzkP());
        int[] iArr = {0};
        zzZ(zzzq9, iArr, new int[]{0}, new int[]{0});
        return zzZ(iArr[0], zzzq9);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzF(zzZQ9 zzzq9) {
        zzYx(zzzq9.zzkP());
        int[] iArr = {0};
        zzZ(zzzq9, new int[]{0}, iArr, new int[]{0});
        return iArr[0];
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzH(zzZQ9 zzzq9) {
        zzYx(zzzq9.zzkP());
        return ((int) ((zzzq9.zzkP() / 864000000000L) + 1)) % 7;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzI(zzZQ9 zzzq9) {
        zzYx(zzzq9.zzkP());
        int[] iArr = {0};
        zzZ(zzzq9, new int[]{0}, new int[]{0}, iArr);
        return iArr[0];
    }

    public final void zzYx(long j) {
        if (j < zzkp().zzkP() || j > zzko().zzkP()) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_CalendarRange");
        }
    }

    public abstract int zzZ(int i, zzZQ9 zzzq9);

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iZzC = zzC(i, i2, i8);
        int iZzZf = zzZf(iZzC, i2);
        if (i3 <= 0 || i3 > iZzZf) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Day");
        }
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        boolean zZzY = zzY(iZzC, i2, i3, iArr, iArr2, iArr3);
        int i9 = iArr[0];
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        if (zZzY) {
            return new zzZQ9(i9, i10, i11, i4, i5, i6, 0);
        }
        throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_BadYearMonthDay");
    }

    public abstract int zzZj(int i, int i2);

    public abstract int zzZk(int i, int i2);

    @Override // com.aspose.words.internal.zzZPU
    public final boolean zzZl(int i, int i2) {
        return zzQW(zzZg(i, i2));
    }

    public abstract zzZQ9 zzk5();

    public abstract zzZQ9 zzk6();

    public abstract int zzk7();

    public abstract int zzk8();

    @Override // com.aspose.words.internal.zzZPU
    public final void zzki() {
        zzkl();
        if (2029 > zzk7()) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
        }
        this.zz2l = 2029;
    }

    private void zzZ(int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        int iZzZk;
        int iZzZk2;
        int i4 = (zzQX(i) == 1 ? zzZZj[i2 - 1] : zzZZk[i2 - 1]) + i3;
        iArr[0] = i;
        int iZzk7 = zzk7() + 1;
        int i5 = StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        if (i == iZzk7) {
            int i6 = iArr[0] - 1;
            iArr[0] = i6;
            if (zzQX(i6) == 1) {
                i5 = 366;
            }
            i4 += i5;
            iZzZk = zzZk(iArr[0], 1);
            iZzZk2 = zzZk(iArr[0], 2);
        } else {
            iZzZk = zzZk(iArr[0], 1);
            int iZzZk3 = zzZk(iArr[0], 2);
            if (i2 < iZzZk || (i2 == iZzZk && i3 < iZzZk3)) {
                int i7 = iArr[0] - 1;
                iArr[0] = i7;
                if (zzQX(i7) == 1) {
                    i5 = 366;
                }
                i4 += i5;
                iZzZk = zzZk(iArr[0], 1);
                iZzZk2 = zzZk(iArr[0], 2);
            } else {
                iZzZk2 = iZzZk3;
            }
        }
        int i8 = (i4 - zzZZk[iZzZk - 1]) - (iZzZk2 - 1);
        int iZzZk4 = zzZk(iArr[0], 3);
        int i9 = 32768;
        int i10 = (iZzZk4 & 32768) != 0 ? 30 : 29;
        iArr2[0] = 1;
        while (i8 > i10) {
            i8 -= i10;
            iArr2[0] = iArr2[0] + 1;
            i9 >>= 1;
            i10 = (iZzZk4 & i9) != 0 ? 30 : 29;
        }
        iArr3[0] = i8;
    }

    private void zzZ(zzZQ9 zzzq9, int[] iArr, int[] iArr2, int[] iArr3) {
        zzZPU zzzpuZzje = zzZPI.zzje();
        zzZ(zzzpuZzje.zzE(zzzq9), zzzpuZzje.zzF(zzzq9), zzzpuZzje.zzI(zzzq9), iArr, iArr2, iArr3);
    }
}
