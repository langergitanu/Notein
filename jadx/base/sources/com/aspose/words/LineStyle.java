package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class LineStyle {
    public static final int DASH_DOT_STROKER = 23;
    public static final int DASH_LARGE_GAP = 7;
    public static final int DASH_SMALL_GAP = 22;
    public static final int DOT = 6;
    public static final int DOT_DASH = 8;
    public static final int DOT_DOT_DASH = 9;
    public static final int DOUBLE = 3;
    public static final int DOUBLE_WAVE = 21;
    public static final int EMBOSS_3_D = 24;
    public static final int ENGRAVE_3_D = 25;
    public static final int HAIRLINE = 5;
    public static final int INSET = 27;
    public static final int NONE = 0;
    public static final int OUTSET = 26;
    public static final int SINGLE = 1;
    public static final int THICK = 2;
    public static final int THICK_THIN_LARGE_GAP = 18;
    public static final int THICK_THIN_MEDIUM_GAP = 15;
    public static final int THICK_THIN_SMALL_GAP = 12;
    public static final int THIN_THICK_LARGE_GAP = 17;
    public static final int THIN_THICK_MEDIUM_GAP = 14;
    public static final int THIN_THICK_SMALL_GAP = 11;
    public static final int THIN_THICK_THIN_LARGE_GAP = 19;
    public static final int THIN_THICK_THIN_MEDIUM_GAP = 16;
    public static final int THIN_THICK_THIN_SMALL_GAP = 13;
    public static final int TRIPLE = 10;
    public static final int WAVE = 20;
    public static final int length = 27;

    private LineStyle() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("SINGLE".equals(str)) {
            return 1;
        }
        if ("THICK".equals(str)) {
            return 2;
        }
        if ("DOUBLE".equals(str)) {
            return 3;
        }
        if ("HAIRLINE".equals(str)) {
            return 5;
        }
        if ("DOT".equals(str)) {
            return 6;
        }
        if ("DASH_LARGE_GAP".equals(str)) {
            return 7;
        }
        if ("DOT_DASH".equals(str)) {
            return 8;
        }
        if ("DOT_DOT_DASH".equals(str)) {
            return 9;
        }
        if ("TRIPLE".equals(str)) {
            return 10;
        }
        if ("THIN_THICK_SMALL_GAP".equals(str)) {
            return 11;
        }
        if ("THICK_THIN_SMALL_GAP".equals(str)) {
            return 12;
        }
        if ("THIN_THICK_THIN_SMALL_GAP".equals(str)) {
            return 13;
        }
        if ("THIN_THICK_MEDIUM_GAP".equals(str)) {
            return 14;
        }
        if ("THICK_THIN_MEDIUM_GAP".equals(str)) {
            return 15;
        }
        if ("THIN_THICK_THIN_MEDIUM_GAP".equals(str)) {
            return 16;
        }
        if ("THIN_THICK_LARGE_GAP".equals(str)) {
            return 17;
        }
        if ("THICK_THIN_LARGE_GAP".equals(str)) {
            return 18;
        }
        if ("THIN_THICK_THIN_LARGE_GAP".equals(str)) {
            return 19;
        }
        if ("WAVE".equals(str)) {
            return 20;
        }
        if ("DOUBLE_WAVE".equals(str)) {
            return 21;
        }
        if ("DASH_SMALL_GAP".equals(str)) {
            return 22;
        }
        if ("DASH_DOT_STROKER".equals(str)) {
            return 23;
        }
        if ("EMBOSS_3_D".equals(str)) {
            return 24;
        }
        if ("ENGRAVE_3_D".equals(str)) {
            return 25;
        }
        if ("OUTSET".equals(str)) {
            return 26;
        }
        if ("INSET".equals(str)) {
            return 27;
        }
        throw new IllegalArgumentException("Unknown LineStyle name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "SINGLE";
            case 2:
                return "THICK";
            case 3:
                return "DOUBLE";
            case 4:
            default:
                return "Unknown LineStyle value.";
            case 5:
                return "HAIRLINE";
            case 6:
                return "DOT";
            case 7:
                return "DASH_LARGE_GAP";
            case 8:
                return "DOT_DASH";
            case 9:
                return "DOT_DOT_DASH";
            case 10:
                return "TRIPLE";
            case 11:
                return "THIN_THICK_SMALL_GAP";
            case 12:
                return "THICK_THIN_SMALL_GAP";
            case 13:
                return "THIN_THICK_THIN_SMALL_GAP";
            case 14:
                return "THIN_THICK_MEDIUM_GAP";
            case 15:
                return "THICK_THIN_MEDIUM_GAP";
            case 16:
                return "THIN_THICK_THIN_MEDIUM_GAP";
            case 17:
                return "THIN_THICK_LARGE_GAP";
            case 18:
                return "THICK_THIN_LARGE_GAP";
            case 19:
                return "THIN_THICK_THIN_LARGE_GAP";
            case 20:
                return "WAVE";
            case 21:
                return "DOUBLE_WAVE";
            case 22:
                return "DASH_SMALL_GAP";
            case 23:
                return "DASH_DOT_STROKER";
            case 24:
                return "EMBOSS_3_D";
            case 25:
                return "ENGRAVE_3_D";
            case 26:
                return "OUTSET";
            case 27:
                return "INSET";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "Single";
            case 2:
                return "Thick";
            case 3:
                return "Double";
            case 4:
            default:
                return "Unknown LineStyle value.";
            case 5:
                return "Hairline";
            case 6:
                return "Dot";
            case 7:
                return "DashLargeGap";
            case 8:
                return "DotDash";
            case 9:
                return "DotDotDash";
            case 10:
                return "Triple";
            case 11:
                return "ThinThickSmallGap";
            case 12:
                return "ThickThinSmallGap";
            case 13:
                return "ThinThickThinSmallGap";
            case 14:
                return "ThinThickMediumGap";
            case 15:
                return "ThickThinMediumGap";
            case 16:
                return "ThinThickThinMediumGap";
            case 17:
                return "ThinThickLargeGap";
            case 18:
                return "ThickThinLargeGap";
            case 19:
                return "ThinThickThinLargeGap";
            case 20:
                return "Wave";
            case 21:
                return "DoubleWave";
            case 22:
                return "DashSmallGap";
            case 23:
                return "DashDotStroker";
            case 24:
                return "Emboss3D";
            case 25:
                return "Engrave3D";
            case 26:
                return "Outset";
            case 27:
                return "Inset";
        }
    }
}
