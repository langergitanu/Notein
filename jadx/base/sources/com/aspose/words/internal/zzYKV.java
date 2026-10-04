package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKV {
    static final int[] zzWaq = {-1, -1, -2, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51075bl = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51076bm = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzE = zzYHZ.zzE(bigInteger);
        if (iArrZzE[5] == -1) {
            int[] iArr = zzWaq;
            if (zzYHZ.zzB(iArrZzE, iArr)) {
                zzYHZ.zzA(iArr, iArrZzE);
            }
        }
        return iArrZzE;
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        if (zzYI2.zzZ(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && zzYHZ.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        zzYHZ.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (((long) iArr[1]) & 4294967295L) + j6 + (j7 >> 32);
        int i2 = (int) j8;
        iArr2[1] = i2;
        long j9 = j5 + j3;
        long j10 = j6 + j4;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = j11 & 4294967295L;
        long j13 = (((long) iArr[3]) & 4294967295L) + j10 + (j11 >> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (j9 - j) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (j10 - j2) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = j15 >> 32;
        long j17 = j12 + j16;
        long j18 = j16 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) i2) & 4294967295L);
            iArr2[1] = (int) j20;
            j17 += j20 >> 32;
        }
        iArr2[2] = (int) j17;
        if (((j17 >> 32) == 0 || zzYI2.zzW(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && zzYHZ.zzB(iArr2, zzWaq))) {
            return;
        }
        zzZS(iArr2);
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        if (zzYHZ.zzZB(iArr)) {
            zzYHZ.zzZI(iArr2);
        } else {
            zzYHZ.zzJ(zzWaq, iArr, iArr2);
        }
    }

    public static void zzN(int[] iArr, int[] iArr2) {
        if (zzYI2.zzT(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && zzYHZ.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHZ.zzJ(iArr, iArr2, iArr3) != 0) {
            zzZR(iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHZ.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && zzYI2.zzU(12, iArr3, f51075bl))) {
            int[] iArr4 = f51076bm;
            if (zzYI2.zzW(iArr4.length, iArr4, iArr3) != 0) {
                zzYI2.zzW(12, iArr3, iArr4.length);
            }
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        zzYHZ.zzR(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHZ.zzM(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && zzYHZ.zzB(iArr3, zzWaq))) {
            zzZS(iArr3);
        }
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        zzYHZ.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzYHZ.zzK(iArr2, iArr3);
            zzL(iArr3, iArr2);
        }
    }

    private static void zzZR(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((4294967295L & ((long) iArr[2])) - 1) + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            zzYI2.zzX(6, iArr, 3);
        }
    }

    private static void zzZS(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & ((long) iArr[2])) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            zzYI2.zzW(6, iArr, 3);
        }
    }

    public static void zzL(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[2])) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || zzYI2.zzW(6, iArr, 3) == 0) && !(iArr[5] == -1 && zzYHZ.zzB(iArr, zzWaq))) {
            return;
        }
        zzZS(iArr);
    }
}
