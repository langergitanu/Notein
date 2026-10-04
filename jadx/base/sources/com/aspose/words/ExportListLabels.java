package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ExportListLabels {
    public static final int AS_INLINE_TEXT = 1;
    public static final int AUTO = 0;
    public static final int BY_HTML_TAGS = 2;
    public static final int length = 3;

    private ExportListLabels() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("AS_INLINE_TEXT".equals(str)) {
            return 1;
        }
        if ("BY_HTML_TAGS".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ExportListLabels name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ExportListLabels value." : "BY_HTML_TAGS" : "AS_INLINE_TEXT" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ExportListLabels value." : "ByHtmlTags" : "AsInlineText" : "Auto";
    }
}
