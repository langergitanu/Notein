package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TableAlignment {
    public static final int CENTER = 1;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int length = 3;

    private TableAlignment() {
    }

    public static int fromName(String str) {
        if ("LEFT".equals(str)) {
            return 0;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("RIGHT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown TableAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown TableAlignment value." : "RIGHT" : "CENTER" : "LEFT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown TableAlignment value." : "Right" : "Center" : "Left";
    }
}
