package com.aspose.words.internal;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYN7 extends KeyFactorySpi {
    private final zzYQ8 zzVWk;

    public zzYN7(zzYQ8 zzyq8) {
        this.zzVWk = zzyq8;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: ".concat(keySpec.getClass().getName()));
        }
        try {
            zzZ94 zzz94ZzXG = zzZ94.zzXG(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            PrivateKey privateKeyZzV = this.zzVWk.zzV(zzz94ZzXG);
            if (privateKeyZzV != null) {
                return privateKeyZzV;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + zzz94ZzXG.zzXJ8().zzXJk());
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.getMessage(), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: ".concat(keySpec.getClass().getName()));
        }
        try {
            zzZ7D zzz7dZzWZ = zzZ7D.zzWZ(((X509EncodedKeySpec) keySpec).getEncoded());
            PublicKey publicKeyZzU = this.zzVWk.zzU(zzz7dZzWZ);
            if (publicKeyZzU != null) {
                return publicKeyZzU;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + zzz7dZzWZ.zzXHJ().zzXJk());
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.getMessage(), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("Unable to transform key to KeySpec: ".concat(cls.getName()));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported operation: " + key);
    }
}
