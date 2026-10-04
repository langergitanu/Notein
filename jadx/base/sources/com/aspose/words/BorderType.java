package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class BorderType {
    public static final int BOTTOM = 0;
    public static final int DIAGONAL_DOWN = 6;
    public static final int DIAGONAL_UP = 7;
    public static final int HORIZONTAL = 4;
    public static final int LEFT = 1;
    public static final int NONE = -1;
    public static final int RIGHT = 2;
    public static final int TOP = 3;
    public static final int VERTICAL = 5;
    public static final int length = 9;

    private BorderType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return -1;
        }
        if ("BOTTOM".equals(str)) {
            return 0;
        }
        if ("LEFT".equals(str)) {
            return 1;
        }
        if ("RIGHT".equals(str)) {
            return 2;
        }
        if ("TOP".equals(str)) {
            return 3;
        }
        if ("HORIZONTAL".equals(str)) {
            return 4;
        }
        if ("VERTICAL".equals(str)) {
            return 5;
        }
        if ("DIAGONAL_DOWN".equals(str)) {
            return 6;
        }
        if ("DIAGONAL_UP".equals(str)) {
            return 7;
        }
        throw new IllegalArgumentException("Unknown BorderType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case -1:
                return "NONE";
            case 0:
                return "BOTTOM";
            case 1:
                return "LEFT";
            case 2:
                return "RIGHT";
            case 3:
                return "TOP";
            case 4:
                return "HORIZONTAL";
            case 5:
                return "VERTICAL";
            case 6:
                return "DIAGONAL_DOWN";
            case 7:
                return "DIAGONAL_UP";
            default:
                return "Unknown BorderType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7};
    }

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "None";
            case 0:
                return "Bottom";
            case 1:
                return "Left";
            case 2:
                return "Right";
            case 3:
                return "Top";
            case 4:
                return "Horizontal";
            case 5:
                return "Vertical";
            case 6:
                return "DiagonalDown";
            case 7:
                return "DiagonalUp";
            default:
                return "Unknown BorderType value.";
        }
    }
}
