package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EmphasisMark {
    public static final int NONE = 0;
    public static final int OVER_COMMA = 2;
    public static final int OVER_SOLID_CIRCLE = 1;
    public static final int OVER_WHITE_CIRCLE = 3;
    public static final int UNDER_SOLID_CIRCLE = 4;
    public static final int length = 5;

    private EmphasisMark() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("OVER_SOLID_CIRCLE".equals(str)) {
            return 1;
        }
        if ("OVER_COMMA".equals(str)) {
            return 2;
        }
        if ("OVER_WHITE_CIRCLE".equals(str)) {
            return 3;
        }
        if ("UNDER_SOLID_CIRCLE".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown EmphasisMark name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown EmphasisMark value." : "UNDER_SOLID_CIRCLE" : "OVER_WHITE_CIRCLE" : "OVER_COMMA" : "OVER_SOLID_CIRCLE" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown EmphasisMark value." : "UnderSolidCircle" : "OverWhiteCircle" : "OverComma" : "OverSolidCircle" : "None";
    }
}
