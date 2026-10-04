package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PreferredWidthType {
    public static final int AUTO = 1;
    public static final int PERCENT = 2;
    public static final int POINTS = 3;
    public static final int length = 3;

    private PreferredWidthType() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 1;
        }
        if ("PERCENT".equals(str)) {
            return 2;
        }
        if ("POINTS".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown PreferredWidthType name.");
    }

    public static String getName(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown PreferredWidthType value." : "POINTS" : "PERCENT" : "AUTO";
    }

    public static int[] getValues() {
        return new int[]{1, 2, 3};
    }

    public static String toString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown PreferredWidthType value." : "Points" : "Percent" : "Auto";
    }
}
