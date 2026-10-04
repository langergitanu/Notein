package com.aspose.words.internal;

import android.R;
import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.PatternStyle;
import com.aspose.words.StyleIdentifier;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVP implements zzYV8 {
    private static final byte[][] zzW09 = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, UnsignedBytes.MAX_POWER_OF_TWO, 120, -28, -35, -47, 56, 13, -58, PatternStyle.UpwardDiagonal, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, PatternStyle.Wave, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, PatternStyle.Divot, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, PatternStyle.Weave, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, PatternStyle.Cross, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, PatternStyle.Horizontal, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, PatternStyle.DottedGrid, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, PatternStyle.Plaid, -50, -53, PatternStyle.Shingle, -4, -105, 5, 122, -84, Ascii.DEL, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, PatternStyle.DownwardDiagonal, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, PatternStyle.Sphere, SignedBytes.MAX_POWER_OF_TWO, -36, -2, PatternStyle.Vertical, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, PatternStyle.DiagonalCross, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, PatternStyle.Vertical, -40, -3, 55, 113, -15, -31, PatternStyle.Wave, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, UnsignedBytes.MAX_POWER_OF_TWO, 93, -46, -43, -96, -124, 7, 20, -75, -112, PatternStyle.Weave, -93, -78, 115, 76, 84, -110, 116, PatternStyle.DiagonalCross, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, SignedBytes.MAX_POWER_OF_TWO, -25, PatternStyle.Sphere, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, PatternStyle.Cross, 38, 95, -20, 118, PatternStyle.Plaid, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, PatternStyle.Horizontal, -117, 1, 24, 35, -35, 31, 78, PatternStyle.DottedGrid, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Ascii.DEL, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, PatternStyle.Divot, -84, 21, 89, -88, 10, -98, 110, 71, -33, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, PatternStyle.Shingle, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private int[] zzW03;
    private int[] zzW04;
    private boolean zzWap = false;
    private int[] zzW08 = new int[256];
    private int[] zzW07 = new int[256];
    private int[] zzW06 = new int[256];
    private int[] zzW05 = new int[256];
    private int zzW02 = 0;
    private byte[] zzWaY = null;

    public zzYVP() {
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = zzW09;
            int i2 = bArr[0][i] & 255;
            int iZzfc = (zzfc(i2) ^ i2) & 255;
            int iZzfb = zzfb(i2) & 255;
            int i3 = bArr[1][i] & 255;
            int[] iArr = {i2, i3};
            int[] iArr2 = {iZzfc, (zzfc(i3) ^ i3) & 255};
            int[] iArr3 = {iZzfb, zzfb(i3) & 255};
            int[] iArr4 = this.zzW08;
            int i4 = iArr[1] | (iArr2[1] << 8);
            int i5 = iArr3[1];
            iArr4[i] = i4 | (i5 << 16) | (i5 << 24);
            int[] iArr5 = this.zzW07;
            int i6 = iArr3[0];
            iArr5[i] = i6 | (i6 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.zzW06;
            int i7 = iArr2[1];
            int i8 = iArr3[1];
            iArr6[i] = (iArr[1] << 16) | i7 | (i8 << 8) | (i8 << 24);
            int[] iArr7 = this.zzW05;
            int i9 = iArr2[0];
            iArr7[i] = (iArr3[0] << 16) | (iArr[0] << 8) | i9 | (i9 << 24);
        }
    }

    private static int zz1(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private int zzQ(int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i & 255;
        int iZzfa = zzfa(i);
        int iZzf9 = zzf9(i);
        int iZzf8 = zzf8(i);
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = this.zzW02 & 3;
        if (i9 != 0) {
            if (i9 == 1) {
                int[] iArr2 = this.zzW08;
                byte[][] bArr = zzW09;
                byte[] bArr2 = bArr[0];
                i2 = (iArr2[(bArr2[i4] & 255) ^ (i5 & 255)] ^ this.zzW07[(bArr2[iZzfa] & 255) ^ zzfa(i5)]) ^ this.zzW06[(bArr[1][iZzf9] & 255) ^ zzf9(i5)];
                i3 = this.zzW05[(bArr[1][iZzf8] & 255) ^ zzf8(i5)];
                return i3 ^ i2;
            }
            if (i9 != 2) {
                if (i9 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.zzW08;
            byte[][] bArr3 = zzW09;
            byte[] bArr4 = bArr3[0];
            i2 = (iArr3[(bArr4[(bArr4[i4] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)] ^ this.zzW07[(bArr4[(bArr3[1][iZzfa] & 255) ^ zzfa(i6)] & 255) ^ zzfa(i5)]) ^ this.zzW06[(bArr3[1][(bArr3[0][iZzf9] & 255) ^ zzf9(i6)] & 255) ^ zzf9(i5)];
            int[] iArr4 = this.zzW05;
            byte[] bArr5 = bArr3[1];
            i3 = iArr4[(bArr5[(bArr5[iZzf8] & 255) ^ zzf8(i6)] & 255) ^ zzf8(i5)];
            return i3 ^ i2;
        }
        byte[][] bArr6 = zzW09;
        i4 = (bArr6[1][i4] & 255) ^ (i8 & 255);
        iZzfa = (bArr6[0][iZzfa] & 255) ^ zzfa(i8);
        iZzf9 = (bArr6[0][iZzf9] & 255) ^ zzf9(i8);
        iZzf8 = (bArr6[1][iZzf8] & 255) ^ zzf8(i8);
        byte[][] bArr7 = zzW09;
        byte[] bArr8 = bArr7[1];
        i4 = (bArr8[i4] & 255) ^ (i7 & 255);
        iZzfa = (bArr8[iZzfa] & 255) ^ zzfa(i7);
        iZzf9 = (bArr7[0][iZzf9] & 255) ^ zzf9(i7);
        iZzf8 = (bArr7[0][iZzf8] & 255) ^ zzf8(i7);
        int[] iArr32 = this.zzW08;
        byte[][] bArr32 = zzW09;
        byte[] bArr42 = bArr32[0];
        i2 = (iArr32[(bArr42[(bArr42[i4] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)] ^ this.zzW07[(bArr42[(bArr32[1][iZzfa] & 255) ^ zzfa(i6)] & 255) ^ zzfa(i5)]) ^ this.zzW06[(bArr32[1][(bArr32[0][iZzf9] & 255) ^ zzf9(i6)] & 255) ^ zzf9(i5)];
        int[] iArr42 = this.zzW05;
        byte[] bArr52 = bArr32[1];
        i3 = iArr42[(bArr52[(bArr52[iZzf8] & 255) ^ zzf8(i6)] & 255) ^ zzf8(i5)];
        return i3 ^ i2;
    }

    private static void zzT(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private static int zzUx(int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = zzfe(i2);
        }
        int iZzfe = i ^ i2;
        for (int i4 = 0; i4 < 4; i4++) {
            iZzfe = zzfe(iZzfe);
        }
        return iZzfe;
    }

    private void zzV(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iZz1 = zz1(bArr, i) ^ this.zzW04[4];
        int iZz12 = zz1(bArr, i + 4) ^ this.zzW04[5];
        int iZz13 = zz1(bArr, i + 8) ^ this.zzW04[6];
        int iZz14 = zz1(bArr, i + 12) ^ this.zzW04[7];
        int i3 = 39;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int iZzf7 = zzf7(iZz1);
            int iZzf6 = zzf6(iZz12);
            int[] iArr = this.zzW04;
            int i5 = iZz14 ^ (((iZzf6 * 2) + iZzf7) + iArr[i3]);
            iZz13 = ((iZz13 >>> 31) | (iZz13 << 1)) ^ ((iZzf7 + iZzf6) + iArr[i3 - 1]);
            iZz14 = (i5 << 31) | (i5 >>> 1);
            int iZzf72 = zzf7(iZz13);
            int iZzf62 = zzf6(iZz14);
            int[] iArr2 = this.zzW04;
            int i6 = i3 - 3;
            int i7 = iZz12 ^ (((iZzf62 * 2) + iZzf72) + iArr2[i3 - 2]);
            i3 -= 4;
            iZz1 = ((iZz1 >>> 31) | (iZz1 << 1)) ^ ((iZzf72 + iZzf62) + iArr2[i6]);
            iZz12 = (i7 << 31) | (i7 >>> 1);
        }
        zzT(this.zzW04[0] ^ iZz13, bArr2, i2);
        zzT(iZz14 ^ this.zzW04[1], bArr2, i2 + 4);
        zzT(this.zzW04[2] ^ iZz1, bArr2, i2 + 8);
        zzT(this.zzW04[3] ^ iZz12, bArr2, i2 + 12);
    }

    private void zzW(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iZz1 = zz1(bArr, i) ^ this.zzW04[0];
        int iZz12 = zz1(bArr, i + 4) ^ this.zzW04[1];
        int iZz13 = zz1(bArr, i + 8) ^ this.zzW04[2];
        int iZz14 = zz1(bArr, i + 12) ^ this.zzW04[3];
        int i3 = 8;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int iZzf7 = zzf7(iZz1);
            int iZzf6 = zzf6(iZz12);
            int[] iArr = this.zzW04;
            int i5 = iZz13 ^ ((iZzf7 + iZzf6) + iArr[i3]);
            iZz13 = (i5 << 31) | (i5 >>> 1);
            iZz14 = ((iZz14 >>> 31) | (iZz14 << 1)) ^ (((iZzf6 * 2) + iZzf7) + iArr[i3 + 1]);
            int iZzf72 = zzf7(iZz13);
            int iZzf62 = zzf6(iZz14);
            int[] iArr2 = this.zzW04;
            int i6 = i3 + 3;
            int i7 = iZz1 ^ ((iZzf72 + iZzf62) + iArr2[i3 + 2]);
            iZz1 = (i7 << 31) | (i7 >>> 1);
            i3 += 4;
            iZz12 = ((iZz12 >>> 31) | (iZz12 << 1)) ^ (((iZzf62 * 2) + iZzf72) + iArr2[i6]);
        }
        zzT(this.zzW04[4] ^ iZz13, bArr2, i2);
        zzT(iZz14 ^ this.zzW04[5], bArr2, i2 + 4);
        zzT(this.zzW04[6] ^ iZz1, bArr2, i2 + 8);
        zzT(this.zzW04[7] ^ iZz12, bArr2, i2 + 12);
    }

    private void zzWK(byte[] bArr) {
        int i;
        int iZzfa;
        int iZzf9;
        int iZzf8;
        int iZzf92;
        int iZzfa2;
        int i2;
        int iZzf82;
        char c;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.zzW04 = new int[40];
        int i3 = this.zzW02;
        if (i3 <= 0) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i3 > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        char c2 = 0;
        for (int i4 = 0; i4 < this.zzW02; i4++) {
            int i5 = i4 * 8;
            iArr[i4] = zz1(bArr, i5);
            int iZz1 = zz1(bArr, i5 + 4);
            iArr2[i4] = iZz1;
            iArr3[(this.zzW02 - 1) - i4] = zzUx(iArr[i4], iZz1);
        }
        for (int i6 = 0; i6 < 20; i6++) {
            int i7 = 33686018 * i6;
            int iZzQ = zzQ(i7, iArr);
            int iZzQ2 = zzQ(i7 + R.attr.cacheColorHint, iArr2);
            int i8 = (iZzQ2 >>> 24) | (iZzQ2 << 8);
            int i9 = iZzQ + i8;
            int[] iArr4 = this.zzW04;
            int i10 = i6 * 2;
            iArr4[i10] = i9;
            int i11 = i9 + i8;
            iArr4[i10 + 1] = (i11 << 9) | (i11 >>> 23);
        }
        int i12 = iArr3[0];
        int i13 = iArr3[1];
        int i14 = 2;
        int i15 = iArr3[2];
        int i16 = iArr3[3];
        this.zzW03 = new int[1024];
        int i17 = 0;
        while (i17 < 256) {
            int i18 = this.zzW02 & 3;
            if (i18 != 0) {
                if (i18 == 1) {
                    int[] iArr5 = this.zzW03;
                    int i19 = i17 * 2;
                    int[] iArr6 = this.zzW08;
                    byte[][] bArr2 = zzW09;
                    byte b = bArr2[c2][i17];
                    iArr5[i19] = iArr6[(i12 & 255) ^ (b & 255)];
                    iArr5[i19 + 1] = this.zzW07[(b & 255) ^ zzfa(i12)];
                    this.zzW03[i19 + 512] = this.zzW06[(bArr2[1][i17] & 255) ^ zzf9(i12)];
                    this.zzW03[i19 + InputDeviceCompat.SOURCE_DPAD] = this.zzW05[(bArr2[1][i17] & 255) ^ zzf8(i12)];
                } else if (i18 == i14) {
                    iZzf82 = i17;
                    i2 = iZzf82;
                    iZzfa2 = i2;
                    iZzf92 = iZzfa2;
                    int[] iArr7 = this.zzW03;
                    int i20 = i17 * 2;
                    int[] iArr8 = this.zzW08;
                    byte[][] bArr3 = zzW09;
                    byte[] bArr4 = bArr3[c2];
                    c = c2;
                    iArr7[i20] = iArr8[(bArr4[(i13 & 255) ^ (bArr4[i2] & 255)] & 255) ^ (i12 & 255)];
                    iArr7[i20 + 1] = this.zzW07[(bArr4[(bArr3[1][iZzfa2] & 255) ^ zzfa(i13)] & 255) ^ zzfa(i12)];
                    this.zzW03[i20 + 512] = this.zzW06[(bArr3[1][(bArr3[c][iZzf92] & 255) ^ zzf9(i13)] & 255) ^ zzf9(i12)];
                    int[] iArr9 = this.zzW03;
                    int i21 = i20 + InputDeviceCompat.SOURCE_DPAD;
                    int[] iArr10 = this.zzW05;
                    byte[] bArr5 = bArr3[1];
                    iArr9[i21] = iArr10[(bArr5[(bArr5[iZzf82] & 255) ^ zzf8(i13)] & 255) ^ zzf8(i12)];
                    i17++;
                    c2 = c;
                    i14 = 2;
                } else if (i18 == 3) {
                    iZzf8 = i17;
                    i = iZzf8;
                    iZzfa = i;
                    iZzf9 = iZzfa;
                }
                c = c2;
                i17++;
                c2 = c;
                i14 = 2;
            } else {
                byte[][] bArr6 = zzW09;
                i = (bArr6[1][i17] & 255) ^ (i16 & 255);
                iZzfa = (bArr6[c2][i17] & 255) ^ zzfa(i16);
                iZzf9 = (bArr6[c2][i17] & 255) ^ zzf9(i16);
                iZzf8 = (bArr6[1][i17] & 255) ^ zzf8(i16);
            }
            byte[][] bArr7 = zzW09;
            byte[] bArr8 = bArr7[1];
            i2 = (bArr8[i] & 255) ^ (i15 & 255);
            iZzfa2 = (bArr8[iZzfa] & 255) ^ zzfa(i15);
            iZzf92 = (bArr7[c2][iZzf9] & 255) ^ zzf9(i15);
            iZzf82 = (bArr7[c2][iZzf8] & 255) ^ zzf8(i15);
            int[] iArr72 = this.zzW03;
            int i202 = i17 * 2;
            int[] iArr82 = this.zzW08;
            byte[][] bArr32 = zzW09;
            byte[] bArr42 = bArr32[c2];
            c = c2;
            iArr72[i202] = iArr82[(bArr42[(i13 & 255) ^ (bArr42[i2] & 255)] & 255) ^ (i12 & 255)];
            iArr72[i202 + 1] = this.zzW07[(bArr42[(bArr32[1][iZzfa2] & 255) ^ zzfa(i13)] & 255) ^ zzfa(i12)];
            this.zzW03[i202 + 512] = this.zzW06[(bArr32[1][(bArr32[c][iZzf92] & 255) ^ zzf9(i13)] & 255) ^ zzf9(i12)];
            int[] iArr92 = this.zzW03;
            int i212 = i202 + InputDeviceCompat.SOURCE_DPAD;
            int[] iArr102 = this.zzW05;
            byte[] bArr52 = bArr32[1];
            iArr92[i212] = iArr102[(bArr52[(bArr52[iZzf82] & 255) ^ zzf8(i13)] & 255) ^ zzf8(i12)];
            i17++;
            c2 = c;
            i14 = 2;
        }
    }

    private int zzf6(int i) {
        int[] iArr = this.zzW03;
        return iArr[(((i >>> 16) & 255) * 2) + InputDeviceCompat.SOURCE_DPAD] ^ ((iArr[((i >>> 24) & 255) * 2] ^ iArr[((i & 255) * 2) + 1]) ^ iArr[(((i >>> 8) & 255) * 2) + 512]);
    }

    private int zzf7(int i) {
        int[] iArr = this.zzW03;
        return iArr[(((i >>> 24) & 255) * 2) + InputDeviceCompat.SOURCE_DPAD] ^ ((iArr[(i & 255) * 2] ^ iArr[(((i >>> 8) & 255) * 2) + 1]) ^ iArr[(((i >>> 16) & 255) * 2) + 512]);
    }

    private static int zzf8(int i) {
        return (i >>> 24) & 255;
    }

    private static int zzf9(int i) {
        return (i >>> 16) & 255;
    }

    private static int zzfa(int i) {
        return (i >>> 8) & 255;
    }

    private static int zzfb(int i) {
        return zzfc(i) ^ (zzfd(i) ^ i);
    }

    private static int zzfc(int i) {
        return ((i >> 2) ^ ((i & 2) != 0 ? 180 : 0)) ^ ((i & 1) != 0 ? 90 : 0);
    }

    private static int zzfd(int i) {
        return ((i & 1) != 0 ? 180 : 0) ^ (i >> 1);
    }

    private static int zzfe(int i) {
        int i2 = i >>> 24;
        int i3 = i2 & 255;
        int i4 = ((i3 << 1) ^ ((i2 & 128) != 0 ? StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 : 0)) & 255;
        int i5 = ((i3 >>> 1) ^ ((i2 & 1) != 0 ? 166 : 0)) ^ i4;
        return ((((i << 8) ^ (i5 << 24)) ^ (i4 << 16)) ^ (i5 << 8)) ^ i3;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 16;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
        byte[] bArr = this.zzWaY;
        if (bArr != null) {
            zzWK(bArr);
        }
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "Twofish";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.zzWaY == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        if (this.zzWap) {
            zzW(bArr, i, bArr2, i2);
            return 16;
        }
        zzV(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - ".concat(zzyv3.getClass().getName()));
        }
        this.zzWap = z;
        byte[] key = ((zzYS8) zzyv3).getKey();
        this.zzWaY = key;
        this.zzW02 = key.length / 8;
        zzWK(key);
    }
}
