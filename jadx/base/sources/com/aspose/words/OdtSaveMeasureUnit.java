package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class OdtSaveMeasureUnit {
    public static final int CENTIMETERS = 0;
    public static final int INCHES = 1;
    public static final int length = 2;

    private OdtSaveMeasureUnit() {
    }

    public static int fromName(String str) {
        if ("CENTIMETERS".equals(str)) {
            return 0;
        }
        if ("INCHES".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown OdtSaveMeasureUnit name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown OdtSaveMeasureUnit value." : "INCHES" : "CENTIMETERS";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown OdtSaveMeasureUnit value." : "Inches" : "Centimeters";
    }
}
