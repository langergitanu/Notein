package com.aspose.words.internal;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes5.dex */
public final class zzAL {
    private final Matrix mMatrix;
    private final float[] zzs5;

    public zzAL(Matrix matrix) {
        float[] fArr = new float[9];
        this.zzs5 = fArr;
        this.mMatrix = matrix;
        matrix.getValues(fArr);
    }

    public static Matrix zzG(zzP9 zzp9) {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{zzp9.zzOf(), zzp9.zzOd(), zzp9.zzOb(), zzp9.zzOe(), zzp9.zzOc(), zzp9.zzOa(), 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    private static boolean zzI(double d, double d2) {
        return Math.abs(d - d2) < 1.0E-6d;
    }

    public static boolean zzY(Matrix matrix) {
        if (matrix == null) {
            return true;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        double d = fArr[0];
        double d2 = fArr[4];
        double d3 = fArr[1];
        double d4 = fArr[3];
        return ((zzI(d, 1.3333333730697632d) || zzI(d, -1.3333333730697632d)) && ((zzI(d2, 1.3333333730697632d) || zzI(d2, -1.3333333730697632d)) && zzI(d3, 0.0d) && zzI(d4, 0.0d))) || (zzI(d, 0.0d) && zzI(d2, 0.0d) && ((zzI(d3, 1.3333333730697632d) || zzI(d3, -1.3333333730697632d)) && (zzI(d4, 1.3333333730697632d) || zzI(d4, -1.3333333730697632d))));
    }

    public static zzP9 zzZ(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new zzP9(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    public final float getScaleX() {
        return this.zzs5[0];
    }

    public final float getScaleY() {
        return this.zzs5[4];
    }

    public final void scale(float f, float f2) {
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.preScale(f, f2);
        }
    }

    public final float zzAK() {
        if (this.mMatrix == null) {
            return 1.0f;
        }
        float[] fArr = this.zzs5;
        return Math.abs(Math.min(fArr[0], fArr[4]));
    }

    public final Matrix zzAL() {
        return this.mMatrix;
    }
}
