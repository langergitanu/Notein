package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ExportHeadersFootersMode {
    public static final int FIRST_PAGE_HEADER_FOOTER_PER_SECTION = 3;
    public static final int FIRST_SECTION_HEADER_LAST_SECTION_FOOTER = 2;
    public static final int NONE = 0;
    public static final int PER_SECTION = 1;
    public static final int length = 4;

    private ExportHeadersFootersMode() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("PER_SECTION".equals(str)) {
            return 1;
        }
        if ("FIRST_SECTION_HEADER_LAST_SECTION_FOOTER".equals(str)) {
            return 2;
        }
        if ("FIRST_PAGE_HEADER_FOOTER_PER_SECTION".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown ExportHeadersFootersMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ExportHeadersFootersMode value." : "FIRST_PAGE_HEADER_FOOTER_PER_SECTION" : "FIRST_SECTION_HEADER_LAST_SECTION_FOOTER" : "PER_SECTION" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ExportHeadersFootersMode value." : "FirstPageHeaderFooterPerSection" : "FirstSectionHeaderLastSectionFooter" : "PerSection" : "None";
    }
}
