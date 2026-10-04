package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ChapterPageSeparator {
    public static final int COLON = 2;
    public static final int EM_DASH = 3;
    public static final int EN_DASH = 4;
    public static final int HYPHEN = 0;
    public static final int PERIOD = 1;
    public static final int length = 5;

    private ChapterPageSeparator() {
    }

    public static int fromName(String str) {
        if ("HYPHEN".equals(str)) {
            return 0;
        }
        if ("PERIOD".equals(str)) {
            return 1;
        }
        if ("COLON".equals(str)) {
            return 2;
        }
        if ("EM_DASH".equals(str)) {
            return 3;
        }
        if ("EN_DASH".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown ChapterPageSeparator name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown ChapterPageSeparator value." : "EN_DASH" : "EM_DASH" : "COLON" : "PERIOD" : "HYPHEN";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown ChapterPageSeparator value." : "EnDash" : "EmDash" : "Colon" : "Period" : "Hyphen";
    }
}
