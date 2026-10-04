package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ImagePixelFormat {
    public static final int FORMAT_16_BPP_ARGB_1555 = 2;
    public static final int FORMAT_16_BPP_RGB_555 = 0;
    public static final int FORMAT_16_BPP_RGB_565 = 1;
    public static final int FORMAT_1_BPP_INDEXED = 10;
    public static final int FORMAT_24_BPP_RGB = 3;
    public static final int FORMAT_32_BPP_ARGB = 5;
    public static final int FORMAT_32_BPP_P_ARGB = 6;
    public static final int FORMAT_32_BPP_RGB = 4;
    public static final int FORMAT_48_BPP_RGB = 7;
    public static final int FORMAT_64_BPP_ARGB = 8;
    public static final int FORMAT_64_BPP_P_ARGB = 9;
    public static final int length = 11;

    private ImagePixelFormat() {
    }

    public static int fromName(String str) {
        if ("FORMAT_16_BPP_RGB_555".equals(str)) {
            return 0;
        }
        if ("FORMAT_16_BPP_RGB_565".equals(str)) {
            return 1;
        }
        if ("FORMAT_16_BPP_ARGB_1555".equals(str)) {
            return 2;
        }
        if ("FORMAT_24_BPP_RGB".equals(str)) {
            return 3;
        }
        if ("FORMAT_32_BPP_RGB".equals(str)) {
            return 4;
        }
        if ("FORMAT_32_BPP_ARGB".equals(str)) {
            return 5;
        }
        if ("FORMAT_32_BPP_P_ARGB".equals(str)) {
            return 6;
        }
        if ("FORMAT_48_BPP_RGB".equals(str)) {
            return 7;
        }
        if ("FORMAT_64_BPP_ARGB".equals(str)) {
            return 8;
        }
        if ("FORMAT_64_BPP_P_ARGB".equals(str)) {
            return 9;
        }
        if ("FORMAT_1_BPP_INDEXED".equals(str)) {
            return 10;
        }
        throw new IllegalArgumentException("Unknown ImagePixelFormat name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "FORMAT_16_BPP_RGB_555";
            case 1:
                return "FORMAT_16_BPP_RGB_565";
            case 2:
                return "FORMAT_16_BPP_ARGB_1555";
            case 3:
                return "FORMAT_24_BPP_RGB";
            case 4:
                return "FORMAT_32_BPP_RGB";
            case 5:
                return "FORMAT_32_BPP_ARGB";
            case 6:
                return "FORMAT_32_BPP_P_ARGB";
            case 7:
                return "FORMAT_48_BPP_RGB";
            case 8:
                return "FORMAT_64_BPP_ARGB";
            case 9:
                return "FORMAT_64_BPP_P_ARGB";
            case 10:
                return "FORMAT_1_BPP_INDEXED";
            default:
                return "Unknown ImagePixelFormat value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Format16BppRgb555";
            case 1:
                return "Format16BppRgb565";
            case 2:
                return "Format16BppArgb1555";
            case 3:
                return "Format24BppRgb";
            case 4:
                return "Format32BppRgb";
            case 5:
                return "Format32BppArgb";
            case 6:
                return "Format32BppPArgb";
            case 7:
                return "Format48BppRgb";
            case 8:
                return "Format64BppArgb";
            case 9:
                return "Format64BppPArgb";
            case 10:
                return "Format1bppIndexed";
            default:
                return "Unknown ImagePixelFormat value.";
        }
    }
}
