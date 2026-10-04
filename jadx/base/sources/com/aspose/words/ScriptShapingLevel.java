package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class ScriptShapingLevel {
    public static final int FULL = 3;
    public static final int MINIMUM = 2;
    public static final int NONE = 0;
    public static final int UNKNOWN = 1;
    public static final int length = 4;

    private ScriptShapingLevel() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 1;
        }
        if ("MINIMUM".equals(str)) {
            return 2;
        }
        if ("FULL".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown ScriptShapingLevel name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ScriptShapingLevel value." : "FULL" : "MINIMUM" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ScriptShapingLevel value." : "Full" : "Minimum" : "Unknown" : "None";
    }
}
