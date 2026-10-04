package com.aspose.words.internal;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;

/* JADX INFO: loaded from: classes5.dex */
final class zzQ3 {
    private double[] zzKp = new double[4];
    private int zzKq;

    private void zz3(double d) {
        if (d < 0.0d || 1.0d < d) {
            return;
        }
        double[] dArr = this.zzKp;
        int i = this.zzKq;
        dArr[i] = d;
        this.zzKq = i + 1;
    }

    private static double zzM(double d, double d2) {
        return (d2 * 3.0d) - (d * 3.0d);
    }

    private void zzU(double d, double d2, double d3) {
        double dZzV = zzV(d, d2, d3);
        if (dZzV < 0.0d) {
            return;
        }
        if (d == 0.0d) {
            if (d2 != 0.0d) {
                zz3((-d3) / d2);
            }
        } else if (dZzV == 0.0d) {
            zz3(zzZ(d, d2, d3, true));
        } else {
            zz3(zzZ(d, d2, d3, true));
            zz3(zzZ(d, d2, d3, false));
        }
    }

    private static double zzV(double d, double d2, double d3) {
        return C21825OoooOO0.OooO00o(d, 4.0d, d3, Math.pow(d2, 2.0d));
    }

    private static double zzW(double d, double d2, double d3) {
        return (d * 6.0d) + ((d3 * 6.0d) - (d2 * 12.0d));
    }

    private void zzX(long j, long j2, long j3, long j4) {
        int i = (int) j;
        int i2 = (int) j2;
        int i3 = (int) j3;
        double dZzY = zzY(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) j4));
        double dZzW = zzW(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        double dZzM = zzM(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        double dZzY2 = zzY(zzZPY.zzYC(j), zzZPY.zzYC(j2), zzZPY.zzYC(j3), zzZPY.zzYC(j4));
        double dZzW2 = zzW(zzZPY.zzYC(j), zzZPY.zzYC(j2), zzZPY.zzYC(j3));
        double dZzM2 = zzM(zzZPY.zzYC(j), zzZPY.zzYC(j2));
        zzU(dZzY, dZzW, dZzM);
        zzU(dZzY2, dZzW2, dZzM2);
    }

    private static double zzY(double d, double d2, double d3, double d4) {
        return ((d2 * 9.0d) + ((d4 * 3.0d) - (d3 * 9.0d))) - (d * 3.0d);
    }

    private static double zzZ(double d, double d2, double d3, double d4, double d5) {
        double d6 = d3 * 3.0d;
        double d7 = d2 * 3.0d;
        double dPow = Math.pow(d5, 3.0d) * (((d4 - d6) + d7) - d);
        double d8 = 3.0d * d;
        return ((d7 - d8) * d5) + (Math.pow(d5, 2.0d) * ((d6 - (d2 * 6.0d)) + d8)) + dPow + d;
    }

    private zz0Q zzW(long j, long j2, long j3, long j4) {
        zzQ3 zzq3 = this;
        long j5 = j;
        zz0Q zz0q = new zz0Q();
        zz0q.add(j5);
        zz0q.add(j4);
        int i = 0;
        while (i < zzq3.zzKq) {
            double d = zzq3.zzKp[i];
            zz0q.add(zzZPY.zzG((float) zzZ(Float.intBitsToFloat((int) j5), Float.intBitsToFloat((int) j2), Float.intBitsToFloat((int) j3), Float.intBitsToFloat((int) j4), d), (float) zzZ(zzZPY.zzYC(j), zzZPY.zzYC(j2), zzZPY.zzYC(j3), zzZPY.zzYC(j4), d)));
            i++;
            zzq3 = this;
            j5 = j;
        }
        return zz0q;
    }

    public final zzZQ4 zzY(zzPZ zzpz) {
        return zzpz == null ? zzZQ4.zz2T : zzY(zzpz.zzPX(), zzpz.zzPL(), zzpz.zzPK(), zzpz.zzPW());
    }

    private static double zzZ(double d, double d2, double d3, boolean z) {
        return ((Math.sqrt(zzV(d, d2, d3)) * (z ? 1.0d : -1.0d)) + (-d2)) / (d * 2.0d);
    }

    private zzZQ4 zzY(long j, long j2, long j3, long j4) {
        if (zzZPY.zzD(j, j2) && zzZPY.zzD(j, j3) && zzZPY.zzD(j, j4)) {
            return new zzZQ4(j, 0L);
        }
        this.zzKq = 0;
        zzX(j, j2, j3, j4);
        return zzY(zzW(j, j2, j3, j4));
    }

    private static zzZQ4 zzY(zz0Q zz0q) {
        float fMin = Float.MAX_VALUE;
        float fMax = -3.4028235E38f;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = -3.4028235E38f;
        for (int i = 0; i < zz0q.getCount(); i++) {
            long j = zz0q.get(i);
            int i2 = (int) j;
            fMin = Math.min(Float.intBitsToFloat(i2), fMin);
            fMin2 = Math.min(zzZPY.zzYC(j), fMin2);
            fMax2 = Math.max(Float.intBitsToFloat(i2), fMax2);
            fMax = Math.max(zzZPY.zzYC(j), fMax);
        }
        return new zzZQ4(fMin, fMin2, fMax2 - fMin, fMax - fMin2);
    }
}
