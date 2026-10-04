package com.aspose.words.internal;

import android.os.Bundle;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNV implements RSAPrivateKey, Destroyable {
    private transient zzZ3E zzVQt;

    public zzYNV(zzZ5W zzz5w, RSAPrivateKey rSAPrivateKey) {
        this.zzVQt = new zzZ3E(zzz5w, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVQt.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYNV) {
            return this.zzVQt.equals(((zzYNV) obj).zzVQt);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this.zzVQt);
        return AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVQt.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this.zzVQt);
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
        return this.zzVQt.getModulus();
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public final BigInteger getPrivateExponent() {
        return this.zzVQt.getPrivateExponent();
    }

    public final int hashCode() {
        return this.zzVQt.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzVQt.isDestroyed();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public final String toString() {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        if (isDestroyed()) {
            sb.append("RSA Private Key [DESTROYED]");
            sb.append(strLineSeparator);
        } else {
            sb.append("RSA Private Key [");
            Bundle.putString(sb, zzYPJ.zzR(getModulus()));
            sb.append(getModulus().toString(16));
            sb.append(strLineSeparator);
        }
        return sb.toString();
    }

    public final zzZ3E zzXAo() {
        zzYPJ.zzZ(this.zzVQt);
        return this.zzVQt;
    }

    public zzYNV(zzZ5W zzz5w, RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.zzVQt = new zzZ3E(zzz5w, rSAPrivateKeySpec.getModulus(), rSAPrivateKeySpec.getPrivateExponent());
    }

    public zzYNV(zzZ3E zzz3e) {
        this.zzVQt = zzz3e;
    }
}
