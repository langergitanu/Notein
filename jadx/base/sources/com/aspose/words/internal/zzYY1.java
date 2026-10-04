package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYY1 implements zzYV3 {
    private final BigInteger zzWkP;
    private final BigInteger zzWl1;
    private final int zzWtn;

    public zzYY1(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.zzWkP = bigInteger2;
        this.zzWl1 = bigInteger;
        this.zzWtn = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzYY1)) {
            return false;
        }
        zzYY1 zzyy1 = (zzYY1) obj;
        return zzyy1.zzWl1.equals(this.zzWl1) && zzyy1.zzWkP.equals(this.zzWkP) && zzyy1.zzWtn == this.zzWtn;
    }

    public final BigInteger getG() {
        return this.zzWkP;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final int hashCode() {
        return (this.zzWl1.hashCode() ^ this.zzWkP.hashCode()) + this.zzWtn;
    }
}
