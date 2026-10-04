package com.nimbusds.jose.crypto.impl;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class RSA_OAEP_256 {
    private static final String RSA_OEAP_256_JCA_ALG = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    private RSA_OAEP_256() {
    }

    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters algorithmParametersHelper = AlgorithmParametersHelper.getInstance("OAEP", provider);
            algorithmParametersHelper.init(new OAEPParameterSpec(KeyUtil.HMAC_KEY_HASH_ALGORITHM, IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher cipherHelper = CipherHelper.getInstance(RSA_OEAP_256_JCA_ALG, provider);
            cipherHelper.init(2, privateKey, algorithmParametersHelper);
            return new SecretKeySpec(cipherHelper.doFinal(bArr), AES256KeyLoader.AES_ALGORITHM);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters algorithmParametersHelper = AlgorithmParametersHelper.getInstance("OAEP", provider);
            algorithmParametersHelper.init(new OAEPParameterSpec(KeyUtil.HMAC_KEY_HASH_ALGORITHM, IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher cipherHelper = CipherHelper.getInstance(RSA_OEAP_256_JCA_ALG, provider);
            cipherHelper.init(1, rSAPublicKey, algorithmParametersHelper);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
