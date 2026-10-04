package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HtmlMetafileFormat {
    public static final int EMF_OR_WMF = 2;
    public static final int PNG = 0;
    public static final int SVG = 1;
    public static final int length = 3;

    private HtmlMetafileFormat() {
    }

    public static int fromName(String str) {
        if ("PNG".equals(str)) {
            return 0;
        }
        if ("SVG".equals(str)) {
            return 1;
        }
        if ("EMF_OR_WMF".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown HtmlMetafileFormat name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HtmlMetafileFormat value." : "EMF_OR_WMF" : "SVG" : "PNG";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HtmlMetafileFormat value." : "EmfOrWmf" : "Svg" : "Png";
    }
}
