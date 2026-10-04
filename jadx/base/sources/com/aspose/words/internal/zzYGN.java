package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYGN {
    public static void zzM(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void zzN(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void zzV(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = zzZL(bArr, i);
            i += 4;
        }
    }

    public static void zzW(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = zzZN(bArr, i);
            i += 4;
        }
    }

    public static byte[] zzWW(long j) {
        byte[] bArr = new byte[8];
        zzV(j, bArr, 0);
        return bArr;
    }

    public static byte[] zzWX(long j) {
        byte[] bArr = new byte[8];
        zzW(j, bArr, 0);
        return bArr;
    }

    public static void zzX(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            zzN(i2, bArr, i);
            i += 4;
        }
    }

    public static void zzZ(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = zzZL(bArr, i);
            i += 4;
        }
    }

    public static long zzZJ(byte[] bArr, int i) {
        return ((((long) zzZL(bArr, i + 4)) & 4294967295L) << 32) | (((long) zzZL(bArr, i)) & 4294967295L);
    }

    public static int[] zzZK(byte[] bArr, int i) {
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = zzZL(bArr, i);
            i += 4;
        }
        return iArr;
    }

    public static int zzZL(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long zzZM(byte[] bArr, int i) {
        int iZzZN = zzZN(bArr, i);
        return (((long) zzZN(bArr, i + 4)) & 4294967295L) | ((((long) iZzZN) & 4294967295L) << 32);
    }

    public static int zzZN(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static byte[] zzeB(int i) {
        byte[] bArr = new byte[4];
        zzN(i, bArr, 0);
        return bArr;
    }

    public static void zzV(long j, byte[] bArr, int i) {
        zzM((int) (4294967295L & j), bArr, i);
        zzM((int) (j >>> 32), bArr, i + 4);
    }

    public static void zzW(long j, byte[] bArr, int i) {
        zzN((int) (j >>> 32), bArr, i);
        zzN((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void zzW(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            zzM(i2, bArr, i);
            i += 4;
        }
    }
}
