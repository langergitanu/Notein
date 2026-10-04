package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextDmlEffect {
    public static final int EFFECT_3_D = 4;
    public static final int FILL = 1;
    public static final int GLOW = 0;
    public static final int OUTLINE = 3;
    public static final int REFLECTION = 5;
    public static final int SHADOW = 2;
    public static final int length = 6;

    private TextDmlEffect() {
    }

    public static int fromName(String str) {
        if ("GLOW".equals(str)) {
            return 0;
        }
        if ("FILL".equals(str)) {
            return 1;
        }
        if ("SHADOW".equals(str)) {
            return 2;
        }
        if ("OUTLINE".equals(str)) {
            return 3;
        }
        if ("EFFECT_3_D".equals(str)) {
            return 4;
        }
        if ("REFLECTION".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown TextDmlEffect name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TextDmlEffect value." : "REFLECTION" : "EFFECT_3_D" : "OUTLINE" : "SHADOW" : "FILL" : "GLOW";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TextDmlEffect value." : "Reflection" : "Effect3D" : "Outline" : "Shadow" : "Fill" : "Glow";
    }
}
