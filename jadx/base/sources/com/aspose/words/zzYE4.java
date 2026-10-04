package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE4 {
    static String[] zzXpE = {"None", "TextUnknown", "Text", "EmSpace", "EnSpace", "Em14Space", "NonBreakingSpace", "EmDash", "EnDash", "NonBreakingHyphen", "OptionalHyphen", "ZeroWidthNonJoiner", "ZeroWidthJoiner", "Story", "Section", "Table", "Row", "Cell", "ParagraphUnknown", "Paragraph", "Page", "Column", "Line", "ParagraphInline", "Wrap", "Shape"};
    static int[] zzXpD = {0, 8192, EditingLanguage.ARABIC_OMAN, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 16519, 16481, 16475, 16466, 16457, 16416, 16417, 16412, 16403, EditingLanguage.SPANISH_BOLIVIA, 16395, EditingLanguage.ENGLISH_INDIA, 24580};
    private static char[] zzXpC = {ControlChar.SPACE_CHAR, '\t'};

    private static int zzmK(int i) {
        if (zzmW(i)) {
            return i & StyleIdentifier.LIGHT_GRID_ACCENT_6;
        }
        return 0;
    }

    public static boolean zzmL(int i) {
        return zzmK(i) >= zzmK(16475);
    }

    public static boolean zzmM(int i) {
        return zzmK(i) >= zzmK(16466);
    }

    public static boolean zzmN(int i) {
        return zzmK(i) >= zzmK(16457);
    }

    public static boolean zzmO(int i) {
        return zzmK(i) >= zzmK(16417);
    }

    public static boolean zzmP(int i) {
        return zzmK(i) >= zzmK(16481);
    }

    public static boolean zzmQ(int i) {
        return zzmK(i) < zzmK(16417);
    }

    public static boolean zzmR(int i) {
        return zzmW(i) && (i & 224) == 32;
    }

    public static boolean zzmS(int i) {
        return zzmW(i) && (i & 224) == 64;
    }

    public static boolean zzmT(int i) {
        return zzmW(i) && (i & 224) == 96;
    }

    public static boolean zzmU(int i) {
        return zzmW(i) && (i & 224) == 128;
    }

    public static boolean zzmV(int i) {
        return zzmW(i) && (i & 224) == 0;
    }

    public static boolean zzmW(int i) {
        return (i & 57344) == 16384;
    }

    public static boolean zzmX(int i) {
        return zzmY(i) && (i & 255) >= 16;
    }

    public static boolean zzmY(int i) {
        return 8192 == (i & 57344);
    }
}
