package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAPrivateKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOR implements DSAPrivateKey, Destroyable {
    private transient zzZ3W zzVSv;

    public zzYOR(zzZ5W zzz5w, DSAPrivateKey dSAPrivateKey) {
        this.zzVSv = new zzZ3W(zzz5w, zzYPY.zzZ(dSAPrivateKey.getParams()), dSAPrivateKey.getX());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVSv.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOR) {
            return this.zzVSv.equals(((zzYOR) obj).zzVSv);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this);
        return "DSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSv.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public final DSAParams getParams() {
        return zzYPY.zzV(this.zzVSv.zzXGC());
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public final BigInteger getX() {
        return this.zzVSv.getX();
    }

    public final int hashCode() {
        return this.zzVSv.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVSv.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("DSA");
        }
        try {
            return zzYPJ.zzZ("DSA", this.zzVSv.getX(), this.zzVSv.zzXGC());
        } catch (Exception unused) {
            return zzYPJ.zzwp("DSA");
        }
    }

    public final zzZ3W zzXAS() {
        zzYPJ.zzZ(this);
        return this.zzVSv;
    }

    public zzYOR(zzZ5W zzz5w, DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.zzVSv = new zzZ3W(zzz5w, zzYPY.zzZ(dSAPrivateKeySpec), dSAPrivateKeySpec.getX());
    }

    public zzYOR(zzZ3W zzz3w) {
        this.zzVSv = zzz3w;
    }
}
