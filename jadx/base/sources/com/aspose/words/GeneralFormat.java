package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class GeneralFormat {
    public static final int AIUEO = 1;
    public static final int ARABIC = 4;
    public static final int ARABIC_ABJAD = 5;
    public static final int ARABIC_ALPHA = 6;
    public static final int ARABIC_DASH = 7;
    public static final int BAHT_TEXT = 8;
    public static final int CAPS = 49;
    public static final int CARD_TEXT = 9;
    public static final int CHAR_FORMAT = 53;
    public static final int CHINESE_NUM_1 = 10;
    public static final int CHINESE_NUM_2 = 11;
    public static final int CHINESE_NUM_3 = 12;
    public static final int CHOSUNG = 13;
    public static final int CIRCLE_NUM = 14;
    public static final int DB_CHAR = 15;
    public static final int DB_NUM_1 = 16;
    public static final int DB_NUM_2 = 17;
    public static final int DB_NUM_3 = 18;
    public static final int DB_NUM_4 = 19;
    public static final int DOLLAR_TEXT = 20;
    public static final int FIRST_CAP = 50;
    public static final int GANADA = 21;
    public static final int GB_1 = 22;
    public static final int GB_2 = 23;
    public static final int GB_3 = 24;
    public static final int GB_4 = 25;
    public static final int HEBREW_1 = 26;
    public static final int HEBREW_2 = 27;
    public static final int HEX = 28;
    public static final int HINDI_ARABIC = 29;
    public static final int HINDI_CARD_TEXT = 30;
    public static final int HINDI_LETTER_1 = 31;
    public static final int HINDI_LETTER_2 = 32;
    public static final int IROHA = 33;
    public static final int KANJI_NUM_1 = 34;
    public static final int KANJI_NUM_2 = 35;
    public static final int KANJI_NUM_3 = 36;
    public static final int LOWER = 51;
    public static final int LOWERCASE_ALPHABETIC = 3;
    public static final int LOWERCASE_ROMAN = 40;
    public static final int MERGE_FORMAT = 54;
    public static final int MERGE_FORMAT_INET = 55;
    public static final int NONE = 0;
    public static final int ORDINAL = 37;
    public static final int ORD_TEXT = 38;
    public static final int SB_CHAR = 41;
    public static final int THAI_ARABIC = 42;
    public static final int THAI_CARD_TEXT = 43;
    public static final int THAI_LETTER = 44;
    public static final int UPPER = 52;
    public static final int UPPERCASE_ALPHABETIC = 2;
    public static final int UPPERCASE_ROMAN = 39;
    public static final int VIET_CARD_TEXT = 45;
    public static final int ZODIAC_1 = 46;
    public static final int ZODIAC_2 = 47;
    public static final int ZODIAC_3 = 48;
    public static final int length = 56;

    private GeneralFormat() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("AIUEO".equals(str)) {
            return 1;
        }
        if ("UPPERCASE_ALPHABETIC".equals(str)) {
            return 2;
        }
        if ("LOWERCASE_ALPHABETIC".equals(str)) {
            return 3;
        }
        if ("ARABIC".equals(str)) {
            return 4;
        }
        if ("ARABIC_ABJAD".equals(str)) {
            return 5;
        }
        if ("ARABIC_ALPHA".equals(str)) {
            return 6;
        }
        if ("ARABIC_DASH".equals(str)) {
            return 7;
        }
        if ("BAHT_TEXT".equals(str)) {
            return 8;
        }
        if ("CARD_TEXT".equals(str)) {
            return 9;
        }
        if ("CHINESE_NUM_1".equals(str)) {
            return 10;
        }
        if ("CHINESE_NUM_2".equals(str)) {
            return 11;
        }
        if ("CHINESE_NUM_3".equals(str)) {
            return 12;
        }
        if ("CHOSUNG".equals(str)) {
            return 13;
        }
        if ("CIRCLE_NUM".equals(str)) {
            return 14;
        }
        if ("DB_CHAR".equals(str)) {
            return 15;
        }
        if ("DB_NUM_1".equals(str)) {
            return 16;
        }
        if ("DB_NUM_2".equals(str)) {
            return 17;
        }
        if ("DB_NUM_3".equals(str)) {
            return 18;
        }
        if ("DB_NUM_4".equals(str)) {
            return 19;
        }
        if ("DOLLAR_TEXT".equals(str)) {
            return 20;
        }
        if ("GANADA".equals(str)) {
            return 21;
        }
        if ("GB_1".equals(str)) {
            return 22;
        }
        if ("GB_2".equals(str)) {
            return 23;
        }
        if ("GB_3".equals(str)) {
            return 24;
        }
        if ("GB_4".equals(str)) {
            return 25;
        }
        if ("HEBREW_1".equals(str)) {
            return 26;
        }
        if ("HEBREW_2".equals(str)) {
            return 27;
        }
        if ("HEX".equals(str)) {
            return 28;
        }
        if ("HINDI_ARABIC".equals(str)) {
            return 29;
        }
        if ("HINDI_CARD_TEXT".equals(str)) {
            return 30;
        }
        if ("HINDI_LETTER_1".equals(str)) {
            return 31;
        }
        if ("HINDI_LETTER_2".equals(str)) {
            return 32;
        }
        if ("IROHA".equals(str)) {
            return 33;
        }
        if ("KANJI_NUM_1".equals(str)) {
            return 34;
        }
        if ("KANJI_NUM_2".equals(str)) {
            return 35;
        }
        if ("KANJI_NUM_3".equals(str)) {
            return 36;
        }
        if ("ORDINAL".equals(str)) {
            return 37;
        }
        if ("ORD_TEXT".equals(str)) {
            return 38;
        }
        if ("UPPERCASE_ROMAN".equals(str)) {
            return 39;
        }
        if ("LOWERCASE_ROMAN".equals(str)) {
            return 40;
        }
        if ("SB_CHAR".equals(str)) {
            return 41;
        }
        if ("THAI_ARABIC".equals(str)) {
            return 42;
        }
        if ("THAI_CARD_TEXT".equals(str)) {
            return 43;
        }
        if ("THAI_LETTER".equals(str)) {
            return 44;
        }
        if ("VIET_CARD_TEXT".equals(str)) {
            return 45;
        }
        if ("ZODIAC_1".equals(str)) {
            return 46;
        }
        if ("ZODIAC_2".equals(str)) {
            return 47;
        }
        if ("ZODIAC_3".equals(str)) {
            return 48;
        }
        if ("CAPS".equals(str)) {
            return 49;
        }
        if ("FIRST_CAP".equals(str)) {
            return 50;
        }
        if ("LOWER".equals(str)) {
            return 51;
        }
        if ("UPPER".equals(str)) {
            return 52;
        }
        if ("CHAR_FORMAT".equals(str)) {
            return 53;
        }
        if ("MERGE_FORMAT".equals(str)) {
            return 54;
        }
        if ("MERGE_FORMAT_INET".equals(str)) {
            return 55;
        }
        throw new IllegalArgumentException("Unknown GeneralFormat name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "AIUEO";
            case 2:
                return "UPPERCASE_ALPHABETIC";
            case 3:
                return "LOWERCASE_ALPHABETIC";
            case 4:
                return "ARABIC";
            case 5:
                return "ARABIC_ABJAD";
            case 6:
                return "ARABIC_ALPHA";
            case 7:
                return "ARABIC_DASH";
            case 8:
                return "BAHT_TEXT";
            case 9:
                return "CARD_TEXT";
            case 10:
                return "CHINESE_NUM_1";
            case 11:
                return "CHINESE_NUM_2";
            case 12:
                return "CHINESE_NUM_3";
            case 13:
                return "CHOSUNG";
            case 14:
                return "CIRCLE_NUM";
            case 15:
                return "DB_CHAR";
            case 16:
                return "DB_NUM_1";
            case 17:
                return "DB_NUM_2";
            case 18:
                return "DB_NUM_3";
            case 19:
                return "DB_NUM_4";
            case 20:
                return "DOLLAR_TEXT";
            case 21:
                return "GANADA";
            case 22:
                return "GB_1";
            case 23:
                return "GB_2";
            case 24:
                return "GB_3";
            case 25:
                return "GB_4";
            case 26:
                return "HEBREW_1";
            case 27:
                return "HEBREW_2";
            case 28:
                return "HEX";
            case 29:
                return "HINDI_ARABIC";
            case 30:
                return "HINDI_CARD_TEXT";
            case 31:
                return "HINDI_LETTER_1";
            case 32:
                return "HINDI_LETTER_2";
            case 33:
                return "IROHA";
            case 34:
                return "KANJI_NUM_1";
            case 35:
                return "KANJI_NUM_2";
            case 36:
                return "KANJI_NUM_3";
            case 37:
                return "ORDINAL";
            case 38:
                return "ORD_TEXT";
            case 39:
                return "UPPERCASE_ROMAN";
            case 40:
                return "LOWERCASE_ROMAN";
            case 41:
                return "SB_CHAR";
            case 42:
                return "THAI_ARABIC";
            case 43:
                return "THAI_CARD_TEXT";
            case 44:
                return "THAI_LETTER";
            case 45:
                return "VIET_CARD_TEXT";
            case 46:
                return "ZODIAC_1";
            case 47:
                return "ZODIAC_2";
            case 48:
                return "ZODIAC_3";
            case 49:
                return "CAPS";
            case 50:
                return "FIRST_CAP";
            case 51:
                return "LOWER";
            case 52:
                return "UPPER";
            case 53:
                return "CHAR_FORMAT";
            case 54:
                return "MERGE_FORMAT";
            case 55:
                return "MERGE_FORMAT_INET";
            default:
                return "Unknown GeneralFormat value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "Aiueo";
            case 2:
                return "UppercaseAlphabetic";
            case 3:
                return "LowercaseAlphabetic";
            case 4:
                return "Arabic";
            case 5:
                return "ArabicAbjad";
            case 6:
                return "ArabicAlpha";
            case 7:
                return "ArabicDash";
            case 8:
                return "BahtText";
            case 9:
                return "CardText";
            case 10:
                return "ChineseNum1";
            case 11:
                return "ChineseNum2";
            case 12:
                return "ChineseNum3";
            case 13:
                return "Chosung";
            case 14:
                return "CircleNum";
            case 15:
                return "DBChar";
            case 16:
                return "DBNum1";
            case 17:
                return "DBNum2";
            case 18:
                return "DBNum3";
            case 19:
                return "DBNum4";
            case 20:
                return "DollarText";
            case 21:
                return "Ganada";
            case 22:
                return "GB1";
            case 23:
                return "GB2";
            case 24:
                return "GB3";
            case 25:
                return "GB4";
            case 26:
                return "Hebrew1";
            case 27:
                return "Hebrew2";
            case 28:
                return "Hex";
            case 29:
                return "HindiArabic";
            case 30:
                return "HindiCardText";
            case 31:
                return "HindiLetter1";
            case 32:
                return "HindiLetter2";
            case 33:
                return "Iroha";
            case 34:
                return "KanjiNum1";
            case 35:
                return "KanjiNum2";
            case 36:
                return "KanjiNum3";
            case 37:
                return "Ordinal";
            case 38:
                return "OrdText";
            case 39:
                return "UppercaseRoman";
            case 40:
                return "LowercaseRoman";
            case 41:
                return "SBChar";
            case 42:
                return "ThaiArabic";
            case 43:
                return "ThaiCardText";
            case 44:
                return "ThaiLetter";
            case 45:
                return "VietCardText";
            case 46:
                return "Zodiac1";
            case 47:
                return "Zodiac2";
            case 48:
                return "Zodiac3";
            case 49:
                return "Caps";
            case 50:
                return "FirstCap";
            case 51:
                return "Lower";
            case 52:
                return "Upper";
            case 53:
                return "CharFormat";
            case 54:
                return "MergeFormat";
            case 55:
                return "MergeFormatInet";
            default:
                return "Unknown GeneralFormat value.";
        }
    }
}
