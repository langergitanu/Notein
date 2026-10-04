package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MarkdownLinkExportMode {
    public static final int AUTO = 0;
    public static final int INLINE = 1;
    public static final int REFERENCE = 2;
    public static final int length = 3;

    private MarkdownLinkExportMode() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("INLINE".equals(str)) {
            return 1;
        }
        if ("REFERENCE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown MarkdownLinkExportMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MarkdownLinkExportMode value." : "REFERENCE" : "INLINE" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MarkdownLinkExportMode value." : "Reference" : "Inline" : "Auto";
    }
}
