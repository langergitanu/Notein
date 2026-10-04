package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SdtCalendarType {
    public static final int DEFAULT = 0;
    public static final int GREGORIAN = 0;
    public static final int GREGORIAN_ARABIC = 1;
    public static final int GREGORIAN_ME_FRENCH = 2;
    public static final int GREGORIAN_US = 3;
    public static final int GREGORIAN_XLIT_ENGLISH = 4;
    public static final int GREGORIAN_XLIT_FRENCH = 5;
    public static final int HEBREW = 6;
    public static final int HIJRI = 7;
    public static final int JAPAN = 8;
    public static final int KOREA = 9;
    public static final int NONE = 10;
    public static final int SAKA = 11;
    public static final int TAIWAN = 12;
    public static final int THAI = 13;
    public static final int length = 15;

    private SdtCalendarType() {
    }

    public static int fromName(String str) {
        if ("DEFAULT".equals(str) || "GREGORIAN".equals(str)) {
            return 0;
        }
        if ("GREGORIAN_ARABIC".equals(str)) {
            return 1;
        }
        if ("GREGORIAN_ME_FRENCH".equals(str)) {
            return 2;
        }
        if ("GREGORIAN_US".equals(str)) {
            return 3;
        }
        if ("GREGORIAN_XLIT_ENGLISH".equals(str)) {
            return 4;
        }
        if ("GREGORIAN_XLIT_FRENCH".equals(str)) {
            return 5;
        }
        if ("HEBREW".equals(str)) {
            return 6;
        }
        if ("HIJRI".equals(str)) {
            return 7;
        }
        if ("JAPAN".equals(str)) {
            return 8;
        }
        if ("KOREA".equals(str)) {
            return 9;
        }
        if ("NONE".equals(str)) {
            return 10;
        }
        if ("SAKA".equals(str)) {
            return 11;
        }
        if ("TAIWAN".equals(str)) {
            return 12;
        }
        if ("THAI".equals(str)) {
            return 13;
        }
        throw new IllegalArgumentException("Unknown SdtCalendarType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "DEFAULT | GREGORIAN";
            case 1:
                return "GREGORIAN_ARABIC";
            case 2:
                return "GREGORIAN_ME_FRENCH";
            case 3:
                return "GREGORIAN_US";
            case 4:
                return "GREGORIAN_XLIT_ENGLISH";
            case 5:
                return "GREGORIAN_XLIT_FRENCH";
            case 6:
                return "HEBREW";
            case 7:
                return "HIJRI";
            case 8:
                return "JAPAN";
            case 9:
                return "KOREA";
            case 10:
                return "NONE";
            case 11:
                return "SAKA";
            case 12:
                return "TAIWAN";
            case 13:
                return "THAI";
            default:
                return "Unknown SdtCalendarType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Default | Gregorian";
            case 1:
                return "GregorianArabic";
            case 2:
                return "GregorianMeFrench";
            case 3:
                return "GregorianUs";
            case 4:
                return "GregorianXlitEnglish";
            case 5:
                return "GregorianXlitFrench";
            case 6:
                return "Hebrew";
            case 7:
                return "Hijri";
            case 8:
                return "Japan";
            case 9:
                return "Korea";
            case 10:
                return "None";
            case 11:
                return "Saka";
            case 12:
                return "Taiwan";
            case 13:
                return "Thai";
            default:
                return "Unknown SdtCalendarType value.";
        }
    }
}
