package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYJ8 {
    public static long[] zzD(BigInteger bigInteger) {
        long[] jArrZzA = zzYHX.zzA(bigInteger);
        zzh(jArrZzA);
        return jArrZzA;
    }

    private static void zzQ(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    private static void zzR(long[] jArr, long[] jArr2) {
        zzYI4.zzZ(jArr[0], jArr2, 0);
        zzYI4.zzZ(jArr[1], jArr2, 2);
        zzYI4.zzZ(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = zzYI4.zzeE((int) j);
        jArr2[7] = ((long) zzYI4.zzeF((int) (j >>> 32))) & 4294967295L;
    }

    public static void zzS(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        zzR(jArr, jArr3);
        zzX(jArr2, jArr3, jArr2);
    }

    public static void zzT(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        zzR(jArr, jArr3);
        zzV(jArr3, jArr2);
    }

    public static void zzU(long[] jArr, long[] jArr2) {
        long jZzWY = zzYI4.zzWY(jArr[0]);
        long jZzWY2 = zzYI4.zzWY(jArr[1]);
        long j = (jZzWY & 4294967295L) | (jZzWY2 << 32);
        long j2 = (jZzWY >>> 32) | (jZzWY2 & (-4294967296L));
        int i = 2;
        long jZzWY3 = zzYI4.zzWY(jArr[2]);
        long jZzWY4 = zzYI4.zzWY(jArr[3]);
        long j3 = (jZzWY3 & 4294967295L) | (jZzWY4 << 32);
        long j4 = (jZzWY4 & (-4294967296L)) | (jZzWY3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j2 << i5);
            int i6 = i4 + 1;
            int[] iArr2 = iArr;
            int i7 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j7 << i5) | (j2 >>> i7));
            int i8 = i4 + 2;
            jArr3[i8] = jArr3[i8] ^ ((j6 << i5) | (j7 >>> i7));
            int i9 = i4 + 3;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i7));
            int i10 = i4 + 4;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i7);
            i2++;
            i = 2;
            iArr = iArr2;
        }
        zzV(jArr3, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j3;
    }

    public static void zzV(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    public static void zzW(long[] jArr, long[] jArr2) {
        if (zzYHX.zzb(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        zzT(jArr, jArr3);
        zzW(jArr3, jArr, jArr3);
        zzT(jArr3, jArr3);
        zzW(jArr3, jArr, jArr3);
        zzZ(jArr3, 3, jArr4);
        zzW(jArr4, jArr3, jArr4);
        zzT(jArr4, jArr4);
        zzW(jArr4, jArr, jArr4);
        zzZ(jArr4, 7, jArr3);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 14, jArr4);
        zzW(jArr4, jArr3, jArr4);
        zzT(jArr4, jArr4);
        zzW(jArr4, jArr, jArr4);
        zzZ(jArr4, 29, jArr3);
        zzW(jArr3, jArr4, jArr3);
        zzT(jArr3, jArr3);
        zzW(jArr3, jArr, jArr3);
        zzZ(jArr3, 59, jArr4);
        zzW(jArr4, jArr3, jArr4);
        zzT(jArr4, jArr4);
        zzW(jArr4, jArr, jArr4);
        zzZ(jArr4, 119, jArr3);
        zzW(jArr3, jArr4, jArr3);
        zzT(jArr3, jArr2);
    }

    private static void zzX(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void zzY(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void zzZ(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
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

    private static void zzh(long[] jArr) {
        long j = jArr[3];
        long j2 = j >>> 47;
        jArr[0] = jArr[0] ^ j2;
        jArr[2] = (j2 << 30) ^ jArr[2];
        jArr[3] = j & 140737488355327L;
    }

    private static void zzl(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 60);
        jArr[1] = (j2 >>> 4) ^ (j3 << 56);
        jArr[2] = (j3 >>> 8) ^ (j4 << 52);
        jArr[3] = (j4 >>> 12) ^ (j5 << 48);
        jArr[4] = (j5 >>> 16) ^ (j6 << 44);
        jArr[5] = (j6 >>> 20) ^ (j7 << 40);
        jArr[6] = (j7 >>> 24) ^ (j8 << 36);
        jArr[7] = j8 >>> 28;
    }

    public static int zzm(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }

    private static void zzY(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr[i5];
    }

    public static void zzV(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        zzU(jArr, jArr2, jArr4);
        zzX(jArr3, jArr4, jArr3);
    }

    public static void zzX(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void zzU(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        zzQ(jArr, jArr4);
        zzQ(jArr2, jArr5);
        zzY(jArr4[0], jArr5[0], jArr3, 0);
        zzY(jArr4[1], jArr5[1], jArr3, 1);
        zzY(jArr4[2], jArr5[2], jArr3, 2);
        zzY(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        zzY(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        zzY(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        zzY(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        zzY(j, j3, jArr6, 0);
        zzY(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j6 ^ j7);
        jArr3[5] = jArr3[5] ^ j7;
        zzl(jArr3);
    }

    public static void zzW(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        zzU(jArr, jArr2, jArr4);
        zzV(jArr4, jArr3);
    }
}
