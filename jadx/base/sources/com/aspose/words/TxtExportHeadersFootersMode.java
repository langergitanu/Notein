package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TxtExportHeadersFootersMode {
    public static final int ALL_AT_END = 2;
    public static final int NONE = 0;
    public static final int PRIMARY_ONLY = 1;
    public static final int length = 3;

    private TxtExportHeadersFootersMode() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("PRIMARY_ONLY".equals(str)) {
            return 1;
        }
        if ("ALL_AT_END".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown TxtExportHeadersFootersMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown TxtExportHeadersFootersMode value." : "ALL_AT_END" : "PRIMARY_ONLY" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown TxtExportHeadersFootersMode value." : "AllAtEnd" : "PrimaryOnly" : "None";
    }
}
