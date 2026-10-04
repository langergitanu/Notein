package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPD extends zzZPU {
    private int zzZYU = Integer.MIN_VALUE;
    static int[] zzZYX = {0, 30, 59, 89, 118, 148, 177, 207, 236, StyleIdentifier.TOC_HEADING, StyleIdentifier.GRID_TABLE_2_ACCENT_3, StyleIdentifier.LIST_TABLE_4, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4};
    private static String zzZYW = "Control Panel\\International";
    private static String zzZYV = "AddHijriDate";
    static zzZQ9 zzZZ4 = new zzZQ9(622, 7, 18);
    static zzZQ9 zzZZ3 = zzZQ9.zz34;

    private int zzE(long j, int i) {
        zzYx(j);
        long jZzjd = (j / 864000000000L) + 1 + ((long) zzjd());
        int i2 = (int) (((jZzjd - 227013) * 30) / 10631);
        int i3 = i2 + 1;
        long jZzQU = zzQU(i3);
        long jZzQT = zzQT(i3);
        if (jZzjd < jZzQU) {
            jZzQU -= jZzQT;
        } else if (jZzjd == jZzQU) {
            jZzQT = zzQT(i2);
            jZzQU -= jZzQT;
        } else {
            long j2 = jZzQT + jZzQU;
            if (jZzjd > j2) {
                i2 += 2;
                jZzQU = j2;
            } else {
                i2 = i3;
            }
        }
        if (i == 0) {
            return i2;
        }
        long j3 = jZzjd - jZzQU;
        int i4 = 1;
        if (i == 1) {
            return (int) j3;
        }
        while (i4 <= 12 && j3 > zzZYX[i4 - 1]) {
            i4++;
        }
        int i5 = i4 - 1;
        if (i == 2) {
            return i5;
        }
        int i6 = (int) (j3 - ((long) zzZYX[i4 - 2]));
        if (i == 3) {
            return i6;
        }
        throw new IllegalStateException("InvalidOperation_DateTimeParsing");
    }

    private int zzQT(int i) {
        zzZb(i, 0);
        return zzZl(i, 0) ? StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4 : StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4;
    }

    private long zzQU(int i) {
        int i2 = ((i - 1) / 30) * 30;
        long j = ((((long) i2) * 10631) / 30) + 227013;
        for (int i3 = (i - i2) - 1; i3 > 0; i3--) {
            j += (long) ((zzZl(i3, 0) ? 1 : 0) + StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4);
        }
        return j;
    }

    private static void zzQY(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("ArgumentOutOfRange_InvalidEraValue");
        }
    }

    private static void zzYx(long j) {
        if (j < zzZZ4.zzkP() || j > zzZZ3.zzkP()) {
            throw new IllegalArgumentException("ArgumentOutOfRange_CalendarRange");
        }
    }

    private static void zzZb(int i, int i2) {
        zzQY(i2);
        if (i <= 0 || i > 9666) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
    }

    private int zzjd() {
        if (this.zzZYU == Integer.MIN_VALUE) {
            this.zzZYU = 0;
        }
        return this.zzZYU;
    }

    private void zzx(int i, int i2, int i3) {
        zzZb(i, i3);
        if (i == 9666 && i2 > 4) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
        if (i2 <= 0 || i2 > 12) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Month");
        }
    }

    private long zzy(int i, int i2, int i3) {
        return (((zzQU(i) + ((long) zzZYX[i2 - 1])) + ((long) i3)) - 1) - ((long) zzjd());
    }

    private int zzz(int i, int i2, int i3) {
        zzx(i, i2, i3);
        return i2 == 12 ? zzZl(i, 0) ? 30 : 29 : i2 % 2 == 1 ? 30 : 29;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int getID() {
        return 6;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzF(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 2);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzG(zzZQ9 zzzq9) {
        zzYx(zzzq9.zzkP());
        return 1;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzH(zzZQ9 zzzq9) {
        return ((int) ((zzzq9.zzkP() / 864000000000L) + 1)) % 7;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzI(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 3);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iZzz = zzz(i, i2, i8);
        if (i3 <= 0 || i3 > iZzz) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Day");
        }
        long jZzy = zzy(i, i2, i3);
        if (jZzy < 0) {
            throw new IllegalArgumentException("ArgumentOutOfRange_BadYearMonthDay");
        }
        return new zzZQ9(zzZPU.zzS(i4, i5, i6, 0) + (jZzy * 864000000000L));
    }

    @Override // com.aspose.words.internal.zzZPU
    public final boolean zzZl(int i, int i2) {
        zzZb(i, i2);
        return ((i * 11) + 14) % 30 < 11;
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
        return zzZZ3;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzkp() {
        return zzZZ4;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzE(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 0);
    }
}
