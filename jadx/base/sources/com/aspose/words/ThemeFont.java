package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ThemeFont {
    public static final int MAJOR = 1;
    public static final int MINOR = 2;
    public static final int NONE = 0;
    public static final int length = 3;

    private ThemeFont() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("MAJOR".equals(str)) {
            return 1;
        }
        if ("MINOR".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ThemeFont name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ThemeFont value." : "MINOR" : "MAJOR" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ThemeFont value." : "Minor" : "Major" : "None";
    }
}
