package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MarkerSymbol {
    public static final int CIRCLE = 1;
    public static final int DASH = 2;
    public static final int DEFAULT = 0;
    public static final int DIAMOND = 3;
    public static final int DOT = 4;
    public static final int NONE = 5;
    public static final int PICTURE = 6;
    public static final int PLUS = 7;
    public static final int SQUARE = 8;
    public static final int STAR = 9;
    public static final int TRIANGLE = 10;

    /* JADX INFO: renamed from: X */
    public static final int f50776X = 11;
    public static final int length = 12;

    private MarkerSymbol() {
    }

    public static int fromName(String str) {
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        if ("CIRCLE".equals(str)) {
            return 1;
        }
        if ("DASH".equals(str)) {
            return 2;
        }
        if ("DIAMOND".equals(str)) {
            return 3;
        }
        if ("DOT".equals(str)) {
            return 4;
        }
        if ("NONE".equals(str)) {
            return 5;
        }
        if ("PICTURE".equals(str)) {
            return 6;
        }
        if ("PLUS".equals(str)) {
            return 7;
        }
        if ("SQUARE".equals(str)) {
            return 8;
        }
        if ("STAR".equals(str)) {
            return 9;
        }
        if ("TRIANGLE".equals(str)) {
            return 10;
        }
        if ("X".equals(str)) {
            return 11;
        }
        throw new IllegalArgumentException("Unknown MarkerSymbol name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "CIRCLE";
            case 2:
                return "DASH";
            case 3:
                return "DIAMOND";
            case 4:
                return "DOT";
            case 5:
                return "NONE";
            case 6:
                return "PICTURE";
            case 7:
                return "PLUS";
            case 8:
                return "SQUARE";
            case 9:
                return "STAR";
            case 10:
                return "TRIANGLE";
            case 11:
                return "X";
            default:
                return "Unknown MarkerSymbol value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Default";
            case 1:
                return "Circle";
            case 2:
                return "Dash";
            case 3:
                return "Diamond";
            case 4:
                return "Dot";
            case 5:
                return "None";
            case 6:
                return "Picture";
            case 7:
                return "Plus";
            case 8:
                return "Square";
            case 9:
                return "Star";
            case 10:
                return "Triangle";
            case 11:
                return "X";
            default:
                return "Unknown MarkerSymbol value.";
        }
    }
}
