package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ProtectionType {
    public static final int ALLOW_ONLY_COMMENTS = 1;
    public static final int ALLOW_ONLY_FORM_FIELDS = 2;
    public static final int ALLOW_ONLY_REVISIONS = 0;
    public static final int NO_PROTECTION = -1;
    public static final int READ_ONLY = 3;
    public static final int length = 5;

    private ProtectionType() {
    }

    public static int fromName(String str) {
        if ("ALLOW_ONLY_COMMENTS".equals(str)) {
            return 1;
        }
        if ("ALLOW_ONLY_FORM_FIELDS".equals(str)) {
            return 2;
        }
        if ("ALLOW_ONLY_REVISIONS".equals(str)) {
            return 0;
        }
        if ("READ_ONLY".equals(str)) {
            return 3;
        }
        if ("NO_PROTECTION".equals(str)) {
            return -1;
        }
        throw new IllegalArgumentException("Unknown ProtectionType name.");
    }

    public static String getName(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ProtectionType value." : "READ_ONLY" : "ALLOW_ONLY_FORM_FIELDS" : "ALLOW_ONLY_COMMENTS" : "ALLOW_ONLY_REVISIONS" : "NO_PROTECTION";
    }

    public static int[] getValues() {
        return new int[]{1, 2, 0, 3, -1};
    }

    public static String toString(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown ProtectionType value." : "ReadOnly" : "AllowOnlyFormFields" : "AllowOnlyComments" : "AllowOnlyRevisions" : "NoProtection";
    }
}
