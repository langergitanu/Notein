package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYTD {
    private static final int[] zzVY9 = zzXCx();

    private static int zzO(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 8;
        int i2 = iArr[1];
        iArr2[1] = (i << 24) | (i2 >>> 8);
        int i3 = i2 << 24;
        int i4 = iArr[2];
        iArr2[2] = i3 | (i4 >>> 8);
        int i5 = iArr[3];
        iArr2[3] = (i4 << 24) | (i5 >>> 8);
        return i5 << 24;
    }

    private static int zzP(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        int i2 = iArr[1];
        iArr2[1] = (i << 31) | (i2 >>> 1);
        int i3 = i2 << 31;
        int i4 = iArr[2];
        iArr2[2] = i3 | (i4 >>> 1);
        int i5 = iArr[3];
        iArr2[3] = (i4 << 31) | (i5 >>> 1);
        return i5 << 31;
    }

    public static void zzQ(int[] iArr, int[] iArr2) {
        int iZzO = zzO(iArr, iArr2);
        iArr2[0] = zzVY9[iZzO >>> 24] ^ iArr2[0];
    }

    public static void zzR(int[] iArr, int[] iArr2) {
        iArr2[0] = ((zzP(iArr, iArr2) >> 8) & (-520093696)) ^ iArr2[0];
    }

    public static void zzS(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = iArr2[i9];
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = i10 >> 31;
                i10 <<= 1;
                i5 ^= i & i12;
                i6 ^= i2 & i12;
                i7 ^= i3 & i12;
                i8 ^= i12 & i4;
                int i13 = (i4 << 31) >> 8;
                i4 = (i4 >>> 1) | (i3 << 31);
                i3 = (i3 >>> 1) | (i2 << 31);
                i2 = (i2 >>> 1) | (i << 31);
                i = (i >>> 1) ^ (i13 & (-520093696));
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        iArr[2] = i7;
        iArr[3] = i8;
    }

    public static void zzV(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    public static void zzW(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            }
        }
    }

    public static int[] zzW6(byte[] bArr) {
        int[] iArr = new int[4];
        zzYGN.zzW(bArr, 0, iArr);
        return iArr;
    }

    public static int[] zzXCw() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    private static int[] zzXCx() {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = 0;
            for (int i3 = 7; i3 >= 0; i3--) {
                if (((1 << i3) & i) != 0) {
                    i2 ^= (-520093696) >>> (7 - i3);
                }
            }
            iArr[i] = i2;
        }
        return iArr;
    }

    public static void zzZ(int[] iArr, byte[] bArr) {
        zzYGN.zzX(iArr, bArr, 0);
    }

    public static void zzw(byte[] bArr, byte[] bArr2) {
        int[] iArrZzW6 = zzW6(bArr);
        zzS(iArrZzW6, zzW6(bArr2));
        zzYGN.zzX(iArrZzW6, bArr, 0);
    }

    public static void zzZ(byte[] bArr, int[] iArr) {
        zzYGN.zzW(bArr, 0, iArr);
    }

    public static void zzZ(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }
}
