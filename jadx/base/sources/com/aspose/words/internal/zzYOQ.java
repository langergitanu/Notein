package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOQ implements DSAPublicKey {
    private transient zzZ3V zzVSu;

    public zzYOQ(zzZ5W zzz5w, DSAPublicKey dSAPublicKey) {
        this.zzVSu = new zzZ3V(zzz5w, zzYPY.zzZ(dSAPublicKey.getParams()), dSAPublicKey.getY());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DSAPublicKey) {
            return obj instanceof zzYOQ ? this.zzVSu.equals(((zzYOQ) obj).zzVSu) : zzYGU.zzp(getEncoded(), ((DSAPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSu.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public final DSAParams getParams() {
        if (this.zzVSu.zzXGC() == null) {
            return null;
        }
        return zzYPY.zzV(this.zzVSu.zzXGC());
    }

    @Override // java.security.interfaces.DSAPublicKey
    public final BigInteger getY() {
        return this.zzVSu.getY();
    }

    public final int hashCode() {
        return this.zzVSu.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzY("DSA", this.zzVSu.getY(), this.zzVSu.zzXGC());
    }

    public final zzZ3V zzXAR() {
        return this.zzVSu;
    }

    public zzYOQ(zzZ5W zzz5w, DSAPublicKeySpec dSAPublicKeySpec) {
        this.zzVSu = new zzZ3V(zzz5w, zzYPY.zzZ(dSAPublicKeySpec), dSAPublicKeySpec.getY());
    }

    public zzYOQ(zzZ3V zzz3v) {
        this.zzVSu = zzz3v;
    }
}
