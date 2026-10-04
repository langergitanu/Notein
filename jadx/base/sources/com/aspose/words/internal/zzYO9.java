package com.aspose.words.internal;

import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYO9 implements zzYQV, Destroyable {
    private transient zzZ3I zzVRI;

    public zzYO9(zzZ5W zzz5w, zzYQV zzyqv) {
        this.zzVRI = new zzZ3I(zzz5w, zzYPR.zzZ(zzyqv.zzXBG()), zzyqv.getX());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVRI.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYO9) {
            return this.zzVRI.equals(((zzYO9) obj).zzVRI);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this);
        return "GOST3410";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVRI.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    @Override // com.aspose.words.internal.zzYQV
    public final BigInteger getX() {
        return this.zzVRI.getX();
    }

    public final int hashCode() {
        return this.zzVRI.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVRI.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("GOST3410");
        }
        try {
            return zzYPJ.zzZ("GOST3410", this.zzVRI.getX(), this.zzVRI.zzXGz().zzXGk());
        } catch (Exception unused) {
            return zzYPJ.zzwp("GOST3410");
        }
    }

    public final zzZ3I zzXAD() {
        zzYPJ.zzZ(this);
        return this.zzVRI;
    }

    @Override // com.aspose.words.internal.zzYQW
    public final zzYMM<zzYMN> zzXBG() {
        return zzYPR.zzW(this.zzVRI.zzXGz());
    }

    public zzYO9(zzZ5W zzz5w, zzYML zzyml) {
        this.zzVRI = new zzZ3I(zzz5w, zzYPR.zzZ(zzyml.zzXBG()), zzyml.getX());
    }

    public zzYO9(zzZ3I zzz3i) {
        this.zzVRI = zzz3i;
    }
}
