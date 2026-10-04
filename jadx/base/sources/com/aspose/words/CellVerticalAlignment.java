package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class CellVerticalAlignment {
    public static final int BOTTOM = 2;
    public static final int CENTER = 1;
    public static final int TOP = 0;
    public static final int length = 3;

    private CellVerticalAlignment() {
    }

    public static int fromName(String str) {
        if ("TOP".equals(str)) {
            return 0;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("BOTTOM".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown CellVerticalAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown CellVerticalAlignment value." : "BOTTOM" : "CENTER" : "TOP";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown CellVerticalAlignment value." : "Bottom" : "Center" : "Top";
    }
}
