package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
class zzYYE implements zzYM2, zzYVA {
    zzYSJ zzWjg;
    SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVA
    public zzYVB zzXG6() {
        BigInteger bigIntegerZzXIz = this.zzWjg.zzXIz();
        int iBitLength = bigIntegerZzXIz.bitLength();
        int i = iBitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.zzWk5);
            if (bigInteger.compareTo(zzYM2.zzWkF) >= 0 && bigInteger.compareTo(bigIntegerZzXIz) < 0 && zzYLI.zzF(bigInteger) >= i) {
                return new zzYVB(new zzYSD(new zzYLV().zzZ(this.zzWjg.zzXHu(), bigInteger), this.zzWjg), new zzYSE(bigInteger, this.zzWjg));
            }
        }
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        zzYYF zzyyf = (zzYYF) zzyus;
        this.zzWk5 = zzyyf.zzXCJ();
        this.zzWjg = zzyyf.zzXG1();
        if (this.zzWk5 == null) {
            throw new IllegalArgumentException("No random provided where one required.");
        }
    }
}
