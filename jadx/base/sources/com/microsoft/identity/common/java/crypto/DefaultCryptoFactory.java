package com.microsoft.identity.common.java.crypto;

import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.opentelemetry.CryptoFactoryName;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultCryptoFactory implements ICryptoFactory {
    @Override // com.microsoft.identity.common.java.crypto.ICryptoFactory
    public Cipher getCipher(String str) throws ClientException {
        if (str != null) {
            return ProviderFactory.getCipher(str, null);
        }
        throw new NullPointerException("algorithm is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.crypto.ICryptoFactory
    public KeyFactory getKeyFactory(String str) throws ClientException {
        if (str != null) {
            return ProviderFactory.getKeyFactory(str, null);
        }
        throw new NullPointerException("algorithm is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.crypto.ICryptoFactory
    public KeyPairGenerator getKeyPairGenerator(String str) throws ClientException {
        if (str != null) {
            return ProviderFactory.getKeyPairGenerator(str, null);
        }
        throw new NullPointerException("algorithm is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.crypto.ICryptoFactory
    public Mac getMac(String str) throws ClientException {
        if (str != null) {
            return ProviderFactory.getMac(str, null);
        }
        throw new NullPointerException("algorithm is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.crypto.ICryptoFactory
    public Signature getSignature(String str) throws ClientException {
        if (str != null) {
            return ProviderFactory.getSignature(str, null);
        }
        throw new NullPointerException("algorithm is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.crypto.ICryptoFactory
    public CryptoFactoryName getTelemetryClassName() {
        return CryptoFactoryName.DefaultCryptoFactory;
    }
}
