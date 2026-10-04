package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class HtmlControlType {
    public static final int FORM_FIELD = 0;
    public static final int STRUCTURED_DOCUMENT_TAG = 1;
    public static final int length = 2;

    private HtmlControlType() {
    }

    public static int fromName(String str) {
        if ("FORM_FIELD".equals(str)) {
            return 0;
        }
        if ("STRUCTURED_DOCUMENT_TAG".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown HtmlControlType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown HtmlControlType value." : "STRUCTURED_DOCUMENT_TAG" : "FORM_FIELD";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown HtmlControlType value." : "StructuredDocumentTag" : "FormField";
    }
}
