package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCC {
    public static boolean zzXm(long j) {
        return Float.intBitsToFloat((int) j) == 0.0f || com.aspose.words.internal.zzZPW.zzYz(j) == 0.0f;
    }

    public static boolean zzZx(Shape shape) throws Exception {
        int shapeType = shape.getShapeType();
        return (shapeType == 1 || shapeType == 202) && shape.zzY9J().getFillType() == 3 && !shape.getExtrusionEnabled() && shape.zzY9J().getOpacity() == 1.0d && shape.zzY9J().zzZBv() == 1.0d && !shape.zzY9J().zzZBs() && com.aspose.words.internal.zzEF.zzZH(shape.getFill().getImageBytes());
    }

    public static boolean zzZy(Shape shape) {
        int shapeType = shape.getShapeType();
        return shapeType == -2 || shapeType == 75 || shapeType == 201;
    }

    public static int zzmf(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    public static int zzmg(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    public static int zzmh(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException();
    }
}
