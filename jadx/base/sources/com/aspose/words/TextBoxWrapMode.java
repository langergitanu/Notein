package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextBoxWrapMode {
    public static final int NONE = 2;
    public static final int SQUARE = 0;
    public static final int length = 2;

    private TextBoxWrapMode() {
    }

    public static int fromName(String str) {
        if ("SQUARE".equals(str)) {
            return 0;
        }
        if ("NONE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown TextBoxWrapMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 2 ? "Unknown TextBoxWrapMode value." : "NONE" : "SQUARE";
    }

    public static int[] getValues() {
        return new int[]{0, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 2 ? "Unknown TextBoxWrapMode value." : "None" : "Square";
    }
}
