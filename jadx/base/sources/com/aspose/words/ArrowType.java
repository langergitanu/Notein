package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ArrowType {
    public static final int ARROW = 1;
    public static final int DEFAULT = 0;
    public static final int DIAMOND = 3;
    public static final int NONE = 0;
    public static final int OPEN = 5;
    public static final int OVAL = 4;
    public static final int STEALTH = 2;
    public static final int length = 7;

    private ArrowType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("ARROW".equals(str)) {
            return 1;
        }
        if ("STEALTH".equals(str)) {
            return 2;
        }
        if ("DIAMOND".equals(str)) {
            return 3;
        }
        if ("OVAL".equals(str)) {
            return 4;
        }
        if ("OPEN".equals(str)) {
            return 5;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown ArrowType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown ArrowType value." : "OPEN" : "OVAL" : "DIAMOND" : "STEALTH" : "ARROW" : "NONE | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown ArrowType value." : "Open" : "Oval" : "Diamond" : "Stealth" : "Arrow" : "None | Default";
    }
}
