package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class StoryType {
    public static final int COMMENTS = 4;
    public static final int ENDNOTES = 3;
    public static final int ENDNOTE_CONTINUATION_NOTICE = 17;
    public static final int ENDNOTE_CONTINUATION_SEPARATOR = 16;
    public static final int ENDNOTE_SEPARATOR = 15;
    public static final int EVEN_PAGES_FOOTER = 8;
    public static final int EVEN_PAGES_HEADER = 6;
    public static final int FIRST_PAGE_FOOTER = 11;
    public static final int FIRST_PAGE_HEADER = 10;
    public static final int FOOTNOTES = 2;
    public static final int FOOTNOTE_CONTINUATION_NOTICE = 14;
    public static final int FOOTNOTE_CONTINUATION_SEPARATOR = 13;
    public static final int FOOTNOTE_SEPARATOR = 12;
    public static final int MAIN_TEXT = 1;
    public static final int NONE = 0;
    public static final int PRIMARY_FOOTER = 9;
    public static final int PRIMARY_HEADER = 7;
    public static final int TEXTBOX = 5;
    public static final int length = 18;

    private StoryType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("MAIN_TEXT".equals(str)) {
            return 1;
        }
        if ("FOOTNOTES".equals(str)) {
            return 2;
        }
        if ("ENDNOTES".equals(str)) {
            return 3;
        }
        if ("COMMENTS".equals(str)) {
            return 4;
        }
        if ("TEXTBOX".equals(str)) {
            return 5;
        }
        if ("EVEN_PAGES_HEADER".equals(str)) {
            return 6;
        }
        if ("PRIMARY_HEADER".equals(str)) {
            return 7;
        }
        if ("EVEN_PAGES_FOOTER".equals(str)) {
            return 8;
        }
        if ("PRIMARY_FOOTER".equals(str)) {
            return 9;
        }
        if ("FIRST_PAGE_HEADER".equals(str)) {
            return 10;
        }
        if ("FIRST_PAGE_FOOTER".equals(str)) {
            return 11;
        }
        if ("FOOTNOTE_SEPARATOR".equals(str)) {
            return 12;
        }
        if ("FOOTNOTE_CONTINUATION_SEPARATOR".equals(str)) {
            return 13;
        }
        if ("FOOTNOTE_CONTINUATION_NOTICE".equals(str)) {
            return 14;
        }
        if ("ENDNOTE_SEPARATOR".equals(str)) {
            return 15;
        }
        if ("ENDNOTE_CONTINUATION_SEPARATOR".equals(str)) {
            return 16;
        }
        if ("ENDNOTE_CONTINUATION_NOTICE".equals(str)) {
            return 17;
        }
        throw new IllegalArgumentException("Unknown StoryType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "MAIN_TEXT";
            case 2:
                return "FOOTNOTES";
            case 3:
                return "ENDNOTES";
            case 4:
                return "COMMENTS";
            case 5:
                return "TEXTBOX";
            case 6:
                return "EVEN_PAGES_HEADER";
            case 7:
                return "PRIMARY_HEADER";
            case 8:
                return "EVEN_PAGES_FOOTER";
            case 9:
                return "PRIMARY_FOOTER";
            case 10:
                return "FIRST_PAGE_HEADER";
            case 11:
                return "FIRST_PAGE_FOOTER";
            case 12:
                return "FOOTNOTE_SEPARATOR";
            case 13:
                return "FOOTNOTE_CONTINUATION_SEPARATOR";
            case 14:
                return "FOOTNOTE_CONTINUATION_NOTICE";
            case 15:
                return "ENDNOTE_SEPARATOR";
            case 16:
                return "ENDNOTE_CONTINUATION_SEPARATOR";
            case 17:
                return "ENDNOTE_CONTINUATION_NOTICE";
            default:
                return "Unknown StoryType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "MainText";
            case 2:
                return "Footnotes";
            case 3:
                return "Endnotes";
            case 4:
                return "Comments";
            case 5:
                return "Textbox";
            case 6:
                return "EvenPagesHeader";
            case 7:
                return "PrimaryHeader";
            case 8:
                return "EvenPagesFooter";
            case 9:
                return "PrimaryFooter";
            case 10:
                return "FirstPageHeader";
            case 11:
                return "FirstPageFooter";
            case 12:
                return "FootnoteSeparator";
            case 13:
                return "FootnoteContinuationSeparator";
            case 14:
                return "FootnoteContinuationNotice";
            case 15:
                return "EndnoteSeparator";
            case 16:
                return "EndnoteContinuationSeparator";
            case 17:
                return "EndnoteContinuationNotice";
            default:
                return "Unknown StoryType value.";
        }
    }
}
