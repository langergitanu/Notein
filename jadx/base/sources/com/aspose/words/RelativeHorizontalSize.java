package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RelativeHorizontalSize {
    public static final int DEFAULT = 1;
    public static final int INNER_MARGIN = 4;
    public static final int LEFT_MARGIN = 2;
    public static final int MARGIN = 0;
    public static final int OUTER_MARGIN = 5;
    public static final int PAGE = 1;
    public static final int RIGHT_MARGIN = 3;
    public static final int length = 7;

    private RelativeHorizontalSize() {
    }

    public static int fromName(String str) {
        if ("MARGIN".equals(str)) {
            return 0;
        }
        if ("PAGE".equals(str)) {
            return 1;
        }
        if ("LEFT_MARGIN".equals(str)) {
            return 2;
        }
        if ("RIGHT_MARGIN".equals(str)) {
            return 3;
        }
        if ("INNER_MARGIN".equals(str)) {
            return 4;
        }
        if ("OUTER_MARGIN".equals(str)) {
            return 5;
        }
        if ("DEFAULT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown RelativeHorizontalSize name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown RelativeHorizontalSize value." : "OUTER_MARGIN" : "INNER_MARGIN" : "RIGHT_MARGIN" : "LEFT_MARGIN" : "PAGE | DEFAULT" : "MARGIN";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown RelativeHorizontalSize value." : "OuterMargin" : "InnerMargin" : "RightMargin" : "LeftMargin" : "Page | Default" : "Margin";
    }
}
