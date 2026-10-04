package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ29 {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    public static BigInteger[] zzY(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(i3, 2, secureRandom);
            BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(ONE);
            if (bigIntegerAdd.isProbablePrime(i2) && (i2 <= 2 || bigInteger.isProbablePrime(i2 - 2))) {
                if (zzYLI.zzF(bigIntegerAdd) >= i4) {
                    return new BigInteger[]{bigIntegerAdd, bigInteger};
                }
            }
        }
    }

    public static BigInteger zzZ(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerSubtract = bigInteger.subtract(zzWkF);
        do {
            BigInteger bigInteger2 = zzWkF;
            bigIntegerModPow = zzYGT.zzX(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
        } while (bigIntegerModPow.equals(ONE));
        return bigIntegerModPow;
    }
}
