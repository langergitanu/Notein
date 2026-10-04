package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class MailMergeRtlCleanupMode {
    public static final int DONT_REMOVE = 0;
    public static final int REMOVE_ALL = 1;
    public static final int REMOVE_FOR_LTR_TEXT = 2;
    public static final int length = 3;

    private MailMergeRtlCleanupMode() {
    }

    public static int fromName(String str) {
        if ("DONT_REMOVE".equals(str)) {
            return 0;
        }
        if ("REMOVE_ALL".equals(str)) {
            return 1;
        }
        if ("REMOVE_FOR_LTR_TEXT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown MailMergeRtlCleanupMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MailMergeRtlCleanupMode value." : "REMOVE_FOR_LTR_TEXT" : "REMOVE_ALL" : "DONT_REMOVE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown MailMergeRtlCleanupMode value." : "RemoveForLtrText" : "RemoveAll" : "DontRemove";
    }
}
