package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYLD {
    static final int[] zzWaq = {-1, -1, -1, -3};

    /* JADX INFO: renamed from: bl */
    static final int[] f51107bl = {1, 0, 0, 4, -2, -1, 3, -4};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51108bm = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzE = zzYI1.zzE(bigInteger);
        if ((iArrZzE[3] >>> 1) >= 2147483646) {
            int[] iArr = zzWaq;
            if (zzYI1.zzB(iArrZzE, iArr)) {
                zzYI1.zzA(iArr, iArrZzE);
            }
        }
        return iArrZzE;
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        if (zzYI2.zzZ(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && zzYI1.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        zzYI1.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j6 + (j10 << 1);
        long j12 = j2 + j11;
        long j13 = j5 + (j11 << 1);
        long j14 = j + j13;
        iArr2[0] = (int) j14;
        long j15 = j12 + (j14 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j3 + j10 + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = j9 + (j13 << 1) + (j16 >>> 32);
        iArr2[3] = (int) j17;
        zzL((int) (j17 >>> 32), iArr2);
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        if (zzYI1.zzZB(iArr)) {
            zzYI1.zzZI(iArr2);
        } else {
            zzYI1.zzJ(zzWaq, iArr, iArr2);
        }
    }

    public static void zzN(int[] iArr, int[] iArr2) {
        if (zzYI2.zzT(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && zzYI1.zzB(iArr2, zzWaq))) {
            zzZS(iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI1.zzJ(iArr, iArr2, iArr3) != 0) {
            zzZR(iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI1.zzK(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && zzYHX.zzB(iArr3, f51107bl))) {
            int[] iArr4 = f51108bm;
            zzYI2.zzW(iArr4.length, iArr4, iArr3);
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        zzYI1.zzR(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI1.zzM(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && zzYI1.zzB(iArr3, zzWaq))) {
            zzZS(iArr3);
        }
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        zzYI1.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzYI1.zzK(iArr2, iArr3);
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
        iArr[3] = (int) (((4294967295L & ((long) iArr[3])) - 2) + j2);
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
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j2);
    }

    public static void zzL(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[3])) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }
}
