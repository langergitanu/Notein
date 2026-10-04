package com.nimbusds.jose.crypto.impl;

import OooOO0.OooO0OO;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.ByteUtils;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class RSA1_5 {
    private RSA1_5() {
    }

    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, int i, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(2, privateKey);
            byte[] bArrDoFinal = cipherHelper.doFinal(bArr);
            if (ByteUtils.safeBitLength(bArrDoFinal) != i) {
                return null;
            }
            return new SecretKeySpec(bArrDoFinal, AES256KeyLoader.AES_ALGORITHM);
        } catch (Exception e) {
            throw new JOSEException(OooO0OO.OooO0Oo(e, new StringBuilder("Couldn't decrypt Content Encryption Key (CEK): ")), e);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(1, rSAPublicKey);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(OooO0OO.OooO0Oo(e2, new StringBuilder("Couldn't encrypt Content Encryption Key (CEK): ")), e2);
        }
    }
}
