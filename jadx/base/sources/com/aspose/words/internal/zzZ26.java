package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ26 implements zzYVA {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private zzYSS zzWjr;

    private static BigInteger zzX(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = new BigInteger(bigInteger.bitLength() + 64, secureRandom);
        BigInteger bigInteger3 = ONE;
        return bigInteger2.mod(bigInteger.subtract(bigInteger3)).add(bigInteger3);
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
