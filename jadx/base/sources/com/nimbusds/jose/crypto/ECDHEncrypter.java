package com.nimbusds.jose.crypto;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes9.dex */
public class ECDHEncrypter extends ECDHCryptoProvider implements JWEEncrypter {
    public static final Set<Curve> SUPPORTED_ELLIPTIC_CURVES;
    private final SecretKey contentEncryptionKey;
    private final ECPublicKey publicKey;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Curve.P_256);
        linkedHashSet.add(Curve.P_384);
        linkedHashSet.add(Curve.P_521);
        SUPPORTED_ELLIPTIC_CURVES = Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHEncrypter(ECPublicKey eCPublicKey) throws JOSEException {
        this(eCPublicKey, null);
    }

    private KeyPair generateEphemeralKeyPair(ECParameterSpec eCParameterSpec) throws JOSEException {
        Provider keyEncryptionProvider = getJCAContext().getKeyEncryptionProvider();
        try {
            KeyPairGenerator keyPairGenerator = keyEncryptionProvider != null ? KeyPairGenerator.getInstance("EC", keyEncryptionProvider) : KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(eCParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new JOSEException("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new JOSEException("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
        }
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        KeyPair keyPairGenerateEphemeralKeyPair = generateEphemeralKeyPair(this.publicKey.getParams());
        return encryptWithZ(new JWEHeader.Builder(jWEHeader).ephemeralPublicKey(new ECKey.Builder(getCurve(), (ECPublicKey) keyPairGenerateEphemeralKeyPair.getPublic()).build()).build(), ECDH.deriveSharedSecret(this.publicKey, (ECPrivateKey) keyPairGenerateEphemeralKeyPair.getPrivate(), getJCAContext().getKeyEncryptionProvider()), bArr, this.contentEncryptionKey);
    }

    public ECPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public Set<Curve> supportedEllipticCurves() {
        return SUPPORTED_ELLIPTIC_CURVES;
    }

    public ECDHEncrypter(ECKey eCKey) throws JOSEException {
        super(eCKey.getCurve());
        this.publicKey = eCKey.toECPublicKey();
        this.contentEncryptionKey = null;
    }

    public ECDHEncrypter(ECPublicKey eCPublicKey, SecretKey secretKey) throws JOSEException {
        super(Curve.forECParameterSpec(eCPublicKey.getParams()));
        this.publicKey = eCPublicKey;
        if (secretKey != null) {
            if (secretKey.getAlgorithm() != null && secretKey.getAlgorithm().equals(AES256KeyLoader.AES_ALGORITHM)) {
                this.contentEncryptionKey = secretKey;
                return;
            }
            throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
        }
        this.contentEncryptionKey = null;
    }
}
