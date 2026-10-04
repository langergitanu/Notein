package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYII {

    /* JADX INFO: renamed from: cI */
    private static final int[] f50944cI = {64258704, 46628941, 18905110, 42949224, 8920788, 10663709, 35115447, 21804323, 8973338, 4366948};

    /* JADX INFO: renamed from: cJ */
    private static int[] f50945cJ = null;

    private static void zzH(int[] iArr, int[] iArr2) {
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        zzYIH.zzY(iArr, iArr2, iArrZzXyE, iArrZzXyE2);
        zzYIH.zzE(iArrZzXyE, iArrZzXyE);
        zzYIH.zzE(iArrZzXyE2, iArrZzXyE2);
        zzYIH.zzR(iArrZzXyE, iArrZzXyE2, iArr);
        zzYIH.zzO(iArrZzXyE, iArrZzXyE2, iArrZzXyE);
        zzYIH.zzF(iArrZzXyE, iArr2);
        zzYIH.zzY(iArr2, iArrZzXyE2, iArr2);
        zzYIH.zzR(iArr2, iArrZzXyE, iArr2);
    }

    public static boolean zzX(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        zzZ(bArr, 0, bArr2, 0, bArr3, i);
        return !zzYGU.zzp(bArr3, i, 32);
    }

    private static synchronized void zzXyF() {
        try {
            if (f50945cJ != null) {
                return;
            }
            int[] iArr = new int[2520];
            f50945cJ = iArr;
            int[] iArr2 = new int[2510];
            int[] iArrZzXyE = zzYIH.zzXyE();
            iArrZzXyE[0] = 9;
            int[] iArrZzXyE2 = zzYIH.zzXyE();
            iArrZzXyE2[0] = 1;
            int[] iArrZzXyE3 = zzYIH.zzXyE();
            int[] iArrZzXyE4 = zzYIH.zzXyE();
            zzYIH.zzY(iArrZzXyE, iArrZzXyE2, iArrZzXyE3, iArrZzXyE4);
            int[] iArrZzXyE5 = zzYIH.zzXyE();
            zzYIH.zzZ(iArrZzXyE4, 0, iArrZzXyE5, 0);
            int i = 0;
            while (true) {
                zzYIH.zzZ(iArrZzXyE3, 0, iArr, i);
                if (i == 2510) {
                    break;
                }
                zzH(iArrZzXyE, iArrZzXyE2);
                zzYIH.zzY(iArrZzXyE, iArrZzXyE2, iArrZzXyE3, iArrZzXyE4);
                zzYIH.zzR(iArrZzXyE3, iArrZzXyE5, iArrZzXyE3);
                zzYIH.zzR(iArrZzXyE5, iArrZzXyE4, iArrZzXyE5);
                zzYIH.zzZ(iArrZzXyE4, 0, iArr2, i);
                i += 10;
            }
            int[] iArrZzXyE6 = zzYIH.zzXyE();
            zzYIH.zzG(iArrZzXyE5, iArrZzXyE6);
            while (true) {
                zzYIH.zzZ(iArr, i, iArrZzXyE, 0);
                zzYIH.zzR(iArrZzXyE, iArrZzXyE6, iArrZzXyE);
                zzYIH.zzZ(iArrZzXyE, 0, f50945cJ, i);
                if (i == 0) {
                    return;
                }
                i -= 10;
                zzYIH.zzZ(iArr2, i, iArrZzXyE2, 0);
                zzYIH.zzR(iArrZzXyE6, iArrZzXyE2, iArrZzXyE6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void zzZ(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = zzZR(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & (-8);
        int i3 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i3;
        iArr[7] = i3 | 1073741824;
    }

    private static int zzZR(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void zzs(byte[] bArr, byte[] bArr2) {
        zzXyF();
        int[] iArr = new int[8];
        zzZ(bArr, 0, iArr);
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        iArrZzXyE2[0] = 1;
        int[] iArrZzXyE3 = zzYIH.zzXyE();
        iArrZzXyE3[0] = 1;
        int[] iArrZzXyE4 = zzYIH.zzXyE();
        zzYIH.zzZ(f50944cI, 0, iArrZzXyE4, 0);
        int[] iArrZzXyE5 = zzYIH.zzXyE();
        iArrZzXyE5[0] = 1;
        int i = 0;
        int i2 = 1;
        int i3 = 3;
        while (true) {
            zzYIH.zzZ(f50945cJ, i, iArrZzXyE, 0);
            i += 10;
            int i4 = (iArr[i3 >>> 5] >>> (i3 & 31)) & 1;
            int i5 = i2 ^ i4;
            zzYIH.zzX(i5, iArrZzXyE2, iArrZzXyE4);
            zzYIH.zzX(i5, iArrZzXyE3, iArrZzXyE5);
            zzYIH.zzY(iArrZzXyE2, iArrZzXyE3, iArrZzXyE2, iArrZzXyE3);
            zzYIH.zzR(iArrZzXyE, iArrZzXyE3, iArrZzXyE);
            zzYIH.zzZN(iArrZzXyE2);
            zzYIH.zzY(iArrZzXyE2, iArrZzXyE, iArrZzXyE2, iArrZzXyE3);
            zzYIH.zzE(iArrZzXyE2, iArrZzXyE2);
            zzYIH.zzE(iArrZzXyE3, iArrZzXyE3);
            zzYIH.zzR(iArrZzXyE5, iArrZzXyE2, iArrZzXyE2);
            zzYIH.zzR(iArrZzXyE4, iArrZzXyE3, iArrZzXyE3);
            i3++;
            if (i3 >= 255) {
                break;
            } else {
                i2 = i4;
            }
        }
        for (int i6 = 0; i6 < 3; i6++) {
            zzH(iArrZzXyE2, iArrZzXyE3);
        }
        zzYIH.zzG(iArrZzXyE3, iArrZzXyE3);
        zzYIH.zzR(iArrZzXyE2, iArrZzXyE3, iArrZzXyE2);
        zzYIH.zzZL(iArrZzXyE2);
        zzYIH.zzY(iArrZzXyE2, bArr2, 0);
    }

    public static void zzZ(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Ascii.DEL);
        bArr[31] = b;
        bArr[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
    }

    private static void zzZ(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[8];
        zzZ(bArr, 0, iArr);
        int[] iArrZzXyE = zzYIH.zzXyE();
        zzYIH.zzY(bArr2, 0, iArrZzXyE);
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        zzYIH.zzZ(iArrZzXyE, 0, iArrZzXyE2, 0);
        int[] iArrZzXyE3 = zzYIH.zzXyE();
        iArrZzXyE3[0] = 1;
        int[] iArrZzXyE4 = zzYIH.zzXyE();
        iArrZzXyE4[0] = 1;
        int[] iArrZzXyE5 = zzYIH.zzXyE();
        int[] iArrZzXyE6 = zzYIH.zzXyE();
        int[] iArrZzXyE7 = zzYIH.zzXyE();
        int i4 = StyleIdentifier.MEDIUM_GRID_2_ACCENT_6;
        int i5 = 1;
        while (true) {
            zzYIH.zzY(iArrZzXyE4, iArrZzXyE5, iArrZzXyE6, iArrZzXyE4);
            zzYIH.zzY(iArrZzXyE2, iArrZzXyE3, iArrZzXyE5, iArrZzXyE2);
            zzYIH.zzR(iArrZzXyE6, iArrZzXyE2, iArrZzXyE6);
            zzYIH.zzR(iArrZzXyE4, iArrZzXyE5, iArrZzXyE4);
            zzYIH.zzE(iArrZzXyE5, iArrZzXyE5);
            zzYIH.zzE(iArrZzXyE2, iArrZzXyE2);
            zzYIH.zzO(iArrZzXyE5, iArrZzXyE2, iArrZzXyE7);
            zzYIH.zzF(iArrZzXyE7, iArrZzXyE3);
            zzYIH.zzY(iArrZzXyE3, iArrZzXyE2, iArrZzXyE3);
            zzYIH.zzR(iArrZzXyE3, iArrZzXyE7, iArrZzXyE3);
            zzYIH.zzR(iArrZzXyE2, iArrZzXyE5, iArrZzXyE2);
            zzYIH.zzY(iArrZzXyE6, iArrZzXyE4, iArrZzXyE4, iArrZzXyE5);
            zzYIH.zzE(iArrZzXyE4, iArrZzXyE4);
            zzYIH.zzE(iArrZzXyE5, iArrZzXyE5);
            zzYIH.zzR(iArrZzXyE5, iArrZzXyE, iArrZzXyE5);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            zzYIH.zzX(i7, iArrZzXyE2, iArrZzXyE4);
            zzYIH.zzX(i7, iArrZzXyE3, iArrZzXyE5);
            if (i4 < 3) {
                break;
            } else {
                i5 = i6;
            }
        }
        for (int i8 = 0; i8 < 3; i8++) {
            zzH(iArrZzXyE2, iArrZzXyE3);
        }
        zzYIH.zzG(iArrZzXyE3, iArrZzXyE3);
        zzYIH.zzR(iArrZzXyE2, iArrZzXyE3, iArrZzXyE2);
        zzYIH.zzZL(iArrZzXyE2);
        zzYIH.zzY(iArrZzXyE2, bArr3, i3);
    }
}
