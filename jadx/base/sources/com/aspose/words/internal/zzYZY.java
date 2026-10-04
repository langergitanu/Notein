package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZY implements zzZ27 {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private SecureRandom zzWk5;
    private BigInteger zzWl0;

    @Override // com.aspose.words.internal.zzZ27
    public final BigInteger zzXG4() {
        int iBitLength = this.zzWl0.bitLength();
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.zzWk5);
            if (!bigInteger.equals(ZERO) && bigInteger.compareTo(this.zzWl0) < 0) {
                return bigInteger;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZ27
    public final void zzY(BigInteger bigInteger, SecureRandom secureRandom) {
        this.zzWl0 = bigInteger;
        this.zzWk5 = secureRandom;
    }
}
