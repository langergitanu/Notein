package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EndnotePosition {
    public static final int END_OF_DOCUMENT = 3;
    public static final int END_OF_SECTION = 0;
    public static final int length = 2;

    private EndnotePosition() {
    }

    public static int fromName(String str) {
        if ("END_OF_SECTION".equals(str)) {
            return 0;
        }
        if ("END_OF_DOCUMENT".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown EndnotePosition name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 3 ? "Unknown EndnotePosition value." : "END_OF_DOCUMENT" : "END_OF_SECTION";
    }

    public static int[] getValues() {
        return new int[]{0, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 3 ? "Unknown EndnotePosition value." : "EndOfDocument" : "EndOfSection";
    }
}
