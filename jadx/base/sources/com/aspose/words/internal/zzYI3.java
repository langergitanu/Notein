package com.aspose.words.internal;

import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYI3 {
    public static void zzN(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (zzYI2.zzH(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int iZzZ = 0;
        if (zzYI2.zzI(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrZzJ = zzYI2.zzJ(length, iArr2);
        int[] iArr4 = new int[length];
        iArr4[0] = 1;
        int iZzZ2 = (1 & iArrZzJ[0]) == 0 ? zzZ(iArr, iArrZzJ, length, iArr4, 0) : 0;
        if (zzYI2.zzI(length, iArrZzJ)) {
            zzZ(iArr, iZzZ2, iArr4, iArr3);
            return;
        }
        int[] iArrZzJ2 = zzYI2.zzJ(length, iArr);
        int[] iArr5 = new int[length];
        int i = length;
        while (true) {
            int i2 = i - 1;
            if (iArrZzJ[i2] == 0 && iArrZzJ2[i2] == 0) {
                i--;
            } else if (zzYI2.zzU(i, iArrZzJ, iArrZzJ2)) {
                zzYI2.zzR(i, iArrZzJ2, iArrZzJ);
                iZzZ2 = zzZ(iArr, iArrZzJ, i, iArr4, (zzYI2.zzR(length, iArr5, iArr4) - iZzZ) + iZzZ2);
                if (zzYI2.zzI(i, iArrZzJ)) {
                    zzZ(iArr, iZzZ2, iArr4, iArr3);
                    return;
                }
            } else {
                zzYI2.zzR(i, iArrZzJ, iArrZzJ2);
                iZzZ = zzZ(iArr, iArrZzJ2, i, iArr5, (zzYI2.zzR(length, iArr4, iArr5) - iZzZ2) + iZzZ);
                if (zzYI2.zzI(i, iArrZzJ2)) {
                    zzZ(iArr, iZzZ, iArr5, iArr3);
                    return;
                }
            }
        }
    }

    private static void zzZ(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            zzYI2.zzZ(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static int[] zzZG(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArr2 = new int[length];
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                iArr2[i8] = random.nextInt();
            }
            iArr2[i] = iArr2[i] & i7;
        } while (zzYI2.zzU(length, iArr2, iArr));
        return iArr2;
    }

    private static int zzeD(int i) {
        int i2 = 0;
        while ((i & 1) == 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    private static int zzZ(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3;
        int iZzR;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            zzYI2.zzU(i, iArr2, 0);
            i4 += 32;
        }
        int iZzeD = zzeD(i3);
        if (iZzeD > 0) {
            zzYI2.zzY(i, iArr2, iZzeD, 0);
            i4 += iZzeD;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if ((iArr3[0] & 1) != 0) {
                if (i2 < 0) {
                    iZzR = zzYI2.zzW(length, iArr, iArr3);
                } else {
                    iZzR = zzYI2.zzR(length, iArr, iArr3);
                }
                i2 = iZzR + i2;
            }
            zzYI2.zzV(length, iArr3, i2);
        }
        return i2;
    }
}
