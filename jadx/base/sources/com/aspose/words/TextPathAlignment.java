package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextPathAlignment {
    public static final int CENTER = 1;
    public static final int LEFT = 2;
    public static final int LETTER_JUSTIFY = 4;
    public static final int RIGHT = 3;
    public static final int STRETCH = 0;
    public static final int WORD_JUSTIFY = 5;
    public static final int length = 6;

    private TextPathAlignment() {
    }

    public static int fromName(String str) {
        if ("STRETCH".equals(str)) {
            return 0;
        }
        if ("CENTER".equals(str)) {
            return 1;
        }
        if ("LEFT".equals(str)) {
            return 2;
        }
        if ("RIGHT".equals(str)) {
            return 3;
        }
        if ("LETTER_JUSTIFY".equals(str)) {
            return 4;
        }
        if ("WORD_JUSTIFY".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown TextPathAlignment name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TextPathAlignment value." : "WORD_JUSTIFY" : "LETTER_JUSTIFY" : "RIGHT" : "LEFT" : "CENTER" : "STRETCH";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TextPathAlignment value." : "WordJustify" : "LetterJustify" : "Right" : "Left" : "Center" : "Stretch";
    }
}
