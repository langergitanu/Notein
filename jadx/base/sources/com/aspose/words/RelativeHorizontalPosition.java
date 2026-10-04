package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RelativeHorizontalPosition {
    public static final int CHARACTER = 3;
    public static final int COLUMN = 2;
    public static final int DEFAULT = 2;
    public static final int INSIDE_MARGIN = 6;
    public static final int LEFT_MARGIN = 4;
    public static final int MARGIN = 0;
    public static final int OUTSIDE_MARGIN = 7;
    public static final int PAGE = 1;
    public static final int RIGHT_MARGIN = 5;
    public static final int length = 9;

    private RelativeHorizontalPosition() {
    }

    public static int fromName(String str) {
        if ("MARGIN".equals(str)) {
            return 0;
        }
        if ("PAGE".equals(str)) {
            return 1;
        }
        if ("COLUMN".equals(str)) {
            return 2;
        }
        if ("CHARACTER".equals(str)) {
            return 3;
        }
        if ("LEFT_MARGIN".equals(str)) {
            return 4;
        }
        if ("RIGHT_MARGIN".equals(str)) {
            return 5;
        }
        if ("INSIDE_MARGIN".equals(str)) {
            return 6;
        }
        if ("OUTSIDE_MARGIN".equals(str)) {
            return 7;
        }
        if ("DEFAULT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown RelativeHorizontalPosition name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "MARGIN";
            case 1:
                return "PAGE";
            case 2:
                return "COLUMN | DEFAULT";
            case 3:
                return "CHARACTER";
            case 4:
                return "LEFT_MARGIN";
            case 5:
                return "RIGHT_MARGIN";
            case 6:
                return "INSIDE_MARGIN";
            case 7:
                return "OUTSIDE_MARGIN";
            default:
                return "Unknown RelativeHorizontalPosition value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 2};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Margin";
            case 1:
                return "Page";
            case 2:
                return "Column | Default";
            case 3:
                return "Character";
            case 4:
                return "LeftMargin";
            case 5:
                return "RightMargin";
            case 6:
                return "InsideMargin";
            case 7:
                return "OutsideMargin";
            default:
                return "Unknown RelativeHorizontalPosition value.";
        }
    }
}
