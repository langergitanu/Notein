package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ25 {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: L */
    private int f51305L;

    /* JADX INFO: renamed from: N */
    private int f51306N;
    private int zzWjq;
    private int zzWjt;
    private SecureRandom zzWk5;
    private int zzWkM;
    private zzYUX zzWkt;

    public zzZ25(zzYUX zzyux) {
        this.zzWkt = zzyux;
    }

    private boolean zzV(BigInteger bigInteger) {
        return !zzYHR.zzz(bigInteger) && zzYHR.zzY(bigInteger, this.zzWk5, this.zzWjq);
    }

    private static void zzX7(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private zzYSP zzXG2() {
        BigInteger bit;
        int i;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerZzZ;
        zzYUX zzyux = this.zzWkt;
        int iZzQI = zzyux.zzQI() * 8;
        byte[] bArr = new byte[this.f51306N / 8];
        int i2 = this.f51305L;
        int i3 = (i2 - 1) / iZzQI;
        int i4 = i2 / 8;
        byte[] bArr2 = new byte[i4];
        int iZzQI2 = zzyux.zzQI();
        byte[] bArr3 = new byte[iZzQI2];
        loop0: while (true) {
            this.zzWk5.nextBytes(bArr);
            int i5 = 0;
            zzZ(zzyux, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(ONE.shiftLeft(this.f51306N - 1)).setBit(0).setBit(this.f51306N - 1);
            if (zzV(bit)) {
                byte[] bArrZzVI = zzYGU.zzVI(bArr);
                int i6 = this.f51305L * 4;
                i = 0;
                while (i < i6) {
                    for (int i7 = 1; i7 <= i3; i7++) {
                        zzX7(bArrZzVI);
                        zzZ(zzyux, bArrZzVI, bArr2, i4 - (i7 * iZzQI2));
                    }
                    int i8 = i4 - (i3 * iZzQI2);
                    zzX7(bArrZzVI);
                    zzZ(zzyux, bArrZzVI, bArr3, i5);
                    System.arraycopy(bArr3, iZzQI2 - i8, bArr2, i5, i8);
                    bArr2[i5] = (byte) (bArr2[i5] | UnsignedBytes.MAX_POWER_OF_TWO);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    bigIntegerSubtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(ONE));
                    if (bigIntegerSubtract.bitLength() == this.f51305L && zzV(bigIntegerSubtract)) {
                        break loop0;
                    }
                    i++;
                    i5 = 0;
                }
            }
        }
        int i9 = this.zzWkM;
        return (i9 < 0 || (bigIntegerZzZ = zzZ(zzyux, bigIntegerSubtract, bit, bArr, i9)) == null) ? new zzYSP(bigIntegerSubtract, bit, zzZ(bigIntegerSubtract, bit, this.zzWk5), new zzYSM(bArr, i)) : new zzYSP(bigIntegerSubtract, bit, bigIntegerZzZ, new zzYSM(bArr, i, this.zzWkM));
    }

    public static BigInteger zzY(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return zzZ(bigInteger, bigInteger2, secureRandom);
    }

    private static int zzfQ(int i) {
        if (i <= 1024) {
            return 40;
        }
        return (((i - 1) / 1024) * 8) + 48;
    }

    public final zzYSP zzXG3() {
        return zzXG2();
    }

    public final void zzZ(zzYSQ zzysq) {
        int l = zzysq.getL();
        int iZzXCn = zzysq.zzXCn();
        if (l < 1024 || l > 3072 || l % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (l == 1024 && iZzXCn != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (l == 2048 && iZzXCn != 224 && iZzXCn != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (l == 3072 && iZzXCn != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.zzWkt.zzQI() * 8 < iZzXCn) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.f51305L = l;
        this.f51306N = iZzXCn;
        this.zzWjt = zzysq.zzXEq();
        this.zzWjq = Math.max(zzfQ(l), (this.zzWjt + 1) / 2);
        this.zzWk5 = zzysq.zzXCJ();
        this.zzWkM = zzysq.zzXGn();
    }

    private static BigInteger zzZ(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerDivide = bigInteger.subtract(ONE).divide(bigInteger2);
        BigInteger bigIntegerSubtract = bigInteger.subtract(zzWkF);
        do {
            bigIntegerModPow = zzYGT.zzX(zzWkF, bigIntegerSubtract, secureRandom).modPow(bigIntegerDivide, bigInteger);
        } while (bigIntegerModPow.bitLength() <= 1);
        return bigIntegerModPow;
    }

    public static BigInteger zzZ(zzYUX zzyux, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
        if ((i & 255) == i) {
            BigInteger bigIntegerDivide = bigInteger.subtract(ONE).divide(bigInteger2);
            byte[] bArrDecode = zzYGC.decode("6767656E");
            int length = bArr.length + bArrDecode.length;
            byte[] bArr2 = new byte[length + 3];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
            bArr2[length] = (byte) i;
            byte[] bArr3 = new byte[zzyux.zzQI()];
            for (int i2 = 1; i2 < 65536; i2++) {
                zzX7(bArr2);
                zzZ(zzyux, bArr2, bArr3, 0);
                BigInteger bigIntegerModPow = new BigInteger(1, bArr3).modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(zzWkF) >= 0) {
                    return bigIntegerModPow;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Usage index must be in range 0 to 255");
    }

    private static void zzZ(zzYUX zzyux, byte[] bArr, byte[] bArr2, int i) {
        zzyux.update(bArr, 0, bArr.length);
        zzyux.doFinal(bArr2, i);
    }
}
