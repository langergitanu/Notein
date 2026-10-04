package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MailMergeDataType {
    public static final int DATABASE = 1;
    public static final int DEFAULT = -1;
    public static final int NATIVE = 5;
    public static final int NONE = -1;
    public static final int ODBC = 4;
    public static final int QUERY = 3;
    public static final int SPREADSHEET = 2;
    public static final int TEXT_FILE = 0;
    public static final int length = 8;

    private MailMergeDataType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return -1;
        }
        if ("TEXT_FILE".equals(str)) {
            return 0;
        }
        if ("DATABASE".equals(str)) {
            return 1;
        }
        if ("SPREADSHEET".equals(str)) {
            return 2;
        }
        if ("QUERY".equals(str)) {
            return 3;
        }
        if ("ODBC".equals(str)) {
            return 4;
        }
        if ("NATIVE".equals(str)) {
            return 5;
        }
        if ("DEFAULT".equals(str)) {
            return -1;
        }
        throw new IllegalArgumentException("Unknown MailMergeDataType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case -1:
                return "NONE | DEFAULT";
            case 0:
                return "TEXT_FILE";
            case 1:
                return "DATABASE";
            case 2:
                return "SPREADSHEET";
            case 3:
                return "QUERY";
            case 4:
                return "ODBC";
            case 5:
                return "NATIVE";
            default:
                return "Unknown MailMergeDataType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{-1, 0, 1, 2, 3, 4, 5, -1};
    }

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "None | Default";
            case 0:
                return "TextFile";
            case 1:
                return "Database";
            case 2:
                return "Spreadsheet";
            case 3:
                return "Query";
            case 4:
                return "Odbc";
            case 5:
                return "Native";
            default:
                return "Unknown MailMergeDataType value.";
        }
    }
}
