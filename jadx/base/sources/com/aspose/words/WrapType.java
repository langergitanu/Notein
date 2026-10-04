package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class WrapType {
    public static final int INLINE = 0;
    public static final int NONE = 3;
    public static final int SQUARE = 2;
    public static final int THROUGH = 5;
    public static final int TIGHT = 4;
    public static final int TOP_BOTTOM = 1;
    public static final int length = 6;

    private WrapType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 3;
        }
        if ("INLINE".equals(str)) {
            return 0;
        }
        if ("TOP_BOTTOM".equals(str)) {
            return 1;
        }
        if ("SQUARE".equals(str)) {
            return 2;
        }
        if ("TIGHT".equals(str)) {
            return 4;
        }
        if ("THROUGH".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown WrapType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown WrapType value." : "THROUGH" : "TIGHT" : "NONE" : "SQUARE" : "TOP_BOTTOM" : "INLINE";
    }

    public static int[] getValues() {
        return new int[]{3, 0, 1, 2, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown WrapType value." : "Through" : "Tight" : "None" : "Square" : "TopBottom" : "Inline";
    }
}
