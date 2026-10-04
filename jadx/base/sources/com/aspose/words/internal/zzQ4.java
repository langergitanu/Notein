package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ4 {
    private static double zz4(double d) {
        return d > 3.141592653589793d ? d - 6.283185307179586d : d < -3.141592653589793d ? d + 6.283185307179586d : d;
    }

    private static double zzY(double d, double d2, int i) {
        if (i != 0) {
            if (i == 1 && d2 > d) {
                d += 6.283185307179586d;
            }
        } else if (d2 < d) {
            d2 += 6.283185307179586d;
        }
        return d2 - d;
    }

    public static zzQ5 zzZ(zzZQ4 zzzq4, long j, long j2) {
        return zzZ(zzzq4, j, j2, 2);
    }

    public static zzQ5 zzZ(zzZQ4 zzzq4, long j, long j2, int i) {
        long jZzG = zzZPW.zzG(zzzq4.getWidth() / 2.0f, zzzq4.getHeight() / 2.0f);
        int iZzG = (int) zzZPY.zzG(Float.intBitsToFloat((int) jZzG) + zzzq4.getX(), zzZPW.zzYz(jZzG) + zzzq4.getY());
        double dAtan2 = Math.atan2(zzZPY.zzYC(j) - zzZPY.zzYC(r0), Float.intBitsToFloat((int) j) - Float.intBitsToFloat(iZzG));
        return new zzQ5(zzzq4, zzAN.zzZK(dAtan2), zzZ(dAtan2, Math.atan2(zzZPY.zzYC(j2) - zzZPY.zzYC(r0), Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(iZzG)), i));
    }

    private static double zzZ(double d, double d2, int i) {
        double dZzY = zzY(d, d2, i);
        if (dZzY == 0.0d) {
            return 360.0d;
        }
        if (i == 2) {
            dZzY = zz4(dZzY);
        }
        return zzAN.zzZK(dZzY);
    }
}
