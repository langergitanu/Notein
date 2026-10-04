package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3D extends zzZ3F implements zzZ5R {
    private final BigInteger zzWwe;

    public zzZ3D(zzZ5W zzz5w, BigInteger bigInteger, BigInteger bigInteger2) {
        super(zzz5w, zzZ2X.zzZ(bigInteger, bigInteger2));
        this.zzWwe = bigInteger2;
    }

    private static zzZ90 zzW(zzZ7D zzz7d) {
        try {
            return zzZ90.zzXC(zzz7d.zzXHI());
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to parse public key: ")), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3D)) {
            return false;
        }
        zzZ3D zzz3d = (zzZ3D) obj;
        return getModulus().equals(zzz3d.getModulus()) && this.zzWwe.equals(zzz3d.zzWwe);
    }

    public final void finalize() throws Throwable {
        zzXGG();
    }

    public final byte[] getEncoded() {
        return zzZ2X.zzZ(this.zzWl5, new zzZ90(getModulus(), this.zzWwe));
    }

    public final BigInteger getPublicExponent() {
        return this.zzWwe;
    }

    public final int hashCode() {
        return this.zzWwe.hashCode() + (getModulus().hashCode() * 31);
    }

    public zzZ3D(zzZ5W zzz5w, zzZ7D zzz7d) {
        this(zzz5w, zzz7d.zzXHJ(), zzW(zzz7d));
    }

    private zzZ3D(zzZ5W zzz5w, zzZ86 zzz86, zzZ90 zzz90) {
        super(zzz5w, zzz86, zzZ2X.zzZ(zzz90.getModulus(), zzz90.getPublicExponent()));
        this.zzWwe = zzz90.getPublicExponent();
    }
}
