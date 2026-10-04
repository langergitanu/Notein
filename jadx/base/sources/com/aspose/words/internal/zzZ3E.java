package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3E extends zzZ3F implements zzZ5S, Destroyable {
    private BigInteger zzWkX;
    private BigInteger zzWkY;
    private BigInteger zzWkZ;
    private BigInteger zzWl0;
    private BigInteger zzWl1;
    private int zzWlA;
    private final AtomicBoolean zzWlx;
    private BigInteger zzWwd;
    private BigInteger zzWwe;

    public zzZ3E(zzZ5W zzz5w, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(zzz5w, bigInteger);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWwe = bigInteger2;
        this.zzWwd = bigInteger3;
        this.zzWl1 = bigInteger4;
        this.zzWl0 = bigInteger5;
        this.zzWkZ = bigInteger6;
        this.zzWkY = bigInteger7;
        this.zzWkX = bigInteger8;
        this.zzWlA = zzXGF();
    }

    private static zzZ91 zzX(zzZ94 zzz94) {
        try {
            return zzZ91.zzXD(zzz94.zzXJ7());
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to parse private key: ")), e);
        }
    }

    private int zzXGF() {
        return this.zzWkX.hashCode() + ((this.zzWkY.hashCode() + ((this.zzWkZ.hashCode() + ((this.zzWl0.hashCode() + ((this.zzWl1.hashCode() + ((this.zzWwd.hashCode() + ((this.zzWwe.hashCode() + (getModulus().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    private void zzXGr() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzWwe = null;
        this.zzWwd = null;
        this.zzWkX = null;
        this.zzWkY = null;
        this.zzWkZ = null;
        this.zzWl0 = null;
        this.zzWl1 = null;
        this.zzWlA = -1;
        zzXGG();
    }

    public final boolean equals(Object obj) {
        zzXGE();
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3E)) {
            return false;
        }
        zzZ3E zzz3e = (zzZ3E) obj;
        return !isDestroyed() && !zzz3e.isDestroyed() && getModulus().equals(zzz3e.getModulus()) && this.zzWwd.equals(zzz3e.zzWwd) && getPublicExponent().equals(zzz3e.getPublicExponent()) && this.zzWl1.equals(zzz3e.zzWl1) && this.zzWl0.equals(zzz3e.zzWl0) && this.zzWkZ.equals(zzz3e.zzWkZ) && this.zzWkY.equals(zzz3e.zzWkY) && this.zzWkX.equals(zzz3e.zzWkX);
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        zzXGE();
        zzZ2X.zzZ(this);
        zzZ2X.checkPermission(zzYUM.zzVZy);
        return zzZ2X.zzY(this.zzWl5, new zzZ91(getModulus(), this.zzWwe, getPrivateExponent(), getP(), getQ(), zzXGu(), zzXGt(), zzXGs()));
    }

    @Override // com.aspose.words.internal.zzZ3F
    public final BigInteger getModulus() {
        zzZ2X.zzZ(this);
        return super.getModulus();
    }

    public final BigInteger getP() {
        zzXGr();
        return this.zzWl1;
    }

    public final BigInteger getPrivateExponent() {
        zzXGr();
        return this.zzWwd;
    }

    public final BigInteger getPublicExponent() {
        zzZ2X.zzZ(this);
        return this.zzWwe;
    }

    public final BigInteger getQ() {
        zzXGr();
        return this.zzWl0;
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

    @Override // com.aspose.words.internal.zzZ3F, com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        zzZ2X.zzZ(this);
        return super.zzXGV();
    }

    public final BigInteger zzXGs() {
        zzXGr();
        return this.zzWkX;
    }

    public final BigInteger zzXGt() {
        zzXGr();
        return this.zzWkY;
    }

    public final BigInteger zzXGu() {
        zzXGr();
        return this.zzWkZ;
    }

    public zzZ3E(zzZ5W zzz5w, BigInteger bigInteger, BigInteger bigInteger2) {
        super(zzz5w, bigInteger);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWwd = bigInteger2;
        BigInteger bigInteger3 = BigInteger.ZERO;
        this.zzWwe = bigInteger3;
        this.zzWl1 = bigInteger3;
        this.zzWl0 = bigInteger3;
        this.zzWkZ = bigInteger3;
        this.zzWkY = bigInteger3;
        this.zzWkX = bigInteger3;
        this.zzWlA = zzXGF();
    }

    public zzZ3E(zzZ5W zzz5w, zzZ94 zzz94) {
        this(zzz5w, zzz94.zzXJ8(), zzX(zzz94));
    }

    private zzZ3E(zzZ5W zzz5w, zzZ86 zzz86, zzZ91 zzz91) {
        super(zzz5w, zzz86, zzZ2X.zzW(zzz91.getModulus()));
        this.zzWlx = new AtomicBoolean(false);
        this.zzWwe = zzz91.getPublicExponent();
        this.zzWwd = zzz91.getPrivateExponent();
        this.zzWl1 = zzz91.zzXJ0();
        this.zzWl0 = zzz91.zzXIZ();
        this.zzWkZ = zzz91.zzXIY();
        this.zzWkY = zzz91.zzXIX();
        this.zzWkX = zzz91.zzXIW();
        this.zzWlA = zzXGF();
    }
}
