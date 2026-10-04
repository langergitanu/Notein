package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ1W implements zzYM2, zzYVA {
    zzYSJ zzWjg;
    SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        BigInteger bigIntegerSubtract = this.zzWjg.zzXIz().subtract(BigInteger.valueOf(2L));
        int iBitLength = bigIntegerSubtract.bitLength();
        int i = iBitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.zzWk5);
            if (bigInteger.compareTo(bigIntegerSubtract) <= 0 && zzYLI.zzF(bigInteger) >= i) {
                BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
                return new zzYVB(new zzYSD(new zzYLV().zzZ(this.zzWjg.zzXHu(), bigIntegerAdd), this.zzWjg), new zzYSE(bigIntegerAdd, this.zzWjg));
            }
        }
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        zzZ1X zzz1x = (zzZ1X) zzyus;
        this.zzWk5 = zzz1x.zzXCJ();
        this.zzWjg = zzz1x.zzXG1();
        if (this.zzWk5 == null) {
            throw new IllegalArgumentException("No random provided where one required.");
        }
    }
}
