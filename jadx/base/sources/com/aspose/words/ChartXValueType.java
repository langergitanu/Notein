package com.aspose.words;

import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartXValueType {
    public static final int DATE_TIME = 2;
    public static final int DOUBLE = 1;
    public static final int MULTILEVEL = 4;
    public static final int STRING = 0;
    public static final int TIME = 3;
    public static final int length = 5;

    private ChartXValueType() {
    }

    public static int fromName(String str) {
        if ("STRING".equals(str)) {
            return 0;
        }
        if ("DOUBLE".equals(str)) {
            return 1;
        }
        if ("DATE_TIME".equals(str)) {
            return 2;
        }
        if ("TIME".equals(str)) {
            return 3;
        }
        if ("MULTILEVEL".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown ChartXValueType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown ChartXValueType value." : "MULTILEVEL" : "TIME" : "DATE_TIME" : "DOUBLE" : "STRING";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown ChartXValueType value." : "Multilevel" : PerfConstants.CodeMarkerParameters.TIME : "DateTime" : "Double" : "String";
    }
}
