package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SdtType {
    public static final int BIBLIOGRAPHY = 1;
    public static final int BUILDING_BLOCK_GALLERY = 7;
    public static final int CHECKBOX = 13;
    public static final int CITATION = 2;
    public static final int COMBO_BOX = 5;
    public static final int DATE = 6;
    public static final int DOC_PART_OBJ = 8;
    public static final int DROP_DOWN_LIST = 4;
    public static final int ENTITY_PICKER = 16;
    public static final int EQUATION = 3;
    public static final int GROUP = 9;
    public static final int NONE = 0;
    public static final int PICTURE = 10;
    public static final int PLAIN_TEXT = 12;
    public static final int REPEATING_SECTION = 14;
    public static final int REPEATING_SECTION_ITEM = 15;
    public static final int RICH_TEXT = 11;
    public static final int length = 17;

    private SdtType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("BIBLIOGRAPHY".equals(str)) {
            return 1;
        }
        if ("CITATION".equals(str)) {
            return 2;
        }
        if ("EQUATION".equals(str)) {
            return 3;
        }
        if ("DROP_DOWN_LIST".equals(str)) {
            return 4;
        }
        if ("COMBO_BOX".equals(str)) {
            return 5;
        }
        if ("DATE".equals(str)) {
            return 6;
        }
        if ("BUILDING_BLOCK_GALLERY".equals(str)) {
            return 7;
        }
        if ("DOC_PART_OBJ".equals(str)) {
            return 8;
        }
        if ("GROUP".equals(str)) {
            return 9;
        }
        if ("PICTURE".equals(str)) {
            return 10;
        }
        if ("RICH_TEXT".equals(str)) {
            return 11;
        }
        if ("PLAIN_TEXT".equals(str)) {
            return 12;
        }
        if ("CHECKBOX".equals(str)) {
            return 13;
        }
        if ("REPEATING_SECTION".equals(str)) {
            return 14;
        }
        if ("REPEATING_SECTION_ITEM".equals(str)) {
            return 15;
        }
        if ("ENTITY_PICKER".equals(str)) {
            return 16;
        }
        throw new IllegalArgumentException("Unknown SdtType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "BIBLIOGRAPHY";
            case 2:
                return "CITATION";
            case 3:
                return "EQUATION";
            case 4:
                return "DROP_DOWN_LIST";
            case 5:
                return "COMBO_BOX";
            case 6:
                return "DATE";
            case 7:
                return "BUILDING_BLOCK_GALLERY";
            case 8:
                return "DOC_PART_OBJ";
            case 9:
                return "GROUP";
            case 10:
                return "PICTURE";
            case 11:
                return "RICH_TEXT";
            case 12:
                return "PLAIN_TEXT";
            case 13:
                return "CHECKBOX";
            case 14:
                return "REPEATING_SECTION";
            case 15:
                return "REPEATING_SECTION_ITEM";
            case 16:
                return "ENTITY_PICKER";
            default:
                return "Unknown SdtType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "Bibliography";
            case 2:
                return "Citation";
            case 3:
                return "Equation";
            case 4:
                return "DropDownList";
            case 5:
                return "ComboBox";
            case 6:
                return "Date";
            case 7:
                return "BuildingBlockGallery";
            case 8:
                return "DocPartObj";
            case 9:
                return "Group";
            case 10:
                return "Picture";
            case 11:
                return "RichText";
            case 12:
                return "PlainText";
            case 13:
                return "Checkbox";
            case 14:
                return "RepeatingSection";
            case 15:
                return "RepeatingSectionItem";
            case 16:
                return "EntityPicker";
            default:
                return "Unknown SdtType value.";
        }
    }
}
