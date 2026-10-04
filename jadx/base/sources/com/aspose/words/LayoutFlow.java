package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutFlow {
    public static final int BOTTOM_TO_TOP = 2;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_IDEOGRAPHIC = 4;
    public static final int TOP_TO_BOTTOM = 3;
    public static final int TOP_TO_BOTTOM_IDEOGRAPHIC = 1;
    public static final int VERTICAL = 5;
    public static final int length = 6;

    private LayoutFlow() {
    }

    public static int fromName(String str) {
        if ("HORIZONTAL".equals(str)) {
            return 0;
        }
        if ("TOP_TO_BOTTOM_IDEOGRAPHIC".equals(str)) {
            return 1;
        }
        if ("BOTTOM_TO_TOP".equals(str)) {
            return 2;
        }
        if ("TOP_TO_BOTTOM".equals(str)) {
            return 3;
        }
        if ("HORIZONTAL_IDEOGRAPHIC".equals(str)) {
            return 4;
        }
        if ("VERTICAL".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown LayoutFlow name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown LayoutFlow value." : "VERTICAL" : "HORIZONTAL_IDEOGRAPHIC" : "TOP_TO_BOTTOM" : "BOTTOM_TO_TOP" : "TOP_TO_BOTTOM_IDEOGRAPHIC" : "HORIZONTAL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown LayoutFlow value." : "Vertical" : "HorizontalIdeographic" : "TopToBottom" : "BottomToTop" : "TopToBottomIdeographic" : "Horizontal";
    }
}
