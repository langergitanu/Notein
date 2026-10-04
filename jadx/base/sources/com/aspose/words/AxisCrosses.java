package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisCrosses {
    public static final int AUTOMATIC = 0;
    public static final int CUSTOM = 3;
    public static final int MAXIMUM = 1;
    public static final int MINIMUM = 2;
    public static final int length = 4;

    private AxisCrosses() {
    }

    public static int fromName(String str) {
        if ("AUTOMATIC".equals(str)) {
            return 0;
        }
        if ("MAXIMUM".equals(str)) {
            return 1;
        }
        if ("MINIMUM".equals(str)) {
            return 2;
        }
        if ("CUSTOM".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown AxisCrosses name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisCrosses value." : "CUSTOM" : "MINIMUM" : "MAXIMUM" : "AUTOMATIC";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown AxisCrosses value." : "Custom" : "Minimum" : "Maximum" : "Automatic";
    }
}
