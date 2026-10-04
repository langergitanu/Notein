package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FootnoteType {
    public static final int ENDNOTE = 1;
    public static final int FOOTNOTE = 0;
    public static final int length = 2;

    private FootnoteType() {
    }

    public static int fromName(String str) {
        if ("FOOTNOTE".equals(str)) {
            return 0;
        }
        if ("ENDNOTE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown FootnoteType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown FootnoteType value." : "ENDNOTE" : "FOOTNOTE";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown FootnoteType value." : "Endnote" : "Footnote";
    }
}
