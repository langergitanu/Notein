package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ShapeMarkupLanguage {
    public static final byte DML = 0;
    public static final byte VML = 1;
    public static final int length = 2;

    private ShapeMarkupLanguage() {
    }

    public static byte fromName(String str) {
        if ("DML".equals(str)) {
            return (byte) 0;
        }
        if ("VML".equals(str)) {
            return (byte) 1;
        }
        throw new IllegalArgumentException("Unknown ShapeMarkupLanguage name.");
    }

    public static String getName(byte b) {
        return b == 0 ? "DML" : 1 == b ? "VML" : "Unknown ShapeMarkupLanguage value.";
    }

    public static byte[] getValues() {
        return new byte[]{0, 1};
    }

    public static String toString(byte b) {
        return b == 0 ? "Dml" : 1 == b ? "Vml" : "Unknown ShapeMarkupLanguage value.";
    }
}
