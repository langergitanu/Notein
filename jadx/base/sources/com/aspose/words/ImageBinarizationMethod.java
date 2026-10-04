package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageBinarizationMethod {
    public static final int FLOYD_STEINBERG_DITHERING = 1;
    public static final int THRESHOLD = 0;
    public static final int length = 2;

    private ImageBinarizationMethod() {
    }

    public static int fromName(String str) {
        if ("THRESHOLD".equals(str)) {
            return 0;
        }
        if ("FLOYD_STEINBERG_DITHERING".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ImageBinarizationMethod name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ImageBinarizationMethod value." : "FLOYD_STEINBERG_DITHERING" : "THRESHOLD";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ImageBinarizationMethod value." : "FloydSteinbergDithering" : "Threshold";
    }
}
