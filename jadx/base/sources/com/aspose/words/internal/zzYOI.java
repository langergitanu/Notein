package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOI implements ECPrivateKey, Destroyable {
    private transient zzZ3O zzVSd;

    public zzYOI(zzZ5W zzz5w, ECPrivateKey eCPrivateKey) {
        this.zzVSd = new zzZ3O(zzz5w, zzYPT.zzZ(eCPrivateKey.getParams()), eCPrivateKey.getS());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVSd.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOI) {
            return this.zzVSd.equals(((zzYOI) obj).zzVSd);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this);
        return "EC";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSd.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return zzYPT.zzP(this.zzVSd.zzXGy());
    }

    @Override // java.security.interfaces.ECPrivateKey
    public final BigInteger getS() {
        return this.zzVSd.getS();
    }

    public final int hashCode() {
        return this.zzVSd.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVSd.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("EC");
        }
        try {
            return zzYPJ.zzZ("EC", this.zzVSd.getS(), this.zzVSd.zzXGy());
        } catch (Exception unused) {
            return zzYPJ.zzwp("EC");
        }
    }

    public final zzZ3O zzXAI() {
        zzYPJ.zzZ(this);
        return this.zzVSd;
    }

    public zzYOI(zzZ5W zzz5w, ECPrivateKeySpec eCPrivateKeySpec) {
        this.zzVSd = new zzZ3O(zzz5w, zzYPT.zzZ(eCPrivateKeySpec.getParams()), eCPrivateKeySpec.getS());
    }

    public zzYOI(zzZ3O zzz3o) {
        this.zzVSd = zzz3o;
    }
}
