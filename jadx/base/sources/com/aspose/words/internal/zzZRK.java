package com.aspose.words.internal;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRK extends zzZRJ {
    private float[] zz4W;
    private PointF zz4X;
    private PointF zz4Y;
    private zzZQ4 zz4Z;
    private Shader.TileMode zz50;
    private final Matrix zz51;
    private int[] zzQi;
    private static final float[] zzr = {0.0f, 1.0f};
    private static final float[] zzq = {0.0f, 1.0f};

    public zzZRK(zzPA zzpa) {
        PointF pointF;
        zzR(zzpa);
        PointF pointF2 = this.zz4Y;
        if (pointF2 == null || (pointF = this.zz4X) == null) {
            throw new NullPointerException("Start and mEnd points must be non-null");
        }
        if (pointF2.equals(pointF)) {
            throw new IllegalArgumentException("Start point cannot equal endpoint");
        }
        zzQ(zzpa);
        float[] fArr = this.zz4W;
        if (fArr == null || fArr.length == 0) {
            throw new IllegalArgumentException("Interpolation mColors or blend attributes cannot be empty");
        }
        Matrix matrixZzG = zzAL.zzG(zzpa.zzNb());
        this.zz51 = matrixZzG;
        this.zz50 = Shader.TileMode.REPEAT;
        if (zzpa.zzNa() != 0 && zzpa.zzNa() != 4) {
            this.zz50 = Shader.TileMode.MIRROR;
        }
        PointF pointF3 = this.zz4Y;
        float f = pointF3.x;
        float f2 = pointF3.y;
        PointF pointF4 = this.zz4X;
        LinearGradient linearGradient = new LinearGradient(f, f2, pointF4.x, pointF4.y, this.zzQi, this.zz4W, this.zz50);
        linearGradient.setLocalMatrix(matrixZzG);
        zzZ(linearGradient);
    }

    private static int[] zzP(zzPA zzpa) {
        zzDB zzdb = new zzDB();
        int iZzPG = zzpa.zzOv().zzPG();
        int iZzPG2 = zzpa.zzOu().zzPG();
        if (zzpa.zzOP() == null) {
            float[] fArrZzOO = zzpa.zzOO();
            if (fArrZzOO == null) {
                fArrZzOO = zzr;
            }
            float[] fArrZzON = zzpa.zzON();
            if (fArrZzON == null) {
                fArrZzON = zzq;
            }
            int length = fArrZzOO.length;
            float fRed = Color.red(iZzPG);
            float fGreen = Color.green(iZzPG);
            float fBlue = Color.blue(iZzPG);
            float fRed2 = Color.red(iZzPG2);
            float fGreen2 = Color.green(iZzPG2);
            float fBlue2 = Color.blue(iZzPG2);
            for (int i = 0; i < length; i++) {
                float f = fArrZzON[i];
                float f2 = 1.0f - f;
                zzdb.add(Color.rgb((int) ((f2 * fRed) + (f * fRed2)), (int) ((f2 * fGreen) + (f * fGreen2)), (int) ((f2 * fBlue) + (f * fBlue2))));
            }
        }
        return zzdb.toArray();
    }

    private void zzQ(zzPA zzpa) {
        zzPI[] zzpiArrZzOP = zzpa.zzOP();
        if (zzpiArrZzOP != null && zzpiArrZzOP.length > 0) {
            this.zz4W = new float[zzpiArrZzOP.length];
            this.zzQi = new int[zzpiArrZzOP.length];
            for (int i = 0; i < zzpiArrZzOP.length; i++) {
                zzPI zzpi = zzpiArrZzOP[i];
                this.zz4W[i] = zzpi.zzOG();
                this.zzQi[i] = zzpi.zzZy().zzPG();
            }
        } else if (zzpa.zzOO() != null) {
            this.zz4W = new float[zzpa.zzOO().length];
            this.zzQi = new int[zzpa.zzOO().length];
            this.zz4W = zzpa.zzOO();
            this.zzQi = zzP(zzpa);
        } else {
            this.zz4W = new float[]{0.0f, 1.0f};
            this.zzQi = new int[]{zzpa.zzOv().zzPG(), zzpa.zzOu().zzPG()};
        }
        float[] fArr = this.zz4W;
        fArr[0] = 0.0f;
        fArr[fArr.length - 1] = 1.0f;
    }

    private void zzR(zzPA zzpa) {
        zzZQ4 zzzq4ZzOw = zzpa.zzOw();
        zzZQ4 zzzq4 = new zzZQ4(zzzq4ZzOw.getX(), zzzq4ZzOw.getY(), zzzq4ZzOw.getWidth(), zzzq4ZzOw.getHeight());
        this.zz4Z = zzzq4;
        float fZzZm = zzzq4.zzZm();
        float fZzkw = this.zz4Z.zzkw();
        float fZzZn = (this.zz4Z.zzZn() - this.zz4Z.zzZo()) / 2.0f;
        this.zz4Y = new PointF(fZzZm, fZzZn);
        this.zz4X = new PointF(fZzkw, fZzZn);
    }
}
