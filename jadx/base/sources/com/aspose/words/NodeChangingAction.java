package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class NodeChangingAction {
    public static final int INSERT = 0;
    public static final int REMOVE = 1;
    public static final int length = 2;

    private NodeChangingAction() {
    }

    public static int fromName(String str) {
        if ("INSERT".equals(str)) {
            return 0;
        }
        if ("REMOVE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown NodeChangingAction name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown NodeChangingAction value." : "REMOVE" : "INSERT";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown NodeChangingAction value." : "Remove" : "Insert";
    }
}
