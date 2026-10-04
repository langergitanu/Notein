package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class VbaReferenceType {
    public static final int CONTROL = 47;
    public static final int ORIGINAL = 51;
    public static final int PROJECT = 14;
    public static final int REGISTERED = 13;
    public static final int length = 4;

    private VbaReferenceType() {
    }

    public static int fromName(String str) {
        if ("REGISTERED".equals(str)) {
            return 13;
        }
        if ("PROJECT".equals(str)) {
            return 14;
        }
        if ("ORIGINAL".equals(str)) {
            return 51;
        }
        if ("CONTROL".equals(str)) {
            return 47;
        }
        throw new IllegalArgumentException("Unknown VbaReferenceType name.");
    }

    public static String getName(int i) {
        return i != 13 ? i != 14 ? i != 47 ? i != 51 ? "Unknown VbaReferenceType value." : "ORIGINAL" : "CONTROL" : "PROJECT" : "REGISTERED";
    }

    public static int[] getValues() {
        return new int[]{13, 14, 51, 47};
    }

    public static String toString(int i) {
        return i != 13 ? i != 14 ? i != 47 ? i != 51 ? "Unknown VbaReferenceType value." : "Original" : "Control" : "Project" : "Registered";
    }
}
