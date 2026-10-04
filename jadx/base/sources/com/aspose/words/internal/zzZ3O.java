package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3O extends zzZ3P implements zzZ5S, Destroyable {
    private int zzWlA;
    private final byte[] zzWll;
    private BigInteger zzWlo;
    private final AtomicBoolean zzWlx;

    public zzZ3O(zzZ5W zzz5w, zzZ33 zzz33, BigInteger bigInteger) {
        this(zzz5w, zzz33, bigInteger, null);
    }

    private int zzXGF() {
        return zzXGy().hashCode() + (this.zzWlo.hashCode() * 31);
    }

    private static zzZ8V zzY(zzZ94 zzz94) {
        try {
            return zzZ8V.zzXz(zzz94.zzXJ7());
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to parse EC private key: ")), e);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        zzXGE();
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzWlo = null;
        this.zzWlA = -1;
        zzXGG();
    }

    public final boolean equals(Object obj) {
        zzXGE();
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3O)) {
            return false;
        }
        zzZ3O zzz3o = (zzZ3O) obj;
        if (isDestroyed() || zzz3o.isDestroyed() || !this.zzWlo.equals(zzz3o.zzWlo)) {
            return false;
        }
        return zzXGy().equals(zzz3o.zzXGy());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        zzZ74 zzz74ZzX = zzZ2X.zzX(zzXGy());
        int iZzW = zzZ2X.zzW(zzXGy());
        return zzZ2X.zzY(new zzZ86(zzZ6W.zzWoc, zzz74ZzX), this.zzWll != null ? new zzZ8V(iZzW, getS(), new zzZCG(this.zzWll), zzz74ZzX) : new zzZ8V(iZzW, getS(), zzz74ZzX));
    }

    public final BigInteger getS() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        return this.zzWlo;
    }

    public final int hashCode() {
        zzXGE();
        return this.zzWlA;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        zzXGE();
        return this.zzWlx.get();
    }

    @Override // com.aspose.words.internal.zzZ3P, com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        zzXGE();
        zzZ2X.zzZ(this);
        return super.zzXGV();
    }

    @Override // com.aspose.words.internal.zzZ3P
    public final zzZ33 zzXGy() {
        zzXGE();
        zzZ2X.zzZ(this);
        return super.zzXGy();
    }

    public zzZ3O(zzZ5W zzz5w, zzZ33 zzz33, BigInteger bigInteger, zzYLX zzylx) {
        super(zzz5w, zzz33);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlo = bigInteger;
        this.zzWll = zzY(zzylx);
        this.zzWlA = zzXGF();
    }

    public zzZ3O(zzZ5W zzz5w, byte[] bArr) {
        this(zzz5w, zzZ94.zzXG(bArr));
    }

    public zzZ3O(zzZ5W zzz5w, zzZ94 zzz94) {
        this(zzz5w, zzz94.zzXJ8(), zzY(zzz94));
    }

    private byte[] zzY(zzYLX zzylx) {
        zzXGE();
        zzZ2X.zzZ(this);
        if (zzylx == null) {
            return null;
        }
        return zzylx.zzOC(false);
    }

    private zzZ3O(zzZ5W zzz5w, zzZ86 zzz86, zzZ8V zzz8v) {
        super(zzz5w, zzz86);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlo = zzz8v.zzXIQ();
        zzZCG zzzcgZzXIP = zzz8v.zzXIP();
        this.zzWll = zzzcgZzXIP == null ? null : zzzcgZzXIP.getBytes();
        this.zzWlA = zzXGF();
    }
}
