package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HeaderFooterType {
    public static final int FOOTER_EVEN = 2;
    public static final int FOOTER_FIRST = 5;
    public static final int FOOTER_PRIMARY = 3;
    public static final int HEADER_EVEN = 0;
    public static final int HEADER_FIRST = 4;
    public static final int HEADER_PRIMARY = 1;
    public static final int length = 6;

    private HeaderFooterType() {
    }

    public static int fromName(String str) {
        if ("HEADER_EVEN".equals(str)) {
            return 0;
        }
        if ("HEADER_PRIMARY".equals(str)) {
            return 1;
        }
        if ("FOOTER_EVEN".equals(str)) {
            return 2;
        }
        if ("FOOTER_PRIMARY".equals(str)) {
            return 3;
        }
        if ("HEADER_FIRST".equals(str)) {
            return 4;
        }
        if ("FOOTER_FIRST".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown HeaderFooterType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown HeaderFooterType value." : "FOOTER_FIRST" : "HEADER_FIRST" : "FOOTER_PRIMARY" : "FOOTER_EVEN" : "HEADER_PRIMARY" : "HEADER_EVEN";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown HeaderFooterType value." : "FooterFirst" : "HeaderFirst" : "FooterPrimary" : "FooterEven" : "HeaderPrimary" : "HeaderEven";
    }
}
