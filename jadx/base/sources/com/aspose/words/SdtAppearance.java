package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SdtAppearance {
    public static final int BOUNDING_BOX = 0;
    public static final int DEFAULT = 0;
    public static final int HIDDEN = 2;
    public static final int TAGS = 1;
    public static final int length = 4;

    private SdtAppearance() {
    }

    public static int fromName(String str) {
        if ("BOUNDING_BOX".equals(str)) {
            return 0;
        }
        if ("TAGS".equals(str)) {
            return 1;
        }
        if ("HIDDEN".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown SdtAppearance name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown SdtAppearance value." : "HIDDEN" : "TAGS" : "BOUNDING_BOX | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown SdtAppearance value." : "Hidden" : "Tags" : "BoundingBox | Default";
    }
}
