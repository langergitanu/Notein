package com.aspose.words.internal;

import com.aspose.slides.o000oOoO;

/* JADX INFO: loaded from: classes5.dex */
final class zzRM {
    private static double[] zzY(double[] dArr) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i < 2) {
                int i2 = i + 1;
                double d = dArr[i2];
                if ((d >= 0.0d && dArr[i] > d) || (dArr[i] < 0.0d && d >= 0.0d)) {
                    double d2 = dArr[i];
                    dArr[i] = d;
                    dArr[i2] = d2;
                    z = true;
                }
                i = i2;
            }
        } while (z);
        return dArr;
    }

    public static zz0Q zzZ(long j, long j2, long j3, long j4, long j5, long j6) {
        zz0Q zz0q = new zz0Q(3);
        double dZzYC = zzZPY.zzYC(j6) - zzZPY.zzYC(j5);
        long j7 = j5;
        int i = (int) j7;
        double dIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat((int) j6);
        double d = -dIntBitsToFloat;
        double dZzYC2 = (((double) zzZPY.zzYC(j7)) * d) + (((double) Float.intBitsToFloat(i)) * (-dZzYC));
        int i2 = 3;
        double[] dArrZzZ = zzZ(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2), Float.intBitsToFloat((int) j3), Float.intBitsToFloat((int) j4));
        double[] dArrZzZ2 = zzZ(zzZPY.zzYC(j), zzZPY.zzYC(j2), zzZPY.zzYC(j3), zzZPY.zzYC(j4));
        char c = 0;
        char c2 = 1;
        char c3 = 2;
        double d2 = dIntBitsToFloat;
        double[] dArrZzZ3 = zzZ(new double[]{(dArrZzZ2[0] * dIntBitsToFloat) + (dArrZzZ[0] * dZzYC), (dArrZzZ2[1] * dIntBitsToFloat) + (dArrZzZ[1] * dZzYC), (dArrZzZ2[2] * dIntBitsToFloat) + (dArrZzZ[2] * dZzYC), o000oOoO.OooO00o(dIntBitsToFloat, dArrZzZ2[3], dArrZzZ[3] * dZzYC, dZzYC2)});
        int i3 = 0;
        while (i3 < i2) {
            double d3 = dArrZzZ3[i3];
            double d4 = d3 * d3;
            double d5 = d4 * d3;
            i2 = 3;
            char c4 = c;
            char c5 = c2;
            double d6 = (dArrZzZ[c3] * d3) + (dArrZzZ[c2] * d4) + (dArrZzZ[c] * d5) + dArrZzZ[3];
            double d7 = d2;
            double d8 = (dArrZzZ2[c3] * d3) + (dArrZzZ2[c5] * d4) + (dArrZzZ2[c4] * d5) + dArrZzZ2[3];
            double dZzYC3 = d7 == 0.0d ? (d8 - ((double) zzZPY.zzYC(j7))) / dZzYC : (d6 - ((double) Float.intBitsToFloat(i))) / d;
            if (d3 >= 0.0d && d3 <= 1.0d && dZzYC3 >= 0.0d && dZzYC3 <= 1.0d) {
                zz0q.add(zzZPY.zzG((float) d6, (float) d8));
            }
            i3++;
            c = c4;
            c2 = c5;
            d2 = d7;
            j7 = j5;
            c3 = 2;
        }
        return zz0q;
    }

    private static double zzg(double d) {
        return d < 0.0d ? -1.0d : 1.0d;
    }

    private static double[] zzZ(double d, double d2, double d3, double d4) {
        double d5 = d2 * 3.0d;
        return new double[]{o000oOoO.OooO00o(d3, -3.0d, (-d) + d5, d4), (3.0d * d3) + ((d * 3.0d) - (6.0d * d2)), (d * (-3.0d)) + d5, d};
    }

    private static double[] zzZ(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1] / d;
        double d3 = dArr[2] / d;
        double d4 = d2 * d2;
        double d5 = ((d3 * 3.0d) - d4) / 9.0d;
        double d6 = ((((9.0d * d2) * d3) - ((dArr[3] / d) * 27.0d)) - ((d4 * d2) * 2.0d)) / 54.0d;
        double d7 = d5 * d5 * d5;
        double d8 = (d6 * d6) + d7;
        double[] dArr2 = new double[3];
        double d9 = d2 / 3.0d;
        if (d8 >= 0.0d) {
            double dSqrt = Math.sqrt(d8);
            double d10 = d6 + dSqrt;
            double d11 = d6 - dSqrt;
            double dPow = Math.pow(Math.abs(d10), 0.0d) * zzg(d10);
            double dPow2 = Math.pow(Math.abs(d11), 0.0d) * zzg(d11);
            double d12 = dPow + dPow2;
            double d13 = -d9;
            dArr2[0] = d13 + d12;
            double d14 = d13 - (d12 / 2.0d);
            dArr2[1] = d14;
            dArr2[2] = d14;
            if (Math.abs(((dPow - dPow2) * Math.sqrt(3.0d)) / 2.0d) != 0.0d) {
                dArr2[1] = -1.0d;
                dArr2[2] = -1.0d;
            }
        } else {
            double dAcos = Math.acos(d6 / Math.sqrt(-d7));
            double dSqrt2 = Math.sqrt(-d5) * 2.0d;
            dArr2[0] = (Math.cos(dAcos / 3.0d) * dSqrt2) - d9;
            dArr2[1] = (Math.cos((6.283185307179586d + dAcos) / 3.0d) * dSqrt2) - d9;
            dArr2[2] = (Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dSqrt2) - d9;
        }
        for (int i = 0; i < 3; i++) {
            double d15 = dArr2[i];
            if (d15 < 0.0d || d15 > 1.0d) {
                dArr2[i] = -1.0d;
            }
        }
        return zzY(dArr2);
    }
}
