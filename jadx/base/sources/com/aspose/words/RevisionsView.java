package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RevisionsView {
    public static final int FINAL = 1;
    public static final int ORIGINAL = 0;
    public static final int length = 2;

    private RevisionsView() {
    }

    public static int fromName(String str) {
        if ("ORIGINAL".equals(str)) {
            return 0;
        }
        if ("FINAL".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown RevisionsView name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown RevisionsView value." : "FINAL" : "ORIGINAL";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown RevisionsView value." : "Final" : "Original";
    }
}
