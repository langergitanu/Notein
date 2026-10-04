package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Dml3DEffectsRenderingMode {
    public static final int ADVANCED = 1;
    public static final int BASIC = 0;
    public static final int length = 2;

    private Dml3DEffectsRenderingMode() {
    }

    public static int fromName(String str) {
        if ("BASIC".equals(str)) {
            return 0;
        }
        if ("ADVANCED".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown Dml3DEffectsRenderingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown Dml3DEffectsRenderingMode value." : "ADVANCED" : "BASIC";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown Dml3DEffectsRenderingMode value." : "Advanced" : "Basic";
    }
}
