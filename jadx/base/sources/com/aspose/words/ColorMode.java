package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ColorMode {
    public static final int GRAYSCALE = 1;
    public static final int NORMAL = 0;
    public static final int length = 2;

    private ColorMode() {
    }

    public static int fromName(String str) {
        if ("NORMAL".equals(str)) {
            return 0;
        }
        if ("GRAYSCALE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ColorMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ColorMode value." : "GRAYSCALE" : "NORMAL";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ColorMode value." : "Grayscale" : "Normal";
    }
}
