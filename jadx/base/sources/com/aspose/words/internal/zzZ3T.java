package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3T extends zzZ3U implements zzZ5S {
    private int zzWlA;
    private BigInteger zzWlo;
    private zzZ94 zzWlp;
    private final AtomicBoolean zzWlx;

    public zzZ3T(zzZ5W zzz5w, zzZ34 zzz34, BigInteger bigInteger) {
        super(zzz5w, zzz34);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlo = bigInteger;
        this.zzWlA = zzXGF();
    }

    private int zzXGF() {
        return zzXGB().hashCode() + (this.zzWlo.hashCode() * 31);
    }

    private static BigInteger zzZ(zzZ94 zzz94) {
        try {
            zzZDK zzzdkZzXJ7 = zzz94.zzXJ7();
            return zzzdkZzXJ7 instanceof zzZDD ? zzZDD.zzYB(zzzdkZzXJ7).zzXKZ() : zzZ8V.zzXz(zzzdkZzXJ7).zzXIQ();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSTU4145 private key");
        }
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        zzZ3U.zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzWlo = null;
        this.zzWlA = -1;
        zzXGG();
    }

    public final boolean equals(Object obj) {
        zzZ3U.zzXGE();
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3T)) {
            return false;
        }
        zzZ3T zzz3t = (zzZ3T) obj;
        if (isDestroyed() || zzz3t.isDestroyed()) {
            return false;
        }
        BigInteger bigInteger = this.zzWlo;
        if (bigInteger == null) {
            if (zzz3t.zzWlo != null) {
                return false;
            }
        } else if (!bigInteger.equals(zzz3t.zzWlo)) {
            return false;
        }
        return zzXGB().equals(zzz3t.zzXGB());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        zzZ3U.zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ94 zzz94 = this.zzWlp;
        if (zzz94 != null) {
            return zzZ2X.zzZ(zzz94);
        }
        zzZ34 zzz34ZzXGB = zzXGB();
        int iZzW = zzZ2X.zzW(zzz34ZzXGB.zzXGy());
        if (zzz34ZzXGB.zzXGy() instanceof zzZ2W) {
            zzZ8I zzz8i = new zzZ8I(((zzZ2W) zzz34ZzXGB.zzXGy()).zzXGj(), zzz34ZzXGB.zzXIw());
            return zzZ2X.zzY(new zzZ86(zzZ8G.zzWt9, zzz8i), new zzZ8V(iZzW, getS(), zzz8i));
        }
        if (!(zzz34ZzXGB.zzXGy().zzXHv() instanceof zzYM1.zzZ)) {
            throw new IllegalArgumentException("Unable to encode binary parameters");
        }
        zzZ8I zzz8i2 = new zzZ8I(new zzZ8K(zzz34ZzXGB.zzXGy()));
        return zzZ2X.zzY(new zzZ86(zzZ8G.zzWt9, zzz8i2), new zzZ8V(iZzW, getS(), zzz8i2));
    }

    public final BigInteger getS() {
        zzZ3U.zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        return this.zzWlo;
    }

    public final int hashCode() {
        zzZ3U.zzXGE();
        return this.zzWlA;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        zzZ3U.zzXGE();
        return this.zzWlx.get();
    }

    @Override // com.aspose.words.internal.zzZ3U
    public final zzZ34 zzXGB() {
        zzZ2X.zzZ(this);
        return super.zzXGB();
    }

    @Override // com.aspose.words.internal.zzZ3U, com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        zzZ2X.zzZ(this);
        return super.zzXGV();
    }

    public zzZ3T(zzZ5W zzz5w, zzZ94 zzz94) {
        super(zzz5w, zzz94.zzXJ8());
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlp = zzz94;
        this.zzWlo = zzZ(zzz94);
        this.zzWlA = zzXGF();
    }
}
