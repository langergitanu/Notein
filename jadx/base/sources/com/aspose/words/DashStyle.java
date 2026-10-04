package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class DashStyle {
    public static final int DASH = 6;
    public static final int DASH_DOT = 8;
    public static final int DEFAULT = 0;
    public static final int DOT = 5;
    public static final int LONG_DASH = 7;
    public static final int LONG_DASH_DOT = 9;
    public static final int LONG_DASH_DOT_DOT = 10;
    public static final int SHORT_DASH = 1;
    public static final int SHORT_DASH_DOT = 3;
    public static final int SHORT_DASH_DOT_DOT = 4;
    public static final int SHORT_DOT = 2;
    public static final int SOLID = 0;
    public static final int length = 12;

    private DashStyle() {
    }

    public static int fromName(String str) {
        if ("SOLID".equals(str)) {
            return 0;
        }
        if ("SHORT_DASH".equals(str)) {
            return 1;
        }
        if ("SHORT_DOT".equals(str)) {
            return 2;
        }
        if ("SHORT_DASH_DOT".equals(str)) {
            return 3;
        }
        if ("SHORT_DASH_DOT_DOT".equals(str)) {
            return 4;
        }
        if ("DOT".equals(str)) {
            return 5;
        }
        if ("DASH".equals(str)) {
            return 6;
        }
        if ("LONG_DASH".equals(str)) {
            return 7;
        }
        if ("DASH_DOT".equals(str)) {
            return 8;
        }
        if ("LONG_DASH_DOT".equals(str)) {
            return 9;
        }
        if ("LONG_DASH_DOT_DOT".equals(str)) {
            return 10;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown DashStyle name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "SOLID | DEFAULT";
            case 1:
                return "SHORT_DASH";
            case 2:
                return "SHORT_DOT";
            case 3:
                return "SHORT_DASH_DOT";
            case 4:
                return "SHORT_DASH_DOT_DOT";
            case 5:
                return "DOT";
            case 6:
                return "DASH";
            case 7:
                return "LONG_DASH";
            case 8:
                return "DASH_DOT";
            case 9:
                return "LONG_DASH_DOT";
            case 10:
                return "LONG_DASH_DOT_DOT";
            default:
                return "Unknown DashStyle value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Solid | Default";
            case 1:
                return "ShortDash";
            case 2:
                return "ShortDot";
            case 3:
                return "ShortDashDot";
            case 4:
                return "ShortDashDotDot";
            case 5:
                return "Dot";
            case 6:
                return "Dash";
            case 7:
                return "LongDash";
            case 8:
                return "DashDot";
            case 9:
                return "LongDashDot";
            case 10:
                return "LongDashDotDot";
            default:
                return "Unknown DashStyle value.";
        }
    }
}
