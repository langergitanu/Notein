package com.nimbusds.jose.crypto;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class DirectDecrypter extends DirectCryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {
    private final CriticalHeaderParamsDeferral critPolicy;
    private final boolean promiscuousMode;

    public DirectDecrypter(SecretKey secretKey) throws KeyLengthException {
        this(secretKey, false);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        if (!this.promiscuousMode) {
            JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
            if (!algorithm.equals(JWEAlgorithm.DIR)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            if (base64URL != null) {
                throw new JOSEException("Unexpected present JWE encrypted key");
            }
        }
        if (base64URL2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        return ContentCryptoProvider.decrypt(jWEHeader, null, base64URL2, base64URL3, base64URL4, getKey(), getJCAContext());
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public DirectDecrypter(SecretKey secretKey, boolean z) throws KeyLengthException {
        super(secretKey);
        this.critPolicy = new CriticalHeaderParamsDeferral();
        this.promiscuousMode = z;
    }

    public DirectDecrypter(byte[] bArr) throws KeyLengthException {
        this((SecretKey) new SecretKeySpec(bArr, AES256KeyLoader.AES_ALGORITHM), false);
    }

    public DirectDecrypter(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toSecretKey(AES256KeyLoader.AES_ALGORITHM));
    }

    public DirectDecrypter(SecretKey secretKey, Set<String> set) throws KeyLengthException {
        this(secretKey, set, false);
    }

    public DirectDecrypter(SecretKey secretKey, Set<String> set, boolean z) throws KeyLengthException {
        super(secretKey);
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        this.promiscuousMode = z;
    }
}
