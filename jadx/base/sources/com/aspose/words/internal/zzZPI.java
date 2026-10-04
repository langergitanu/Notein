package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPI extends zzZPU {
    int zzZZe;
    static int[] zzZZk = {0, 31, 59, 90, 120, 151, 181, 212, 243, StyleIdentifier.GRID_TABLE_1_LIGHT, 304, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_2_ACCENT_6};
    static int[] zzZZj = {0, 31, 60, 91, 121, 152, 182, 213, 244, StyleIdentifier.GRID_TABLE_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_6};
    static zzZPU zzZZd = null;

    public zzZPI() {
        this(1);
    }

    public static long zzB(int i, int i2, int i3) {
        if (i > 0 && i <= 9999 && i2 > 0 && i2 <= 12) {
            int[] iArr = (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) ? zzZZk : zzZZj;
            if (i3 > 0) {
                if (i3 <= iArr[i2] - iArr[i2 - 1]) {
                    int i4 = i - 1;
                    return ((((i4 / 400) + (((i4 / 4) + (i4 * StyleIdentifier.LIST_TABLE_2_ACCENT_6)) - (i4 / 100))) + r3) + i3) - 1;
                }
            }
        }
        throw new IllegalArgumentException("ArgumentOutOfRange_BadYearMonthDay");
    }

    private static int zzE(long j, int i) {
        int i2 = (int) (j / 864000000000L);
        int i3 = i2 / 146097;
        int i4 = i2 - (146097 * i3);
        int i5 = i4 / 36524;
        if (i5 == 4) {
            i5 = 3;
        }
        int i6 = i4 - (36524 * i5);
        int i7 = i6 / 1461;
        int i8 = i6 - (i7 * 1461);
        int i9 = i8 / StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        if (i9 == 4) {
            i9 = 3;
        }
        if (i == 0) {
            return (i7 * 4) + (i5 * 100) + (i3 * 400) + i9 + 1;
        }
        int i10 = i8 - (i9 * StyleIdentifier.LIST_TABLE_2_ACCENT_6);
        if (i == 1) {
            return i10 + 1;
        }
        int[] iArr = (i9 != 3 || (i7 == 24 && i5 != 3)) ? zzZZk : zzZZj;
        int i11 = i10 >> 6;
        while (i10 >= iArr[i11]) {
            i11++;
        }
        return i == 2 ? i11 : (i10 - iArr[i11 - 1]) + 1;
    }

    public static zzZPU zzje() {
        if (zzZZd == null) {
            zzZZd = new zzZPI();
        }
        return zzZZd;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int getID() {
        return this.zzZZe;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzF(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 2);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzG(zzZQ9 zzzq9) {
        return 1;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzH(zzZQ9 zzzq9) {
        return (int) (((zzzq9.zzkP() / 864000000000L) + 1) % 7);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzI(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 3);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0 || i8 == 1) {
            return new zzZQ9(i, i2, i3, i4, i5, i6, 0);
        }
        throw new IllegalArgumentException("ArgumentOutOfRange_InvalidEraValue");
    }

    @Override // com.aspose.words.internal.zzZPU
    public final boolean zzZl(int i, int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("ArgumentOutOfRange_InvalidEraValue");
        }
        if (i <= 0 || i > 9999) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
        if (i % 4 == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final void zzki() {
        zzkl();
        this.zz2l = 2029;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int[] zzkj() {
        return new int[]{1};
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzko() {
        return zzZQ9.zz34;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzkp() {
        return zzZQ9.zz35;
    }

    public zzZPI(int i) {
        if (i <= 0 || i > 12) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
        this.zzZZe = i;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzE(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 0);
    }
}
