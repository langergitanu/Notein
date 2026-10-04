package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUL {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("continuous", "eachSect", "each-sect", "eachPage", "each-page", "linesAndChars", "lines-and-chars", "lines", "snapToChars", "snap-to-chars", "even", "first", "pageBottom", "page-bottom", "beneathText", "beneath-text", "sectEnd", "sect-end", "docEnd", "doc-end", "top", "center", "both", "bottom", "hyphen", "period", "colon", "emDash", "em-dash", "enDash", "en-dash", "newPage", "new-page", "newSection", "new-section", "page", "text", "allPages", "all-pages", "firstPage", "first-page", "notFirstPage", "not-first-page", "landscape", "portrait", "evenPage", "even-page", "nextColumn", "next-column", "nextPage", "next-page", "oddPage", "odd-page");

    public static int zzH3(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 0;
        }
        if (iZzTP == 51 || iZzTP == 52) {
            return 4;
        }
        switch (iZzTP) {
            case 45:
            case 46:
                return 3;
            case 47:
            case 48:
                return 1;
            default:
                return 2;
        }
    }

    public static int zzH4(String str) {
        return zzUR.zzTP(str) != 43 ? 1 : 2;
    }

    public static int zzH5(String str) {
        switch (zzUR.zzTP(str)) {
            case 39:
            case 40:
                return 1;
            case 41:
            case 42:
                return 2;
            default:
                return 0;
        }
    }

    public static int zzH6(String str) {
        return zzUR.zzTP(str) != 36 ? 1 : 0;
    }

    public static int zzH7(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return (iZzTP == 33 || iZzTP == 34) ? 1 : 0;
        }
        return 2;
    }

    public static int zzH8(String str) {
        switch (zzUR.zzTP(str)) {
            case 25:
                return 1;
            case 26:
                return 2;
            case 27:
            case 28:
                return 3;
            case 29:
            case 30:
                return 4;
            default:
                return 0;
        }
    }

    public static int zzH9(String str) {
        switch (zzUR.zzTP(str)) {
            case 21:
                return 1;
            case 22:
                return 2;
            case 23:
                return 3;
            default:
                return 0;
        }
    }

    public static int zzHa(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 16 || iZzTP == 17) ? 0 : 3;
    }

    public static int zzHb(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 14 || iZzTP == 15) ? 2 : 1;
    }

    public static int zzHc(String str) {
        switch (zzUR.zzTP(str)) {
            case 5:
            case 6:
                return 1;
            case 7:
                return 2;
            case 8:
            case 9:
                return 3;
            default:
                return 0;
        }
    }

    public static int zzHd(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1 || iZzTP == 2) {
            return 1;
        }
        return (iZzTP == 3 || iZzTP == 4) ? 2 : 0;
    }

    public static String zzZA(int i, boolean z) {
        return i != 1 ? i != 2 ? "" : z ? "beneathText" : "beneath-text" : z ? "pageBottom" : "page-bottom";
    }

    public static String zzZB(int i, boolean z) {
        if (i == 0) {
            return "even";
        }
        if (i != 1) {
            if (i == 2) {
                return "even";
            }
            if (i != 3) {
                if (i == 4 || i == 5) {
                    return "first";
                }
                throw new IllegalStateException("Unknown header footer type.");
            }
        }
        return z ? "default" : "odd";
    }

    public static String zzZC(int i, boolean z) {
        return i != 1 ? i != 2 ? i != 3 ? "" : z ? "snapToChars" : "snap-to-chars" : "lines" : z ? "linesAndChars" : "lines-and-chars";
    }

    public static String zzZD(int i, boolean z) {
        return i == 0 ? "" : i != 0 ? i != 1 ? i != 2 ? "" : z ? "eachPage" : "each-page" : z ? "eachSect" : "each-sect" : "continuous";
    }

    public static String zzZv(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : z ? "oddPage" : "odd-page" : z ? "evenPage" : "even-page" : z ? "nextPage" : "next-page" : z ? "nextColumn" : "next-column" : "continuous";
    }

    public static String zzZw(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? "" : z ? "notFirstPage" : "not-first-page" : z ? "firstPage" : "first-page" : z ? "allPages" : "all-pages";
    }

    public static String zzZx(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "continuous" : z ? "newSection" : "new-section" : z ? "newPage" : "new-page";
    }

    public static String zzZy(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : z ? "enDash" : "en-dash" : z ? "emDash" : "em-dash" : "colon" : "period" : "hyphen";
    }

    public static String zzZz(int i, boolean z) {
        return i != 0 ? i != 3 ? "" : z ? "docEnd" : "doc-end" : z ? "sectEnd" : "sect-end";
    }

    public static int zzf(String str, boolean z) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP != 10 ? iZzTP != 11 ? z ? 1 : 3 : z ? 4 : 5 : z ? 0 : 2;
    }

    public static String zzt1(int i) {
        return i != 1 ? i != 2 ? "" : "landscape" : "portrait";
    }

    public static String zzt2(int i) {
        return i != 0 ? i != 1 ? "" : "page" : "text";
    }

    public static String zzt3(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "bottom" : "both" : "center" : "top";
    }
}
