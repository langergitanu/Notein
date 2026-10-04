package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PropertyType {
    public static final int BOOLEAN = 0;
    public static final int BYTE_ARRAY = 7;
    public static final int DATE_TIME = 1;
    public static final int DOUBLE = 2;
    public static final int NUMBER = 3;
    public static final int OBJECT_ARRAY = 6;
    public static final int OTHER = 8;
    public static final int STRING = 4;
    public static final int STRING_ARRAY = 5;
    public static final int length = 9;

    private PropertyType() {
    }

    public static int fromName(String str) {
        if ("BOOLEAN".equals(str)) {
            return 0;
        }
        if ("DATE_TIME".equals(str)) {
            return 1;
        }
        if ("DOUBLE".equals(str)) {
            return 2;
        }
        if ("NUMBER".equals(str)) {
            return 3;
        }
        if ("STRING".equals(str)) {
            return 4;
        }
        if ("STRING_ARRAY".equals(str)) {
            return 5;
        }
        if ("OBJECT_ARRAY".equals(str)) {
            return 6;
        }
        if ("BYTE_ARRAY".equals(str)) {
            return 7;
        }
        if ("OTHER".equals(str)) {
            return 8;
        }
        throw new IllegalArgumentException("Unknown PropertyType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "BOOLEAN";
            case 1:
                return "DATE_TIME";
            case 2:
                return "DOUBLE";
            case 3:
                return "NUMBER";
            case 4:
                return "STRING";
            case 5:
                return "STRING_ARRAY";
            case 6:
                return "OBJECT_ARRAY";
            case 7:
                return "BYTE_ARRAY";
            case 8:
                return "OTHER";
            default:
                return "Unknown PropertyType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Boolean";
            case 1:
                return "DateTime";
            case 2:
                return "Double";
            case 3:
                return "Number";
            case 4:
                return "String";
            case 5:
                return "StringArray";
            case 6:
                return "ObjectArray";
            case 7:
                return "ByteArray";
            case 8:
                return "Other";
            default:
                return "Unknown PropertyType value.";
        }
    }
}
