package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TabAlignment {
    public static final int BAR = 4;
    public static final int CENTER = 1;
    public static final int CLEAR = 7;
    public static final int DECIMAL = 3;
    public static final int LEFT = 0;
    public static final int LIST = 6;
    public static final int RIGHT = 2;
    public static final int length = 7;

    private TabAlignment() {
    }

    public static int fromName(String str) {
        if ("LEFT".equals(str)) {
            return 0;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("RIGHT".equals(str)) {
            return 2;
        }
        if ("DECIMAL".equals(str)) {
            return 3;
        }
        if ("BAR".equals(str)) {
            return 4;
        }
        if ("LIST".equals(str)) {
            return 6;
        }
        if ("CLEAR".equals(str)) {
            return 7;
        }
        throw new IllegalArgumentException("Unknown TabAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? "Unknown TabAlignment value." : "CLEAR" : "LIST" : "BAR" : "DECIMAL" : "RIGHT" : "CENTER" : "LEFT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 6, 7};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? "Unknown TabAlignment value." : "Clear" : "List" : "Bar" : "Decimal" : "Right" : "Center" : "Left";
    }
}
