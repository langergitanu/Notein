package com.aspose.words.internal;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRG implements SecretKey {
    private final SecretKey zzVXg;
    private final byte[] zzWeH;

    public zzYRG(SecretKey secretKey, byte[] bArr) {
        this.zzVXg = secretKey;
        this.zzWeH = zzYGU.zzVI(bArr);
    }

    public final boolean equals(Object obj) {
        return this.zzVXg.equals(obj);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVXg.getAlgorithm();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVXg.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.zzVXg.getFormat();
    }

    public final int hashCode() {
        return this.zzVXg.hashCode();
    }

    public final zzYR3 zzXC1() {
        SecretKey secretKey = this.zzVXg;
        if (secretKey instanceof zzYRK) {
            return ((zzYRK) secretKey).zzXC1();
        }
        return null;
    }

    public final byte[] zzXGK() {
        return zzYGU.zzVI(this.zzWeH);
    }
}
