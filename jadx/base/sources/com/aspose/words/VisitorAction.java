package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class VisitorAction {
    public static final int CONTINUE = 0;
    public static final int SKIP_THIS_NODE = 1;
    public static final int STOP = 2;
    public static final int length = 3;

    private VisitorAction() {
    }

    public static int fromName(String str) {
        if ("CONTINUE".equals(str)) {
            return 0;
        }
        if ("SKIP_THIS_NODE".equals(str)) {
            return 1;
        }
        if ("STOP".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown VisitorAction name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown VisitorAction value." : "STOP" : "SKIP_THIS_NODE" : "CONTINUE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown VisitorAction value." : "Stop" : "SkipThisNode" : "Continue";
    }
}
