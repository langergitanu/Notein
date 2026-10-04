package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FootnotePosition {
    public static final int BENEATH_TEXT = 2;
    public static final int BOTTOM_OF_PAGE = 1;
    public static final int length = 2;

    private FootnotePosition() {
    }

    public static int fromName(String str) {
        if ("BOTTOM_OF_PAGE".equals(str)) {
            return 1;
        }
        if ("BENEATH_TEXT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown FootnotePosition name.");
    }

    public static String getName(int i) {
        return i != 1 ? i != 2 ? "Unknown FootnotePosition value." : "BENEATH_TEXT" : "BOTTOM_OF_PAGE";
    }

    public static int[] getValues() {
        return new int[]{1, 2};
    }

    public static String toString(int i) {
        return i != 1 ? i != 2 ? "Unknown FootnotePosition value." : "BeneathText" : "BottomOfPage";
    }
}
