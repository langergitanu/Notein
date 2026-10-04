package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisTickMark {
    public static final int CROSS = 0;
    public static final int INSIDE = 1;
    public static final int NONE = 3;
    public static final int OUTSIDE = 2;
    public static final int length = 4;

    private AxisTickMark() {
    }

    public static int fromName(String str) {
        if ("CROSS".equals(str)) {
            return 0;
        }
        if ("INSIDE".equals(str)) {
            return 1;
        }
        if ("OUTSIDE".equals(str)) {
            return 2;
        }
        if ("NONE".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown AxisTickMark name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisTickMark value." : "NONE" : "OUTSIDE" : "INSIDE" : "CROSS";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisTickMark value." : "None" : "Outside" : "Inside" : "Cross";
    }
}
