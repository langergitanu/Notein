package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PageVerticalAlignment {
    public static final int BOTTOM = 3;
    public static final int CENTER = 1;
    public static final int JUSTIFY = 2;
    public static final int TOP = 0;
    public static final int length = 4;

    private PageVerticalAlignment() {
    }

    public static int fromName(String str) {
        if ("BOTTOM".equals(str)) {
            return 3;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("JUSTIFY".equals(str)) {
            return 2;
        }
        if ("TOP".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown PageVerticalAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown PageVerticalAlignment value." : "BOTTOM" : "JUSTIFY" : "CENTER" : "TOP";
    }

    public static int[] getValues() {
        return new int[]{3, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown PageVerticalAlignment value." : "Bottom" : "Justify" : "Center" : "Top";
    }
}
