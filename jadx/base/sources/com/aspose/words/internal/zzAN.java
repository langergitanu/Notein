package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzAN {
    private static int[] zzs6 = {3, 7, 11, 17, 23, 29, 37, 47, 59, 71, 89, 107, 131, 163, 197, 239, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2, StyleIdentifier.LIST_TABLE_4_ACCENT_4, 431, 521, 631, 761, 919, EditingLanguage.SANSKRIT, 1327, 1597, 1931, 2333, 2801, 3371, 4049, 4861, 5839, 7013, 8419, 10103, 12143, 14591, 17519, 21023, 25229, 30293, 36353, 43627, 52361, 62851, 75431, 90523, 108631, 130363, 156437, 187751, 225307, 270371, 324449, 389357, 467237, 560689, 672827, 807403, 968897, 1162687, 1395263, 1674319, 2009191, 2411033, 2893249, 3471899, 4166287, 4999559, 5999471, 7199369};

    public static boolean zzH(long j, long j2) {
        return zzY(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2), 1.0E-10f) && zzY(zzZPY.zzYC(j), zzZPY.zzYC(j2), 1.0E-10f);
    }

    public static boolean zzJ(double d, double d2) {
        return d > d2 || zzL(d, d2);
    }

    public static int zzK(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static boolean zzL(double d, double d2) {
        return zzQ(d, d2, 1.0E-10d);
    }

    public static int zzN(long j, int i) {
        return zzO(j, i) * i;
    }

    public static boolean zzO(double d, double d2, double d3) {
        return d > d2 || zzQ(d, d2, d3);
    }

    public static boolean zzP(double d, double d2, double d3) {
        return d < d2 || zzQ(d, d2, d3);
    }

    public static boolean zzQ(double d, double d2, double d3) {
        return Math.abs(d - d2) < Math.abs(d3);
    }

    public static double zzR(double d, double d2, double d3) {
        return Math.min(Math.max(d, d2), d3);
    }

    public static boolean zzS(float f, float f2) {
        return zzY(f, f2, 1.0E-10f);
    }

    public static zzZQ5 zzV(zzZQ5 zzzq5) {
        if (zzzq5.getWidth() < 0) {
            zzzq5 = new zzZQ5(zzzq5.getWidth() + zzzq5.getX(), zzzq5.getY(), -zzzq5.getWidth(), zzzq5.getHeight());
        }
        if (zzzq5.getHeight() >= 0) {
            return zzzq5;
        }
        return new zzZQ5(zzzq5.getX(), zzzq5.getHeight() + zzzq5.getY(), zzzq5.getWidth(), -zzzq5.getHeight());
    }

    public static int zzV8(int i) {
        int i2 = 1;
        while (i > 1) {
            i2 *= i;
            i--;
        }
        return i2;
    }

    public static int zzV9(int i) {
        zzZ4.zzY(i, "min");
        int i2 = 0;
        while (true) {
            int[] iArr = zzs6;
            if (i2 >= iArr.length) {
                for (int i3 = i | 1; i3 < Integer.MAX_VALUE; i3 += 2) {
                    if (zzVa(i3)) {
                        return i3;
                    }
                }
                return i;
            }
            int i4 = iArr[i2];
            if (i4 >= i) {
                return i4;
            }
            i2++;
        }
    }

    private static boolean zzVa(int i) {
        if ((i & 1) == 0) {
            return i == 2;
        }
        int iSqrt = (int) Math.sqrt(i);
        for (int i2 = 3; i2 <= iSqrt; i2 += 2) {
            if (i % i2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzVb(int i) {
        return i == 0;
    }

    public static int zzVc(int i) {
        int i2 = i % 65536;
        return i2 > 32767 ? -(65536 - i2) : i2;
    }

    public static int zzW(int... iArr) {
        int iMax = iArr[0];
        for (int i = 1; i < 5; i++) {
            iMax = Math.max(iMax, iArr[i]);
        }
        return iMax;
    }

    public static boolean zzX(double... dArr) {
        for (double d : dArr) {
            if (!zzZD(d)) {
                return false;
            }
        }
        return true;
    }

    public static double[] zzY(double[] dArr, double[] dArr2) {
        int length = dArr2.length;
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            int i2 = i / length;
            dArr3[i2] = (dArr[i] * dArr2[i % length]) + dArr3[i2];
        }
        return dArr3;
    }

    public static float zzZ(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int zzZA(double d) {
        double d2 = d - ((double) ((int) d));
        if (zzZD(d2)) {
            return 0;
        }
        int iZzZG = zzZG(zzZKQ.zzZa(Math.log10(d2)));
        double dPow = Math.pow(10.0d, -iZzZG) * d2;
        return iZzZG - BigDecimal.valueOf(dPow - ((double) ((int) dPow))).scale();
    }

    public static int zzZB(double d) {
        return (int) d;
    }

    public static boolean zzZC(double d) {
        return zzL(d, -1.7976931348623157E308d);
    }

    public static boolean zzZD(double d) {
        return Math.abs(d) < Double.MIN_VALUE;
    }

    public static int zzZE(double d) {
        return (int) d;
    }

    public static short zzZF(double d) {
        return (short) zzZKQ.zzZa(d);
    }

    public static int zzZG(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == Double.MAX_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) zzZKQ.zzZa(d);
    }

    public static boolean zzZH(double d) {
        return zzZD(zzZJ(d));
    }

    public static double zzZI(double d) {
        return zzZJ(d * 57.29577951308232d) * 0.017453292519943295d;
    }

    public static double zzZJ(double d) {
        if (Math.abs(d) >= 360.0d) {
            d %= 360.0d;
        }
        return d < 0.0d ? d + 360.0d : d;
    }

    public static double zzZK(double d) {
        return d * 57.29577951308232d;
    }

    public static double zzZL(double d) {
        return d * 0.017453292519943295d;
    }

    public static double zzZM(double d) {
        return d * d;
    }

    public static boolean zzZP(long j) {
        return (j & 1) != 0;
    }

    public static int zzZX(int i, int i2) {
        return zzJ(1, i, i2);
    }

    public static double zzZz(double d) {
        return Math.pow(10.0d, Math.min(-10, zzZA(d)));
    }

    public static boolean zzf(float f) {
        return Math.abs(f) < Float.MIN_VALUE;
    }

    public static float zzg(float f) {
        return f * f;
    }

    public static zzZQ4 zzv(zzZQ4 zzzq4) {
        if (zzzq4.getWidth() < 0.0f) {
            zzzq4 = new zzZQ4(zzzq4.getWidth() + zzzq4.getX(), zzzq4.getY(), -zzzq4.getWidth(), zzzq4.getHeight());
        }
        if (zzzq4.getHeight() >= 0.0f) {
            return zzzq4;
        }
        return new zzZQ4(zzzq4.getX(), zzzq4.getHeight() + zzzq4.getY(), zzzq4.getWidth(), -zzzq4.getHeight());
    }

    public static int zzJ(int i, int i2, int i3) {
        long j = ((long) i) * ((long) i2);
        long j2 = i3;
        int i4 = (int) (j / j2);
        int i5 = (int) (j % j2);
        return (i5 < (i3 % 2) + (i3 / 2) || i5 == 0) ? i4 : i4 + 1;
    }

    public static boolean zzK(double d, double d2) {
        return d < d2 || zzL(d, d2);
    }

    public static int zzO(long j, int i) {
        long j2 = i;
        long j3 = j / j2;
        if (j % j2 != 0) {
            j3++;
        }
        return (int) j3;
    }

    public static boolean zzP(float f, float f2) {
        return f > f2 || zzY(f, f2, 1.0E-10f);
    }

    public static boolean zzQ(float f, float f2) {
        return f < f2 || zzY(f, f2, 1.0E-15f);
    }

    public static float zzR(float... fArr) {
        float fMin = Float.MAX_VALUE;
        for (float f : fArr) {
            fMin = Math.min(fMin, f);
        }
        return fMin;
    }

    public static float zzQ(float... fArr) {
        float fMax = -3.4028235E38f;
        for (float f : fArr) {
            fMax = Math.max(fMax, f);
        }
        return fMax;
    }

    public static boolean zzX(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        return zzY(zzzq4.getX(), zzzq42.getX(), 1.0E-10f) && zzY(zzzq4.getY(), zzzq42.getY(), 1.0E-10f) && zzY(zzzq4.getWidth(), zzzq42.getWidth(), 1.0E-10f) && zzY(zzzq4.getHeight(), zzzq42.getHeight(), 1.0E-10f);
    }

    public static boolean zzR(float f, float f2) {
        return f < f2 || zzY(f, f2, 1.0E-10f);
    }

    public static boolean zzY(float f, float f2, float f3) {
        return Math.abs(f - f2) < Math.abs(f3);
    }

    public static int zzX(int i, long[] jArr) {
        if (i < ((int) jArr[0])) {
            return 0;
        }
        int length = jArr.length;
        int i2 = 1;
        while (i2 < length) {
            int i3 = (int) jArr[i2 - 1];
            long j = jArr[i2];
            if (i3 >= ((int) j)) {
                throw new IllegalArgumentException("The array of points is given incorrectly.");
            }
            if (i < ((int) j)) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2--;
        }
        long j2 = jArr[i2 - 1];
        int i4 = (int) j2;
        long j3 = jArr[i2];
        int i5 = (int) (j2 >> 32);
        return (((((int) (j3 >> 32)) - i5) * (i - i4)) / (((int) j3) - i4)) + i5;
    }
}
