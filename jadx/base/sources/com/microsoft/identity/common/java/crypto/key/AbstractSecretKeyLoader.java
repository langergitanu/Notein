package com.microsoft.identity.common.java.crypto.key;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.logging.Logger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import oO0000oO.C31932OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractSecretKeyLoader {
    private static final String TAG = "AbstractSecretKeyLoader";

    public SecretKey deserializeSecretKey(String str) {
        if (str != null) {
            return generateKeyFromRawBytes(C31932OooO00o.OooO00o(str, 0));
        }
        throw new NullPointerException("serializedKey is marked non-null but is null");
    }

    public SecretKey generateKeyFromRawBytes(byte[] bArr) {
        if (bArr != null) {
            return new SecretKeySpec(bArr, getKeySpecAlgorithm());
        }
        throw new NullPointerException("rawBytes is marked non-null but is null");
    }

    public SecretKey generateRandomKey() throws ClientException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(getKeySpecAlgorithm());
            keyGenerator.init(getKeySize(), new SecureRandom());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            ClientException clientException = new ClientException("no_such_algorithm", e.getMessage(), e);
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":generateRandomKey"), clientException.getErrorCode(), e);
            throw clientException;
        }
    }

    public abstract String getAlias();

    public abstract String getCipherAlgorithm();

    public abstract SecretKey getKey() throws ClientException;

    public abstract int getKeySize();

    public abstract String getKeySpecAlgorithm();

    public abstract String getKeyTypeIdentifier();

    public String serializeSecretKey(SecretKey secretKey) {
        if (secretKey != null) {
            return C31932OooO00o.OooO0OO(secretKey.getEncoded(), 0);
        }
        throw new NullPointerException("key is marked non-null but is null");
    }
}
