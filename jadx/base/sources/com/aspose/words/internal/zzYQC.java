package com.aspose.words.internal;

import com.aspose.words.internal.zzYO2;
import com.aspose.words.internal.zzZ0P;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYQC extends SecretKeyFactorySpi {
    protected final zzZ zzVVE;
    protected final String zzVZp;
    protected final zzZ5W zzWlz;

    public interface zzZ {
        byte[] zzVT(byte[] bArr) throws InvalidKeySpecException;
    }

    public zzYQC(String str, zzZ5W zzz5w, zzZ zzz) {
        this.zzVZp = str;
        this.zzWlz = zzz5w;
        this.zzVVE = zzz;
    }

    private KeySpec zzZ(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.zzVZp);
        }
        if (!KeySpec.class.isAssignableFrom(cls)) {
            throw new InvalidKeySpecException("Passed in class is not a KeySpec: ".concat(cls.getName()));
        }
        try {
            return (KeySpec) cls.getConstructor(byte[].class).newInstance(this.zzVVE.zzVT(secretKey.getEncoded()));
        } catch (NoSuchMethodException unused) {
            throw new InvalidKeySpecException("Unable to transform encoded key to KeySpec: ".concat(cls.getName()));
        } catch (Exception e) {
            throw new InvalidKeySpecException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("Exception transforming to KeySpec: ")), e);
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof SecretKeySpec) {
            return new zzYNP(new zzYUD(this.zzWlz, this.zzVVE.zzVT(((SecretKeySpec) keySpec).getEncoded())), this.zzVZp);
        }
        if (keySpec instanceof PBEKeySpec) {
            return new zzYNP(new zzYUD(this.zzWlz, this.zzVVE.zzVT(new zzYO2.zzY(this.zzVZp, zzZ4I.UTF8, zzZ0P.zzZ.zzWdG).engineGenerateSecret(keySpec).getEncoded())), this.zzVZp);
        }
        if (keySpec == null) {
            throw new InvalidKeySpecException("null KeySpec passed to SecretKeyFactory");
        }
        throw new InvalidKeySpecException("Unknown KeySpec passed to SecretKeyFactory: ".concat(keySpec.getClass().getName()));
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretKey != null) {
            return zzZ(secretKey, cls);
        }
        throw new InvalidKeySpecException("key parameter is null");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("Secret key parameter cannot be null");
        }
        try {
            return new SecretKeySpec(this.zzVVE.zzVT(secretKey.getEncoded()), this.zzVZp);
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }
}
