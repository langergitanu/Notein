package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ArrowWidth {
    public static final int DEFAULT = 0;
    public static final int MEDIUM = 1;
    public static final int NARROW = 0;
    public static final int WIDE = 2;
    public static final int length = 4;

    private ArrowWidth() {
    }

    public static int fromName(String str) {
        if ("NARROW".equals(str)) {
            return 0;
        }
        if ("MEDIUM".equals(str)) {
            return 1;
        }
        if ("WIDE".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown ArrowWidth name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ArrowWidth value." : "WIDE" : "MEDIUM" : "NARROW | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ArrowWidth value." : "Wide" : "Medium" : "Narrow | Default";
    }
}
