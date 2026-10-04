package com.aspose.words.internal;

import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOO implements zzYR1, Destroyable {
    private transient zzZ3T zzVSr;

    public zzYOO(zzZ5W zzz5w, zzYR1 zzyr1) {
        this.zzVSr = new zzZ3T(zzz5w, zzYPX.zzZ(zzyr1.zzXBH()), zzyr1.getS());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVSr.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOO) {
            return this.zzVSr.equals(((zzYOO) obj).zzVSr);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVSr.zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSr.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    @Override // com.aspose.words.internal.zzYR1
    public final BigInteger getS() {
        return this.zzVSr.getS();
    }

    public final int hashCode() {
        return this.zzVSr.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVSr.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("DSTU4145");
        }
        try {
            return zzYPJ.zzZ("DSTU4145", this.zzVSr.getS(), this.zzVSr.zzXGB().zzXGy());
        } catch (Exception unused) {
            return zzYPJ.zzwp("DSTU4145");
        }
    }

    public final zzZ3T zzXAO() {
        zzYPJ.zzZ(this);
        return this.zzVSr;
    }

    @Override // com.aspose.words.internal.zzYR2
    public final zzYMY zzXBH() {
        return zzYPX.zzZ(this.zzVSr.zzXGB());
    }

    public zzYOO(zzZ5W zzz5w, zzYMX zzymx) {
        this.zzVSr = new zzZ3T(zzz5w, zzYPX.zzZ(zzymx.zzXBH()), zzymx.getS());
    }

    public zzYOO(zzZ3T zzz3t) {
        this.zzVSr = zzz3t;
    }
}
