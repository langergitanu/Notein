package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MailMergeCheckErrors {
    public static final int COLLECT_ERRORS = 3;
    public static final int DEFAULT = 2;
    public static final int PAUSE_ON_ERROR = 2;
    public static final int SIMULATE = 1;
    public static final int length = 4;

    private MailMergeCheckErrors() {
    }

    public static int fromName(String str) {
        if ("SIMULATE".equals(str)) {
            return 1;
        }
        if ("PAUSE_ON_ERROR".equals(str)) {
            return 2;
        }
        if ("COLLECT_ERRORS".equals(str)) {
            return 3;
        }
        if ("DEFAULT".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown MailMergeCheckErrors name.");
    }

    public static String getName(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown MailMergeCheckErrors value." : "COLLECT_ERRORS" : "PAUSE_ON_ERROR | DEFAULT" : "SIMULATE";
    }

    public static int[] getValues() {
        return new int[]{1, 2, 3, 2};
    }

    public static String toString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown MailMergeCheckErrors value." : "CollectErrors" : "PauseOnError | Default" : "Simulate";
    }
}
