package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class CalendarType {
    public static final int GREGORIAN = 0;
    public static final int HEBREW = 2;
    public static final int HIJRI = 1;
    public static final int SAKA_ERA = 3;
    public static final int UM_AL_QURA = 4;
    public static final int length = 5;

    private CalendarType() {
    }

    public static int fromName(String str) {
        if ("GREGORIAN".equals(str)) {
            return 0;
        }
        if ("HIJRI".equals(str)) {
            return 1;
        }
        if ("HEBREW".equals(str)) {
            return 2;
        }
        if ("SAKA_ERA".equals(str)) {
            return 3;
        }
        if ("UM_AL_QURA".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown CalendarType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown CalendarType value." : "UM_AL_QURA" : "SAKA_ERA" : "HEBREW" : "HIJRI" : "GREGORIAN";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown CalendarType value." : "UmAlQura" : "SakaEra" : "Hebrew" : "Hijri" : "Gregorian";
    }
}
