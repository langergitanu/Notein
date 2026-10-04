package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ExportFontFormat {
    public static final int TTF = 1;
    public static final int WOFF = 0;
    public static final int length = 2;

    private ExportFontFormat() {
    }

    public static int fromName(String str) {
        if ("WOFF".equals(str)) {
            return 0;
        }
        if ("TTF".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ExportFontFormat name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ExportFontFormat value." : "TTF" : "WOFF";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ExportFontFormat value." : "Ttf" : "Woff";
    }
}
