package com.aspose.words.internal;

import androidx.core.app.FrameMetricsAggregator;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYK7 {
    static final int[] zzWaq = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, FrameMetricsAggregator.EVERY_DURATION};

    public static int[] zzE(BigInteger bigInteger) {
        int[] iArrZzV = zzYI2.zzV(521, bigInteger);
        if (zzYI2.zzV(17, iArrZzV, zzWaq)) {
            zzYI2.zzF(17, iArrZzV);
        }
        return iArrZzV;
    }

    private static void zzI(int[] iArr, int[] iArr2) {
        zzYHT.zzK(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = (i * i) + zzYI2.zzS(i << 1, iArr, iArr2);
    }

    public static void zzJ(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (zzYI2.zzZ(16, iArr, i << 23, iArr2) | (i << 1)) & FrameMetricsAggregator.EVERY_DURATION;
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        zzI(iArr, iArr3);
        zzL(iArr3, iArr2);
    }

    private static void zzL(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int iZzW = zzYI2.zzW(16, iArr, iArr2) + (zzYI2.zzW(iArr, i, iArr2) >>> 23) + (i >>> 9);
        if (iZzW > 511 || (iZzW == 511 && zzYI2.zzV(16, iArr2, zzWaq))) {
            iZzW = (zzYI2.zzZE(iArr2) + iZzW) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr2[16] = iZzW;
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        if (zzYI2.zzH(17, iArr)) {
            zzYI2.zzF(17, iArr2);
        } else {
            zzYI2.zzX(17, zzWaq, iArr, iArr2);
        }
    }

    public static void zzN(int[] iArr, int[] iArr2) {
        int iZzT = zzYI2.zzT(16, iArr, iArr2) + iArr[16];
        if (iZzT > 511 || (iZzT == 511 && zzYI2.zzV(16, iArr2, zzWaq))) {
            iZzT = (zzYI2.zzZE(iArr2) + iZzT) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr2[16] = iZzT;
    }

    private static void zzS(int[] iArr, int[] iArr2, int[] iArr3) {
        zzYHT.zzR(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = (i * i2) + zzYI2.zzZ(i, iArr2, i2, iArr, iArr3);
    }

    public static void zzV(int[] iArr, int[] iArr2, int[] iArr3) {
        int iZzX = (zzYI2.zzX(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iZzX < 0) {
            iZzX = (zzYI2.zzZF(iArr3) + iZzX) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = iZzX;
    }

    public static void zzX(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[33];
        zzS(iArr, iArr2, iArr4);
        zzL(iArr4, iArr3);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        int iZzZ = zzYI2.zzZ(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iZzZ > 511 || (iZzZ == 511 && zzYI2.zzV(16, iArr3, zzWaq))) {
            iZzZ = (zzYI2.zzZE(iArr3) + iZzZ) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = iZzZ;
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[33];
        zzI(iArr, iArr3);
        zzL(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzI(iArr2, iArr3);
            zzL(iArr3, iArr2);
        }
    }

    public static void zzZP(int[] iArr) {
        int i = iArr[16];
        int iZzT = zzYI2.zzT(16, i >>> 9, iArr) + (i & FrameMetricsAggregator.EVERY_DURATION);
        if (iZzT > 511 || (iZzT == 511 && zzYI2.zzV(16, iArr, zzWaq))) {
            iZzT = (zzYI2.zzZE(iArr) + iZzT) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr[16] = iZzT;
    }
}
