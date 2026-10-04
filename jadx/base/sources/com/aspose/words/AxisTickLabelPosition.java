package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisTickLabelPosition {
    public static final int DEFAULT = 2;
    public static final int HIGH = 0;
    public static final int LOW = 1;
    public static final int NEXT_TO_AXIS = 2;
    public static final int NONE = 3;
    public static final int length = 5;

    private AxisTickLabelPosition() {
    }

    public static int fromName(String str) {
        if ("HIGH".equals(str)) {
            return 0;
        }
        if ("LOW".equals(str)) {
            return 1;
        }
        if ("NEXT_TO_AXIS".equals(str)) {
            return 2;
        }
        if ("NONE".equals(str)) {
            return 3;
        }
        if ("DEFAULT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown AxisTickLabelPosition name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisTickLabelPosition value." : "NONE" : "NEXT_TO_AXIS | DEFAULT" : "LOW" : "HIGH";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisTickLabelPosition value." : "None" : "NextToAxis | Default" : "Low" : "High";
    }
}
