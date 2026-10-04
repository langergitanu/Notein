package com.aspose.words.internal;

import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYQG extends KeyFactorySpi implements zzYQO {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return zzW(zzZ94.zzXG(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.getMessage(), e);
            }
        }
        if (keySpec != null) {
            throw new InvalidKeySpecException("keySpec for PrivateKey not recognized: ".concat(keySpec.getClass().getName()));
        }
        throw new InvalidKeySpecException("null keySpec passed for PrivateKey");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return zzV(zzZ7D.zzWZ(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.getMessage(), e);
            }
        }
        if (keySpec != null) {
            throw new InvalidKeySpecException("keySpec for PublicKey not recognized: ".concat(keySpec.getClass().getName()));
        }
        throw new InvalidKeySpecException("null keySpec passed for PublicKey");
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("Unable to transform key to KeySpec: ".concat(cls.getName()));
    }
}
