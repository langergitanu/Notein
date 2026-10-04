package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYS0 extends zzYS1 {
    private BigInteger zzVXK;
    private BigInteger zzVXL;
    private BigInteger zzVXM;
    private BigInteger zzWkX;
    private BigInteger zzWl0;
    private BigInteger zzWl1;

    public zzYS0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.zzVXM = bigInteger2;
        this.zzWl1 = bigInteger4;
        this.zzWl0 = bigInteger5;
        this.zzVXL = bigInteger6;
        this.zzVXK = bigInteger7;
        this.zzWkX = bigInteger8;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final BigInteger getPublicExponent() {
        return this.zzVXM;
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final BigInteger zzXGs() {
        return this.zzWkX;
    }

    public final BigInteger zzXGt() {
        return this.zzVXK;
    }

    public final BigInteger zzXGu() {
        return this.zzVXL;
    }
}
