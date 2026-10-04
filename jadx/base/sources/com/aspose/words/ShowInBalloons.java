package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ShowInBalloons {
    public static final int FORMAT = 1;
    public static final int FORMAT_AND_DELETE = 2;
    public static final int NONE = 0;
    public static final int length = 3;

    private ShowInBalloons() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("FORMAT".equals(str)) {
            return 1;
        }
        if ("FORMAT_AND_DELETE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ShowInBalloons name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ShowInBalloons value." : "FORMAT_AND_DELETE" : "FORMAT" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ShowInBalloons value." : "FormatAndDelete" : "Format" : "None";
    }
}
