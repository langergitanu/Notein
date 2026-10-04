package com.aspose.words;

import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisCategoryType {
    public static final int AUTOMATIC = 0;
    public static final int CATEGORY = 1;
    public static final int TIME = 2;
    public static final int length = 3;

    private AxisCategoryType() {
    }

    public static int fromName(String str) {
        if ("AUTOMATIC".equals(str)) {
            return 0;
        }
        if ("CATEGORY".equals(str)) {
            return 1;
        }
        if ("TIME".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown AxisCategoryType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown AxisCategoryType value." : "TIME" : "CATEGORY" : "AUTOMATIC";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown AxisCategoryType value." : PerfConstants.CodeMarkerParameters.TIME : "Category" : "Automatic";
    }
}
