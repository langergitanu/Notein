package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class CompressionLevel {
    public static final int FAST = 2;
    public static final int MAXIMUM = 1;
    public static final int NORMAL = 0;
    public static final int SUPER_FAST = 3;
    public static final int length = 4;

    private CompressionLevel() {
    }

    public static int fromName(String str) {
        if ("NORMAL".equals(str)) {
            return 0;
        }
        if ("MAXIMUM".equals(str)) {
            return 1;
        }
        if ("FAST".equals(str)) {
            return 2;
        }
        if ("SUPER_FAST".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown CompressionLevel name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown CompressionLevel value." : "SUPER_FAST" : "FAST" : "MAXIMUM" : "NORMAL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown CompressionLevel value." : "SuperFast" : "Fast" : "Maximum" : "Normal";
    }
}
