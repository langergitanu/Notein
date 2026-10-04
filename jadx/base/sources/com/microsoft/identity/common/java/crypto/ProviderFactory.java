package com.microsoft.identity.common.java.crypto;

import com.microsoft.identity.common.java.exception.ClientException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes9.dex */
public class ProviderFactory {
    public static Cipher getCipher(String str, Provider provider) throws ClientException {
        if (str == null) {
            throw new NullPointerException("algorithm is marked non-null but is null");
        }
        try {
            return provider != null ? Cipher.getInstance(str, provider) : Cipher.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new ClientException("no_such_algorithm", e.getMessage(), e);
        } catch (NoSuchPaddingException e2) {
            throw new ClientException(ClientException.NO_SUCH_PADDING, e2.getMessage(), e2);
        }
    }

    public static KeyFactory getKeyFactory(String str, Provider provider) throws ClientException {
        if (str == null) {
            throw new NullPointerException("algorithm is marked non-null but is null");
        }
        try {
            return provider != null ? KeyFactory.getInstance(str, provider) : KeyFactory.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new ClientException("no_such_algorithm", e.getMessage(), e);
        }
    }

    public static KeyPairGenerator getKeyPairGenerator(String str, Provider provider) throws ClientException {
        if (str == null) {
            throw new NullPointerException("algorithm is marked non-null but is null");
        }
        try {
            return provider != null ? KeyPairGenerator.getInstance(str, provider) : KeyPairGenerator.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new ClientException("no_such_algorithm", e.getMessage(), e);
        }
    }

    public static Mac getMac(String str, Provider provider) throws ClientException {
        if (str == null) {
            throw new NullPointerException("algorithm is marked non-null but is null");
        }
        try {
            return provider != null ? Mac.getInstance(str, provider) : Mac.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new ClientException("no_such_algorithm", e.getMessage(), e);
        }
    }

    public static Signature getSignature(String str, Provider provider) throws ClientException {
        if (str == null) {
            throw new NullPointerException("algorithm is marked non-null but is null");
        }
        try {
            return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new ClientException("no_such_algorithm", e.getMessage(), e);
        }
    }
}
