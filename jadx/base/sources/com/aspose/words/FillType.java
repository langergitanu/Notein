package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FillType {
    public static final int BACKGROUND = 5;
    public static final int GRADIENT = 3;
    public static final int PATTERNED = 2;
    public static final int PICTURE = 6;
    public static final int SOLID = 1;
    public static final int TEXTURED = 4;
    public static final int length = 6;

    private FillType() {
    }

    public static int fromName(String str) {
        if ("SOLID".equals(str)) {
            return 1;
        }
        if ("PATTERNED".equals(str)) {
            return 2;
        }
        if ("GRADIENT".equals(str)) {
            return 3;
        }
        if ("TEXTURED".equals(str)) {
            return 4;
        }
        if ("BACKGROUND".equals(str)) {
            return 5;
        }
        if ("PICTURE".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException("Unknown FillType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 1:
                return "SOLID";
            case 2:
                return "PATTERNED";
            case 3:
                return "GRADIENT";
            case 4:
                return "TEXTURED";
            case 5:
                return "BACKGROUND";
            case 6:
                return "PICTURE";
            default:
                return "Unknown FillType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static String toString(int i) {
        switch (i) {
            case 1:
                return "Solid";
            case 2:
                return "Patterned";
            case 3:
                return "Gradient";
            case 4:
                return "Textured";
            case 5:
                return "Background";
            case 6:
                return "Picture";
            default:
                return "Unknown FillType value.";
        }
    }
}
