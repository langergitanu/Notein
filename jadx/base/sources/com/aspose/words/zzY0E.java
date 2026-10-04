package com.aspose.words;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0E {
    private static int[] zzWU8 = {ViewCompat.MEASURED_STATE_MASK, 0, WarningType.MINOR_FORMATTING_LOSS_CATEGORY, 16776960, 65280, 16711935, 255, 65535, 16777215, 8388608, 8421376, 32768, 8388736, 128, 32896, 8421504, 12632256};

    private static double zzUY(int i, int i2) {
        int i3 = i & 255;
        int i4 = (i & 65280) >> 8;
        int i5 = (i & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16;
        int i6 = i2 & 255;
        int i7 = (65280 & i2) >> 8;
        int i8 = (i2 & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16;
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(com.aspose.words.internal.zzPV.zzS(i3, i4, i5));
        com.aspose.words.internal.zzIP zzip2 = new com.aspose.words.internal.zzIP(com.aspose.words.internal.zzPV.zzS(i6, i7, i8));
        double dAbs = Math.abs(zzip.zzGu() - zzip2.zzGu()) + Math.abs(zzip.zzGv() - zzip2.zzGv());
        return (zzZU(i3, i4, i5) || zzZU(i6, i7, i8)) ? dAbs : Math.abs(zzip.zzGw() - zzip2.zzGw()) + dAbs;
    }

    public static int zzZC(com.aspose.words.internal.zzPV zzpv) {
        if (zzpv.isEmpty()) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        return (zzpv.zzPA() << 16) | zzpv.zzPC() | (zzpv.zzPB() << 8);
    }

    public static int zzZD(com.aspose.words.internal.zzPV zzpv) {
        return ((~zzpv.zzPD()) << 24) | zzpv.zzPC() | (zzpv.zzPB() << 8) | (zzpv.zzPA() << 16);
    }

    public static int zzZE(com.aspose.words.internal.zzPV zzpv) {
        return zzhK(zzZD(zzpv));
    }

    private static boolean zzZU(int i, int i2, int i3) {
        return i == i2 && i2 == i3;
    }

    public static int zzhG(int i) {
        if (i >= 0 && i < 256) {
            return ((i | 4096) << 16) | 756;
        }
        if (i >= 0 || i <= -256) {
            return 0;
        }
        return (((-i) | 4096) << 16) | 500;
    }

    public static int zzhH(int i) {
        if ((i >> 24) == 16 && (((byte) i) & 255) == 244) {
            return ((short) i) == 756 ? (i >> 16) & 255 : -((i >> 16) & 255);
        }
        return 0;
    }

    public static com.aspose.words.internal.zzPV zzhI(int i) {
        return new com.aspose.words.internal.zzPV((~((i >> 24) & 255)) & 255, i & 255, (i >> 8) & 255, (i >> 16) & 255);
    }

    private static int zzhJ(int i) {
        int[] iArr = zzWU8;
        return i < iArr.length ? iArr[i] : ViewCompat.MEASURED_STATE_MASK;
    }

    private static int zzhK(int i) {
        int i2 = 0;
        if (i == -16777216) {
            return 0;
        }
        int i3 = 1;
        double d = Double.MAX_VALUE;
        while (true) {
            int[] iArr = zzWU8;
            if (i2 >= iArr.length) {
                return i3;
            }
            double dZzUY = zzUY(iArr[i2], i);
            if (dZzUY <= d) {
                i3 = i2;
                d = dZzUY;
            }
            i2++;
        }
    }

    public static com.aspose.words.internal.zzPV zzhL(int i) {
        return zzhI(zzhJ(i));
    }
}
