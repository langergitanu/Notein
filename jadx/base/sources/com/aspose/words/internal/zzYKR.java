package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKR {
    static final int[] zzWaq = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bl */
    static final int[] f51068bl = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: bm */
    private static final int[] f51069bm = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzE = zzYHY.zzE(bigInteger);
        if (iArrZzE[6] == -1 && zzYHY.zzB(iArrZzE, zzWaq)) {
            zzYI2.zzU(7, 6803, iArrZzE);
        }
        return iArrZzE;
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        if (zzYI2.zzZ(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && zzYHY.zzB(iArr2, zzWaq))) {
            zzYI2.zzU(7, 6803, iArr2);
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        zzYHY.zzK(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    public static void zzL(int[] iArr, int[] iArr2) {
        if (zzYHY.zzZ(zzYHY.zzI(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[6] == -1 && zzYHY.zzB(iArr2, zzWaq))) {
            zzYI2.zzU(7, 6803, iArr2);
        }
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
            zzYI2.zzU(7, 6803, iArr2);
        }
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHY.zzJ(iArr, iArr2, iArr3) != 0) {
            zzYI2.zzS(7, 6803, iArr3);
        }
    }

    public static void zzW(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zzYHY.zzK(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && zzYI2.zzU(14, iArr3, f51068bl))) {
            int[] iArr4 = f51069bm;
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
            zzYI2.zzU(7, 6803, iArr3);
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

    public static void zzL(int i, int[] iArr) {
        if ((i == 0 || zzYHY.zzE(i, iArr) == 0) && !(iArr[6] == -1 && zzYHY.zzB(iArr, zzWaq))) {
            return;
        }
        zzYI2.zzU(7, 6803, iArr);
    }
}
