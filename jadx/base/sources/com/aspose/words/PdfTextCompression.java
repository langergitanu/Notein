package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfTextCompression {
    public static final int FLATE = 1;
    public static final int NONE = 0;
    public static final int length = 2;

    private PdfTextCompression() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("FLATE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown PdfTextCompression name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown PdfTextCompression value." : "FLATE" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown PdfTextCompression value." : "Flate" : "None";
    }
}
