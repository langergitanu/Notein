package com.aspose.words.internal;

import OooO0O0.C20395OooO0o0;
import OooOoO.C20509OooO0oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJ6 {
    public static boolean zzA(zzZQ4 zzzq4) {
        return zzAN.zzf(zzzq4.getWidth()) && zzAN.zzf(zzzq4.getHeight());
    }

    public static long zzB(zzZQ4 zzzq4) {
        return zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX()), (zzzq4.getHeight() / 2.0f) + zzzq4.getY());
    }

    public static float zzL(long j, long j2) {
        return (float) Math.sqrt(Math.pow(zzZPY.zzYC(j2) - zzZPY.zzYC(j), 2.0d) + Math.pow(Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j), 2.0d));
    }

    public static long zzM(long j, long j2) {
        return zzZPY.zzG(Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j), zzZPW.zzYz(j2) + zzZPY.zzYC(j));
    }

    public static boolean zzN(long j, long j2) {
        return zzO(j, j2) < 0.001f;
    }

    public static double zzO(long j, long j2, long j3, long j4) {
        long jZzZ = zzZ(j, j2, j3, j4, 0.0f);
        double dSqrt = 0.0d;
        float f = 0.1f;
        while (f <= 1.0f) {
            long jZzZ2 = zzZ(j, j2, j3, j4, f);
            dSqrt += Math.sqrt(Math.pow(zzZPY.zzYC(jZzZ) - zzZPY.zzYC(jZzZ2), 2.0d) + Math.pow(Float.intBitsToFloat((int) jZzZ) - Float.intBitsToFloat((int) jZzZ2), 2.0d));
            f += 0.1f;
            jZzZ = jZzZ2;
        }
        return dSqrt;
    }

    public static long zzP(long j, long j2, long j3, long j4) {
        float fZzYC = zzZPY.zzYC(j2) - zzZPY.zzYC(j);
        int i = (int) j;
        float fIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat((int) j2);
        float fZzYC2 = (zzZPY.zzYC(j) * fIntBitsToFloat) + (Float.intBitsToFloat(i) * fZzYC);
        float fZzYC3 = zzZPY.zzYC(j4) - zzZPY.zzYC(j3);
        int i2 = (int) j3;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - Float.intBitsToFloat((int) j4);
        float fZzYC4 = (zzZPY.zzYC(j3) * fIntBitsToFloat2) + (Float.intBitsToFloat(i2) * fZzYC3);
        float f = (fZzYC * fIntBitsToFloat2) - (fZzYC3 * fIntBitsToFloat);
        return zzAN.zzf(f) ? j2 : zzZPY.zzG(C20509OooO0oo.OooO0O0(fIntBitsToFloat, fZzYC4, fIntBitsToFloat2 * fZzYC2, f), ((fZzYC * fZzYC4) - (fZzYC3 * fZzYC2)) / f);
    }

    public static boolean zzT(zz0Q zz0q) {
        return zzX(zz0q, (long[]) null);
    }

    public static zzZQ4 zzU(zz0Q zz0q) {
        return zzY(zz0q, (long[]) null);
    }

    public static long zzV(long[] jArr) {
        return zzZ((zz0Q) null, jArr);
    }

    public static boolean zzW(long j, long j2, float f) {
        return zzO(j, j2) < f;
    }

    public static long[] zzX(zzZQ4 zzzq4, float f) {
        zzP9 zzp9 = new zzP9();
        zzp9.zzZ(f, zzB(zzzq4), 0);
        long[] jArrZzz = zzz(zzzq4);
        zzp9.zzZ(jArrZzz);
        return jArrZzz;
    }

    public static boolean zzY(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        return zzZ(zzzq4, zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZo())) && zzZ(zzzq4, zzZPY.zzG(zzzq42.zzkw(), zzzq42.zzZn()));
    }

    private static long zzZ(zz0Q zz0q, long[] jArr) {
        int count = zz0q != null ? zz0q.getCount() : jArr.length;
        float fIntBitsToFloat = 0.0f;
        float fZzYC = 0.0f;
        for (int i = 0; i < count; i++) {
            long j = zz0q != null ? zz0q.get(i) : jArr[i];
            fIntBitsToFloat += Float.intBitsToFloat((int) j);
            fZzYC += zzZPY.zzYC(j);
        }
        float f = count;
        return zzZPY.zzG(fIntBitsToFloat / f, fZzYC / f);
    }

    public static long[] zzz(zzZQ4 zzzq4) {
        return new long[]{zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()), zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn())};
    }

    public static long zzN(long j, long j2, long j3, long j4) {
        if (zzW(j, j2, j3) == zzW(j, j2, j4) || zzW(j3, j4, j) == zzW(j3, j4, j2)) {
            return 0L;
        }
        return zzOY.zzP(j, j2, j3, j4);
    }

    public static boolean zzT(long[] jArr) {
        return zzX((zz0Q) null, jArr);
    }

    public static zzZQ4 zzU(long[] jArr) {
        return zzY((zz0Q) null, jArr);
    }

    public static long zzV(long j, long j2, float f) {
        float fZzYC = zzZPY.zzYC(j2) - zzZPY.zzYC(j);
        int i = (int) j2;
        int i2 = (int) j;
        float fIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat(i2);
        float f2 = fZzYC / fIntBitsToFloat;
        if (fIntBitsToFloat == 0.0f) {
            return zzZPY.zzG(Float.intBitsToFloat(i2), (f * zzZKQ.zzZN(fZzYC)) + zzZPY.zzYC(j));
        }
        float fSqrt = f / ((float) Math.sqrt((f2 * f2) + 1.0f));
        if (Float.intBitsToFloat(i2) > Float.intBitsToFloat(i)) {
            fSqrt = -fSqrt;
        }
        return C22243OooO0Oo.OooO00o(f2 * fSqrt, Float.intBitsToFloat(i2) + fSqrt, j);
    }

    private static int zzW(long j, long j2, long j3) {
        int i = (int) j;
        double dZzYC = ((zzZPY.zzYC(j3) - zzZPY.zzYC(j)) * (Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i))) - ((Float.intBitsToFloat((int) j3) - Float.intBitsToFloat(i)) * (zzZPY.zzYC(j2) - zzZPY.zzYC(j)));
        if (dZzYC < 0.0d) {
            return -1;
        }
        return dZzYC > 0.0d ? 1 : 0;
    }

    public static boolean zzT(float[] fArr) {
        return (fArr == null || fArr.length == 0 || (fArr.length == 2 && fArr[0] == 0.0f && fArr[1] == 1.0f)) ? false : true;
    }

    public static zzZQ4 zzY(zzZQ4 zzzq4, float f) {
        return zzY((zz0Q) null, zzX(zzzq4, f));
    }

    public static long zzX(long j, long j2, float f) {
        zzP9 zzp9 = new zzP9();
        zzp9.zzZ(f, j2, 0);
        return zzp9.zzR(j);
    }

    private static zzZQ4 zzY(zz0Q zz0q, long[] jArr) {
        if (zz0q == null && jArr == null) {
            return zzZQ4.zz2T;
        }
        int count = zz0q != null ? zz0q.getCount() : jArr.length;
        if (count == 0) {
            return zzZQ4.zz2T;
        }
        long j = zz0q != null ? zz0q.get(0) : jArr[0];
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYC = zzZPY.zzYC(j);
        float fIntBitsToFloat2 = fIntBitsToFloat;
        float fIntBitsToFloat3 = fIntBitsToFloat2;
        float fZzYC2 = fZzYC;
        for (int i = 1; i < count; i++) {
            long j2 = zz0q != null ? zz0q.get(i) : jArr[i];
            int i2 = (int) j2;
            if (Float.intBitsToFloat(i2) > fIntBitsToFloat3) {
                fIntBitsToFloat3 = Float.intBitsToFloat(i2);
            } else if (Float.intBitsToFloat(i2) < fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            }
            if (zzZPY.zzYC(j2) > fZzYC2) {
                fZzYC2 = zzZPY.zzYC(j2);
            } else if (zzZPY.zzYC(j2) < fZzYC) {
                fZzYC = zzZPY.zzYC(j2);
            }
        }
        return new zzZQ4(fIntBitsToFloat2, fZzYC, fIntBitsToFloat3 - fIntBitsToFloat2, fZzYC2 - fZzYC);
    }

    public static zzZQ4 zzZ(zzZQ4 zzzq4, zzP9 zzp9) {
        long[] jArrZzz = zzz(zzzq4);
        zzp9.zzZ(jArrZzz);
        return zzY((zz0Q) null, jArrZzz);
    }

    public static float zzO(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2);
        float fZzYC = zzZPY.zzYC(j) - zzZPY.zzYC(j2);
        return (float) Math.sqrt((fZzYC * fZzYC) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    private static boolean zzX(zz0Q zz0q, long[] jArr) {
        long jZzZ = zzZ(zz0q, jArr);
        int count = zz0q != null ? zz0q.getCount() : jArr.length;
        if (count == 2) {
            return Float.intBitsToFloat((int) (zz0q != null ? zz0q.get(1) : jArr[1])) - Float.intBitsToFloat((int) (zz0q != null ? zz0q.get(0) : jArr[0])) > 0.0f;
        }
        int i = 0;
        float fZzYC = 0.0f;
        while (i < count) {
            int i2 = i == count + (-1) ? 0 : i + 1;
            long j = zz0q != null ? zz0q.get(i) : jArr[i];
            long j2 = zz0q != null ? zz0q.get(i2) : jArr[i2];
            int i3 = (int) jZzZ;
            fZzYC = (((zzZPY.zzYC(j2) - zzZPY.zzYC(jZzZ)) * (Float.intBitsToFloat((int) j) - Float.intBitsToFloat(i3))) - ((zzZPY.zzYC(j) - zzZPY.zzYC(jZzZ)) * (Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i3)))) + fZzYC;
            i++;
        }
        return fZzYC > 0.0f;
    }

    public static long zzZ(float f, float f2, zzZQ4 zzzq4) {
        return zzZPY.zzG(zzzq4.getX() + (zzzq4.getWidth() * f), zzzq4.getY() + (zzzq4.getHeight() * f2));
    }

    public static boolean zzZ(zzQ9[] zzq9Arr) {
        long[] jArr = new long[zzq9Arr.length];
        for (int i = 0; i < zzq9Arr.length; i++) {
            zzQ9 zzq9 = zzq9Arr[i];
            jArr[i] = zzZPY.zzG((float) zzq9.zzQb(), (float) zzq9.zzYm());
        }
        return zzX((zz0Q) null, jArr);
    }

    public static float zzZ(zzQ9 zzq9, zzQ9 zzq92) {
        double dZzQb = zzq9.zzQb() - zzq92.zzQb();
        double dZzYm = zzq9.zzYm() - zzq92.zzYm();
        double dZzQa = zzq9.zzQa() - zzq92.zzQa();
        return (float) Math.sqrt((dZzQa * dZzQa) + (dZzYm * dZzYm) + (dZzQb * dZzQb));
    }

    public static boolean zzZ(long j, zz0Q zz0q, long[] jArr) {
        int count = zz0q != null ? zz0q.getCount() : jArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            i3++;
            if (i3 == count) {
                i3 = 0;
            }
            long j2 = zz0q != null ? zz0q.get(i) : jArr[i];
            long j3 = zz0q != null ? zz0q.get(i3) : jArr[i3];
            int i4 = (int) j2;
            boolean z = ((double) (((Float.intBitsToFloat((int) j3) - Float.intBitsToFloat(i4)) * (zzZPY.zzYC(j) - zzZPY.zzYC(j2))) - ((Float.intBitsToFloat((int) j) - Float.intBitsToFloat(i4)) * (zzZPY.zzYC(j3) - zzZPY.zzYC(j2))))) > 0.0d;
            if ((z && zzZPY.zzYC(j2) < zzZPY.zzYC(j) && zzAN.zzQ(zzZPY.zzYC(j), zzZPY.zzYC(j3))) || (!z && zzZPY.zzYC(j3) < zzZPY.zzYC(j) && zzAN.zzQ(zzZPY.zzYC(j), zzZPY.zzYC(j2)))) {
                i2++;
            }
            i++;
        }
        return i2 % 2 != 0;
    }

    public static double zzY(long j, long j2, long j3, long j4, float f) {
        double d = 1.0f - f;
        double dPow = Math.pow(d, 2.0d);
        double dPow2 = Math.pow(f, 2.0d);
        int i = (int) j;
        int i2 = (int) j2;
        float f2 = f * 3.0f;
        float f3 = 1.0f - f2;
        double d2 = f3;
        int i3 = (int) j3;
        float f4 = 2.0f - f2;
        int i4 = (int) j4;
        double dIntBitsToFloat = (((double) (Float.intBitsToFloat(i4) * 3.0f)) * dPow2) + (((double) (Float.intBitsToFloat(i2) * 3.0f)) * d * d2) + (((double) (Float.intBitsToFloat(i) * (-3.0f))) * dPow) + ((double) (Float.intBitsToFloat(i3) * 3.0f * f * f4));
        double dZzYC = (((double) (zzZPY.zzYC(j4) * 3.0f)) * dPow2) + C20395OooO0o0.OooO00o(zzZPY.zzYC(j2) * 3.0f, d, d2, ((double) (zzZPY.zzYC(j) * (-3.0f))) * dPow) + ((double) (zzZPY.zzYC(j3) * 3.0f * f * f4));
        return Math.abs(((dIntBitsToFloat * ((((((double) (zzZPY.zzYC(j) * 6.0f)) * d) - ((double) ((zzZPY.zzYC(j2) * 6.0f) * f4))) + ((double) ((zzZPY.zzYC(j3) * 6.0f) * f3))) + ((double) ((zzZPY.zzYC(j4) * 6.0f) * f)))) - (((((((double) (Float.intBitsToFloat(i) * 6.0f)) * d) - ((double) ((Float.intBitsToFloat(i2) * 6.0f) * f4))) + ((double) ((Float.intBitsToFloat(i3) * 6.0f) * f3))) + ((double) ((Float.intBitsToFloat(i4) * 6.0f) * f))) * dZzYC)) / Math.pow(Math.pow(dIntBitsToFloat, 2.0d) + Math.pow(dZzYC, 2.0d), 1.5d));
    }

    public static boolean zzZ(zzQ9 zzq9, zzQD zzqd) {
        long[] jArr = new long[zzqd.getCount()];
        for (int i = 0; i < zzqd.getCount(); i++) {
            zzQ9 zzq9ZzYi = zzqd.zzYi(i);
            jArr[i] = zzZPY.zzG((float) zzq9ZzYi.zzQb(), (float) zzq9ZzYi.zzYm());
        }
        return zzZ(zzZPY.zzG((float) zzq9.zzQb(), (float) zzq9.zzYm()), (zz0Q) null, jArr);
    }

    public static long zzZ(long j, long j2, long j3, long j4, float f) {
        double d = 1.0f - f;
        double dPow = Math.pow(d, 2.0d);
        double dPow2 = Math.pow(d, 3.0d);
        double d2 = f;
        double dPow3 = Math.pow(d2, 2.0d);
        double dPow4 = Math.pow(d2, 3.0d);
        double d3 = ((double) (f * 3.0f)) * dPow;
        double d4 = dPow3 * 3.0d * d;
        return zzZPY.zzG((float) ((((double) Float.intBitsToFloat((int) j4)) * dPow4) + (((double) Float.intBitsToFloat((int) j3)) * d4) + (((double) Float.intBitsToFloat((int) j2)) * d3) + (((double) Float.intBitsToFloat((int) j)) * dPow2)), (float) ((dPow4 * ((double) zzZPY.zzYC(j4))) + (d4 * ((double) zzZPY.zzYC(j3))) + (((double) zzZPY.zzYC(j2)) * d3) + (((double) zzZPY.zzYC(j)) * dPow2)));
    }

    private static double zzY(int i, int i2, double d) {
        int i3 = i2 - i;
        return Math.pow(1.0d - d, i3) * Math.pow(d, i) * ((double) (zzAN.zzV8(i2) / (zzAN.zzV8(i3) * zzAN.zzV8(i))));
    }

    public static long[] zzY(long j, long j2, long j3, float f) {
        long jZzP;
        long jZzP2;
        long[] jArrZzY = zzOY.zzY(j, j2, f);
        long[] jArrZzY2 = zzOY.zzY(j2, j3, f);
        float f2 = -f;
        long[] jArrZzY3 = zzOY.zzY(j, j2, f2);
        long[] jArrZzY4 = zzOY.zzY(j2, j3, f2);
        if (zzZPY.zzD(j, j2)) {
            jZzP = jArrZzY2[0];
            jZzP2 = jArrZzY4[0];
        } else if (zzZPY.zzD(j2, j3)) {
            jZzP = jArrZzY[1];
            jZzP2 = jArrZzY3[1];
        } else {
            jZzP = zzP(jArrZzY[0], jArrZzY[1], jArrZzY2[0], jArrZzY2[1]);
            jZzP2 = zzP(jArrZzY3[0], jArrZzY3[1], jArrZzY4[0], jArrZzY4[1]);
        }
        return new long[]{jZzP, jZzP2};
    }

    public static zzQ9 zzZ(zzQ9[] zzq9Arr, float f) {
        zzQ9 zzq9 = new zzQ9();
        for (int i = 0; i < zzq9Arr.length; i++) {
            double dZzY = zzY(i, zzq9Arr.length - 1, f);
            zzq9.zzW((zzq9Arr[i].zzQb() * dZzY) + zzq9.zzQb());
            zzq9.zzV((zzq9Arr[i].zzYm() * dZzY) + zzq9.zzYm());
            zzq9.zz9((zzq9Arr[i].zzQa() * dZzY) + zzq9.zzQa());
        }
        return zzq9;
    }

    public static long zzZ(long j, float f, long j2) {
        float fZzO = zzO(j, j2);
        if (fZzO <= f) {
            return j2;
        }
        float f2 = f / (fZzO + 1.0f);
        int i = (int) j;
        return C22243OooO0Oo.OooO00o((zzZPY.zzYC(j2) - zzZPY.zzYC(j)) * f2, Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i)) * f2), j);
    }

    public static zz0Q zzY(long j, long j2, long j3, long j4, long j5, long j6) {
        return zzRM.zzZ(j, j2, j3, j4, j5, j6);
    }

    public static boolean zzZ(zzZQ4 zzzq4, long j) {
        int i = (int) j;
        return zzAN.zzP(Float.intBitsToFloat(i), zzzq4.getX()) && zzAN.zzR(Float.intBitsToFloat(i), zzzq4.zzkw()) && zzAN.zzP(zzZPY.zzYC(j), zzzq4.getY()) && zzAN.zzR(zzZPY.zzYC(j), zzzq4.zzZn());
    }

    public static boolean zzZ(long j, long j2, boolean z, double d) {
        return z ? ((double) Math.abs(Float.intBitsToFloat((int) j) - zzZPW.zzYz(j2))) <= d && ((double) Math.abs(zzZPW.zzYz(j) - Float.intBitsToFloat((int) j2))) <= d : ((double) Math.abs(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2))) <= d && ((double) Math.abs(zzZPW.zzYz(j) - zzZPW.zzYz(j2))) <= d;
    }
}
