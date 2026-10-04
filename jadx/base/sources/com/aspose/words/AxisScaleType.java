package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisScaleType {
    public static final int LINEAR = 0;
    public static final int LOGARITHMIC = 1;
    public static final int length = 2;

    private AxisScaleType() {
    }

    public static int fromName(String str) {
        if ("LINEAR".equals(str)) {
            return 0;
        }
        if ("LOGARITHMIC".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown AxisScaleType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown AxisScaleType value." : "LOGARITHMIC" : "LINEAR";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown AxisScaleType value." : "Logarithmic" : "Linear";
    }
}
