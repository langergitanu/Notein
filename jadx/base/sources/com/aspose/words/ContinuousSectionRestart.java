package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ContinuousSectionRestart {
    public static final int ALWAYS = 0;
    public static final int FROM_NEW_PAGE_ONLY = 1;
    public static final int length = 2;

    private ContinuousSectionRestart() {
    }

    public static int fromName(String str) {
        if ("ALWAYS".equals(str)) {
            return 0;
        }
        if ("FROM_NEW_PAGE_ONLY".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ContinuousSectionRestart name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ContinuousSectionRestart value." : "FROM_NEW_PAGE_ONLY" : "ALWAYS";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ContinuousSectionRestart value." : "FromNewPageOnly" : "Always";
    }
}
