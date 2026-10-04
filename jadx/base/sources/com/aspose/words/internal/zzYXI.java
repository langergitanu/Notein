package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYXI implements zzYV3 {
    private BigInteger zzWkH;
    private BigInteger zzWl0;
    private BigInteger zzWl1;

    public zzYXI(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
        this.zzWkH = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzYXI)) {
            return false;
        }
        zzYXI zzyxi = (zzYXI) obj;
        return zzyxi.zzWl1.equals(this.zzWl1) && zzyxi.zzWl0.equals(this.zzWl0) && zzyxi.zzWkH.equals(this.zzWkH);
    }

    public final BigInteger getA() {
        return this.zzWkH;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final int hashCode() {
        return (this.zzWl1.hashCode() ^ this.zzWl0.hashCode()) ^ this.zzWkH.hashCode();
    }
}
