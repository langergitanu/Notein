package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ConditionalStyleType {
    public static final int BOTTOM_LEFT_CELL = 10;
    public static final int BOTTOM_RIGHT_CELL = 11;
    public static final int EVEN_COLUMN_BANDING = 7;
    public static final int EVEN_ROW_BANDING = 6;
    public static final int FIRST_COLUMN = 1;
    public static final int FIRST_ROW = 0;
    public static final int LAST_COLUMN = 3;
    public static final int LAST_ROW = 2;
    public static final int ODD_COLUMN_BANDING = 5;
    public static final int ODD_ROW_BANDING = 4;
    public static final int TOP_LEFT_CELL = 8;
    public static final int TOP_RIGHT_CELL = 9;
    public static final int length = 12;

    private ConditionalStyleType() {
    }

    public static int fromName(String str) {
        if ("FIRST_ROW".equals(str)) {
            return 0;
        }
        if ("FIRST_COLUMN".equals(str)) {
            return 1;
        }
        if ("LAST_ROW".equals(str)) {
            return 2;
        }
        if ("LAST_COLUMN".equals(str)) {
            return 3;
        }
        if ("ODD_ROW_BANDING".equals(str)) {
            return 4;
        }
        if ("ODD_COLUMN_BANDING".equals(str)) {
            return 5;
        }
        if ("EVEN_ROW_BANDING".equals(str)) {
            return 6;
        }
        if ("EVEN_COLUMN_BANDING".equals(str)) {
            return 7;
        }
        if ("TOP_LEFT_CELL".equals(str)) {
            return 8;
        }
        if ("TOP_RIGHT_CELL".equals(str)) {
            return 9;
        }
        if ("BOTTOM_LEFT_CELL".equals(str)) {
            return 10;
        }
        if ("BOTTOM_RIGHT_CELL".equals(str)) {
            return 11;
        }
        throw new IllegalArgumentException("Unknown ConditionalStyleType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "FIRST_ROW";
            case 1:
                return "FIRST_COLUMN";
            case 2:
                return "LAST_ROW";
            case 3:
                return "LAST_COLUMN";
            case 4:
                return "ODD_ROW_BANDING";
            case 5:
                return "ODD_COLUMN_BANDING";
            case 6:
                return "EVEN_ROW_BANDING";
            case 7:
                return "EVEN_COLUMN_BANDING";
            case 8:
                return "TOP_LEFT_CELL";
            case 9:
                return "TOP_RIGHT_CELL";
            case 10:
                return "BOTTOM_LEFT_CELL";
            case 11:
                return "BOTTOM_RIGHT_CELL";
            default:
                return "Unknown ConditionalStyleType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "FirstRow";
            case 1:
                return "FirstColumn";
            case 2:
                return "LastRow";
            case 3:
                return "LastColumn";
            case 4:
                return "OddRowBanding";
            case 5:
                return "OddColumnBanding";
            case 6:
                return "EvenRowBanding";
            case 7:
                return "EvenColumnBanding";
            case 8:
                return "TopLeftCell";
            case 9:
                return "TopRightCell";
            case 10:
                return "BottomLeftCell";
            case 11:
                return "BottomRightCell";
            default:
                return "Unknown ConditionalStyleType value.";
        }
    }
}
