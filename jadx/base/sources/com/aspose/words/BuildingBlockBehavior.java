package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class BuildingBlockBehavior {
    public static final int CONTENT = 0;
    public static final int DEFAULT = 0;
    public static final int PAGE = 2;
    public static final int PARAGRAPH = 1;
    public static final int length = 4;

    private BuildingBlockBehavior() {
    }

    public static int fromName(String str) {
        if ("CONTENT".equals(str)) {
            return 0;
        }
        if ("PARAGRAPH".equals(str)) {
            return 1;
        }
        if ("PAGE".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown BuildingBlockBehavior name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown BuildingBlockBehavior value." : "PAGE" : "PARAGRAPH" : "CONTENT | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown BuildingBlockBehavior value." : "Page" : "Paragraph" : "Content | Default";
    }
}
