package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWG implements zzYV8 {
    private static byte[] zzW3R = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, PatternStyle.Sphere, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, PatternStyle.Vertical, -67, -113, SignedBytes.MAX_POWER_OF_TWO, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, PatternStyle.Wave, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, PatternStyle.Shingle, -56, 102, 30, -41, 8, -24, -22, -34, UnsignedBytes.MAX_POWER_OF_TWO, 82, -18, -9, -124, -86, 114, -84, PatternStyle.UpwardDiagonal, 77, 106, PatternStyle.Plaid, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, PatternStyle.DiagonalCross, 91, 37, 85, -105, PatternStyle.Horizontal, PatternStyle.DottedGrid, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, PatternStyle.Weave, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, PatternStyle.DownwardDiagonal, 27, -85, PatternStyle.Cross, -1, -80, -69, 72, 12, 95, -71, -79, -51, PatternStyle.Divot, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Ascii.DEL, -63, -83};
    private int[] zzW8f;
    private boolean zzWap;

    private static int[] zz3(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                i3 = zzW3R[(i3 + iArr[i4]) & 255] & 255;
                int i6 = length + 1;
                iArr[length] = i3;
                if (i6 >= 128) {
                    break;
                }
                length = i6;
                i4 = i5;
            }
        }
        int i7 = (i + 7) >> 3;
        int i8 = 128 - i7;
        int i9 = zzW3R[(255 >> ((-i) & 7)) & iArr[i8]] & 255;
        iArr[i8] = i9;
        for (int i10 = 127 - i7; i10 >= 0; i10--) {
            i9 = zzW3R[i9 ^ iArr[i10 + i7]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            int i12 = i11 * 2;
            iArr2[i11] = iArr[i12] + (iArr[i12 + 1] << 8);
        }
        return iArr2;
    }

    private static int zzUz(int i, int i2) {
        int i3 = i & 65535;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    private void zzV(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iZzUz = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iZzUz2 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int iZzUz3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iZzUz4 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i3 = 60; i3 >= 44; i3 -= 4) {
            iZzUz = zzUz(iZzUz, 11) - ((((~iZzUz2) & iZzUz4) + (iZzUz3 & iZzUz2)) + this.zzW8f[i3 + 3]);
            iZzUz2 = zzUz(iZzUz2, 13) - ((((~iZzUz3) & iZzUz) + (iZzUz4 & iZzUz3)) + this.zzW8f[i3 + 2]);
            iZzUz3 = zzUz(iZzUz3, 14) - ((((~iZzUz4) & iZzUz2) + (iZzUz & iZzUz4)) + this.zzW8f[i3 + 1]);
            iZzUz4 = zzUz(iZzUz4, 15) - ((((~iZzUz) & iZzUz3) + (iZzUz2 & iZzUz)) + this.zzW8f[i3]);
        }
        int[] iArr = this.zzW8f;
        int iZzUz5 = iZzUz - iArr[iZzUz2 & 63];
        int iZzUz6 = iZzUz2 - iArr[iZzUz3 & 63];
        int iZzUz7 = iZzUz3 - iArr[iZzUz4 & 63];
        int iZzUz8 = iZzUz4 - iArr[iZzUz5 & 63];
        for (int i4 = 40; i4 >= 20; i4 -= 4) {
            iZzUz5 = zzUz(iZzUz5, 11) - ((((~iZzUz6) & iZzUz8) + (iZzUz7 & iZzUz6)) + this.zzW8f[i4 + 3]);
            iZzUz6 = zzUz(iZzUz6, 13) - ((((~iZzUz7) & iZzUz5) + (iZzUz8 & iZzUz7)) + this.zzW8f[i4 + 2]);
            iZzUz7 = zzUz(iZzUz7, 14) - ((((~iZzUz8) & iZzUz6) + (iZzUz5 & iZzUz8)) + this.zzW8f[i4 + 1]);
            iZzUz8 = zzUz(iZzUz8, 15) - ((((~iZzUz5) & iZzUz7) + (iZzUz6 & iZzUz5)) + this.zzW8f[i4]);
        }
        int[] iArr2 = this.zzW8f;
        int iZzUz9 = iZzUz5 - iArr2[iZzUz6 & 63];
        int iZzUz10 = iZzUz6 - iArr2[iZzUz7 & 63];
        int iZzUz11 = iZzUz7 - iArr2[iZzUz8 & 63];
        int iZzUz12 = iZzUz8 - iArr2[iZzUz9 & 63];
        for (int i5 = 16; i5 >= 0; i5 -= 4) {
            iZzUz9 = zzUz(iZzUz9, 11) - ((((~iZzUz10) & iZzUz12) + (iZzUz11 & iZzUz10)) + this.zzW8f[i5 + 3]);
            iZzUz10 = zzUz(iZzUz10, 13) - ((((~iZzUz11) & iZzUz9) + (iZzUz12 & iZzUz11)) + this.zzW8f[i5 + 2]);
            iZzUz11 = zzUz(iZzUz11, 14) - ((((~iZzUz12) & iZzUz10) + (iZzUz9 & iZzUz12)) + this.zzW8f[i5 + 1]);
            iZzUz12 = zzUz(iZzUz12, 15) - ((((~iZzUz9) & iZzUz11) + (iZzUz10 & iZzUz9)) + this.zzW8f[i5]);
        }
        bArr2[i2] = (byte) iZzUz12;
        bArr2[i2 + 1] = (byte) (iZzUz12 >> 8);
        bArr2[i2 + 2] = (byte) iZzUz11;
        bArr2[i2 + 3] = (byte) (iZzUz11 >> 8);
        bArr2[i2 + 4] = (byte) iZzUz10;
        bArr2[i2 + 5] = (byte) (iZzUz10 >> 8);
        bArr2[i2 + 6] = (byte) iZzUz9;
        bArr2[i2 + 7] = (byte) (iZzUz9 >> 8);
    }

    private void zzW(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iZzUz = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iZzUz2 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int iZzUz3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iZzUz4 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i3 = 0; i3 <= 16; i3 += 4) {
            iZzUz4 = zzUz(iZzUz4 + ((~iZzUz) & iZzUz3) + (iZzUz2 & iZzUz) + this.zzW8f[i3], 1);
            iZzUz3 = zzUz(iZzUz3 + ((~iZzUz4) & iZzUz2) + (iZzUz & iZzUz4) + this.zzW8f[i3 + 1], 2);
            iZzUz2 = zzUz(iZzUz2 + ((~iZzUz3) & iZzUz) + (iZzUz4 & iZzUz3) + this.zzW8f[i3 + 2], 3);
            iZzUz = zzUz(iZzUz + ((~iZzUz2) & iZzUz4) + (iZzUz3 & iZzUz2) + this.zzW8f[i3 + 3], 5);
        }
        int[] iArr = this.zzW8f;
        int iZzUz5 = iZzUz4 + iArr[iZzUz & 63];
        int iZzUz6 = iZzUz3 + iArr[iZzUz5 & 63];
        int iZzUz7 = iZzUz2 + iArr[iZzUz6 & 63];
        int iZzUz8 = iZzUz + iArr[iZzUz7 & 63];
        for (int i4 = 20; i4 <= 40; i4 += 4) {
            iZzUz5 = zzUz(iZzUz5 + ((~iZzUz8) & iZzUz6) + (iZzUz7 & iZzUz8) + this.zzW8f[i4], 1);
            iZzUz6 = zzUz(iZzUz6 + ((~iZzUz5) & iZzUz7) + (iZzUz8 & iZzUz5) + this.zzW8f[i4 + 1], 2);
            iZzUz7 = zzUz(iZzUz7 + ((~iZzUz6) & iZzUz8) + (iZzUz5 & iZzUz6) + this.zzW8f[i4 + 2], 3);
            iZzUz8 = zzUz(iZzUz8 + ((~iZzUz7) & iZzUz5) + (iZzUz6 & iZzUz7) + this.zzW8f[i4 + 3], 5);
        }
        int[] iArr2 = this.zzW8f;
        int iZzUz9 = iZzUz5 + iArr2[iZzUz8 & 63];
        int iZzUz10 = iZzUz6 + iArr2[iZzUz9 & 63];
        int iZzUz11 = iZzUz7 + iArr2[iZzUz10 & 63];
        int iZzUz12 = iZzUz8 + iArr2[iZzUz11 & 63];
        for (int i5 = 44; i5 < 64; i5 += 4) {
            iZzUz9 = zzUz(iZzUz9 + ((~iZzUz12) & iZzUz10) + (iZzUz11 & iZzUz12) + this.zzW8f[i5], 1);
            iZzUz10 = zzUz(iZzUz10 + ((~iZzUz9) & iZzUz11) + (iZzUz12 & iZzUz9) + this.zzW8f[i5 + 1], 2);
            iZzUz11 = zzUz(iZzUz11 + ((~iZzUz10) & iZzUz12) + (iZzUz9 & iZzUz10) + this.zzW8f[i5 + 2], 3);
            iZzUz12 = zzUz(iZzUz12 + ((~iZzUz11) & iZzUz9) + (iZzUz10 & iZzUz11) + this.zzW8f[i5 + 3], 5);
        }
        bArr2[i2] = (byte) iZzUz9;
        bArr2[i2 + 1] = (byte) (iZzUz9 >> 8);
        bArr2[i2 + 2] = (byte) iZzUz10;
        bArr2[i2 + 3] = (byte) (iZzUz10 >> 8);
        bArr2[i2 + 4] = (byte) iZzUz11;
        bArr2[i2 + 5] = (byte) (iZzUz11 >> 8);
        bArr2[i2 + 6] = (byte) iZzUz12;
        bArr2[i2 + 7] = (byte) (iZzUz12 >> 8);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "RC2";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.zzW8f == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        if (this.zzWap) {
            zzW(bArr, i, bArr2, i2);
            return 8;
        }
        zzV(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzWap = z;
        if (zzyv3 instanceof zzYWF) {
            zzYWF zzywf = (zzYWF) zzyv3;
            this.zzW8f = zz3(zzywf.getKey(), zzywf.getEffectiveKeyBits());
        } else {
            if (!(zzyv3 instanceof zzYS8)) {
                throw new IllegalArgumentException("invalid parameter passed to RC2 init - ".concat(zzyv3.getClass().getName()));
            }
            byte[] key = ((zzYS8) zzyv3).getKey();
            this.zzW8f = zz3(key, key.length * 8);
        }
    }
}
