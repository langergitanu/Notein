package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class NodeType {
    public static final int ANY = 0;
    public static final int BODY = 3;
    public static final int BOOKMARK_END = 10;
    public static final int BOOKMARK_START = 9;
    public static final int BUILDING_BLOCK = 32;
    public static final int CELL = 7;
    public static final int COMMENT = 19;
    public static final int COMMENT_RANGE_END = 34;
    public static final int COMMENT_RANGE_START = 33;
    public static final int DOCUMENT = 1;
    public static final int EDITABLE_RANGE_END = 12;
    public static final int EDITABLE_RANGE_START = 11;
    public static final int FIELD_END = 24;
    public static final int FIELD_SEPARATOR = 23;
    public static final int FIELD_START = 22;
    public static final int FOOTNOTE = 20;
    public static final int FORM_FIELD = 25;
    public static final int GLOSSARY_DOCUMENT = 31;
    public static final int GROUP_SHAPE = 17;
    public static final int HEADER_FOOTER = 4;
    public static final int MOVE_FROM_RANGE_END = 14;
    public static final int MOVE_FROM_RANGE_START = 13;
    public static final int MOVE_TO_RANGE_END = 16;
    public static final int MOVE_TO_RANGE_START = 15;
    public static final int NULL = 38;
    public static final int OFFICE_MATH = 35;
    public static final int PARAGRAPH = 8;
    public static final int ROW = 6;
    public static final int RUN = 21;
    public static final int SECTION = 2;
    public static final int SHAPE = 18;
    public static final int SMART_TAG = 27;
    public static final int SPECIAL_CHAR = 26;
    public static final int STRUCTURED_DOCUMENT_TAG = 28;
    public static final int STRUCTURED_DOCUMENT_TAG_RANGE_END = 30;
    public static final int STRUCTURED_DOCUMENT_TAG_RANGE_START = 29;
    public static final int SUB_DOCUMENT = 36;
    public static final int SYSTEM = 37;
    public static final int TABLE = 5;
    public static final int length = 39;

    private NodeType() {
    }

    public static int fromName(String str) {
        if ("ANY".equals(str)) {
            return 0;
        }
        if ("DOCUMENT".equals(str)) {
            return 1;
        }
        if ("SECTION".equals(str)) {
            return 2;
        }
        if ("BODY".equals(str)) {
            return 3;
        }
        if ("HEADER_FOOTER".equals(str)) {
            return 4;
        }
        if ("TABLE".equals(str)) {
            return 5;
        }
        if ("ROW".equals(str)) {
            return 6;
        }
        if ("CELL".equals(str)) {
            return 7;
        }
        if ("PARAGRAPH".equals(str)) {
            return 8;
        }
        if ("BOOKMARK_START".equals(str)) {
            return 9;
        }
        if ("BOOKMARK_END".equals(str)) {
            return 10;
        }
        if ("EDITABLE_RANGE_START".equals(str)) {
            return 11;
        }
        if ("EDITABLE_RANGE_END".equals(str)) {
            return 12;
        }
        if ("MOVE_FROM_RANGE_START".equals(str)) {
            return 13;
        }
        if ("MOVE_FROM_RANGE_END".equals(str)) {
            return 14;
        }
        if ("MOVE_TO_RANGE_START".equals(str)) {
            return 15;
        }
        if ("MOVE_TO_RANGE_END".equals(str)) {
            return 16;
        }
        if ("GROUP_SHAPE".equals(str)) {
            return 17;
        }
        if ("SHAPE".equals(str)) {
            return 18;
        }
        if ("COMMENT".equals(str)) {
            return 19;
        }
        if ("FOOTNOTE".equals(str)) {
            return 20;
        }
        if ("RUN".equals(str)) {
            return 21;
        }
        if ("FIELD_START".equals(str)) {
            return 22;
        }
        if ("FIELD_SEPARATOR".equals(str)) {
            return 23;
        }
        if ("FIELD_END".equals(str)) {
            return 24;
        }
        if ("FORM_FIELD".equals(str)) {
            return 25;
        }
        if ("SPECIAL_CHAR".equals(str)) {
            return 26;
        }
        if ("SMART_TAG".equals(str)) {
            return 27;
        }
        if ("STRUCTURED_DOCUMENT_TAG".equals(str)) {
            return 28;
        }
        if ("STRUCTURED_DOCUMENT_TAG_RANGE_START".equals(str)) {
            return 29;
        }
        if ("STRUCTURED_DOCUMENT_TAG_RANGE_END".equals(str)) {
            return 30;
        }
        if ("GLOSSARY_DOCUMENT".equals(str)) {
            return 31;
        }
        if ("BUILDING_BLOCK".equals(str)) {
            return 32;
        }
        if ("COMMENT_RANGE_START".equals(str)) {
            return 33;
        }
        if ("COMMENT_RANGE_END".equals(str)) {
            return 34;
        }
        if ("OFFICE_MATH".equals(str)) {
            return 35;
        }
        if ("SUB_DOCUMENT".equals(str)) {
            return 36;
        }
        if ("SYSTEM".equals(str)) {
            return 37;
        }
        if ("NULL".equals(str)) {
            return 38;
        }
        throw new IllegalArgumentException("Unknown NodeType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "ANY";
            case 1:
                return "DOCUMENT";
            case 2:
                return "SECTION";
            case 3:
                return "BODY";
            case 4:
                return "HEADER_FOOTER";
            case 5:
                return "TABLE";
            case 6:
                return "ROW";
            case 7:
                return "CELL";
            case 8:
                return "PARAGRAPH";
            case 9:
                return "BOOKMARK_START";
            case 10:
                return "BOOKMARK_END";
            case 11:
                return "EDITABLE_RANGE_START";
            case 12:
                return "EDITABLE_RANGE_END";
            case 13:
                return "MOVE_FROM_RANGE_START";
            case 14:
                return "MOVE_FROM_RANGE_END";
            case 15:
                return "MOVE_TO_RANGE_START";
            case 16:
                return "MOVE_TO_RANGE_END";
            case 17:
                return "GROUP_SHAPE";
            case 18:
                return "SHAPE";
            case 19:
                return "COMMENT";
            case 20:
                return "FOOTNOTE";
            case 21:
                return "RUN";
            case 22:
                return "FIELD_START";
            case 23:
                return "FIELD_SEPARATOR";
            case 24:
                return "FIELD_END";
            case 25:
                return "FORM_FIELD";
            case 26:
                return "SPECIAL_CHAR";
            case 27:
                return "SMART_TAG";
            case 28:
                return "STRUCTURED_DOCUMENT_TAG";
            case 29:
                return "STRUCTURED_DOCUMENT_TAG_RANGE_START";
            case 30:
                return "STRUCTURED_DOCUMENT_TAG_RANGE_END";
            case 31:
                return "GLOSSARY_DOCUMENT";
            case 32:
                return "BUILDING_BLOCK";
            case 33:
                return "COMMENT_RANGE_START";
            case 34:
                return "COMMENT_RANGE_END";
            case 35:
                return "OFFICE_MATH";
            case 36:
                return "SUB_DOCUMENT";
            case 37:
                return "SYSTEM";
            case 38:
                return "NULL";
            default:
                return "Unknown NodeType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Any";
            case 1:
                return "Document";
            case 2:
                return "Section";
            case 3:
                return "Body";
            case 4:
                return "HeaderFooter";
            case 5:
                return "Table";
            case 6:
                return "Row";
            case 7:
                return "Cell";
            case 8:
                return "Paragraph";
            case 9:
                return "BookmarkStart";
            case 10:
                return "BookmarkEnd";
            case 11:
                return "EditableRangeStart";
            case 12:
                return "EditableRangeEnd";
            case 13:
                return "MoveFromRangeStart";
            case 14:
                return "MoveFromRangeEnd";
            case 15:
                return "MoveToRangeStart";
            case 16:
                return "MoveToRangeEnd";
            case 17:
                return "GroupShape";
            case 18:
                return "Shape";
            case 19:
                return "Comment";
            case 20:
                return "Footnote";
            case 21:
                return "Run";
            case 22:
                return "FieldStart";
            case 23:
                return "FieldSeparator";
            case 24:
                return "FieldEnd";
            case 25:
                return "FormField";
            case 26:
                return "SpecialChar";
            case 27:
                return "SmartTag";
            case 28:
                return "StructuredDocumentTag";
            case 29:
                return "StructuredDocumentTagRangeStart";
            case 30:
                return "StructuredDocumentTagRangeEnd";
            case 31:
                return "GlossaryDocument";
            case 32:
                return "BuildingBlock";
            case 33:
                return "CommentRangeStart";
            case 34:
                return "CommentRangeEnd";
            case 35:
                return "OfficeMath";
            case 36:
                return "SubDocument";
            case 37:
                return "System";
            case 38:
                return "Null";
            default:
                return "Unknown NodeType value.";
        }
    }
}
