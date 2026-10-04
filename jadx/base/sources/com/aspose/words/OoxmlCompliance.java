package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class OoxmlCompliance {
    public static final int ECMA_376_2006 = 0;
    public static final int ISO_29500_2008_STRICT = 2;
    public static final int ISO_29500_2008_TRANSITIONAL = 1;
    public static final int length = 3;

    private OoxmlCompliance() {
    }

    public static int fromName(String str) {
        if ("ECMA_376_2006".equals(str)) {
            return 0;
        }
        if ("ISO_29500_2008_TRANSITIONAL".equals(str)) {
            return 1;
        }
        if ("ISO_29500_2008_STRICT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown OoxmlCompliance name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown OoxmlCompliance value." : "ISO_29500_2008_STRICT" : "ISO_29500_2008_TRANSITIONAL" : "ECMA_376_2006";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown OoxmlCompliance value." : "Iso29500_2008_Strict" : "Iso29500_2008_Transitional" : "Ecma376_2006";
    }
}
