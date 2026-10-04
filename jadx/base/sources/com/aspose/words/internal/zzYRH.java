package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRH {
    private PublicKey zzVX5;
    private PrivateKey zzZWV;

    public zzYRH(final PublicKey publicKey, final PrivateKey privateKey) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.aspose.words.internal.zzYRH.1
            @Override // java.security.PrivilegedAction
            public final Object run() {
                zzYRH.zzZ(publicKey, privateKey);
                return null;
            }
        });
        this.zzVX5 = publicKey;
        this.zzZWV = privateKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzZ(PublicKey publicKey, PrivateKey privateKey) {
        if ((publicKey instanceof ECKey) && (privateKey instanceof ECKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            if (!eCPrivateKey.getParams().getCurve().equals(eCPublicKey.getParams().getCurve()) || !eCPrivateKey.getParams().getGenerator().equals(eCPublicKey.getParams().getGenerator()) || !eCPrivateKey.getParams().getOrder().equals(eCPublicKey.getParams().getOrder()) || eCPrivateKey.getParams().getCofactor() != eCPublicKey.getParams().getCofactor()) {
                throw new IllegalArgumentException("EC keys do not have the same domain parameters");
            }
            zzYMV zzymv = new zzYMV(eCPrivateKey.getParams());
            if (!zzymv.zzXGy().zzXHu().zzK(eCPrivateKey.getS()).zzXze().zzU(zzymv.zzXGy().zzXHv().zzX(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()))) {
                throw new IllegalArgumentException("EC public key not consistent with EC private key");
            }
            return;
        }
        if ((publicKey instanceof DHKey) && (privateKey instanceof DHKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            if (!params.getG().equals(dHPublicKey.getParams().getG()) && !params.getP().equals(dHPublicKey.getParams().getP())) {
                throw new IllegalArgumentException("DH keys do not have the same domain parameters");
            }
            if (!params.getG().modPow(dHPrivateKey.getX(), params.getP()).equals(dHPublicKey.getY())) {
                throw new IllegalArgumentException("DH public key not consistent with DH private key");
            }
            return;
        }
        if ((publicKey instanceof DSAKey) && (privateKey instanceof DSAKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            DSAPublicKey dSAPublicKey = (DSAPublicKey) publicKey;
            DSAParams params2 = dSAPrivateKey.getParams();
            if (!params2.getG().equals(dSAPublicKey.getParams().getG()) && !params2.getP().equals(dSAPublicKey.getParams().getP()) && !params2.getQ().equals(dSAPublicKey.getParams().getQ())) {
                throw new IllegalArgumentException("DSA keys do not have the same domain parameters");
            }
            if (!params2.getG().modPow(dSAPrivateKey.getX(), params2.getP()).equals(dSAPublicKey.getY())) {
                throw new IllegalArgumentException("DSA public key not consistent with DSA private key");
            }
            return;
        }
        if ((publicKey instanceof RSAKey) && (privateKey instanceof RSAKey)) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) privateKey;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            if (!rSAPrivateKey.getModulus().equals(rSAPublicKey.getModulus())) {
                throw new IllegalArgumentException("RSA keys do not have the same modulus");
            }
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            if (!bigIntegerValueOf.modPow(rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getModulus()).modPow(rSAPublicKey.getPublicExponent(), rSAPrivateKey.getModulus()).equals(bigIntegerValueOf)) {
                throw new IllegalArgumentException("RSA public key not consistent with RSA private key");
            }
            return;
        }
        if ((publicKey instanceof zzYQW) && (privateKey instanceof zzYQW)) {
            if (!((zzYQW) publicKey).zzXBG().equals(((zzYQW) privateKey).zzXBG())) {
                throw new IllegalArgumentException("GOST3410 parameters mismatch");
            }
            if ((publicKey instanceof zzYQU) && (privateKey instanceof zzYQV)) {
                zzYQV zzyqv = (zzYQV) privateKey;
                zzYMN zzymn = (zzYMN) zzyqv.zzXBG().zzXA3();
                if (!zzymn.getA().modPow(zzyqv.getX(), zzymn.getP()).equals(((zzYQU) publicKey).getY())) {
                    throw new IllegalArgumentException("GOST3410 public key not consistent with GOST3410 private key");
                }
                return;
            }
            if (!(publicKey instanceof zzYQY) || !(privateKey instanceof zzYQZ)) {
                throw new IllegalArgumentException("GOST3410 key pair inconsistent");
            }
            zzYQZ zzyqz = (zzYQZ) privateKey;
            zzYQY zzyqy = (zzYQY) publicKey;
            zzYMV zzymv2 = new zzYMV((zzYMV) zzyqz.zzXBG().zzXA3());
            if (!zzymv2.zzXGy().zzXHu().zzK(zzyqz.getS()).zzXze().zzU(zzymv2.zzXGy().zzXHv().zzX(zzyqy.getW().getAffineX(), zzyqy.getW().getAffineY()))) {
                throw new IllegalArgumentException("ECGOST3410 public key not consistent with ECGOST3410 private key");
            }
            return;
        }
        if ((publicKey instanceof zzYR2) && (privateKey instanceof zzYR2)) {
            zzYR1 zzyr1 = (zzYR1) privateKey;
            zzYR0 zzyr0 = (zzYR0) publicKey;
            if (!zzyr1.zzXBH().equals(zzyr0.zzXBH())) {
                throw new IllegalArgumentException("DSTU4145 keys do not have the same domain parameters");
            }
            zzYMV zzymv3 = new zzYMV(zzyr1.zzXBH());
            if (!zzymv3.zzXGy().zzXHu().zzK(zzyr1.getS()).zzXzc().zzXze().zzU(zzymv3.zzXGy().zzXHv().zzX(zzyr0.getW().getAffineX(), zzyr0.getW().getAffineY()))) {
                throw new IllegalArgumentException("DSTU4145 public key not consistent with DSTU4145 private key");
            }
            return;
        }
        if ((publicKey instanceof zzYQX) && (privateKey instanceof zzYQX)) {
            zzYQX zzyqx = (zzYQX) privateKey;
            zzYQX zzyqx2 = (zzYQX) publicKey;
            if (!zzyqx.getAlgorithm().equals(zzyqx2.getAlgorithm())) {
                throw new IllegalArgumentException("EdDSA keys do not have the same domain parameters");
            }
            if (!zzYGU.zzp(zzyqx.zzXGx(), zzyqx2.zzXGx())) {
                throw new IllegalArgumentException("EdDSA public key not consistent with EdDSA private key");
            }
            return;
        }
        if (!(publicKey instanceof zzYQT) || !(privateKey instanceof zzYQT)) {
            throw new IllegalArgumentException("Key pair inconsistent");
        }
        zzYQT zzyqt = (zzYQT) privateKey;
        zzYQT zzyqt2 = (zzYQT) publicKey;
        if (!zzyqt.getAlgorithm().equals(zzyqt2.getAlgorithm())) {
            throw new IllegalArgumentException("XDH keys do not have the same domain parameters");
        }
        if (!zzYGU.zzp(zzyqt.zzXGx(), zzyqt2.zzXGx())) {
            throw new IllegalArgumentException("XDH public key not consistent with XDH private key");
        }
    }
}
