package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartAxisType {
    public static final int CATEGORY = 0;
    public static final int SERIES = 1;
    public static final int VALUE = 2;
    public static final int length = 3;

    private ChartAxisType() {
    }

    public static int fromName(String str) {
        if ("CATEGORY".equals(str)) {
            return 0;
        }
        if ("SERIES".equals(str)) {
            return 1;
        }
        if ("VALUE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ChartAxisType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ChartAxisType value." : "VALUE" : "SERIES" : "CATEGORY";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ChartAxisType value." : "Value" : "Series" : "Category";
    }
}
