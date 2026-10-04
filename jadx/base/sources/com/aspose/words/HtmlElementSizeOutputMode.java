package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HtmlElementSizeOutputMode {
    public static final int ALL = 0;
    public static final int NONE = 2;
    public static final int RELATIVE_ONLY = 1;
    public static final int length = 3;

    private HtmlElementSizeOutputMode() {
    }

    public static int fromName(String str) {
        if ("ALL".equals(str)) {
            return 0;
        }
        if ("RELATIVE_ONLY".equals(str)) {
            return 1;
        }
        if ("NONE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown HtmlElementSizeOutputMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HtmlElementSizeOutputMode value." : "NONE" : "RELATIVE_ONLY" : "ALL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HtmlElementSizeOutputMode value." : "None" : "RelativeOnly" : "All";
    }
}
