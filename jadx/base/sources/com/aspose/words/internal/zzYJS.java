package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYJS {

    /* JADX INFO: renamed from: bP */
    private static final long[] f51016bP = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static long[] zzD(BigInteger bigInteger) {
        long[] jArrZzA = zzYHZ.zzA(bigInteger);
        zzk(jArrZzA);
        return jArrZzA;
    }

    private static void zzR(long[] jArr, long[] jArr2) {
        zzYI4.zzZ(jArr[0], jArr2, 0);
        zzYI4.zzZ(jArr[1], jArr2, 2);
        long j = jArr[2];
        jArr2[4] = zzYI4.zzeE((int) j);
        jArr2[5] = ((long) zzYI4.zzeG((int) (j >>> 32))) & 4294967295L;
    }

    public static void zzS(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        zzR(jArr, jArr3);
        zzX(jArr2, jArr3, jArr2);
    }

    public static void zzT(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        zzR(jArr, jArr3);
        zzV(jArr3, jArr2);
    }

    private static void zzU(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        zzZ(j5, j10, jArr4, 0);
        zzZ(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        zzZ(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        zzZ(j5 ^ j13, j10 ^ j14, jArr4, 6);
        zzZ(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = jArr4[9] ^ j17;
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j18) ^ (j28 >>> 55);
        long j30 = ((j26 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 36028797018963967L;
        long j37 = (((j28 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54)) ^ (j36 >>> 54);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 36028797018963967L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 54);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        jArr3[1] = (j23 ^ j36) ^ j25;
        jArr3[2] = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[3] = j50 ^ j43;
        jArr3[4] = jArr4[2] ^ j50;
        jArr3[5] = jArr4[3];
        zzl(jArr3);
    }

    public static void zzV(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    public static void zzW(long[] jArr, long[] jArr2) {
        if (zzYHZ.zzb(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        zzT(jArr, jArr3);
        zzZ(jArr3, 1, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 1, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 3, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 3, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 9, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 9, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 27, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr4, 27, jArr4);
        zzW(jArr3, jArr4, jArr3);
        zzZ(jArr3, 81, jArr4);
        zzW(jArr3, jArr4, jArr2);
    }

    private static void zzX(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void zzY(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    private static void zzZ(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 3];
        long j8 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j7;
        jArr[i + 1] = (j7 >>> 55) ^ (j8 << 9);
    }

    private static void zzk(long[] jArr) {
        long j = jArr[2];
        long j2 = j >>> 35;
        jArr[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArr[0];
        jArr[2] = j & 34359738367L;
    }

    private static void zzl(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    public static int zzm(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }

    public static void zzV(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        zzU(jArr, jArr2, jArr4);
        zzX(jArr3, jArr4, jArr3);
    }

    public static void zzX(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static void zzZ(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[6];
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

    public static void zzU(long[] jArr, long[] jArr2) {
        long jZzWY = zzYI4.zzWY(jArr[0]);
        long jZzWY2 = zzYI4.zzWY(jArr[1]);
        long j = (jZzWY & 4294967295L) | (jZzWY2 << 32);
        long jZzWY3 = zzYI4.zzWY(jArr[2]);
        zzW(new long[]{(jZzWY >>> 32) | (jZzWY2 & (-4294967296L)), jZzWY3 >>> 32, 0}, f51016bP, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ (jZzWY3 & 4294967295L);
    }

    public static void zzW(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        zzU(jArr, jArr2, jArr4);
        zzV(jArr4, jArr3);
    }
}
