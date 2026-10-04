package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSP implements zzYV3 {
    private zzYSM zzVXX;
    private BigInteger zzWkP;
    private BigInteger zzWl0;
    private BigInteger zzWl1;

    public zzYSP(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzWkP = bigInteger3;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzYSP)) {
            return false;
        }
        zzYSP zzysp = (zzYSP) obj;
        return zzysp.zzWl1.equals(this.zzWl1) && zzysp.zzWl0.equals(this.zzWl0) && zzysp.zzWkP.equals(this.zzWkP);
    }

    public final BigInteger getG() {
        return this.zzWkP;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final int hashCode() {
        return (this.zzWl1.hashCode() ^ this.zzWl0.hashCode()) ^ this.zzWkP.hashCode();
    }

    public final zzYSM zzXCm() {
        return this.zzVXX;
    }

    public zzYSP(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, zzYSM zzysm) {
        this.zzWkP = bigInteger3;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
        this.zzVXX = zzysm;
    }
}
