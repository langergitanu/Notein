package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HeightRule {
    public static final int AT_LEAST = 0;
    public static final int AUTO = 2;
    public static final int EXACTLY = 1;
    public static final int length = 3;

    private HeightRule() {
    }

    public static int fromName(String str) {
        if ("AT_LEAST".equals(str)) {
            return 0;
        }
        if ("EXACTLY".equals(str)) {
            return 1;
        }
        if ("AUTO".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown HeightRule name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HeightRule value." : "AUTO" : "EXACTLY" : "AT_LEAST";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HeightRule value." : "Auto" : "Exactly" : "AtLeast";
    }
}
