package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class BuildingBlockType {
    public static final int ALL = 7;
    public static final int AUTOMATICALLY_REPLACE_NAME_WITH_CONTENT = 1;
    public static final int AUTO_CORRECT = 5;
    public static final int AUTO_TEXT = 6;
    public static final int DEFAULT = 0;
    public static final int FORM_FIELD_HELP_TEXT = 3;
    public static final int NONE = 0;
    public static final int NORMAL = 4;
    public static final int STRUCTURED_DOCUMENT_TAG_PLACEHOLDER_TEXT = 2;
    public static final int length = 9;

    private BuildingBlockType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("AUTOMATICALLY_REPLACE_NAME_WITH_CONTENT".equals(str)) {
            return 1;
        }
        if ("STRUCTURED_DOCUMENT_TAG_PLACEHOLDER_TEXT".equals(str)) {
            return 2;
        }
        if ("FORM_FIELD_HELP_TEXT".equals(str)) {
            return 3;
        }
        if ("NORMAL".equals(str)) {
            return 4;
        }
        if ("AUTO_CORRECT".equals(str)) {
            return 5;
        }
        if ("AUTO_TEXT".equals(str)) {
            return 6;
        }
        if ("ALL".equals(str)) {
            return 7;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown BuildingBlockType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE | DEFAULT";
            case 1:
                return "AUTOMATICALLY_REPLACE_NAME_WITH_CONTENT";
            case 2:
                return "STRUCTURED_DOCUMENT_TAG_PLACEHOLDER_TEXT";
            case 3:
                return "FORM_FIELD_HELP_TEXT";
            case 4:
                return "NORMAL";
            case 5:
                return "AUTO_CORRECT";
            case 6:
                return "AUTO_TEXT";
            case 7:
                return "ALL";
            default:
                return "Unknown BuildingBlockType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None | Default";
            case 1:
                return "AutomaticallyReplaceNameWithContent";
            case 2:
                return "StructuredDocumentTagPlaceholderText";
            case 3:
                return "FormFieldHelpText";
            case 4:
                return "Normal";
            case 5:
                return "AutoCorrect";
            case 6:
                return "AutoText";
            case 7:
                return "All";
            default:
                return "Unknown BuildingBlockType value.";
        }
    }
}
