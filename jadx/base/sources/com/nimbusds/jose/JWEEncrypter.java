package com.nimbusds.jose;

/* JADX INFO: loaded from: classes9.dex */
public interface JWEEncrypter extends JWEProvider {
    JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException;
}
