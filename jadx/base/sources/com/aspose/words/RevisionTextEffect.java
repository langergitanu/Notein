package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RevisionTextEffect {
    public static final int BOLD = 2;
    public static final int COLOR = 1;
    public static final int DOUBLE_STRIKE_THROUGH = 7;
    public static final int DOUBLE_UNDERLINE = 5;
    public static final int HIDDEN = 8;
    public static final int ITALIC = 3;
    public static final int NONE = 0;
    public static final int STRIKE_THROUGH = 6;
    public static final int UNDERLINE = 4;
    public static final int length = 9;

    private RevisionTextEffect() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("COLOR".equals(str)) {
            return 1;
        }
        if ("BOLD".equals(str)) {
            return 2;
        }
        if ("ITALIC".equals(str)) {
            return 3;
        }
        if ("UNDERLINE".equals(str)) {
            return 4;
        }
        if ("DOUBLE_UNDERLINE".equals(str)) {
            return 5;
        }
        if ("STRIKE_THROUGH".equals(str)) {
            return 6;
        }
        if ("DOUBLE_STRIKE_THROUGH".equals(str)) {
            return 7;
        }
        if ("HIDDEN".equals(str)) {
            return 8;
        }
        throw new IllegalArgumentException("Unknown RevisionTextEffect name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "COLOR";
            case 2:
                return "BOLD";
            case 3:
                return "ITALIC";
            case 4:
                return "UNDERLINE";
            case 5:
                return "DOUBLE_UNDERLINE";
            case 6:
                return "STRIKE_THROUGH";
            case 7:
                return "DOUBLE_STRIKE_THROUGH";
            case 8:
                return "HIDDEN";
            default:
                return "Unknown RevisionTextEffect value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "Color";
            case 2:
                return "Bold";
            case 3:
                return "Italic";
            case 4:
                return "Underline";
            case 5:
                return "DoubleUnderline";
            case 6:
                return "StrikeThrough";
            case 7:
                return "DoubleStrikeThrough";
            case 8:
                return "Hidden";
            default:
                return "Unknown RevisionTextEffect value.";
        }
    }
}
