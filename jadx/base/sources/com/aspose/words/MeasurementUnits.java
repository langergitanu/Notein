package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MeasurementUnits {
    public static final int CENTIMETERS = 1;
    public static final int INCHES = 0;
    public static final int MILLIMETERS = 2;
    public static final int PICAS = 4;
    public static final int POINTS = 3;
    public static final int length = 5;

    private MeasurementUnits() {
    }

    public static int fromName(String str) {
        if ("INCHES".equals(str)) {
            return 0;
        }
        if ("CENTIMETERS".equals(str)) {
            return 1;
        }
        if ("MILLIMETERS".equals(str)) {
            return 2;
        }
        if ("POINTS".equals(str)) {
            return 3;
        }
        if ("PICAS".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown MeasurementUnits name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown MeasurementUnits value." : "PICAS" : "POINTS" : "MILLIMETERS" : "CENTIMETERS" : "INCHES";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown MeasurementUnits value." : "Picas" : "Points" : "Millimeters" : "Centimeters" : "Inches";
    }
}
