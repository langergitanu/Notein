package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class OdsoFieldMappingType {
    public static final int COLUMN = 0;
    public static final int DEFAULT = 1;
    public static final int NULL = 1;
    public static final int length = 3;

    private OdsoFieldMappingType() {
    }

    public static int fromName(String str) {
        if ("COLUMN".equals(str)) {
            return 0;
        }
        if ("NULL".equals(str) || "DEFAULT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown OdsoFieldMappingType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown OdsoFieldMappingType value." : "NULL | DEFAULT" : "COLUMN";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown OdsoFieldMappingType value." : "Null | Default" : "Column";
    }
}
