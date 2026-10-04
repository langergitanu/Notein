package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYK4 {
    public static long[] zzD(BigInteger bigInteger) {
        long[] jArrZzA = zzYI1.zzA(bigInteger);
        zzo(jArrZzA);
        return jArrZzA;
    }

    private static void zzR(long[] jArr, long[] jArr2) {
        zzYI4.zzZ(jArr[0], jArr2, 0);
        zzYI4.zzZ(jArr[1], jArr2, 2);
    }

    public static void zzS(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        zzR(jArr, jArr3);
        zzX(jArr2, jArr3, jArr2);
    }

    public static void zzT(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        zzR(jArr, jArr3);
        zzV(jArr3, jArr2);
    }

    public static void zzU(long[] jArr, long[] jArr2) {
        long jZzWY = zzYI4.zzWY(jArr[0]);
        long jZzWY2 = zzYI4.zzWY(jArr[1]);
        long j = (4294967295L & jZzWY) | (jZzWY2 << 32);
        long j2 = (jZzWY >>> 32) | (jZzWY2 & (-4294967296L));
        jArr2[0] = ((j2 << 57) ^ j) ^ (j2 << 5);
        jArr2[1] = (j2 >>> 59) ^ (j2 >>> 7);
    }

    public static void zzV(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static void zzW(long[] jArr, long[] jArr2) {
        if (zzYI1.zzb(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[2];
        long[] jArr4 = new long[2];
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
        zzZ(jArr4, 28, jArr3);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 56, jArr4);
        zzW(jArr4, jArr3, jArr4);
        zzT(jArr4, jArr2);
    }

    private static void zzX(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void zzY(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    private static void zzZ(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    private static void zzo(long[] jArr) {
        long j = jArr[1];
        long j2 = j >>> 49;
        jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
        jArr[1] = j & 562949953421311L;
    }

    private static void zzU(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        zzZ(j3, j6, jArr4, 0);
        zzZ(j2, j5, jArr4, 2);
        zzZ(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void zzV(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        zzU(jArr, jArr2, jArr4);
        zzX(jArr3, jArr4, jArr3);
    }

    public static void zzX(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static void zzZ(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
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

    public static void zzW(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        zzU(jArr, jArr2, jArr4);
        zzV(jArr4, jArr3);
    }
}
