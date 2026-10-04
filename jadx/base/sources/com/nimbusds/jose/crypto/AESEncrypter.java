package com.nimbusds.jose.crypto;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AESCryptoProvider;
import com.nimbusds.jose.crypto.impl.AESGCM;
import com.nimbusds.jose.crypto.impl.AESGCMKW;
import com.nimbusds.jose.crypto.impl.AESKW;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class AESEncrypter extends AESCryptoProvider implements JWEEncrypter {

    public enum AlgFamily {
        AESKW,
        AESGCMKW
    }

    public AESEncrypter(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        AlgFamily algFamily;
        Base64URL base64URLEncode;
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (algorithm.equals(JWEAlgorithm.A128KW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128KW encryption");
            }
            algFamily = AlgFamily.AESKW;
        } else if (algorithm.equals(JWEAlgorithm.A192KW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192KW encryption");
            }
            algFamily = AlgFamily.AESKW;
        } else if (algorithm.equals(JWEAlgorithm.A256KW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256KW encryption");
            }
            algFamily = AlgFamily.AESKW;
        } else if (algorithm.equals(JWEAlgorithm.A128GCMKW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128GCMKW encryption");
            }
            algFamily = AlgFamily.AESGCMKW;
        } else if (algorithm.equals(JWEAlgorithm.A192GCMKW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192GCMKW encryption");
            }
            algFamily = AlgFamily.AESGCMKW;
        } else {
            if (!algorithm.equals(JWEAlgorithm.A256GCMKW)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, AESCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256GCMKW encryption");
            }
            algFamily = AlgFamily.AESGCMKW;
        }
        SecretKey secretKeyGenerateCEK = ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
        if (AlgFamily.AESKW.equals(algFamily)) {
            base64URLEncode = Base64URL.encode(AESKW.wrapCEK(secretKeyGenerateCEK, getKey(), getJCAContext().getKeyEncryptionProvider()));
        } else {
            if (!AlgFamily.AESGCMKW.equals(algFamily)) {
                throw new JOSEException("Unexpected JWE algorithm: " + algorithm);
            }
            Container container = new Container(AESGCM.generateIV(getJCAContext().getSecureRandom()));
            AuthenticatedCipherText authenticatedCipherTextEncryptCEK = AESGCMKW.encryptCEK(secretKeyGenerateCEK, container, getKey(), getJCAContext().getKeyEncryptionProvider());
            Base64URL base64URLEncode2 = Base64URL.encode(authenticatedCipherTextEncryptCEK.getCipherText());
            jWEHeader = new JWEHeader.Builder(jWEHeader).m80459iv(Base64URL.encode((byte[]) container.get())).authTag(Base64URL.encode(authenticatedCipherTextEncryptCEK.getAuthenticationTag())).build();
            base64URLEncode = base64URLEncode2;
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, secretKeyGenerateCEK, base64URLEncode, getJCAContext());
    }

    public AESEncrypter(byte[] bArr) throws KeyLengthException {
        this(new SecretKeySpec(bArr, AES256KeyLoader.AES_ALGORITHM));
    }

    public AESEncrypter(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toSecretKey(AES256KeyLoader.AES_ALGORITHM));
    }
}
