package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZ7 {
    public static double zzT5(int i) {
        double d = ((double) i) / 255.0d;
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        if (d <= 1.0d) {
            return Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
        return 1.0d;
    }

    public static zzPV zzW(double[] dArr) {
        int iZzZt = 255;
        for (double d : dArr) {
            iZzZt = (iZzZt << 8) | zzZt(d);
        }
        return new zzPV(iZzZt);
    }

    public static int zzZt(double d) {
        double dPow = 0.0d;
        if (d >= 0.0d) {
            if (d <= 0.0031308d) {
                dPow = 12.92d * d;
            } else {
                dPow = 1.0d;
                if (d < 1.0d) {
                    dPow = (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
                }
            }
        }
        return zzAN.zzZG(dPow * 255.0d);
    }

    public static double[] zzs(zzPV zzpv) {
        int argb = zzpv.toArgb();
        double[] dArr = new double[3];
        for (int i = 2; i >= 0; i--) {
            dArr[i] = zzT5(argb & 255);
            argb >>= 8;
        }
        return dArr;
    }
}
