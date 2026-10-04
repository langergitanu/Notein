package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKN {
    static final int[] zzWaq = {1, 0, 0, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51060bl = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51061bm = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzE = zzYHY.zzE(bigInteger);
        if (iArrZzE[6] == -1) {
            int[] iArr = zzWaq;
            if (zzYHY.zzB(iArrZzE, iArr)) {
                zzYHY.zzA(iArr, iArrZzE);
            }
        }
        return iArrZzE;
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        if (zzYI2.zzZ(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && zzYHY.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        zzYHY.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = (((long) iArr[0]) & 4294967295L) - j5;
        long j9 = j8 & 4294967295L;
        long j10 = ((((long) iArr[1]) & 4294967295L) - j6) + (j8 >> 32);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = ((((long) iArr[2]) & 4294967295L) - j7) + (j10 >> 32);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (((((long) iArr[3]) & 4294967295L) + j5) - j) + (j11 >> 32);
        long j13 = j12 & 4294967295L;
        long j14 = (((((long) iArr[4]) & 4294967295L) + j6) - j2) + (j12 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((((long) iArr[5]) & 4294967295L) + j7) - j3) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = (((((long) iArr[6]) & 4294967295L) + j) - j4) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (((long) i) & 4294967295L);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (((long) i2) & 4294967295L);
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) == 0 || zzYI2.zzW(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && zzYHY.zzB(iArr2, zzWaq))) {
            return;
        }
        zzZS(iArr2);
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        if (zzYHY.zzZB(iArr)) {
            zzYHY.zzZI(iArr2);
        } else {
            zzYHY.zzJ(zzWaq, iArr, iArr2);
        }
    }

    public static void zzN(int[] iArr, int[] iArr2) {
        if (zzYI2.zzT(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && zzYHY.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHY.zzJ(iArr, iArr2, iArr3) != 0) {
            zzZR(iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHY.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && zzYI2.zzU(14, iArr3, f51060bl))) {
            int[] iArr4 = f51061bm;
            if (zzYI2.zzW(iArr4.length, iArr4, iArr3) != 0) {
                zzYI2.zzW(14, iArr3, iArr4.length);
            }
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        zzYHY.zzR(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHY.zzM(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && zzYHY.zzB(iArr3, zzWaq))) {
            zzZS(iArr3);
        }
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        zzYHY.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzYHY.zzK(iArr2, iArr3);
            zzL(iArr3, iArr2);
        }
    }

    private static void zzZR(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = ((4294967295L & ((long) iArr[3])) - 1) + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            zzYI2.zzX(7, iArr, 4);
        }
    }

    private static void zzZS(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & ((long) iArr[3])) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            zzYI2.zzW(7, iArr, 4);
        }
    }

    public static void zzL(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & ((long) iArr[3])) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || zzYI2.zzW(7, iArr, 4) == 0) && !(iArr[6] == -1 && zzYHY.zzB(iArr, zzWaq))) {
            return;
        }
        zzZS(iArr);
    }
}
