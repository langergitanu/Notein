package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class WrapSide {
    public static final int BOTH = 0;
    public static final int DEFAULT = 0;
    public static final int LARGEST = 3;
    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    public static final int length = 5;

    private WrapSide() {
    }

    public static int fromName(String str) {
        if ("BOTH".equals(str)) {
            return 0;
        }
        if ("LEFT".equals(str)) {
            return 1;
        }
        if ("RIGHT".equals(str)) {
            return 2;
        }
        if ("LARGEST".equals(str)) {
            return 3;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown WrapSide name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown WrapSide value." : "LARGEST" : "RIGHT" : "LEFT" : "BOTH | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown WrapSide value." : "Largest" : "Right" : "Left" : "Both | Default";
    }
}
