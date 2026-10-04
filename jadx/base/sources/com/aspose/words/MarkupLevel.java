package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class MarkupLevel {
    public static final int BLOCK = 2;
    public static final int CELL = 4;
    public static final int INLINE = 1;
    public static final int ROW = 3;
    public static final int UNKNOWN = 0;
    public static final int length = 5;

    private MarkupLevel() {
    }

    public static int fromName(String str) {
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 0;
        }
        if ("INLINE".equals(str)) {
            return 1;
        }
        if ("BLOCK".equals(str)) {
            return 2;
        }
        if ("ROW".equals(str)) {
            return 3;
        }
        if ("CELL".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown MarkupLevel name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown MarkupLevel value." : "CELL" : "ROW" : "BLOCK" : "INLINE" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown MarkupLevel value." : "Cell" : "Row" : "Block" : "Inline" : "Unknown";
    }
}
