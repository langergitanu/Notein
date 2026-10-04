package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQO {
    public static int hashCode(double d) {
        return new Double(d).hashCode();
    }

    public static double zzZ(double d, int i) {
        double dPow = Math.pow(10.0d, i);
        return zzZKQ.zzZb(d * dPow) / dPow;
    }

    public static int zze(double d) {
        if (Double.isNaN(d)) {
            return Integer.MIN_VALUE;
        }
        return (int) d;
    }
}
