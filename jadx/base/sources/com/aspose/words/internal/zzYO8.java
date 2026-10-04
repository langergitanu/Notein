package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYO8 implements zzYQU {
    private transient zzZ3H zzVRH;

    public zzYO8(zzZ5W zzz5w, zzYQU zzyqu) {
        this.zzVRH = new zzZ3H(zzz5w, zzYPR.zzZ(zzyqu.zzXBG()), zzyqu.getY());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYO8) {
            return this.zzVRH.equals(((zzYO8) obj).zzVRH);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVRH.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // com.aspose.words.internal.zzYQU
    public final BigInteger getY() {
        return this.zzVRH.getY();
    }

    public final int hashCode() {
        return this.zzVRH.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzY("GOST3410", this.zzVRH.getY(), this.zzVRH.zzXGz().zzXGk());
    }

    public final zzZ3H zzXAC() {
        return this.zzVRH;
    }

    @Override // com.aspose.words.internal.zzYQW
    public final zzYMM<zzYMN> zzXBG() {
        return zzYPR.zzW(this.zzVRH.zzXGz());
    }

    public zzYO8(zzZ5W zzz5w, zzYMK zzymk) {
        this.zzVRH = new zzZ3H(zzz5w, zzYPR.zzZ(zzymk.zzXBG()), zzymk.getY());
    }

    public zzYO8(zzZ3H zzz3h) {
        this.zzVRH = zzz3h;
    }
}
