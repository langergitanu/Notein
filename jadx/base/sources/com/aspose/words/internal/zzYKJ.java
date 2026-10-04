package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKJ {
    static final int[] zzWaq = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51053bl = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51054bm = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

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
            zzYI2.zzU(8, 977, iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zzYHX.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        if (zzYHX.zzZ(zzYHX.zzI(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[7] == -1 && zzYHX.zzB(iArr2, zzWaq))) {
            zzYI2.zzU(8, 977, iArr2);
        }
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
            zzYI2.zzU(8, 977, iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHX.zzJ(iArr, iArr2, iArr3) != 0) {
            zzYI2.zzS(8, 977, iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHX.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && zzYI2.zzU(16, iArr3, f51053bl))) {
            int[] iArr4 = f51054bm;
            if (zzYI2.zzW(iArr4.length, iArr4, iArr3) != 0) {
                zzYI2.zzW(16, iArr3, iArr4.length);
            }
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        zzYHX.zzR(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHX.zzM(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && zzYHX.zzB(iArr3, zzWaq))) {
            zzYI2.zzU(8, 977, iArr3);
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

    public static void zzL(int i, int[] iArr) {
        if ((i == 0 || zzYHX.zzE(i, iArr) == 0) && !(iArr[7] == -1 && zzYHX.zzB(iArr, zzWaq))) {
            return;
        }
        zzYI2.zzU(8, 977, iArr);
    }
}
