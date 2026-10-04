package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class VbaModuleType {
    public static final int CLASS_MODULE = 2;
    public static final int DESIGNER_MODULE = 3;
    public static final int DOCUMENT_MODULE = 0;
    public static final int PROCEDURAL_MODULE = 1;
    public static final int length = 4;

    private VbaModuleType() {
    }

    public static int fromName(String str) {
        if ("DOCUMENT_MODULE".equals(str)) {
            return 0;
        }
        if ("PROCEDURAL_MODULE".equals(str)) {
            return 1;
        }
        if ("CLASS_MODULE".equals(str)) {
            return 2;
        }
        if ("DESIGNER_MODULE".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown VbaModuleType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown VbaModuleType value." : "DESIGNER_MODULE" : "CLASS_MODULE" : "PROCEDURAL_MODULE" : "DOCUMENT_MODULE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown VbaModuleType value." : "DesignerModule" : "ClassModule" : "ProceduralModule" : "DocumentModule";
    }
}
