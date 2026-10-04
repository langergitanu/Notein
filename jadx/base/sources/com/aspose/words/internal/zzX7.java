package com.aspose.words.internal;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzX7 {
    private static float[][] zzUQ = {new float[]{1.1f, 2.6f, 4.5f}, new float[]{1.4f, 1.9f, 2.3f}, new float[]{1.4f, 1.7f, 1.9f}};

    private static boolean zzZ(double d, double d2, double d3) {
        return d2 < d3 ? d <= d3 && d >= d2 : d <= d2 && d >= d3;
    }

    public static void zzZ(zzPZ zzpz, float f, boolean z) {
        long jZzPW;
        long jZzPK;
        if (f <= 0.0f) {
            return;
        }
        if (z) {
            jZzPW = zzpz.zzPX();
            jZzPK = zzpz.zzPL();
        } else {
            jZzPW = zzpz.zzPW();
            jZzPK = zzpz.zzPK();
        }
        zzZ(f, zzpz, jZzPW, jZzPK, z);
    }

    private static void zzZ(float f, zzPZ zzpz, long j, long j2, boolean z) {
        long jZzPX;
        long jZzZ;
        if (z) {
            jZzPX = zzZ(j, j2, f);
        } else {
            jZzPX = zzpz.zzPX();
        }
        zzpz.zzy(jZzPX);
        if (z) {
            jZzZ = zzpz.zzPW();
        } else {
            jZzZ = zzZ(j, j2, f);
        }
        zzpz.zzv(jZzZ);
    }

    public static float zzZ(int i, float f, int i2, int i3, float f2) {
        float f3;
        float f4 = zzBV.zzsZ[i3] * f;
        switch (i) {
            case 1:
                f3 = 2.9f;
                break;
            case 2:
                f3 = 1.8000001f;
                break;
            case 3:
            case 4:
                f3 = 0.5f;
                break;
            case 5:
                return f * zzUQ[i2][i3];
            case 6:
                return f * f2;
            default:
                throw new IllegalStateException("Invalid line end type.");
        }
        return f4 * f3;
    }

    public static boolean zzZ(zzOS zzos, int i, float f, boolean z) {
        float fZzO;
        float f2 = f;
        int iZzZ = zzBV.zzZ(zzos, z);
        long j = zzos.zzNu().get(iZzZ);
        if (zzAN.zzf(f2)) {
            return true;
        }
        float f3 = 0.0f;
        if (f2 < 0.0f && i != 6) {
            return true;
        }
        int i2 = z ? 1 : -1;
        int i3 = iZzZ + i2;
        long j2 = zzos.zzNu().get(i3);
        if (f2 < 0.0f) {
            zzos.zzNu().zzT(z ? 0 : zzos.zzNu().getCount(), zzZ(j, j2, f2));
            return true;
        }
        int i4 = i2;
        long j3 = j;
        while (true) {
            fZzO = zzJ6.zzO(j, j2);
            if (fZzO >= f2) {
                break;
            }
            if (fZzO > f3) {
                f3 = fZzO;
            }
            i3 += i4;
            if (i3 < 0 || i3 >= zzos.zzNu().getCount()) {
                break;
            }
            long j4 = j2;
            j2 = zzos.zzNu().get(i3);
            j3 = j4;
        }
        if (zzAN.zzf(f3)) {
            return false;
        }
        i3 -= i4;
        f2 = 0.5f * f3;
        float f4 = f2;
        zzZ(zzos, z, i3);
        if (fZzO > f4) {
            long jZzZ = zzZ(j3, j2, f4, j);
            if (!Float.isNaN(Float.intBitsToFloat((int) jZzZ)) && !Float.isNaN(zzZPY.zzYC(jZzZ))) {
                zzos.zzNu().zzT(z ? 0 : zzos.zzNu().getCount(), jZzZ);
            }
        }
        return true;
    }

    private static void zzZ(zzOS zzos, boolean z, int i) {
        if (z) {
            while (i > 0) {
                zzos.zzNu().removeAt(0);
                i--;
            }
        } else {
            for (int count = zzos.zzNu().getCount() - 1; count > i; count--) {
                zzos.zzNu().removeAt(count);
            }
        }
    }

    private static long zzZ(long j, long j2, float f) {
        int i = (int) j;
        double dIntBitsToFloat = Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i);
        double dZzYC = zzZPY.zzYC(j2) - zzZPY.zzYC(j);
        double dSqrt = Math.sqrt(zzAN.zzZM(dZzYC) + zzAN.zzZM(dIntBitsToFloat));
        double d = dSqrt != 0.0d ? ((double) f) / dSqrt : 0.0d;
        return zzZPY.zzG((float) ((dIntBitsToFloat * d) + ((double) Float.intBitsToFloat(i))), (float) ((dZzYC * d) + ((double) zzZPY.zzYC(j))));
    }

    private static long zzZ(long j, long j2, float f, long j3) {
        int i = (int) j3;
        double dIntBitsToFloat = Float.intBitsToFloat(i);
        double dZzYC = zzZPY.zzYC(j3);
        int i2 = (int) j;
        double dIntBitsToFloat2 = Float.intBitsToFloat(i2);
        double dZzYC2 = zzZPY.zzYC(j);
        int i3 = (int) j2;
        double dIntBitsToFloat3 = Float.intBitsToFloat(i3);
        double d = dIntBitsToFloat3 - dIntBitsToFloat2;
        double dZzYC3 = ((double) zzZPY.zzYC(j2)) - dZzYC2;
        boolean z = Math.abs(d) < Math.abs(dZzYC3);
        if (z) {
            dIntBitsToFloat = zzZPY.zzYC(j3);
            dZzYC = Float.intBitsToFloat(i);
            dIntBitsToFloat2 = zzZPY.zzYC(j);
            dZzYC2 = Float.intBitsToFloat(i2);
            double dZzYC4 = zzZPY.zzYC(j2);
            d = dZzYC4 - dIntBitsToFloat2;
            dIntBitsToFloat3 = dZzYC4;
            dZzYC3 = ((double) Float.intBitsToFloat(i3)) - dZzYC2;
        }
        double d2 = dZzYC3 / d;
        double d3 = d2 * dIntBitsToFloat2;
        double d4 = (dZzYC2 - dZzYC) - d3;
        double d5 = (d2 * d2) + 1.0d;
        double d6 = ((d2 * d4) - dIntBitsToFloat) * 2.0d;
        double dSqrt = Math.sqrt(C21825OoooOO0.OooO00o(d5, 4.0d, ((dIntBitsToFloat * dIntBitsToFloat) + (d4 * d4)) - ((double) (f * f)), d6 * d6));
        double d7 = -d6;
        double d8 = d5 * 2.0d;
        double d9 = (d7 + dSqrt) / d8;
        double d10 = !zzZ(d9, dIntBitsToFloat2, dIntBitsToFloat3) ? (d7 - dSqrt) / d8 : d9;
        double d11 = ((d2 * d10) - d3) + dZzYC2;
        if (z) {
            return zzZPY.zzG((float) d11, (float) d10);
        }
        return zzZPY.zzG((float) d10, (float) d11);
    }
}
