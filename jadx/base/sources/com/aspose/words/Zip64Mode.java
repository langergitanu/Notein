package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Zip64Mode {
    public static final int ALWAYS = 2;
    public static final int IF_NECESSARY = 1;
    public static final int NEVER = 0;
    public static final int length = 3;

    private Zip64Mode() {
    }

    public static int fromName(String str) {
        if ("NEVER".equals(str)) {
            return 0;
        }
        if ("IF_NECESSARY".equals(str)) {
            return 1;
        }
        if ("ALWAYS".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown Zip64Mode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown Zip64Mode value." : "ALWAYS" : "IF_NECESSARY" : "NEVER";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown Zip64Mode value." : "Always" : "IfNecessary" : "Never";
    }
}
