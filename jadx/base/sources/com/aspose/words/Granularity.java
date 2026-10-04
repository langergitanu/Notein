package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Granularity {
    public static final int CHAR_LEVEL = 0;
    public static final int WORD_LEVEL = 1;
    public static final int length = 2;

    private Granularity() {
    }

    public static int fromName(String str) {
        if ("CHAR_LEVEL".equals(str)) {
            return 0;
        }
        if ("WORD_LEVEL".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown Granularity name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown Granularity value." : "WORD_LEVEL" : "CHAR_LEVEL";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown Granularity value." : "WordLevel" : "CharLevel";
    }
}
