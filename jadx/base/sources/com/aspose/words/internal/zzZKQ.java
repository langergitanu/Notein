package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKQ {
    private static final double[] zzZPr = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d};
    private static double zzZPs = 1.0E16d;

    public static short max(short s, short s2) {
        return s >= s2 ? s : s2;
    }

    public static short min(short s, short s2) {
        return s <= s2 ? s : s2;
    }

    public static double zzE(double d, double d2) {
        if (d2 == 1.0d) {
            return Double.NaN;
        }
        if (d == 1.0d || !(d2 == 0.0d || d2 == Double.POSITIVE_INFINITY)) {
            return Math.log(d) / Math.log(d2);
        }
        return Double.NaN;
    }

    public static double zzR(double d, int i) {
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("digits");
        }
        if (Double.isNaN(d) || Math.abs(d) >= zzZPs) {
            return d;
        }
        double d2 = zzZPr[i];
        double dCeil = d * d2;
        double d3 = dCeil % 1.0d;
        if (Math.abs(d3) >= 0.5d) {
            dCeil += Math.signum(d3);
        }
        if (dCeil > 0.0d) {
            dCeil = Math.floor(dCeil);
        } else if (dCeil < 0.0d) {
            dCeil = Math.ceil(dCeil);
        }
        return dCeil / d2;
    }

    public static double zzS(double d, int i) {
        if (Double.isNaN(d)) {
            return d;
        }
        double d2 = zzZPr[i];
        return zzZa(d * d2) / d2;
    }

    public static int zzZ6(int i, int i2) {
        return (i ^ Integer.MIN_VALUE) <= (Integer.MIN_VALUE ^ i2) ? i : i2;
    }

    public static int zzZN(float f) {
        if (f < 0.0f) {
            return -1;
        }
        return f > 0.0f ? 1 : 0;
    }

    public static double zzZa(double d) {
        double dRint = Math.rint(d);
        if (dRint == -0.0d) {
            return 0.0d;
        }
        return dRint;
    }

    public static double zzZb(double d) {
        return d < 0.0d ? Math.ceil(d) : Math.floor(d);
    }
}
