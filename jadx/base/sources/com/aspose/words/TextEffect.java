package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextEffect {
    public static final int BLINKING_BACKGROUND = 2;
    public static final int LAS_VEGAS_LIGHTS = 1;
    public static final int MARCHING_BLACK_ANTS = 4;
    public static final int MARCHING_RED_ANTS = 5;
    public static final int NONE = 0;
    public static final int SHIMMER = 6;
    public static final int SPARKLE_TEXT = 3;
    public static final int length = 7;

    private TextEffect() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("LAS_VEGAS_LIGHTS".equals(str)) {
            return 1;
        }
        if ("BLINKING_BACKGROUND".equals(str)) {
            return 2;
        }
        if ("SPARKLE_TEXT".equals(str)) {
            return 3;
        }
        if ("MARCHING_BLACK_ANTS".equals(str)) {
            return 4;
        }
        if ("MARCHING_RED_ANTS".equals(str)) {
            return 5;
        }
        if ("SHIMMER".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException("Unknown TextEffect name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "LAS_VEGAS_LIGHTS";
            case 2:
                return "BLINKING_BACKGROUND";
            case 3:
                return "SPARKLE_TEXT";
            case 4:
                return "MARCHING_BLACK_ANTS";
            case 5:
                return "MARCHING_RED_ANTS";
            case 6:
                return "SHIMMER";
            default:
                return "Unknown TextEffect value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "LasVegasLights";
            case 2:
                return "BlinkingBackground";
            case 3:
                return "SparkleText";
            case 4:
                return "MarchingBlackAnts";
            case 5:
                return "MarchingRedAnts";
            case 6:
                return "Shimmer";
            default:
                return "Unknown TextEffect value.";
        }
    }
}
