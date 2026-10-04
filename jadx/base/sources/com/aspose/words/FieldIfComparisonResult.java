package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FieldIfComparisonResult {
    public static final int ERROR = 0;
    public static final int FALSE = 2;
    public static final int TRUE = 1;
    public static final int length = 3;

    private FieldIfComparisonResult() {
    }

    public static int fromName(String str) {
        if ("ERROR".equals(str)) {
            return 0;
        }
        if ("TRUE".equals(str)) {
            return 1;
        }
        if ("FALSE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown FieldIfComparisonResult name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown FieldIfComparisonResult value." : "FALSE" : "TRUE" : "ERROR";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown FieldIfComparisonResult value." : "False" : "True" : "Error";
    }
}
