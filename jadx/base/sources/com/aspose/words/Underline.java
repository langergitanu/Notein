package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Underline {
    public static final int DASH = 7;
    public static final int DASH_HEAVY = 23;
    public static final int DASH_LONG = 39;
    public static final int DASH_LONG_HEAVY = 55;
    public static final int DOTTED = 4;
    public static final int DOTTED_HEAVY = 20;
    public static final int DOT_DASH = 9;
    public static final int DOT_DASH_HEAVY = 25;
    public static final int DOT_DOT_DASH = 10;
    public static final int DOT_DOT_DASH_HEAVY = 26;
    public static final int DOUBLE = 3;
    public static final int NONE = 0;
    public static final int SINGLE = 1;
    public static final int THICK = 6;
    public static final int WAVY = 11;
    public static final int WAVY_DOUBLE = 43;
    public static final int WAVY_HEAVY = 27;
    public static final int WORDS = 2;
    public static final int length = 18;

    private Underline() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("SINGLE".equals(str)) {
            return 1;
        }
        if ("WORDS".equals(str)) {
            return 2;
        }
        if ("DOUBLE".equals(str)) {
            return 3;
        }
        if ("DOTTED".equals(str)) {
            return 4;
        }
        if ("THICK".equals(str)) {
            return 6;
        }
        if ("DASH".equals(str)) {
            return 7;
        }
        if ("DASH_LONG".equals(str)) {
            return 39;
        }
        if ("DOT_DASH".equals(str)) {
            return 9;
        }
        if ("DOT_DOT_DASH".equals(str)) {
            return 10;
        }
        if ("WAVY".equals(str)) {
            return 11;
        }
        if ("DOTTED_HEAVY".equals(str)) {
            return 20;
        }
        if ("DASH_HEAVY".equals(str)) {
            return 23;
        }
        if ("DASH_LONG_HEAVY".equals(str)) {
            return 55;
        }
        if ("DOT_DASH_HEAVY".equals(str)) {
            return 25;
        }
        if ("DOT_DOT_DASH_HEAVY".equals(str)) {
            return 26;
        }
        if ("WAVY_HEAVY".equals(str)) {
            return 27;
        }
        if ("WAVY_DOUBLE".equals(str)) {
            return 43;
        }
        throw new IllegalArgumentException("Unknown Underline name.");
    }

    public static String getName(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "SINGLE";
        }
        if (i == 2) {
            return "WORDS";
        }
        if (i == 3) {
            return "DOUBLE";
        }
        if (i == 4) {
            return "DOTTED";
        }
        if (i == 6) {
            return "THICK";
        }
        if (i == 7) {
            return "DASH";
        }
        if (i == 20) {
            return "DOTTED_HEAVY";
        }
        if (i == 23) {
            return "DASH_HEAVY";
        }
        if (i == 39) {
            return "DASH_LONG";
        }
        if (i == 43) {
            return "WAVY_DOUBLE";
        }
        if (i == 55) {
            return "DASH_LONG_HEAVY";
        }
        switch (i) {
            case 9:
                return "DOT_DASH";
            case 10:
                return "DOT_DOT_DASH";
            case 11:
                return "WAVY";
            default:
                switch (i) {
                    case 25:
                        return "DOT_DASH_HEAVY";
                    case 26:
                        return "DOT_DOT_DASH_HEAVY";
                    case 27:
                        return "WAVY_HEAVY";
                    default:
                        return "Unknown Underline value.";
                }
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 6, 7, 39, 9, 10, 11, 20, 23, 55, 25, 26, 27, 43};
    }

    public static String toString(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Single";
        }
        if (i == 2) {
            return "Words";
        }
        if (i == 3) {
            return "Double";
        }
        if (i == 4) {
            return "Dotted";
        }
        if (i == 6) {
            return "Thick";
        }
        if (i == 7) {
            return "Dash";
        }
        if (i == 20) {
            return "DottedHeavy";
        }
        if (i == 23) {
            return "DashHeavy";
        }
        if (i == 39) {
            return "DashLong";
        }
        if (i == 43) {
            return "WavyDouble";
        }
        if (i == 55) {
            return "DashLongHeavy";
        }
        switch (i) {
            case 9:
                return "DotDash";
            case 10:
                return "DotDotDash";
            case 11:
                return "Wavy";
            default:
                switch (i) {
                    case 25:
                        return "DotDashHeavy";
                    case 26:
                        return "DotDotDashHeavy";
                    case 27:
                        return "WavyHeavy";
                    default:
                        return "Unknown Underline value.";
                }
        }
    }
}
