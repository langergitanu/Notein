package com.aspose.words.internal;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3V extends zzZ3X implements zzZ5R {
    private BigInteger zzWlv;

    public zzZ3V(zzZ5W zzz5w, zzZ36 zzz36, BigInteger bigInteger) {
        super(zzz5w, zzz36);
        this.zzWlv = zzZ2X.zzZ(zzz36, bigInteger);
    }

    private static BigInteger zzY(zzZ7D zzz7d) {
        try {
            return zzZDD.zzYB(zzz7d.zzXHI()).zzXKZ();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3V)) {
            return false;
        }
        zzZ3V zzz3v = (zzZ3V) obj;
        return zzXGC() != null ? this.zzWlv.equals(zzz3v.zzWlv) && zzXGC().equals(zzz3v.zzXGC()) : this.zzWlv.equals(zzz3v.zzWlv) && zzXGC() == zzz3v.zzXGC();
    }

    public final byte[] getEncoded() {
        zzZ36 zzz36ZzXGC = zzXGC();
        return zzXGC() == null ? zzZ2X.zzZ(new zzZ86(zzZ6W.zzWnD), new zzZDD(this.zzWlv)) : zzZ2X.zzZ(new zzZ86(zzZ6W.zzWnD, new zzZ7Y(zzz36ZzXGC.getP(), zzz36ZzXGC.getQ(), zzz36ZzXGC.getG()).zzXL0()), new zzZDD(this.zzWlv));
    }

    public final BigInteger getY() {
        return this.zzWlv;
    }

    public final int hashCode() {
        int iHashCode = this.zzWlv.hashCode();
        if (zzXGC() == null) {
            return iHashCode;
        }
        return zzXGC().hashCode() + (iHashCode * 31);
    }

    public zzZ3V(zzZ5W zzz5w, zzZ7D zzz7d) {
        super(zzz5w, zzz7d.zzXHJ());
        this.zzWlv = zzZ2X.zzZ(zzXGC(), zzY(zzz7d));
    }
}
