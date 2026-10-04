package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKF {
    static final int[] zzWaq = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51047bl = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzE = zzYHX.zzE(bigInteger);
        if (iArrZzE[7] == -1) {
            int[] iArr = zzWaq;
            if (zzYHX.zzB(iArrZzE, iArr)) {
                zzYHX.zzA(iArr, iArrZzE);
            }
        }
        return iArrZzE;
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        if (zzYI2.zzZ(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && zzYHX.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zzYHX.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j15 - j10;
        long j18 = ((((long) iArr[0]) & 4294967295L) - j13) - j17;
        iArr2[0] = (int) j18;
        long j19 = ((((((long) iArr[1]) & 4294967295L) + j11) - j14) - j16) + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((((long) iArr[2]) & 4294967295L) + j12) - j15) + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((((((long) iArr[3]) & 4294967295L) + (j13 << 1)) + j17) - j16) + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = ((((((long) iArr[4]) & 4294967295L) + (j14 << 1)) + j7) - j11) + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (((((long) iArr[5]) & 4294967295L) + (j15 << 1)) - j12) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (((long) iArr[6]) & 4294967295L) + (j16 << 1) + j17 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = (((((((long) iArr[7]) & 4294967295L) + (j8 << 1)) + j9) - j12) - j14) + (j24 >> 32);
        iArr2[7] = (int) j25;
        zzL((int) ((j25 >> 32) + 6), iArr2);
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        if (zzYHX.zzZB(iArr)) {
            zzYHX.zzZI(iArr2);
        } else {
            zzYHX.zzJ(zzWaq, iArr, iArr2);
        }
    }

    public static void zzN(int[] iArr, int[] iArr2) {
        if (zzYI2.zzT(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && zzYHX.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHX.zzJ(iArr, iArr2, iArr3) != 0) {
            zzZR(iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHX.zzK(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && zzYI2.zzU(16, iArr3, f51047bl))) {
            zzYI2.zzR(16, f51047bl, iArr3);
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        zzYHX.zzR(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHX.zzM(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && zzYHX.zzB(iArr3, zzWaq))) {
            zzZS(iArr3);
        }
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        zzYHX.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzYHX.zzK(iArr2, iArr3);
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
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (((long) iArr[3]) & 4294967295L) + 1 + j2;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = (((long) iArr[6]) & 4294967295L) + 1 + j6;
        iArr[6] = (int) j9;
        iArr[7] = (int) (((4294967295L & ((long) iArr[7])) - 1) + (j9 >> 32));
    }

    private static void zzZS(int[] iArr) {
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
        long j5 = ((((long) iArr[3]) & 4294967295L) - 1) + j2;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = ((((long) iArr[6]) & 4294967295L) - 1) + j6;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + (j9 >> 32));
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
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = ((((long) iArr[3]) & 4294967295L) - j2) + j4;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = ((((long) iArr[6]) & 4294967295L) - j2) + j8;
            iArr[6] = (int) j11;
            long j12 = (4294967295L & ((long) iArr[7])) + j2 + (j11 >> 32);
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && zzYHX.zzB(iArr, zzWaq))) {
            zzZS(iArr);
        }
    }
}
