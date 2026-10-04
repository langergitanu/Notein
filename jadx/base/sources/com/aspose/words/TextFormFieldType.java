package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TextFormFieldType {
    public static final int CALCULATED = 5;
    public static final int CURRENT_DATE = 3;
    public static final int CURRENT_TIME = 4;
    public static final int DATE = 2;
    public static final int NUMBER = 1;
    public static final int REGULAR = 0;
    public static final int length = 6;

    private TextFormFieldType() {
    }

    public static int fromName(String str) {
        if ("REGULAR".equals(str)) {
            return 0;
        }
        if ("NUMBER".equals(str)) {
            return 1;
        }
        if ("DATE".equals(str)) {
            return 2;
        }
        if ("CURRENT_DATE".equals(str)) {
            return 3;
        }
        if ("CURRENT_TIME".equals(str)) {
            return 4;
        }
        if ("CALCULATED".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown TextFormFieldType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TextFormFieldType value." : "CALCULATED" : "CURRENT_TIME" : "CURRENT_DATE" : "DATE" : "NUMBER" : "REGULAR";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown TextFormFieldType value." : "Calculated" : "CurrentTime" : "CurrentDate" : "Date" : "Number" : "Regular";
    }
}
