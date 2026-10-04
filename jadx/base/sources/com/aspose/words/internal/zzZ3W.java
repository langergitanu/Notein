package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3W extends zzZ3X implements zzZ5S {
    private int zzWlA;
    private BigInteger zzWlw;
    private final AtomicBoolean zzWlx;

    public zzZ3W(zzZ5W zzz5w, zzZ36 zzz36, BigInteger bigInteger) {
        super(zzz5w, zzz36);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = bigInteger;
        this.zzWlA = zzXGF();
    }

    private int zzXGF() {
        return zzXGC().hashCode() + (this.zzWlw.hashCode() * 31);
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
        if (!(obj instanceof zzZ3W)) {
            return false;
        }
        zzZ3W zzz3w = (zzZ3W) obj;
        return !isDestroyed() && !zzz3w.isDestroyed() && this.zzWlw.equals(zzz3w.zzWlw) && zzXGC().equals(zzz3w.zzXGC());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        zzZ36 zzz36ZzXGC = zzXGC();
        return zzZ2X.zzY(new zzZ86(zzZ6W.zzWnD, new zzZ7Y(zzz36ZzXGC.getP(), zzz36ZzXGC.getQ(), zzz36ZzXGC.getG())), new zzZDD(getX()));
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

    @Override // com.aspose.words.internal.zzZ3X
    public final zzZ36 zzXGC() {
        zzZ2X.zzZ(this);
        return super.zzXGC();
    }

    @Override // com.aspose.words.internal.zzZ3X, com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        zzZ2X.zzZ(this);
        return super.zzXGV();
    }

    public zzZ3W(zzZ5W zzz5w, byte[] bArr) {
        this(zzz5w, zzZ94.zzXG(bArr));
    }

    public zzZ3W(zzZ5W zzz5w, zzZ94 zzz94) {
        super(zzz5w, zzz94.zzXJ8());
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = zzZ(zzz94);
        this.zzWlA = zzXGF();
    }
}
