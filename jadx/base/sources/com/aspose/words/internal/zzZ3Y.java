package com.aspose.words.internal;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3Y extends zzZ40 implements zzZ5R {
    private zzZ7D zzWlu;
    private BigInteger zzWlv;

    public zzZ3Y(zzZ5W zzz5w, zzZ38 zzz38, BigInteger bigInteger) {
        super(zzz5w, zzz38);
        this.zzWlv = zzZ2X.zzZ(zzz38, bigInteger);
    }

    private static BigInteger zzY(zzZ7D zzz7d) {
        try {
            zzZDD zzzddZzYB = zzZDD.zzYB(zzz7d.zzXHI());
            if (zzzddZzYB != null) {
                return zzzddZzYB.zzXKZ();
            }
            throw new NullPointerException("keyData in SubjectPublicKeyInfo is empty");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Invalid info structure in DH public key");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3Y)) {
            return false;
        }
        zzZ3Y zzz3y = (zzZ3Y) obj;
        return this.zzWlv.equals(zzz3y.zzWlv) && zzXGD().equals(zzz3y.zzXGD());
    }

    public final byte[] getEncoded() {
        zzZ38 zzz38ZzXGD = zzXGD();
        zzZ7D zzz7d = this.zzWlu;
        if (zzz7d != null) {
            return zzZ2X.zzZ(zzz7d);
        }
        if (zzz38ZzXGD.getQ() == null) {
            return zzXGV().getName().startsWith("ELGAMAL") ? zzZ2X.zzZ(new zzZ86(zzZ9K.zzWyT, new zzZ9L(zzz38ZzXGD.getP(), zzz38ZzXGD.getG())), new zzZDD(this.zzWlv)) : zzZ2X.zzZ(new zzZ86(zzZ96.zzWyk, new zzZ9G(zzz38ZzXGD.getP(), zzz38ZzXGD.getG(), zzz38ZzXGD.getL())), new zzZDD(this.zzWlv));
        }
        zzZ37 zzz37ZzXGq = zzz38ZzXGD.zzXGq();
        return zzz37ZzXGq != null ? zzZ2X.zzZ(new zzZ86(zzZ6W.zzWnw, new zzZ78(zzz38ZzXGD.getP(), zzz38ZzXGD.getG(), zzz38ZzXGD.getQ(), zzz38ZzXGD.zzXHB(), new zzZ76(zzz37ZzXGq.getSeed(), zzz37ZzXGq.zzXGp()))), new zzZDD(this.zzWlv)) : zzZ2X.zzZ(new zzZ86(zzZ6W.zzWnw, new zzZ78(zzz38ZzXGD.getP(), zzz38ZzXGD.getG(), zzz38ZzXGD.getQ(), zzz38ZzXGD.zzXHB(), null)), new zzZDD(this.zzWlv));
    }

    public final BigInteger getY() {
        return this.zzWlv;
    }

    public final int hashCode() {
        return zzXGD().hashCode() + (this.zzWlv.hashCode() * 31);
    }

    public zzZ3Y(zzZ5W zzz5w, zzZ7D zzz7d) {
        super(zzz5w, zzz7d.zzXHJ());
        this.zzWlv = zzZ2X.zzZ(zzXGD(), zzY(zzz7d));
        this.zzWlu = zzz7d;
    }
}
