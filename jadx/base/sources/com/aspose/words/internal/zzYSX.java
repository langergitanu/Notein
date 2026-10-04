package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSX implements zzYV3 {
    private final BigInteger zzWkO;
    private final BigInteger zzWkP;
    private final BigInteger zzWl0;
    private final BigInteger zzWl1;
    private final int zzWtn;
    private final int zzWtq;

    public zzYSX(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYSX) {
            zzYSX zzysx = (zzYSX) obj;
            BigInteger bigInteger = this.zzWl0;
            if (bigInteger != null) {
                if (!bigInteger.equals(zzysx.zzWl0)) {
                    return false;
                }
            } else if (zzysx.zzWl0 != null) {
                return false;
            }
            if (zzysx.zzWl1.equals(this.zzWl1) && zzysx.zzWkP.equals(this.zzWkP)) {
                return true;
            }
        }
        return false;
    }

    public final BigInteger getG() {
        return this.zzWkP;
    }

    public final int getL() {
        return this.zzWtn;
    }

    public final int getM() {
        return this.zzWtq;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final int hashCode() {
        int iHashCode = (this.zzWkP.hashCode() * 37) + this.zzWl1.hashCode();
        BigInteger bigInteger = this.zzWl0;
        return ((bigInteger != null ? bigInteger.hashCode() : 0) * 37) + iHashCode;
    }

    public final BigInteger zzXHB() {
        return this.zzWkO;
    }

    public zzYSX(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4);
    }

    public zzYSX(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.zzWkP = bigInteger2;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger3;
        this.zzWtq = i;
        this.zzWtn = i2;
        this.zzWkO = bigInteger4;
    }
}
