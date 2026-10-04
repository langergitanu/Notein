package com.aspose.words.internal;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNH implements zzYQT, PublicKey {
    private transient zzZ3A zzVOR;

    public zzYNH(zzZ3A zzz3a) {
        this.zzVOR = zzz3a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYNH) {
            return zzYGU.zzp(((zzYNH) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVOR.zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVOR.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.zzVOR.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzZ("Public Key", getAlgorithm(), this.zzVOR);
    }

    public final zzZ3A zzXAd() {
        return this.zzVOR;
    }

    @Override // com.aspose.words.internal.zzYQT
    public final byte[] zzXGx() {
        return this.zzVOR.zzXGx();
    }

    public zzYNH(byte[] bArr) {
        this.zzVOR = new zzZ3A(bArr);
    }
}
