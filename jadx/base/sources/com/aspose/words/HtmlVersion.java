package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HtmlVersion {
    public static final int HTML_5 = 1;
    public static final int XHTML = 0;
    public static final int length = 2;

    private HtmlVersion() {
    }

    public static int fromName(String str) {
        if ("XHTML".equals(str)) {
            return 0;
        }
        if ("HTML_5".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown HtmlVersion name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown HtmlVersion value." : "HTML_5" : "XHTML";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown HtmlVersion value." : "Html5" : "Xhtml";
    }
}
