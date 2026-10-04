package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SectionLayoutMode {
    public static final int DEFAULT = 0;
    public static final int GRID = 1;
    public static final int LINE_GRID = 2;
    public static final int SNAP_TO_CHARS = 3;
    public static final int length = 4;

    private SectionLayoutMode() {
    }

    public static int fromName(String str) {
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        if ("GRID".equals(str)) {
            return 1;
        }
        if ("LINE_GRID".equals(str)) {
            return 2;
        }
        if ("SNAP_TO_CHARS".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown SectionLayoutMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown SectionLayoutMode value." : "SNAP_TO_CHARS" : "LINE_GRID" : "GRID" : "DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown SectionLayoutMode value." : "SnapToChars" : "LineGrid" : "Grid" : "Default";
    }
}
