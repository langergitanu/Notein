package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SdtDateStorageFormat {
    public static final int DATE = 0;
    public static final int DATE_TIME = 1;
    public static final int DEFAULT = 1;
    public static final int TEXT = 2;
    public static final int length = 4;

    private SdtDateStorageFormat() {
    }

    public static int fromName(String str) {
        if ("DATE".equals(str)) {
            return 0;
        }
        if ("DATE_TIME".equals(str)) {
            return 1;
        }
        if ("TEXT".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown SdtDateStorageFormat name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown SdtDateStorageFormat value." : "TEXT" : "DATE_TIME | DEFAULT" : "DATE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown SdtDateStorageFormat value." : "Text" : "DateTime | Default" : "Date";
    }
}
