package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextBoxAnchor {
    public static final int BOTTOM = 2;
    public static final int BOTTOM_BASELINE = 7;
    public static final int BOTTOM_CENTERED = 5;
    public static final int BOTTOM_CENTERED_BASELINE = 9;
    public static final int MIDDLE = 1;
    public static final int MIDDLE_CENTERED = 4;
    public static final int TOP = 0;
    public static final int TOP_BASELINE = 6;
    public static final int TOP_CENTERED = 3;
    public static final int TOP_CENTERED_BASELINE = 8;
    public static final int length = 10;

    private TextBoxAnchor() {
    }

    public static int fromName(String str) {
        if ("TOP".equals(str)) {
            return 0;
        }
        if ("MIDDLE".equals(str)) {
            return 1;
        }
        if ("BOTTOM".equals(str)) {
            return 2;
        }
        if ("TOP_CENTERED".equals(str)) {
            return 3;
        }
        if ("MIDDLE_CENTERED".equals(str)) {
            return 4;
        }
        if ("BOTTOM_CENTERED".equals(str)) {
            return 5;
        }
        if ("TOP_BASELINE".equals(str)) {
            return 6;
        }
        if ("BOTTOM_BASELINE".equals(str)) {
            return 7;
        }
        if ("TOP_CENTERED_BASELINE".equals(str)) {
            return 8;
        }
        if ("BOTTOM_CENTERED_BASELINE".equals(str)) {
            return 9;
        }
        throw new IllegalArgumentException("Unknown TextBoxAnchor name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "TOP";
            case 1:
                return "MIDDLE";
            case 2:
                return "BOTTOM";
            case 3:
                return "TOP_CENTERED";
            case 4:
                return "MIDDLE_CENTERED";
            case 5:
                return "BOTTOM_CENTERED";
            case 6:
                return "TOP_BASELINE";
            case 7:
                return "BOTTOM_BASELINE";
            case 8:
                return "TOP_CENTERED_BASELINE";
            case 9:
                return "BOTTOM_CENTERED_BASELINE";
            default:
                return "Unknown TextBoxAnchor value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Top";
            case 1:
                return "Middle";
            case 2:
                return "Bottom";
            case 3:
                return "TopCentered";
            case 4:
                return "MiddleCentered";
            case 5:
                return "BottomCentered";
            case 6:
                return "TopBaseline";
            case 7:
                return "BottomBaseline";
            case 8:
                return "TopCenteredBaseline";
            case 9:
                return "BottomCenteredBaseline";
            default:
                return "Unknown TextBoxAnchor value.";
        }
    }
}
