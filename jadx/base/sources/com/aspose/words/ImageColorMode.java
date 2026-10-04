package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageColorMode {
    public static final int BLACK_AND_WHITE = 2;
    public static final int GRAYSCALE = 1;
    public static final int NONE = 0;
    public static final int length = 3;

    private ImageColorMode() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("GRAYSCALE".equals(str)) {
            return 1;
        }
        if ("BLACK_AND_WHITE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ImageColorMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ImageColorMode value." : "BLACK_AND_WHITE" : "GRAYSCALE" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ImageColorMode value." : "BlackAndWhite" : "Grayscale" : "None";
    }
}
