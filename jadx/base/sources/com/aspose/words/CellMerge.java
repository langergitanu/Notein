package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class CellMerge {
    public static final int FIRST = 1;
    public static final int NONE = 0;
    public static final int PREVIOUS = 2;
    public static final int length = 3;

    private CellMerge() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("FIRST".equals(str)) {
            return 1;
        }
        if ("PREVIOUS".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown CellMerge name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown CellMerge value." : "PREVIOUS" : "FIRST" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown CellMerge value." : "Previous" : "First" : "None";
    }
}
