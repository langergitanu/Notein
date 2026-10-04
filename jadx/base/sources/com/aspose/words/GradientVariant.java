package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class GradientVariant {
    public static final int NONE = 0;
    public static final int VARIANT_1 = 1;
    public static final int VARIANT_2 = 2;
    public static final int VARIANT_3 = 3;
    public static final int VARIANT_4 = 4;
    public static final int length = 5;

    private GradientVariant() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("VARIANT_1".equals(str)) {
            return 1;
        }
        if ("VARIANT_2".equals(str)) {
            return 2;
        }
        if ("VARIANT_3".equals(str)) {
            return 3;
        }
        if ("VARIANT_4".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown GradientVariant name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown GradientVariant value." : "VARIANT_4" : "VARIANT_3" : "VARIANT_2" : "VARIANT_1" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown GradientVariant value." : "Variant4" : "Variant3" : "Variant2" : "Variant1" : "None";
    }
}
