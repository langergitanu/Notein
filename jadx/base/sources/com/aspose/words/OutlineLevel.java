package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class OutlineLevel {
    public static final int BODY_TEXT = 9;
    public static final int LEVEL_1 = 0;
    public static final int LEVEL_2 = 1;
    public static final int LEVEL_3 = 2;
    public static final int LEVEL_4 = 3;
    public static final int LEVEL_5 = 4;
    public static final int LEVEL_6 = 5;
    public static final int LEVEL_7 = 6;
    public static final int LEVEL_8 = 7;
    public static final int LEVEL_9 = 8;
    public static final int length = 10;

    private OutlineLevel() {
    }

    public static int fromName(String str) {
        if ("LEVEL_1".equals(str)) {
            return 0;
        }
        if ("LEVEL_2".equals(str)) {
            return 1;
        }
        if ("LEVEL_3".equals(str)) {
            return 2;
        }
        if ("LEVEL_4".equals(str)) {
            return 3;
        }
        if ("LEVEL_5".equals(str)) {
            return 4;
        }
        if ("LEVEL_6".equals(str)) {
            return 5;
        }
        if ("LEVEL_7".equals(str)) {
            return 6;
        }
        if ("LEVEL_8".equals(str)) {
            return 7;
        }
        if ("LEVEL_9".equals(str)) {
            return 8;
        }
        if ("BODY_TEXT".equals(str)) {
            return 9;
        }
        throw new IllegalArgumentException("Unknown OutlineLevel name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "LEVEL_1";
            case 1:
                return "LEVEL_2";
            case 2:
                return "LEVEL_3";
            case 3:
                return "LEVEL_4";
            case 4:
                return "LEVEL_5";
            case 5:
                return "LEVEL_6";
            case 6:
                return "LEVEL_7";
            case 7:
                return "LEVEL_8";
            case 8:
                return "LEVEL_9";
            case 9:
                return "BODY_TEXT";
            default:
                return "Unknown OutlineLevel value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Level1";
            case 1:
                return "Level2";
            case 2:
                return "Level3";
            case 3:
                return "Level4";
            case 4:
                return "Level5";
            case 5:
                return "Level6";
            case 6:
                return "Level7";
            case 7:
                return "Level8";
            case 8:
                return "Level9";
            case 9:
                return "BodyText";
            default:
                return "Unknown OutlineLevel value.";
        }
    }
}
