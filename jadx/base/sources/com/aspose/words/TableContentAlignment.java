package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TableContentAlignment {
    public static final int AUTO = 0;
    public static final int CENTER = 2;
    public static final int LEFT = 1;
    public static final int RIGHT = 3;
    public static final int length = 4;

    private TableContentAlignment() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
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
        throw new IllegalArgumentException("Unknown TableContentAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown TableContentAlignment value." : "RIGHT" : "CENTER" : "LEFT" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown TableContentAlignment value." : "Right" : "Center" : "Left" : "Auto";
    }
}
