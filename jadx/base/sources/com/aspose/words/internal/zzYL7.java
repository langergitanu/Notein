package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYL7 {
    static final int[] zzWaq = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51096bl = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51097bm = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzE = zzYI0.zzE(bigInteger);
        if (iArrZzE[4] == -1) {
            int[] iArr = zzWaq;
            if (zzYI0.zzB(iArrZzE, iArr)) {
                zzYI0.zzA(iArr, iArrZzE);
            }
        }
        return iArrZzE;
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        if (zzYI2.zzZ(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && zzYI0.zzB(iArr2, zzWaq))) {
            zzYI2.zzT(5, -2147483647, iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        zzYI0.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        zzL((int) (j10 >>> 32), iArr2);
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        if (zzYI0.zzZB(iArr)) {
            zzYI0.zzZI(iArr2);
        } else {
            zzYI0.zzJ(zzWaq, iArr, iArr2);
        }
    }

    public static void zzN(int[] iArr, int[] iArr2) {
        if (zzYI2.zzT(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && zzYI0.zzB(iArr2, zzWaq))) {
            zzYI2.zzT(5, -2147483647, iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI0.zzJ(iArr, iArr2, iArr3) != 0) {
            zzYI2.zzZD(iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI0.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && zzYI2.zzU(10, iArr3, f51096bl))) {
            int[] iArr4 = f51097bm;
            if (zzYI2.zzW(iArr4.length, iArr4, iArr3) != 0) {
                zzYI2.zzW(10, iArr3, iArr4.length);
            }
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        zzYI0.zzR(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI0.zzM(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && zzYI0.zzB(iArr3, zzWaq))) {
            zzYI2.zzT(5, -2147483647, iArr3);
        }
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        zzYI0.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzYI0.zzK(iArr2, iArr3);
            zzL(iArr3, iArr2);
        }
    }

    public static void zzL(int i, int[] iArr) {
        if ((i == 0 || zzYI0.zzD(i, iArr) == 0) && !(iArr[4] == -1 && zzYI0.zzB(iArr, zzWaq))) {
            return;
        }
        zzYI2.zzT(5, -2147483647, iArr);
    }
}
