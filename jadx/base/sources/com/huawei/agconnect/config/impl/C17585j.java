package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.j */
/* JADX INFO: loaded from: classes8.dex */
public class C17585j {
    /* JADX INFO: renamed from: a */
    public static SecretKey m75373a(C17579d c17579d) throws InvalidKeySpecException, NoSuchAlgorithmException {
        if (c17579d == null || !c17579d.m75357a()) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        Log.d("AGC_Keys", "build aes key, iterationCount:" + c17579d.m75363g());
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance(c17579d.m75362f()).generateSecret(new PBEKeySpec(Hex.encodeHexString(m75377a(Hex.decodeHexString(c17579d.m75358b()), Hex.decodeHexString(c17579d.m75359c()), Hex.decodeHexString(c17579d.m75360d()))).toCharArray(), Hex.decodeHexString(c17579d.m75361e()), c17579d.m75363g(), c17579d.m75364h() * 8));
        Log.d("AGC_Keys", "build aes key end");
        return new SecretKeySpec(secretKeyGenerateSecret.getEncoded(), AES256KeyLoader.AES_ALGORITHM);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75374a(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKey, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m75375a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null.");
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m75376a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75377a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m75376a(m75375a(m75376a(m75375a(bArr, -4), bArr2), 6), bArr3);
    }
}
