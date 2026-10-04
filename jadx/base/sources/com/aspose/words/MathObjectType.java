package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MathObjectType {
    public static final int ACCENT = 2;
    public static final int ARGUMENT = 8;
    public static final int ARRAY = 9;
    public static final int BAR = 3;
    public static final int BORDER_BOX = 4;
    public static final int BOX = 5;
    public static final int DEGREE = 7;
    public static final int DELIMITER = 6;
    public static final int DENOMINATOR = 11;
    public static final int FRACTION = 10;
    public static final int FUNCTION = 13;
    public static final int FUNCTION_NAME = 14;
    public static final int GROUP_CHARACTER = 15;
    public static final int LIMIT = 16;
    public static final int LOWER_LIMIT = 17;
    public static final int MATRIX = 19;
    public static final int MATRIX_ROW = 20;
    public static final int NUMERATOR = 12;
    public static final int N_ARY = 21;
    public static final int O_MATH = 0;
    public static final int O_MATH_PARA = 1;
    public static final int PHANTOM = 22;
    public static final int PRE_SUB_SUPERSCRIPT = 26;
    public static final int RADICAL = 23;
    public static final int SUBSCRIPT = 27;
    public static final int SUBSCRIPT_PART = 24;
    public static final int SUB_SUPERSCRIPT = 28;
    public static final int SUPERCRIPT = 29;
    public static final int SUPERSCRIPT_PART = 25;
    public static final int UPPER_LIMIT = 18;
    public static final int length = 30;

    private MathObjectType() {
    }

    public static int fromName(String str) {
        if ("O_MATH".equals(str)) {
            return 0;
        }
        if ("O_MATH_PARA".equals(str)) {
            return 1;
        }
        if ("ACCENT".equals(str)) {
            return 2;
        }
        if ("BAR".equals(str)) {
            return 3;
        }
        if ("BORDER_BOX".equals(str)) {
            return 4;
        }
        if ("BOX".equals(str)) {
            return 5;
        }
        if ("DELIMITER".equals(str)) {
            return 6;
        }
        if ("DEGREE".equals(str)) {
            return 7;
        }
        if ("ARGUMENT".equals(str)) {
            return 8;
        }
        if ("ARRAY".equals(str)) {
            return 9;
        }
        if ("FRACTION".equals(str)) {
            return 10;
        }
        if ("DENOMINATOR".equals(str)) {
            return 11;
        }
        if ("NUMERATOR".equals(str)) {
            return 12;
        }
        if ("FUNCTION".equals(str)) {
            return 13;
        }
        if ("FUNCTION_NAME".equals(str)) {
            return 14;
        }
        if ("GROUP_CHARACTER".equals(str)) {
            return 15;
        }
        if ("LIMIT".equals(str)) {
            return 16;
        }
        if ("LOWER_LIMIT".equals(str)) {
            return 17;
        }
        if ("UPPER_LIMIT".equals(str)) {
            return 18;
        }
        if ("MATRIX".equals(str)) {
            return 19;
        }
        if ("MATRIX_ROW".equals(str)) {
            return 20;
        }
        if ("N_ARY".equals(str)) {
            return 21;
        }
        if ("PHANTOM".equals(str)) {
            return 22;
        }
        if ("RADICAL".equals(str)) {
            return 23;
        }
        if ("SUBSCRIPT_PART".equals(str)) {
            return 24;
        }
        if ("SUPERSCRIPT_PART".equals(str)) {
            return 25;
        }
        if ("PRE_SUB_SUPERSCRIPT".equals(str)) {
            return 26;
        }
        if ("SUBSCRIPT".equals(str)) {
            return 27;
        }
        if ("SUB_SUPERSCRIPT".equals(str)) {
            return 28;
        }
        if ("SUPERCRIPT".equals(str)) {
            return 29;
        }
        throw new IllegalArgumentException("Unknown MathObjectType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "O_MATH";
            case 1:
                return "O_MATH_PARA";
            case 2:
                return "ACCENT";
            case 3:
                return "BAR";
            case 4:
                return "BORDER_BOX";
            case 5:
                return "BOX";
            case 6:
                return "DELIMITER";
            case 7:
                return "DEGREE";
            case 8:
                return "ARGUMENT";
            case 9:
                return "ARRAY";
            case 10:
                return "FRACTION";
            case 11:
                return "DENOMINATOR";
            case 12:
                return "NUMERATOR";
            case 13:
                return "FUNCTION";
            case 14:
                return "FUNCTION_NAME";
            case 15:
                return "GROUP_CHARACTER";
            case 16:
                return "LIMIT";
            case 17:
                return "LOWER_LIMIT";
            case 18:
                return "UPPER_LIMIT";
            case 19:
                return "MATRIX";
            case 20:
                return "MATRIX_ROW";
            case 21:
                return "N_ARY";
            case 22:
                return "PHANTOM";
            case 23:
                return "RADICAL";
            case 24:
                return "SUBSCRIPT_PART";
            case 25:
                return "SUPERSCRIPT_PART";
            case 26:
                return "PRE_SUB_SUPERSCRIPT";
            case 27:
                return "SUBSCRIPT";
            case 28:
                return "SUB_SUPERSCRIPT";
            case 29:
                return "SUPERCRIPT";
            default:
                return "Unknown MathObjectType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "OMath";
            case 1:
                return "OMathPara";
            case 2:
                return "Accent";
            case 3:
                return "Bar";
            case 4:
                return "BorderBox";
            case 5:
                return "Box";
            case 6:
                return "Delimiter";
            case 7:
                return "Degree";
            case 8:
                return "Argument";
            case 9:
                return "Array";
            case 10:
                return "Fraction";
            case 11:
                return "Denominator";
            case 12:
                return "Numerator";
            case 13:
                return "Function";
            case 14:
                return "FunctionName";
            case 15:
                return "GroupCharacter";
            case 16:
                return "Limit";
            case 17:
                return "LowerLimit";
            case 18:
                return "UpperLimit";
            case 19:
                return "Matrix";
            case 20:
                return "MatrixRow";
            case 21:
                return "NAry";
            case 22:
                return "Phantom";
            case 23:
                return "Radical";
            case 24:
                return "SubscriptPart";
            case 25:
                return "SuperscriptPart";
            case 26:
                return "PreSubSuperscript";
            case 27:
                return "Subscript";
            case 28:
                return "SubSuperscript";
            case 29:
                return "Supercript";
            default:
                return "Unknown MathObjectType value.";
        }
    }
}
