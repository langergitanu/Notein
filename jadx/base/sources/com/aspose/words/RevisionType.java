package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class RevisionType {
    public static final int DELETION = 1;
    public static final int FORMAT_CHANGE = 2;
    public static final int INSERTION = 0;
    public static final int MOVING = 4;
    public static final int STYLE_DEFINITION_CHANGE = 3;
    public static final int length = 5;

    private RevisionType() {
    }

    public static int fromName(String str) {
        if ("INSERTION".equals(str)) {
            return 0;
        }
        if ("DELETION".equals(str)) {
            return 1;
        }
        if ("FORMAT_CHANGE".equals(str)) {
            return 2;
        }
        if ("STYLE_DEFINITION_CHANGE".equals(str)) {
            return 3;
        }
        if ("MOVING".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown RevisionType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown RevisionType value." : "MOVING" : "STYLE_DEFINITION_CHANGE" : "FORMAT_CHANGE" : "DELETION" : "INSERTION";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown RevisionType value." : "Moving" : "StyleDefinitionChange" : "FormatChange" : "Deletion" : "Insertion";
    }
}
