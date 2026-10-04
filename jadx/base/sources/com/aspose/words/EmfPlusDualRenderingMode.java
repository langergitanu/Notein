package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EmfPlusDualRenderingMode {
    public static final int EMF = 2;
    public static final int EMF_PLUS = 1;
    public static final int EMF_PLUS_WITH_FALLBACK = 0;
    public static final int length = 3;

    private EmfPlusDualRenderingMode() {
    }

    public static int fromName(String str) {
        if ("EMF_PLUS_WITH_FALLBACK".equals(str)) {
            return 0;
        }
        if ("EMF_PLUS".equals(str)) {
            return 1;
        }
        if ("EMF".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown EmfPlusDualRenderingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown EmfPlusDualRenderingMode value." : "EMF" : "EMF_PLUS" : "EMF_PLUS_WITH_FALLBACK";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown EmfPlusDualRenderingMode value." : "Emf" : "EmfPlus" : "EmfPlusWithFallback";
    }
}
