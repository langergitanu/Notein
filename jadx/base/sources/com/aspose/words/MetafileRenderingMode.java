package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MetafileRenderingMode {
    public static final int BITMAP = 2;
    public static final int VECTOR = 1;
    public static final int VECTOR_WITH_FALLBACK = 0;
    public static final int length = 3;

    private MetafileRenderingMode() {
    }

    public static int fromName(String str) {
        if ("VECTOR_WITH_FALLBACK".equals(str)) {
            return 0;
        }
        if ("VECTOR".equals(str)) {
            return 1;
        }
        if ("BITMAP".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown MetafileRenderingMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MetafileRenderingMode value." : "BITMAP" : "VECTOR" : "VECTOR_WITH_FALLBACK";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MetafileRenderingMode value." : "Bitmap" : "Vector" : "VectorWithFallback";
    }
}
