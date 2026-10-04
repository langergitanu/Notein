package com.aspose.words.internal;

import Oooo0oO.C21036OooOOo0;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWA extends zzYUA {

    /* JADX INFO: renamed from: H2 */
    private int f51265H2;

    /* JADX INFO: renamed from: H3 */
    private int f51266H3;
    private int zzW3M;
    private int zzWbt;
    private int zzWbu;
    private int zzWna;
    private int[] zzWnb;
    private int zzWnc;
    private int zzWnd;
    private int zzWne;

    public zzYWA() {
        this.zzWnb = new int[16];
        reset();
    }

    private static int zzP(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(C21036OooOOo0.OooO00o(i, zzZF(i2, i3, i4), i5, 1352829926), i6);
    }

    private static int zzQ(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(C21036OooOOo0.OooO00o(i, (i2 | (~i3)) ^ i4, i5, 1548603684), i6);
    }

    private static int zzR(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(C21036OooOOo0.OooO00o(i, zzZG(i2, i3, i4), i5, 1836072691), i6);
    }

    private static int zzS(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(i + ((i2 ^ i3) ^ i4) + i5, i6);
    }

    private static int zzT(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(C21036OooOOo0.OooO00o(i, zzZF(i2, i3, i4), i5, -1894007588), i6);
    }

    private static void zzU(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static int zzUy(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private static int zzV(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(C21036OooOOo0.OooO00o(i, zzZG(i2, i3, i4), i5, 1518500249), i6);
    }

    private static int zzW(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(i + ((i2 ^ i3) ^ i4) + i5, i6);
    }

    private void zzZ(zzYWA zzywa) {
        zzZ((zzYUA) zzywa);
        this.zzW3M = zzywa.zzW3M;
        this.zzWne = zzywa.zzWne;
        this.f51265H2 = zzywa.f51265H2;
        this.f51266H3 = zzywa.f51266H3;
        this.zzWnd = zzywa.zzWnd;
        this.zzWnc = zzywa.zzWnc;
        this.zzWbu = zzywa.zzWbu;
        this.zzWbt = zzywa.zzWbt;
        int[] iArr = zzywa.zzWnb;
        System.arraycopy(iArr, 0, this.zzWnb, 0, iArr.length);
        this.zzWna = zzywa.zzWna;
    }

    private static int zzZF(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private static int zzZG(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        zzU(this.zzW3M, bArr, i);
        zzU(this.zzWne, bArr, i + 4);
        zzU(this.f51265H2, bArr, i + 8);
        zzU(this.f51266H3, bArr, i + 12);
        zzU(this.zzWnd, bArr, i + 16);
        zzU(this.zzWnc, bArr, i + 20);
        zzU(this.zzWbu, bArr, i + 24);
        zzU(this.zzWbt, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // com.aspose.words.internal.zzYUA, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        this.zzW3M = 1732584193;
        this.zzWne = -271733879;
        this.f51265H2 = -1732584194;
        this.f51266H3 = 271733878;
        this.zzWnd = 1985229328;
        this.zzWnc = -19088744;
        this.zzWbu = -1985229329;
        this.zzWbt = 19088743;
        this.zzWna = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.zzWnb;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return 32;
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzX8(long j) {
        if (this.zzWna > 14) {
            zzXHo();
        }
        int[] iArr = this.zzWnb;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYWA(this);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "RIPEMD256";
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzXHo() {
        int i = this.zzW3M;
        int i2 = this.zzWne;
        int i3 = this.f51265H2;
        int i4 = this.f51266H3;
        int i5 = this.zzWnd;
        int i6 = this.zzWnc;
        int i7 = this.zzWbu;
        int i8 = this.zzWbt;
        int iZzW = zzW(i, i2, i3, i4, this.zzWnb[0], 11);
        int iZzW2 = zzW(i4, iZzW, i2, i3, this.zzWnb[1], 14);
        int iZzW3 = zzW(i3, iZzW2, iZzW, i2, this.zzWnb[2], 15);
        int iZzW4 = zzW(i2, iZzW3, iZzW2, iZzW, this.zzWnb[3], 12);
        int iZzW5 = zzW(iZzW, iZzW4, iZzW3, iZzW2, this.zzWnb[4], 5);
        int iZzW6 = zzW(iZzW2, iZzW5, iZzW4, iZzW3, this.zzWnb[5], 8);
        int iZzW7 = zzW(iZzW3, iZzW6, iZzW5, iZzW4, this.zzWnb[6], 7);
        int iZzW8 = zzW(iZzW4, iZzW7, iZzW6, iZzW5, this.zzWnb[7], 9);
        int iZzW9 = zzW(iZzW5, iZzW8, iZzW7, iZzW6, this.zzWnb[8], 11);
        int iZzW10 = zzW(iZzW6, iZzW9, iZzW8, iZzW7, this.zzWnb[9], 13);
        int iZzW11 = zzW(iZzW7, iZzW10, iZzW9, iZzW8, this.zzWnb[10], 14);
        int iZzW12 = zzW(iZzW8, iZzW11, iZzW10, iZzW9, this.zzWnb[11], 15);
        int iZzW13 = zzW(iZzW9, iZzW12, iZzW11, iZzW10, this.zzWnb[12], 6);
        int iZzW14 = zzW(iZzW10, iZzW13, iZzW12, iZzW11, this.zzWnb[13], 7);
        int iZzW15 = zzW(iZzW11, iZzW14, iZzW13, iZzW12, this.zzWnb[14], 9);
        int iZzW16 = zzW(iZzW12, iZzW15, iZzW14, iZzW13, this.zzWnb[15], 8);
        int iZzP = zzP(i5, i6, i7, i8, this.zzWnb[5], 8);
        int iZzP2 = zzP(i8, iZzP, i6, i7, this.zzWnb[14], 9);
        int iZzP3 = zzP(i7, iZzP2, iZzP, i6, this.zzWnb[7], 9);
        int iZzP4 = zzP(i6, iZzP3, iZzP2, iZzP, this.zzWnb[0], 11);
        int iZzP5 = zzP(iZzP, iZzP4, iZzP3, iZzP2, this.zzWnb[9], 13);
        int iZzP6 = zzP(iZzP2, iZzP5, iZzP4, iZzP3, this.zzWnb[2], 15);
        int iZzP7 = zzP(iZzP3, iZzP6, iZzP5, iZzP4, this.zzWnb[11], 15);
        int iZzP8 = zzP(iZzP4, iZzP7, iZzP6, iZzP5, this.zzWnb[4], 5);
        int iZzP9 = zzP(iZzP5, iZzP8, iZzP7, iZzP6, this.zzWnb[13], 7);
        int iZzP10 = zzP(iZzP6, iZzP9, iZzP8, iZzP7, this.zzWnb[6], 7);
        int iZzP11 = zzP(iZzP7, iZzP10, iZzP9, iZzP8, this.zzWnb[15], 8);
        int iZzP12 = zzP(iZzP8, iZzP11, iZzP10, iZzP9, this.zzWnb[8], 11);
        int iZzP13 = zzP(iZzP9, iZzP12, iZzP11, iZzP10, this.zzWnb[1], 14);
        int iZzP14 = zzP(iZzP10, iZzP13, iZzP12, iZzP11, this.zzWnb[10], 14);
        int iZzP15 = zzP(iZzP11, iZzP14, iZzP13, iZzP12, this.zzWnb[3], 12);
        int iZzP16 = zzP(iZzP12, iZzP15, iZzP14, iZzP13, this.zzWnb[12], 6);
        int iZzV = zzV(iZzP13, iZzW16, iZzW15, iZzW14, this.zzWnb[7], 7);
        int iZzV2 = zzV(iZzW14, iZzV, iZzW16, iZzW15, this.zzWnb[4], 6);
        int iZzV3 = zzV(iZzW15, iZzV2, iZzV, iZzW16, this.zzWnb[13], 8);
        int iZzV4 = zzV(iZzW16, iZzV3, iZzV2, iZzV, this.zzWnb[1], 13);
        int iZzV5 = zzV(iZzV, iZzV4, iZzV3, iZzV2, this.zzWnb[10], 11);
        int iZzV6 = zzV(iZzV2, iZzV5, iZzV4, iZzV3, this.zzWnb[6], 9);
        int iZzV7 = zzV(iZzV3, iZzV6, iZzV5, iZzV4, this.zzWnb[15], 7);
        int iZzV8 = zzV(iZzV4, iZzV7, iZzV6, iZzV5, this.zzWnb[3], 15);
        int iZzV9 = zzV(iZzV5, iZzV8, iZzV7, iZzV6, this.zzWnb[12], 7);
        int iZzV10 = zzV(iZzV6, iZzV9, iZzV8, iZzV7, this.zzWnb[0], 12);
        int iZzV11 = zzV(iZzV7, iZzV10, iZzV9, iZzV8, this.zzWnb[9], 15);
        int iZzV12 = zzV(iZzV8, iZzV11, iZzV10, iZzV9, this.zzWnb[5], 9);
        int iZzV13 = zzV(iZzV9, iZzV12, iZzV11, iZzV10, this.zzWnb[2], 11);
        int iZzV14 = zzV(iZzV10, iZzV13, iZzV12, iZzV11, this.zzWnb[14], 7);
        int iZzV15 = zzV(iZzV11, iZzV14, iZzV13, iZzV12, this.zzWnb[11], 13);
        int iZzV16 = zzV(iZzV12, iZzV15, iZzV14, iZzV13, this.zzWnb[8], 12);
        int iZzQ = zzQ(iZzW13, iZzP16, iZzP15, iZzP14, this.zzWnb[6], 9);
        int iZzQ2 = zzQ(iZzP14, iZzQ, iZzP16, iZzP15, this.zzWnb[11], 13);
        int iZzQ3 = zzQ(iZzP15, iZzQ2, iZzQ, iZzP16, this.zzWnb[3], 15);
        int iZzQ4 = zzQ(iZzP16, iZzQ3, iZzQ2, iZzQ, this.zzWnb[7], 7);
        int iZzQ5 = zzQ(iZzQ, iZzQ4, iZzQ3, iZzQ2, this.zzWnb[0], 12);
        int iZzQ6 = zzQ(iZzQ2, iZzQ5, iZzQ4, iZzQ3, this.zzWnb[13], 8);
        int iZzQ7 = zzQ(iZzQ3, iZzQ6, iZzQ5, iZzQ4, this.zzWnb[5], 9);
        int iZzQ8 = zzQ(iZzQ4, iZzQ7, iZzQ6, iZzQ5, this.zzWnb[10], 11);
        int iZzQ9 = zzQ(iZzQ5, iZzQ8, iZzQ7, iZzQ6, this.zzWnb[14], 7);
        int iZzQ10 = zzQ(iZzQ6, iZzQ9, iZzQ8, iZzQ7, this.zzWnb[15], 7);
        int iZzQ11 = zzQ(iZzQ7, iZzQ10, iZzQ9, iZzQ8, this.zzWnb[8], 12);
        int iZzQ12 = zzQ(iZzQ8, iZzQ11, iZzQ10, iZzQ9, this.zzWnb[12], 7);
        int iZzQ13 = zzQ(iZzQ9, iZzQ12, iZzQ11, iZzQ10, this.zzWnb[4], 6);
        int iZzQ14 = zzQ(iZzQ10, iZzQ13, iZzQ12, iZzQ11, this.zzWnb[9], 15);
        int iZzQ15 = zzQ(iZzQ11, iZzQ14, iZzQ13, iZzQ12, this.zzWnb[1], 13);
        int iZzQ16 = zzQ(iZzQ12, iZzQ15, iZzQ14, iZzQ13, this.zzWnb[2], 11);
        int iZzU = zzU(iZzV13, iZzQ16, iZzV15, iZzV14, this.zzWnb[3], 11);
        int iZzU2 = zzU(iZzV14, iZzU, iZzQ16, iZzV15, this.zzWnb[10], 13);
        int iZzU3 = zzU(iZzV15, iZzU2, iZzU, iZzQ16, this.zzWnb[14], 6);
        int iZzU4 = zzU(iZzQ16, iZzU3, iZzU2, iZzU, this.zzWnb[4], 7);
        int iZzU5 = zzU(iZzU, iZzU4, iZzU3, iZzU2, this.zzWnb[9], 14);
        int iZzU6 = zzU(iZzU2, iZzU5, iZzU4, iZzU3, this.zzWnb[15], 9);
        int iZzU7 = zzU(iZzU3, iZzU6, iZzU5, iZzU4, this.zzWnb[8], 13);
        int iZzU8 = zzU(iZzU4, iZzU7, iZzU6, iZzU5, this.zzWnb[1], 15);
        int iZzU9 = zzU(iZzU5, iZzU8, iZzU7, iZzU6, this.zzWnb[2], 14);
        int iZzU10 = zzU(iZzU6, iZzU9, iZzU8, iZzU7, this.zzWnb[7], 8);
        int iZzU11 = zzU(iZzU7, iZzU10, iZzU9, iZzU8, this.zzWnb[0], 13);
        int iZzU12 = zzU(iZzU8, iZzU11, iZzU10, iZzU9, this.zzWnb[6], 6);
        int iZzU13 = zzU(iZzU9, iZzU12, iZzU11, iZzU10, this.zzWnb[13], 5);
        int iZzU14 = zzU(iZzU10, iZzU13, iZzU12, iZzU11, this.zzWnb[11], 12);
        int iZzU15 = zzU(iZzU11, iZzU14, iZzU13, iZzU12, this.zzWnb[5], 7);
        int iZzU16 = zzU(iZzU12, iZzU15, iZzU14, iZzU13, this.zzWnb[12], 5);
        int iZzR = zzR(iZzQ13, iZzV16, iZzQ15, iZzQ14, this.zzWnb[15], 9);
        int iZzR2 = zzR(iZzQ14, iZzR, iZzV16, iZzQ15, this.zzWnb[5], 7);
        int iZzR3 = zzR(iZzQ15, iZzR2, iZzR, iZzV16, this.zzWnb[1], 15);
        int iZzR4 = zzR(iZzV16, iZzR3, iZzR2, iZzR, this.zzWnb[3], 11);
        int iZzR5 = zzR(iZzR, iZzR4, iZzR3, iZzR2, this.zzWnb[7], 8);
        int iZzR6 = zzR(iZzR2, iZzR5, iZzR4, iZzR3, this.zzWnb[14], 6);
        int iZzR7 = zzR(iZzR3, iZzR6, iZzR5, iZzR4, this.zzWnb[6], 6);
        int iZzR8 = zzR(iZzR4, iZzR7, iZzR6, iZzR5, this.zzWnb[9], 14);
        int iZzR9 = zzR(iZzR5, iZzR8, iZzR7, iZzR6, this.zzWnb[11], 12);
        int iZzR10 = zzR(iZzR6, iZzR9, iZzR8, iZzR7, this.zzWnb[8], 13);
        int iZzR11 = zzR(iZzR7, iZzR10, iZzR9, iZzR8, this.zzWnb[12], 5);
        int iZzR12 = zzR(iZzR8, iZzR11, iZzR10, iZzR9, this.zzWnb[2], 14);
        int iZzR13 = zzR(iZzR9, iZzR12, iZzR11, iZzR10, this.zzWnb[10], 13);
        int iZzR14 = zzR(iZzR10, iZzR13, iZzR12, iZzR11, this.zzWnb[0], 13);
        int iZzR15 = zzR(iZzR11, iZzR14, iZzR13, iZzR12, this.zzWnb[4], 7);
        int iZzR16 = zzR(iZzR12, iZzR15, iZzR14, iZzR13, this.zzWnb[13], 5);
        int iZzT = zzT(iZzU13, iZzU16, iZzR15, iZzU14, this.zzWnb[1], 11);
        int iZzT2 = zzT(iZzU14, iZzT, iZzU16, iZzR15, this.zzWnb[9], 12);
        int iZzT3 = zzT(iZzR15, iZzT2, iZzT, iZzU16, this.zzWnb[11], 14);
        int iZzT4 = zzT(iZzU16, iZzT3, iZzT2, iZzT, this.zzWnb[10], 15);
        int iZzT5 = zzT(iZzT, iZzT4, iZzT3, iZzT2, this.zzWnb[0], 14);
        int iZzT6 = zzT(iZzT2, iZzT5, iZzT4, iZzT3, this.zzWnb[8], 15);
        int iZzT7 = zzT(iZzT3, iZzT6, iZzT5, iZzT4, this.zzWnb[12], 9);
        int iZzT8 = zzT(iZzT4, iZzT7, iZzT6, iZzT5, this.zzWnb[4], 8);
        int iZzT9 = zzT(iZzT5, iZzT8, iZzT7, iZzT6, this.zzWnb[13], 9);
        int iZzT10 = zzT(iZzT6, iZzT9, iZzT8, iZzT7, this.zzWnb[3], 14);
        int iZzT11 = zzT(iZzT7, iZzT10, iZzT9, iZzT8, this.zzWnb[7], 5);
        int iZzT12 = zzT(iZzT8, iZzT11, iZzT10, iZzT9, this.zzWnb[15], 6);
        int iZzT13 = zzT(iZzT9, iZzT12, iZzT11, iZzT10, this.zzWnb[14], 8);
        int iZzT14 = zzT(iZzT10, iZzT13, iZzT12, iZzT11, this.zzWnb[5], 6);
        int iZzT15 = zzT(iZzT11, iZzT14, iZzT13, iZzT12, this.zzWnb[6], 5);
        int iZzT16 = zzT(iZzT12, iZzT15, iZzT14, iZzT13, this.zzWnb[2], 12);
        int iZzS = zzS(iZzR13, iZzR16, iZzU15, iZzR14, this.zzWnb[8], 15);
        int iZzS2 = zzS(iZzR14, iZzS, iZzR16, iZzU15, this.zzWnb[6], 5);
        int iZzS3 = zzS(iZzU15, iZzS2, iZzS, iZzR16, this.zzWnb[4], 8);
        int iZzS4 = zzS(iZzR16, iZzS3, iZzS2, iZzS, this.zzWnb[1], 11);
        int iZzS5 = zzS(iZzS, iZzS4, iZzS3, iZzS2, this.zzWnb[3], 14);
        int iZzS6 = zzS(iZzS2, iZzS5, iZzS4, iZzS3, this.zzWnb[11], 14);
        int iZzS7 = zzS(iZzS3, iZzS6, iZzS5, iZzS4, this.zzWnb[15], 6);
        int iZzS8 = zzS(iZzS4, iZzS7, iZzS6, iZzS5, this.zzWnb[0], 14);
        int iZzS9 = zzS(iZzS5, iZzS8, iZzS7, iZzS6, this.zzWnb[5], 6);
        int iZzS10 = zzS(iZzS6, iZzS9, iZzS8, iZzS7, this.zzWnb[12], 9);
        int iZzS11 = zzS(iZzS7, iZzS10, iZzS9, iZzS8, this.zzWnb[2], 12);
        int iZzS12 = zzS(iZzS8, iZzS11, iZzS10, iZzS9, this.zzWnb[13], 9);
        int iZzS13 = zzS(iZzS9, iZzS12, iZzS11, iZzS10, this.zzWnb[9], 12);
        int iZzS14 = zzS(iZzS10, iZzS13, iZzS12, iZzS11, this.zzWnb[7], 5);
        int iZzS15 = zzS(iZzS11, iZzS14, iZzS13, iZzS12, this.zzWnb[10], 15);
        int iZzS16 = zzS(iZzS12, iZzS15, iZzS14, iZzS13, this.zzWnb[14], 8);
        this.zzW3M += iZzT13;
        this.zzWne += iZzT16;
        this.f51265H2 += iZzT15;
        this.f51266H3 += iZzS14;
        this.zzWnd += iZzS13;
        this.zzWnc += iZzS16;
        this.zzWbu += iZzS15;
        this.zzWbt += iZzT14;
        this.zzWna = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.zzWnb;
            if (i9 == iArr.length) {
                return;
            }
            iArr[i9] = 0;
            i9++;
        }
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzk(byte[] bArr, int i) {
        int[] iArr = this.zzWnb;
        int i2 = this.zzWna;
        int i3 = i2 + 1;
        this.zzWna = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            zzXHo();
        }
    }

    public zzYWA(zzYWA zzywa) {
        super(zzywa);
        this.zzWnb = new int[16];
        zzZ(zzywa);
    }

    private static int zzU(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzUy(C21036OooOOo0.OooO00o(i, (i2 | (~i3)) ^ i4, i5, 1859775393), i6);
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzZ((zzYWA) zzygp);
    }
}
