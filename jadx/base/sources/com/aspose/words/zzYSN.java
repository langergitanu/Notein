package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSN {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("near-axis", "near-axis-other-side", "outside-end", "outside-start", "end", "start", "none", "percentage", "value", "value-and-percentage", "cell-range", "constant", "error-margin", "standard-deviation", "standard-error", "variance", "b-spline", "cubic-spline", "side-by-side", "stagger-even", "stagger-odd", "avoid-overlap", "bottom", "bottom-left", "bottom-right", "center", "inside", "left", "near-origin", "outside", "right", "top", "top-left", "top-right", "exponential", "linear", "logarithmic", "power", "columns", "rows", "cone", "cuboid", "cylinder", "pyramid", "square", "diamond", "arrow-down", "arrow-up", "arrow-right", "arrow-left", "bow-tie", "hourglass", "circle", "star", "x", "plus", "asterisk", "horizontal-bar", "vertical-bar", "automatic", "named-symbol", "image", "at-labels", "at-axis", "at-labels-and-axis", "ignore", "leave-gap", "use-zero");

    public static int zzG0(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 66) {
            return iZzTP != 67 ? 0 : 2;
        }
        return 1;
    }

    public static int zzG1(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 62) {
            return iZzTP != 63 ? 0 : 2;
        }
        return 1;
    }

    public static int zzG2(String str) {
        switch (zzUR.zzTP(str)) {
            case 59:
                return 1;
            case 60:
                return 2;
            case 61:
                return 3;
            default:
                return 0;
        }
    }

    public static int zzG3(String str) {
        switch (zzUR.zzTP(str)) {
            case 44:
                return 1;
            case 45:
                return 2;
            case 46:
                return 3;
            case 47:
                return 4;
            case 48:
                return 5;
            case 49:
                return 6;
            case 50:
                return 7;
            case 51:
                return 8;
            case 52:
                return 9;
            case 53:
                return 10;
            case 54:
                return 11;
            case 55:
                return 12;
            case 56:
                return 13;
            case 57:
                return 14;
            case 58:
                return 15;
            default:
                return 0;
        }
    }

    public static int zzG4(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 40) {
            return 1;
        }
        if (iZzTP != 42) {
            return iZzTP != 43 ? 0 : 3;
        }
        return 2;
    }

    public static int zzG5(String str) {
        return zzUR.zzTP(str) != 39 ? 0 : 1;
    }

    public static int zzG6(String str) {
        switch (zzUR.zzTP(str)) {
            case 34:
                return 1;
            case 35:
                return 2;
            case 36:
                return 3;
            case 37:
                return 4;
            default:
                return 0;
        }
    }

    public static int zzG7(String str) {
        switch (zzUR.zzTP(str)) {
            case 21:
                return 1;
            case 22:
                return 7;
            case 23:
                return 8;
            case 24:
                return 6;
            case 25:
                return 2;
            case 26:
                return 11;
            case 27:
                return 9;
            case 28:
                return 13;
            case 29:
            default:
                return 12;
            case 30:
                return 5;
            case 31:
                return 3;
            case 32:
                return 10;
            case 33:
                return 4;
        }
    }

    public static int zzG8(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 19) {
            return iZzTP != 20 ? 0 : 2;
        }
        return 1;
    }

    public static int zzG9(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 16) {
            return iZzTP != 17 ? 0 : 2;
        }
        return 1;
    }

    public static int zzGa(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 7) {
            return 4;
        }
        switch (iZzTP) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 12:
                return 3;
            case 13:
                return 5;
            case 14:
                return 6;
            case 15:
                return 7;
            default:
                return 0;
        }
    }

    public static int zzGb(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 7) {
            return 1;
        }
        if (iZzTP != 8) {
            return iZzTP != 9 ? 0 : 3;
        }
        return 2;
    }

    public static double zzGc(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 4) {
            return Double.MAX_VALUE;
        }
        if (iZzTP != 5) {
            return com.aspose.words.internal.zzJB.parseDouble(str);
        }
        return -1.7976931348623157E308d;
    }

    public static int zzGd(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 1;
        if (iZzTP != 1) {
            i = 2;
            if (iZzTP != 2) {
                i = 3;
                if (iZzTP != 3) {
                    return 0;
                }
            }
        }
        return i;
    }
}
