package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class BreakType {
    public static final int COLUMN_BREAK = 2;
    public static final int LINE_BREAK = 8;
    public static final int PAGE_BREAK = 1;
    public static final int PARAGRAPH_BREAK = 0;
    public static final int SECTION_BREAK_CONTINUOUS = 3;
    public static final int SECTION_BREAK_EVEN_PAGE = 6;
    public static final int SECTION_BREAK_NEW_COLUMN = 4;
    public static final int SECTION_BREAK_NEW_PAGE = 5;
    public static final int SECTION_BREAK_ODD_PAGE = 7;
    public static final int length = 9;

    private BreakType() {
    }

    public static int fromName(String str) {
        if ("PARAGRAPH_BREAK".equals(str)) {
            return 0;
        }
        if ("PAGE_BREAK".equals(str)) {
            return 1;
        }
        if ("COLUMN_BREAK".equals(str)) {
            return 2;
        }
        if ("SECTION_BREAK_CONTINUOUS".equals(str)) {
            return 3;
        }
        if ("SECTION_BREAK_NEW_COLUMN".equals(str)) {
            return 4;
        }
        if ("SECTION_BREAK_NEW_PAGE".equals(str)) {
            return 5;
        }
        if ("SECTION_BREAK_EVEN_PAGE".equals(str)) {
            return 6;
        }
        if ("SECTION_BREAK_ODD_PAGE".equals(str)) {
            return 7;
        }
        if ("LINE_BREAK".equals(str)) {
            return 8;
        }
        throw new IllegalArgumentException("Unknown BreakType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "PARAGRAPH_BREAK";
            case 1:
                return "PAGE_BREAK";
            case 2:
                return "COLUMN_BREAK";
            case 3:
                return "SECTION_BREAK_CONTINUOUS";
            case 4:
                return "SECTION_BREAK_NEW_COLUMN";
            case 5:
                return "SECTION_BREAK_NEW_PAGE";
            case 6:
                return "SECTION_BREAK_EVEN_PAGE";
            case 7:
                return "SECTION_BREAK_ODD_PAGE";
            case 8:
                return "LINE_BREAK";
            default:
                return "Unknown BreakType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "ParagraphBreak";
            case 1:
                return "PageBreak";
            case 2:
                return "ColumnBreak";
            case 3:
                return "SectionBreakContinuous";
            case 4:
                return "SectionBreakNewColumn";
            case 5:
                return "SectionBreakNewPage";
            case 6:
                return "SectionBreakEvenPage";
            case 7:
                return "SectionBreakOddPage";
            case 8:
                return "LineBreak";
            default:
                return "Unknown BreakType value.";
        }
    }
}
