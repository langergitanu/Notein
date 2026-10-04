package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYHP {
    public static int zzG(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i = 0; i < 14; i++) {
            int i2 = i + 14;
            long jZzZ = j + (4294967295L & ((long) iArr3[i2])) + (((long) zzZ(14, iArr[i], iArr2, iArr3, i)) & 4294967295L);
            iArr3[i2] = (int) jZzZ;
            j = jZzZ >>> 32;
        }
        return (int) j;
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

    public static int zzZ(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) (-(i2 & 1))) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & j) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static boolean zzw(int[] iArr, int[] iArr2) {
        for (int i = 13; i >= 0; i--) {
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

    public static void zzZ(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        int i4 = -(i2 & 1);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i3 + i5] ^ i6) & i4);
        }
    }

    private static int zzZ(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = ((long) i2) & 4294967295L;
        long j2 = 0;
        int i4 = 0;
        do {
            int i5 = i3 + i4;
            long j3 = ((((long) iArr[i4]) & 4294967295L) * j) + (((long) iArr2[i5]) & 4294967295L) + j2;
            iArr2[i5] = (int) j3;
            j2 = j3 >>> 32;
            i4++;
        } while (i4 < 14);
        return (int) j2;
    }
}
