package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYIG {

    /* JADX INFO: renamed from: cL */
    private static final int[] f50942cL = {268435454, 268435455, 268435455, 268435455, 268435455, 268435455, 268435455, 268435455, 268435454, 268435455, 268435455, 268435455, 268435455, 268435455, 268435455, 268435455};

    /* JADX INFO: renamed from: cI */
    private static final int[] f50940cI = {161294112, 185702364, 163248300, 54522310, 189866924, 105098465, 66174309, 139206530, 156517789, 136025714, 231801628, 246922668, 59251455, 69446896, 83964484, 252685170};

    /* JADX INFO: renamed from: cJ */
    private static int[] f50941cJ = null;

    private static void zzH(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        zzYIF.zzY(iArr, iArr2, iArr3);
        zzYIF.zzO(iArr, iArr2, iArr4);
        zzYIF.zzE(iArr3, iArr3);
        zzYIF.zzE(iArr4, iArr4);
        zzYIF.zzR(iArr3, iArr4, iArr);
        zzYIF.zzO(iArr3, iArr4, iArr3);
        zzYIF.zzX(iArr3, 39082, iArr2);
        zzYIF.zzY(iArr2, iArr4, iArr2);
        zzYIF.zzR(iArr2, iArr3, iArr2);
    }

    public static boolean zzX(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        zzZ(bArr, 0, bArr2, 0, bArr3, i);
        return !zzYGU.zzp(bArr3, i, 56);
    }

    private static synchronized void zzXyF() {
        try {
            if (f50941cJ != null) {
                return;
            }
            int[] iArr = new int[7136];
            f50941cJ = iArr;
            int[] iArr2 = new int[7120];
            int[] iArr3 = new int[16];
            iArr3[0] = 5;
            int[] iArr4 = new int[16];
            iArr4[0] = 1;
            int[] iArr5 = new int[16];
            int[] iArr6 = new int[16];
            zzYIF.zzY(iArr3, iArr4, iArr5);
            zzYIF.zzO(iArr3, iArr4, iArr6);
            int[] iArr7 = new int[16];
            zzYIF.zzZ(iArr6, 0, iArr7, 0);
            int i = 0;
            while (true) {
                zzYIF.zzZ(iArr5, 0, iArr, i);
                if (i == 7120) {
                    break;
                }
                zzH(iArr3, iArr4);
                zzYIF.zzY(iArr3, iArr4, iArr5);
                zzYIF.zzO(iArr3, iArr4, iArr6);
                zzYIF.zzR(iArr5, iArr7, iArr5);
                zzYIF.zzR(iArr7, iArr6, iArr7);
                zzYIF.zzZ(iArr6, 0, iArr2, i);
                i += 16;
            }
            int[] iArr8 = new int[16];
            zzYIF.zzG(iArr7, iArr8);
            while (true) {
                zzYIF.zzZ(iArr, i, iArr3, 0);
                zzYIF.zzR(iArr3, iArr8, iArr3);
                zzYIF.zzZ(iArr3, 0, f50941cJ, i);
                if (i == 0) {
                    return;
                }
                i -= 16;
                zzYIF.zzZ(iArr2, i, iArr4, 0);
                zzYIF.zzR(iArr8, iArr4, iArr8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void zzZ(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 14; i2++) {
            iArr[i2] = zzZR(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    private static int zzZR(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void zzs(byte[] bArr, byte[] bArr2) {
        zzXyF();
        int[] iArr = new int[14];
        zzZ(bArr, 0, iArr);
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        zzYIF.zzZ(f50942cL, 0, iArr3, 0);
        int[] iArr4 = new int[16];
        iArr4[0] = 1;
        int[] iArr5 = new int[16];
        zzYIF.zzZ(f50940cI, 0, iArr5, 0);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        int[] iArr7 = new int[16];
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        while (true) {
            zzYIF.zzZ(f50941cJ, i, iArr2, 0);
            i += 16;
            int i4 = (iArr[i3 >>> 5] >>> (i3 & 31)) & 1;
            int i5 = i2 ^ i4;
            zzYIF.zzX(i5, iArr3, iArr5);
            zzYIF.zzX(i5, iArr4, iArr6);
            zzYIF.zzY(iArr3, iArr4, iArr7);
            zzYIF.zzO(iArr3, iArr4, iArr4);
            zzYIF.zzR(iArr2, iArr4, iArr2);
            zzYIF.zzZN(iArr7);
            zzYIF.zzY(iArr7, iArr2, iArr3);
            zzYIF.zzO(iArr7, iArr2, iArr4);
            zzYIF.zzE(iArr3, iArr3);
            zzYIF.zzE(iArr4, iArr4);
            zzYIF.zzR(iArr6, iArr3, iArr3);
            zzYIF.zzR(iArr5, iArr4, iArr4);
            i3++;
            if (i3 >= 448) {
                break;
            } else {
                i2 = i4;
            }
        }
        for (int i6 = 0; i6 < 2; i6++) {
            zzH(iArr3, iArr4);
        }
        zzYIF.zzG(iArr4, iArr4);
        zzYIF.zzR(iArr3, iArr4, iArr3);
        zzYIF.zzZL(iArr3);
        zzYIF.zzY(iArr3, bArr2, 0);
    }

    public static void zzZ(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | UnsignedBytes.MAX_POWER_OF_TWO);
    }

    private static void zzZ(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[14];
        zzZ(bArr, 0, iArr);
        int[] iArr2 = new int[16];
        zzYIF.zzY(bArr2, 0, iArr2);
        int[] iArr3 = new int[16];
        zzYIF.zzZ(iArr2, 0, iArr3, 0);
        int[] iArr4 = new int[16];
        iArr4[0] = 1;
        int[] iArr5 = new int[16];
        iArr5[0] = 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int i4 = 447;
        int i5 = 1;
        while (true) {
            zzYIF.zzY(iArr5, iArr6, iArr7);
            zzYIF.zzO(iArr5, iArr6, iArr5);
            zzYIF.zzY(iArr3, iArr4, iArr6);
            zzYIF.zzO(iArr3, iArr4, iArr3);
            zzYIF.zzR(iArr7, iArr3, iArr7);
            zzYIF.zzR(iArr5, iArr6, iArr5);
            zzYIF.zzE(iArr6, iArr6);
            zzYIF.zzE(iArr3, iArr3);
            zzYIF.zzO(iArr6, iArr3, iArr8);
            zzYIF.zzX(iArr8, 39082, iArr4);
            zzYIF.zzY(iArr4, iArr3, iArr4);
            zzYIF.zzR(iArr4, iArr8, iArr4);
            zzYIF.zzR(iArr3, iArr6, iArr3);
            zzYIF.zzO(iArr7, iArr5, iArr6);
            zzYIF.zzY(iArr7, iArr5, iArr5);
            zzYIF.zzE(iArr5, iArr5);
            zzYIF.zzE(iArr6, iArr6);
            zzYIF.zzR(iArr6, iArr2, iArr6);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            zzYIF.zzX(i7, iArr3, iArr5);
            zzYIF.zzX(i7, iArr4, iArr6);
            if (i4 < 2) {
                break;
            } else {
                i5 = i6;
            }
        }
        for (int i8 = 0; i8 < 2; i8++) {
            zzH(iArr3, iArr4);
        }
        zzYIF.zzG(iArr4, iArr4);
        zzYIF.zzR(iArr3, iArr4, iArr3);
        zzYIF.zzZL(iArr3);
        zzYIF.zzY(iArr3, bArr3, i3);
    }
}
