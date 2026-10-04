package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SectionStart {
    public static final int CONTINUOUS = 0;
    public static final int EVEN_PAGE = 3;
    public static final int NEW_COLUMN = 1;
    public static final int NEW_PAGE = 2;
    public static final int ODD_PAGE = 4;
    public static final int length = 5;

    private SectionStart() {
    }

    public static int fromName(String str) {
        if ("CONTINUOUS".equals(str)) {
            return 0;
        }
        if ("NEW_COLUMN".equals(str)) {
            return 1;
        }
        if ("NEW_PAGE".equals(str)) {
            return 2;
        }
        if ("EVEN_PAGE".equals(str)) {
            return 3;
        }
        if ("ODD_PAGE".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown SectionStart name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown SectionStart value." : "ODD_PAGE" : "EVEN_PAGE" : "NEW_PAGE" : "NEW_COLUMN" : "CONTINUOUS";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown SectionStart value." : "OddPage" : "EvenPage" : "NewPage" : "NewColumn" : "Continuous";
    }
}
