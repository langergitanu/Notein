package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ResourceType {
    public static final int CSS_STYLE_SHEET = 1;
    public static final int DOCUMENT = 2;
    public static final int IMAGE = 0;
    public static final int length = 3;

    private ResourceType() {
    }

    public static int fromName(String str) {
        if ("IMAGE".equals(str)) {
            return 0;
        }
        if ("CSS_STYLE_SHEET".equals(str)) {
            return 1;
        }
        if ("DOCUMENT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ResourceType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ResourceType value." : "DOCUMENT" : "CSS_STYLE_SHEET" : "IMAGE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ResourceType value." : "Document" : "CssStyleSheet" : "Image";
    }
}
