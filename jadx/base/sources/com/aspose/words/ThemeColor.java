package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ThemeColor {
    public static final int ACCENT_1 = 4;
    public static final int ACCENT_2 = 5;
    public static final int ACCENT_3 = 6;
    public static final int ACCENT_4 = 7;
    public static final int ACCENT_5 = 8;
    public static final int ACCENT_6 = 9;
    public static final int BACKGROUND_1 = 14;
    public static final int BACKGROUND_2 = 15;
    public static final int DARK_1 = 0;
    public static final int DARK_2 = 2;
    public static final int FOLLOWED_HYPERLINK = 11;
    public static final int HYPERLINK = 10;
    public static final int LIGHT_1 = 1;
    public static final int LIGHT_2 = 3;
    public static final int NONE = -1;
    public static final int TEXT_1 = 12;
    public static final int TEXT_2 = 13;
    public static final int length = 17;

    private ThemeColor() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return -1;
        }
        if ("DARK_1".equals(str)) {
            return 0;
        }
        if ("LIGHT_1".equals(str)) {
            return 1;
        }
        if ("DARK_2".equals(str)) {
            return 2;
        }
        if ("LIGHT_2".equals(str)) {
            return 3;
        }
        if ("ACCENT_1".equals(str)) {
            return 4;
        }
        if ("ACCENT_2".equals(str)) {
            return 5;
        }
        if ("ACCENT_3".equals(str)) {
            return 6;
        }
        if ("ACCENT_4".equals(str)) {
            return 7;
        }
        if ("ACCENT_5".equals(str)) {
            return 8;
        }
        if ("ACCENT_6".equals(str)) {
            return 9;
        }
        if ("HYPERLINK".equals(str)) {
            return 10;
        }
        if ("FOLLOWED_HYPERLINK".equals(str)) {
            return 11;
        }
        if ("TEXT_1".equals(str)) {
            return 12;
        }
        if ("TEXT_2".equals(str)) {
            return 13;
        }
        if ("BACKGROUND_1".equals(str)) {
            return 14;
        }
        if ("BACKGROUND_2".equals(str)) {
            return 15;
        }
        throw new IllegalArgumentException("Unknown ThemeColor name.");
    }

    public static String getName(int i) {
        switch (i) {
            case -1:
                return "NONE";
            case 0:
                return "DARK_1";
            case 1:
                return "LIGHT_1";
            case 2:
                return "DARK_2";
            case 3:
                return "LIGHT_2";
            case 4:
                return "ACCENT_1";
            case 5:
                return "ACCENT_2";
            case 6:
                return "ACCENT_3";
            case 7:
                return "ACCENT_4";
            case 8:
                return "ACCENT_5";
            case 9:
                return "ACCENT_6";
            case 10:
                return "HYPERLINK";
            case 11:
                return "FOLLOWED_HYPERLINK";
            case 12:
                return "TEXT_1";
            case 13:
                return "TEXT_2";
            case 14:
                return "BACKGROUND_1";
            case 15:
                return "BACKGROUND_2";
            default:
                return "Unknown ThemeColor value.";
        }
    }

    public static int[] getValues() {
        return new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    }

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "None";
            case 0:
                return "Dark1";
            case 1:
                return "Light1";
            case 2:
                return "Dark2";
            case 3:
                return "Light2";
            case 4:
                return "Accent1";
            case 5:
                return "Accent2";
            case 6:
                return "Accent3";
            case 7:
                return "Accent4";
            case 8:
                return "Accent5";
            case 9:
                return "Accent6";
            case 10:
                return "Hyperlink";
            case 11:
                return "FollowedHyperlink";
            case 12:
                return "Text1";
            case 13:
                return "Text2";
            case 14:
                return "Background1";
            case 15:
                return "Background2";
            default:
                return "Unknown ThemeColor value.";
        }
    }
}
