package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HtmlOfficeMathOutputMode {
    public static final int IMAGE = 0;
    public static final int MATH_ML = 1;
    public static final int TEXT = 2;
    public static final int length = 3;

    private HtmlOfficeMathOutputMode() {
    }

    public static int fromName(String str) {
        if ("IMAGE".equals(str)) {
            return 0;
        }
        if ("MATH_ML".equals(str)) {
            return 1;
        }
        if ("TEXT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown HtmlOfficeMathOutputMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HtmlOfficeMathOutputMode value." : "TEXT" : "MATH_ML" : "IMAGE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HtmlOfficeMathOutputMode value." : "Text" : "MathML" : "Image";
    }
}
