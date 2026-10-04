package com.nimbusds.jose.util;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class KeyUtils {
    private KeyUtils() {
    }

    public static SecretKey toAESKey(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), AES256KeyLoader.AES_ALGORITHM);
    }
}
