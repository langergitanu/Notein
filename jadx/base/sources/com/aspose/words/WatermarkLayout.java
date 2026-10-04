package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class WatermarkLayout {
    public static final int DIAGONAL = 315;
    public static final int HORIZONTAL = 0;
    public static final int length = 2;

    private WatermarkLayout() {
    }

    public static int fromName(String str) {
        if ("HORIZONTAL".equals(str)) {
            return 0;
        }
        if ("DIAGONAL".equals(str)) {
            return 315;
        }
        throw new IllegalArgumentException("Unknown WatermarkLayout name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 315 ? "Unknown WatermarkLayout value." : "DIAGONAL" : "HORIZONTAL";
    }

    public static int[] getValues() {
        return new int[]{0, 315};
    }

    public static String toString(int i) {
        return i != 0 ? i != 315 ? "Unknown WatermarkLayout value." : "Diagonal" : "Horizontal";
    }
}
