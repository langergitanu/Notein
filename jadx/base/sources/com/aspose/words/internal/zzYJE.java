package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYJE {
    public static long[] zzD(BigInteger bigInteger) {
        long[] jArrZzA = zzYHX.zzA(bigInteger);
        zzi(jArrZzA);
        return jArrZzA;
    }

    private static void zzQ(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
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
        boolean z = true;
        long jZzWY2 = zzYI4.zzWY(jArr[1]);
        long j = (jZzWY & 4294967295L) | (jZzWY2 << 32);
        long j2 = (jZzWY >>> 32) | (jZzWY2 & (-4294967296L));
        long jZzWY3 = zzYI4.zzWY(jArr[2]);
        long jZzWY4 = zzYI4.zzWY(jArr[3]);
        long j3 = (4294967295L & jZzWY3) | (jZzWY4 << 32);
        long j4 = (jZzWY3 >>> 32) | ((-4294967296L) & jZzWY4);
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        int i = 0;
        while (i < 3) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            int i4 = i2 & 63;
            jArr3[i3] = jArr3[i3] ^ (j7 << i4);
            int i5 = i3 + 1;
            boolean z2 = z;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j6 << i4) | (j7 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j5 << i4) | (j6 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ (j5 >>> i6);
            i++;
            z = z2;
        }
        boolean z3 = z;
        zzV(jArr3, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[z3 ? 1 : 0] = jArr2[z3 ? 1 : 0] ^ j3;
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
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
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
        zzZ(jArr3, 58, jArr4);
        zzW(jArr4, jArr3, jArr4);
        zzZ(jArr4, 116, jArr3);
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

    private static void zzi(long[] jArr) {
        long j = jArr[3];
        long j2 = j >>> 41;
        jArr[0] = jArr[0] ^ j2;
        jArr[1] = (j2 << 10) ^ jArr[1];
        jArr[3] = j & 2199023255551L;
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
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = j8 >>> 35;
    }

    public static int zzm(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
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
        jArr[i] = jArr[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
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
