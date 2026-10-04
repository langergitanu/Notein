package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HeaderFooterBookmarksExportMode {
    public static final int ALL = 2;
    public static final int FIRST = 1;
    public static final int NONE = 0;
    public static final int length = 3;

    private HeaderFooterBookmarksExportMode() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("FIRST".equals(str)) {
            return 1;
        }
        if ("ALL".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown HeaderFooterBookmarksExportMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HeaderFooterBookmarksExportMode value." : "ALL" : "FIRST" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown HeaderFooterBookmarksExportMode value." : "All" : "First" : "None";
    }
}
