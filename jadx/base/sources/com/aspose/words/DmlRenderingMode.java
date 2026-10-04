package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class DmlRenderingMode {
    public static final int DRAWING_ML = 1;
    public static final int FALLBACK = 0;
    public static final int length = 2;

    private DmlRenderingMode() {
    }

    public static int fromName(String str) {
        if ("FALLBACK".equals(str)) {
            return 0;
        }
        if ("DRAWING_ML".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown DmlRenderingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown DmlRenderingMode value." : "DRAWING_ML" : "FALLBACK";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown DmlRenderingMode value." : "DrawingML" : "Fallback";
    }
}
