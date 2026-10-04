package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class BaselineAlignment {
    public static final int AUTO = 4;
    public static final int BASELINE = 2;
    public static final int BOTTOM = 3;
    public static final int CENTER = 1;
    public static final int TOP = 0;
    public static final int length = 5;

    private BaselineAlignment() {
    }

    public static int fromName(String str) {
        if ("TOP".equals(str)) {
            return 0;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("BASELINE".equals(str)) {
            return 2;
        }
        if ("BOTTOM".equals(str)) {
            return 3;
        }
        if ("AUTO".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown BaselineAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown BaselineAlignment value." : "AUTO" : "BOTTOM" : "BASELINE" : "CENTER" : "TOP";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown BaselineAlignment value." : "Auto" : "Bottom" : "Baseline" : "Center" : "Top";
    }
}
