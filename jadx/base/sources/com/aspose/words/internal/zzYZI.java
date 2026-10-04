package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZI {
    private static final int[] zzWbh = zzYGN.zzZK(zzYGI.zzwb("expand 16-byte kexpand 32-byte k"), 0);

    public static void zzT(int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        int iZzUG = iArr[0];
        int i = iArr[1];
        int i2 = iArr[2];
        char c = 3;
        int i3 = iArr[3];
        char c2 = 4;
        int i4 = iArr[4];
        char c3 = 5;
        int i5 = iArr[5];
        char c4 = 6;
        int iZzUG2 = iArr[6];
        int i6 = 7;
        int i7 = iArr[7];
        int i8 = iArr[8];
        int i9 = 9;
        int i10 = iArr[9];
        int i11 = iArr[10];
        int iZzUG3 = iArr[11];
        int iZzUG4 = iArr[12];
        int i12 = 13;
        int iZzUG5 = iArr[13];
        int iZzUG6 = iArr[14];
        int iZzUG7 = iArr[15];
        int i13 = 8;
        while (i13 > 0) {
            char c5 = c;
            int iZzUG8 = zzUG(iZzUG + iZzUG4, i6) ^ i4;
            int iZzUG9 = i8 ^ zzUG(iZzUG8 + iZzUG, i9);
            char c6 = c2;
            int iZzUG10 = iZzUG4 ^ zzUG(iZzUG9 + iZzUG8, i12);
            char c7 = c3;
            char c8 = c4;
            int iZzUG11 = iZzUG ^ zzUG(iZzUG10 + iZzUG9, 18);
            int iZzUG12 = i10 ^ zzUG(i5 + i, i6);
            int iZzUG13 = iZzUG5 ^ zzUG(iZzUG12 + i5, i9);
            int iZzUG14 = zzUG(iZzUG13 + iZzUG12, i12) ^ i;
            int iZzUG15 = zzUG(iZzUG14 + iZzUG13, 18) ^ i5;
            int iZzUG16 = iZzUG6 ^ zzUG(i11 + iZzUG2, 7);
            int iZzUG17 = i2 ^ zzUG(iZzUG16 + i11, 9);
            int iZzUG18 = zzUG(iZzUG17 + iZzUG16, 13) ^ iZzUG2;
            int iZzUG19 = i11 ^ zzUG(iZzUG18 + iZzUG17, 18);
            int iZzUG20 = i3 ^ zzUG(iZzUG7 + iZzUG3, 7);
            int iZzUG21 = i7 ^ zzUG(iZzUG20 + iZzUG7, 9);
            int iZzUG22 = iZzUG3 ^ zzUG(iZzUG21 + iZzUG20, 13);
            int iZzUG23 = iZzUG7 ^ zzUG(iZzUG22 + iZzUG21, 18);
            int iZzUG24 = iZzUG14 ^ zzUG(iZzUG11 + iZzUG20, 7);
            int iZzUG25 = zzUG(iZzUG24 + iZzUG11, 9) ^ iZzUG17;
            int iZzUG26 = iZzUG20 ^ zzUG(iZzUG25 + iZzUG24, 13);
            iZzUG = iZzUG11 ^ zzUG(iZzUG26 + iZzUG25, 18);
            iZzUG2 = iZzUG18 ^ zzUG(iZzUG15 + iZzUG8, 7);
            int iZzUG27 = zzUG(iZzUG2 + iZzUG15, 9) ^ iZzUG21;
            int iZzUG28 = zzUG(iZzUG27 + iZzUG2, 13) ^ iZzUG8;
            int iZzUG29 = iZzUG15 ^ zzUG(iZzUG28 + iZzUG27, 18);
            iZzUG3 = iZzUG22 ^ zzUG(iZzUG19 + iZzUG12, 7);
            int iZzUG30 = zzUG(iZzUG3 + iZzUG19, 9) ^ iZzUG9;
            int iZzUG31 = zzUG(iZzUG30 + iZzUG3, 13) ^ iZzUG12;
            int iZzUG32 = zzUG(iZzUG31 + iZzUG30, 18) ^ iZzUG19;
            iZzUG4 = iZzUG10 ^ zzUG(iZzUG23 + iZzUG16, 7);
            iZzUG5 = iZzUG13 ^ zzUG(iZzUG4 + iZzUG23, 9);
            iZzUG6 = iZzUG16 ^ zzUG(iZzUG5 + iZzUG4, 13);
            iZzUG7 = iZzUG23 ^ zzUG(iZzUG6 + iZzUG5, 18);
            i13 -= 2;
            i7 = iZzUG27;
            i5 = iZzUG29;
            i8 = iZzUG30;
            i11 = iZzUG32;
            i = iZzUG24;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i6 = 7;
            i4 = iZzUG28;
            i10 = iZzUG31;
            i2 = iZzUG25;
            i3 = iZzUG26;
            i9 = 9;
            i12 = 13;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = iZzUG + iArr[0];
        iArr2[1] = i + iArr[1];
        iArr2[2] = i2 + iArr[2];
        iArr2[c9] = i3 + iArr[c9];
        iArr2[c10] = i4 + iArr[c10];
        iArr2[c11] = i5 + iArr[c11];
        iArr2[c12] = iZzUG2 + iArr[c12];
        iArr2[7] = i7 + iArr[7];
        iArr2[8] = i8 + iArr[8];
        iArr2[9] = i10 + iArr[9];
        iArr2[10] = i11 + iArr[10];
        iArr2[11] = iZzUG3 + iArr[11];
        iArr2[12] = iZzUG4 + iArr[12];
        iArr2[13] = iZzUG5 + iArr[13];
        iArr2[14] = iZzUG6 + iArr[14];
        iArr2[15] = iZzUG7 + iArr[15];
    }

    private static int zzUG(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }
}
