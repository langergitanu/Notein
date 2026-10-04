package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RelativeVerticalPosition {
    public static final int BOTTOM_MARGIN = 5;
    public static final int INSIDE_MARGIN = 6;
    public static final int LINE = 3;
    public static final int MARGIN = 0;
    public static final int OUTSIDE_MARGIN = 7;
    public static final int PAGE = 1;
    public static final int PARAGRAPH = 2;
    public static final int TABLE_DEFAULT = 0;
    public static final int TEXT_FRAME_DEFAULT = 2;
    public static final int TOP_MARGIN = 4;
    public static final int length = 10;

    private RelativeVerticalPosition() {
    }

    public static int fromName(String str) {
        if ("MARGIN".equals(str)) {
            return 0;
        }
        if ("PAGE".equals(str)) {
            return 1;
        }
        if ("PARAGRAPH".equals(str)) {
            return 2;
        }
        if ("LINE".equals(str)) {
            return 3;
        }
        if ("TOP_MARGIN".equals(str)) {
            return 4;
        }
        if ("BOTTOM_MARGIN".equals(str)) {
            return 5;
        }
        if ("INSIDE_MARGIN".equals(str)) {
            return 6;
        }
        if ("OUTSIDE_MARGIN".equals(str)) {
            return 7;
        }
        if ("TABLE_DEFAULT".equals(str)) {
            return 0;
        }
        if ("TEXT_FRAME_DEFAULT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown RelativeVerticalPosition name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "MARGIN | TABLE_DEFAULT";
            case 1:
                return "PAGE";
            case 2:
                return "PARAGRAPH | TEXT_FRAME_DEFAULT";
            case 3:
                return "LINE";
            case 4:
                return "TOP_MARGIN";
            case 5:
                return "BOTTOM_MARGIN";
            case 6:
                return "INSIDE_MARGIN";
            case 7:
                return "OUTSIDE_MARGIN";
            default:
                return "Unknown RelativeVerticalPosition value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0, 2};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Margin | TableDefault";
            case 1:
                return "Page";
            case 2:
                return "Paragraph | TextFrameDefault";
            case 3:
                return "Line";
            case 4:
                return "TopMargin";
            case 5:
                return "BottomMargin";
            case 6:
                return "InsideMargin";
            case 7:
                return "OutsideMargin";
            default:
                return "Unknown RelativeVerticalPosition value.";
        }
    }
}
