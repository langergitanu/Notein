package com.aspose.words.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYID {

    /* JADX INFO: renamed from: dc */
    private static final byte[] f50916dc = zzYGI.zzwb("SigEd448");
    private static final int[] zzWaq = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: cN */
    private static final int[] f50913cN = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};

    /* JADX INFO: renamed from: cO */
    private static final int[] f50914cO = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};

    /* JADX INFO: renamed from: cP */
    private static final int[] f50915cP = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};

    /* JADX INFO: renamed from: dd */
    private static zzZ[] f50917dd = null;

    /* JADX INFO: renamed from: cJ */
    private static int[] f50912cJ = null;

    private static void zzO(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void zzP(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void zzQ(byte[] bArr, byte[] bArr2, int i) {
        zzZ zzz = new zzZ((byte) 0);
        zzZ(bArr, zzz);
        zzZ(zzz, bArr2, 0);
    }

    private static int zzVJ(byte[] bArr) {
        return ((bArr[113] & 255) << 8) | (bArr[112] & 255);
    }

    private static boolean zzVK(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static byte[] zzVL(byte[] bArr) {
        long jZzZR = ((long) zzZR(bArr, 0)) & 4294967295L;
        long jZzZQ = ((long) (zzZQ(bArr, 4) << 4)) & 4294967295L;
        long jZzZR2 = ((long) zzZR(bArr, 7)) & 4294967295L;
        long jZzZQ2 = ((long) (zzZQ(bArr, 11) << 4)) & 4294967295L;
        long jZzZR3 = ((long) zzZR(bArr, 14)) & 4294967295L;
        long jZzZQ3 = ((long) (zzZQ(bArr, 18) << 4)) & 4294967295L;
        long jZzZR4 = ((long) zzZR(bArr, 21)) & 4294967295L;
        long jZzZQ4 = ((long) (zzZQ(bArr, 25) << 4)) & 4294967295L;
        long jZzZR5 = ((long) zzZR(bArr, 28)) & 4294967295L;
        long jZzZQ5 = ((long) (zzZQ(bArr, 32) << 4)) & 4294967295L;
        long jZzZR6 = ((long) zzZR(bArr, 35)) & 4294967295L;
        long jZzZQ6 = ((long) (zzZQ(bArr, 39) << 4)) & 4294967295L;
        long jZzZR7 = ((long) zzZR(bArr, 42)) & 4294967295L;
        long jZzZQ7 = ((long) (zzZQ(bArr, 46) << 4)) & 4294967295L;
        long jZzZR8 = ((long) zzZR(bArr, 49)) & 4294967295L;
        long jZzZQ8 = ((long) (zzZQ(bArr, 53) << 4)) & 4294967295L;
        long jZzZR9 = ((long) zzZR(bArr, 56)) & 4294967295L;
        long jZzZQ9 = ((long) (zzZQ(bArr, 60) << 4)) & 4294967295L;
        long jZzZR10 = ((long) zzZR(bArr, 63)) & 4294967295L;
        long jZzZQ10 = ((long) (zzZQ(bArr, 67) << 4)) & 4294967295L;
        long jZzZR11 = ((long) zzZR(bArr, 70)) & 4294967295L;
        long jZzZQ11 = ((long) (zzZQ(bArr, 74) << 4)) & 4294967295L;
        long jZzZR12 = ((long) zzZR(bArr, 77)) & 4294967295L;
        long jZzZQ12 = ((long) (zzZQ(bArr, 81) << 4)) & 4294967295L;
        long jZzZR13 = zzZR(bArr, 84);
        long j = jZzZR13 & 4294967295L;
        long jZzZQ13 = ((long) (zzZQ(bArr, 88) << 4)) & 4294967295L;
        long jZzZR14 = zzZR(bArr, 91);
        long j2 = jZzZR14 & 4294967295L;
        long jZzZQ14 = ((long) (zzZQ(bArr, 95) << 4)) & 4294967295L;
        long jZzZR15 = zzZR(bArr, 98);
        long j3 = jZzZR15 & 4294967295L;
        long jZzZQ15 = ((long) (zzZQ(bArr, 102) << 4)) & 4294967295L;
        long jZzZR16 = zzZR(bArr, 105);
        long jZzZQ16 = ((long) (zzZQ(bArr, 109) << 4)) & 4294967295L;
        long jZzVJ = ((long) zzVJ(bArr)) & 4294967295L;
        long j4 = jZzZQ16 + ((jZzZR16 & 4294967295L) >>> 28);
        long j5 = jZzZR16 & 268435455;
        long j6 = (j5 * 163752818) + (j4 * 30366549) + (jZzVJ * 43969588) + jZzZR9;
        long j7 = (j5 * 258169998) + (j4 * 163752818) + (jZzVJ * 30366549) + jZzZQ9;
        long j8 = (j5 * 96434764) + (j4 * 258169998) + (jZzVJ * 163752818) + jZzZR10;
        long j9 = (j5 * 227822194) + (j4 * 96434764) + (jZzVJ * 258169998) + jZzZQ10;
        long j10 = (j5 * 149865618) + (j4 * 227822194) + (jZzVJ * 96434764) + jZzZR11;
        long j11 = jZzZQ15 + (j3 >>> 28);
        long j12 = jZzZR15 & 268435455;
        long j13 = (j11 * 43969588) + jZzZQ7;
        long j14 = (j11 * 30366549) + (j5 * 43969588) + jZzZR8;
        long j15 = (j11 * 163752818) + (j5 * 30366549) + (j4 * 43969588) + jZzZQ8;
        long j16 = (j11 * 258169998) + j6;
        long j17 = (j11 * 96434764) + j7;
        long j18 = (j11 * 227822194) + j8;
        long j19 = (j11 * 149865618) + j9;
        long j20 = (j11 * 550336261) + j10;
        long j21 = (j12 * 43969588) + jZzZR7;
        long j22 = (j12 * 30366549) + j13;
        long j23 = (j12 * 163752818) + j14;
        long j24 = (j12 * 258169998) + j15;
        long j25 = (j12 * 96434764) + j16;
        long j26 = (j12 * 227822194) + j17;
        long j27 = (j12 * 149865618) + j18;
        long j28 = (j12 * 550336261) + j19;
        long j29 = jZzZQ14 + (j2 >>> 28);
        long j30 = jZzZR14 & 268435455;
        long j31 = (j29 * 163752818) + j22;
        long j32 = (j29 * 258169998) + j23;
        long j33 = (j29 * 149865618) + j26;
        long j34 = (j30 * 43969588) + jZzZR6;
        long j35 = (j30 * 30366549) + (j29 * 43969588) + jZzZQ6;
        long j36 = (j30 * 163752818) + (j29 * 30366549) + j21;
        long j37 = (j30 * 258169998) + j31;
        long j38 = (j30 * 96434764) + j32;
        long j39 = (j30 * 227822194) + (j29 * 96434764) + j24;
        long j40 = (j30 * 149865618) + (j29 * 227822194) + j25;
        long j41 = (j30 * 550336261) + j33;
        long j42 = jZzZQ13 + (j >>> 28);
        long j43 = (j42 * 30366549) + j34;
        long j44 = (j42 * 163752818) + j35;
        long j45 = (j42 * 258169998) + j36;
        long j46 = (j42 * 149865618) + j39;
        long j47 = (j5 * 550336261) + (j4 * 149865618) + (jZzVJ * 227822194) + jZzZQ11 + (j20 >>> 28);
        long j48 = j20 & 268435455;
        long j49 = (j4 * 550336261) + (jZzVJ * 149865618) + jZzZR12 + (j47 >>> 28);
        long j50 = (jZzVJ * 550336261) + jZzZQ12 + (j49 >>> 28);
        long j51 = j49 & 268435455;
        long j52 = (jZzZR13 & 268435455) + (j50 >>> 28);
        long j53 = j50 & 268435455;
        long j54 = (j52 * 43969588) + jZzZR5;
        long j55 = (j52 * 30366549) + (j42 * 43969588) + jZzZQ5;
        long j56 = (j52 * 163752818) + j43;
        long j57 = (j52 * 258169998) + j44;
        long j58 = (j52 * 96434764) + j45;
        long j59 = (j52 * 227822194) + (j42 * 96434764) + j37;
        long j60 = (j52 * 149865618) + (j42 * 227822194) + j38;
        long j61 = (j52 * 550336261) + j46;
        long j62 = (j53 * 43969588) + jZzZQ4;
        long j63 = (j53 * 30366549) + j54;
        long j64 = (j53 * 163752818) + j55;
        long j65 = (j53 * 258169998) + j56;
        long j66 = (j53 * 96434764) + j57;
        long j67 = (j53 * 227822194) + j58;
        long j68 = (j53 * 149865618) + j59;
        long j69 = (j53 * 550336261) + j60;
        long j70 = (j51 * 43969588) + jZzZR4;
        long j71 = (j51 * 30366549) + j62;
        long j72 = (j51 * 163752818) + j63;
        long j73 = (j51 * 258169998) + j64;
        long j74 = (j51 * 96434764) + j65;
        long j75 = (j51 * 227822194) + j66;
        long j76 = (j51 * 149865618) + j67;
        long j77 = (j51 * 550336261) + j68;
        long j78 = (j29 * 550336261) + j27 + (j41 >>> 28);
        long j79 = j41 & 268435455;
        long j80 = j28 + (j78 >>> 28);
        long j81 = j78 & 268435455;
        long j82 = j48 + (j80 >>> 28);
        long j83 = j80 & 268435455;
        long j84 = (j47 & 268435455) + (j82 >>> 28);
        long j85 = j82 & 268435455;
        long j86 = (j84 * 43969588) + jZzZQ3;
        long j87 = (j84 * 30366549) + j70;
        long j88 = (j84 * 163752818) + j71;
        long j89 = (j84 * 258169998) + j72;
        long j90 = (j84 * 96434764) + j73;
        long j91 = (j84 * 227822194) + j74;
        long j92 = (j84 * 149865618) + j75;
        long j93 = (j84 * 550336261) + j76;
        long j94 = (j85 * 163752818) + j87;
        long j95 = (j85 * 258169998) + j88;
        long j96 = (j85 * 96434764) + j89;
        long j97 = (j85 * 227822194) + j90;
        long j98 = (j85 * 149865618) + j91;
        long j99 = (j83 * 43969588) + jZzZQ2;
        long j100 = (j83 * 30366549) + (j85 * 43969588) + jZzZR3;
        long j101 = (j83 * 163752818) + (j85 * 30366549) + j86;
        long j102 = (j83 * 258169998) + j94;
        long j103 = (j83 * 96434764) + j95;
        long j104 = (j83 * 227822194) + j96;
        long j105 = (j83 * 149865618) + j97;
        long j106 = (j83 * 550336261) + j98;
        long j107 = j61 + (j69 >>> 28);
        long j108 = (j42 * 550336261) + j40 + (j107 >>> 28);
        long j109 = j79 + (j108 >>> 28);
        long j110 = j108 & 268435455;
        long j111 = j81 + (j109 >>> 28);
        long j112 = j109 & 268435455;
        long j113 = (j111 * 43969588) + jZzZR2;
        long j114 = (j111 * 30366549) + j99;
        long j115 = (j111 * 163752818) + j100;
        long j116 = (j111 * 258169998) + j101;
        long j117 = (j111 * 96434764) + j102;
        long j118 = (j111 * 227822194) + j103;
        long j119 = (j111 * 149865618) + j104;
        long j120 = (j111 * 550336261) + j105;
        long j121 = (j110 * 4) + ((j107 & 268435455) >>> 26) + 1;
        long j122 = (78101261 * j121) + jZzZR;
        long j123 = (141809365 * j121) + (43969588 * j112) + jZzZQ + (j122 >>> 28);
        long j124 = (175155932 * j121) + (30366549 * j112) + j113 + (j123 >>> 28);
        long j125 = (64542499 * j121) + (163752818 * j112) + j114 + (j124 >>> 28);
        long j126 = (158326419 * j121) + (258169998 * j112) + j115 + (j125 >>> 28);
        long j127 = (191173276 * j121) + (96434764 * j112) + j116 + (j126 >>> 28);
        long j128 = (104575268 * j121) + (227822194 * j112) + j117 + (j127 >>> 28);
        long j129 = (j121 * 137584065) + (149865618 * j112) + j118 + (j128 >>> 28);
        long j130 = (j112 * 550336261) + j119 + (j129 >>> 28);
        long j131 = j120 + (j130 >>> 28);
        long j132 = j106 + (j131 >>> 28);
        long j133 = (j85 * 550336261) + j92 + (j132 >>> 28);
        long j134 = j132 & 268435455;
        long j135 = j93 + (j133 >>> 28);
        long j136 = j77 + (j135 >>> 28);
        long j137 = (j69 & 268435455) + (j136 >>> 28);
        long j138 = (j107 & 67108863) + (j137 >>> 28);
        long j139 = (j138 >>> 26) - 1;
        long j140 = (j122 & 268435455) - (j139 & 78101261);
        long j141 = ((j123 & 268435455) - (j139 & 141809365)) + (j140 >> 28);
        long j142 = ((j124 & 268435455) - (j139 & 175155932)) + (j141 >> 28);
        long j143 = ((j125 & 268435455) - (j139 & 64542499)) + (j142 >> 28);
        long j144 = ((j126 & 268435455) - (j139 & 158326419)) + (j143 >> 28);
        long j145 = ((j127 & 268435455) - (j139 & 191173276)) + (j144 >> 28);
        long j146 = ((j128 & 268435455) - (j139 & 104575268)) + (j145 >> 28);
        long j147 = j145 & 268435455;
        long j148 = ((j129 & 268435455) - (j139 & 137584065)) + (j146 >> 28);
        long j149 = (j130 & 268435455) + (j148 >> 28);
        long j150 = (j131 & 268435455) + (j149 >> 28);
        long j151 = j134 + (j150 >> 28);
        long j152 = (j133 & 268435455) + (j151 >> 28);
        long j153 = (j135 & 268435455) + (j152 >> 28);
        long j154 = (j136 & 268435455) + (j153 >> 28);
        long j155 = (j137 & 268435455) + (j154 >> 28);
        long j156 = j154 & 268435455;
        byte[] bArr2 = new byte[57];
        zzX((j140 & 268435455) | ((j141 & 268435455) << 28), bArr2, 0);
        zzX(((j143 & 268435455) << 28) | (j142 & 268435455), bArr2, 7);
        zzX((j147 << 28) | (j144 & 268435455), bArr2, 14);
        zzX((j146 & 268435455) | ((j148 & 268435455) << 28), bArr2, 21);
        zzX((j149 & 268435455) | ((j150 & 268435455) << 28), bArr2, 28);
        zzX((j151 & 268435455) | ((j152 & 268435455) << 28), bArr2, 35);
        zzX((j153 & 268435455) | (j156 << 28), bArr2, 42);
        zzX((j155 & 268435455) | (((j138 & 67108863) + (j155 >> 28)) << 28), bArr2, 49);
        return bArr2;
    }

    private static boolean zzVM(byte[] bArr) {
        if (bArr[56] != 0) {
            return false;
        }
        int[] iArr = new int[14];
        zzX(bArr, 0, iArr);
        return !zzYHP.zzw(iArr, f50913cN);
    }

    private static boolean zzVN(byte[] bArr) {
        if ((bArr[56] & Ascii.DEL) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        zzX(bArr, 0, iArr);
        return !zzYHP.zzw(iArr, zzWaq);
    }

    private static byte[] zzW(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        zzX(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        zzX(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        zzX(bArr3, 0, iArr3);
        zzYHP.zzG(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            zzP(iArr[i], bArr4, i * 4);
        }
        return zzVL(bArr4);
    }

    private static void zzX(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 14; i2++) {
            iArr[i2] = zzZR(bArr, i2 * 4);
        }
    }

    private static synchronized void zzXyF() {
        try {
            if (f50912cJ != null) {
                return;
            }
            byte b = 0;
            zzZ zzz = new zzZ(b);
            zzYIF.zzZ(f50914cO, 0, zzz.zzW2i, 0);
            zzYIF.zzZ(f50915cP, 0, zzz.f50919cU, 0);
            zzYIF.zzZK(zzz.f50920cV);
            f50917dd = zzZ(zzz, 32);
            f50912cJ = new int[2560];
            int i = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                zzZ[] zzzArr = new zzZ[5];
                zzZ zzz2 = new zzZ(b);
                zzX(zzz2);
                int i3 = 0;
                while (true) {
                    if (i3 >= 5) {
                        break;
                    }
                    zzZ(true, zzz, zzz2);
                    zzY(zzz);
                    zzzArr[i3] = zzZ(zzz);
                    if (i2 + i3 != 8) {
                        for (int i4 = 1; i4 < 18; i4++) {
                            zzY(zzz);
                        }
                    }
                    i3++;
                }
                zzZ[] zzzArr2 = new zzZ[16];
                zzzArr2[0] = zzz2;
                int i5 = 1;
                for (int i6 = 0; i6 < 4; i6++) {
                    int i7 = 1 << i6;
                    int i8 = 0;
                    while (i8 < i7) {
                        zzZ zzZ2 = zzZ(zzzArr2[i5 - i7]);
                        zzzArr2[i5] = zzZ2;
                        zzZ(false, zzzArr[i6], zzZ2);
                        i8++;
                        i5++;
                    }
                }
                for (int i9 = 0; i9 < 16; i9++) {
                    zzZ zzz3 = zzzArr2[i9];
                    int[] iArr = zzz3.f50920cV;
                    zzYIF.zzG(iArr, iArr);
                    int[] iArr2 = zzz3.zzW2i;
                    zzYIF.zzR(iArr2, zzz3.f50920cV, iArr2);
                    int[] iArr3 = zzz3.f50919cU;
                    zzYIF.zzR(iArr3, zzz3.f50920cV, iArr3);
                    zzYIF.zzZ(zzz3.zzW2i, 0, f50912cJ, i);
                    zzYIF.zzZ(zzz3.f50919cU, 0, f50912cJ, i + 16);
                    i += 32;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void zzY(byte[] bArr, int[] iArr) {
        zzX(bArr, 0, iArr);
    }

    private static boolean zzZ(byte[] bArr, int i, zzZ zzz) {
        byte[] bArrCopyOfRange = zzYGU.copyOfRange(bArr, i, i + 57);
        if (!zzVN(bArrCopyOfRange)) {
            return false;
        }
        byte b = bArrCopyOfRange[56];
        int i2 = (b & UnsignedBytes.MAX_POWER_OF_TWO) >>> 7;
        bArrCopyOfRange[56] = (byte) (b & Ascii.DEL);
        zzYIF.zzY(bArrCopyOfRange, 0, zzz.f50919cU);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        zzYIF.zzE(zzz.f50919cU, iArr);
        zzYIF.zzX(iArr, 39081, iArr2);
        zzYIF.zzM(iArr, iArr);
        iArr[0] = iArr[0] + 1;
        iArr2[0] = iArr2[0] + 1;
        if (!zzYIF.zzP(iArr, iArr2, zzz.zzW2i)) {
            return false;
        }
        zzYIF.zzZL(zzz.zzW2i);
        if (i2 == 1 && zzYIF.zzZM(zzz.zzW2i)) {
            return false;
        }
        int[] iArr3 = zzz.zzW2i;
        if (!(i2 != (iArr3[0] & 1))) {
            zzYIF.zzM(iArr3, iArr3);
        }
        zzYIF.zzZK(zzz.f50920cV);
        return true;
    }

    private static int zzZQ(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int zzZR(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void zzq(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 57);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | UnsignedBytes.MAX_POWER_OF_TWO);
        byte b = bArr2[56];
        bArr2[56] = (byte) 0;
    }

    public abstract zzYUB zzXDw();

    public final void zzr(byte[] bArr, byte[] bArr2) {
        zzYUB zzyubZzXDw = zzXDw();
        byte[] bArr3 = new byte[114];
        zzyubZzXDw.update(bArr, 0, 57);
        zzyubZzXDw.zzw(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        zzq(bArr3, bArr4);
        zzQ(bArr4, bArr2, 0);
    }

    private static void zzX(long j, byte[] bArr, int i) {
        zzP((int) j, bArr, i);
        zzO((int) (j >>> 32), bArr, i + 4);
    }

    private static void zzY(zzZ zzz) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        zzYIF.zzY(zzz.zzW2i, zzz.f50919cU, iArr);
        zzYIF.zzE(iArr, iArr);
        zzYIF.zzE(zzz.zzW2i, iArr2);
        zzYIF.zzE(zzz.f50919cU, iArr3);
        zzYIF.zzY(iArr2, iArr3, iArr4);
        zzYIF.zzZN(iArr4);
        zzYIF.zzE(zzz.f50920cV, iArr5);
        zzYIF.zzY(iArr5, iArr5, iArr5);
        zzYIF.zzZN(iArr5);
        zzYIF.zzO(iArr4, iArr5, iArr6);
        zzYIF.zzO(iArr, iArr4, iArr);
        zzYIF.zzO(iArr2, iArr3, iArr2);
        zzYIF.zzR(iArr, iArr6, zzz.zzW2i);
        zzYIF.zzR(iArr4, iArr2, zzz.f50919cU);
        zzYIF.zzR(iArr4, iArr6, zzz.f50920cV);
    }

    private static void zzX(zzZ zzz) {
        zzYIF.zzZI(zzz.zzW2i);
        zzYIF.zzZK(zzz.f50919cU);
        zzYIF.zzZK(zzz.f50920cV);
    }

    public static class zzY {

        /* JADX INFO: renamed from: cU */
        int[] f50918cU;
        int[] zzW2i;

        private zzY() {
            this.zzW2i = new int[16];
            this.f50918cU = new int[16];
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    private static byte[] zzP(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 0;
        int i3 = 14;
        int i4 = 28;
        int i5 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i6 = iArr[i3];
            iArr2[i4 - 1] = (i5 << 16) | (i6 >>> 16);
            i4 -= 2;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[448];
        int i7 = 1 << i;
        int i8 = i7 - 1;
        int i9 = i7 >>> 1;
        int i10 = 0;
        int i11 = 0;
        while (i2 < 28) {
            int i12 = iArr2[i2];
            while (i10 < 16) {
                int i13 = i12 >>> i10;
                if ((i13 & 1) == i11) {
                    i10++;
                } else {
                    int i14 = (i13 & i8) + i11;
                    int i15 = i14 & i9;
                    int i16 = i14 - (i15 << 1);
                    i11 = i15 >>> (i - 1);
                    bArr[(i2 << 4) + i10] = (byte) i16;
                    i10 += i;
                }
            }
            i2++;
            i10 -= 16;
        }
        return bArr;
    }

    public static class zzZ {

        /* JADX INFO: renamed from: cU */
        int[] f50919cU;

        /* JADX INFO: renamed from: cV */
        int[] f50920cV;
        int[] zzW2i;

        private zzZ() {
            this.zzW2i = new int[16];
            this.f50919cU = new int[16];
            this.f50920cV = new int[16];
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static void zzZ(zzYUB zzyub, byte b, byte[] bArr) {
        byte[] bArr2 = f50916dc;
        zzyub.update(bArr2, 0, bArr2.length);
        zzyub.update(b);
        zzyub.update((byte) bArr.length);
        zzyub.update(bArr, 0, bArr.length);
    }

    public static void zzZ(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    private static void zzZ(zzYUB zzyub, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        zzZ(zzyub, b, bArr4);
        zzyub.update(bArr, 57, 57);
        zzyub.update(bArr5, i2, i3);
        zzyub.zzw(bArr, 0, 114);
        byte[] bArrZzVL = zzVL(bArr);
        byte[] bArr7 = new byte[57];
        zzQ(bArrZzVL, bArr7, 0);
        zzZ(zzyub, b, bArr4);
        zzyub.update(bArr7, 0, 57);
        zzyub.update(bArr3, i, 57);
        zzyub.update(bArr5, i2, i3);
        zzyub.zzw(bArr, 0, 114);
        byte[] bArrZzW = zzW(bArrZzVL, zzVL(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 57);
        System.arraycopy(bArrZzW, 0, bArr6, i4 + 57, 57);
    }

    private void zzZ(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (zzVK(bArr3)) {
            zzYUB zzyubZzXDw = zzXDw();
            byte[] bArr6 = new byte[114];
            zzyubZzXDw.update(bArr, 0, 57);
            zzyubZzXDw.zzw(bArr6, 0, 114);
            byte[] bArr7 = new byte[57];
            zzq(bArr6, bArr7);
            zzZ(zzyubZzXDw, bArr6, bArr7, bArr2, 0, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
            return;
        }
        throw new IllegalArgumentException(AbstractJwtRequest.ClaimNames.CTX);
    }

    private boolean zzZ(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        if (zzVK(bArr3)) {
            byte b = 0;
            byte[] bArrCopyOfRange = zzYGU.copyOfRange(bArr, 0, 57);
            byte[] bArrCopyOfRange2 = zzYGU.copyOfRange(bArr, 57, 114);
            if (!zzVN(bArrCopyOfRange) || !zzVM(bArrCopyOfRange2)) {
                return false;
            }
            zzZ zzz = new zzZ(b);
            if (!zzZ(bArr2, 0, zzz)) {
                return false;
            }
            zzYUB zzyubZzXDw = zzXDw();
            byte[] bArr5 = new byte[114];
            zzZ(zzyubZzXDw, (byte) 0, bArr3);
            zzyubZzXDw.update(bArrCopyOfRange, 0, 57);
            zzyubZzXDw.update(bArr2, 0, 57);
            zzyubZzXDw.update(bArr4, 0, i4);
            zzyubZzXDw.zzw(bArr5, 0, 114);
            byte[] bArrZzVL = zzVL(bArr5);
            int[] iArr = new int[14];
            zzY(bArrCopyOfRange2, iArr);
            int[] iArr2 = new int[14];
            zzY(bArrZzVL, iArr2);
            zzZ zzz2 = new zzZ(b);
            zzZ(iArr, iArr2, zzz, zzz2);
            byte[] bArr6 = new byte[57];
            zzZ(zzz2, bArr6, 0);
            return zzYGU.zzp(bArr6, bArrCopyOfRange);
        }
        throw new IllegalArgumentException(AbstractJwtRequest.ClaimNames.CTX);
    }

    private static zzZ zzZ(zzZ zzz) {
        zzZ zzz2 = new zzZ((byte) 0);
        zzYIF.zzZ(zzz.zzW2i, 0, zzz2.zzW2i, 0);
        zzYIF.zzZ(zzz.f50919cU, 0, zzz2.f50919cU, 0);
        zzYIF.zzZ(zzz.f50920cV, 0, zzz2.f50920cV, 0);
        return zzz2;
    }

    private static void zzZ(int i, int i2, zzY zzy) {
        int i3 = i * 512;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            zzYHP.zzZ(16, i5, f50912cJ, i3, zzy.zzW2i);
            zzYHP.zzZ(16, i5, f50912cJ, i3 + 16, zzy.f50918cU);
            i3 += 32;
        }
    }

    private static zzZ[] zzZ(zzZ zzz, int i) {
        zzZ zzZ2 = zzZ(zzz);
        zzY(zzZ2);
        zzZ[] zzzArr = new zzZ[i];
        zzzArr[0] = zzZ(zzz);
        for (int i2 = 1; i2 < i; i2++) {
            zzZ zzZ3 = zzZ(zzzArr[i2 - 1]);
            zzzArr[i2] = zzZ3;
            zzZ(false, zzZ2, zzZ3);
        }
        return zzzArr;
    }

    private static void zzZ(byte[] bArr, zzZ zzz) {
        zzXyF();
        zzX(zzz);
        int[] iArr = new int[15];
        zzX(bArr, 0, iArr);
        iArr[14] = zzYHP.zzZ(14, (~iArr[0]) & 1, iArr, f50913cN, iArr) + 4;
        zzYHP.zzV(15, iArr, 0);
        zzY zzy = new zzY((byte) 0);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 = (i4 & (~(1 << i5))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i5);
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                zzZ(i3, ((-i6) ^ i4) & 15, zzy);
                zzYIF.zzK(i6, zzy.zzW2i);
                zzZ(zzy, zzz);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                zzY(zzz);
            }
        }
    }

    private static void zzZ(int[] iArr, int[] iArr2, zzZ zzz, zzZ zzz2) {
        zzXyF();
        byte[] bArrZzP = zzP(iArr, 7);
        byte[] bArrZzP2 = zzP(iArr2, 5);
        zzZ[] zzzArrZzZ = zzZ(zzz, 8);
        zzX(zzz2);
        int i = 447;
        while (i > 0 && (bArrZzP[i] | bArrZzP2[i]) == 0) {
            i--;
        }
        while (true) {
            byte b = bArrZzP[i];
            if (b != 0) {
                int i2 = b >> 31;
                zzZ(i2 != 0, f50917dd[(b ^ i2) >>> 1], zzz2);
            }
            byte b2 = bArrZzP2[i];
            if (b2 != 0) {
                int i3 = b2 >> 31;
                zzZ(i3 != 0, zzzArrZzZ[(b2 ^ i3) >>> 1], zzz2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                zzY(zzz2);
            }
        }
    }

    public final void zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, byte[] bArr5, int i3) {
        zzZ(bArr, 0, bArr2, 0, bArr3, (byte) 0, bArr4, 0, i2, bArr5, 0);
    }

    public final boolean zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        return zzZ(bArr, 0, bArr2, 0, bArr3, bArr4, 0, i);
    }

    private static void zzZ(zzZ zzz, byte[] bArr, int i) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        zzYIF.zzG(zzz.f50920cV, iArr2);
        zzYIF.zzR(zzz.zzW2i, iArr2, iArr);
        zzYIF.zzR(zzz.f50919cU, iArr2, iArr2);
        zzYIF.zzZL(iArr);
        zzYIF.zzZL(iArr2);
        zzYIF.zzY(iArr2, bArr, i);
        bArr[i + 56] = (byte) ((iArr[0] & 1) << 7);
    }

    private static void zzZ(boolean z, zzZ zzz, zzZ zzz2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        if (z) {
            zzYIF.zzO(zzz.f50919cU, zzz.zzW2i, iArr12);
            iArr2 = iArr6;
            iArr = iArr9;
            iArr4 = iArr10;
            iArr3 = iArr11;
        } else {
            zzYIF.zzY(zzz.f50919cU, zzz.zzW2i, iArr12);
            iArr = iArr6;
            iArr2 = iArr9;
            iArr3 = iArr10;
            iArr4 = iArr11;
        }
        zzYIF.zzR(zzz.f50920cV, zzz2.f50920cV, iArr5);
        zzYIF.zzE(iArr5, iArr6);
        zzYIF.zzR(zzz.zzW2i, zzz2.zzW2i, iArr7);
        zzYIF.zzR(zzz.f50919cU, zzz2.f50919cU, iArr8);
        zzYIF.zzR(iArr7, iArr8, iArr9);
        zzYIF.zzX(iArr9, 39081, iArr9);
        zzYIF.zzY(iArr6, iArr9, iArr3);
        zzYIF.zzO(iArr6, iArr9, iArr4);
        zzYIF.zzY(zzz2.zzW2i, zzz2.f50919cU, iArr9);
        zzYIF.zzR(iArr12, iArr9, iArr12);
        zzYIF.zzY(iArr8, iArr7, iArr);
        zzYIF.zzO(iArr8, iArr7, iArr2);
        zzYIF.zzZN(iArr);
        zzYIF.zzO(iArr12, iArr6, iArr12);
        zzYIF.zzR(iArr12, iArr5, iArr12);
        zzYIF.zzR(iArr9, iArr5, iArr9);
        zzYIF.zzR(iArr10, iArr12, zzz2.zzW2i);
        zzYIF.zzR(iArr9, iArr11, zzz2.f50919cU);
        zzYIF.zzR(iArr10, iArr11, zzz2.f50920cV);
    }

    private static void zzZ(zzY zzy, zzZ zzz) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        zzYIF.zzE(zzz.f50920cV, iArr);
        zzYIF.zzR(zzy.zzW2i, zzz.zzW2i, iArr2);
        zzYIF.zzR(zzy.f50918cU, zzz.f50919cU, iArr3);
        zzYIF.zzR(iArr2, iArr3, iArr4);
        zzYIF.zzX(iArr4, 39081, iArr4);
        zzYIF.zzY(iArr, iArr4, iArr5);
        zzYIF.zzO(iArr, iArr4, iArr6);
        zzYIF.zzY(zzy.zzW2i, zzy.f50918cU, iArr);
        zzYIF.zzY(zzz.zzW2i, zzz.f50919cU, iArr4);
        zzYIF.zzR(iArr, iArr4, iArr7);
        zzYIF.zzY(iArr3, iArr2, iArr);
        zzYIF.zzO(iArr3, iArr2, iArr4);
        zzYIF.zzZN(iArr);
        zzYIF.zzO(iArr7, iArr, iArr7);
        zzYIF.zzR(iArr7, zzz.f50920cV, iArr7);
        zzYIF.zzR(iArr4, zzz.f50920cV, iArr4);
        zzYIF.zzR(iArr5, iArr7, zzz.zzW2i);
        zzYIF.zzR(iArr4, iArr6, zzz.f50919cU);
        zzYIF.zzR(iArr5, iArr6, zzz.f50920cV);
    }
}
