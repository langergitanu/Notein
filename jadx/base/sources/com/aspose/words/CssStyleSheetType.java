package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class CssStyleSheetType {
    public static final int EMBEDDED = 1;
    public static final int EXTERNAL = 2;
    public static final int INLINE = 0;
    public static final int length = 3;

    private CssStyleSheetType() {
    }

    public static int fromName(String str) {
        if ("INLINE".equals(str)) {
            return 0;
        }
        if ("EMBEDDED".equals(str)) {
            return 1;
        }
        if ("EXTERNAL".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown CssStyleSheetType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown CssStyleSheetType value." : "EXTERNAL" : "EMBEDDED" : "INLINE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown CssStyleSheetType value." : "External" : "Embedded" : "Inline";
    }
}
