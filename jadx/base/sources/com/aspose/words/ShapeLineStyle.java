package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ShapeLineStyle {
    public static final int DEFAULT = 0;
    public static final int DOUBLE = 1;
    public static final int SINGLE = 0;
    public static final int THICK_THIN = 2;
    public static final int THIN_THICK = 3;
    public static final int TRIPLE = 4;
    public static final int length = 6;

    private ShapeLineStyle() {
    }

    public static int fromName(String str) {
        if ("SINGLE".equals(str)) {
            return 0;
        }
        if ("DOUBLE".equals(str)) {
            return 1;
        }
        if ("THICK_THIN".equals(str)) {
            return 2;
        }
        if ("THIN_THICK".equals(str)) {
            return 3;
        }
        if ("TRIPLE".equals(str)) {
            return 4;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown ShapeLineStyle name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown ShapeLineStyle value." : "TRIPLE" : "THIN_THICK" : "THICK_THIN" : "DOUBLE" : "SINGLE | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown ShapeLineStyle value." : "Triple" : "ThinThick" : "ThickThin" : "Double" : "Single | Default";
    }
}
