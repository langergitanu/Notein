package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUB {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "start", "center", "right", "end", "auto", "exact", "atLeast", "at-least", "continue", "restart", "top", "bottom");

    public static int zzH0(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 2) {
            return iZzTP != 12 ? 0 : 2;
        }
        return 1;
    }

    public static int zzH1(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 9) {
            return iZzTP != 10 ? 0 : 1;
        }
        return 2;
    }

    public static int zzHv(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 6) {
            return (iZzTP == 7 || iZzTP == 8) ? 0 : 2;
        }
        return 1;
    }

    public static int zzT(String str, zzYO3 zzyo3) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            zzyo3.zzYrc();
            return 0;
        }
        if (iZzTP == 2) {
            return 1;
        }
        if (iZzTP != 3) {
            if (iZzTP != 4) {
                return 0;
            }
            zzyo3.zzYrc();
        }
        return 2;
    }

    public static String zzW(int i, boolean z, int i2) {
        boolean z2 = z && i2 == 2;
        return i != 0 ? i != 1 ? i != 2 ? "" : z2 ? "end" : "right" : "center" : z2 ? "start" : "left";
    }

    public static String zzZL(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "auto" : "exact" : z ? "atLeast" : "at-least";
    }

    public static String zzsY(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "bottom" : "center" : "top";
    }

    public static String zzsZ(int i) {
        return i != 1 ? i != 2 ? "" : "continue" : "restart";
    }
}
