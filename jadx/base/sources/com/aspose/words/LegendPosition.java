package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class LegendPosition {
    public static final int BOTTOM = 1;
    public static final int LEFT = 2;
    public static final int NONE = 0;
    public static final int RIGHT = 3;
    public static final int TOP = 4;
    public static final int TOP_RIGHT = 5;
    public static final int length = 6;

    private LegendPosition() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("BOTTOM".equals(str)) {
            return 1;
        }
        if ("LEFT".equals(str)) {
            return 2;
        }
        if ("RIGHT".equals(str)) {
            return 3;
        }
        if ("TOP".equals(str)) {
            return 4;
        }
        if ("TOP_RIGHT".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown LegendPosition name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown LegendPosition value." : "TOP_RIGHT" : "TOP" : "RIGHT" : "LEFT" : "BOTTOM" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown LegendPosition value." : "TopRight" : "Top" : "Right" : "Left" : "Bottom" : "None";
    }
}
