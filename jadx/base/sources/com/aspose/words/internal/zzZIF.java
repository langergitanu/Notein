package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIF {
    private static int zzPB(int i) throws IOException {
        if (i == 0) {
            return 8;
        }
        if (i == 1 || i == 2) {
            return 16;
        }
        if (i == 3 || i == 4) {
            return 32;
        }
        if (i == 5) {
            return 64;
        }
        throw new IOException(C21532OooOOo.OooO0OO(i, "Unknown data type "));
    }

    public static boolean zzW(zzZJW zzzjw) {
        zzZIA zzziaZze2 = zzzjw.zze2();
        if (!(zzziaZze2 instanceof zzZIP)) {
            return zzZ(zzziaZze2);
        }
        zzZIP zzzip = (zzZIP) zzziaZze2;
        if (zzzip.getPixelStride() != zzzip.zzcN()) {
            return false;
        }
        int[] iArrZzcX = zzzip.zzcX();
        for (int i = 0; i < iArrZzcX.length; i++) {
            if (iArrZzcX[i] != i) {
                return false;
            }
        }
        int[] iArrZzcW = zzzip.zzcW();
        for (int i2 = 0; i2 < iArrZzcX.length; i2++) {
            if (iArrZzcW[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzX(zzZIA zzzia) {
        int[] iArrZzcY = zzzia.zzcY();
        int i = iArrZzcY[0];
        int length = iArrZzcY.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (iArrZzcY[i2] != i) {
                return false;
            }
        }
        return true;
    }

    public static int zzY(zzZIA zzzia) {
        int i = 0;
        for (int i2 : zzzia.zzcY()) {
            i += i2;
        }
        return i;
    }

    public static int zzYJ(int i, int i2) {
        if (i < 0) {
            i += 1 - i2;
        }
        return i / i2;
    }

    public static int zzYK(int i, int i2) {
        if (i < 0) {
            i += 1 - i2;
        }
        return i / i2;
    }

    public static int zzYL(int i, int i2) {
        if (i < 0) {
            i -= i2 - 1;
        }
        return i / i2;
    }

    public static int zzYM(int i, int i2) {
        if (i > 0) {
            i += i2 - 1;
        }
        return i / i2;
    }

    public static boolean zzZ(zzZIA zzzia) {
        return (zzzia instanceof zzZID) && ((zzZID) zzzia).zzZIf == 1 && zzzia.zzcN() == 1 && zzzia.getDataType() == 0;
    }

    public static int zzw(int i, boolean z) {
        if (i <= 8) {
            return 0;
        }
        if (i <= 16) {
            return z ? 2 : 1;
        }
        return 3;
    }

    public static boolean zzW(zzZIA zzzia) throws IOException {
        int iZzPB = zzPB(zzzia.getDataType());
        if (zzzia instanceof zzZIP) {
            int iZzcN = zzzia.zzcN();
            for (int i = 0; i < iZzcN; i++) {
                if (zzzia.zzPD(i) != iZzPB) {
                    return false;
                }
            }
            return true;
        }
        if (zzzia instanceof zzZID) {
            return iZzPB % ((zzZID) zzzia).zzZIf == 0;
        }
        if (!(zzzia instanceof zzZI8)) {
            return false;
        }
        int iZzcN2 = zzzia.zzcN();
        int iZzPD = 0;
        for (int i2 = 0; i2 < iZzcN2; i2++) {
            iZzPD += zzzia.zzPD(i2);
        }
        return iZzPD == iZzPB;
    }

    public static int zzW(int[] iArr, int i) {
        int i2 = (1 << iArr[i]) - 1;
        for (int i3 = i + 1; i3 < iArr.length; i3++) {
            i2 <<= iArr[i3];
        }
        return i2;
    }
}
