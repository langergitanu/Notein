package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RevisionColor {
    public static final int AUTO = 0;
    public static final int BLACK = 1;
    public static final int BLUE = 2;
    public static final int BRIGHT_GREEN = 3;
    public static final int BY_AUTHOR = 20;
    public static final int CLASSIC_BLUE = 4;
    public static final int CLASSIC_RED = 5;
    public static final int DARK_BLUE = 6;
    public static final int DARK_RED = 7;
    public static final int DARK_YELLOW = 8;
    public static final int GRAY_25 = 9;
    public static final int GRAY_50 = 10;
    public static final int GREEN = 11;
    public static final int NO_HIGHLIGHT = 19;
    public static final int PINK = 12;
    public static final int RED = 13;
    public static final int TEAL = 14;
    public static final int TURQUOISE = 15;
    public static final int VIOLET = 16;
    public static final int WHITE = 17;
    public static final int YELLOW = 18;
    public static final int length = 21;

    private RevisionColor() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("BLACK".equals(str)) {
            return 1;
        }
        if ("BLUE".equals(str)) {
            return 2;
        }
        if ("BRIGHT_GREEN".equals(str)) {
            return 3;
        }
        if ("CLASSIC_BLUE".equals(str)) {
            return 4;
        }
        if ("CLASSIC_RED".equals(str)) {
            return 5;
        }
        if ("DARK_BLUE".equals(str)) {
            return 6;
        }
        if ("DARK_RED".equals(str)) {
            return 7;
        }
        if ("DARK_YELLOW".equals(str)) {
            return 8;
        }
        if ("GRAY_25".equals(str)) {
            return 9;
        }
        if ("GRAY_50".equals(str)) {
            return 10;
        }
        if ("GREEN".equals(str)) {
            return 11;
        }
        if ("PINK".equals(str)) {
            return 12;
        }
        if ("RED".equals(str)) {
            return 13;
        }
        if ("TEAL".equals(str)) {
            return 14;
        }
        if ("TURQUOISE".equals(str)) {
            return 15;
        }
        if ("VIOLET".equals(str)) {
            return 16;
        }
        if ("WHITE".equals(str)) {
            return 17;
        }
        if ("YELLOW".equals(str)) {
            return 18;
        }
        if ("NO_HIGHLIGHT".equals(str)) {
            return 19;
        }
        if ("BY_AUTHOR".equals(str)) {
            return 20;
        }
        throw new IllegalArgumentException("Unknown RevisionColor name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "AUTO";
            case 1:
                return "BLACK";
            case 2:
                return "BLUE";
            case 3:
                return "BRIGHT_GREEN";
            case 4:
                return "CLASSIC_BLUE";
            case 5:
                return "CLASSIC_RED";
            case 6:
                return "DARK_BLUE";
            case 7:
                return "DARK_RED";
            case 8:
                return "DARK_YELLOW";
            case 9:
                return "GRAY_25";
            case 10:
                return "GRAY_50";
            case 11:
                return "GREEN";
            case 12:
                return "PINK";
            case 13:
                return "RED";
            case 14:
                return "TEAL";
            case 15:
                return "TURQUOISE";
            case 16:
                return "VIOLET";
            case 17:
                return "WHITE";
            case 18:
                return "YELLOW";
            case 19:
                return "NO_HIGHLIGHT";
            case 20:
                return "BY_AUTHOR";
            default:
                return "Unknown RevisionColor value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Auto";
            case 1:
                return "Black";
            case 2:
                return "Blue";
            case 3:
                return "BrightGreen";
            case 4:
                return "ClassicBlue";
            case 5:
                return "ClassicRed";
            case 6:
                return "DarkBlue";
            case 7:
                return "DarkRed";
            case 8:
                return "DarkYellow";
            case 9:
                return "Gray25";
            case 10:
                return "Gray50";
            case 11:
                return "Green";
            case 12:
                return "Pink";
            case 13:
                return "Red";
            case 14:
                return "Teal";
            case 15:
                return "Turquoise";
            case 16:
                return "Violet";
            case 17:
                return "White";
            case 18:
                return "Yellow";
            case 19:
                return "NoHighlight";
            case 20:
                return "ByAuthor";
            default:
                return "Unknown RevisionColor value.";
        }
    }
}
