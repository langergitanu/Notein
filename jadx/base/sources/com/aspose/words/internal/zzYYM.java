package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYM implements zzYVA {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(1);
    private zzYSS zzWjr;

    private static BigInteger zzX(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = ONE;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
        if (bigInteger.bitLength() > 160) {
            return new BigInteger(bigInteger.bitLength() + 64, secureRandom).mod(bigIntegerSubtract).add(bigInteger2);
        }
        while (true) {
            BigInteger bigInteger3 = new BigInteger(bigInteger.bitLength(), secureRandom);
            if (bigInteger3.compareTo(ONE) >= 0 && bigInteger3.compareTo(bigIntegerSubtract) <= 0) {
                return bigInteger3;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzYSP zzyspZzXCo = this.zzWjr.zzXCo();
        BigInteger bigIntegerZzX = zzX(zzyspZzXCo.getQ(), this.zzWjr.zzXCJ());
        return new zzYVB(new zzYSN(zzyspZzXCo.getG().modPow(bigIntegerZzX, zzyspZzXCo.getP()), zzyspZzXCo), new zzYSO(bigIntegerZzX, zzyspZzXCo));
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWjr = (zzYSS) zzyus;
    }
}
