package com.aspose.words.internal;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOU implements DHPrivateKey, Destroyable {
    private transient zzZ3Z zzVSG;

    public zzYOU(zzZ5W zzz5w, DHPrivateKey dHPrivateKey) {
        this.zzVSG = new zzZ3Z(zzz5w, zzYPZ.zzZ(dHPrivateKey.getParams()), dHPrivateKey.getX());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVSG.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOU) {
            return this.zzVSG.equals(((zzYOU) obj).zzVSG);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this);
        return "DH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSG.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        return zzYPZ.zzX(this.zzVSG.zzXGD());
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public final BigInteger getX() {
        return this.zzVSG.getX();
    }

    public final int hashCode() {
        return this.zzVSG.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVSG.isDestroyed();
    }

    public final String toString() {
        if (isDestroyed()) {
            return zzYPJ.zzwq("DH");
        }
        try {
            return zzYPJ.zzZ("DH", this.zzVSG.getX(), this.zzVSG.zzXGD());
        } catch (Exception unused) {
            return zzYPJ.zzwp("DH");
        }
    }

    public final zzZ3Z zzXAZ() {
        return this.zzVSG;
    }

    public zzYOU(zzZ5W zzz5w, DHPrivateKeySpec dHPrivateKeySpec) {
        this.zzVSG = new zzZ3Z(zzz5w, zzYPZ.zzZ(dHPrivateKeySpec), dHPrivateKeySpec.getX());
    }

    public zzYOU(zzZ3Z zzz3z) {
        this.zzVSG = zzz3z;
    }
}
