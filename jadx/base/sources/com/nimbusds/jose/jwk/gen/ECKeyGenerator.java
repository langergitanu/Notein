package com.nimbusds.jose.jwk.gen;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes9.dex */
public class ECKeyGenerator extends JWKGenerator<ECKey> {
    private final Curve crv;

    public ECKeyGenerator(Curve curve) {
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public ECKey generate() throws JOSEException {
        ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        try {
            KeyStore keyStore = this.keyStore;
            KeyPairGenerator keyPairGenerator = keyStore != null ? KeyPairGenerator.getInstance("EC", keyStore.getProvider()) : KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(eCParameterSpec);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            ECKey.Builder builderKeyStore = new ECKey.Builder(this.crv, (ECPublicKey) keyPairGenerateKeyPair.getPublic()).privateKey(keyPairGenerateKeyPair.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
            if (this.x5tKid) {
                builderKeyStore.keyIDFromThumbprint();
            } else {
                builderKeyStore.keyID(this.kid);
            }
            return builderKeyStore.build();
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new JOSEException(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new JOSEException(e.getMessage(), e);
        }
    }
}
