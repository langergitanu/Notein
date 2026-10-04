package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Direction {
    public static final int BTT = 3;
    public static final int DEFAULT = 0;
    public static final int LTR = 0;
    public static final int RTL = 1;
    public static final int TTB = 2;
    public static final int length = 5;

    private Direction() {
    }

    public static int fromName(String str) {
        if ("DEFAULT".equals(str) || "LTR".equals(str)) {
            return 0;
        }
        if ("RTL".equals(str)) {
            return 1;
        }
        if ("TTB".equals(str)) {
            return 2;
        }
        if ("BTT".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown Direction name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown Direction value." : "BTT" : "TTB" : "RTL" : "DEFAULT | LTR";
    }

    public static int[] getValues() {
        return new int[]{0, 0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown Direction value." : "BTT" : "TTB" : "RTL" : "Default | LTR";
    }
}
