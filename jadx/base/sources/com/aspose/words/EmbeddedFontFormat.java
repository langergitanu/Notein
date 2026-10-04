package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EmbeddedFontFormat {
    public static final int EMBEDDED_OPEN_TYPE = 0;
    public static final int OPEN_TYPE = 1;
    public static final int length = 2;

    private EmbeddedFontFormat() {
    }

    public static int fromName(String str) {
        if ("EMBEDDED_OPEN_TYPE".equals(str)) {
            return 0;
        }
        if ("OPEN_TYPE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown EmbeddedFontFormat name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown EmbeddedFontFormat value." : "OPEN_TYPE" : "EMBEDDED_OPEN_TYPE";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown EmbeddedFontFormat value." : "OpenType" : "EmbeddedOpenType";
    }
}
