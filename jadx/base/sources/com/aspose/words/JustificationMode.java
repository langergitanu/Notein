package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class JustificationMode {
    public static final int COMPRESS = 1;
    public static final int COMPRESS_KANA = 2;
    public static final int EXPAND = 0;
    public static final int length = 3;

    private JustificationMode() {
    }

    public static int fromName(String str) {
        if ("EXPAND".equals(str)) {
            return 0;
        }
        if ("COMPRESS".equals(str)) {
            return 1;
        }
        if ("COMPRESS_KANA".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown JustificationMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown JustificationMode value." : "COMPRESS_KANA" : "COMPRESS" : "EXPAND";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown JustificationMode value." : "CompressKana" : "Compress" : "Expand";
    }
}
