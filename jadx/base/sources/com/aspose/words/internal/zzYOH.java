package com.aspose.words.internal;

import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOH implements ECPublicKey {
    private transient zzZ3N zzVSc;

    public zzYOH(zzZ5W zzz5w, ECPublicKey eCPublicKey) {
        zzZ33 zzz33ZzZ = zzYPT.zzZ(eCPublicKey.getParams());
        this.zzVSc = new zzZ3N(zzz5w, zzz33ZzZ, zzYPT.zzZ(zzz33ZzZ.zzXHv(), eCPublicKey.getW()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ECPublicKey) {
            return obj instanceof zzYOH ? this.zzVSc.equals(((zzYOH) obj).zzVSc) : zzYGU.zzp(getEncoded(), ((ECPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "EC";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSc.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return zzYPT.zzP(this.zzVSc.zzXGy());
    }

    @Override // java.security.interfaces.ECPublicKey
    public final ECPoint getW() {
        return new ECPoint(this.zzVSc.zzXGA().zzXzn().toBigInteger(), this.zzVSc.zzXGA().zzXzm().toBigInteger());
    }

    public final int hashCode() {
        return this.zzVSc.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzZ("EC", this.zzVSc.zzXGA(), this.zzVSc.zzXGy());
    }

    public final zzZ3N zzXAH() {
        return this.zzVSc;
    }

    public zzYOH(zzZ5W zzz5w, ECPublicKeySpec eCPublicKeySpec) {
        zzZ33 zzz33ZzZ = zzYPT.zzZ(eCPublicKeySpec.getParams());
        this.zzVSc = new zzZ3N(zzz5w, zzz33ZzZ, zzYPT.zzZ(zzz33ZzZ.zzXHv(), eCPublicKeySpec.getW()));
    }

    public zzYOH(zzZ3N zzz3n) {
        this.zzVSc = zzz3n;
    }
}
