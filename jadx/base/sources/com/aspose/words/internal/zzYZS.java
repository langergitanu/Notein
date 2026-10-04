package com.aspose.words.internal;

import Oooo0.C20856OooooOo;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ0T;
import com.aspose.words.internal.zzZ4K;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZS {
    private static byte[] zzU(byte[] bArr, byte[] bArr2, int i) {
        zzZ0T.zzX zzx = zzZ0T.zzWfI;
        return new zzZ0T.zzZ().zzX(zzZ0T.zzX.zzZ(zzZ0P.zzZ.zzWdG, bArr).zzWY(bArr2).zzfM(1)).zzZ(zzZ4K.zzZ.CIPHER, i);
    }

    private static void zzWL(byte[] bArr) {
        if (bArr != null) {
            zzYGU.fill(bArr, (byte) 0);
        }
    }

    private static void zzX(int[] iArr, int i, int i2, int i3) {
        int i4 = i3 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[][] iArr6 = new int[i2][];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i4);
            for (int i5 = 0; i5 < i2; i5++) {
                iArr6[i5] = zzYGU.zzZy(iArr5);
                zzZ(iArr5, iArr2, iArr3, iArr4, i3);
            }
            int i6 = i2 - 1;
            for (int i7 = 0; i7 < i2; i7++) {
                zzZ(iArr5, iArr6[iArr5[i4 - 16] & i6], 0, iArr5);
                zzZ(iArr5, iArr2, iArr3, iArr4, i3);
            }
            System.arraycopy(iArr5, 0, iArr, i, i4);
            zzZ(iArr6);
            zzZ(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            zzZ(iArr6);
            zzZ(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    private static byte[] zzY(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] bArrZzU = zzU(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = bArrZzU.length >>> 2;
            iArr = new int[length];
            zzYGN.zzV(bArrZzU, 0, iArr);
            int i6 = i5 >>> 2;
            for (int i7 = 0; i7 < length; i7 += i6) {
                zzX(iArr, i7, i, i2);
            }
            zzYGN.zzW(iArr, bArrZzU, 0);
            byte[] bArrZzU2 = zzU(bArr, bArrZzU, i4);
            zzWL(bArrZzU);
            zzZV(iArr);
            return bArrZzU2;
        } catch (Throwable th) {
            zzWL(bArrZzU);
            zzZV(iArr);
            throw th;
        }
    }

    public static byte[] zzZ(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i <= 1 || !zzfE(i)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i2 == 1 && i >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i5 = Integer.MAX_VALUE / (i2 * 1024);
        if (i3 <= 0 || i3 > i5) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Parallelisation parameter p must be >= 1 and <= ", i5, " (based on block size r of ", ")", i2));
        }
        if (i4 > 0) {
            return zzY(bArr, bArr2, i, i2, i3, i4);
        }
        throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
    }

    private static void zzZV(int[] iArr) {
        if (iArr != null) {
            zzYGU.zzZz(iArr);
        }
    }

    private static boolean zzfE(int i) {
        return (i & (i + (-1))) == 0;
    }

    private static void zzZ(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            zzZ(iArr2, iArr, i2, iArr3);
            zzYZI.zzT(iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
    }

    private static void zzZ(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    private static void zzZ(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            zzZV(iArr2);
        }
    }
}
