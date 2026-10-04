package com.aspose.words.internal;

import com.aspose.words.internal.zzYWQ;
import com.aspose.words.internal.zzZ4K;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYO4 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYO4";

    public static class zzZ extends zzYQH {
        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec: ".concat(keySpec.getClass().getName()));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                throw new InvalidKeySpecException("Missing required salt");
            }
            if (pBEKeySpec.getKeyLength() > 0) {
                new zzYWQ.zzZ();
                return new zzYPE(zzYWQ.zzZ.zzZ(zzYWQ.zzW57.zzWn(zzYGI.zzC(pBEKeySpec.getPassword())).zzWm(pBEKeySpec.getSalt())).zzZ(zzZ4K.zzZ.CIPHER, pBEKeySpec.getKeyLength() / 8), "PBKDF-OpenSSL", pBEKeySpec);
            }
            throw new InvalidKeySpecException("Positive key length required: " + pBEKeySpec.getKeyLength());
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(zzYQ8 zzyq8) {
        zzyq8.zzZ("SecretKeyFactory.PBKDF-OPENSSL", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), PREFIX, "$PBKDF"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO4.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
    }
}
