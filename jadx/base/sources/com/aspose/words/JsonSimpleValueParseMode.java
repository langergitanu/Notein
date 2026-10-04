package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class JsonSimpleValueParseMode {
    public static final int LOOSE = 0;
    public static final int STRICT = 1;
    public static final int length = 2;

    private JsonSimpleValueParseMode() {
    }

    public static int fromName(String str) {
        if ("LOOSE".equals(str)) {
            return 0;
        }
        if ("STRICT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown JsonSimpleValueParseMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown JsonSimpleValueParseMode value." : "STRICT" : "LOOSE";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown JsonSimpleValueParseMode value." : "Strict" : "Loose";
    }
}
