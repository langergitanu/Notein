package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZ1 extends zzYW1 {
    private static void zzZ(int i, int[] iArr, int[] iArr2) {
        int i2 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        char c = 3;
        int i6 = iArr[3];
        char c2 = 4;
        int i7 = iArr[4];
        char c3 = 5;
        int i8 = iArr[5];
        char c4 = 6;
        int i9 = iArr[6];
        int i10 = 7;
        int i11 = iArr[7];
        int i12 = 8;
        int i13 = iArr[8];
        int i14 = iArr[9];
        int i15 = iArr[10];
        int i16 = iArr[11];
        int i17 = 12;
        int i18 = iArr[12];
        int i19 = iArr[13];
        int i20 = iArr[14];
        int iZzUG = iArr[15];
        int iZzUG2 = i20;
        int iZzUG3 = i19;
        int iZzUG4 = i18;
        int i21 = i16;
        int i22 = i15;
        int i23 = i14;
        int i24 = i13;
        int iZzUG5 = i11;
        int iZzUG6 = i9;
        int iZzUG7 = i8;
        int iZzUG8 = i7;
        int i25 = i6;
        int i26 = i5;
        int i27 = i4;
        int i28 = i3;
        int i29 = i;
        while (i29 > 0) {
            int i30 = i28 + iZzUG8;
            char c5 = c;
            int iZzUG9 = zzYW1.zzUG(iZzUG4 ^ i30, i2);
            int i31 = i24 + iZzUG9;
            int iZzUG10 = zzYW1.zzUG(iZzUG8 ^ i31, i17);
            int i32 = i30 + iZzUG10;
            int iZzUG11 = zzYW1.zzUG(iZzUG9 ^ i32, i12);
            int i33 = i31 + iZzUG11;
            int iZzUG12 = zzYW1.zzUG(iZzUG10 ^ i33, i10);
            int i34 = i27 + iZzUG7;
            char c6 = c2;
            int iZzUG13 = zzYW1.zzUG(iZzUG3 ^ i34, i2);
            int i35 = i23 + iZzUG13;
            char c7 = c3;
            int iZzUG14 = zzYW1.zzUG(iZzUG7 ^ i35, i17);
            int i36 = i34 + iZzUG14;
            int iZzUG15 = zzYW1.zzUG(iZzUG13 ^ i36, i12);
            int i37 = i35 + iZzUG15;
            int iZzUG16 = zzYW1.zzUG(iZzUG14 ^ i37, i10);
            int i38 = i26 + iZzUG6;
            char c8 = c4;
            int iZzUG17 = zzYW1.zzUG(iZzUG2 ^ i38, i2);
            int i39 = i22 + iZzUG17;
            int iZzUG18 = zzYW1.zzUG(iZzUG6 ^ i39, i17);
            int i40 = i38 + iZzUG18;
            int iZzUG19 = zzYW1.zzUG(iZzUG17 ^ i40, i12);
            int i41 = i39 + iZzUG19;
            int iZzUG20 = zzYW1.zzUG(iZzUG18 ^ i41, i10);
            int i42 = i25 + iZzUG5;
            int iZzUG21 = zzYW1.zzUG(iZzUG ^ i42, 16);
            int i43 = i21 + iZzUG21;
            int iZzUG22 = zzYW1.zzUG(iZzUG5 ^ i43, i17);
            int i44 = i42 + iZzUG22;
            int iZzUG23 = zzYW1.zzUG(iZzUG21 ^ i44, 8);
            int i45 = i43 + iZzUG23;
            int iZzUG24 = zzYW1.zzUG(iZzUG22 ^ i45, 7);
            int i46 = i32 + iZzUG16;
            int iZzUG25 = zzYW1.zzUG(iZzUG23 ^ i46, 16);
            int i47 = i41 + iZzUG25;
            int iZzUG26 = zzYW1.zzUG(iZzUG16 ^ i47, 12);
            i28 = i46 + iZzUG26;
            iZzUG = zzYW1.zzUG(iZzUG25 ^ i28, 8);
            i22 = i47 + iZzUG;
            iZzUG7 = zzYW1.zzUG(iZzUG26 ^ i22, 7);
            int i48 = i36 + iZzUG20;
            int iZzUG27 = zzYW1.zzUG(iZzUG11 ^ i48, 16);
            int i49 = i45 + iZzUG27;
            int iZzUG28 = zzYW1.zzUG(iZzUG20 ^ i49, 12);
            i27 = i48 + iZzUG28;
            iZzUG4 = zzYW1.zzUG(iZzUG27 ^ i27, 8);
            i21 = i49 + iZzUG4;
            iZzUG6 = zzYW1.zzUG(iZzUG28 ^ i21, 7);
            int i50 = i40 + iZzUG24;
            int iZzUG29 = zzYW1.zzUG(iZzUG15 ^ i50, 16);
            int i51 = i33 + iZzUG29;
            int iZzUG30 = zzYW1.zzUG(iZzUG24 ^ i51, 12);
            i26 = i50 + iZzUG30;
            iZzUG3 = zzYW1.zzUG(iZzUG29 ^ i26, 8);
            i24 = i51 + iZzUG3;
            iZzUG5 = zzYW1.zzUG(iZzUG30 ^ i24, 7);
            int i52 = i44 + iZzUG12;
            int iZzUG31 = zzYW1.zzUG(iZzUG19 ^ i52, 16);
            int i53 = i37 + iZzUG31;
            int iZzUG32 = zzYW1.zzUG(iZzUG12 ^ i53, 12);
            i25 = i52 + iZzUG32;
            iZzUG2 = zzYW1.zzUG(iZzUG31 ^ i25, 8);
            i23 = i53 + iZzUG2;
            iZzUG8 = zzYW1.zzUG(iZzUG32 ^ i23, 7);
            i29 -= 2;
            i2 = 16;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i10 = 7;
            i12 = 8;
            i17 = 12;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = i28 + iArr[0];
        iArr2[1] = i27 + iArr[1];
        iArr2[2] = i26 + iArr[2];
        iArr2[c9] = i25 + iArr[c9];
        iArr2[c10] = iZzUG8 + iArr[c10];
        iArr2[c11] = iZzUG7 + iArr[c11];
        iArr2[c12] = iZzUG6 + iArr[c12];
        iArr2[7] = iZzUG5 + iArr[7];
        iArr2[8] = i24 + iArr[8];
        iArr2[9] = i23 + iArr[9];
        iArr2[10] = i22 + iArr[10];
        iArr2[11] = i21 + iArr[11];
        iArr2[12] = iZzUG4 + iArr[12];
        iArr2[13] = iZzUG3 + iArr[13];
        iArr2[14] = iZzUG2 + iArr[14];
        iArr2[15] = iZzUG + iArr[15];
    }

    @Override // com.aspose.words.internal.zzYW1
    public final void zzA(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzXGi(), " requires 256 bit key"));
            }
            zzYW1.zzR(bArr.length, this.zzW2j);
            zzYGN.zzZ(bArr, 0, this.zzW2j, 4, 8);
        }
        zzYGN.zzZ(bArr2, 0, this.zzW2j, 13, 3);
    }

    @Override // com.aspose.words.internal.zzYW1
    public final void zzWI(byte[] bArr) {
        zzZ(this.zzW2k, this.zzW2j, this.zzW2i);
        zzYGN.zzW(this.zzW2i, bArr, 0);
    }

    @Override // com.aspose.words.internal.zzYW1
    public final void zzXDK() {
        this.zzW2j[12] = 0;
    }

    @Override // com.aspose.words.internal.zzYW1
    public final void zzXDL() {
        int[] iArr = this.zzW2j;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // com.aspose.words.internal.zzYW1
    public final int zzXDM() {
        return 12;
    }

    @Override // com.aspose.words.internal.zzYW1, com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "ChaCha7539-" + this.zzW2k;
    }
}
