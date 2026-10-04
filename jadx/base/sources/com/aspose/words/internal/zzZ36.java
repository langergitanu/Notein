package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ36 {
    private zzZ35 zzWkL;
    private BigInteger zzWkP;
    private BigInteger zzWl0;
    private BigInteger zzWl1;

    public zzZ36(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzWkP = bigInteger3;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzZ36)) {
            return false;
        }
        zzZ36 zzz36 = (zzZ36) obj;
        return zzz36.zzWl1.equals(this.zzWl1) && zzz36.zzWl0.equals(this.zzWl0) && zzz36.zzWkP.equals(this.zzWkP);
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

    public int hashCode() {
        return this.zzWl0.hashCode() + ((this.zzWl1.hashCode() + (this.zzWkP.hashCode() * 31)) * 31);
    }

    public final zzZ35 zzXGo() {
        return this.zzWkL;
    }

    public zzZ36(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, zzZ35 zzz35) {
        this.zzWkP = bigInteger3;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
        this.zzWkL = zzz35;
    }
}
