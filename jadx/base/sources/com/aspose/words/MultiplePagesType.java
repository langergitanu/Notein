package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MultiplePagesType {
    public static final int BOOK_FOLD_PRINTING = 3;
    public static final int BOOK_FOLD_PRINTING_REVERSE = 4;
    public static final int DEFAULT = 0;
    public static final int MIRROR_MARGINS = 1;
    public static final int NORMAL = 0;
    public static final int TWO_PAGES_PER_SHEET = 2;
    public static final int length = 6;

    private MultiplePagesType() {
    }

    public static int fromName(String str) {
        if ("NORMAL".equals(str)) {
            return 0;
        }
        if ("MIRROR_MARGINS".equals(str)) {
            return 1;
        }
        if ("TWO_PAGES_PER_SHEET".equals(str)) {
            return 2;
        }
        if ("BOOK_FOLD_PRINTING".equals(str)) {
            return 3;
        }
        if ("BOOK_FOLD_PRINTING_REVERSE".equals(str)) {
            return 4;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown MultiplePagesType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown MultiplePagesType value." : "BOOK_FOLD_PRINTING_REVERSE" : "BOOK_FOLD_PRINTING" : "TWO_PAGES_PER_SHEET" : "MIRROR_MARGINS" : "NORMAL | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown MultiplePagesType value." : "BookFoldPrintingReverse" : "BookFoldPrinting" : "TwoPagesPerSheet" : "MirrorMargins" : "Normal | Default";
    }
}
