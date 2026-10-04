package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ListTrailingCharacter {
    public static final int NOTHING = 2;
    public static final int SPACE = 1;
    public static final int TAB = 0;
    public static final int length = 3;

    private ListTrailingCharacter() {
    }

    public static int fromName(String str) {
        if ("TAB".equals(str)) {
            return 0;
        }
        if ("SPACE".equals(str)) {
            return 1;
        }
        if ("NOTHING".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ListTrailingCharacter name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ListTrailingCharacter value." : "NOTHING" : "SPACE" : "TAB";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ListTrailingCharacter value." : "Nothing" : "Space" : "Tab";
    }
}
