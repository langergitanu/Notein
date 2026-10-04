package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextureAlignment {
    public static final int BOTTOM = 7;
    public static final int BOTTOM_LEFT = 6;
    public static final int BOTTOM_RIGHT = 8;
    public static final int CENTER = 4;
    public static final int LEFT = 3;
    public static final int NONE = 9;
    public static final int RIGHT = 5;
    public static final int TOP = 1;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 2;
    public static final int length = 10;

    private TextureAlignment() {
    }

    public static int fromName(String str) {
        if ("TOP_LEFT".equals(str)) {
            return 0;
        }
        if ("TOP".equals(str)) {
            return 1;
        }
        if ("TOP_RIGHT".equals(str)) {
            return 2;
        }
        if ("LEFT".equals(str)) {
            return 3;
        }
        if ("CENTER".equals(str)) {
            return 4;
        }
        if ("RIGHT".equals(str)) {
            return 5;
        }
        if ("BOTTOM_LEFT".equals(str)) {
            return 6;
        }
        if ("BOTTOM".equals(str)) {
            return 7;
        }
        if ("BOTTOM_RIGHT".equals(str)) {
            return 8;
        }
        if ("NONE".equals(str)) {
            return 9;
        }
        throw new IllegalArgumentException("Unknown TextureAlignment name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "TOP_LEFT";
            case 1:
                return "TOP";
            case 2:
                return "TOP_RIGHT";
            case 3:
                return "LEFT";
            case 4:
                return "CENTER";
            case 5:
                return "RIGHT";
            case 6:
                return "BOTTOM_LEFT";
            case 7:
                return "BOTTOM";
            case 8:
                return "BOTTOM_RIGHT";
            case 9:
                return "NONE";
            default:
                return "Unknown TextureAlignment value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "TopLeft";
            case 1:
                return "Top";
            case 2:
                return "TopRight";
            case 3:
                return "Left";
            case 4:
                return "Center";
            case 5:
                return "Right";
            case 6:
                return "BottomLeft";
            case 7:
                return "Bottom";
            case 8:
                return "BottomRight";
            case 9:
                return "None";
            default:
                return "Unknown TextureAlignment value.";
        }
    }
}
