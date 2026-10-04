package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYHT {
    public static void zzK(int[] iArr, int[] iArr2) {
        zzYHX.zzK(iArr, iArr2);
        zzYHX.zzy(iArr, iArr2);
        int iZzz = zzYHX.zzz(iArr2, iArr2);
        int iZzZ = zzYHX.zzZ(iArr2, 24, iArr2, 16, zzYHX.zzZ(iArr2, 0, iArr2, 8, 0) + iZzz) + iZzz;
        int[] iArr3 = new int[8];
        zzYHX.zzH(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        zzYHX.zzK(iArr3, iArr4);
        zzYI2.zzY(32, zzYI2.zzX(16, iArr4, iArr2, 8) + iZzZ, iArr2, 24);
    }

    public static void zzR(int[] iArr, int[] iArr2, int[] iArr3) {
        zzYHX.zzR(iArr, iArr2, iArr3);
        zzYHX.zzZ(iArr, iArr2, iArr3, 16);
        int iZzz = zzYHX.zzz(iArr3, iArr3);
        int iZzZ = zzYHX.zzZ(iArr3, 24, iArr3, 16, zzYHX.zzZ(iArr3, 0, iArr3, 8, 0) + iZzz) + iZzz;
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        boolean z = zzYHX.zzH(iArr, iArr, iArr4) != zzYHX.zzH(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[16];
        zzYHX.zzR(iArr4, iArr5, iArr6);
        zzYI2.zzY(32, iZzZ + (z ? zzYI2.zzZ(16, iArr6, iArr3, 8) : zzYI2.zzX(16, iArr6, iArr3, 8)), iArr3, 24);
    }
}
