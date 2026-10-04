package com.aspose.words.internal;

import java.io.IOException;
import java.security.PrivateKey;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNI implements zzYQT, PrivateKey, Destroyable {
    private transient zzZ3B zzVOS;

    public zzYNI(zzZ3B zzz3b) {
        this.zzVOS = zzz3b;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVOS.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYNI) {
            return zzYGU.zzp(((zzYNI) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return zzXAe().zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return zzXAe().getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.zzVOS.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVOS.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("XDH");
        }
        return zzYPJ.zzZ("Private Key", getAlgorithm(), new zzZ3A(this.zzVOS.zzXGV(), this.zzVOS.zzXGx()));
    }

    public final zzZ3B zzXAe() {
        zzYPJ.zzZ(this);
        return this.zzVOS;
    }

    @Override // com.aspose.words.internal.zzYQT
    public final byte[] zzXGx() {
        return zzXAe().zzXGx();
    }

    public zzYNI(zzZ94 zzz94) throws IOException {
        this.zzVOS = new zzZ3B(zzz94);
    }
}
