package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MarkdownListExportMode {
    public static final int MARKDOWN_SYNTAX = 0;
    public static final int PLAIN_TEXT = 1;
    public static final int length = 2;

    private MarkdownListExportMode() {
    }

    public static int fromName(String str) {
        if ("MARKDOWN_SYNTAX".equals(str)) {
            return 0;
        }
        if ("PLAIN_TEXT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown MarkdownListExportMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown MarkdownListExportMode value." : "PLAIN_TEXT" : "MARKDOWN_SYNTAX";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown MarkdownListExportMode value." : "PlainText" : "MarkdownSyntax";
    }
}
