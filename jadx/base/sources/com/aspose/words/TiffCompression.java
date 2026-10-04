package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TiffCompression {
    public static final int CCITT_3 = 3;
    public static final int CCITT_4 = 4;
    public static final int LZW = 2;
    public static final int NONE = 0;
    public static final int RLE = 1;
    public static final int length = 5;

    private TiffCompression() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("RLE".equals(str)) {
            return 1;
        }
        if ("LZW".equals(str)) {
            return 2;
        }
        if ("CCITT_3".equals(str)) {
            return 3;
        }
        if ("CCITT_4".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown TiffCompression name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown TiffCompression value." : "CCITT_4" : "CCITT_3" : "LZW" : "RLE" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown TiffCompression value." : "Ccitt4" : "Ccitt3" : "Lzw" : "Rle" : "None";
    }
}
