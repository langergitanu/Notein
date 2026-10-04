package com.aspose.words.internal;

import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOK implements zzYQZ, Destroyable {
    private transient zzZ3R zzVSf;

    public zzYOK(zzZ5W zzz5w, zzYQZ zzyqz) {
        this.zzVSf = new zzZ3R(zzz5w, zzYPR.zzY(zzyqz.zzXBG()), zzyqz.getS());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVSf.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOK) {
            return this.zzVSf.equals(((zzYOK) obj).zzVSf);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVSf.zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSf.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    @Override // com.aspose.words.internal.zzYQZ
    public final BigInteger getS() {
        return this.zzVSf.getS();
    }

    public final int hashCode() {
        return this.zzVSf.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVSf.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("ECGOST3410");
        }
        try {
            return zzYPJ.zzZ("ECGOST3410", this.zzVSf.getS(), this.zzVSf.zzXGz().zzXGk());
        } catch (Exception unused) {
            return zzYPJ.zzwp("ECGOST3410");
        }
    }

    public final zzZ3R zzXAK() {
        zzYPJ.zzZ(this);
        return this.zzVSf;
    }

    @Override // com.aspose.words.internal.zzYQW
    public final zzYMM<zzYMV> zzXBG() {
        return zzYPR.zzX(this.zzVSf.zzXGz());
    }

    public zzYOK(zzZ5W zzz5w, zzYMU zzymu) {
        this.zzVSf = new zzZ3R(zzz5w, zzYPR.zzY(zzymu.zzXBG()), zzymu.getS());
    }

    public zzYOK(zzZ3R zzz3r) {
        this.zzVSf = zzz3r;
    }
}
