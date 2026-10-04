package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisTimeUnit {
    public static final int AUTOMATIC = 0;
    public static final int DAYS = 1;
    public static final int MONTHS = 2;
    public static final int YEARS = 3;
    public static final int length = 4;

    private AxisTimeUnit() {
    }

    public static int fromName(String str) {
        if ("AUTOMATIC".equals(str)) {
            return 0;
        }
        if ("DAYS".equals(str)) {
            return 1;
        }
        if ("MONTHS".equals(str)) {
            return 2;
        }
        if ("YEARS".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown AxisTimeUnit name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisTimeUnit value." : "YEARS" : "MONTHS" : "DAYS" : "AUTOMATIC";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisTimeUnit value." : "Years" : "Months" : "Days" : "Automatic";
    }
}
