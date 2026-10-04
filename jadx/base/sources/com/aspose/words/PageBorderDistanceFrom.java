package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PageBorderDistanceFrom {
    public static final int PAGE_EDGE = 1;
    public static final int TEXT = 0;
    public static final int length = 2;

    private PageBorderDistanceFrom() {
    }

    public static int fromName(String str) {
        if ("TEXT".equals(str)) {
            return 0;
        }
        if ("PAGE_EDGE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown PageBorderDistanceFrom name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown PageBorderDistanceFrom value." : "PAGE_EDGE" : "TEXT";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown PageBorderDistanceFrom value." : "PageEdge" : "Text";
    }
}
