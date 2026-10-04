package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class LineNumberRestartMode {
    public static final int CONTINUOUS = 2;
    public static final int RESTART_PAGE = 0;
    public static final int RESTART_SECTION = 1;
    public static final int length = 3;

    private LineNumberRestartMode() {
    }

    public static int fromName(String str) {
        if ("RESTART_PAGE".equals(str)) {
            return 0;
        }
        if ("RESTART_SECTION".equals(str)) {
            return 1;
        }
        if ("CONTINUOUS".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown LineNumberRestartMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown LineNumberRestartMode value." : "CONTINUOUS" : "RESTART_SECTION" : "RESTART_PAGE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown LineNumberRestartMode value." : "Continuous" : "RestartSection" : "RestartPage";
    }
}
