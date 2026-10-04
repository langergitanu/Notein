package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3Z extends zzZ40 implements zzZ5S {
    private int zzWlA;
    private BigInteger zzWlw;
    private final AtomicBoolean zzWlx;

    public zzZ3Z(zzZ5W zzz5w, zzZ38 zzz38, BigInteger bigInteger) {
        super(zzz5w, zzz38);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = bigInteger;
        this.zzWlA = zzXGF();
    }

    private int zzXGF() {
        return zzXGD().hashCode() + (this.zzWlw.hashCode() * 31);
    }

    private static BigInteger zzZ(zzZ94 zzz94) {
        try {
            return zzZDD.zzYB(zzz94.zzXJ7()).zzXKZ();
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to parse DSA private key: ")), e);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzWlw = null;
        this.zzWlA = -1;
        zzXGG();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3Z)) {
            return false;
        }
        zzZ3Z zzz3z = (zzZ3Z) obj;
        return !isDestroyed() && !zzz3z.isDestroyed() && this.zzWlw.equals(zzz3z.zzWlw) && zzXGD().equals(zzz3z.zzXGD());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        zzZ38 zzz38ZzXGD = zzXGD();
        if (zzz38ZzXGD.getQ() == null) {
            return zzXGV().getName().startsWith("ELGAMAL") ? zzZ2X.zzY(new zzZ86(zzZ9K.zzWyT, new zzZ9L(zzz38ZzXGD.getP(), zzz38ZzXGD.getG())), new zzZDD(getX())) : zzZ2X.zzY(new zzZ86(zzZ96.zzWyk, new zzZ9G(zzz38ZzXGD.getP(), zzz38ZzXGD.getG(), zzz38ZzXGD.getL())), new zzZDD(getX()));
        }
        zzZ37 zzz37ZzXGq = zzz38ZzXGD.zzXGq();
        return zzz37ZzXGq != null ? zzZ2X.zzY(new zzZ86(zzZ6W.zzWnw, new zzZ78(zzz38ZzXGD.getP(), zzz38ZzXGD.getG(), zzz38ZzXGD.getQ(), zzz38ZzXGD.zzXHB(), new zzZ76(new zzZCG(zzz37ZzXGq.getSeed()), new zzZDD(zzz37ZzXGq.zzXGp())))), new zzZDD(getX())) : zzZ2X.zzY(new zzZ86(zzZ6W.zzWnw, new zzZ78(zzz38ZzXGD.getP(), zzz38ZzXGD.getG(), zzz38ZzXGD.getQ(), zzz38ZzXGD.zzXHB(), null)), new zzZDD(getX()));
    }

    public final BigInteger getX() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        return this.zzWlw;
    }

    public final int hashCode() {
        return this.zzWlA;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        zzXGE();
        return this.zzWlx.get();
    }

    @Override // com.aspose.words.internal.zzZ40
    public final zzZ38 zzXGD() {
        zzZ2X.zzZ(this);
        return super.zzXGD();
    }

    @Override // com.aspose.words.internal.zzZ40, com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        zzZ2X.zzZ(this);
        return super.zzXGV();
    }

    public zzZ3Z(zzZ5W zzz5w, zzZ94 zzz94) {
        super(zzz5w, zzz94.zzXJ8());
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = zzZ(zzz94);
        this.zzWlA = zzXGF();
    }
}
