package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYXK implements zzYVA {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private zzYXL zzW6g;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzYXI zzyxiZzXDl = this.zzW6g.zzXDl();
        SecureRandom secureRandomZzXCJ = this.zzW6g.zzXCJ();
        BigInteger q = zzyxiZzXDl.getQ();
        BigInteger p = zzyxiZzXDl.getP();
        BigInteger a = zzyxiZzXDl.getA();
        while (true) {
            BigInteger bigInteger = new BigInteger(256, secureRandomZzXCJ);
            if (!bigInteger.equals(ZERO) && bigInteger.compareTo(q) < 0) {
                return new zzYVB(new zzYXG(a.modPow(bigInteger, p), zzyxiZzXDl), new zzYXH(bigInteger, zzyxiZzXDl));
            }
        }
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzW6g = (zzYXL) zzyus;
    }
}
