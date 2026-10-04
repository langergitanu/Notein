package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ComparisonTargetType {
    public static final int CURRENT = 0;
    public static final int NEW = 1;
    public static final int length = 2;

    private ComparisonTargetType() {
    }

    public static int fromName(String str) {
        if ("CURRENT".equals(str)) {
            return 0;
        }
        if ("NEW".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ComparisonTargetType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ComparisonTargetType value." : "NEW" : "CURRENT";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ComparisonTargetType value." : "New" : "Current";
    }
}
