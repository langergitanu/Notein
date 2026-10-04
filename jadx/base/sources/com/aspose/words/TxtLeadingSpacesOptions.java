package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TxtLeadingSpacesOptions {
    public static final int CONVERT_TO_INDENT = 0;
    public static final int PRESERVE = 2;
    public static final int TRIM = 1;
    public static final int length = 3;

    private TxtLeadingSpacesOptions() {
    }

    public static int fromName(String str) {
        if ("CONVERT_TO_INDENT".equals(str)) {
            return 0;
        }
        if ("TRIM".equals(str)) {
            return 1;
        }
        if ("PRESERVE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown TxtLeadingSpacesOptions name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown TxtLeadingSpacesOptions value." : "PRESERVE" : "TRIM" : "CONVERT_TO_INDENT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown TxtLeadingSpacesOptions value." : "Preserve" : "Trim" : "ConvertToIndent";
    }
}
