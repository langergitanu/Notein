package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MergeFormatMode {
    public static final int KEEP_SOURCE_FORMATTING = 1;
    public static final int KEEP_SOURCE_LAYOUT = 2;
    public static final int MERGE_FORMATTING = 0;
    public static final int length = 3;

    private MergeFormatMode() {
    }

    public static int fromName(String str) {
        if ("MERGE_FORMATTING".equals(str)) {
            return 0;
        }
        if ("KEEP_SOURCE_FORMATTING".equals(str)) {
            return 1;
        }
        if ("KEEP_SOURCE_LAYOUT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown MergeFormatMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MergeFormatMode value." : "KEEP_SOURCE_LAYOUT" : "KEEP_SOURCE_FORMATTING" : "MERGE_FORMATTING";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MergeFormatMode value." : "KeepSourceLayout" : "KeepSourceFormatting" : "MergeFormatting";
    }
}
