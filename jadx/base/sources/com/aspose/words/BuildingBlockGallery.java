package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class BuildingBlockGallery {
    public static final int ALL = 0;
    public static final int AUTO_TEXT = 1;
    public static final int BIBLIOGRAPHY = 2;
    public static final int COVER_PAGE = 3;
    public static final int CUSTOM_1 = 10;
    public static final int CUSTOM_2 = 11;
    public static final int CUSTOM_3 = 12;
    public static final int CUSTOM_4 = 13;
    public static final int CUSTOM_5 = 14;
    public static final int CUSTOM_AUTO_TEXT = 4;
    public static final int CUSTOM_BIBLIOGRAPHY = 5;
    public static final int CUSTOM_COVER_PAGE = 6;
    public static final int CUSTOM_EQUATIONS = 7;
    public static final int CUSTOM_FOOTERS = 8;
    public static final int CUSTOM_HEADERS = 9;
    public static final int CUSTOM_PAGE_NUMBER = 15;
    public static final int CUSTOM_PAGE_NUMBER_AT_BOTTOM = 16;
    public static final int CUSTOM_PAGE_NUMBER_AT_MARGIN = 17;
    public static final int CUSTOM_PAGE_NUMBER_AT_TOP = 18;
    public static final int CUSTOM_QUICK_PARTS = 19;
    public static final int CUSTOM_TABLES = 21;
    public static final int CUSTOM_TABLE_OF_CONTENTS = 20;
    public static final int CUSTOM_TEXT_BOX = 22;
    public static final int CUSTOM_WATERMARKS = 23;
    public static final int DEFAULT = 0;
    public static final int EQUATIONS = 26;
    public static final int FOOTERS = 27;
    public static final int HEADERS = 28;
    public static final int NO_GALLERY = 24;
    public static final int PAGE_NUMBER = 29;
    public static final int PAGE_NUMBER_AT_BOTTOM = 30;
    public static final int PAGE_NUMBER_AT_MARGIN = 31;
    public static final int PAGE_NUMBER_AT_TOP = 32;
    public static final int QUICK_PARTS = 25;
    public static final int STRUCTURED_DOCUMENT_TAG_PLACEHOLDER_TEXT = 33;
    public static final int TABLES = 35;
    public static final int TABLE_OF_CONTENTS = 34;
    public static final int TEXT_BOX = 36;
    public static final int WATERMARKS = 37;
    public static final int length = 39;

    private BuildingBlockGallery() {
    }

    public static int fromName(String str) {
        if ("ALL".equals(str)) {
            return 0;
        }
        if ("AUTO_TEXT".equals(str)) {
            return 1;
        }
        if ("BIBLIOGRAPHY".equals(str)) {
            return 2;
        }
        if ("COVER_PAGE".equals(str)) {
            return 3;
        }
        if ("CUSTOM_AUTO_TEXT".equals(str)) {
            return 4;
        }
        if ("CUSTOM_BIBLIOGRAPHY".equals(str)) {
            return 5;
        }
        if ("CUSTOM_COVER_PAGE".equals(str)) {
            return 6;
        }
        if ("CUSTOM_EQUATIONS".equals(str)) {
            return 7;
        }
        if ("CUSTOM_FOOTERS".equals(str)) {
            return 8;
        }
        if ("CUSTOM_HEADERS".equals(str)) {
            return 9;
        }
        if ("CUSTOM_1".equals(str)) {
            return 10;
        }
        if ("CUSTOM_2".equals(str)) {
            return 11;
        }
        if ("CUSTOM_3".equals(str)) {
            return 12;
        }
        if ("CUSTOM_4".equals(str)) {
            return 13;
        }
        if ("CUSTOM_5".equals(str)) {
            return 14;
        }
        if ("CUSTOM_PAGE_NUMBER".equals(str)) {
            return 15;
        }
        if ("CUSTOM_PAGE_NUMBER_AT_BOTTOM".equals(str)) {
            return 16;
        }
        if ("CUSTOM_PAGE_NUMBER_AT_MARGIN".equals(str)) {
            return 17;
        }
        if ("CUSTOM_PAGE_NUMBER_AT_TOP".equals(str)) {
            return 18;
        }
        if ("CUSTOM_QUICK_PARTS".equals(str)) {
            return 19;
        }
        if ("CUSTOM_TABLE_OF_CONTENTS".equals(str)) {
            return 20;
        }
        if ("CUSTOM_TABLES".equals(str)) {
            return 21;
        }
        if ("CUSTOM_TEXT_BOX".equals(str)) {
            return 22;
        }
        if ("CUSTOM_WATERMARKS".equals(str)) {
            return 23;
        }
        if ("NO_GALLERY".equals(str)) {
            return 24;
        }
        if ("QUICK_PARTS".equals(str)) {
            return 25;
        }
        if ("EQUATIONS".equals(str)) {
            return 26;
        }
        if ("FOOTERS".equals(str)) {
            return 27;
        }
        if ("HEADERS".equals(str)) {
            return 28;
        }
        if ("PAGE_NUMBER".equals(str)) {
            return 29;
        }
        if ("PAGE_NUMBER_AT_BOTTOM".equals(str)) {
            return 30;
        }
        if ("PAGE_NUMBER_AT_MARGIN".equals(str)) {
            return 31;
        }
        if ("PAGE_NUMBER_AT_TOP".equals(str)) {
            return 32;
        }
        if ("STRUCTURED_DOCUMENT_TAG_PLACEHOLDER_TEXT".equals(str)) {
            return 33;
        }
        if ("TABLE_OF_CONTENTS".equals(str)) {
            return 34;
        }
        if ("TABLES".equals(str)) {
            return 35;
        }
        if ("TEXT_BOX".equals(str)) {
            return 36;
        }
        if ("WATERMARKS".equals(str)) {
            return 37;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown BuildingBlockGallery name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "ALL | DEFAULT";
            case 1:
                return "AUTO_TEXT";
            case 2:
                return "BIBLIOGRAPHY";
            case 3:
                return "COVER_PAGE";
            case 4:
                return "CUSTOM_AUTO_TEXT";
            case 5:
                return "CUSTOM_BIBLIOGRAPHY";
            case 6:
                return "CUSTOM_COVER_PAGE";
            case 7:
                return "CUSTOM_EQUATIONS";
            case 8:
                return "CUSTOM_FOOTERS";
            case 9:
                return "CUSTOM_HEADERS";
            case 10:
                return "CUSTOM_1";
            case 11:
                return "CUSTOM_2";
            case 12:
                return "CUSTOM_3";
            case 13:
                return "CUSTOM_4";
            case 14:
                return "CUSTOM_5";
            case 15:
                return "CUSTOM_PAGE_NUMBER";
            case 16:
                return "CUSTOM_PAGE_NUMBER_AT_BOTTOM";
            case 17:
                return "CUSTOM_PAGE_NUMBER_AT_MARGIN";
            case 18:
                return "CUSTOM_PAGE_NUMBER_AT_TOP";
            case 19:
                return "CUSTOM_QUICK_PARTS";
            case 20:
                return "CUSTOM_TABLE_OF_CONTENTS";
            case 21:
                return "CUSTOM_TABLES";
            case 22:
                return "CUSTOM_TEXT_BOX";
            case 23:
                return "CUSTOM_WATERMARKS";
            case 24:
                return "NO_GALLERY";
            case 25:
                return "QUICK_PARTS";
            case 26:
                return "EQUATIONS";
            case 27:
                return "FOOTERS";
            case 28:
                return "HEADERS";
            case 29:
                return "PAGE_NUMBER";
            case 30:
                return "PAGE_NUMBER_AT_BOTTOM";
            case 31:
                return "PAGE_NUMBER_AT_MARGIN";
            case 32:
                return "PAGE_NUMBER_AT_TOP";
            case 33:
                return "STRUCTURED_DOCUMENT_TAG_PLACEHOLDER_TEXT";
            case 34:
                return "TABLE_OF_CONTENTS";
            case 35:
                return "TABLES";
            case 36:
                return "TEXT_BOX";
            case 37:
                return "WATERMARKS";
            default:
                return "Unknown BuildingBlockGallery value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 0};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "All | Default";
            case 1:
                return "AutoText";
            case 2:
                return "Bibliography";
            case 3:
                return "CoverPage";
            case 4:
                return "CustomAutoText";
            case 5:
                return "CustomBibliography";
            case 6:
                return "CustomCoverPage";
            case 7:
                return "CustomEquations";
            case 8:
                return "CustomFooters";
            case 9:
                return "CustomHeaders";
            case 10:
                return "Custom1";
            case 11:
                return "Custom2";
            case 12:
                return "Custom3";
            case 13:
                return "Custom4";
            case 14:
                return "Custom5";
            case 15:
                return "CustomPageNumber";
            case 16:
                return "CustomPageNumberAtBottom";
            case 17:
                return "CustomPageNumberAtMargin";
            case 18:
                return "CustomPageNumberAtTop";
            case 19:
                return "CustomQuickParts";
            case 20:
                return "CustomTableOfContents";
            case 21:
                return "CustomTables";
            case 22:
                return "CustomTextBox";
            case 23:
                return "CustomWatermarks";
            case 24:
                return "NoGallery";
            case 25:
                return "QuickParts";
            case 26:
                return "Equations";
            case 27:
                return "Footers";
            case 28:
                return "Headers";
            case 29:
                return "PageNumber";
            case 30:
                return "PageNumberAtBottom";
            case 31:
                return "PageNumberAtMargin";
            case 32:
                return "PageNumberAtTop";
            case 33:
                return "StructuredDocumentTagPlaceholderText";
            case 34:
                return "TableOfContents";
            case 35:
                return "Tables";
            case 36:
                return "TextBox";
            case 37:
                return "Watermarks";
            default:
                return "Unknown BuildingBlockGallery value.";
        }
    }
}
