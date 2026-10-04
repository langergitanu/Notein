package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ParagraphAlignment {
    public static final int ARABIC_HIGH_KASHIDA = 7;
    public static final int ARABIC_LOW_KASHIDA = 8;
    public static final int ARABIC_MEDIUM_KASHIDA = 5;
    public static final int CENTER = 1;
    public static final int DISTRIBUTED = 4;
    public static final int JUSTIFY = 3;
    public static final int LEFT = 0;
    public static final int MATH_ELEMENT_CENTER_AS_GROUP = 10;
    public static final int RIGHT = 2;
    public static final int THAI_DISTRIBUTED = 9;
    public static final int length = 10;

    private ParagraphAlignment() {
    }

    public static int fromName(String str) {
        if ("LEFT".equals(str)) {
            return 0;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("RIGHT".equals(str)) {
            return 2;
        }
        if ("JUSTIFY".equals(str)) {
            return 3;
        }
        if ("DISTRIBUTED".equals(str)) {
            return 4;
        }
        if ("ARABIC_MEDIUM_KASHIDA".equals(str)) {
            return 5;
        }
        if ("ARABIC_HIGH_KASHIDA".equals(str)) {
            return 7;
        }
        if ("ARABIC_LOW_KASHIDA".equals(str)) {
            return 8;
        }
        if ("THAI_DISTRIBUTED".equals(str)) {
            return 9;
        }
        if ("MATH_ELEMENT_CENTER_AS_GROUP".equals(str)) {
            return 10;
        }
        throw new IllegalArgumentException("Unknown ParagraphAlignment name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "LEFT";
            case 1:
                return "CENTER";
            case 2:
                return "RIGHT";
            case 3:
                return "JUSTIFY";
            case 4:
                return "DISTRIBUTED";
            case 5:
                return "ARABIC_MEDIUM_KASHIDA";
            case 6:
            default:
                return "Unknown ParagraphAlignment value.";
            case 7:
                return "ARABIC_HIGH_KASHIDA";
            case 8:
                return "ARABIC_LOW_KASHIDA";
            case 9:
                return "THAI_DISTRIBUTED";
            case 10:
                return "MATH_ELEMENT_CENTER_AS_GROUP";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 7, 8, 9, 10};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Left";
            case 1:
                return "Center";
            case 2:
                return "Right";
            case 3:
                return "Justify";
            case 4:
                return "Distributed";
            case 5:
                return "ArabicMediumKashida";
            case 6:
            default:
                return "Unknown ParagraphAlignment value.";
            case 7:
                return "ArabicHighKashida";
            case 8:
                return "ArabicLowKashida";
            case 9:
                return "ThaiDistributed";
            case 10:
                return "MathElementCenterAsGroup";
        }
    }
}
