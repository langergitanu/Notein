package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Orientation {
    public static final int LANDSCAPE = 2;
    public static final int PORTRAIT = 1;
    public static final int length = 2;

    private Orientation() {
    }

    public static int fromName(String str) {
        if ("PORTRAIT".equals(str)) {
            return 1;
        }
        if ("LANDSCAPE".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown Orientation name.");
    }

    public static String getName(int i) {
        return i != 1 ? i != 2 ? "Unknown Orientation value." : "LANDSCAPE" : "PORTRAIT";
    }

    public static int[] getValues() {
        return new int[]{1, 2};
    }

    public static String toString(int i) {
        return i != 1 ? i != 2 ? "Unknown Orientation value." : "Landscape" : "Portrait";
    }
}
