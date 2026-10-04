package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MergeFieldImageDimensionUnit {
    public static final int PERCENT = 1;
    public static final int POINT = 0;
    public static final int length = 2;

    private MergeFieldImageDimensionUnit() {
    }

    public static int fromName(String str) {
        if ("POINT".equals(str)) {
            return 0;
        }
        if ("PERCENT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown MergeFieldImageDimensionUnit name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown MergeFieldImageDimensionUnit value." : "PERCENT" : "POINT";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown MergeFieldImageDimensionUnit value." : "Percent" : "Point";
    }
}
