package com.microsoft.identity.common.java.crypto.key;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AES256KeyLoader extends AbstractSecretKeyLoader {
    public static final String AES_ALGORITHM = "AES";
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final int KEY_SIZE = 256;
    private static final String TAG = "AES256KeyLoader";

    @Override // com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader
    public String getCipherAlgorithm() {
        return CIPHER_ALGORITHM;
    }

    @Override // com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader
    public int getKeySize() {
        return 256;
    }

    @Override // com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader
    public String getKeySpecAlgorithm() {
        return AES_ALGORITHM;
    }
}
