package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2C {
    static final zzZ2C zzWjv = new zzZ2C();
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    private zzZ2C() {
    }

    public static BigInteger zzZ(zzYSX zzysx, SecureRandom secureRandom) {
        int l = zzysx.getL();
        if (l != 0) {
            return new BigInteger(l, secureRandom).setBit(l - 1);
        }
        BigInteger bigInteger = zzWkF;
        int m = zzysx.getM();
        BigInteger bigIntegerShiftLeft = m != 0 ? ONE.shiftLeft(m - 1) : bigInteger;
        BigInteger q = zzysx.getQ();
        if (q == null) {
            q = zzysx.getP();
        }
        return zzYGT.zzX(bigIntegerShiftLeft, q.subtract(bigInteger), secureRandom);
    }

    public static BigInteger zzZ(zzYSX zzysx, BigInteger bigInteger) {
        return zzysx.getG().modPow(bigInteger, zzysx.getP());
    }
}
