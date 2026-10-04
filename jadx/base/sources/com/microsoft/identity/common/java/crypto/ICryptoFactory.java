package com.microsoft.identity.common.java.crypto;

import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.opentelemetry.CryptoFactoryName;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes9.dex */
public interface ICryptoFactory {
    Cipher getCipher(String str) throws ClientException;

    KeyFactory getKeyFactory(String str) throws ClientException;

    KeyPairGenerator getKeyPairGenerator(String str) throws ClientException;

    Mac getMac(String str) throws ClientException;

    Signature getSignature(String str) throws ClientException;

    CryptoFactoryName getTelemetryClassName();
}
