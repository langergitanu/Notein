package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AutoFitBehavior {
    public static final int AUTO_FIT_TO_CONTENTS = 0;
    public static final int AUTO_FIT_TO_WINDOW = 1;
    public static final int FIXED_COLUMN_WIDTHS = 2;
    public static final int length = 3;

    private AutoFitBehavior() {
    }

    public static int fromName(String str) {
        if ("AUTO_FIT_TO_CONTENTS".equals(str)) {
            return 0;
        }
        if ("AUTO_FIT_TO_WINDOW".equals(str)) {
            return 1;
        }
        if ("FIXED_COLUMN_WIDTHS".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown AutoFitBehavior name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown AutoFitBehavior value." : "FIXED_COLUMN_WIDTHS" : "AUTO_FIT_TO_WINDOW" : "AUTO_FIT_TO_CONTENTS";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown AutoFitBehavior value." : "FixedColumnWidths" : "AutoFitToWindow" : "AutoFitToContents";
    }
}
