package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FootnoteNumberingRule {
    public static final int CONTINUOUS = 0;
    public static final int DEFAULT = 0;
    public static final int RESTART_PAGE = 2;
    public static final int RESTART_SECTION = 1;
    public static final int length = 4;

    private FootnoteNumberingRule() {
    }

    public static int fromName(String str) {
        if ("CONTINUOUS".equals(str)) {
            return 0;
        }
        if ("RESTART_SECTION".equals(str)) {
            return 1;
        }
        if ("RESTART_PAGE".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown FootnoteNumberingRule name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown FootnoteNumberingRule value." : "RESTART_PAGE" : "RESTART_SECTION" : "CONTINUOUS | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown FootnoteNumberingRule value." : "RestartPage" : "RestartSection" : "Continuous | Default";
    }
}
