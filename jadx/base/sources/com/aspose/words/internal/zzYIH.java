package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYIH {

    /* JADX INFO: renamed from: cK */
    private static final int[] f50943cK = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static void zzE(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = i;
        long j2 = j * j;
        long j3 = i2 * 2;
        long j4 = j * j3;
        long j5 = i3 * 2;
        long j6 = j * j5;
        long j7 = i2;
        long j8 = (j7 * j7) + j6;
        long j9 = i4 * 2;
        long j10 = (j * j9) + (j3 * j5);
        long j11 = i5 * 2;
        long j12 = (j7 * j9) + (j * j11) + (((long) i3) * j5);
        long j13 = (j5 * j9) + (j3 * j11);
        long j14 = j5 * j11;
        long j15 = i4;
        long j16 = (j15 * j15) + j14;
        long j17 = j15 * j11;
        long j18 = i6;
        long j19 = j18 * j18;
        long j20 = i7 * 2;
        long j21 = j18 * j20;
        long j22 = i8 * 2;
        long j23 = j18 * j22;
        long j24 = i7;
        long j25 = (j24 * j24) + j23;
        long j26 = j20 * j22;
        long j27 = i9 * 2;
        long j28 = i10 * 2;
        long j29 = (j24 * j27) + (j18 * j28) + (((long) i8) * j22);
        long j30 = (j22 * j27) + (j20 * j28);
        long j31 = j22 * j28;
        long j32 = i9;
        long j33 = j2 - (j30 * 38);
        long j34 = j4 - (((j32 * j32) + j31) * 38);
        long j35 = j8 - ((j32 * j28) * 38);
        long j36 = j10 - ((((long) i10) * j28) * 38);
        long j37 = j13 - j19;
        long j38 = j16 - j21;
        long j39 = j17 - j25;
        long j40 = (((long) i5) * j11) - ((j18 * j27) + j26);
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j41 = i + i6;
        long j42 = i11 * 2;
        long j43 = j41 * j42;
        long j44 = i12 * 2;
        long j45 = i11;
        long j46 = (j45 * j45) + (j41 * j44);
        long j47 = i13 * 2;
        long j48 = i14 * 2;
        long j49 = i13;
        long j50 = ((long) i14) * j48;
        long j51 = (((j41 * j47) + (j42 * j44)) - j36) + j40;
        int i15 = ((int) j51) & 67108863;
        long j52 = ((((j45 * j47) + ((j41 * j48) + (((long) i12) * j44))) - j12) - j29) + (j51 >> 26);
        int i16 = ((int) j52) & 33554431;
        long j53 = ((((j52 >> 25) + ((j47 * j44) + (j42 * j48))) - j37) * 38) + j33;
        iArr2[0] = ((int) j53) & 67108863;
        long j54 = ((((j49 * j49) + (j44 * j48)) - j38) * 38) + j34 + (j53 >> 26);
        iArr2[1] = ((int) j54) & 67108863;
        long j55 = (((j49 * j48) - j39) * 38) + j35 + (j54 >> 26);
        iArr2[2] = ((int) j55) & 33554431;
        long j56 = ((j50 - j40) * 38) + j36 + (j55 >> 25);
        iArr2[3] = ((int) j56) & 67108863;
        long jOooO00o = C20593OooO0Oo.OooO00o(j29, 38L, j12, j56 >> 26);
        iArr2[4] = ((int) jOooO00o) & 33554431;
        long j57 = ((j41 * j41) - j33) + j37 + (jOooO00o >> 25);
        iArr2[5] = ((int) j57) & 67108863;
        long j58 = (j43 - j34) + j38 + (j57 >> 26);
        iArr2[6] = ((int) j58) & 67108863;
        long j59 = (j46 - j35) + j39 + (j58 >> 26);
        iArr2[7] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + ((long) i15);
        iArr2[8] = ((int) j60) & 67108863;
        iArr2[9] = i16 + ((int) (j60 >> 26));
    }

    public static void zzF(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        long j = ((long) i3) * 121666;
        int i10 = ((int) j) & 33554431;
        long j2 = j >> 25;
        long j3 = ((long) i5) * 121666;
        int i11 = ((int) j3) & 33554431;
        long j4 = ((long) i8) * 121666;
        long j5 = ((long) iArr[9]) * 121666;
        int i12 = ((int) j5) & 33554431;
        long j6 = (((long) i) * 121666) + ((j5 >> 25) * 38);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = (((long) i6) * 121666) + (j3 >> 25);
        iArr2[5] = ((int) j7) & 67108863;
        long j8 = (((long) i2) * 121666) + (j6 >> 26);
        iArr2[1] = ((int) j8) & 67108863;
        long j9 = (((long) i4) * 121666) + j2;
        iArr2[3] = ((int) j9) & 67108863;
        long j10 = (((long) i7) * 121666) + (j7 >> 26);
        iArr2[6] = ((int) j10) & 67108863;
        long j11 = (((long) i9) * 121666) + (j4 >> 25);
        iArr2[8] = ((int) j11) & 67108863;
        iArr2[2] = ((int) (j8 >> 26)) + i10;
        iArr2[4] = i11 + ((int) (j9 >> 26));
        iArr2[7] = (((int) j4) & 33554431) + ((int) (j10 >> 26));
        iArr2[9] = i12 + ((int) (j11 >> 26));
    }

    public static void zzG(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        zzQ(iArr, iArr3, iArr4);
        zzY(iArr4, 3, iArr4);
        zzR(iArr4, iArr3, iArr2);
    }

    public static void zzK(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void zzM(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void zzO(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    private static void zzP(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void zzQ(int[] iArr, int[] iArr2, int[] iArr3) {
        zzE(iArr, iArr2);
        zzR(iArr, iArr2, iArr2);
        int[] iArr4 = new int[10];
        zzE(iArr2, iArr4);
        zzR(iArr, iArr4, iArr4);
        zzY(iArr4, 2, iArr4);
        zzR(iArr2, iArr4, iArr4);
        int[] iArr5 = new int[10];
        zzY(iArr4, 5, iArr5);
        zzR(iArr4, iArr5, iArr5);
        int[] iArr6 = new int[10];
        zzY(iArr5, 5, iArr6);
        zzR(iArr4, iArr6, iArr6);
        zzY(iArr6, 10, iArr4);
        zzR(iArr5, iArr4, iArr4);
        zzY(iArr4, 25, iArr5);
        zzR(iArr4, iArr5, iArr5);
        zzY(iArr5, 25, iArr6);
        zzR(iArr4, iArr6, iArr6);
        zzY(iArr6, 50, iArr4);
        zzR(iArr5, iArr4, iArr4);
        zzY(iArr4, 125, iArr5);
        zzR(iArr4, iArr5, iArr5);
        zzY(iArr5, 2, iArr4);
        zzR(iArr4, iArr, iArr3);
    }

    public static void zzR(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = j * j4;
        long j6 = i3;
        long j7 = (j6 * j2) + j5;
        long j8 = i6;
        long j9 = (j6 * j4) + (j * j8);
        long j10 = i5;
        long j11 = (j10 * j2) + j9;
        long j12 = ((j10 * j4) + (j6 * j8)) << 1;
        long j13 = i8;
        long j14 = j * j13;
        long j15 = i7;
        long jOooO00o = C20593OooO0Oo.OooO00o(j15, j2, j14, j12);
        long j16 = (j10 * j8) << 1;
        long j17 = i10;
        long j18 = i9;
        long jOooO00o2 = C20593OooO0Oo.OooO00o(j18, j2, (j15 * j4) + (j6 * j13) + (j * j17), j16);
        long j19 = ((j18 * j4) + ((j15 * j8) + ((j10 * j13) + (j6 * j17)))) << 1;
        long j20 = (j15 * j13) + (((j18 * j8) + (j10 * j17)) << 1);
        long j21 = (j18 * j13) + (j15 * j17);
        long j22 = (j18 * j17) << 1;
        long j23 = i11;
        long j24 = i12;
        long j25 = j23 * j24;
        long j26 = i14;
        long j27 = j23 * j26;
        long j28 = i13;
        long j29 = (j28 * j24) + j27;
        long j30 = i16;
        long j31 = (j28 * j26) + (j23 * j30);
        long j32 = i15;
        long j33 = i18;
        long j34 = j23 * j33;
        long j35 = i17;
        long jOooO00o3 = C20593OooO0Oo.OooO00o(j35, j24, j34, ((j32 * j26) + (j28 * j30)) << 1);
        long j36 = i20;
        long j37 = (j35 * j26) + (j28 * j33) + (j23 * j36);
        long j38 = i19;
        long jOooO00o4 = C20593OooO0Oo.OooO00o(j38, j24, j37, (j32 * j30) << 1);
        long j39 = j3 - (((j26 * j38) + ((j35 * j30) + ((j32 * j33) + (j28 * j36)))) * 76);
        long j40 = j7 - (((j35 * j33) + (((j30 * j38) + (j32 * j36)) << 1)) * 38);
        long j41 = j11 - (((j38 * j33) + (j35 * j36)) * 38);
        long j42 = jOooO00o - ((j36 * j38) * 76);
        long j43 = j19 - j25;
        long j44 = j20 - j29;
        long j45 = j21 - ((j32 * j24) + j31);
        long j46 = j22 - jOooO00o3;
        long j47 = i + i11;
        long j48 = i2 + i12;
        long j49 = j47 * j48;
        long j50 = i4 + i14;
        long j51 = j47 * j50;
        long j52 = i3 + i13;
        long j53 = (j52 * j48) + j51;
        long j54 = i6 + i16;
        long j55 = i5 + i15;
        long j56 = (j55 * j48) + (j52 * j50) + (j47 * j54);
        long j57 = ((j55 * j50) + (j52 * j54)) << 1;
        long j58 = i8 + i18;
        long j59 = i7 + i17;
        long jOooO00o5 = C20593OooO0Oo.OooO00o(j59, j48, j47 * j58, j57);
        long j60 = i10 + i20;
        long j61 = i9 + i19;
        long jOooO00o6 = C20593OooO0Oo.OooO00o(j61, j48, (j59 * j50) + (j52 * j58) + (j47 * j60), (j55 * j54) << 1);
        long j62 = ((j50 * j61) + ((j59 * j54) + ((j55 * j58) + (j52 * j60)))) << 1;
        long j63 = (j59 * j58) + (((j54 * j61) + (j55 * j60)) << 1);
        long j64 = (j61 * j58) + (j59 * j60);
        long j65 = (j60 * j61) << 1;
        long j66 = (jOooO00o5 - j42) + j46;
        int i21 = ((int) j66) & 67108863;
        long j67 = ((jOooO00o6 - jOooO00o2) - jOooO00o4) + (j66 >> 26);
        int i22 = ((int) j67) & 33554431;
        long j68 = ((((j67 >> 25) + j62) - j43) * 38) + j39;
        iArr3[0] = ((int) j68) & 67108863;
        long j69 = ((j63 - j44) * 38) + j40 + (j68 >> 26);
        iArr3[1] = ((int) j69) & 67108863;
        long j70 = ((j64 - j45) * 38) + j41 + (j69 >> 26);
        iArr3[2] = ((int) j70) & 33554431;
        long j71 = ((j65 - j46) * 38) + j42 + (j70 >> 25);
        iArr3[3] = ((int) j71) & 67108863;
        long jOooO00o7 = C20593OooO0Oo.OooO00o(jOooO00o4, 38L, jOooO00o2, j71 >> 26);
        iArr3[4] = ((int) jOooO00o7) & 33554431;
        long j72 = (j49 - j39) + j43 + (jOooO00o7 >> 25);
        iArr3[5] = ((int) j72) & 67108863;
        long j73 = (j53 - j40) + j44 + (j72 >> 26);
        iArr3[6] = ((int) j73) & 67108863;
        long j74 = (j56 - j41) + j45 + (j73 >> 26);
        iArr3[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + ((long) i21);
        iArr3[8] = ((int) j75) & 67108863;
        iArr3[9] = i22 + ((int) (j75 >> 26));
    }

    public static void zzX(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static int[] zzXyE() {
        return new int[10];
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void zzZ(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void zzZI(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void zzZJ(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zzZK(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void zzZL(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        zzQ(iArr, i);
        zzQ(iArr, -i);
    }

    public static boolean zzZM(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return i == 0;
    }

    public static void zzZN(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i4 + (i3 >> 25);
        int i12 = i6 + (i5 >> 25);
        int i13 = i9 + (i8 >> 25);
        int i14 = ((i10 >> 25) * 38) + i;
        int i15 = i2 + (i14 >> 26);
        int i16 = i7 + (i12 >> 26);
        iArr[0] = i14 & 67108863;
        iArr[1] = i15 & 67108863;
        iArr[2] = (i3 & 33554431) + (i15 >> 26);
        iArr[3] = i11 & 67108863;
        iArr[4] = (i5 & 33554431) + (i11 >> 26);
        iArr[5] = i12 & 67108863;
        iArr[6] = i16 & 67108863;
        iArr[7] = (i8 & 33554431) + (i16 >> 26);
        iArr[8] = i13 & 67108863;
        iArr[9] = (i10 & 33554431) + (i13 >> 26);
    }

    public static void zzZO(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    private static int zzZR(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void zzY(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    private static void zzZ(byte[] bArr, int i, int[] iArr, int i2) {
        int iZzZR = zzZR(bArr, i);
        int iZzZR2 = zzZR(bArr, i + 4);
        int iZzZR3 = zzZR(bArr, i + 8);
        int iZzZR4 = zzZR(bArr, i + 12);
        iArr[i2] = iZzZR & 67108863;
        iArr[i2 + 1] = ((iZzZR >>> 26) | (iZzZR2 << 6)) & 67108863;
        iArr[i2 + 2] = ((iZzZR2 >>> 20) | (iZzZR3 << 12)) & 33554431;
        iArr[i2 + 3] = 67108863 & ((iZzZR4 << 19) | (iZzZR3 >>> 13));
        iArr[i2 + 4] = iZzZR4 >>> 7;
    }

    public static boolean zzP(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        zzR(iArr, iArr2, iArr4);
        zzE(iArr2, iArr5);
        zzR(iArr4, iArr5, iArr4);
        zzE(iArr5, iArr5);
        zzR(iArr5, iArr4, iArr5);
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        zzQ(iArr5, iArr6, iArr7);
        zzR(iArr7, iArr4, iArr7);
        int[] iArr8 = new int[10];
        zzE(iArr7, iArr8);
        zzR(iArr8, iArr2, iArr8);
        zzO(iArr8, iArr, iArr6);
        zzZL(iArr6);
        if (zzZM(iArr6)) {
            zzZ(iArr7, 0, iArr3, 0);
            return true;
        }
        zzY(iArr8, iArr, iArr6);
        zzZL(iArr6);
        if (!zzZM(iArr6)) {
            return false;
        }
        zzR(iArr7, f50943cK, iArr3);
        return true;
    }

    public static void zzY(byte[] bArr, int i, int[] iArr) {
        zzZ(bArr, i, iArr, 0);
        zzZ(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void zzY(int[] iArr, byte[] bArr, int i) {
        zzZ(iArr, 0, bArr, i);
        zzZ(iArr, 5, bArr, i + 16);
    }

    private static void zzY(int[] iArr, int i, int[] iArr2) {
        zzE(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                zzE(iArr2, iArr2);
            }
        }
    }

    private static void zzZ(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        zzP((i4 << 26) | i3, bArr, i2);
        zzP((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        zzP((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        zzP((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    private static void zzQ(int[] iArr, int i) {
        int i2 = iArr[9];
        int i3 = 16777215 & i2;
        int i4 = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = i4 & 67108863;
        int i5 = (i4 >> 26) + iArr[1];
        iArr[1] = i5 & 67108863;
        int i6 = (i5 >> 26) + iArr[2];
        iArr[2] = i6 & 33554431;
        int i7 = (i6 >> 25) + iArr[3];
        iArr[3] = i7 & 67108863;
        int i8 = (i7 >> 26) + iArr[4];
        iArr[4] = i8 & 33554431;
        int i9 = (i8 >> 25) + iArr[5];
        iArr[5] = i9 & 67108863;
        int i10 = (i9 >> 26) + iArr[6];
        iArr[6] = i10 & 67108863;
        int i11 = (i10 >> 26) + iArr[7];
        iArr[7] = 33554431 & i11;
        int i12 = (i11 >> 25) + iArr[8];
        iArr[8] = 67108863 & i12;
        iArr[9] = (i12 >> 26) + i3;
    }
}
