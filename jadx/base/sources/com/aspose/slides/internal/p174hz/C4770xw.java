package com.aspose.slides.internal.p174hz;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.internal.p525yi.C12843x6;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.xw */
/* JADX INFO: loaded from: classes.dex */
class C4770xw extends AbstractC4699b1 {

    /* JADX INFO: renamed from: k4 */
    static byte[] f13335k4 = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, PatternStyle.Sphere, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, PatternStyle.Vertical, -67, -113, SignedBytes.MAX_POWER_OF_TWO, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, PatternStyle.Wave, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, PatternStyle.Shingle, -56, 102, 30, -41, 8, -24, -22, -34, UnsignedBytes.MAX_POWER_OF_TWO, 82, -18, -9, -124, -86, 114, -84, PatternStyle.UpwardDiagonal, 77, 106, PatternStyle.Plaid, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, PatternStyle.DiagonalCross, 91, 37, 85, -105, PatternStyle.Horizontal, PatternStyle.DottedGrid, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, PatternStyle.Weave, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, PatternStyle.DownwardDiagonal, 27, -85, PatternStyle.Cross, -1, -80, -69, 72, 12, 95, -71, -79, -51, PatternStyle.Divot, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Ascii.DEL, -63, -83};

    /* JADX INFO: renamed from: du */
    private int f13336du;

    /* JADX INFO: renamed from: h4 */
    private int[] f13337h4;

    /* JADX INFO: renamed from: kk */
    private int f13338kk;

    /* JADX INFO: renamed from: m9 */
    private int f13339m9;

    /* JADX INFO: renamed from: to */
    private int f13340to;

    /* JADX INFO: renamed from: x1 */
    private int f13341x1;

    public C4770xw(AbstractC4713f9 abstractC4713f9, boolean z, byte[] bArr, byte[] bArr2) {
        byte[] bArrM59721k4;
        super(abstractC4713f9, z, bArr2);
        int iMo19607du = abstractC4713f9.mo19607du();
        if (bArr == null) {
            bArrM59721k4 = C12843x6.m59721k4(abstractC4713f9.mo19608h4() >> 3);
        } else {
            bArrM59721k4 = (byte[]) bArr.clone();
            iMo19607du = Math.min(iMo19607du, bArrM59721k4.length << 3);
        }
        int length = bArrM59721k4.length;
        if (!C4711e0.m19598k4(abstractC4713f9.m19681ck(), length << 3)) {
            throw new CryptographicException(C12825ix.m59624k4("Key is too small ({0} bytes), it should be between {1} and {2} bytes long.", Integer.valueOf(length), 5, 16));
        }
        byte[] bArr3 = new byte[128];
        int i = (iMo19607du + 7) >> 3;
        int i2 = 255 % (2 << (((iMo19607du + 8) - (i << 3)) - 1));
        System.arraycopy(bArrM59721k4, 0, bArr3, 0, length);
        for (int i3 = length; i3 < 128; i3++) {
            bArr3[i3] = (byte) (f13335k4[((bArr3[i3 - 1] & 255) + (bArr3[i3 - length] & 255)) & 255] & 255);
        }
        int i4 = 128 - i;
        bArr3[i4] = f13335k4[i2 & bArr3[i4] & 255];
        for (int i5 = 127 - i; i5 >= 0; i5--) {
            bArr3[i5] = f13335k4[(bArr3[i5 + 1] & 255) ^ (bArr3[i5 + i] & 255)];
        }
        this.f13337h4 = new int[64];
        int i6 = 0;
        for (int i7 = 0; i7 < 64; i7++) {
            int[] iArr = this.f13337h4;
            int i8 = i6 + 1;
            int i9 = bArr3[i6] & 255;
            i6 += 2;
            iArr[i7] = i9 + ((bArr3[i8] & 255) << 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    @Override // com.aspose.slides.internal.p174hz.AbstractC4699b1
    /* JADX INFO: renamed from: x1 */
    public void mo19569x1(byte[] bArr, byte[] bArr2) {
        ?? r16;
        char c;
        ?? r17;
        char c2;
        boolean z = false;
        boolean z2 = true;
        this.f13341x1 = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
        char c3 = 2;
        this.f13338kk = (bArr[2] & 255) | ((bArr[3] & 255) << 8);
        char c4 = 4;
        this.f13340to = (bArr[4] & 255) | ((bArr[5] & 255) << 8);
        this.f13336du = (bArr[6] & 255) | ((bArr[7] & 255) << 8);
        if (!this.f13113up) {
            r16 = 0;
            c = 2;
            r17 = 1;
            c2 = 4;
            this.f13339m9 = 63;
            while (true) {
                int i = this.f13339m9;
                if (i < 44) {
                    break;
                }
                int i2 = this.f13336du;
                int i3 = ((i2 & 65535) << 11) | ((i2 & 65535) >> 5);
                this.f13336du = i3;
                int[] iArr = this.f13337h4;
                int i4 = i - 1;
                this.f13339m9 = i4;
                int i5 = iArr[i] & 65535;
                int i6 = this.f13340to;
                int i7 = this.f13338kk;
                int i8 = ~(i6 & 65535);
                int i9 = this.f13341x1;
                int i10 = (i3 & 65535) - (((i5 + ((i6 & 65535) & (i7 & 65535))) + (i8 & (i9 & 65535))) & 65535);
                this.f13336du = i10;
                int i11 = ((i6 & 65535) >> 3) | ((i6 & 65535) << 13);
                this.f13340to = i11;
                int i12 = i - 2;
                this.f13339m9 = i12;
                int i13 = (i11 & 65535) - ((((iArr[i4] & 65535) + ((i7 & 65535) & (i9 & 65535))) + ((~(i7 & 65535)) & (i10 & 65535))) & 65535);
                this.f13340to = i13;
                int i14 = ((i7 & 65535) >> 2) | ((i7 & 65535) << 14);
                this.f13338kk = i14;
                int i15 = i - 3;
                this.f13339m9 = i15;
                int i16 = (i14 & 65535) - ((((iArr[i12] & 65535) + ((i9 & 65535) & (i10 & 65535))) + ((~(i9 & 65535)) & (i13 & 65535))) & 65535);
                this.f13338kk = i16;
                int i17 = ((i9 & 65535) >> 1) | ((i9 & 65535) << 15);
                this.f13341x1 = i17;
                this.f13339m9 = i - 4;
                this.f13341x1 = (i17 & 65535) - ((((iArr[i15] & 65535) + ((i10 & 65535) & (i13 & 65535))) + ((~(i10 & 65535)) & (i16 & 65535))) & 65535);
            }
            int i18 = this.f13336du & 65535;
            int[] iArr2 = this.f13337h4;
            int i19 = this.f13340to;
            int i20 = i18 - (iArr2[i19 & 63] & 65535);
            this.f13336du = i20;
            int i21 = this.f13338kk;
            this.f13340to = (i19 & 65535) - (iArr2[i21 & 63] & 65535);
            int i22 = i21 & 65535;
            int i23 = this.f13341x1;
            this.f13338kk = i22 - (iArr2[i23 & 63] & 65535);
            this.f13341x1 = (i23 & 65535) - (iArr2[i20 & 63] & 65535);
            while (true) {
                int i24 = this.f13339m9;
                if (i24 < 20) {
                    break;
                }
                int i25 = this.f13336du;
                int i26 = ((i25 & 65535) << 11) | ((i25 & 65535) >> 5);
                this.f13336du = i26;
                int[] iArr3 = this.f13337h4;
                int i27 = i24 - 1;
                this.f13339m9 = i27;
                int i28 = iArr3[i24] & 65535;
                int i29 = this.f13340to;
                int i30 = this.f13338kk;
                int i31 = ~(i29 & 65535);
                int i32 = this.f13341x1;
                int i33 = (i26 & 65535) - (((i28 + ((i29 & 65535) & (i30 & 65535))) + (i31 & (i32 & 65535))) & 65535);
                this.f13336du = i33;
                int i34 = ((i29 & 65535) >> 3) | ((i29 & 65535) << 13);
                this.f13340to = i34;
                int i35 = i24 - 2;
                this.f13339m9 = i35;
                int i36 = (i34 & 65535) - ((((iArr3[i27] & 65535) + ((i30 & 65535) & (i32 & 65535))) + ((~(i30 & 65535)) & (i33 & 65535))) & 65535);
                this.f13340to = i36;
                int i37 = ((i30 & 65535) >> 2) | ((i30 & 65535) << 14);
                this.f13338kk = i37;
                int i38 = i24 - 3;
                this.f13339m9 = i38;
                int i39 = (i37 & 65535) - ((((iArr3[i35] & 65535) + ((i32 & 65535) & (i33 & 65535))) + ((~(i32 & 65535)) & (i36 & 65535))) & 65535);
                this.f13338kk = i39;
                int i40 = ((i32 & 65535) >> 1) | ((i32 & 65535) << 15);
                this.f13341x1 = i40;
                this.f13339m9 = i24 - 4;
                this.f13341x1 = (i40 & 65535) - ((((iArr3[i38] & 65535) + ((i33 & 65535) & (i36 & 65535))) + ((~(i33 & 65535)) & (i39 & 65535))) & 65535);
            }
            int i41 = this.f13336du & 65535;
            int[] iArr4 = this.f13337h4;
            int i42 = this.f13340to;
            int i43 = i41 - (iArr4[i42 & 63] & 65535);
            this.f13336du = i43;
            int i44 = this.f13338kk;
            this.f13340to = (i42 & 65535) - (iArr4[i44 & 63] & 65535);
            int i45 = i44 & 65535;
            int i46 = this.f13341x1;
            this.f13338kk = i45 - (iArr4[i46 & 63] & 65535);
            this.f13341x1 = (i46 & 65535) - (iArr4[i43 & 63] & 65535);
            while (true) {
                int i47 = this.f13339m9;
                if (i47 < 0) {
                    break;
                }
                int i48 = this.f13336du;
                int i49 = ((i48 & 65535) << 11) | ((i48 & 65535) >> 5);
                this.f13336du = i49;
                int[] iArr5 = this.f13337h4;
                int i50 = i47 - 1;
                this.f13339m9 = i50;
                int i51 = iArr5[i47] & 65535;
                int i52 = this.f13340to;
                int i53 = this.f13338kk;
                int i54 = ~(i52 & 65535);
                int i55 = this.f13341x1;
                int i56 = (i49 & 65535) - (((i51 + ((i52 & 65535) & (i53 & 65535))) + (i54 & (i55 & 65535))) & 65535);
                this.f13336du = i56;
                int i57 = ((i52 & 65535) >> 3) | ((i52 & 65535) << 13);
                this.f13340to = i57;
                int i58 = i47 - 2;
                this.f13339m9 = i58;
                int i59 = (i57 & 65535) - ((((iArr5[i50] & 65535) + ((i53 & 65535) & (i55 & 65535))) + ((~(i53 & 65535)) & (i56 & 65535))) & 65535);
                this.f13340to = i59;
                int i60 = ((i53 & 65535) >> 2) | ((i53 & 65535) << 14);
                this.f13338kk = i60;
                int i61 = i47 - 3;
                this.f13339m9 = i61;
                int i62 = (i60 & 65535) - ((((iArr5[i58] & 65535) + ((i55 & 65535) & (i56 & 65535))) + ((~(i55 & 65535)) & (i59 & 65535))) & 65535);
                this.f13338kk = i62;
                int i63 = ((i55 & 65535) >> 1) | ((i55 & 65535) << 15);
                this.f13341x1 = i63;
                this.f13339m9 = i47 - 4;
                this.f13341x1 = (i63 & 65535) - ((((iArr5[i61] & 65535) + ((i56 & 65535) & (i59 & 65535))) + ((~(i56 & 65535)) & (i62 & 65535))) & 65535);
            }
        } else {
            this.f13339m9 = 0;
            while (true) {
                int i64 = this.f13339m9;
                if (i64 > 16) {
                    break;
                }
                int i65 = this.f13341x1 & 65535;
                int[] iArr6 = this.f13337h4;
                int i66 = i64 + 1;
                this.f13339m9 = i66;
                int i67 = iArr6[i64] & 65535;
                boolean z3 = z;
                int i68 = this.f13336du;
                char c5 = c3;
                int i69 = this.f13340to;
                boolean z4 = z2;
                int i70 = ~(i68 & 65535);
                char c6 = c4;
                int i71 = this.f13338kk;
                int i72 = i65 + ((i67 + (i68 & 65535 & i69 & 65535) + (i70 & i71 & 65535)) & 65535);
                int i73 = ((i72 & 65535) << 1) | ((i72 & 65535) >> 15);
                this.f13341x1 = i73;
                int i74 = i64 + 2;
                this.f13339m9 = i74;
                int i75 = (i71 & 65535) + (((iArr6[i66] & 65535) + (i73 & 65535 & i68 & 65535) + ((~(i73 & 65535)) & i69 & 65535)) & 65535);
                int i76 = ((i75 & 65535) >> 14) | ((i75 & 65535) << 2);
                this.f13338kk = i76;
                int i77 = i64 + 3;
                this.f13339m9 = i77;
                int i78 = (i69 & 65535) + (((iArr6[i74] & 65535) + (i76 & 65535 & i73 & 65535) + ((~(i76 & 65535)) & i68 & 65535)) & 65535);
                int i79 = ((i78 & 65535) >> 13) | ((i78 & 65535) << 3);
                this.f13340to = i79;
                this.f13339m9 = i64 + 4;
                int i80 = (i68 & 65535) + (((iArr6[i77] & 65535) + (i76 & 65535 & i79 & 65535) + ((~(i79 & 65535)) & i73 & 65535)) & 65535);
                this.f13336du = ((i80 & 65535) >> 11) | ((i80 & 65535) << 5);
                z = z3;
                z2 = z4;
                c3 = c5;
                c4 = c6;
            }
            r16 = z;
            c = c3;
            r17 = z2;
            c2 = c4;
            int i81 = this.f13341x1 & 65535;
            int[] iArr7 = this.f13337h4;
            int i82 = this.f13336du;
            int i83 = i81 + (iArr7[i82 & 63] & 65535);
            this.f13341x1 = i83;
            int i84 = (this.f13338kk & 65535) + (iArr7[i83 & 63] & 65535);
            this.f13338kk = i84;
            int i85 = (this.f13340to & 65535) + (iArr7[i84 & 63] & 65535);
            this.f13340to = i85;
            this.f13336du = (i82 & 65535) + (iArr7[i85 & 63] & 65535);
            while (true) {
                int i86 = this.f13339m9;
                if (i86 > 40) {
                    break;
                }
                int i87 = this.f13341x1 & 65535;
                int[] iArr8 = this.f13337h4;
                int i88 = i86 + 1;
                this.f13339m9 = i88;
                int i89 = iArr8[i86] & 65535;
                int i90 = this.f13336du;
                int i91 = this.f13340to;
                int i92 = ~(i90 & 65535);
                int i93 = this.f13338kk;
                int i94 = i87 + ((i89 + (i90 & 65535 & i91 & 65535) + (i92 & i93 & 65535)) & 65535);
                int i95 = ((i94 & 65535) >> 15) | ((i94 & 65535) << 1);
                this.f13341x1 = i95;
                int i96 = i86 + 2;
                this.f13339m9 = i96;
                int i97 = (i93 & 65535) + (((iArr8[i88] & 65535) + (i95 & 65535 & i90 & 65535) + ((~(i95 & 65535)) & i91 & 65535)) & 65535);
                int i98 = ((i97 & 65535) << 2) | ((i97 & 65535) >> 14);
                this.f13338kk = i98;
                int i99 = i91 & 65535;
                int i100 = i86 + 3;
                this.f13339m9 = i100;
                int i101 = i99 + (((iArr8[i96] & 65535) + (i98 & 65535 & i95 & 65535) + ((~(i98 & 65535)) & i90 & 65535)) & 65535);
                int i102 = ((i101 & 65535) >> 13) | ((i101 & 65535) << 3);
                this.f13340to = i102;
                this.f13339m9 = i86 + 4;
                int i103 = (i90 & 65535) + (((iArr8[i100] & 65535) + (i102 & 65535 & i98 & 65535) + (i95 & 65535 & (~(i102 & 65535)))) & 65535);
                this.f13336du = ((i103 & 65535) << 5) | ((i103 & 65535) >> 11);
            }
            int i104 = this.f13341x1 & 65535;
            int[] iArr9 = this.f13337h4;
            int i105 = this.f13336du;
            int i106 = i104 + (iArr9[i105 & 63] & 65535);
            this.f13341x1 = i106;
            int i107 = (this.f13338kk & 65535) + (iArr9[i106 & 63] & 65535);
            this.f13338kk = i107;
            int i108 = (this.f13340to & 65535) + (iArr9[i107 & 63] & 65535);
            this.f13340to = i108;
            this.f13336du = (i105 & 65535) + (iArr9[i108 & 63] & 65535);
            while (true) {
                int i109 = this.f13339m9;
                if (i109 >= 64) {
                    break;
                }
                int i110 = this.f13341x1 & 65535;
                int[] iArr10 = this.f13337h4;
                int i111 = i109 + 1;
                this.f13339m9 = i111;
                int i112 = iArr10[i109] & 65535;
                int i113 = this.f13336du;
                int i114 = this.f13340to;
                int i115 = ~(i113 & 65535);
                int i116 = this.f13338kk;
                int i117 = i110 + ((i112 + (i113 & 65535 & i114 & 65535) + (i115 & i116 & 65535)) & 65535);
                int i118 = ((i117 & 65535) >> 15) | ((i117 & 65535) << 1);
                this.f13341x1 = i118;
                int i119 = i109 + 2;
                this.f13339m9 = i119;
                int i120 = (i116 & 65535) + (((iArr10[i111] & 65535) + (i118 & 65535 & i113 & 65535) + ((~(i118 & 65535)) & i114 & 65535)) & 65535);
                int i121 = ((i120 & 65535) << 2) | ((i120 & 65535) >> 14);
                this.f13338kk = i121;
                int i122 = i114 & 65535;
                int i123 = i109 + 3;
                this.f13339m9 = i123;
                int i124 = i122 + (((iArr10[i119] & 65535) + (i121 & 65535 & i118 & 65535) + ((~(i121 & 65535)) & i113 & 65535)) & 65535);
                int i125 = ((i124 & 65535) >> 13) | ((i124 & 65535) << 3);
                this.f13340to = i125;
                this.f13339m9 = i109 + 4;
                int i126 = (i113 & 65535) + (((iArr10[i123] & 65535) + (i125 & 65535 & i121 & 65535) + (i118 & 65535 & (~(i125 & 65535)))) & 65535);
                this.f13336du = ((i126 & 65535) << 5) | ((i126 & 65535) >> 11);
            }
        }
        int i127 = this.f13341x1;
        bArr2[r16] = (byte) (i127 & 65535);
        bArr2[r17] = (byte) ((i127 & 65535) >> 8);
        int i128 = this.f13338kk;
        bArr2[c] = (byte) (i128 & 65535);
        bArr2[3] = (byte) ((i128 & 65535) >> 8);
        int i129 = this.f13340to;
        bArr2[c2] = (byte) (i129 & 65535);
        bArr2[5] = (byte) ((i129 & 65535) >> 8);
        int i130 = this.f13336du;
        bArr2[6] = (byte) (i130 & 65535);
        bArr2[7] = (byte) ((i130 & 65535) >> 8);
    }
}
