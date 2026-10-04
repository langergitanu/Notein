package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisBuiltInUnit {
    public static final int BILLIONS = 2;
    public static final int CUSTOM = 1;
    public static final int HUNDREDS = 4;
    public static final int HUNDRED_MILLIONS = 3;
    public static final int HUNDRED_THOUSANDS = 5;
    public static final int MILLIONS = 6;
    public static final int NONE = 0;
    public static final int PERCENTAGE = 11;
    public static final int TEN_MILLIONS = 7;
    public static final int TEN_THOUSANDS = 8;
    public static final int THOUSANDS = 9;
    public static final int TRILLIONS = 10;
    public static final int length = 12;

    private AxisBuiltInUnit() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("CUSTOM".equals(str)) {
            return 1;
        }
        if ("BILLIONS".equals(str)) {
            return 2;
        }
        if ("HUNDRED_MILLIONS".equals(str)) {
            return 3;
        }
        if ("HUNDREDS".equals(str)) {
            return 4;
        }
        if ("HUNDRED_THOUSANDS".equals(str)) {
            return 5;
        }
        if ("MILLIONS".equals(str)) {
            return 6;
        }
        if ("TEN_MILLIONS".equals(str)) {
            return 7;
        }
        if ("TEN_THOUSANDS".equals(str)) {
            return 8;
        }
        if ("THOUSANDS".equals(str)) {
            return 9;
        }
        if ("TRILLIONS".equals(str)) {
            return 10;
        }
        if ("PERCENTAGE".equals(str)) {
            return 11;
        }
        throw new IllegalArgumentException("Unknown AxisBuiltInUnit name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "CUSTOM";
            case 2:
                return "BILLIONS";
            case 3:
                return "HUNDRED_MILLIONS";
            case 4:
                return "HUNDREDS";
            case 5:
                return "HUNDRED_THOUSANDS";
            case 6:
                return "MILLIONS";
            case 7:
                return "TEN_MILLIONS";
            case 8:
                return "TEN_THOUSANDS";
            case 9:
                return "THOUSANDS";
            case 10:
                return "TRILLIONS";
            case 11:
                return "PERCENTAGE";
            default:
                return "Unknown AxisBuiltInUnit value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "Custom";
            case 2:
                return "Billions";
            case 3:
                return "HundredMillions";
            case 4:
                return "Hundreds";
            case 5:
                return "HundredThousands";
            case 6:
                return "Millions";
            case 7:
                return "TenMillions";
            case 8:
                return "TenThousands";
            case 9:
                return "Thousands";
            case 10:
                return "Trillions";
            case 11:
                return "Percentage";
            default:
                return "Unknown AxisBuiltInUnit value.";
        }
    }
}
