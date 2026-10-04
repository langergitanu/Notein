package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class JoinStyle {
    public static final int BEVEL = 0;
    public static final int MITER = 1;
    public static final int ROUND = 2;
    public static final int length = 3;

    private JoinStyle() {
    }

    public static int fromName(String str) {
        if ("BEVEL".equals(str)) {
            return 0;
        }
        if ("MITER".equals(str)) {
            return 1;
        }
        if ("ROUND".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown JoinStyle name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown JoinStyle value." : "ROUND" : "MITER" : "BEVEL";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown JoinStyle value." : "Round" : "Miter" : "Bevel";
    }
}
