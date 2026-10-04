package com.microsoft.identity.common.java.crypto.key;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes9.dex */
public class PredefinedKeyLoader extends AES256KeyLoader {
    public static final String USER_PROVIDED_KEY_IDENTIFIER = "U001";
    private final String mAlias;
    private final SecretKey mKey;

    public PredefinedKeyLoader(String str, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("alias is marked non-null but is null");
        }
        if (bArr == null) {
            throw new NullPointerException("rawBytes is marked non-null but is null");
        }
        this.mAlias = str;
        this.mKey = generateKeyFromRawBytes(bArr);
    }

    @Override // com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader
    public String getAlias() {
        return this.mAlias;
    }

    @Override // com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader
    public SecretKey getKey() {
        return this.mKey;
    }

    @Override // com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader
    public String getKeyTypeIdentifier() {
        return "U001";
    }
}
