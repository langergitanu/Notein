package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ZoomType {
    public static final int CUSTOM = 0;
    public static final int FULL_PAGE = 1;
    public static final int NONE = 0;
    public static final int PAGE_WIDTH = 2;
    public static final int TEXT_FIT = 3;
    public static final int length = 5;

    private ZoomType() {
    }

    public static int fromName(String str) {
        if ("CUSTOM".equals(str) || "NONE".equals(str)) {
            return 0;
        }
        if ("FULL_PAGE".equals(str)) {
            return 1;
        }
        if ("PAGE_WIDTH".equals(str)) {
            return 2;
        }
        if ("TEXT_FIT".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown ZoomType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ZoomType value." : "TEXT_FIT" : "PAGE_WIDTH" : "FULL_PAGE" : "CUSTOM | NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ZoomType value." : "TextFit" : "PageWidth" : "FullPage" : "Custom | None";
    }
}
