package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Margins {
    public static final int CUSTOM = 5;
    public static final int MIRRORED = 4;
    public static final int MODERATE = 2;
    public static final int NARROW = 1;
    public static final int NORMAL = 0;
    public static final int WIDE = 3;
    public static final int length = 6;

    private Margins() {
    }

    public static int fromName(String str) {
        if ("NORMAL".equals(str)) {
            return 0;
        }
        if ("NARROW".equals(str)) {
            return 1;
        }
        if ("MODERATE".equals(str)) {
            return 2;
        }
        if ("WIDE".equals(str)) {
            return 3;
        }
        if ("MIRRORED".equals(str)) {
            return 4;
        }
        if ("CUSTOM".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown Margins name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown Margins value." : "CUSTOM" : "MIRRORED" : "WIDE" : "MODERATE" : "NARROW" : "NORMAL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown Margins value." : "Custom" : "Mirrored" : "Wide" : "Moderate" : "Narrow" : "Normal";
    }
}
