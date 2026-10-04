package com.google.android.gms.internal.p624firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzic {
    private static long zza(byte[] bArr, int i, int i2) {
        return (zza(bArr, i) >> i2) & 67108863;
    }

    private static long zza(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j = jZza2 * 5;
            long j2 = jZza3 * 5;
            long j3 = jZza4 * 5;
            long j4 = jZza5 * 5;
            int i = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i2 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i2 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
                }
                long jZza6 = j9 + zza(bArr3, 0, 0);
                long jZza7 = j5 + zza(bArr3, 3, 2);
                long jZza8 = j6 + zza(bArr3, 6, 4);
                long jZza9 = j7 + zza(bArr3, 9, 6);
                long jZza10 = j8 + (zza(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
                long j10 = (jZza10 * j) + (jZza9 * j2) + (jZza8 * j3) + (jZza7 * j4) + (jZza6 * jZza);
                long j11 = (jZza10 * j2) + (jZza9 * j3) + (jZza8 * j4) + (jZza7 * jZza) + (jZza6 * jZza2);
                long j12 = (jZza10 * j3) + (jZza9 * j4) + (jZza8 * jZza) + (jZza7 * jZza2) + (jZza6 * jZza3);
                long j13 = (jZza10 * j4) + (jZza9 * jZza) + (jZza8 * jZza2) + (jZza7 * jZza3) + (jZza6 * jZza4);
                long j14 = jZza9 * jZza2;
                long j15 = jZza10 * jZza;
                long j16 = j11 + (j10 >> 26);
                long j17 = j12 + (j16 >> 26);
                long j18 = j13 + (j17 >> 26);
                long j19 = j15 + j14 + (jZza8 * jZza3) + (jZza7 * jZza4) + (jZza6 * jZza5) + (j18 >> 26);
                long j20 = j19 >> 26;
                j8 = j19 & 67108863;
                long j21 = (j20 * 5) + (j10 & 67108863);
                i2 += 16;
                j6 = j17 & 67108863;
                j7 = j18 & 67108863;
                i = 17;
                j9 = j21 & 67108863;
                j5 = (j16 & 67108863) + (j21 >> 26);
            }
            long j22 = j6 + (j5 >> 26);
            long j23 = j22 & 67108863;
            long j24 = j7 + (j22 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j8 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = ((j26 >> 26) * 5) + j9;
            long j29 = j28 >> 26;
            long j30 = j28 & 67108863;
            long j31 = (j5 & 67108863) + j29;
            long j32 = j30 + 5;
            long j33 = j32 & 67108863;
            long j34 = (j32 >> 26) + j31;
            long j35 = j23 + (j34 >> 26);
            long j36 = j25 + (j35 >> 26);
            long j37 = (j27 + (j36 >> 26)) - 67108864;
            long j38 = j37 >> 63;
            long j39 = ~j38;
            long j40 = (j30 & j38) | (j33 & j39);
            long j41 = (j31 & j38) | (j34 & 67108863 & j39);
            long j42 = (j23 & j38) | (j35 & 67108863 & j39);
            long j43 = (j25 & j38) | (j36 & 67108863 & j39);
            long j44 = (j40 | (j41 << 26)) & 4294967295L;
            long j45 = ((j41 >> 6) | (j42 << 20)) & 4294967295L;
            long j46 = ((j42 >> 12) | (j43 << 14)) & 4294967295L;
            long j47 = ((((j37 & j39) | (j27 & j38)) << 8) | (j43 >> 18)) & 4294967295L;
            long jZza11 = j44 + zza(bArr, 16);
            long j48 = jZza11 & 4294967295L;
            long jZza12 = j45 + zza(bArr, 20) + (jZza11 >> 32);
            long jZza13 = j46 + zza(bArr, 24) + (jZza12 >> 32);
            long jZza14 = (j47 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j48, 0);
            zza(bArr4, jZza12 & 4294967295L, 4);
            zza(bArr4, jZza13 & 4294967295L, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
