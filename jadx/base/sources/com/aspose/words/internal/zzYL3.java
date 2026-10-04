package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYL3 {
    static final int[] zzWaq = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51089bl = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51090bm = {-457489321, -42779, -2, -1, -1, 42777, 2};

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
            zzYI2.zzU(5, 21389, iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        zzYI0.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        if (zzYI0.zzZ(zzYI0.zzI(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[4] == -1 && zzYI0.zzB(iArr2, zzWaq))) {
            zzYI2.zzU(5, 21389, iArr2);
        }
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
            zzYI2.zzU(5, 21389, iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI0.zzJ(iArr, iArr2, iArr3) != 0) {
            zzYI2.zzS(5, 21389, iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYI0.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && zzYI2.zzU(10, iArr3, f51089bl))) {
            int[] iArr4 = f51090bm;
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
            zzYI2.zzU(5, 21389, iArr3);
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
        if ((i == 0 || zzYI0.zzE(i, iArr) == 0) && !(iArr[4] == -1 && zzYI0.zzB(iArr, zzWaq))) {
            return;
        }
        zzYI2.zzU(5, 21389, iArr);
    }
}
