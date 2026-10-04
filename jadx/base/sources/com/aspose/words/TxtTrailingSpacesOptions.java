package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TxtTrailingSpacesOptions {
    public static final int PRESERVE = 1;
    public static final int TRIM = 0;
    public static final int length = 2;

    private TxtTrailingSpacesOptions() {
    }

    public static int fromName(String str) {
        if ("TRIM".equals(str)) {
            return 0;
        }
        if ("PRESERVE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown TxtTrailingSpacesOptions name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown TxtTrailingSpacesOptions value." : "PRESERVE" : "TRIM";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown TxtTrailingSpacesOptions value." : "Preserve" : "Trim";
    }
}
