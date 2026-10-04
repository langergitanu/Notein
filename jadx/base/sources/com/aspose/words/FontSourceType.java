package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FontSourceType {
    public static final int FONTS_FOLDER = 1;
    public static final int FONT_FILE = 0;
    public static final int FONT_STREAM = 4;
    public static final int MEMORY_FONT = 2;
    public static final int SYSTEM_FONTS = 3;
    public static final int length = 5;

    private FontSourceType() {
    }

    public static int fromName(String str) {
        if ("FONT_FILE".equals(str)) {
            return 0;
        }
        if ("FONTS_FOLDER".equals(str)) {
            return 1;
        }
        if ("MEMORY_FONT".equals(str)) {
            return 2;
        }
        if ("SYSTEM_FONTS".equals(str)) {
            return 3;
        }
        if ("FONT_STREAM".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown FontSourceType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown FontSourceType value." : "FONT_STREAM" : "SYSTEM_FONTS" : "MEMORY_FONT" : "FONTS_FOLDER" : "FONT_FILE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown FontSourceType value." : "FontStream" : "SystemFonts" : "MemoryFont" : "FontsFolder" : "FontFile";
    }
}
