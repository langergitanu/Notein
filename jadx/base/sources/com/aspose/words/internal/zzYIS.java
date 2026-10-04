package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYIS {

    /* JADX INFO: renamed from: bP */
    private static final long[] f50966bP = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static long[] zzD(BigInteger bigInteger) {
        long[] jArrZzA = zzYHS.zzA(bigInteger);
        zzQ(jArrZzA, 0);
        return jArrZzA;
    }

    private static void zzQ(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    private static void zzR(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            zzYI4.zzZ(jArr[i], jArr2, i << 1);
        }
    }

    public static void zzS(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        zzQ(jArr, jArr2, jArr4);
        zzV(jArr4, jArr3);
    }

    public static void zzT(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    private static void zzU(long[] jArr, long[] jArr2, long[] jArr3) {
        zzQ(jArr, zze(jArr2), jArr3);
    }

    public static void zzV(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void zzW(long[] jArr, long[] jArr2) {
        if (zzYHS.zzb(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        zzT(jArr, jArr5);
        zzT(jArr5, jArr3);
        zzT(jArr3, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 2, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzW(jArr3, jArr5, jArr3);
        zzZ(jArr3, 5, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 5, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 15, jArr4);
        zzW(jArr3, jArr4, jArr5);
        zzZ(jArr5, 30, jArr3);
        zzZ(jArr3, 30, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 60, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 60, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 180, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 180, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzW(jArr3, jArr5, jArr2);
    }

    private static void zzX(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void zzY(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    private static void zzZ(long[] jArr, long[] jArr2, int i, long[] jArr3, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            jArr3[i2 + i3] = jArr[i3 + 9] ^ jArr2[i + i3];
        }
    }

    public static long[] zze(long[] jArr) {
        long[] jArr2 = new long[StyleIdentifier.GRID_TABLE_2_ACCENT_2];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i2 = 0;
        while (i > 0) {
            int i3 = i2 + 18;
            zzYI2.zzZ(jArr2, i3 >>> 1, 0L, jArr2, i3);
            zzQ(jArr2, i3);
            zzZ(jArr2, jArr2, i3, jArr2, i2 + 27);
            i--;
            i2 = i3;
        }
        zzYI2.zzZ(jArr2, 0L, jArr2);
        return jArr2;
    }

    public static int zzm(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }

    public static void zzR(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        zzQ(jArr, jArr2, jArr4);
        zzX(jArr3, jArr4, jArr3);
    }

    public static void zzT(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        zzR(jArr, jArr3);
        zzV(jArr3, jArr2);
    }

    public static void zzX(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    private static void zzZ(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void zzU(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jZzWY = zzYI4.zzWY(jArr[i]);
            i += 2;
            long jZzWY2 = zzYI4.zzWY(jArr[i3]);
            jArr3[i2] = (4294967295L & jZzWY) | (jZzWY2 << 32);
            jArr4[i2] = (jZzWY >>> 32) | ((-4294967296L) & jZzWY2);
        }
        long jZzWY3 = zzYI4.zzWY(jArr[8]);
        jArr3[4] = 4294967295L & jZzWY3;
        jArr4[4] = jZzWY3 >>> 32;
        zzW(jArr4, f50966bP, jArr2);
        zzY(jArr2, jArr3, jArr2);
    }

    public static void zzZ(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[18];
        zzR(jArr, jArr3);
        zzV(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zzR(jArr2, jArr3);
            zzV(jArr3, jArr2);
        }
    }

    private static void zzQ(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                zzZ(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            zzYI2.zzZ(16, jArr3, 0L);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                zzZ(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5);
            }
            if (i4 > 0) {
                zzYI2.zzZ(18, jArr3, 0L);
            }
        }
    }

    public static void zzS(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        zzR(jArr, jArr3);
        zzX(jArr2, jArr3, jArr2);
    }

    public static void zzV(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        zzU(jArr, jArr2, jArr4);
        zzX(jArr3, jArr4, jArr3);
    }

    public static void zzW(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        zzU(jArr, jArr2, jArr4);
        zzV(jArr4, jArr3);
    }
}
