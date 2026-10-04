package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class DmlEffectsRenderingMode {
    public static final int FINE = 2;
    public static final int NONE = 1;
    public static final int SIMPLIFIED = 0;
    public static final int length = 3;

    private DmlEffectsRenderingMode() {
    }

    public static int fromName(String str) {
        if ("SIMPLIFIED".equals(str)) {
            return 0;
        }
        if ("NONE".equals(str)) {
            return 1;
        }
        if ("FINE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown DmlEffectsRenderingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DmlEffectsRenderingMode value." : "FINE" : "NONE" : "SIMPLIFIED";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DmlEffectsRenderingMode value." : "Fine" : "None" : "Simplified";
    }
}
