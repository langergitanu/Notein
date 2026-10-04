package com.nimbusds.jose.crypto.impl;

import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.util.Base64URL;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ECDHCryptoProvider extends BaseJWEProvider {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final ConcatKDF concatKDF;
    private final Curve curve;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.ECDH_ES);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A128KW);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A192KW);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A256KW);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHCryptoProvider(Curve curve) throws JOSEException {
        super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
        Curve curve2 = curve != null ? curve : new Curve("unknown");
        if (!supportedEllipticCurves().contains(curve)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEllipticCurve(curve2, supportedEllipticCurves()));
        }
        this.curve = curve;
        this.concatKDF = new ConcatKDF(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    public byte[] decryptWithZ(JWEHeader jWEHeader, SecretKey secretKey, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        ECDH.AlgorithmMode algorithmModeResolveAlgorithmMode = ECDH.resolveAlgorithmMode(jWEHeader.getAlgorithm());
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        SecretKey secretKeyDeriveSharedKey = ECDH.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        if (!algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.DIRECT)) {
            if (!algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.KW)) {
                throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + algorithmModeResolveAlgorithmMode);
            }
            if (base64URL == null) {
                throw new JOSEException("Missing JWE encrypted key");
            }
            secretKeyDeriveSharedKey = AESKW.unwrapCEK(secretKeyDeriveSharedKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        }
        return ContentCryptoProvider.decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, secretKeyDeriveSharedKey, getJCAContext());
    }

    public JWECryptoParts encryptWithZ(JWEHeader jWEHeader, SecretKey secretKey, byte[] bArr) throws JOSEException {
        return encryptWithZ(jWEHeader, secretKey, bArr, null);
    }

    public ConcatKDF getConcatKDF() {
        return this.concatKDF;
    }

    public Curve getCurve() {
        return this.curve;
    }

    @Override // com.nimbusds.jose.crypto.impl.BaseJWEProvider, com.nimbusds.jose.jca.JCAAware
    public /* bridge */ /* synthetic */ JWEJCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public abstract Set<Curve> supportedEllipticCurves();

    @Override // com.nimbusds.jose.crypto.impl.BaseJWEProvider, com.nimbusds.jose.JWEProvider
    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    @Override // com.nimbusds.jose.crypto.impl.BaseJWEProvider, com.nimbusds.jose.JWEProvider
    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }

    public JWECryptoParts encryptWithZ(JWEHeader jWEHeader, SecretKey secretKey, byte[] bArr, SecretKey secretKey2) throws JOSEException {
        Base64URL base64URLEncode;
        ECDH.AlgorithmMode algorithmModeResolveAlgorithmMode = ECDH.resolveAlgorithmMode(jWEHeader.getAlgorithm());
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        SecretKey secretKeyDeriveSharedKey = ECDH.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        if (algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.DIRECT)) {
            base64URLEncode = null;
        } else {
            if (!algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.KW)) {
                throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + algorithmModeResolveAlgorithmMode);
            }
            if (secretKey2 == null) {
                secretKey2 = ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
            }
            SecretKey secretKey3 = secretKey2;
            base64URLEncode = Base64URL.encode(AESKW.wrapCEK(secretKey2, secretKeyDeriveSharedKey, getJCAContext().getKeyEncryptionProvider()));
            secretKeyDeriveSharedKey = secretKey3;
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, secretKeyDeriveSharedKey, base64URLEncode, getJCAContext());
    }
}
