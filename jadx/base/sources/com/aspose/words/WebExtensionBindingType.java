package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class WebExtensionBindingType {
    public static final int DEFAULT = 0;
    public static final int MATRIX = 0;
    public static final int TABLE = 1;
    public static final int TEXT = 2;
    public static final int length = 4;

    private WebExtensionBindingType() {
    }

    public static int fromName(String str) {
        if ("MATRIX".equals(str)) {
            return 0;
        }
        if ("TABLE".equals(str)) {
            return 1;
        }
        if ("TEXT".equals(str)) {
            return 2;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown WebExtensionBindingType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown WebExtensionBindingType value." : "TEXT" : "TABLE" : "MATRIX | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown WebExtensionBindingType value." : "Text" : "Table" : "Matrix | Default";
    }
}
