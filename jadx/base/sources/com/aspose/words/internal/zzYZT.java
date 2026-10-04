package com.aspose.words.internal;

import Oooo0oO.C21034OooOOOo;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZT implements zzYVA {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private zzYS2 zzWeV;

    private static int zzUH(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return C21034OooOOOo.OooO00o(i2, 127, 2, 4);
        }
        if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return C21034OooOOOo.OooO00o(i2, 111, 2, 5);
        }
        if (i < 512) {
            if (i2 <= 80) {
                return 40;
            }
            return C21034OooOOOo.OooO00o(i2, 79, 2, 40);
        }
        if (i2 <= 80) {
            return 5;
        }
        if (i2 <= 100) {
            return 7;
        }
        return C21034OooOOOo.OooO00o(i2, 99, 2, 7);
    }

    private boolean zzY(BigInteger bigInteger, int i) {
        return !zzYHR.zzz(bigInteger) && zzYHR.zzY(bigInteger, this.zzWeV.zzXCJ(), i);
    }

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        BigInteger bigIntegerZzZ;
        BigInteger bigIntegerMultiply;
        zzYZT zzyzt = this;
        int strength = zzyzt.zzWeV.getStrength();
        int i = (strength + 1) / 2;
        int i2 = strength - i;
        int i3 = strength / 2;
        int i4 = i3 - 100;
        int i5 = strength >> 2;
        int i6 = strength / 3;
        if (i4 < i6) {
            i4 = i6;
        }
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i3);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(strength - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger.shiftLeft(i4);
        zzYVB zzyvb = null;
        boolean z = false;
        while (!z) {
            BigInteger publicExponent = zzyzt.zzWeV.getPublicExponent();
            BigInteger bigIntegerZzZ2 = zzyzt.zzZ(i, publicExponent, bigIntegerShiftLeft);
            while (true) {
                bigIntegerZzZ = zzyzt.zzZ(i2, publicExponent, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerZzZ.subtract(bigIntegerZzZ2).abs();
                if (bigIntegerAbs.bitLength() >= i4 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerZzZ2.multiply(bigIntegerZzZ);
                    if (bigIntegerMultiply.bitLength() == strength) {
                        if (zzYLI.zzF(bigIntegerMultiply) >= i5) {
                            break;
                        }
                        bigIntegerZzZ2 = zzyzt.zzZ(i, publicExponent, bigIntegerShiftLeft);
                    } else {
                        bigIntegerZzZ2 = bigIntegerZzZ2.max(bigIntegerZzZ);
                    }
                } else {
                    zzyzt = this;
                    strength = strength;
                }
            }
            if (bigIntegerZzZ2.compareTo(bigIntegerZzZ) < 0) {
                bigIntegerZzZ = bigIntegerZzZ2;
                bigIntegerZzZ2 = bigIntegerZzZ;
            }
            BigInteger bigInteger2 = ONE;
            BigInteger bigIntegerSubtract = bigIntegerZzZ2.subtract(bigInteger2);
            BigInteger bigIntegerSubtract2 = bigIntegerZzZ.subtract(bigInteger2);
            int i7 = strength;
            BigInteger bigIntegerModInverse = publicExponent.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                zzyvb = new zzYVB(new zzYS1(false, bigIntegerMultiply, publicExponent), new zzYS0(bigIntegerMultiply, publicExponent, bigIntegerModInverse, bigIntegerZzZ2, bigIntegerZzZ, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigIntegerZzZ.modInverse(bigIntegerZzZ2)));
                z = true;
            }
            zzyzt = this;
            strength = i7;
        }
        return zzyvb;
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWeV = (zzYS2) zzyus;
    }

    private BigInteger zzZ(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        int iZzUH = zzUH(i, this.zzWeV.zzXEq());
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger bigInteger3 = new BigInteger(i, 1, this.zzWeV.zzXCJ());
            BigInteger bigIntegerMod = bigInteger3.mod(bigInteger);
            BigInteger bigInteger4 = ONE;
            if (!bigIntegerMod.equals(bigInteger4) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && zzY(bigInteger3, iZzUH) && bigInteger.gcd(bigInteger3.subtract(bigInteger4)).equals(bigInteger4)) {
                return bigInteger3;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }
}
