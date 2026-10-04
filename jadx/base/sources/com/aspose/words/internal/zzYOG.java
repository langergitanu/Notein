package com.aspose.words.internal;

import java.io.IOException;
import java.security.PrivateKey;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOG implements zzYQX, PrivateKey, Destroyable {
    private transient zzZ3L zzVSb;

    public zzYOG(zzZ3L zzz3l) {
        this.zzVSb = zzz3l;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVSb.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOG) {
            return zzYGU.zzp(((zzYOG) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return zzXAG().zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return zzXAG().getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.zzVSb.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVSb.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("EdDSA");
        }
        return zzYPJ.zzZ("Private Key", getAlgorithm(), new zzZ3K(this.zzVSb.zzXGV(), this.zzVSb.zzXGx()));
    }

    public final zzZ3L zzXAG() {
        zzYPJ.zzZ(this);
        return this.zzVSb;
    }

    @Override // com.aspose.words.internal.zzYQX
    public final byte[] zzXGx() {
        return zzXAG().zzXGx();
    }

    public zzYOG(zzZ94 zzz94) throws IOException {
        this.zzVSb = new zzZ3L(zzz94);
    }
}
