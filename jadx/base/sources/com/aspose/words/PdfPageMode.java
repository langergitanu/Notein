package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfPageMode {
    public static final int FULL_SCREEN = 3;
    public static final int USE_ATTACHMENTS = 5;
    public static final int USE_NONE = 0;
    public static final int USE_OC = 4;
    public static final int USE_OUTLINES = 1;
    public static final int USE_THUMBS = 2;
    public static final int length = 6;

    private PdfPageMode() {
    }

    public static int fromName(String str) {
        if ("USE_NONE".equals(str)) {
            return 0;
        }
        if ("USE_OUTLINES".equals(str)) {
            return 1;
        }
        if ("USE_THUMBS".equals(str)) {
            return 2;
        }
        if ("FULL_SCREEN".equals(str)) {
            return 3;
        }
        if ("USE_OC".equals(str)) {
            return 4;
        }
        if ("USE_ATTACHMENTS".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown PdfPageMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown PdfPageMode value." : "USE_ATTACHMENTS" : "USE_OC" : "FULL_SCREEN" : "USE_THUMBS" : "USE_OUTLINES" : "USE_NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown PdfPageMode value." : "UseAttachments" : "UseOC" : "FullScreen" : "UseThumbs" : "UseOutlines" : "UseNone";
    }
}
