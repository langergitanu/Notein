package com.aspose.words;

import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartYValueType {
    public static final int DATE_TIME = 1;
    public static final int DOUBLE = 0;
    public static final int TIME = 2;
    public static final int length = 3;

    private ChartYValueType() {
    }

    public static int fromName(String str) {
        if ("DOUBLE".equals(str)) {
            return 0;
        }
        if ("DATE_TIME".equals(str)) {
            return 1;
        }
        if ("TIME".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ChartYValueType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ChartYValueType value." : "TIME" : "DATE_TIME" : "DOUBLE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ChartYValueType value." : PerfConstants.CodeMarkerParameters.TIME : "DateTime" : "Double";
    }
}
