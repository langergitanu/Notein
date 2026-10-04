package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfCustomPropertiesExport {
    public static final int METADATA = 2;
    public static final int NONE = 0;
    public static final int STANDARD = 1;
    public static final int length = 3;

    private PdfCustomPropertiesExport() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("STANDARD".equals(str)) {
            return 1;
        }
        if ("METADATA".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown PdfCustomPropertiesExport name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown PdfCustomPropertiesExport value." : "METADATA" : "STANDARD" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown PdfCustomPropertiesExport value." : "Metadata" : "Standard" : "None";
    }
}
