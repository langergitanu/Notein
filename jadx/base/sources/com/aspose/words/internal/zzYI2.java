package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYI2 {
    public static void zzF(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
    }

    public static BigInteger zzG(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                zzYGN.zzN(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean zzH(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzI(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] zzJ(int i, int[] iArr) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static int zzO(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= iArr.length) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static int zzR(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((((long) iArr2[i2]) & 4294967295L) - (4294967295L & ((long) iArr[i2]))) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int zzS(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & 4294967295L;
        long j2 = 0;
        int i2 = 0;
        do {
            int i3 = i2 + 16;
            long j3 = ((((long) iArr[i2]) & 4294967295L) * j) + (((long) iArr2[i3]) & 4294967295L) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
            i2++;
        } while (i2 < 16);
        return (int) j2;
    }

    public static int zzT(int i, int i2, int[] iArr) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return zzW(i, iArr, 1);
    }

    public static int zzU(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (4294967295L & ((long) iArr[1])) + 1 + (j >>> 32);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return zzW(i, iArr, 2);
    }

    public static boolean zzV(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int zzW(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int zzX(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static int zzY(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (4294967295L & ((long) iArr3[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int zzZ(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int zzZD(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 2147483649L;
        iArr[0] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return zzX(5, iArr, 1);
    }

    public static int zzZE(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int zzZF(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] - 1;
            iArr[i] = i2;
            if (i2 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static void zzd(long[] jArr) {
        for (int i = 0; i < 18; i++) {
            jArr[i] = 0;
        }
    }

    public static int[] zzV(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[(i + 31) >> 5];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    public static int zzX(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2]))) + j;
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int zzS(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = ((4294967295L & ((long) iArr[1])) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return zzX(i, iArr, 2);
    }

    public static int zzW(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static int zzY(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return zzW(i, iArr, i3 + 1);
    }

    public static int zzZ(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = (((long) iArr[i3]) & 4294967295L) + (4294967295L & ((long) iArr2[i4])) + j;
            iArr2[i4] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int zzT(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int zzW(int[] iArr, int i, int[] iArr2) {
        int i2 = 16;
        while (true) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                return i << (-9);
            }
            int i4 = iArr[i2 + 15];
            iArr2[i3] = (i << (-9)) | (i4 >>> 9);
            i = i4;
            i2 = i3;
        }
    }

    public static int zzX(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = ((((long) iArr2[i4]) & 4294967295L) - (4294967295L & ((long) iArr[i3]))) + j;
            iArr2[i4] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int zzZ(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static boolean zzU(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static void zzY(int i, int[] iArr, int[] iArr2, int i2) {
        System.arraycopy(iArr, 0, iArr2, i2, i);
    }

    public static int zzZ(int i, int[] iArr, int i2, int[] iArr2, int[] iArr3) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) i2) & 4294967295L;
        long j3 = 0;
        int i3 = 0;
        do {
            long j4 = ((((long) iArr2[i3]) & 4294967295L) * j2) + ((((long) iArr[i3]) & 4294967295L) * j);
            int i4 = i3 + 16;
            long j5 = j4 + (((long) iArr3[i4]) & 4294967295L) + j3;
            iArr3[i4] = (int) j5;
            j3 = j5 >>> 32;
            i3++;
        } while (i3 < 16);
        return (int) j3;
    }

    public static int zzT(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr[i3] = (i2 >>> (-2)) | (i4 << 2);
            i3++;
            i2 = i4;
        }
        return i2 >>> (-2);
    }

    public static int zzY(int i, int[] iArr, int i2, int i3) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << (-i2);
            }
            int i4 = iArr[i];
            iArr[i] = (i3 << (-i2)) | (i4 >>> i2);
            i3 = i4;
        }
    }

    public static int zzU(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = iArr[i];
            iArr[i] = i2;
            i2 = i3;
        }
    }

    public static int zzV(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }

    public static int zzZ(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static int zzY(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> (-3)) | (i4 << 3);
            i3++;
            i2 = i4;
        }
        return i2 >>> (-3);
    }

    public static long zzZ(long[] jArr, int i, long j, long[] jArr2, int i2) {
        int i3 = 0;
        while (i3 < 9) {
            long j2 = jArr[i + i3];
            jArr2[i2 + i3] = (j >>> 63) | (j2 << 1);
            i3++;
            j = j2;
        }
        return j >>> 63;
    }

    public static long zzZ(int i, long[] jArr, long j) {
        int i2 = 0;
        while (i2 < i) {
            long j2 = jArr[i2];
            jArr[i2] = (j >>> (-8)) | (j2 << 8);
            i2++;
            j = j2;
        }
        return j >>> (-8);
    }

    public static long zzZ(long[] jArr, long j, long[] jArr2) {
        int i = 0;
        while (i < 144) {
            long j2 = jArr[i];
            jArr2[i + 144] = (j >>> (-4)) | (j2 << 4);
            i++;
            j = j2;
        }
        return j >>> (-4);
    }
}
