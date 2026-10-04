package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYL {

    /* JADX INFO: renamed from: L */
    private int f51278L;

    /* JADX INFO: renamed from: N */
    private int f51279N;
    private boolean zzW8e;
    private int zzWjt;
    private SecureRandom zzWk5;
    private int zzWkM;
    private zzYUX zzWkt;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    public zzYYL() {
        this(zzYW6.zzZ(zzZ0P.zzZ.zzWdL));
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

    private zzYSP zzXDD() {
        int i = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i2 = this.f51278L;
        int i3 = (i2 - 1) / 160;
        int i4 = i2 / 8;
        byte[] bArr5 = new byte[i4];
        while (true) {
            this.zzWk5.nextBytes(bArr);
            zzZ(this.zzWkt, bArr, bArr2);
            System.arraycopy(bArr, 0, bArr3, 0, i);
            zzX7(bArr3);
            zzZ(this.zzWkt, bArr3, bArr3);
            for (int i5 = 0; i5 != i; i5++) {
                bArr4[i5] = (byte) (bArr2[i5] ^ bArr3[i5]);
            }
            bArr4[0] = (byte) (bArr4[0] | UnsignedBytes.MAX_POWER_OF_TWO);
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (bigInteger.isProbablePrime(this.zzWjt)) {
                byte[] bArrZzVI = zzYGU.zzVI(bArr);
                zzX7(bArrZzVI);
                int i6 = 0;
                while (i6 < 4096) {
                    int i7 = 0;
                    while (i7 < i3) {
                        zzX7(bArrZzVI);
                        zzZ(this.zzWkt, bArrZzVI, bArr2);
                        i7++;
                        System.arraycopy(bArr2, 0, bArr5, i4 - (i7 * 20), i);
                    }
                    zzX7(bArrZzVI);
                    zzZ(this.zzWkt, bArrZzVI, bArr2);
                    int i8 = i4 - (i3 * 20);
                    System.arraycopy(bArr2, 20 - i8, bArr5, 0, i8);
                    bArr5[0] = (byte) (bArr5[0] | UnsignedBytes.MAX_POWER_OF_TWO);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(ONE));
                    if (bigIntegerSubtract.bitLength() == this.f51278L && bigIntegerSubtract.isProbablePrime(this.zzWjt)) {
                        return new zzYSP(bigIntegerSubtract, bigInteger, zzZ(bigIntegerSubtract, bigInteger, this.zzWk5), new zzYSM(bArr, i6));
                    }
                    i6++;
                    i = 20;
                }
            }
        }
    }

    private zzYSP zzXG2() {
        BigInteger bigIntegerSubtract;
        int i;
        BigInteger bigIntegerSubtract2;
        BigInteger bigIntegerZzZ;
        zzYUX zzyux = this.zzWkt;
        int iZzQI = zzyux.zzQI() * 8;
        byte[] bArr = new byte[this.f51279N / 8];
        int i2 = this.f51278L;
        int i3 = (i2 - 1) / iZzQI;
        int i4 = 1;
        int i5 = (i2 - 1) % iZzQI;
        byte[] bArr2 = new byte[zzyux.zzQI()];
        loop0: while (true) {
            this.zzWk5.nextBytes(bArr);
            zzZ(zzyux, bArr, bArr2);
            BigInteger bigInteger = new BigInteger(i4, bArr2);
            BigInteger bigInteger2 = ONE;
            BigInteger bigIntegerMod = bigInteger.mod(bigInteger2.shiftLeft(this.f51279N - i4));
            bigIntegerSubtract = bigInteger2.shiftLeft(this.f51279N - i4).add(bigIntegerMod).add(bigInteger2).subtract(bigIntegerMod.mod(zzWkF));
            if (bigIntegerSubtract.isProbablePrime(this.zzWjt)) {
                byte[] bArrZzVI = zzYGU.zzVI(bArr);
                int i6 = this.f51278L * 4;
                i = 0;
                while (i < i6) {
                    BigInteger bigIntegerAdd = ZERO;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 <= i3) {
                        zzX7(bArrZzVI);
                        zzZ(zzyux, bArrZzVI, bArr2);
                        BigInteger bigInteger3 = new BigInteger(i4, bArr2);
                        int i9 = i4;
                        if (i7 == i3) {
                            bigInteger3 = bigInteger3.mod(ONE.shiftLeft(i5));
                        }
                        bigIntegerAdd = bigIntegerAdd.add(bigInteger3.shiftLeft(i8));
                        i7++;
                        i8 += iZzQI;
                        i4 = i9;
                    }
                    int i10 = i4;
                    BigInteger bigInteger4 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerAdd.add(bigInteger4.shiftLeft(this.f51278L - 1));
                    bigIntegerSubtract2 = bigIntegerAdd2.subtract(bigIntegerAdd2.mod(bigIntegerSubtract.shiftLeft(i10)).subtract(bigInteger4));
                    if (bigIntegerSubtract2.bitLength() == this.f51278L && bigIntegerSubtract2.isProbablePrime(this.zzWjt)) {
                        break loop0;
                    }
                    i++;
                    i4 = i10;
                }
            }
        }
        int i11 = this.zzWkM;
        return (i11 < 0 || (bigIntegerZzZ = zzZ(zzyux, bigIntegerSubtract2, bigIntegerSubtract, bArr, i11)) == null) ? new zzYSP(bigIntegerSubtract2, bigIntegerSubtract, zzZ(bigIntegerSubtract2, bigIntegerSubtract, this.zzWk5), new zzYSM(bArr, i)) : new zzYSP(bigIntegerSubtract2, bigIntegerSubtract, bigIntegerZzZ, new zzYSM(bArr, i, this.zzWkM));
    }

    private static int zzfr(int i) {
        return i > 1024 ? 256 : 160;
    }

    public final zzYSP zzXG3() {
        return this.zzW8e ? zzXG2() : zzXDD();
    }

    public final void zzZ(int i, int i2, SecureRandom secureRandom) {
        this.zzW8e = false;
        this.f51278L = i;
        this.f51279N = zzfr(i);
        this.zzWjt = i2;
        this.zzWk5 = secureRandom;
    }

    public zzYYL(zzYUX zzyux) {
        this.zzWkt = zzyux;
    }

    public final void zzZ(zzYSQ zzysq) {
        int i;
        this.zzW8e = true;
        this.f51278L = zzysq.getL();
        this.f51279N = zzysq.zzXCn();
        this.zzWjt = zzysq.zzXEq();
        this.zzWk5 = zzysq.zzXCJ();
        this.zzWkM = zzysq.zzXGn();
        int i2 = this.f51278L;
        if (i2 >= 1024 && i2 <= 3072 && i2 % 1024 == 0) {
            if (i2 == 1024 && this.f51279N != 160) {
                throw new IllegalArgumentException("N must be 160 for L = 1024");
            }
            if (i2 == 2048 && (i = this.f51279N) != 224 && i != 256) {
                throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
            }
            if (i2 == 3072 && this.f51279N != 256) {
                throw new IllegalArgumentException("N must be 256 for L = 3072");
            }
            if (this.zzWkt.zzQI() * 8 < this.f51279N) {
                throw new IllegalStateException("Digest output size too small for value of N");
            }
            return;
        }
        throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
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

    private static BigInteger zzZ(zzYUX zzyux, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
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
            zzZ(zzyux, bArr2, bArr3);
            BigInteger bigIntegerModPow = new BigInteger(1, bArr3).modPow(bigIntegerDivide, bigInteger);
            if (bigIntegerModPow.compareTo(zzWkF) >= 0) {
                return bigIntegerModPow;
            }
        }
        return null;
    }

    private static void zzZ(zzYUX zzyux, byte[] bArr, byte[] bArr2) {
        zzyux.update(bArr, 0, bArr.length);
        zzyux.doFinal(bArr2, 0);
    }
}
