package com.aspose.words.internal;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOF implements zzYQX, PublicKey {
    private transient zzZ3K zzVSa;

    public zzYOF(zzZ3K zzz3k) {
        this.zzVSa = zzz3k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOF) {
            return zzYGU.zzp(((zzYOF) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVSa.zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSa.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.zzVSa.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzZ("Public Key", getAlgorithm(), this.zzVSa);
    }

    public final zzZ3K zzXAF() {
        return this.zzVSa;
    }

    @Override // com.aspose.words.internal.zzYQX
    public final byte[] zzXGx() {
        return this.zzVSa.zzXGx();
    }

    public zzYOF(byte[] bArr) {
        this.zzVSa = new zzZ3K(bArr);
    }
}
