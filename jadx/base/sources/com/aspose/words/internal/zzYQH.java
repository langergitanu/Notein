package com.aspose.words.internal;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYQH extends SecretKeyFactorySpi {
    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("Key Deriving SecretKeyFactory only supports generateSecret");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        throw new InvalidKeyException("Key Deriving SecretKeyFactory only supports generateSecret");
    }
}
