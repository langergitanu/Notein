package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextOrientation {
    public static final int DOWNWARD = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ROTATED_FAR_EAST = 4;
    public static final int UPWARD = 3;
    public static final int VERTICAL_FAR_EAST = 5;
    public static final int VERTICAL_ROTATED_FAR_EAST = 7;
    public static final int length = 6;

    private TextOrientation() {
    }

    public static int fromName(String str) {
        if ("HORIZONTAL".equals(str)) {
            return 0;
        }
        if ("DOWNWARD".equals(str)) {
            return 1;
        }
        if ("UPWARD".equals(str)) {
            return 3;
        }
        if ("HORIZONTAL_ROTATED_FAR_EAST".equals(str)) {
            return 4;
        }
        if ("VERTICAL_FAR_EAST".equals(str)) {
            return 5;
        }
        if ("VERTICAL_ROTATED_FAR_EAST".equals(str)) {
            return 7;
        }
        throw new IllegalArgumentException("Unknown TextOrientation name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "Unknown TextOrientation value." : "VERTICAL_ROTATED_FAR_EAST" : "VERTICAL_FAR_EAST" : "HORIZONTAL_ROTATED_FAR_EAST" : "UPWARD" : "DOWNWARD" : "HORIZONTAL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 3, 4, 5, 7};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "Unknown TextOrientation value." : "VerticalRotatedFarEast" : "VerticalFarEast" : "HorizontalRotatedFarEast" : "Upward" : "Downward" : "Horizontal";
    }
}
