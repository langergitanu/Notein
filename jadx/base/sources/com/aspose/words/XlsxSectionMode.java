package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class XlsxSectionMode {
    public static final int MULTIPLE_WORKSHEETS = 0;
    public static final int SINGLE_WORKSHEET = 1;
    public static final int length = 2;

    private XlsxSectionMode() {
    }

    public static int fromName(String str) {
        if ("MULTIPLE_WORKSHEETS".equals(str)) {
            return 0;
        }
        if ("SINGLE_WORKSHEET".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown XlsxSectionMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown XlsxSectionMode value." : "SINGLE_WORKSHEET" : "MULTIPLE_WORKSHEETS";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown XlsxSectionMode value." : "SingleWorksheet" : "MultipleWorksheets";
    }
}
