package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfCompliance {
    public static final int PDF_17 = 0;
    public static final int PDF_20 = 1;
    public static final int PDF_A_1_A = 2;
    public static final int PDF_A_1_B = 3;
    public static final int PDF_A_2_A = 4;
    public static final int PDF_A_2_U = 5;
    public static final int PDF_A_4 = 6;
    public static final int PDF_UA_1 = 7;
    public static final int length = 8;

    private PdfCompliance() {
    }

    public static int fromName(String str) {
        if ("PDF_17".equals(str)) {
            return 0;
        }
        if ("PDF_20".equals(str)) {
            return 1;
        }
        if ("PDF_A_1_A".equals(str)) {
            return 2;
        }
        if ("PDF_A_1_B".equals(str)) {
            return 3;
        }
        if ("PDF_A_2_A".equals(str)) {
            return 4;
        }
        if ("PDF_A_2_U".equals(str)) {
            return 5;
        }
        if ("PDF_A_4".equals(str)) {
            return 6;
        }
        if ("PDF_UA_1".equals(str)) {
            return 7;
        }
        throw new IllegalArgumentException("Unknown PdfCompliance name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "PDF_17";
            case 1:
                return "PDF_20";
            case 2:
                return "PDF_A_1_A";
            case 3:
                return "PDF_A_1_B";
            case 4:
                return "PDF_A_2_A";
            case 5:
                return "PDF_A_2_U";
            case 6:
                return "PDF_A_4";
            case 7:
                return "PDF_UA_1";
            default:
                return "Unknown PdfCompliance value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Pdf17";
            case 1:
                return "Pdf20";
            case 2:
                return "PdfA1a";
            case 3:
                return "PdfA1b";
            case 4:
                return "PdfA2a";
            case 5:
                return "PdfA2u";
            case 6:
                return "PdfA4";
            case 7:
                return "PdfUa1";
            default:
                return "Unknown PdfCompliance value.";
        }
    }
}
