package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class OfficeMathJustification {
    public static final int CENTER = 2;
    public static final int CENTER_GROUP = 1;
    public static final int DEFAULT = 1;
    public static final int INLINE = 7;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    public static final int length = 6;

    private OfficeMathJustification() {
    }

    public static int fromName(String str) {
        if ("CENTER_GROUP".equals(str)) {
            return 1;
        }
        if ("CENTER".equals(str)) {
            return 2;
        }
        if ("LEFT".equals(str)) {
            return 3;
        }
        if ("RIGHT".equals(str)) {
            return 4;
        }
        if ("INLINE".equals(str)) {
            return 7;
        }
        if ("DEFAULT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown OfficeMathJustification name.");
    }

    public static String getName(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? "Unknown OfficeMathJustification value." : "INLINE" : "RIGHT" : "LEFT" : "CENTER" : "CENTER_GROUP | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{1, 2, 3, 4, 7, 1};
    }

    public static String toString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? "Unknown OfficeMathJustification value." : "Inline" : "Right" : "Left" : "Center" : "CenterGroup | Default";
    }
}
