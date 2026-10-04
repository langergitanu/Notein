package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EndCap {
    public static final int DEFAULT = 2;
    public static final int FLAT = 2;
    public static final int ROUND = 0;
    public static final int SQUARE = 1;
    public static final int length = 4;

    private EndCap() {
    }

    public static int fromName(String str) {
        if ("ROUND".equals(str)) {
            return 0;
        }
        if ("SQUARE".equals(str)) {
            return 1;
        }
        if ("FLAT".equals(str) || "DEFAULT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown EndCap name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown EndCap value." : "FLAT | DEFAULT" : "SQUARE" : "ROUND";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown EndCap value." : "Flat | Default" : "Square" : "Round";
    }
}
