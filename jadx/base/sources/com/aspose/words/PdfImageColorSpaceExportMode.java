package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfImageColorSpaceExportMode {
    public static final int AUTO = 0;
    public static final int SIMPLE_CMYK = 1;
    public static final int length = 2;

    private PdfImageColorSpaceExportMode() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("SIMPLE_CMYK".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown PdfImageColorSpaceExportMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown PdfImageColorSpaceExportMode value." : "SIMPLE_CMYK" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown PdfImageColorSpaceExportMode value." : "SimpleCmyk" : "Auto";
    }
}
