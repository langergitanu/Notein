package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfImageCompression {
    public static final int AUTO = 0;
    public static final int JPEG = 1;
    public static final int length = 2;

    private PdfImageCompression() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("JPEG".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown PdfImageCompression name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown PdfImageCompression value." : "JPEG" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown PdfImageCompression value." : "Jpeg" : "Auto";
    }
}
