package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Forms2OleControlType {
    public static final int CHECK_BOX = 3;
    public static final int COMBO_BOX = 6;
    public static final int COMMAND_BUTTON = 10;
    public static final int FORM = 13;
    public static final int FRAME = 7;
    public static final int IMAGE = 11;
    public static final int LABEL = 1;
    public static final int LIST_BOX = 14;
    public static final int MULTI_PAGE = 8;
    public static final int OPTION_BUTTON = 0;
    public static final int SCROLL_BAR = 12;
    public static final int SPIN_BUTTON = 5;
    public static final int TAB_STRIP = 9;
    public static final int TEXTBOX = 2;
    public static final int TOGGLE_BUTTON = 4;
    public static final int length = 15;

    private Forms2OleControlType() {
    }

    public static int fromName(String str) {
        if ("OPTION_BUTTON".equals(str)) {
            return 0;
        }
        if ("LABEL".equals(str)) {
            return 1;
        }
        if ("TEXTBOX".equals(str)) {
            return 2;
        }
        if ("CHECK_BOX".equals(str)) {
            return 3;
        }
        if ("TOGGLE_BUTTON".equals(str)) {
            return 4;
        }
        if ("SPIN_BUTTON".equals(str)) {
            return 5;
        }
        if ("COMBO_BOX".equals(str)) {
            return 6;
        }
        if ("FRAME".equals(str)) {
            return 7;
        }
        if ("MULTI_PAGE".equals(str)) {
            return 8;
        }
        if ("TAB_STRIP".equals(str)) {
            return 9;
        }
        if ("COMMAND_BUTTON".equals(str)) {
            return 10;
        }
        if ("IMAGE".equals(str)) {
            return 11;
        }
        if ("SCROLL_BAR".equals(str)) {
            return 12;
        }
        if ("FORM".equals(str)) {
            return 13;
        }
        if ("LIST_BOX".equals(str)) {
            return 14;
        }
        throw new IllegalArgumentException("Unknown Forms2OleControlType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "OPTION_BUTTON";
            case 1:
                return "LABEL";
            case 2:
                return "TEXTBOX";
            case 3:
                return "CHECK_BOX";
            case 4:
                return "TOGGLE_BUTTON";
            case 5:
                return "SPIN_BUTTON";
            case 6:
                return "COMBO_BOX";
            case 7:
                return "FRAME";
            case 8:
                return "MULTI_PAGE";
            case 9:
                return "TAB_STRIP";
            case 10:
                return "COMMAND_BUTTON";
            case 11:
                return "IMAGE";
            case 12:
                return "SCROLL_BAR";
            case 13:
                return "FORM";
            case 14:
                return "LIST_BOX";
            default:
                return "Unknown Forms2OleControlType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "OptionButton";
            case 1:
                return "Label";
            case 2:
                return "Textbox";
            case 3:
                return "CheckBox";
            case 4:
                return "ToggleButton";
            case 5:
                return "SpinButton";
            case 6:
                return "ComboBox";
            case 7:
                return "Frame";
            case 8:
                return "MultiPage";
            case 9:
                return "TabStrip";
            case 10:
                return "CommandButton";
            case 11:
                return "Image";
            case 12:
                return "ScrollBar";
            case 13:
                return "Form";
            case 14:
                return "ListBox";
            default:
                return "Unknown Forms2OleControlType value.";
        }
    }
}
