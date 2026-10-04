package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEK {
    private static long[] zzD(long[] jArr) {
        int length = jArr.length;
        int i = length - 1;
        long[] jArr2 = new long[i];
        int i2 = 1;
        while (true) {
            int i3 = length - 2;
            if (i2 >= i3) {
                jArr2[0] = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr[1]) * 2.0f) + Float.intBitsToFloat((int) jArr[0]), (com.aspose.words.internal.zzZPY.zzYC(jArr[1]) * 2.0f) + com.aspose.words.internal.zzZPY.zzYC(jArr[0]));
                jArr2[i3] = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr[i]) + (Float.intBitsToFloat((int) jArr[i3]) * 8.0f)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(jArr[i]) + (com.aspose.words.internal.zzZPY.zzYC(jArr[i3]) * 8.0f)) / 2.0f);
                return jArr2;
            }
            int i4 = i2 + 1;
            jArr2[i2] = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr[i4]) * 2.0f) + (Float.intBitsToFloat((int) jArr[i2]) * 4.0f), (com.aspose.words.internal.zzZPY.zzYC(jArr[i4]) * 2.0f) + (com.aspose.words.internal.zzZPY.zzYC(jArr[i2]) * 4.0f));
            i2 = i4;
        }
    }

    private static long[] zzE(long[] jArr) {
        int length = jArr.length - 1;
        long[] jArr2 = new long[length];
        if (length == 1) {
            jArr2[0] = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr[1]) + (Float.intBitsToFloat((int) jArr[0]) * 2.0f)) / 3.0f, (com.aspose.words.internal.zzZPY.zzYC(jArr[1]) + (com.aspose.words.internal.zzZPY.zzYC(jArr[0]) * 2.0f)) / 3.0f);
            return jArr2;
        }
        long[] jArrZzD = zzD(jArr);
        float[] fArr = new float[jArrZzD.length];
        float[] fArr2 = new float[jArrZzD.length];
        for (int i = 0; i < jArrZzD.length; i++) {
            fArr[i] = Float.intBitsToFloat((int) jArrZzD[i]);
            fArr2[i] = com.aspose.words.internal.zzZPY.zzYC(jArrZzD[i]);
        }
        float[] fArrZzL = zzL(fArr);
        float[] fArrZzL2 = zzL(fArr2);
        for (int i2 = 0; i2 < length; i2++) {
            jArr2[i2] = com.aspose.words.internal.zzZPY.zzG(fArrZzL[i2], fArrZzL2[i2]);
        }
        return jArr2;
    }

    private static long[] zzF(long[] jArr) {
        long[] jArrZzE = zzE(jArr);
        return zzZ(jArr, jArrZzE, zzZ(jArr, jArrZzE));
    }

    private static long[] zzG(long[] jArr) {
        long[] jArr2 = new long[(jArr.length * 3) - 2];
        for (int i = 0; i < jArr.length; i++) {
            long jZzV = zzV(jArr, i);
            long j = jArr[i];
            long[] jArrZzS = zzS(jZzV, j, zzU(jArr, i));
            if (i == 0) {
                jArr2[i] = j;
                jArr2[i + 1] = jArrZzS[1];
            } else if (i == jArr.length - 1) {
                int i2 = i * 3;
                jArr2[i2 - 1] = jArrZzS[0];
                jArr2[i2] = j;
            } else {
                int i3 = i * 3;
                jArr2[i3 - 1] = jArrZzS[0];
                jArr2[i3] = j;
                jArr2[i3 + 1] = jArrZzS[1];
            }
        }
        return jArr2;
    }

    private static float[] zzL(float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        float[] fArr3 = new float[length];
        float f = 2.0f;
        fArr2[0] = fArr[0] / 2.0f;
        int i = 1;
        while (i < length) {
            float f2 = 1.0f / f;
            fArr3[i] = f2;
            f = (i < length + (-1) ? 4.0f : 3.5f) - f2;
            fArr2[i] = (fArr[i] - fArr2[i - 1]) / f;
            i++;
        }
        for (int i2 = 1; i2 < length; i2++) {
            int i3 = length - i2;
            int i4 = i3 - 1;
            fArr2[i4] = fArr2[i4] - (fArr3[i3] * fArr2[i3]);
        }
        return fArr2;
    }

    private static long[] zzS(long j, long j2, long j3) {
        int i = (int) j2;
        int i2 = (int) j;
        double dSqrt = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j), 2.0d) + Math.pow(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2), 2.0d));
        int i3 = (int) j3;
        double dSqrt2 = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(j3) - com.aspose.words.internal.zzZPY.zzYC(j2), 2.0d) + Math.pow(Float.intBitsToFloat(i3) - Float.intBitsToFloat(i), 2.0d));
        double d = (-0.35d) * dSqrt;
        double d2 = dSqrt + dSqrt2;
        double d3 = d / d2;
        double d4 = (dSqrt2 * 0.35d) / d2;
        return new long[]{com.aspose.words.internal.zzZPY.zzG(zzZ(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), d3), zzZ(com.aspose.words.internal.zzZPY.zzYC(j2), com.aspose.words.internal.zzZPY.zzYC(j), com.aspose.words.internal.zzZPY.zzYC(j3), d3)), com.aspose.words.internal.zzZPY.zzG(zzZ(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), d4), zzZ(com.aspose.words.internal.zzZPY.zzYC(j2), com.aspose.words.internal.zzZPY.zzYC(j), com.aspose.words.internal.zzZPY.zzYC(j3), d4))};
    }

    private static long zzU(long[] jArr, int i) {
        if (i < 0 || i >= jArr.length) {
            throw new IllegalArgumentException("Index is out of rage.\r\nParameter name: index");
        }
        if (i < jArr.length - 1) {
            return jArr[i + 1];
        }
        long j = jArr[i];
        long jZzV = zzV(jArr, i);
        int i2 = (int) j;
        return zzDG.zzY(jZzV, j, (Float.intBitsToFloat(i2) - Float.intBitsToFloat((int) jZzV)) + Float.intBitsToFloat(i2));
    }

    private static long zzV(long[] jArr, int i) {
        if (i < 0 || i >= jArr.length) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        if (i > 0) {
            return jArr[i - 1];
        }
        long j = jArr[i];
        long jZzU = zzU(jArr, i);
        int i2 = (int) j;
        return zzDG.zzY(j, jZzU, Float.intBitsToFloat(i2) - (Float.intBitsToFloat((int) jZzU) - Float.intBitsToFloat(i2)));
    }

    public static long[] zzX(long[] jArr, boolean z) {
        if (jArr != null) {
            return jArr.length < 2 ? jArr : z ? zzF(jArr) : zzG(jArr);
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: knots");
    }

    private static float zzZ(float f, float f2, float f3, double d) {
        float f4 = (float) ((d * ((double) (f3 - f2))) + ((double) f));
        return Float.isNaN(f4) ? f2 : f4;
    }

    private static long[] zzZ(long[] jArr, long[] jArr2) {
        long jZzG;
        int length = jArr2.length;
        long[] jArr3 = new long[length];
        if (length == 1) {
            jArr3[0] = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr2[0]) * 2.0f) - Float.intBitsToFloat((int) jArr[0]), (com.aspose.words.internal.zzZPY.zzYC(jArr2[0]) * 2.0f) - com.aspose.words.internal.zzZPY.zzYC(jArr[0]));
            return jArr3;
        }
        for (int i = 0; i < length; i++) {
            int i2 = length - 1;
            if (i < i2) {
                int i3 = i + 1;
                jZzG = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr[i3]) * 2.0f) - Float.intBitsToFloat((int) jArr2[i3]), (com.aspose.words.internal.zzZPY.zzYC(jArr[i3]) * 2.0f) - com.aspose.words.internal.zzZPY.zzYC(jArr2[i3]));
            } else {
                jZzG = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jArr2[i2]) + Float.intBitsToFloat((int) jArr[length])) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(jArr2[i2]) + com.aspose.words.internal.zzZPY.zzYC(jArr[length])) / 2.0f);
            }
            jArr3[i] = jZzG;
        }
        return jArr3;
    }

    private static long[] zzZ(long[] jArr, long[] jArr2, long[] jArr3) {
        int length = (jArr.length * 3) - 2;
        long[] jArr4 = new long[length];
        for (int i = 0; i < jArr.length; i++) {
            int i2 = i * 3;
            jArr4[i2] = jArr[i];
            int i3 = i2 + 1;
            if (i3 < length) {
                jArr4[i3] = jArr2[i];
                jArr4[i2 + 2] = jArr3[i];
            }
        }
        return jArr4;
    }
}
