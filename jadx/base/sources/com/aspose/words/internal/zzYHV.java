package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYHV {
    public static void zzK(int[] iArr, int[] iArr2) {
        zzYHZ.zzK(iArr, iArr2);
        zzYHZ.zzy(iArr, iArr2);
        int iZzz = zzYHZ.zzz(iArr2, iArr2);
        int iZzZ = zzYHZ.zzZ(iArr2, 18, iArr2, 12, zzYHZ.zzZ(iArr2, 0, iArr2, 6, 0) + iZzz) + iZzz;
        int[] iArr3 = new int[6];
        zzYHZ.zzH(iArr, iArr, iArr3);
        int[] iArr4 = new int[12];
        zzYHZ.zzK(iArr3, iArr4);
        zzYI2.zzY(24, zzYI2.zzX(12, iArr4, iArr2, 6) + iZzZ, iArr2, 18);
    }

    public static void zzR(int[] iArr, int[] iArr2, int[] iArr3) {
        zzYHZ.zzR(iArr, iArr2, iArr3);
        zzYHZ.zzZ(iArr, iArr2, iArr3, 12);
        int iZzz = zzYHZ.zzz(iArr3, iArr3);
        int iZzZ = zzYHZ.zzZ(iArr3, 18, iArr3, 12, zzYHZ.zzZ(iArr3, 0, iArr3, 6, 0) + iZzz) + iZzz;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = zzYHZ.zzH(iArr, iArr, iArr4) != zzYHZ.zzH(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        zzYHZ.zzR(iArr4, iArr5, iArr6);
        zzYI2.zzY(24, iZzZ + (z ? zzYI2.zzZ(12, iArr6, iArr3, 6) : zzYI2.zzX(12, iArr6, iArr3, 6)), iArr3, 18);
    }
}
