package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FieldUpdateCultureSource {
    public static final int CURRENT_THREAD = 0;
    public static final int FIELD_CODE = 1;
    public static final int length = 2;

    private FieldUpdateCultureSource() {
    }

    public static int fromName(String str) {
        if ("CURRENT_THREAD".equals(str)) {
            return 0;
        }
        if ("FIELD_CODE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown FieldUpdateCultureSource name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown FieldUpdateCultureSource value." : "FIELD_CODE" : "CURRENT_THREAD";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown FieldUpdateCultureSource value." : "FieldCode" : "CurrentThread";
    }
}
