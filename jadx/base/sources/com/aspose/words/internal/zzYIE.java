package com.aspose.words.internal;

import com.aspose.words.WarningType;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYIE {

    /* JADX INFO: renamed from: cM */
    private static final byte[] f50922cM = zzYGI.zzwb("SigEd25519 no Ed25519 collisions");
    private static final int[] zzWaq = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: cN */
    private static final int[] f50923cN = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, WarningType.HINT};

    /* JADX INFO: renamed from: cO */
    private static final int[] f50924cO = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* JADX INFO: renamed from: cP */
    private static final int[] f50925cP = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* JADX INFO: renamed from: cQ */
    private static final int[] f50926cQ = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};

    /* JADX INFO: renamed from: cR */
    private static final int[] f50927cR = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* JADX INFO: renamed from: cS */
    private static final int[] f50928cS = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* JADX INFO: renamed from: cT */
    private static zzY[] f50929cT = null;

    /* JADX INFO: renamed from: cJ */
    private static int[] f50921cJ = null;

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

    private static boolean zzU(byte[] bArr, byte b) {
        if (bArr == null && b == 0) {
            return true;
        }
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
        long jZzZR8 = zzZR(bArr, 49);
        long j = jZzZR8 & 4294967295L;
        long jZzZQ8 = ((long) (zzZQ(bArr, 53) << 4)) & 4294967295L;
        long jZzZR9 = zzZR(bArr, 56);
        long jZzZQ9 = ((long) (zzZQ(bArr, 60) << 4)) & 4294967295L;
        long j2 = ((long) bArr[63]) & 255;
        long j3 = jZzZQ9 + ((jZzZR9 & 4294967295L) >> 28);
        long j4 = jZzZR9 & 268435455;
        long j5 = (jZzZR7 - (j2 * (-6428113))) - (j3 * 5343);
        long j6 = (jZzZR5 - (j3 * (-50998291))) - (j4 * 19280294);
        long j7 = ((jZzZQ5 - (j2 * (-50998291))) - (j3 * 19280294)) - (j4 * 127719000);
        long j8 = ((jZzZR6 - (j2 * 19280294)) - (j3 * 127719000)) - (j4 * (-6428113));
        long j9 = ((jZzZQ6 - (j2 * 127719000)) - (j3 * (-6428113))) - (j4 * 5343);
        long j10 = jZzZQ8 + (j >> 28);
        long j11 = jZzZR8 & 268435455;
        long j12 = j8 - (j10 * 5343);
        long j13 = (j7 - (j10 * (-6428113))) - (j11 * 5343);
        long j14 = (jZzZQ7 - (j2 * 5343)) + (j5 >> 28);
        long j15 = ((jZzZR4 - (j10 * (-50998291))) - (j11 * 19280294)) - (j14 * 127719000);
        long j16 = (((jZzZQ4 - (j4 * (-50998291))) - (j10 * 19280294)) - (j11 * 127719000)) - (j14 * (-6428113));
        long j17 = ((j6 - (j10 * 127719000)) - (j11 * (-6428113))) - (j14 * 5343);
        long j18 = (j5 & 268435455) + (j9 >> 28);
        long j19 = (jZzZR3 - (j14 * (-50998291))) - (j18 * 19280294);
        long j20 = ((jZzZQ3 - (j11 * (-50998291))) - (j14 * 19280294)) - (j18 * 127719000);
        long j21 = j16 - (j18 * 5343);
        long j22 = (j9 & 268435455) + (j12 >> 28);
        long j23 = (jZzZQ2 - (j18 * (-50998291))) - (j22 * 19280294);
        long j24 = (j15 - (j18 * (-6428113))) - (j22 * 5343);
        long j25 = (j12 & 268435455) + (j13 >> 28);
        long j26 = jZzZQ - (j25 * (-50998291));
        long j27 = (jZzZR2 - (j22 * (-50998291))) - (j25 * 19280294);
        long j28 = j23 - (j25 * 127719000);
        long j29 = (j19 - (j22 * 127719000)) - (j25 * (-6428113));
        long j30 = (j20 - (j22 * (-6428113))) - (j25 * 5343);
        long j31 = j17 + (j21 >> 28);
        long j32 = j21 & 268435455;
        long j33 = (j13 & 268435455) + (j31 >> 28);
        long j34 = j31 & 268435455;
        long j35 = j34 >>> 27;
        long j36 = j33 + j35;
        long j37 = jZzZR - (j36 * (-50998291));
        long j38 = j27 - (j36 * 127719000);
        long j39 = j28 - (j36 * (-6428113));
        long j40 = j29 - (j36 * 5343);
        long j41 = (j26 - (j36 * 19280294)) + (j37 >> 28);
        long j42 = j37 & 268435455;
        long j43 = j38 + (j41 >> 28);
        long j44 = j39 + (j43 >> 28);
        long j45 = j40 + (j44 >> 28);
        long j46 = j30 + (j45 >> 28);
        long j47 = j24 + (j46 >> 28);
        long j48 = j32 + (j47 >> 28);
        long j49 = j34 + (j48 >> 28);
        long j50 = (j49 >> 28) - j35;
        long j51 = j42 + (j50 & (-50998291));
        long j52 = (j41 & 268435455) + (j50 & 19280294) + (j51 >> 28);
        long j53 = (j43 & 268435455) + (j50 & 127719000) + (j52 >> 28);
        long j54 = (j44 & 268435455) + (j50 & (-6428113)) + (j53 >> 28);
        long j55 = (j45 & 268435455) + (j50 & 5343) + (j54 >> 28);
        long j56 = (j46 & 268435455) + (j55 >> 28);
        long j57 = (j47 & 268435455) + (j56 >> 28);
        long j58 = (j48 & 268435455) + (j57 >> 28);
        long j59 = (j49 & 268435455) + (j58 >> 28);
        long j60 = j58 & 268435455;
        byte[] bArr2 = new byte[32];
        zzX((j51 & 268435455) | ((j52 & 268435455) << 28), bArr2, 0);
        zzX((j53 & 268435455) | ((j54 & 268435455) << 28), bArr2, 7);
        zzX(((j56 & 268435455) << 28) | (j55 & 268435455), bArr2, 14);
        zzX((j60 << 28) | (j57 & 268435455), bArr2, 21);
        zzP((int) j59, bArr2, 28);
        return bArr2;
    }

    private static boolean zzVM(byte[] bArr) {
        int[] iArr = new int[8];
        zzX(bArr, 0, iArr);
        return !zzYHO.zzB(iArr, f50923cN);
    }

    private static boolean zzVN(byte[] bArr) {
        int[] iArr = new int[8];
        zzX(bArr, 0, iArr);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !zzYHO.zzB(iArr, zzWaq);
    }

    private static byte[] zzW(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        zzX(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        zzX(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        zzX(bArr3, 0, iArr3);
        zzYHO.zzK(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i = 0; i < 16; i++) {
            zzP(iArr[i], bArr4, i * 4);
        }
        return zzVL(bArr4);
    }

    private static void zzX(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = zzZR(bArr, i2 * 4);
        }
    }

    private static synchronized void zzXyF() {
        try {
            if (f50921cJ != null) {
                return;
            }
            byte b = 0;
            zzY zzy = new zzY(b);
            int[] iArr = f50924cO;
            zzYIH.zzZ(iArr, 0, zzy.zzW2i, 0);
            int[] iArr2 = f50925cP;
            zzYIH.zzZ(iArr2, 0, zzy.f50933cU, 0);
            zzY(zzy);
            f50929cT = zzZ(zzy, 32);
            zzZ zzz = new zzZ(b);
            zzYIH.zzZ(iArr, 0, zzz.zzW2i, 0);
            zzYIH.zzZ(iArr2, 0, zzz.f50936cU, 0);
            zzX(zzz);
            f50921cJ = new int[1920];
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                zzY[] zzyArr = new zzY[4];
                zzY zzy2 = new zzY(b);
                zzX(zzy2);
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break;
                    }
                    zzZ(true, zzy2, zzZ(zzz), zzy2);
                    zzY(zzz);
                    zzyArr[i3] = zzZ(zzz);
                    if (i2 + i3 != 10) {
                        for (int i4 = 1; i4 < 8; i4++) {
                            zzY(zzz);
                        }
                    }
                    i3++;
                }
                zzY[] zzyArr2 = new zzY[8];
                zzyArr2[0] = zzy2;
                int i5 = 1;
                for (int i6 = 0; i6 < 3; i6++) {
                    int i7 = 1 << i6;
                    int i8 = 0;
                    while (i8 < i7) {
                        zzY zzy3 = zzyArr2[i5 - i7];
                        zzY zzy4 = zzyArr[i6];
                        zzY zzy5 = new zzY(b);
                        zzyArr2[i5] = zzy5;
                        zzZ(false, zzy3, zzy4, zzy5);
                        i8++;
                        i5++;
                    }
                }
                for (int i9 = 0; i9 < 8; i9++) {
                    zzY zzy6 = zzyArr2[i9];
                    int[] iArrZzXyE = zzYIH.zzXyE();
                    int[] iArrZzXyE2 = zzYIH.zzXyE();
                    int[] iArr3 = zzy6.f50934cV;
                    zzYIH.zzY(iArr3, iArr3, iArrZzXyE);
                    zzYIH.zzG(iArrZzXyE, iArrZzXyE2);
                    zzYIH.zzR(zzy6.zzW2i, iArrZzXyE2, iArrZzXyE);
                    zzYIH.zzR(zzy6.f50933cU, iArrZzXyE2, iArrZzXyE2);
                    zzX zzx = new zzX(b);
                    zzYIH.zzY(iArrZzXyE2, iArrZzXyE, zzx.f50930cZ, zzx.f50931da);
                    zzYIH.zzR(iArrZzXyE, iArrZzXyE2, zzx.f50932db);
                    int[] iArr4 = zzx.f50932db;
                    zzYIH.zzR(iArr4, f50928cS, iArr4);
                    zzYIH.zzZL(zzx.f50930cZ);
                    zzYIH.zzZL(zzx.f50931da);
                    zzYIH.zzZ(zzx.f50930cZ, 0, f50921cJ, i);
                    zzYIH.zzZ(zzx.f50931da, 0, f50921cJ, i + 10);
                    zzYIH.zzZ(zzx.f50932db, 0, f50921cJ, i + 20);
                    i += 30;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void zzY(byte[] bArr, int[] iArr) {
        zzX(bArr, 0, iArr);
    }

    private static boolean zzZ(byte[] bArr, int i, zzY zzy) {
        byte[] bArrCopyOfRange = zzYGU.copyOfRange(bArr, i, i + 32);
        if (!zzVN(bArrCopyOfRange)) {
            return false;
        }
        byte b = bArrCopyOfRange[31];
        int i2 = (b & UnsignedBytes.MAX_POWER_OF_TWO) >>> 7;
        bArrCopyOfRange[31] = (byte) (b & Ascii.DEL);
        zzYIH.zzY(bArrCopyOfRange, 0, zzy.f50933cU);
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        zzYIH.zzE(zzy.f50933cU, iArrZzXyE);
        zzYIH.zzR(f50926cQ, iArrZzXyE, iArrZzXyE2);
        zzYIH.zzZJ(iArrZzXyE);
        zzYIH.zzZO(iArrZzXyE2);
        if (!zzYIH.zzP(iArrZzXyE, iArrZzXyE2, zzy.zzW2i)) {
            return false;
        }
        zzYIH.zzZL(zzy.zzW2i);
        if (i2 == 1 && zzYIH.zzZM(zzy.zzW2i)) {
            return false;
        }
        int[] iArr = zzy.zzW2i;
        if (!(i2 != (iArr[0] & 1))) {
            zzYIH.zzM(iArr, iArr);
        }
        zzY(zzy);
        return true;
    }

    private static int zzZQ(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int zzZR(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void zzq(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & Ascii.DEL);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
    }

    public abstract zzYUX zzXDy();

    public final void zzr(byte[] bArr, byte[] bArr2) {
        zzYUX zzyuxZzXDy = zzXDy();
        byte[] bArr3 = new byte[zzyuxZzXDy.zzQI()];
        zzyuxZzXDy.update(bArr, 0, 32);
        zzyuxZzXDy.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        zzq(bArr3, bArr4);
        zzQ(bArr4, bArr2, 0);
    }

    private static void zzX(long j, byte[] bArr, int i) {
        zzP((int) j, bArr, i);
        zzO((int) (j >>> 32), bArr, i + 4);
    }

    private static void zzY(zzZ zzz) {
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        int[] iArrZzXyE3 = zzYIH.zzXyE();
        int[] iArr = zzz.f50938cW;
        int[] iArrZzXyE4 = zzYIH.zzXyE();
        int[] iArrZzXyE5 = zzYIH.zzXyE();
        int[] iArr2 = zzz.f50939cX;
        zzYIH.zzE(zzz.zzW2i, iArrZzXyE);
        zzYIH.zzE(zzz.f50936cU, iArrZzXyE2);
        zzYIH.zzE(zzz.f50937cV, iArrZzXyE3);
        zzYIH.zzY(iArrZzXyE3, iArrZzXyE3, iArrZzXyE3);
        zzYIH.zzY(iArrZzXyE, iArrZzXyE2, iArr2, iArrZzXyE5);
        zzYIH.zzY(zzz.zzW2i, zzz.f50936cU, iArr);
        zzYIH.zzE(iArr, iArr);
        zzYIH.zzO(iArr2, iArr, iArr);
        zzYIH.zzY(iArrZzXyE3, iArrZzXyE5, iArrZzXyE4);
        zzYIH.zzZN(iArrZzXyE4);
        zzYIH.zzR(iArr, iArrZzXyE4, zzz.zzW2i);
        zzYIH.zzR(iArrZzXyE5, iArr2, zzz.f50936cU);
        zzYIH.zzR(iArrZzXyE4, iArrZzXyE5, zzz.f50937cV);
    }

    public static class zzX {

        /* JADX INFO: renamed from: cZ */
        int[] f50930cZ;

        /* JADX INFO: renamed from: da */
        int[] f50931da;

        /* JADX INFO: renamed from: db */
        int[] f50932db;

        private zzX() {
            this.f50930cZ = zzYIH.zzXyE();
            this.f50931da = zzYIH.zzXyE();
            this.f50932db = zzYIH.zzXyE();
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    private static void zzX(zzZ zzz) {
        zzYIH.zzZK(zzz.f50937cV);
        zzYIH.zzZ(zzz.zzW2i, 0, zzz.f50938cW, 0);
        zzYIH.zzZ(zzz.f50936cU, 0, zzz.f50939cX, 0);
    }

    public static class zzY {

        /* JADX INFO: renamed from: cU */
        int[] f50933cU;

        /* JADX INFO: renamed from: cV */
        int[] f50934cV;

        /* JADX INFO: renamed from: cY */
        int[] f50935cY;
        int[] zzW2i;

        private zzY() {
            this.zzW2i = zzYIH.zzXyE();
            this.f50933cU = zzYIH.zzXyE();
            this.f50934cV = zzYIH.zzXyE();
            this.f50935cY = zzYIH.zzXyE();
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    private static byte[] zzP(int[] iArr, int i) {
        int[] iArr2 = new int[16];
        int i2 = 0;
        int i3 = 8;
        int i4 = 16;
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
        byte[] bArr = new byte[256];
        int i7 = 1 << i;
        int i8 = i7 - 1;
        int i9 = i7 >>> 1;
        int i10 = 0;
        int i11 = 0;
        while (i2 < 16) {
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
        int[] f50936cU;

        /* JADX INFO: renamed from: cV */
        int[] f50937cV;

        /* JADX INFO: renamed from: cW */
        int[] f50938cW;

        /* JADX INFO: renamed from: cX */
        int[] f50939cX;
        int[] zzW2i;

        private zzZ() {
            this.zzW2i = zzYIH.zzXyE();
            this.f50936cU = zzYIH.zzXyE();
            this.f50937cV = zzYIH.zzXyE();
            this.f50938cW = zzYIH.zzXyE();
            this.f50939cX = zzYIH.zzXyE();
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static void zzX(zzY zzy) {
        zzYIH.zzZI(zzy.zzW2i);
        zzYIH.zzZK(zzy.f50933cU);
        zzYIH.zzZK(zzy.f50934cV);
        zzYIH.zzZI(zzy.f50935cY);
    }

    private static void zzW(zzZ zzz) {
        zzYIH.zzZI(zzz.zzW2i);
        zzYIH.zzZK(zzz.f50936cU);
        zzYIH.zzZK(zzz.f50937cV);
        zzYIH.zzZI(zzz.f50938cW);
        zzYIH.zzZK(zzz.f50939cX);
    }

    public final boolean zzW(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return zzZ(bArr, 0, bArr2, 0, bArr3, 0, i);
    }

    private static void zzZ(zzYUX zzyux, byte b, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = f50922cM;
            zzyux.update(bArr2, 0, bArr2.length);
            zzyux.update(b);
            zzyux.update((byte) bArr.length);
            zzyux.update(bArr, 0, bArr.length);
        }
    }

    private static void zzY(zzY zzy) {
        zzYIH.zzZK(zzy.f50934cV);
        zzYIH.zzR(zzy.zzW2i, zzy.f50933cU, zzy.f50935cY);
    }

    private static void zzZ(zzZ zzz, byte[] bArr, int i) {
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        zzYIH.zzG(zzz.f50937cV, iArrZzXyE2);
        zzYIH.zzR(zzz.zzW2i, iArrZzXyE2, iArrZzXyE);
        zzYIH.zzR(zzz.f50936cU, iArrZzXyE2, iArrZzXyE2);
        zzYIH.zzZL(iArrZzXyE);
        zzYIH.zzZL(iArrZzXyE2);
        zzYIH.zzY(iArrZzXyE2, bArr, i);
        int i2 = i + 31;
        bArr[i2] = (byte) (bArr[i2] | ((iArrZzXyE[0] & 1) << 7));
    }

    public static void zzZ(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    private static void zzZ(zzYUX zzyux, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        zzZ(zzyux, b, bArr4);
        zzyux.update(bArr, 32, 32);
        zzyux.update(bArr5, i2, i3);
        zzyux.doFinal(bArr, 0);
        byte[] bArrZzVL = zzVL(bArr);
        byte[] bArr7 = new byte[32];
        zzQ(bArrZzVL, bArr7, 0);
        zzZ(zzyux, b, bArr4);
        zzyux.update(bArr7, 0, 32);
        zzyux.update(bArr3, i, 32);
        zzyux.update(bArr5, i2, i3);
        zzyux.doFinal(bArr, 0);
        byte[] bArrZzW = zzW(bArrZzVL, zzVL(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 32);
        System.arraycopy(bArrZzW, 0, bArr6, i4 + 32, 32);
    }

    private void zzZ(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (zzU(null, (byte) 0)) {
            zzYUX zzyuxZzXDy = zzXDy();
            byte[] bArr6 = new byte[zzyuxZzXDy.zzQI()];
            zzyuxZzXDy.update(bArr, 0, 32);
            zzyuxZzXDy.doFinal(bArr6, 0);
            byte[] bArr7 = new byte[32];
            zzq(bArr6, bArr7);
            zzZ(zzyuxZzXDy, bArr6, bArr7, bArr2, 0, null, (byte) 0, bArr4, i3, i4, bArr5, i5);
            return;
        }
        throw new IllegalArgumentException(AbstractJwtRequest.ClaimNames.CTX);
    }

    private boolean zzZ(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        byte b = 0;
        if (zzU(null, (byte) 0)) {
            byte[] bArrCopyOfRange = zzYGU.copyOfRange(bArr, 0, 32);
            byte[] bArrCopyOfRange2 = zzYGU.copyOfRange(bArr, 32, 64);
            if (!zzVN(bArrCopyOfRange) || !zzVM(bArrCopyOfRange2)) {
                return false;
            }
            zzY zzy = new zzY(b);
            if (!zzZ(bArr2, 0, zzy)) {
                return false;
            }
            zzYUX zzyuxZzXDy = zzXDy();
            byte[] bArr4 = new byte[zzyuxZzXDy.zzQI()];
            zzZ(zzyuxZzXDy, (byte) 0, (byte[]) null);
            zzyuxZzXDy.update(bArrCopyOfRange, 0, 32);
            zzyuxZzXDy.update(bArr2, 0, 32);
            zzyuxZzXDy.update(bArr3, 0, i4);
            zzyuxZzXDy.doFinal(bArr4, 0);
            byte[] bArrZzVL = zzVL(bArr4);
            int[] iArr = new int[8];
            zzY(bArrCopyOfRange2, iArr);
            int[] iArr2 = new int[8];
            zzY(bArrZzVL, iArr2);
            zzZ zzz = new zzZ(b);
            zzZ(iArr, iArr2, zzy, zzz);
            byte[] bArr5 = new byte[32];
            zzZ(zzz, bArr5, 0);
            return zzYGU.zzp(bArr5, bArrCopyOfRange);
        }
        throw new IllegalArgumentException(AbstractJwtRequest.ClaimNames.CTX);
    }

    private static void zzZ(boolean z, zzY zzy, zzZ zzz) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        int[] iArrZzXyE3 = zzYIH.zzXyE();
        int[] iArrZzXyE4 = zzYIH.zzXyE();
        int[] iArr5 = zzz.f50938cW;
        int[] iArrZzXyE5 = zzYIH.zzXyE();
        int[] iArrZzXyE6 = zzYIH.zzXyE();
        int[] iArr6 = zzz.f50939cX;
        if (z) {
            iArr2 = iArrZzXyE3;
            iArr = iArrZzXyE4;
            iArr4 = iArrZzXyE5;
            iArr3 = iArrZzXyE6;
        } else {
            iArr = iArrZzXyE3;
            iArr2 = iArrZzXyE4;
            iArr3 = iArrZzXyE5;
            iArr4 = iArrZzXyE6;
        }
        zzYIH.zzY(zzz.f50936cU, zzz.zzW2i, iArrZzXyE2, iArrZzXyE);
        zzYIH.zzY(zzy.f50933cU, zzy.zzW2i, iArr2, iArr);
        zzYIH.zzR(iArrZzXyE, iArrZzXyE3, iArrZzXyE);
        zzYIH.zzR(iArrZzXyE2, iArrZzXyE4, iArrZzXyE2);
        zzYIH.zzR(zzz.f50938cW, zzz.f50939cX, iArrZzXyE3);
        zzYIH.zzR(iArrZzXyE3, zzy.f50935cY, iArrZzXyE3);
        zzYIH.zzR(iArrZzXyE3, f50927cR, iArrZzXyE3);
        zzYIH.zzR(zzz.f50937cV, zzy.f50934cV, iArrZzXyE4);
        zzYIH.zzY(iArrZzXyE4, iArrZzXyE4, iArrZzXyE4);
        zzYIH.zzY(iArrZzXyE2, iArrZzXyE, iArr6, iArr5);
        zzYIH.zzY(iArrZzXyE4, iArrZzXyE3, iArr4, iArr3);
        zzYIH.zzZN(iArr4);
        zzYIH.zzR(iArr5, iArrZzXyE5, zzz.zzW2i);
        zzYIH.zzR(iArrZzXyE6, iArr6, zzz.f50936cU);
        zzYIH.zzR(iArrZzXyE5, iArrZzXyE6, zzz.f50937cV);
    }

    private static void zzZ(boolean z, zzY zzy, zzY zzy2, zzY zzy3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        int[] iArrZzXyE3 = zzYIH.zzXyE();
        int[] iArrZzXyE4 = zzYIH.zzXyE();
        int[] iArrZzXyE5 = zzYIH.zzXyE();
        int[] iArrZzXyE6 = zzYIH.zzXyE();
        int[] iArrZzXyE7 = zzYIH.zzXyE();
        int[] iArrZzXyE8 = zzYIH.zzXyE();
        if (z) {
            iArr2 = iArrZzXyE3;
            iArr = iArrZzXyE4;
            iArr4 = iArrZzXyE6;
            iArr3 = iArrZzXyE7;
        } else {
            iArr = iArrZzXyE3;
            iArr2 = iArrZzXyE4;
            iArr3 = iArrZzXyE6;
            iArr4 = iArrZzXyE7;
        }
        zzYIH.zzY(zzy.f50933cU, zzy.zzW2i, iArrZzXyE2, iArrZzXyE);
        zzYIH.zzY(zzy2.f50933cU, zzy2.zzW2i, iArr2, iArr);
        zzYIH.zzR(iArrZzXyE, iArrZzXyE3, iArrZzXyE);
        zzYIH.zzR(iArrZzXyE2, iArrZzXyE4, iArrZzXyE2);
        zzYIH.zzR(zzy.f50935cY, zzy2.f50935cY, iArrZzXyE3);
        zzYIH.zzR(iArrZzXyE3, f50927cR, iArrZzXyE3);
        zzYIH.zzR(zzy.f50934cV, zzy2.f50934cV, iArrZzXyE4);
        zzYIH.zzY(iArrZzXyE4, iArrZzXyE4, iArrZzXyE4);
        zzYIH.zzY(iArrZzXyE2, iArrZzXyE, iArrZzXyE8, iArrZzXyE5);
        zzYIH.zzY(iArrZzXyE4, iArrZzXyE3, iArr4, iArr3);
        zzYIH.zzZN(iArr4);
        zzYIH.zzR(iArrZzXyE5, iArrZzXyE6, zzy3.zzW2i);
        zzYIH.zzR(iArrZzXyE7, iArrZzXyE8, zzy3.f50933cU);
        zzYIH.zzR(iArrZzXyE6, iArrZzXyE7, zzy3.f50934cV);
        zzYIH.zzR(iArrZzXyE5, iArrZzXyE8, zzy3.f50935cY);
    }

    private static void zzZ(zzX zzx, zzZ zzz) {
        int[] iArrZzXyE = zzYIH.zzXyE();
        int[] iArrZzXyE2 = zzYIH.zzXyE();
        int[] iArrZzXyE3 = zzYIH.zzXyE();
        int[] iArr = zzz.f50938cW;
        int[] iArrZzXyE4 = zzYIH.zzXyE();
        int[] iArrZzXyE5 = zzYIH.zzXyE();
        int[] iArr2 = zzz.f50939cX;
        zzYIH.zzY(zzz.f50936cU, zzz.zzW2i, iArrZzXyE2, iArrZzXyE);
        zzYIH.zzR(iArrZzXyE, zzx.f50931da, iArrZzXyE);
        zzYIH.zzR(iArrZzXyE2, zzx.f50930cZ, iArrZzXyE2);
        zzYIH.zzR(zzz.f50938cW, zzz.f50939cX, iArrZzXyE3);
        zzYIH.zzR(iArrZzXyE3, zzx.f50932db, iArrZzXyE3);
        zzYIH.zzY(iArrZzXyE2, iArrZzXyE, iArr2, iArr);
        zzYIH.zzY(zzz.f50937cV, iArrZzXyE3, iArrZzXyE5, iArrZzXyE4);
        zzYIH.zzZN(iArrZzXyE5);
        zzYIH.zzR(iArr, iArrZzXyE4, zzz.zzW2i);
        zzYIH.zzR(iArrZzXyE5, iArr2, zzz.f50936cU);
        zzYIH.zzR(iArrZzXyE4, iArrZzXyE5, zzz.f50937cV);
    }

    private static zzY zzZ(zzZ zzz) {
        zzY zzy = new zzY((byte) 0);
        zzYIH.zzZ(zzz.zzW2i, 0, zzy.zzW2i, 0);
        zzYIH.zzZ(zzz.f50936cU, 0, zzy.f50933cU, 0);
        zzYIH.zzZ(zzz.f50937cV, 0, zzy.f50934cV, 0);
        zzYIH.zzR(zzz.f50938cW, zzz.f50939cX, zzy.f50935cY);
        return zzy;
    }

    private static zzY zzZ(zzY zzy) {
        zzY zzy2 = new zzY((byte) 0);
        zzYIH.zzZ(zzy.zzW2i, 0, zzy2.zzW2i, 0);
        zzYIH.zzZ(zzy.f50933cU, 0, zzy2.f50933cU, 0);
        zzYIH.zzZ(zzy.f50934cV, 0, zzy2.f50934cV, 0);
        zzYIH.zzZ(zzy.f50935cY, 0, zzy2.f50935cY, 0);
        return zzy2;
    }

    private static void zzZ(int i, int i2, zzX zzx) {
        int i3 = i * 240;
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            zzYHP.zzZ(10, i5, f50921cJ, i3, zzx.f50930cZ);
            zzYHP.zzZ(10, i5, f50921cJ, i3 + 10, zzx.f50931da);
            zzYHP.zzZ(10, i5, f50921cJ, i3 + 20, zzx.f50932db);
            i3 += 30;
        }
    }

    private static zzY[] zzZ(zzY zzy, int i) {
        byte b = 0;
        zzY zzy2 = new zzY(b);
        zzZ(false, zzy, zzy, zzy2);
        zzY[] zzyArr = new zzY[i];
        zzyArr[0] = zzZ(zzy);
        for (int i2 = 1; i2 < i; i2++) {
            zzY zzy3 = zzyArr[i2 - 1];
            zzY zzy4 = new zzY(b);
            zzyArr[i2] = zzy4;
            zzZ(false, zzy3, zzy2, zzy4);
        }
        return zzyArr;
    }

    private static void zzZ(byte[] bArr, zzZ zzz) {
        zzXyF();
        zzW(zzz);
        int[] iArr = new int[8];
        byte b = 0;
        zzX(bArr, 0, iArr);
        zzYHP.zzZ(8, (~iArr[0]) & 1, iArr, f50923cN, iArr);
        zzYHP.zzV(8, iArr, 1);
        for (int i = 0; i < 8; i++) {
            iArr[i] = zzYHQ.zzeC(iArr[i]);
        }
        zzX zzx = new zzX(b);
        int i2 = 28;
        while (true) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = iArr[i3] >>> i2;
                int i5 = (i4 >>> 3) & 1;
                zzZ(i3, (i4 ^ (-i5)) & 7, zzx);
                zzYIH.zzX(i5, zzx.f50930cZ, zzx.f50931da);
                zzYIH.zzK(i5, zzx.f50932db);
                zzZ(zzx, zzz);
            }
            i2 -= 4;
            if (i2 < 0) {
                return;
            } else {
                zzY(zzz);
            }
        }
    }

    private static void zzZ(int[] iArr, int[] iArr2, zzY zzy, zzZ zzz) {
        zzXyF();
        byte[] bArrZzP = zzP(iArr, 7);
        byte[] bArrZzP2 = zzP(iArr2, 5);
        zzY[] zzyArrZzZ = zzZ(zzy, 8);
        zzW(zzz);
        int i = 255;
        while (i > 0 && (bArrZzP[i] | bArrZzP2[i]) == 0) {
            i--;
        }
        while (true) {
            byte b = bArrZzP[i];
            if (b != 0) {
                int i2 = b >> 31;
                zzZ(i2 != 0, f50929cT[(b ^ i2) >>> 1], zzz);
            }
            byte b2 = bArrZzP2[i];
            if (b2 != 0) {
                int i3 = b2 >> 31;
                zzZ(i3 != 0, zzyArrZzZ[(b2 ^ i3) >>> 1], zzz);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                zzY(zzz);
            }
        }
    }

    public final void zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, byte[] bArr4, int i3) {
        zzZ(bArr, 0, bArr2, 0, null, (byte) 0, bArr3, 0, i2, bArr4, 0);
    }
}
