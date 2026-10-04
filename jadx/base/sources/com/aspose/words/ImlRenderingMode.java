package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ImlRenderingMode {
    public static final int FALLBACK = 0;
    public static final int INK_ML = 1;
    public static final int length = 2;

    private ImlRenderingMode() {
    }

    public static int fromName(String str) {
        if ("FALLBACK".equals(str)) {
            return 0;
        }
        if ("INK_ML".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ImlRenderingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ImlRenderingMode value." : "INK_ML" : "FALLBACK";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ImlRenderingMode value." : "InkML" : "Fallback";
    }
}
