package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class LineSpacingRule {
    public static final int AT_LEAST = 0;
    public static final int EXACTLY = 1;
    public static final int MULTIPLE = 2;
    public static final int length = 3;

    private LineSpacingRule() {
    }

    public static int fromName(String str) {
        if ("AT_LEAST".equals(str)) {
            return 0;
        }
        if ("EXACTLY".equals(str)) {
            return 1;
        }
        if ("MULTIPLE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown LineSpacingRule name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown LineSpacingRule value." : "MULTIPLE" : "EXACTLY" : "AT_LEAST";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown LineSpacingRule value." : "Multiple" : "Exactly" : "AtLeast";
    }
}
