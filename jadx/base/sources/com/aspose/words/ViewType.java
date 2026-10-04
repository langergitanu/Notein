package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewType {
    public static final int NONE = 0;
    public static final int NORMAL = 4;
    public static final int OUTLINE = 3;
    public static final int PAGE_LAYOUT = 1;
    public static final int READING = 0;
    public static final int WEB = 5;
    public static final int length = 6;

    private ViewType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str) || "READING".equals(str)) {
            return 0;
        }
        if ("PAGE_LAYOUT".equals(str)) {
            return 1;
        }
        if ("OUTLINE".equals(str)) {
            return 3;
        }
        if ("NORMAL".equals(str)) {
            return 4;
        }
        if ("WEB".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown ViewType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? "Unknown ViewType value." : "WEB" : "NORMAL" : "OUTLINE" : "PAGE_LAYOUT" : "NONE | READING";
    }

    public static int[] getValues() {
        return new int[]{0, 0, 1, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? "Unknown ViewType value." : "Web" : "Normal" : "Outline" : "PageLayout" : "None | Reading";
    }
}
