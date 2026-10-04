package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextWrapping {
    public static final int AROUND = 1;
    public static final int DEFAULT = 0;
    public static final int NONE = 0;
    public static final int length = 3;

    private TextWrapping() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("AROUND".equals(str)) {
            return 1;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown TextWrapping name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown TextWrapping value." : "AROUND" : "NONE | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown TextWrapping value." : "Around" : "None | Default";
    }
}
