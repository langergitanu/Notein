package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMZ implements AlgorithmParameterSpec {
    private final zzZ5K zzW8y;
    private final int zzWbd;
    private final int zzWjt;
    private final int zzWkM;
    private final BigInteger zzWl0;
    private final BigInteger zzWl1;
    private final byte[] zzWoA;
    private final int zzWtn;

    public final int getL() {
        return this.zzWtn;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final byte[] getSeed() {
        return zzYGU.zzVI(this.zzWoA);
    }

    public final int zzXCn() {
        return this.zzWbd;
    }

    public final zzZ5K zzXDF() {
        return this.zzW8y;
    }

    public final int zzXEq() {
        return this.zzWjt;
    }

    public final int zzXGn() {
        return this.zzWkM;
    }
}
