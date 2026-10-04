package com.aspose.words.internal;

import android.os.Bundle;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNW implements RSAPrivateCrtKey, RSAPrivateKey, Destroyable {
    private transient zzZ3E zzVQt;

    public zzYNW(zzZ5W zzz5w, RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.zzVQt = new zzZ3E(zzz5w, rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.zzVQt.destroy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYNW) {
            return this.zzVQt.equals(((zzYNW) obj).zzVQt);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this.zzVQt);
        return AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getCrtCoefficient() {
        return this.zzVQt.zzXGs();
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

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeExponentP() {
        return this.zzVQt.zzXGu();
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeExponentQ() {
        return this.zzVQt.zzXGt();
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeP() {
        return this.zzVQt.getP();
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeQ() {
        return this.zzVQt.getQ();
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public final BigInteger getPrivateExponent() {
        return this.zzVQt.getPrivateExponent();
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPublicExponent() {
        return this.zzVQt.getPublicExponent();
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
            sb.append("RSA Private CRT Key [DESTROYED]");
            sb.append(strLineSeparator);
        } else {
            sb.append("RSA Private CRT Key [");
            sb.append(zzYPJ.zzR(getModulus()));
            sb.append("],[");
            Bundle.putString(sb, zzYPJ.zzQ(getPublicExponent()));
            sb.append(getModulus().toString(16));
            sb.append(strLineSeparator);
            sb.append("     public exponent: ");
            sb.append(getPublicExponent().toString(16));
            sb.append(strLineSeparator);
        }
        return sb.toString();
    }

    public final zzZ3E zzXAo() {
        zzYPJ.zzZ(this.zzVQt);
        return this.zzVQt;
    }

    public zzYNW(zzZ5W zzz5w, RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.zzVQt = new zzZ3E(zzz5w, rSAPrivateCrtKeySpec.getModulus(), rSAPrivateCrtKeySpec.getPublicExponent(), rSAPrivateCrtKeySpec.getPrivateExponent(), rSAPrivateCrtKeySpec.getPrimeP(), rSAPrivateCrtKeySpec.getPrimeQ(), rSAPrivateCrtKeySpec.getPrimeExponentP(), rSAPrivateCrtKeySpec.getPrimeExponentQ(), rSAPrivateCrtKeySpec.getCrtCoefficient());
    }

    public zzYNW(zzZ3E zzz3e) {
        this.zzVQt = zzz3e;
    }
}
