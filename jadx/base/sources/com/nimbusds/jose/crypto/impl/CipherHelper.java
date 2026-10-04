package com.nimbusds.jose.crypto.impl;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes9.dex */
public class CipherHelper {
    public static Cipher getInstance(String str, Provider provider) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
