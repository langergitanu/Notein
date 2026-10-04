package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SvgTextOutputMode {
    public static final int USE_PLACED_GLYPHS = 2;
    public static final int USE_SVG_FONTS = 0;
    public static final int USE_TARGET_MACHINE_FONTS = 1;
    public static final int length = 3;

    private SvgTextOutputMode() {
    }

    public static int fromName(String str) {
        if ("USE_SVG_FONTS".equals(str)) {
            return 0;
        }
        if ("USE_TARGET_MACHINE_FONTS".equals(str)) {
            return 1;
        }
        if ("USE_PLACED_GLYPHS".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown SvgTextOutputMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown SvgTextOutputMode value." : "USE_PLACED_GLYPHS" : "USE_TARGET_MACHINE_FONTS" : "USE_SVG_FONTS";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown SvgTextOutputMode value." : "UsePlacedGlyphs" : "UseTargetMachineFonts" : "UseSvgFonts";
    }
}
