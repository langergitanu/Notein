package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TabLeader {
    public static final int DASHES = 2;
    public static final int DOTS = 1;
    public static final int HEAVY = 4;
    public static final int LINE = 3;
    public static final int MIDDLE_DOT = 5;
    public static final int NONE = 0;
    public static final int length = 6;

    private TabLeader() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("DOTS".equals(str)) {
            return 1;
        }
        if ("DASHES".equals(str)) {
            return 2;
        }
        if ("LINE".equals(str)) {
            return 3;
        }
        if ("HEAVY".equals(str)) {
            return 4;
        }
        if ("MIDDLE_DOT".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown TabLeader name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TabLeader value." : "MIDDLE_DOT" : "HEAVY" : "LINE" : "DASHES" : "DOTS" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TabLeader value." : "MiddleDot" : "Heavy" : "Line" : "Dashes" : "Dots" : "None";
    }
}
