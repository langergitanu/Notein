package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ReplaceAction {
    public static final int REPLACE = 0;
    public static final int SKIP = 1;
    public static final int STOP = 2;
    public static final int length = 3;

    private ReplaceAction() {
    }

    public static int fromName(String str) {
        if ("REPLACE".equals(str)) {
            return 0;
        }
        if ("SKIP".equals(str)) {
            return 1;
        }
        if ("STOP".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ReplaceAction name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ReplaceAction value." : "STOP" : "SKIP" : "REPLACE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ReplaceAction value." : "Stop" : "Skip" : "Replace";
    }
}
