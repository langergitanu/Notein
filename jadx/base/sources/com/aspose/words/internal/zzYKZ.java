package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKZ {
    static final int[] zzWaq = {-4553, -2, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51082bl = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51083bm = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

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
            zzYI2.zzU(6, 4553, iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        zzYHZ.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        if (zzYHZ.zzZ(zzYHZ.zzI(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[5] == -1 && zzYHZ.zzB(iArr2, zzWaq))) {
            zzYI2.zzU(6, 4553, iArr2);
        }
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
            zzYI2.zzU(6, 4553, iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHZ.zzJ(iArr, iArr2, iArr3) != 0) {
            zzYI2.zzS(6, 4553, iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHZ.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && zzYI2.zzU(12, iArr3, f51082bl))) {
            int[] iArr4 = f51083bm;
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
            zzYI2.zzU(6, 4553, iArr3);
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

    public static void zzL(int i, int[] iArr) {
        if ((i == 0 || zzYHZ.zzE(i, iArr) == 0) && !(iArr[5] == -1 && zzYHZ.zzB(iArr, zzWaq))) {
            return;
        }
        zzYI2.zzU(6, 4553, iArr);
    }
}
