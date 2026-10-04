package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ2Z {
    private final int zzWEq;
    private final BigInteger zzWkH;
    private final BigInteger zzWl0;
    private final BigInteger zzWl1;

    public zzZ2Z(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzWEq = i;
        this.zzWkH = bigInteger3;
        this.zzWl1 = bigInteger;
        this.zzWl0 = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZ2Z)) {
            return false;
        }
        zzZ2Z zzz2z = (zzZ2Z) obj;
        return this.zzWEq == zzz2z.zzWEq && zzz2z.zzWl1.equals(this.zzWl1) && zzz2z.zzWl0.equals(this.zzWl0) && zzz2z.zzWkH.equals(this.zzWkH);
    }

    public final BigInteger getA() {
        return this.zzWkH;
    }

    public final int getKeySize() {
        return this.zzWEq;
    }

    public final BigInteger getP() {
        return this.zzWl1;
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final int hashCode() {
        return this.zzWl0.hashCode() + ((this.zzWl1.hashCode() + ((this.zzWkH.hashCode() + (this.zzWEq * 31)) * 31)) * 31);
    }
}
