package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class DocumentDirection {
    public static final int AUTO = 2;
    public static final int LEFT_TO_RIGHT = 0;
    public static final int RIGHT_TO_LEFT = 1;
    public static final int length = 3;

    private DocumentDirection() {
    }

    public static int fromName(String str) {
        if ("LEFT_TO_RIGHT".equals(str)) {
            return 0;
        }
        if ("RIGHT_TO_LEFT".equals(str)) {
            return 1;
        }
        if ("AUTO".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown DocumentDirection name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DocumentDirection value." : "AUTO" : "RIGHT_TO_LEFT" : "LEFT_TO_RIGHT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DocumentDirection value." : "Auto" : "RightToLeft" : "LeftToRight";
    }
}
