package com.aspose.words.internal;

import android.os.Bundle;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNU implements RSAPublicKey {
    private transient zzZ3D zzVQs;

    public zzYNU(zzZ5W zzz5w, RSAPublicKey rSAPublicKey) {
        this.zzVQs = new zzZ3D(zzz5w, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RSAPublicKey) {
            return obj instanceof zzYNU ? this.zzVQs.equals(((zzYNU) obj).zzVQs) : zzYGU.zzp(getEncoded(), ((RSAPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVQs.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
        return this.zzVQs.getModulus();
    }

    @Override // java.security.interfaces.RSAPublicKey
    public final BigInteger getPublicExponent() {
        return this.zzVQs.getPublicExponent();
    }

    public final int hashCode() {
        return this.zzVQs.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public final String toString() {
        ?? sb = new StringBuilder("RSA Public Key [");
        String strLineSeparator = zzYGI.lineSeparator();
        sb.append(zzYPJ.zzR(getModulus()));
        sb.append("],[");
        Bundle.putString(sb, zzYPJ.zzQ(getPublicExponent()));
        sb.append(getModulus().toString(16));
        sb.append(strLineSeparator);
        sb.append("public exponent: ");
        sb.append(getPublicExponent().toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    public final zzZ3D zzXAn() {
        return this.zzVQs;
    }

    public zzYNU(zzZ5W zzz5w, RSAPublicKeySpec rSAPublicKeySpec) {
        this.zzVQs = new zzZ3D(zzz5w, rSAPublicKeySpec.getModulus(), rSAPublicKeySpec.getPublicExponent());
    }

    public zzYNU(zzZ3D zzz3d) {
        this.zzVQs = zzz3d;
    }
}
