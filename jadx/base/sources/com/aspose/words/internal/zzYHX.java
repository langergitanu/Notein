package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYHX {
    public static long[] zzA(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static boolean zzB(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean zzC(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] zzE(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static boolean zzH(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean zZzY = zzY(iArr, 8, iArr2, 0);
        if (zZzY) {
            zzZ(iArr, 8, iArr2, 0, iArr3, 0);
            return zZzY;
        }
        zzZ(iArr2, 0, iArr, 8, iArr3, 0);
        return zZzY;
    }

    public static long zzI(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = (j * 977) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = (j3 * 977) + j + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j4;
        long j5 = ((long) iArr[10]) & 4294967295L;
        long j6 = (j5 * 977) + j3 + (((long) iArr2[2]) & 4294967295L) + (j4 >>> 32);
        iArr3[2] = (int) j6;
        long j7 = ((long) iArr[11]) & 4294967295L;
        long j8 = (j7 * 977) + j5 + (((long) iArr2[3]) & 4294967295L) + (j6 >>> 32);
        iArr3[3] = (int) j8;
        long j9 = ((long) iArr[12]) & 4294967295L;
        long j10 = (j9 * 977) + j7 + (((long) iArr2[4]) & 4294967295L) + (j8 >>> 32);
        iArr3[4] = (int) j10;
        long j11 = ((long) iArr[13]) & 4294967295L;
        long j12 = (j11 * 977) + j9 + (((long) iArr2[5]) & 4294967295L) + (j10 >>> 32);
        iArr3[5] = (int) j12;
        long j13 = ((long) iArr[14]) & 4294967295L;
        long j14 = (j13 * 977) + j11 + (((long) iArr2[6]) & 4294967295L) + (j12 >>> 32);
        iArr3[6] = (int) j14;
        long j15 = ((long) iArr[15]) & 4294967295L;
        long j16 = (977 * j15) + j13 + (4294967295L & ((long) iArr2[7])) + (j14 >>> 32);
        iArr3[7] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    public static int zzJ(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int zzK(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = (j10 * j) + (((long) iArr3[i]) & 4294967295L);
            int i2 = i;
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j10 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j11 >>> 32);
            iArr3[i3] = (int) j12;
            int i4 = i2 + 2;
            long j13 = (j10 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j12 >>> 32);
            iArr3[i4] = (int) j13;
            int i5 = i2 + 3;
            long j14 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j13 >>> 32);
            iArr3[i5] = (int) j14;
            int i6 = i2 + 4;
            long j15 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j14 >>> 32);
            iArr3[i6] = (int) j15;
            int i7 = i2 + 5;
            long j16 = (j10 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j15 >>> 32);
            iArr3[i7] = (int) j16;
            int i8 = i2 + 6;
            long j17 = (j10 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j16 >>> 32);
            iArr3[i8] = (int) j17;
            int i9 = i2 + 7;
            long j18 = (j10 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j18;
            int i10 = i2 + 8;
            long j19 = j9 + (((long) iArr3[i10]) & 4294967295L) + (j18 >>> 32);
            iArr3[i10] = (int) j19;
            j9 = j19 >>> 32;
            i = i3;
        }
        return (int) j9;
    }

    public static int zzL(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int zzM(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean zzP(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void zzR(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        int i = (int) (j17 >>> 32);
        iArr3[8] = i;
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j18 = ((long) iArr[i2]) & 4294967295L;
            long j19 = j5;
            long j20 = (j18 * j) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j20;
            int i4 = i2 + 1;
            long j21 = (j18 * j2) + (((long) iArr3[i4]) & 4294967295L) + (j20 >>> 32);
            iArr3[i4] = (int) j21;
            int i5 = i2 + 2;
            long j22 = (j18 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j21 >>> 32);
            iArr3[i5] = (int) j22;
            int i6 = i2 + 3;
            long j23 = (j18 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j22 >>> 32);
            iArr3[i6] = (int) j23;
            int i7 = i2 + 4;
            long j24 = (j18 * j19) + (((long) iArr3[i7]) & 4294967295L) + (j23 >>> 32);
            iArr3[i7] = (int) j24;
            int i8 = i2 + 5;
            long j25 = (j18 * j6) + (((long) iArr3[i8]) & 4294967295L) + (j24 >>> 32);
            iArr3[i8] = (int) j25;
            int i9 = i2 + 6;
            long j26 = (j18 * j7) + (((long) iArr3[i9]) & 4294967295L) + (j25 >>> 32);
            iArr3[i9] = (int) j26;
            long j27 = j26 >>> 32;
            int i10 = i2 + 7;
            long j28 = (j18 * j8) + (((long) iArr3[i10]) & 4294967295L) + j27;
            iArr3[i10] = (int) j28;
            iArr3[i2 + 8] = (int) (j28 >>> 32);
            i2 = i4;
            j5 = j19;
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    private static boolean zzY(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i3 + 8] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static int zzZ(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + (j >>> 32);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j3 >>> 32);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L) + (j4 >>> 32);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i10])) + (j7 >>> 32);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static BigInteger zzZA(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                zzYGN.zzN(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean zzZB(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzZC(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void zzZI(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static BigInteger zza(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                zzYGN.zzW(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean zzb(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void zzy(int[] iArr, int[] iArr2) {
        int i = 8;
        long j = ((long) iArr[8]) & 4294967295L;
        int i2 = 0;
        int i3 = 7;
        int i4 = 16;
        while (true) {
            int i5 = i3 - 1;
            long j2 = ((long) iArr[i3 + i]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i4 + 15] = (i2 << 31) | ((int) (j3 >>> 33));
            int i6 = i4 - 2;
            long j4 = j;
            iArr2[i4 + 14] = (int) (j3 >>> 1);
            int i7 = (int) j3;
            if (i5 <= 0) {
                long j5 = j4 * j4;
                iArr2[16] = (int) j5;
                long j6 = ((long) iArr[9]) & 4294967295L;
                long j7 = ((long) iArr2[18]) & 4294967295L;
                long j8 = (j6 * j4) + ((((long) (i7 << 31)) & 4294967295L) | (j5 >>> 33));
                int i8 = (int) j8;
                iArr2[17] = (((int) (j5 >>> 32)) & 1) | (i8 << 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[10]) & 4294967295L;
                long j11 = ((long) iArr2[19]) & 4294967295L;
                long j12 = ((long) iArr2[20]) & 4294967295L;
                long j13 = (j10 * j4) + j9;
                int i9 = (int) j13;
                iArr2[18] = (i9 << 1) | (i8 >>> 31);
                long jOooO00o = C20593OooO0Oo.OooO00o(j10, j6, j13 >>> 32, j11);
                long j14 = j12 + (jOooO00o >>> 32);
                long j15 = ((long) iArr[11]) & 4294967295L;
                long j16 = (((long) iArr2[21]) & 4294967295L) + (j14 >>> 32);
                long j17 = (((long) iArr2[22]) & 4294967295L) + (j16 >>> 32);
                long j18 = j16 & 4294967295L;
                long j19 = (j15 * j4) + (jOooO00o & 4294967295L);
                int i10 = (int) j19;
                iArr2[19] = (i9 >>> 31) | (i10 << 1);
                long jOooO00o2 = C20593OooO0Oo.OooO00o(j15, j6, j19 >>> 32, j14 & 4294967295L);
                long jOooO00o3 = C20593OooO0Oo.OooO00o(j15, j10, jOooO00o2 >>> 32, j18);
                long j20 = j17 + (jOooO00o3 >>> 32);
                long j21 = jOooO00o3 & 4294967295L;
                long j22 = ((long) iArr[12]) & 4294967295L;
                long j23 = (((long) iArr2[23]) & 4294967295L) + (j20 >>> 32);
                long j24 = j20 & 4294967295L;
                long j25 = (((long) iArr2[24]) & 4294967295L) + (j23 >>> 32);
                long j26 = (j22 * j4) + (jOooO00o2 & 4294967295L);
                int i11 = (int) j26;
                iArr2[20] = (i11 << 1) | (i10 >>> 31);
                int i12 = i11 >>> 31;
                long jOooO00o4 = C20593OooO0Oo.OooO00o(j22, j6, j26 >>> 32, j21);
                long jOooO00o5 = C20593OooO0Oo.OooO00o(j22, j10, jOooO00o4 >>> 32, j24);
                long jOooO00o6 = C20593OooO0Oo.OooO00o(j22, j15, jOooO00o5 >>> 32, j23 & 4294967295L);
                long j27 = jOooO00o5 & 4294967295L;
                long j28 = j25 + (jOooO00o6 >>> 32);
                long j29 = jOooO00o6 & 4294967295L;
                long j30 = ((long) iArr[13]) & 4294967295L;
                long j31 = (((long) iArr2[25]) & 4294967295L) + (j28 >>> 32);
                long j32 = (((long) iArr2[26]) & 4294967295L) + (j31 >>> 32);
                long j33 = j31 & 4294967295L;
                long j34 = (j30 * j4) + (jOooO00o4 & 4294967295L);
                int i13 = (int) j34;
                iArr2[21] = (i13 << 1) | i12;
                long jOooO00o7 = C20593OooO0Oo.OooO00o(j30, j6, j34 >>> 32, j27);
                long jOooO00o8 = C20593OooO0Oo.OooO00o(j30, j10, jOooO00o7 >>> 32, j29);
                long jOooO00o9 = C20593OooO0Oo.OooO00o(j30, j15, jOooO00o8 >>> 32, j28 & 4294967295L);
                long j35 = jOooO00o8 & 4294967295L;
                long jOooO00o10 = C20593OooO0Oo.OooO00o(j30, j22, jOooO00o9 >>> 32, j33);
                long j36 = jOooO00o9 & 4294967295L;
                long j37 = j32 + (jOooO00o10 >>> 32);
                long j38 = jOooO00o10 & 4294967295L;
                long j39 = ((long) iArr[14]) & 4294967295L;
                long j40 = (((long) iArr2[27]) & 4294967295L) + (j37 >>> 32);
                long j41 = j37 & 4294967295L;
                long j42 = (((long) iArr2[28]) & 4294967295L) + (j40 >>> 32);
                long j43 = j40 & 4294967295L;
                long j44 = (j39 * j4) + (jOooO00o7 & 4294967295L);
                int i14 = (int) j44;
                iArr2[22] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                long jOooO00o11 = C20593OooO0Oo.OooO00o(j39, j6, j44 >>> 32, j35);
                long jOooO00o12 = C20593OooO0Oo.OooO00o(j39, j10, jOooO00o11 >>> 32, j36);
                long jOooO00o13 = C20593OooO0Oo.OooO00o(j39, j15, jOooO00o12 >>> 32, j38);
                long j45 = jOooO00o12 & 4294967295L;
                long jOooO00o14 = C20593OooO0Oo.OooO00o(j39, j22, jOooO00o13 >>> 32, j41);
                long j46 = jOooO00o13 & 4294967295L;
                long jOooO00o15 = C20593OooO0Oo.OooO00o(j39, j30, jOooO00o14 >>> 32, j43);
                long j47 = j42 + (jOooO00o15 >>> 32);
                long j48 = ((long) iArr[15]) & 4294967295L;
                long j49 = (((long) iArr2[29]) & 4294967295L) + (j47 >>> 32);
                long j50 = j47 & 4294967295L;
                long j51 = (((long) iArr2[30]) & 4294967295L) + (j49 >>> 32);
                long j52 = j49 & 4294967295L;
                long j53 = (j48 * j4) + (jOooO00o11 & 4294967295L);
                int i16 = (int) j53;
                iArr2[23] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long jOooO00o16 = C20593OooO0Oo.OooO00o(j48, j6, j53 >>> 32, j45);
                long jOooO00o17 = C20593OooO0Oo.OooO00o(j48, j10, jOooO00o16 >>> 32, j46);
                long jOooO00o18 = C20593OooO0Oo.OooO00o(j48, j15, jOooO00o17 >>> 32, jOooO00o14 & 4294967295L);
                long jOooO00o19 = C20593OooO0Oo.OooO00o(j48, j22, jOooO00o18 >>> 32, jOooO00o15 & 4294967295L);
                long jOooO00o20 = C20593OooO0Oo.OooO00o(j48, j30, jOooO00o19 >>> 32, j50);
                long jOooO00o21 = C20593OooO0Oo.OooO00o(j48, j39, jOooO00o20 >>> 32, j52);
                long j54 = j51 + (jOooO00o21 >>> 32);
                int i18 = (int) jOooO00o16;
                iArr2[24] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jOooO00o17;
                iArr2[25] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) jOooO00o18;
                iArr2[26] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jOooO00o19;
                iArr2[27] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jOooO00o20;
                iArr2[28] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) jOooO00o21;
                iArr2[29] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j54;
                iArr2[30] = i29 | (i30 << 1);
                iArr2[31] = (i30 >>> 31) | ((iArr2[31] + ((int) (j54 >>> 32))) << 1);
                return;
            }
            i4 = i6;
            i3 = i5;
            j = j4;
            i2 = i7;
            i = 8;
        }
    }

    public static int zzz(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L);
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23])) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static int zzA(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        long j8 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j7 >> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int zzE(int i, int[] iArr) {
        long j = ((long) i) & 4294967295L;
        long j2 = (977 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if ((j4 >>> 32) == 0) {
            return 0;
        }
        return zzYI2.zzZ(8, iArr, 0, 3);
    }

    public static void zzZ(long[] jArr, long[] jArr2, int i) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
    }

    public static void zzZ(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[16] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[17] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[18] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[19] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[20] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[21] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[23] = (int) j17;
        iArr3[24] = (int) (j17 >>> 32);
        int i2 = 1;
        int i3 = i;
        for (int i4 = 8; i2 < i4; i4 = 8) {
            int i5 = i3 + 1;
            int i6 = i3;
            long j18 = ((long) iArr[i2 + 8]) & 4294967295L;
            long j19 = (j18 * j) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j19;
            int i7 = i6 + 2;
            long j20 = (j18 * j2) + (((long) iArr3[i7]) & 4294967295L) + (j19 >>> 32);
            iArr3[i7] = (int) j20;
            int i8 = i6 + 3;
            long j21 = (j18 * j3) + (((long) iArr3[i8]) & 4294967295L) + (j20 >>> 32);
            iArr3[i8] = (int) j21;
            int i9 = i6 + 4;
            long j22 = (j18 * j4) + (((long) iArr3[i9]) & 4294967295L) + (j21 >>> 32);
            iArr3[i9] = (int) j22;
            int i10 = i6 + 5;
            long j23 = (j18 * j5) + (((long) iArr3[i10]) & 4294967295L) + (j22 >>> 32);
            iArr3[i10] = (int) j23;
            int i11 = i6 + 6;
            long j24 = (j18 * j6) + (((long) iArr3[i11]) & 4294967295L) + (j23 >>> 32);
            iArr3[i11] = (int) j24;
            int i12 = i6 + 7;
            long j25 = (j18 * j7) + (((long) iArr3[i12]) & 4294967295L) + (j24 >>> 32);
            iArr3[i12] = (int) j25;
            int i13 = i6 + 8;
            long j26 = (j18 * j8) + (((long) iArr3[i13]) & 4294967295L) + (j25 >>> 32);
            iArr3[i13] = (int) j26;
            iArr3[i6 + 9] = (int) (j26 >>> 32);
            i2++;
            i3 = i5;
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i6 = (int) j8;
                iArr2[1] = i5 | (i6 << 1);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i7 = (int) j12;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long jOooO00o = C20593OooO0Oo.OooO00o(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jOooO00o >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = j15 & 4294967295L;
                long j19 = (j14 * j) + (jOooO00o & 4294967295L);
                int i8 = (int) j19;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long jOooO00o2 = C20593OooO0Oo.OooO00o(j14, j6, j19 >>> 32, j16);
                long jOooO00o3 = C20593OooO0Oo.OooO00o(j14, j9, jOooO00o2 >>> 32, j18);
                long j20 = j17 + (jOooO00o3 >>> 32);
                long j21 = jOooO00o3 & 4294967295L;
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = (j22 * j) + (jOooO00o2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[4] = i9 | (i10 << 1);
                long jOooO00o4 = C20593OooO0Oo.OooO00o(j22, j6, j26 >>> 32, j21);
                long jOooO00o5 = C20593OooO0Oo.OooO00o(j22, j9, jOooO00o4 >>> 32, j20 & 4294967295L);
                long jOooO00o6 = C20593OooO0Oo.OooO00o(j22, j14, jOooO00o5 >>> 32, j25);
                long j27 = jOooO00o5 & 4294967295L;
                long j28 = j24 + (jOooO00o6 >>> 32);
                long j29 = jOooO00o6 & 4294967295L;
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j33 = (j30 * j) + (jOooO00o4 & 4294967295L);
                int i11 = (int) j33;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long jOooO00o7 = C20593OooO0Oo.OooO00o(j30, j6, j33 >>> 32, j27);
                long jOooO00o8 = C20593OooO0Oo.OooO00o(j30, j9, jOooO00o7 >>> 32, j29);
                long jOooO00o9 = C20593OooO0Oo.OooO00o(j30, j14, jOooO00o8 >>> 32, j28 & 4294967295L);
                long j34 = jOooO00o8 & 4294967295L;
                long jOooO00o10 = C20593OooO0Oo.OooO00o(j30, j22, jOooO00o9 >>> 32, j31 & 4294967295L);
                long j35 = jOooO00o9 & 4294967295L;
                long j36 = j32 + (jOooO00o10 >>> 32);
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (((long) iArr2[11]) & 4294967295L) + (j36 >>> 32);
                long j39 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j40 = (j37 * j) + (jOooO00o7 & 4294967295L);
                int i13 = (int) j40;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jOooO00o11 = C20593OooO0Oo.OooO00o(j37, j6, j40 >>> 32, j34);
                long jOooO00o12 = C20593OooO0Oo.OooO00o(j37, j9, jOooO00o11 >>> 32, j35);
                long jOooO00o13 = C20593OooO0Oo.OooO00o(j37, j14, jOooO00o12 >>> 32, jOooO00o10 & 4294967295L);
                long j41 = jOooO00o12 & 4294967295L;
                long jOooO00o14 = C20593OooO0Oo.OooO00o(j37, j22, jOooO00o13 >>> 32, j36 & 4294967295L);
                long j42 = jOooO00o13 & 4294967295L;
                long jOooO00o15 = C20593OooO0Oo.OooO00o(j37, j30, jOooO00o14 >>> 32, j38 & 4294967295L);
                long j43 = j39 + (jOooO00o15 >>> 32);
                long j44 = ((long) iArr[7]) & 4294967295L;
                long j45 = (((long) iArr2[13]) & 4294967295L) + (j43 >>> 32);
                long j46 = (((long) iArr2[14]) & 4294967295L) + (j45 >>> 32);
                long j47 = j45 & 4294967295L;
                long j48 = (j44 * j) + (jOooO00o11 & 4294967295L);
                int i15 = (int) j48;
                iArr2[7] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                long jOooO00o16 = C20593OooO0Oo.OooO00o(j44, j6, j48 >>> 32, j41);
                long jOooO00o17 = C20593OooO0Oo.OooO00o(j44, j9, jOooO00o16 >>> 32, j42);
                long jOooO00o18 = C20593OooO0Oo.OooO00o(j44, j14, jOooO00o17 >>> 32, jOooO00o14 & 4294967295L);
                long jOooO00o19 = C20593OooO0Oo.OooO00o(j44, j22, jOooO00o18 >>> 32, jOooO00o15 & 4294967295L);
                long jOooO00o20 = C20593OooO0Oo.OooO00o(j44, j30, jOooO00o19 >>> 32, j43 & 4294967295L);
                long jOooO00o21 = C20593OooO0Oo.OooO00o(j44, j37, jOooO00o20 >>> 32, j47);
                long j49 = j46 + (jOooO00o21 >>> 32);
                int i17 = (int) jOooO00o16;
                iArr2[8] = (i17 << 1) | i16;
                int i18 = (int) jOooO00o17;
                iArr2[9] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jOooO00o18;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) jOooO00o19;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jOooO00o20;
                iArr2[12] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jOooO00o21;
                iArr2[13] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j49;
                iArr2[14] = i27 | (i28 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j49 >>> 32))) << 1) | (i28 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int zzZ(long j, int[] iArr) {
        long j2 = j & 4294967295L;
        long j3 = (j2 * 977) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = (977 * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr[1] = (int) j5;
        long j6 = j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return zzYI2.zzZ(8, iArr, 0, 4);
    }

    private static int zzZ(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }
}
