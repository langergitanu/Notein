package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FindReplaceDirection {
    public static final int BACKWARD = 1;
    public static final int FORWARD = 0;
    public static final int length = 2;

    private FindReplaceDirection() {
    }

    public static int fromName(String str) {
        if ("FORWARD".equals(str)) {
            return 0;
        }
        if ("BACKWARD".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown FindReplaceDirection name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown FindReplaceDirection value." : "BACKWARD" : "FORWARD";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown FindReplaceDirection value." : "Backward" : "Forward";
    }
}
