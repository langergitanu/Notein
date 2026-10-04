package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class WatermarkType {
    public static final int IMAGE = 1;
    public static final int NONE = 2;
    public static final int TEXT = 0;
    public static final int length = 3;

    private WatermarkType() {
    }

    public static int fromName(String str) {
        if ("TEXT".equals(str)) {
            return 0;
        }
        if ("IMAGE".equals(str)) {
            return 1;
        }
        if ("NONE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown WatermarkType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown WatermarkType value." : "NONE" : "IMAGE" : "TEXT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown WatermarkType value." : "None" : "Image" : "Text";
    }
}
