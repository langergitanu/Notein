package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PageBorderAppliesTo {
    public static final int ALL_PAGES = 0;
    public static final int FIRST_PAGE = 1;
    public static final int OTHER_PAGES = 2;
    public static final int length = 3;

    private PageBorderAppliesTo() {
    }

    public static int fromName(String str) {
        if ("ALL_PAGES".equals(str)) {
            return 0;
        }
        if ("FIRST_PAGE".equals(str)) {
            return 1;
        }
        if ("OTHER_PAGES".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown PageBorderAppliesTo name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown PageBorderAppliesTo value." : "OTHER_PAGES" : "FIRST_PAGE" : "ALL_PAGES";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown PageBorderAppliesTo value." : "OtherPages" : "FirstPage" : "AllPages";
    }
}
