package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYS2 extends zzYUS {
    private int zzWjt;
    private BigInteger zzWwe;

    public zzYS2(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.zzWwe = bigInteger;
        this.zzWjt = i2;
    }

    public final BigInteger getPublicExponent() {
        return this.zzWwe;
    }

    public final int zzXEq() {
        return this.zzWjt;
    }
}
