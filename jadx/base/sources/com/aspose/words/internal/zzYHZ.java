package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYHZ {
    public static long[] zzA(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[3];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static boolean zzB(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] zzE(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static boolean zzH(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean zZzY = zzY(iArr, 6, iArr2, 0);
        if (zZzY) {
            zzZ(iArr, 6, iArr2, 0, iArr3, 0);
            return zZzY;
        }
        zzZ(iArr2, 0, iArr, 6, iArr3, 0);
        return zZzY;
    }

    public static long zzI(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = (j * 4553) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = (j3 * 4553) + j + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j4;
        long j5 = ((long) iArr[8]) & 4294967295L;
        long j6 = (j5 * 4553) + j3 + (((long) iArr2[2]) & 4294967295L) + (j4 >>> 32);
        iArr3[2] = (int) j6;
        long j7 = ((long) iArr[9]) & 4294967295L;
        long j8 = (j7 * 4553) + j5 + (((long) iArr2[3]) & 4294967295L) + (j6 >>> 32);
        iArr3[3] = (int) j8;
        long j9 = ((long) iArr[10]) & 4294967295L;
        long j10 = (j9 * 4553) + j7 + (((long) iArr2[4]) & 4294967295L) + (j8 >>> 32);
        iArr3[4] = (int) j10;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = (4553 * j11) + j9 + (4294967295L & ((long) iArr2[5])) + (j10 >>> 32);
        iArr3[5] = (int) j12;
        return (j12 >>> 32) + j11;
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
        return (int) (j6 >> 32);
    }

    public static int zzK(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = ((long) iArr[i]) & 4294967295L;
            long j10 = (((long) iArr3[i2]) & 4294967295L) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            int i4 = i2 + 2;
            long j12 = (j9 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i2 + 3;
            long j13 = (j9 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j9 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = (j9 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            int i8 = i2 + 6;
            long j16 = j7 + (((long) iArr3[i8]) & 4294967295L) + (j15 >>> 32);
            iArr3[i8] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
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
        return (int) (j6 >>> 32);
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
        return (int) (j6 >>> 32);
    }

    public static boolean zzP(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
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
        int i = 1;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = ((long) iArr[i3]) & 4294967295L;
            long j15 = (j14 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j14 * j2) + (((long) iArr3[i]) & 4294967295L) + (j15 >>> 32);
            iArr3[i] = (int) j17;
            int i4 = i3 + 2;
            long j18 = (j14 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j17 >>> 32);
            iArr3[i4] = (int) j18;
            int i5 = i3 + 3;
            long j19 = (j14 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j18 >>> 32);
            iArr3[i5] = (int) j19;
            int i6 = i3 + 4;
            long j20 = (j14 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j19 >>> 32);
            iArr3[i6] = (int) j20;
            int i7 = i3 + 5;
            long j21 = (j14 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j20 >>> 32);
            iArr3[i7] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static void zzX(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
    }

    private static boolean zzY(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i3 + 6] ^ Integer.MIN_VALUE;
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
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i8])) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static BigInteger zzZA(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                zzYGN.zzN(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean zzZB(int[] iArr) {
        for (int i = 0; i < 6; i++) {
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
        for (int i = 1; i < 6; i++) {
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
    }

    public static BigInteger zza(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                zzYGN.zzW(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean zzb(long[] jArr) {
        for (int i = 0; i < 3; i++) {
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
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void zzy(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        int i = 0;
        int i2 = 5;
        int i3 = 12;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2 + 6]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i3 + 11] = (i << 31) | ((int) (j3 >>> 33));
            int i5 = i3 - 2;
            iArr2[i3 + 10] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i6 << 31)) & 4294967295L);
                iArr2[12] = (int) j4;
                long j6 = ((long) iArr[7]) & 4294967295L;
                long j7 = ((long) iArr2[14]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i7 = (int) j8;
                iArr2[13] = (((int) (j4 >>> 32)) & 1) | (i7 << 1);
                long j9 = ((long) iArr[8]) & 4294967295L;
                long j10 = ((long) iArr2[15]) & 4294967295L;
                long j11 = ((long) iArr2[16]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr2[14] = (i7 >>> 31) | (i8 << 1);
                long jOooO00o = C20593OooO0Oo.OooO00o(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jOooO00o >>> 32);
                long j14 = ((long) iArr[9]) & 4294967295L;
                long j15 = (((long) iArr2[17]) & 4294967295L) + (j13 >>> 32);
                long j16 = (((long) iArr2[18]) & 4294967295L) + (j15 >>> 32);
                long j17 = j15 & 4294967295L;
                long j18 = (j14 * j) + (jOooO00o & 4294967295L);
                int i9 = (int) j18;
                iArr2[15] = (i8 >>> 31) | (i9 << 1);
                long jOooO00o2 = C20593OooO0Oo.OooO00o(j14, j6, j18 >>> 32, j13 & 4294967295L);
                long jOooO00o3 = C20593OooO0Oo.OooO00o(j14, j9, jOooO00o2 >>> 32, j17);
                long j19 = j16 + (jOooO00o3 >>> 32);
                long j20 = jOooO00o3 & 4294967295L;
                long j21 = ((long) iArr[10]) & 4294967295L;
                long j22 = (((long) iArr2[19]) & 4294967295L) + (j19 >>> 32);
                long j23 = j19 & 4294967295L;
                long j24 = (((long) iArr2[20]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j) + (jOooO00o2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[16] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                long jOooO00o4 = C20593OooO0Oo.OooO00o(j21, j6, j26 >>> 32, j20);
                long jOooO00o5 = C20593OooO0Oo.OooO00o(j21, j9, jOooO00o4 >>> 32, j23);
                long jOooO00o6 = C20593OooO0Oo.OooO00o(j21, j14, jOooO00o5 >>> 32, j25);
                long j27 = j24 + (jOooO00o6 >>> 32);
                long j28 = jOooO00o6 & 4294967295L;
                long j29 = ((long) iArr[11]) & 4294967295L;
                long j30 = (((long) iArr2[21]) & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = (((long) iArr2[22]) & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j * j29) + (jOooO00o4 & 4294967295L);
                int i12 = (int) j34;
                iArr2[17] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long jOooO00o7 = C20593OooO0Oo.OooO00o(j29, j6, j34 >>> 32, jOooO00o5 & 4294967295L);
                long jOooO00o8 = C20593OooO0Oo.OooO00o(j29, j9, jOooO00o7 >>> 32, j28);
                long jOooO00o9 = C20593OooO0Oo.OooO00o(j29, j14, jOooO00o8 >>> 32, j31);
                long jOooO00o10 = C20593OooO0Oo.OooO00o(j29, j21, jOooO00o9 >>> 32, j33);
                long j35 = j32 + (jOooO00o10 >>> 32);
                int i14 = (int) jOooO00o7;
                iArr2[18] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) jOooO00o8;
                iArr2[19] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) jOooO00o9;
                iArr2[20] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jOooO00o10;
                iArr2[21] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j35;
                iArr2[22] = i21 | (i22 << 1);
                iArr2[23] = (i22 >>> 31) | ((iArr2[23] + ((int) (j35 >>> 32))) << 1);
                return;
            }
            i3 = i5;
            i = i6;
            i2 = i4;
        }
    }

    public static int zzz(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L);
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17])) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
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
        long j6 = ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j5 >> 32);
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int zzE(int i, int[] iArr) {
        long j = ((long) i) & 4294967295L;
        long j2 = (4553 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if ((j4 >>> 32) == 0) {
            return 0;
        }
        return zzYI2.zzZ(6, iArr, 0, 3);
    }

    public static void zzZ(long[] jArr, long[] jArr2, int i) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
    }

    public static void zzZ(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        long j = ((long) iArr2[6]) & 4294967295L;
        long j2 = ((long) iArr2[7]) & 4294967295L;
        long j3 = ((long) iArr2[8]) & 4294967295L;
        long j4 = ((long) iArr2[9]) & 4294967295L;
        long j5 = ((long) iArr2[10]) & 4294967295L;
        long j6 = ((long) iArr2[11]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i2 = 1;
        int i3 = i;
        for (int i4 = 6; i2 < i4; i4 = 6) {
            int i5 = i3 + 1;
            long j14 = ((long) iArr[i2 + 6]) & 4294967295L;
            long j15 = (j14 * j) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j15;
            int i6 = i3 + 2;
            long j16 = (j14 * j2) + (((long) iArr3[i6]) & 4294967295L) + (j15 >>> 32);
            iArr3[i6] = (int) j16;
            int i7 = i3 + 3;
            long j17 = (j14 * j3) + (((long) iArr3[i7]) & 4294967295L) + (j16 >>> 32);
            iArr3[i7] = (int) j17;
            int i8 = i3 + 4;
            long j18 = (j14 * j4) + (((long) iArr3[i8]) & 4294967295L) + (j17 >>> 32);
            iArr3[i8] = (int) j18;
            int i9 = i3 + 5;
            long j19 = (j14 * j5) + (((long) iArr3[i9]) & 4294967295L) + (j18 >>> 32);
            iArr3[i9] = (int) j19;
            int i10 = i3 + 6;
            long j20 = (j14 * j6) + (((long) iArr3[i10]) & 4294967295L) + (j19 >>> 32);
            iArr3[i10] = (int) j20;
            iArr3[i3 + 7] = (int) (j20 >>> 32);
            i2++;
            i3 = i5;
            j = j;
        }
    }

    public static void zzK(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
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
                long j21 = ((long) iArr[4]) & 4294967295L;
                long j22 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j) + (jOooO00o2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jOooO00o4 = C20593OooO0Oo.OooO00o(j21, j6, j26 >>> 32, jOooO00o3 & 4294967295L);
                long jOooO00o5 = C20593OooO0Oo.OooO00o(j21, j9, jOooO00o4 >>> 32, j23);
                long jOooO00o6 = C20593OooO0Oo.OooO00o(j21, j14, jOooO00o5 >>> 32, j25);
                long j27 = j24 + (jOooO00o6 >>> 32);
                long j28 = ((long) iArr[5]) & 4294967295L;
                long j29 = (((long) iArr2[9]) & 4294967295L) + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = (((long) iArr2[10]) & 4294967295L) + (j29 >>> 32);
                long j32 = j29 & 4294967295L;
                long j33 = (j28 * j) + (jOooO00o4 & 4294967295L);
                int i12 = (int) j33;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long jOooO00o7 = C20593OooO0Oo.OooO00o(j28, j6, j33 >>> 32, jOooO00o5 & 4294967295L);
                long jOooO00o8 = C20593OooO0Oo.OooO00o(j28, j9, jOooO00o7 >>> 32, jOooO00o6 & 4294967295L);
                long jOooO00o9 = C20593OooO0Oo.OooO00o(j28, j14, jOooO00o8 >>> 32, j30);
                long jOooO00o10 = C20593OooO0Oo.OooO00o(j28, j21, jOooO00o9 >>> 32, j32);
                long j34 = j31 + (jOooO00o10 >>> 32);
                int i14 = (int) jOooO00o7;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = (int) jOooO00o8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) jOooO00o9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jOooO00o10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j34;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j34 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int zzZ(long j, int[] iArr) {
        long j2 = j & 4294967295L;
        long j3 = (j2 * 4553) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = (4553 * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr[1] = (int) j5;
        long j6 = j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return zzYI2.zzZ(6, iArr, 0, 4);
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
        return (int) (j6 >> 32);
    }
}
