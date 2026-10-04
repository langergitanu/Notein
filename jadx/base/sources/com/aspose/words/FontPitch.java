package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FontPitch {
    public static final int DEFAULT = 0;
    public static final int FIXED = 1;
    public static final int VARIABLE = 2;
    public static final int length = 3;

    private FontPitch() {
    }

    public static int fromName(String str) {
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        if ("FIXED".equals(str)) {
            return 1;
        }
        if ("VARIABLE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown FontPitch name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown FontPitch value." : "VARIABLE" : "FIXED" : "DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown FontPitch value." : "Variable" : "Fixed" : "Default";
    }
}
