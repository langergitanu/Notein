package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfFontEmbeddingMode {
    public static final int EMBED_ALL = 0;
    public static final int EMBED_NONE = 2;
    public static final int EMBED_NONSTANDARD = 1;
    public static final int length = 3;

    private PdfFontEmbeddingMode() {
    }

    public static int fromName(String str) {
        if ("EMBED_ALL".equals(str)) {
            return 0;
        }
        if ("EMBED_NONSTANDARD".equals(str)) {
            return 1;
        }
        if ("EMBED_NONE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown PdfFontEmbeddingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown PdfFontEmbeddingMode value." : "EMBED_NONE" : "EMBED_NONSTANDARD" : "EMBED_ALL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown PdfFontEmbeddingMode value." : "EmbedNone" : "EmbedNonstandard" : "EmbedAll";
    }
}
