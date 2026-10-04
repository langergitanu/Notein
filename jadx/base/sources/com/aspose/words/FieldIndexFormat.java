package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FieldIndexFormat {
    public static final int BULLETED = 4;
    public static final int CLASSIC = 1;
    public static final int FANCY = 2;
    public static final int FORMAL = 5;
    public static final int MODERN = 3;
    public static final int SIMPLE = 6;
    public static final int TEMPLATE = 0;
    public static final int length = 7;

    private FieldIndexFormat() {
    }

    public static int fromName(String str) {
        if ("TEMPLATE".equals(str)) {
            return 0;
        }
        if ("CLASSIC".equals(str)) {
            return 1;
        }
        if ("FANCY".equals(str)) {
            return 2;
        }
        if ("MODERN".equals(str)) {
            return 3;
        }
        if ("BULLETED".equals(str)) {
            return 4;
        }
        if ("FORMAL".equals(str)) {
            return 5;
        }
        if ("SIMPLE".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException("Unknown FieldIndexFormat name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "TEMPLATE";
            case 1:
                return "CLASSIC";
            case 2:
                return "FANCY";
            case 3:
                return "MODERN";
            case 4:
                return "BULLETED";
            case 5:
                return "FORMAL";
            case 6:
                return "SIMPLE";
            default:
                return "Unknown FieldIndexFormat value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Template";
            case 1:
                return "Classic";
            case 2:
                return "Fancy";
            case 3:
                return "Modern";
            case 4:
                return "Bulleted";
            case 5:
                return "Formal";
            case 6:
                return "Simple";
            default:
                return "Unknown FieldIndexFormat value.";
        }
    }
}
