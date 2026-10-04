package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ38 {
    private final zzZ37 zzWkN;
    private final BigInteger zzWkO;
    private final BigInteger zzWkP;
    private final BigInteger zzWl0;
    private final BigInteger zzWl1;
    private final int zzWtn;
    private final int zzWtq;

    public zzZ38(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, null, bigInteger2, 0);
    }

    private static int zzfW(int i) {
        if (i != 0 && i < 160) {
            return i;
        }
        return 160;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzZ38)) {
            return false;
        }
        zzZ38 zzz38 = (zzZ38) obj;
        return zzz38.zzWl1.equals(this.zzWl1) && zzz38.zzWkP.equals(this.zzWkP);
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

    public int hashCode() {
        return this.zzWl1.hashCode() ^ this.zzWkP.hashCode();
    }

    public final zzZ37 zzXGq() {
        return this.zzWkN;
    }

    public final BigInteger zzXHB() {
        return this.zzWkO;
    }

    public zzZ38(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public zzZ38(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, zzfW(i), i, null, null);
    }

    public zzZ38(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, zzZ37 zzz37) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, zzz37);
    }

    public zzZ38(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, zzZ37 zzz37) {
        if (i2 != 0) {
            if (BigInteger.valueOf(((long) (i2 - 1)) ^ 2).compareTo(bigInteger) == 1) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.zzWkP = bigInteger3;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
        this.zzWtq = i;
        this.zzWtn = i2;
        this.zzWkO = bigInteger4;
        this.zzWkN = zzz37;
    }
}
