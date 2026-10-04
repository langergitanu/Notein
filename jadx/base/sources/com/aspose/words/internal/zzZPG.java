package com.aspose.words.internal;

import com.aspose.slides.Oooo0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPG extends zzZPU {
    private static int[] zzZZ6 = {7, 3, 17, 3, 0, 4, 11, 2, 21, 6, 1, 3, 13, 2, 25, 4, 5, 3, 16, 2, 27, 6, 9, 1, 20, 2, 0, 6, 11, 3, 23, 4, 4, 2, 14, 3, 27, 4, 8, 2, 18, 3, 28, 6, 11, 1, 22, 5, 2, 3, 12, 3, 25, 4, 6, 2, 16, 3, 26, 6, 8, 2, 20, 1, 0, 6, 11, 2, 24, 4, 4, 3, 15, 2, 25, 6, 8, 1, 19, 2, 29, 6, 9, 3, 22, 4, 3, 2, 13, 3, 25, 4, 6, 3, 17, 2, 27, 6, 7, 3, 19, 2, 31, 4, 11, 3, 23, 4, 5, 2, 15, 3, 25, 6, 6, 2, 19, 1, 29, 6, 10, 2, 22, 4, 3, 3, 14, 2, 24, 6, 6, 1, 17, 3, 28, 5, 8, 3, 20, 1, 32, 5, 12, 3, 22, 6, 4, 1, 16, 2, 26, 6, 6, 3, 17, 2, 0, 4, 10, 3, 22, 4, 3, 2, 14, 3, 24, 6, 5, 2, 17, 1, 28, 6, 9, 2, 19, 3, 31, 4, 13, 2, 23, 6, 3, 3, 15, 1, 27, 5, 7, 3, 17, 3, 29, 4, 11, 2, 21, 6, 3, 1, 14, 2, 25, 6, 5, 3, 16, 2, 28, 4, 9, 3, 20, 2, 0, 6, 12, 1, 23, 6, 4, 2, 14, 3, 26, 4, 8, 2, 18, 3, 0, 4, 10, 3, 21, 5, 1, 3, 13, 1, 24, 5, 5, 3, 15, 3, 27, 4, 8, 2, 19, 3, 29, 6, 10, 2, 22, 4, 3, 3, 14, 2, 26, 4, 6, 3, 18, 2, 28, 6, 10, 1, 20, 6, 2, 2, 12, 3, 24, 4, 5, 2, 16, 3, 28, 4, 8, 3, 19, 2, 0, 6, 12, 1, 23, 5, 3, 3, 14, 3, 26, 4, 7, 2, 17, 3, 28, 6, 9, 2, 21, 4, 1, 3, 13, 2, 25, 4, 5, 3, 16, 2, 27, 6, 9, 1, 19, 3, 0, 5, 11, 3, 23, 4, 4, 2, 14, 3, 25, 6, 7, 1, 18, 2, 28, 6, 9, 3, 21, 4, 2, 2, 12, 3, 25, 4, 6, 2, 16, 3, 26, 6, 8, 2, 20, 1, 0, 6, 11, 2, 22, 6, 4, 1, 15, 2, 25, 6, 6, 3, 18, 1, 29, 5, 9, 3, 22, 4, 2, 3, 13, 2, 23, 6, 4, 3, 15, 2, 27, 4, 7, 3, 19, 2, 31, 4, 11, 3, 21, 6, 3, 2, 15, 1, 25, 6, 6, 2, 17, 3, 29, 4, 10, 2, 20, 6, 3, 1, 13, 3, 24, 5, 4, 3, 16, 1, 27, 5, 7, 3, 17, 3, 0, 4, 11, 2, 21, 6, 1, 3, 13, 2, 25, 4, 5, 3, 16, 2, 29, 4, 9, 3, 19, 6, 30, 2, 13, 1, 23, 6, 4, 2, 14, 3, 27, 4, 8, 2, 18, 3, 0, 4, 11, 3, 22, 5, 2, 3, 14, 1, 26, 5, 6, 3, 16, 3, 28, 4, 10, 2, 20, 6, 30, 3, 11, 2, 24, 4, 4, 3, 15, 2, 25, 6, 8, 1, 19, 2, 29, 6, 9, 3, 22, 4, 3, 2, 13, 3, 25, 4, 7, 2, 17, 3, 27, 6, 9, 1, 21, 5, 1, 3, 11, 3, 23, 4, 5, 2, 15, 3, 25, 6, 6, 2, 19, 1, 29, 6, 10, 2, 22, 4, 3, 3, 14, 2, 24, 6, 6, 1, 18, 2, 28, 6, 8, 3, 20, 4, 2, 2, 12, 3, 24, 4, 4, 3, 16, 2, 26, 6, 6, 3, 17, 2, 0, 4, 10, 3, 22, 4, 3, 2, 14, 3, 24, 6, 5, 2, 17, 1, 28, 6, 9, 2, 21, 4, 1, 3, 13, 2, 23, 6, 5, 1, 15, 3, 27, 5, 7, 3, 19, 1, 0, 5, 10, 3, 22, 4, 2, 3, 13, 2, 24, 6, 4, 3, 15, 2, 27, 4, 8, 3, 20, 4, 1, 2, 11, 3, 22, 6, 3, 2, 15, 1, 25, 6, 7, 2, 17, 3, 29, 4, 10, 2, 21, 6, 1, 3, 13, 1, 24, 5, 5, 3, 15, 3, 27, 4, 8, 2, 19, 6, 1, 1, 12, 2, 22, 6, 3, 3, 14, 2, 26, 4, 6, 3, 18, 2, 28, 6, 10, 1, 20, 6, 2, 2, 12, 3, 24, 4, 5, 2, 16, 3, 28, 4, 9, 2, 19, 6, 30, 3, 12, 1, 23, 5, 3, 3, 14, 3, 26, 4, 7, 2, 17, 3, 28, 6, 9, 2, 21, 4, 1, 3, 13, 2, 25, 4, 5, 3, 16, 2, 27, 6, 9, 1, 19, 6, 30, 2, 11, 3, 23, 4, 4, 2, 14, 3, 27, 4, 7, 3, 18, 2, 28, 6, 11, 1, 22, 5, 2, 3, 12, 3, 25, 4, 6, 2, 16, 3, 26, 6, 8, 2, 20, 4, 30, 3, 11, 2, 24, 4, 4, 3, 15, 2, 25, 6, 8, 1, 18, 3, 29, 5, 9, 3, 22, 4, 3, 2, 13, 3, 23, 6, 6, 1, 17, 2, 27, 6, 7, 3, 20, 4, 1, 2, 11, 3, 23, 4, 5, 2, 15, 3, 25, 6, 6, 2, 19, 1, 29, 6, 10, 2, 20, 6, 3, 1, 14, 2, 24, 6, 4, 3, 17, 1, 28, 5, 8, 3, 20, 4, 1, 3, 12, 2, 22, 6, 2, 3, 14, 2, 26, 4, 6, 3, 17, 2, 0, 4, 10, 3, 20, 6, 1, 2, 14, 1, 24, 6, 5, 2, 15, 3, 28, 4, 9, 2, 19, 6, 1, 1, 12, 3, 23, 5, 3, 3, 15, 1, 27, 5, 7, 3, 17, 3, 29, 4, 11, 2, 21, 6, 1, 3, 12, 2, 25, 4, 5, 3, 16, 2, 28, 4, 9, 3, 19, 6, 30, 2, 12, 1, 23, 6, 4, 2, 14, 3, 26, 4, 8, 2, 18, 3, 0, 4, 10, 3, 22, 5, 2, 3, 14, 1, 25, 5, 6, 3, 16, 3, 28, 4, 9, 2, 20, 6, 30, 3, 
    11, 2, 23, 4, 4, 3, 15, 2, 27, 4, 7, 3, 19, 2, 29, 6, 11, 1, 21, 6, 3, 2, 13, 3, 25, 4, 6, 2, 17, 3, 27, 6, 9, 1, 20, 5, 30, 3, 10, 3, 22, 4, 3, 2, 14, 3, 24, 6, 5, 2, 17, 1, 28, 6, 9, 2, 21, 4, 1, 3, 13, 2, 23, 6, 5, 1, 16, 2, 27, 6, 7, 3, 19, 4, 30, 2, 11, 3, 23, 4, 3, 3, 14, 2, 25, 6, 5, 3, 16, 2, 28, 4, 9, 3, 21, 4, 2, 2, 12, 3, 23, 6, 4, 2, 16, 1, 26, 6, 8, 2, 20, 4, 30, 3, 11, 2, 22, 6, 4, 1, 14, 3, 25, 5, 6, 3, 18, 1, 29, 5, 9, 3, 22, 4, 2, 3, 13, 2, 23, 6, 4, 3, 15, 2, 27, 4, 7, 3, 20, 4, 1, 2, 11, 3, 21, 6, 3, 2, 15, 1, 25, 6, 6, 2, 17, 3, 29, 4, 10, 2, 20, 6, 3, 1, 13, 3, 24, 5, 4, 3, 17, 1, 28, 5, 8, 3, 18, 6, 1, 1, 12, 2, 22, 6, 2, 3, 14, 2, 26, 4, 6, 3, 17, 2, 28, 6, 10, 1, 20, 6, 1, 2, 12, 3, 24, 4, 5, 2, 15, 3, 28, 4, 9, 2, 19, 6, 33, 3, 12, 1, 23, 5, 3, 3, 13, 3, 25, 4, 6, 2, 16, 3, 26, 6, 8, 2, 20, 4, 30, 3, 11, 2, 24, 4, 4, 3, 15, 2, 25, 6, 8, 1, 18, 6, 33, 2, 9, 3, 22, 4, 3, 2, 13, 3, 25, 4, 6, 3, 17, 2, 27, 6, 9, 1, 21, 5, 1, 3, 11, 3, 23, 4, 5, 2, 15, 3, 25, 6, 6, 2, 19, 4, 33, 3, 10, 2, 22, 4, 3, 3, 14, 2, 24, 6, 6, 1};
    private static int[][] zzZZ5 = {new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 30, 29, 29, 29, 30, 29, 30, 29, 30, 29, 30, 29, 0}, new int[]{0, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 0}, new int[]{0, 30, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 0}, new int[]{0, 30, 29, 29, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{0, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{0, 30, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}};
    static zzZQ9 zzZZ4 = new zzZQ9(1583, 1, 1);
    static zzZQ9 zzZZ3 = new zzZQ9(new zzZQ9(2239, 9, 29, 23, 59, 59, 999).zzkP() + 9999);

    public static class zzZ {
        int month;
        int year;
        int zzZZ2;
    }

    private void zzA(int i, int i2, int i3) {
        int iZzZc = zzZc(i, i3);
        if (i2 <= 0 || i2 > iZzZc) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
    }

    private static int zzE(long j, int i) {
        zzYx(j);
        zzZQ9 zzzq9 = new zzZQ9(j);
        int year = zzzq9.getYear();
        int month = zzzq9.getMonth();
        int day = zzzq9.getDay();
        zzZ zzz = new zzZ();
        zzz.year = year + 3760;
        int iZzZ = zzZ(year, zzz);
        zzZ zzz2 = new zzZ();
        zzz2.year = zzz.year;
        zzz2.month = zzz.month;
        zzz2.zzZZ2 = zzz.zzZZ2;
        long jZzB = zzZPI.zzB(year, month, day);
        if (month == 1 && day == 1) {
            return zzZ(zzz2, i);
        }
        long jZzB2 = jZzB - zzZPI.zzB(year, 1, 1);
        long j2 = ((long) zzz.zzZZ2) + jZzB2;
        int[] iArr = zzZZ5[iZzZ];
        if (j2 <= iArr[zzz.month]) {
            zzz2.zzZZ2 += (int) jZzB2;
            return zzZ(zzz2, i);
        }
        zzz2.month++;
        zzz2.zzZZ2 = 1;
        long j3 = jZzB2 - ((long) (iArr[zzz.month] - zzz.zzZZ2));
        if (j3 > 1) {
            while (true) {
                int[] iArr2 = zzZZ5[iZzZ];
                int i2 = zzz2.month;
                int i3 = iArr2[i2];
                if (j3 <= i3) {
                    break;
                }
                int i4 = i2 + 1;
                zzz2.month = i4;
                j3 -= (long) i3;
                if (i4 > 13 || iArr2[i4] == 0) {
                    zzz2.year++;
                    iZzZ = zzZZ6[Oooo0.OooO00o(year, -1582, 2, 1)];
                    zzz2.month = 1;
                }
            }
            zzz2.zzZZ2 += (int) (j3 - 1);
        }
        return zzZ(zzz2, i);
    }

    private static void zzQY(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("ArgumentOutOfRange_InvalidEraValue");
        }
    }

    private void zzR(int i, int i2, int i3, int i4) {
        int iZzz = zzz(i, i2, i4);
        if (i3 <= 0 || i3 > iZzz) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
    }

    private static int zzW(int i, int i2, int i3, int i4, int i5) {
        if (i2 == i4) {
            return i3 - i5;
        }
        boolean z = i2 > i4;
        if (z) {
            i4 = i2;
            i2 = i4;
            i5 = i3;
            i3 = i5;
        }
        int i6 = zzZZ5[i][i2] - i3;
        for (int i7 = i2 + 1; i7 < i4; i7++) {
            i6 += zzZZ5[i][i7];
        }
        int i8 = i6 + i5;
        return z ? i8 : -i8;
    }

    private static zzZQ9 zzY(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i - 3760;
        zzZ zzz = new zzZ();
        int iZzZ = zzZ(i8, zzz);
        int i9 = zzz.month;
        if (i2 == i9 && i3 == zzz.zzZZ2) {
            return new zzZQ9(i8, 1, 1, i4, i5, i6, i7);
        }
        return new zzZQ9(zzZPU.zzS(i4, i5, i6, i7) + (((long) zzW(iZzZ, i2, i3, i9, zzz.zzZZ2)) * 864000000000L) + new zzZQ9(i8, 1, 1).zzkP());
    }

    private static void zzYx(long j) {
        if (j < zzZZ4.zzkP() || j > zzZZ3.zzkP()) {
            throw new IllegalArgumentException("ArgumentOutOfRange_CalendarRange");
        }
    }

    private static int zzZ(zzZ zzz, int i) {
        if (i == 0) {
            return zzz.year;
        }
        if (i == 2) {
            return zzz.month;
        }
        if (i == 3) {
            return zzz.zzZZ2;
        }
        throw new IllegalStateException("InvalidOperation_DateTimeParsing");
    }

    private int zzZc(int i, int i2) {
        return zzZl(i, i2) ? 13 : 12;
    }

    private int zzZd(int i, int i2) {
        zzZe(i, i2);
        return zzZZ6[androidx.core.graphics.OooO0OO.OooO00o(i, 5343, 2, 1)];
    }

    private static void zzZe(int i, int i2) {
        zzQY(i2);
        if (i > 5999 || i < 5343) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
    }

    private int zzz(int i, int i2, int i3) {
        zzQY(i3);
        int iZzZd = zzZd(i, i3);
        zzA(i, i2, i3);
        int i4 = zzZZ5[iZzZd][i2];
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException("ArgumentOutOfRange_Month");
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int getID() {
        return 8;
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
        return ((int) ((zzzq9.zzkP() / 864000000000L) + 1)) % 7;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzI(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 3);
    }

    @Override // com.aspose.words.internal.zzZPU
    public final boolean zzZl(int i, int i2) {
        zzZe(i, i2);
        return ((((long) i) * 7) + 1) % 19 < 7;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final void zzki() {
        zzkl();
        zzZe(2029, 1);
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

    private static int zzZ(int i, zzZ zzz) {
        int i2 = i - 1583;
        if (i2 >= 0 && i2 <= 656) {
            int i3 = i2 * 2;
            int[] iArr = zzZZ6;
            int i4 = iArr[i3];
            zzz.zzZZ2 = i4;
            int i5 = iArr[i3 + 1];
            if (i4 != 0) {
                switch (i4) {
                    case 30:
                        zzz.month = 3;
                        return i5;
                    case 31:
                        zzz.month = 5;
                        zzz.zzZZ2 = 2;
                        return i5;
                    case 32:
                        zzz.month = 5;
                        zzz.zzZZ2 = 3;
                        return i5;
                    case 33:
                        zzz.month = 3;
                        zzz.zzZZ2 = 29;
                        return i5;
                    default:
                        zzz.month = 4;
                        return i5;
                }
            }
            zzz.month = 5;
            zzz.zzZZ2 = 1;
            return i5;
        }
        throw new IllegalArgumentException("Parameter name: gregorianYear");
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        zzZe(i, i8);
        zzA(i, i2, i8);
        zzR(i, i2, i3, i8);
        zzZQ9 zzzq9ZzY = zzY(i, i2, i3, i4, i5, i6, 0);
        zzYx(zzzq9ZzY.zzkP());
        return zzzq9ZzY;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzE(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 0);
    }
}
