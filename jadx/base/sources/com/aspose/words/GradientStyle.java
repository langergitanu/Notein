package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class GradientStyle {
    public static final int DIAGONAL_DOWN = 4;
    public static final int DIAGONAL_UP = 3;
    public static final int FROM_CENTER = 6;
    public static final int FROM_CORNER = 5;
    public static final int HORIZONTAL = 1;
    public static final int NONE = -1;
    public static final int VERTICAL = 2;
    public static final int length = 7;

    private GradientStyle() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return -1;
        }
        if ("HORIZONTAL".equals(str)) {
            return 1;
        }
        if ("VERTICAL".equals(str)) {
            return 2;
        }
        if ("DIAGONAL_UP".equals(str)) {
            return 3;
        }
        if ("DIAGONAL_DOWN".equals(str)) {
            return 4;
        }
        if ("FROM_CORNER".equals(str)) {
            return 5;
        }
        if ("FROM_CENTER".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException("Unknown GradientStyle name.");
    }

    public static String getName(int i) {
        switch (i) {
            case -1:
                return "NONE";
            case 0:
            default:
                return "Unknown GradientStyle value.";
            case 1:
                return "HORIZONTAL";
            case 2:
                return "VERTICAL";
            case 3:
                return "DIAGONAL_UP";
            case 4:
                return "DIAGONAL_DOWN";
            case 5:
                return "FROM_CORNER";
            case 6:
                return "FROM_CENTER";
        }
    }

    public static int[] getValues() {
        return new int[]{-1, 1, 2, 3, 4, 5, 6};
    }

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "None";
            case 0:
            default:
                return "Unknown GradientStyle value.";
            case 1:
                return "Horizontal";
            case 2:
                return "Vertical";
            case 3:
                return "DiagonalUp";
            case 4:
                return "DiagonalDown";
            case 5:
                return "FromCorner";
            case 6:
                return "FromCenter";
        }
    }
}
