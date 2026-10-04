package com.aspose.words.internal;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOT implements DHPublicKey {
    private transient zzZ3Y zzVSF;

    public zzYOT(zzZ5W zzz5w, DHPublicKey dHPublicKey) {
        this.zzVSF = new zzZ3Y(zzz5w, zzYPZ.zzZ(dHPublicKey.getParams()), dHPublicKey.getY());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DHPublicKey) {
            return obj instanceof zzYOT ? this.zzVSF.equals(((zzYOT) obj).zzVSF) : zzYGU.zzp(getEncoded(), ((DHPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSF.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        return zzYPZ.zzX(this.zzVSF.zzXGD());
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public final BigInteger getY() {
        return this.zzVSF.getY();
    }

    public final int hashCode() {
        return this.zzVSF.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzY("DH", this.zzVSF.getY(), this.zzVSF.zzXGD());
    }

    public final zzZ3Y zzXAY() {
        return this.zzVSF;
    }

    public zzYOT(zzZ5W zzz5w, DHPublicKeySpec dHPublicKeySpec) {
        this.zzVSF = new zzZ3Y(zzz5w, zzYPZ.zzZ(dHPublicKeySpec), dHPublicKeySpec.getY());
    }

    public zzYOT(zzZ3Y zzz3y) {
        this.zzVSF = zzz3y;
    }
}
