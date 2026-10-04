package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz9K {
    public static zzP8 zzS(long[] jArr) {
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzO7(), zzP5.zzY(jArr));
        return zzp8;
    }

    public static zzP8 zzX(zzZQ4 zzzq4, long j, long j2) {
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzQ5 zzq5ZzZ = zzQ4.zzZ(zzzq4, j, j2, 1);
        zzp5.zzZ(zzq5ZzZ);
        zzOS zzos = new zzOS();
        zzos.zzNu().add(zzq5ZzZ.zzPX());
        zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
        return zzp8;
    }

    public static zzP8 zzY(long[] jArr, boolean z) {
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzO7(), zzP5.zzX(jArr, false, z));
        return zzp8;
    }

    public static zzP8 zzZ(long[][] jArr, boolean z) {
        zzP8 zzp8 = new zzP8();
        for (long[] jArr2 : jArr) {
            zzZQG.zzZ(zzp8.zzO7(), zzP5.zzX(jArr2, false, z));
        }
        return zzp8;
    }

    public static zzP8 zzs(zzZQ4 zzzq4) {
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzp5.zzZ(new zzQ5(zzzq4));
        return zzp8;
    }

    public static zzP8 zzY(zzZQ4 zzzq4, long j, long j2, int i) {
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzp5.zzZ(zzQ4.zzZ(zzzq4, j, j2, i));
        return zzp8;
    }

    public static zzP8 zzZ(zzZQ4 zzzq4, float f, float f2) {
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzp5.zzZ(new zzQ5(zzzq4, f, f2));
        return zzp8;
    }

    public static zzP8 zzY(zzZQ4 zzzq4, long j, long j2) {
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzQ5 zzq5ZzZ = zzQ4.zzZ(zzzq4, j, j2, 1);
        zzp5.zzZ(zzq5ZzZ);
        zzOS zzos = new zzOS();
        zzos.zzNu().add(zzq5ZzZ.zzPT());
        zzos.zzNu().add(zzq5ZzZ.zzPX());
        zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
        return zzp8;
    }

    public static zzP8 zzZ(long[] jArr, int i, int i2, float f) {
        long[] jArr2 = new long[(i2 * 3) + 1];
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            long[] jArrZzZ = zzZ(jArr, i4, f);
            jArr2[i3] = jArrZzZ[0];
            int i5 = i3 + 2;
            jArr2[i3 + 1] = jArrZzZ[1];
            i3 += 3;
            jArr2[i5] = jArrZzZ[2];
            jArr2[i3] = jArrZzZ[3];
        }
        return zzS(jArr2);
    }

    public static zzP8 zzZ(long[] jArr, float f) {
        int length = jArr.length;
        long[] jArr2 = new long[jArr.length + 3];
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        jArr2[0] = jArr[jArr.length - 1];
        jArr2[jArr.length + 1] = jArr2[1];
        jArr2[jArr.length + 2] = jArr2[2];
        return zzZ(jArr2, 1, length, f);
    }

    public static zzP8 zzY(zzZQ4 zzzq4, float f, float f2) {
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzQ5 zzq5 = new zzQ5(zzzq4, f, f2);
        zzp5.zzZ(zzq5);
        zzOS zzos = new zzOS();
        zzos.zzNu().add(zzq5.zzPT());
        zzos.zzNu().add(zzq5.zzPX());
        zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
        return zzp8;
    }

    private static long[] zzZ(long[] jArr, int i, float f) {
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i + 1;
        int i4 = i + 2;
        if (i4 > jArr.length - 1) {
            i4 = i3;
        }
        long j = jArr[i];
        long j2 = jArr[i3];
        long jZzG = zzZPY.zzG((Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) jArr[i2])) * f, (zzZPY.zzYC(jArr[i3]) - zzZPY.zzYC(jArr[i2])) * f);
        long jZzG2 = zzZPY.zzG((Float.intBitsToFloat((int) jArr[i4]) - Float.intBitsToFloat((int) jArr[i])) * f, (zzZPY.zzYC(jArr[i4]) - zzZPY.zzYC(jArr[i])) * f);
        return new long[]{j, zzZPY.zzG(((Float.intBitsToFloat((int) j) * 3.0f) + Float.intBitsToFloat((int) jZzG)) / 3.0f, ((zzZPY.zzYC(j) * 3.0f) + zzZPY.zzYC(jZzG)) / 3.0f), zzZPY.zzG(((Float.intBitsToFloat((int) j2) * 3.0f) - Float.intBitsToFloat((int) jZzG2)) / 3.0f, ((zzZPY.zzYC(j2) * 3.0f) - zzZPY.zzYC(jZzG2)) / 3.0f), j2};
    }

    public static zzP8 zzY(zzZQ4 zzzq4, long j) {
        int i = (int) j;
        if (!zzAN.zzf(Float.intBitsToFloat(i)) && !zzAN.zzf(zzZPW.zzYz(j))) {
            long jZzG = zzZPW.zzG(Math.min(Float.intBitsToFloat(i), zzzq4.getWidth()), Math.min(zzZPW.zzYz(j), zzzq4.getHeight()));
            zzP8 zzp8 = new zzP8();
            zzP5 zzp5 = new zzP5();
            zzZQG.zzZ(zzp8.zzO7(), zzp5);
            int i2 = (int) jZzG;
            long jZzG2 = zzZPW.zzG(Float.intBitsToFloat(i2) / 2.0f, zzZPW.zzYz(jZzG) / 2.0f);
            zzOS zzos = new zzOS();
            int i3 = (int) jZzG2;
            zzos.zzNu().add(zzZPY.zzG(Float.intBitsToFloat(i3) + zzzq4.zzZm(), zzzq4.zzZo()));
            zzos.zzNu().add(zzZPY.zzG(zzzq4.zzkw() - Float.intBitsToFloat(i3), zzzq4.zzZo()));
            zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
            zzp5.zzZ(zzQ4.zzZ(new zzZQ4(zzzq4.zzkw() - Float.intBitsToFloat(i2), zzzq4.zzZo(), Float.intBitsToFloat(i2), zzZPW.zzYz(jZzG)), zzZPY.zzG(zzzq4.zzkw() - Float.intBitsToFloat(i3), zzzq4.zzZo()), zzZPY.zzG(zzzq4.zzkw(), zzZPW.zzYz(jZzG2) + zzzq4.zzZo())));
            zzOS zzos2 = new zzOS();
            zzos2.zzNu().add(zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn() - zzZPW.zzYz(jZzG2)));
            zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos2);
            zzp5.zzZ(zzQ4.zzZ(new zzZQ4(zzzq4.zzkw() - Float.intBitsToFloat(i2), zzzq4.zzZn() - zzZPW.zzYz(jZzG), Float.intBitsToFloat(i2), zzZPW.zzYz(jZzG)), zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn() - zzZPW.zzYz(jZzG2)), zzZPY.zzG(zzzq4.zzkw() - Float.intBitsToFloat(i3), zzzq4.zzZn())));
            zzOS zzos3 = new zzOS();
            zzos3.zzNu().add(zzZPY.zzG(Float.intBitsToFloat(i3) + zzzq4.zzZm(), zzzq4.zzZn()));
            zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos3);
            zzp5.zzZ(zzQ4.zzZ(new zzZQ4(zzzq4.zzZm(), zzzq4.zzZn() - zzZPW.zzYz(jZzG), Float.intBitsToFloat(i2), zzZPW.zzYz(jZzG)), zzZPY.zzG(Float.intBitsToFloat(i3) + zzzq4.zzZm(), zzzq4.zzZn()), zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn() - zzZPW.zzYz(jZzG2))));
            zzOS zzos4 = new zzOS();
            zzos4.zzNu().add(zzZPY.zzG(zzzq4.zzZm(), zzZPW.zzYz(jZzG2) + zzzq4.zzZo()));
            zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos4);
            zzp5.zzZ(zzQ4.zzZ(new zzZQ4(zzzq4.zzZm(), zzzq4.zzZo(), Float.intBitsToFloat(i2), zzZPW.zzYz(jZzG)), zzZPY.zzG(zzzq4.zzZm(), zzZPW.zzYz(jZzG2) + zzzq4.zzZo()), zzZPY.zzG(Float.intBitsToFloat(i3) + zzzq4.zzZm(), zzzq4.zzZo())));
            return zzp8;
        }
        return zzP8.zzM(zzzq4);
    }
}
