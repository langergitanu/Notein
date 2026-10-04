package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUW {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("allLines", "firstAndLastLine", "firstLineOnly", "lastLineOnly", "none", "top", "center", "baseline", "bottom", "auto", "drop", "margin", "inline", "inside", "outside", "left", "right", "text", "page", "notBeside", "not-beside", "around", "tight", "through", "exact", "atLeast", "at-least", "start", "end", "both", "distribute", "lowKashida", "low-kashida", "mediumKashida", "medium-kashida", "highKashida", "high-kashida", "thaiDistribute", "thai-distribute", "dot", "hyphen", "underscore", "heavy", "middleDot", "middle-dot", "clear", "l", "ctr", "r", "decimal", "dec", "bar", "num", "list");

    public static int zzHA(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 5) {
            return 1;
        }
        if (iZzTP == 6) {
            return 2;
        }
        if (iZzTP == 8) {
            return 3;
        }
        switch (iZzTP) {
            case 12:
                return -1;
            case 13:
                return 4;
            case 14:
                return 5;
            default:
                return 0;
        }
    }

    public static int zzHB(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 10) {
            return iZzTP != 11 ? 0 : 2;
        }
        return 1;
    }

    public static int zzHC(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 5) {
            return 0;
        }
        if (iZzTP == 6) {
            return 1;
        }
        if (iZzTP != 7) {
            return iZzTP != 8 ? 4 : 3;
        }
        return 2;
    }

    public static int zzHD(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 1;
        }
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP != 2) {
            return iZzTP != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int zzHt(String str) {
        switch (zzUR.zzTP(str)) {
            case 39:
                return 1;
            case 40:
                return 2;
            case 41:
                return 3;
            case 42:
                return 4;
            case 43:
            case 44:
                return 5;
            default:
                return 0;
        }
    }

    public static int zzHu(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 9) {
            return iZzTP != 24 ? 0 : 1;
        }
        return 2;
    }

    public static int zzHv(String str) {
        switch (zzUR.zzTP(str)) {
            case 24:
                return 1;
            case 25:
            case 26:
                return 0;
            default:
                return 2;
        }
    }

    public static int zzHw(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 9) {
            return 0;
        }
        switch (iZzTP) {
            case 19:
            case 20:
                return 1;
            case 21:
                return 2;
            case 22:
                return 4;
            case 23:
                return 5;
            default:
                return 3;
        }
    }

    public static int zzHx(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 17) {
            return iZzTP != 18 ? 0 : 1;
        }
        return 2;
    }

    public static int zzHy(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 11) {
            return iZzTP != 18 ? 2 : 1;
        }
        return 0;
    }

    public static int zzHz(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 6) {
            return 2;
        }
        switch (iZzTP) {
            case 13:
                return 4;
            case 14:
                return 5;
            case 15:
                return 1;
            case 16:
                return 3;
            default:
                return 0;
        }
    }

    public static String zzS(int i, boolean z, boolean z2) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? "" : "clear" : z ? "num" : "list" : "bar" : "decimal" : (z && z2) ? "end" : "right" : "center" : (z && z2) ? "start" : "left";
    }

    public static int zzU(String str, zzYO3 zzyo3) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 6) {
            return 1;
        }
        if (iZzTP != 15) {
            if (iZzTP != 16) {
                if (iZzTP == 27) {
                    if (zzyo3 != null) {
                        zzyo3.zzYrc();
                    }
                    return 0;
                }
                if (iZzTP == 28) {
                    if (zzyo3 != null) {
                        zzyo3.zzYrc();
                    }
                    return 2;
                }
                switch (iZzTP) {
                    case 46:
                        break;
                    case 47:
                        return 1;
                    case 48:
                        break;
                    case 49:
                    case 50:
                        return 3;
                    case 51:
                        return 4;
                    case 52:
                    case 53:
                        return 6;
                    default:
                        return 7;
                }
            }
            return 2;
        }
        return 0;
    }

    public static int zzV(String str, zzYO3 zzyo3) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 6) {
            return 1;
        }
        if (iZzTP == 16) {
            return 2;
        }
        switch (iZzTP) {
            case 27:
                zzyo3.zzYrc();
                return 0;
            case 28:
                zzyo3.zzYrc();
                return 2;
            case 29:
                return 3;
            case 30:
                return 4;
            case 31:
            case 32:
                return 8;
            case 33:
            case 34:
                return 5;
            case 35:
            case 36:
                return 7;
            case 37:
            case 38:
                return 9;
            default:
                return 0;
        }
    }

    public static String zzX(int i, boolean z, int i2) {
        boolean z2 = z && i2 == 2;
        switch (i) {
            case 0:
                return z2 ? "start" : "left";
            case 1:
                return "center";
            case 2:
                return z2 ? "end" : "right";
            case 3:
                return "both";
            case 4:
                return "distribute";
            case 5:
                return z ? "mediumKashida" : "medium-kashida";
            case 6:
            default:
                return "";
            case 7:
                return z ? "highKashida" : "high-kashida";
            case 8:
                return z ? "lowKashida" : "low-kashida";
            case 9:
                return z ? "thaiDistribute" : "thai-distribute";
        }
    }

    public static String zzZJ(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : z ? "middleDot" : "middle-dot" : "heavy" : "underscore" : "hyphen" : "dot" : "none";
    }

    public static String zzZK(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "auto" : "exact" : z ? "atLeast" : "at-least";
    }

    public static String zzZL(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "auto" : "exact" : z ? "atLeast" : "at-least";
    }

    public static String zzZM(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "through" : "tight" : "none" : "around" : z ? "notBeside" : "not-beside" : "auto";
    }

    public static String zzta(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "text" : "page" : "margin";
    }

    public static String zztb(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "text" : "page" : "margin";
    }

    public static String zztc(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "outside" : "inside" : "right" : "center" : "left";
    }

    public static String zztd(int i) {
        return i != -1 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "outside" : "inside" : "bottom" : "center" : "top" : "inline";
    }

    public static String zzte(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "margin" : "drop" : "none";
    }

    public static String zztf(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "auto" : "bottom" : "baseline" : "center" : "top";
    }

    public static String zztg(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "lastLineOnly" : "firstLineOnly" : "firstAndLastLine" : "allLines" : "none";
    }
}
