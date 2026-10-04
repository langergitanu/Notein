package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class zzYS1 extends zzYT2 {
    private BigInteger zzVXN;
    private BigInteger zzWwf;

    public zzYS1(boolean z, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z);
        this.zzWwf = bigInteger;
        this.zzVXN = bigInteger2;
    }

    public final BigInteger getExponent() {
        return this.zzVXN;
    }

    public final BigInteger getModulus() {
        return this.zzWwf;
    }
}
