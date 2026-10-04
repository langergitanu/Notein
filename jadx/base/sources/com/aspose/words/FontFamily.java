package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FontFamily {
    public static final int AUTO = 0;
    public static final int DECORATIVE = 5;
    public static final int MODERN = 3;
    public static final int ROMAN = 1;
    public static final int SCRIPT = 4;
    public static final int SWISS = 2;
    public static final int length = 6;

    private FontFamily() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("ROMAN".equals(str)) {
            return 1;
        }
        if ("SWISS".equals(str)) {
            return 2;
        }
        if ("MODERN".equals(str)) {
            return 3;
        }
        if ("SCRIPT".equals(str)) {
            return 4;
        }
        if ("DECORATIVE".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown FontFamily name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown FontFamily value." : "DECORATIVE" : "SCRIPT" : "MODERN" : "SWISS" : "ROMAN" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown FontFamily value." : "Decorative" : "Script" : "Modern" : "Swiss" : "Roman" : "Auto";
    }
}
