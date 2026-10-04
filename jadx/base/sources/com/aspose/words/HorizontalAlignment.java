package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HorizontalAlignment {
    public static final int CENTER = 2;
    public static final int DEFAULT = 0;
    public static final int INSIDE = 4;
    public static final int LEFT = 1;
    public static final int NONE = 0;
    public static final int OUTSIDE = 5;
    public static final int RIGHT = 3;
    public static final int length = 7;

    private HorizontalAlignment() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str) || "DEFAULT".equals(str)) {
            return 0;
        }
        if ("LEFT".equals(str)) {
            return 1;
        }
        if ("CENTER".equals(str)) {
            return 2;
        }
        if ("RIGHT".equals(str)) {
            return 3;
        }
        if ("INSIDE".equals(str)) {
            return 4;
        }
        if ("OUTSIDE".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown HorizontalAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown HorizontalAlignment value." : "OUTSIDE" : "INSIDE" : "RIGHT" : "CENTER" : "LEFT" : "NONE | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown HorizontalAlignment value." : "Outside" : "Inside" : "Right" : "Center" : "Left" : "None | Default";
    }
}
