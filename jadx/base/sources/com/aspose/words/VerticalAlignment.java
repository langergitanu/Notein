package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class VerticalAlignment {
    public static final int BOTTOM = 3;
    public static final int CENTER = 2;
    public static final int DEFAULT = 0;
    public static final int INLINE = -1;
    public static final int INSIDE = 4;
    public static final int NONE = 0;
    public static final int OUTSIDE = 5;
    public static final int TOP = 1;
    public static final int length = 8;

    private VerticalAlignment() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("TOP".equals(str)) {
            return 1;
        }
        if ("CENTER".equals(str)) {
            return 2;
        }
        if ("BOTTOM".equals(str)) {
            return 3;
        }
        if ("INSIDE".equals(str)) {
            return 4;
        }
        if ("OUTSIDE".equals(str)) {
            return 5;
        }
        if ("INLINE".equals(str)) {
            return -1;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown VerticalAlignment name.");
    }

    public static String getName(int i) {
        switch (i) {
            case -1:
                return "INLINE";
            case 0:
                return "NONE | DEFAULT";
            case 1:
                return "TOP";
            case 2:
                return "CENTER";
            case 3:
                return "BOTTOM";
            case 4:
                return "INSIDE";
            case 5:
                return "OUTSIDE";
            default:
                return "Unknown VerticalAlignment value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, -1, 0};
    }

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "Inline";
            case 0:
                return "None | Default";
            case 1:
                return "Top";
            case 2:
                return "Center";
            case 3:
                return "Bottom";
            case 4:
                return "Inside";
            case 5:
                return "Outside";
            default:
                return "Unknown VerticalAlignment value.";
        }
    }
}
