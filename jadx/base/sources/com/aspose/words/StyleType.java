package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class StyleType {
    public static final int CHARACTER = 2;
    public static final int LIST = 4;
    public static final int PARAGRAPH = 1;
    public static final int TABLE = 3;
    public static final int length = 4;

    private StyleType() {
    }

    public static int fromName(String str) {
        if ("PARAGRAPH".equals(str)) {
            return 1;
        }
        if ("CHARACTER".equals(str)) {
            return 2;
        }
        if ("TABLE".equals(str)) {
            return 3;
        }
        if ("LIST".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown StyleType name.");
    }

    public static String getName(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown StyleType value." : "LIST" : "TABLE" : "CHARACTER" : "PARAGRAPH";
    }

    public static int[] getValues() {
        return new int[]{1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown StyleType value." : "List" : "Table" : "Character" : "Paragraph";
    }
}
