package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ListTemplate {
    public static final int BULLET_ARROW_HEAD = 4;
    public static final int BULLET_CIRCLE = 1;
    public static final int BULLET_DEFAULT = 0;
    public static final int BULLET_DIAMONDS = 3;
    public static final int BULLET_DISK = 0;
    public static final int BULLET_SQUARE = 2;
    public static final int BULLET_TICK = 5;
    public static final int NUMBER_ARABIC_DOT = 6;
    public static final int NUMBER_ARABIC_PARENTHESIS = 7;
    public static final int NUMBER_DEFAULT = 6;
    public static final int NUMBER_LOWERCASE_LETTER_DOT = 11;
    public static final int NUMBER_LOWERCASE_LETTER_PARENTHESIS = 10;
    public static final int NUMBER_LOWERCASE_ROMAN_DOT = 12;
    public static final int NUMBER_UPPERCASE_LETTER_DOT = 9;
    public static final int NUMBER_UPPERCASE_ROMAN_DOT = 8;
    public static final int OUTLINE_BULLETS = 15;
    public static final int OUTLINE_HEADINGS_ARTICLE_SECTION = 16;
    public static final int OUTLINE_HEADINGS_CHAPTER = 19;
    public static final int OUTLINE_HEADINGS_LEGAL = 17;
    public static final int OUTLINE_HEADINGS_NUMBERS = 18;
    public static final int OUTLINE_LEGAL = 14;
    public static final int OUTLINE_NUMBERS = 13;
    public static final int length = 22;

    private ListTemplate() {
    }

    public static int fromName(String str) {
        if ("BULLET_DEFAULT".equals(str) || "BULLET_DISK".equals(str)) {
            return 0;
        }
        if ("BULLET_CIRCLE".equals(str)) {
            return 1;
        }
        if ("BULLET_SQUARE".equals(str)) {
            return 2;
        }
        if ("BULLET_DIAMONDS".equals(str)) {
            return 3;
        }
        if ("BULLET_ARROW_HEAD".equals(str)) {
            return 4;
        }
        if ("BULLET_TICK".equals(str)) {
            return 5;
        }
        if ("NUMBER_DEFAULT".equals(str) || "NUMBER_ARABIC_DOT".equals(str)) {
            return 6;
        }
        if ("NUMBER_ARABIC_PARENTHESIS".equals(str)) {
            return 7;
        }
        if ("NUMBER_UPPERCASE_ROMAN_DOT".equals(str)) {
            return 8;
        }
        if ("NUMBER_UPPERCASE_LETTER_DOT".equals(str)) {
            return 9;
        }
        if ("NUMBER_LOWERCASE_LETTER_PARENTHESIS".equals(str)) {
            return 10;
        }
        if ("NUMBER_LOWERCASE_LETTER_DOT".equals(str)) {
            return 11;
        }
        if ("NUMBER_LOWERCASE_ROMAN_DOT".equals(str)) {
            return 12;
        }
        if ("OUTLINE_NUMBERS".equals(str)) {
            return 13;
        }
        if ("OUTLINE_LEGAL".equals(str)) {
            return 14;
        }
        if ("OUTLINE_BULLETS".equals(str)) {
            return 15;
        }
        if ("OUTLINE_HEADINGS_ARTICLE_SECTION".equals(str)) {
            return 16;
        }
        if ("OUTLINE_HEADINGS_LEGAL".equals(str)) {
            return 17;
        }
        if ("OUTLINE_HEADINGS_NUMBERS".equals(str)) {
            return 18;
        }
        if ("OUTLINE_HEADINGS_CHAPTER".equals(str)) {
            return 19;
        }
        throw new IllegalArgumentException("Unknown ListTemplate name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "BULLET_DEFAULT | BULLET_DISK";
            case 1:
                return "BULLET_CIRCLE";
            case 2:
                return "BULLET_SQUARE";
            case 3:
                return "BULLET_DIAMONDS";
            case 4:
                return "BULLET_ARROW_HEAD";
            case 5:
                return "BULLET_TICK";
            case 6:
                return "NUMBER_DEFAULT | NUMBER_ARABIC_DOT";
            case 7:
                return "NUMBER_ARABIC_PARENTHESIS";
            case 8:
                return "NUMBER_UPPERCASE_ROMAN_DOT";
            case 9:
                return "NUMBER_UPPERCASE_LETTER_DOT";
            case 10:
                return "NUMBER_LOWERCASE_LETTER_PARENTHESIS";
            case 11:
                return "NUMBER_LOWERCASE_LETTER_DOT";
            case 12:
                return "NUMBER_LOWERCASE_ROMAN_DOT";
            case 13:
                return "OUTLINE_NUMBERS";
            case 14:
                return "OUTLINE_LEGAL";
            case 15:
                return "OUTLINE_BULLETS";
            case 16:
                return "OUTLINE_HEADINGS_ARTICLE_SECTION";
            case 17:
                return "OUTLINE_HEADINGS_LEGAL";
            case 18:
                return "OUTLINE_HEADINGS_NUMBERS";
            case 19:
                return "OUTLINE_HEADINGS_CHAPTER";
            default:
                return "Unknown ListTemplate value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 0, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "BulletDefault | BulletDisk";
            case 1:
                return "BulletCircle";
            case 2:
                return "BulletSquare";
            case 3:
                return "BulletDiamonds";
            case 4:
                return "BulletArrowHead";
            case 5:
                return "BulletTick";
            case 6:
                return "NumberDefault | NumberArabicDot";
            case 7:
                return "NumberArabicParenthesis";
            case 8:
                return "NumberUppercaseRomanDot";
            case 9:
                return "NumberUppercaseLetterDot";
            case 10:
                return "NumberLowercaseLetterParenthesis";
            case 11:
                return "NumberLowercaseLetterDot";
            case 12:
                return "NumberLowercaseRomanDot";
            case 13:
                return "OutlineNumbers";
            case 14:
                return "OutlineLegal";
            case 15:
                return "OutlineBullets";
            case 16:
                return "OutlineHeadingsArticleSection";
            case 17:
                return "OutlineHeadingsLegal";
            case 18:
                return "OutlineHeadingsNumbers";
            case 19:
                return "OutlineHeadingsChapter";
            default:
                return "Unknown ListTemplate value.";
        }
    }
}
