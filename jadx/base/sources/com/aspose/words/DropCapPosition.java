package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class DropCapPosition {
    public static final int MARGIN = 2;
    public static final int NONE = 0;
    public static final int NORMAL = 1;
    public static final int length = 3;

    private DropCapPosition() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("NORMAL".equals(str)) {
            return 1;
        }
        if ("MARGIN".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown DropCapPosition name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DropCapPosition value." : "MARGIN" : "NORMAL" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DropCapPosition value." : "Margin" : "Normal" : "None";
    }
}
