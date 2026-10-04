package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZP7 extends zzZPU {
    static int[] zzZYS = {0, 31, 62, 93, 124, 155, 186, 216, 246, StyleIdentifier.GRID_TABLE_4, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2};
    static int[] zzZYR = {0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0};
    static zzZQ9 zz1P = new zzZQ9(622, 3, 21);
    static zzZQ9 zz1O = zzZQ9.zz34;

    private int zzE(long j, int i) {
        zzYx(j);
        long j2 = j / 864000000000L;
        long j3 = 1 + j2;
        int i2 = (int) (((j2 - 226893) * 33) / 12053);
        int i3 = i2 + 1;
        long jZzQS = zzQS(i3);
        long jZzQT = zzQT(i3);
        if (j3 < jZzQS) {
            jZzQS -= jZzQT;
        } else if (j3 == jZzQS) {
            jZzQT = zzQT(i2);
            jZzQS -= jZzQT;
        } else {
            long j4 = jZzQT + jZzQS;
            if (j3 > j4) {
                i2 += 2;
                jZzQS = j4;
            } else {
                i2 = i3;
            }
        }
        if (i == 0) {
            return i2;
        }
        long j5 = j3 - jZzQS;
        if (i == 1) {
            return (int) j5;
        }
        int i4 = 0;
        while (i4 < 12 && j5 > zzZYS[i4]) {
            i4++;
        }
        if (i == 2) {
            return i4;
        }
        int i5 = (int) (j5 - ((long) zzZYS[i4 - 1]));
        if (i == 3) {
            return i5;
        }
        throw new IllegalStateException("InvalidOperation_DateTimeParsing");
    }

    private long zzQS(int i) {
        int i2 = i - 1;
        int i3 = i2 / 33;
        long j = (((long) i3) * 12053) + 226894;
        for (int i4 = i2 % 33; i4 > 0; i4--) {
            j = zzZl(i4, 0) ? j + 366 : 365 + j;
        }
        return j;
    }

    private int zzQT(int i) {
        zzZb(i, 0);
        return i == 9378 ? zzZYS[9] + 10 : zzZl(i, 0) ? StyleIdentifier.LIST_TABLE_3_ACCENT_6 : StyleIdentifier.LIST_TABLE_2_ACCENT_6;
    }

    private static void zzQY(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_InvalidEraValue");
        }
    }

    private static void zzYx(long j) {
        if (j < zz1P.zzkP() || j > zz1O.zzkP()) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_CalendarRange");
        }
    }

    private static void zzZb(int i, int i2) {
        zzQY(i2);
        if (i <= 0 || i > 9378) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
        }
    }

    private long zzw(int i, int i2, int i3) {
        if (i <= 0 || i > 9378 || i2 <= 0 || i2 > 12) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_BadYearMonthDay");
        }
        return ((zzQS(i) + ((long) zzZYS[i2 - 1])) + ((long) i3)) - 1;
    }

    private void zzx(int i, int i2, int i3) {
        zzZb(i, i3);
        if (i == 9378 && i2 > 10) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
        }
        if (i2 <= 0 || i2 > 12) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Month");
        }
    }

    private int zzz(int i, int i2, int i3) {
        zzx(i, i2, i3);
        if (i2 == 10 && i == 9378) {
            return 10;
        }
        return i2 == 12 ? zzZl(i, 0) ? 30 : 29 : i2 > 6 ? 30 : 31;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int getID() {
        return 22;
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
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Day");
        }
        long jZzw = zzw(i, i2, i3);
        if (jZzw < 0) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_BadYearMonthDay");
        }
        return new zzZQ9(zzZPU.zzS(i4, i5, i6, 0) + (jZzw * 864000000000L));
    }

    @Override // com.aspose.words.internal.zzZPU
    public final boolean zzZl(int i, int i2) {
        zzZb(i, i2);
        return zzZYR[i % 33] == 1;
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
    public final int zzkn() {
        return 1;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzko() {
        return zz1O;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzkp() {
        return zz1P;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzE(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 0);
    }
}
