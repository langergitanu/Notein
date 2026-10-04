package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfPageLayout {
    public static final int ONE_COLUMN = 1;
    public static final int SINGLE_PAGE = 0;
    public static final int TWO_COLUMN_LEFT = 2;
    public static final int TWO_COLUMN_RIGHT = 3;
    public static final int TWO_PAGE_LEFT = 4;
    public static final int TWO_PAGE_RIGHT = 5;
    public static final int length = 6;

    private PdfPageLayout() {
    }

    public static int fromName(String str) {
        if ("SINGLE_PAGE".equals(str)) {
            return 0;
        }
        if ("ONE_COLUMN".equals(str)) {
            return 1;
        }
        if ("TWO_COLUMN_LEFT".equals(str)) {
            return 2;
        }
        if ("TWO_COLUMN_RIGHT".equals(str)) {
            return 3;
        }
        if ("TWO_PAGE_LEFT".equals(str)) {
            return 4;
        }
        if ("TWO_PAGE_RIGHT".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown PdfPageLayout name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown PdfPageLayout value." : "TWO_PAGE_RIGHT" : "TWO_PAGE_LEFT" : "TWO_COLUMN_RIGHT" : "TWO_COLUMN_LEFT" : "ONE_COLUMN" : "SINGLE_PAGE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown PdfPageLayout value." : "TwoPageRight" : "TwoPageLeft" : "TwoColumnRight" : "TwoColumnLeft" : "OneColumn" : "SinglePage";
    }
}
