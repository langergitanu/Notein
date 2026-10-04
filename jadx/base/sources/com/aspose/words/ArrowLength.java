package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ArrowLength {
    public static final int DEFAULT = 0;
    public static final int LONG = 2;
    public static final int MEDIUM = 1;
    public static final int SHORT = 0;
    public static final int length = 4;

    private ArrowLength() {
    }

    public static int fromName(String str) {
        if ("SHORT".equals(str)) {
            return 0;
        }
        if ("MEDIUM".equals(str)) {
            return 1;
        }
        if ("LONG".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown ArrowLength name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ArrowLength value." : "LONG" : "MEDIUM" : "SHORT | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ArrowLength value." : "Long" : "Medium" : "Short | Default";
    }
}
