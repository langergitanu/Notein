package com.huawei.hms.hatool;

import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import o00OO0o0.C24998OooO0O0;

/* JADX INFO: renamed from: com.huawei.hms.hatool.e */
/* JADX INFO: loaded from: classes8.dex */
public class C17979e {
    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static String m77288a(String str, String str2) {
        try {
            return m77289a(str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            C18030y.m77586c("hmsSdk", "Unsupported encoding exception,utf-8");
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m77289a(String str, byte[] bArr) {
        String str2;
        if (bArr == null || bArr.length == 0) {
            C18030y.m77591f("hmsSdk", "encrypt: content is empty or null");
            return "";
        }
        try {
            return C24998OooO0O0.OooO0OO(m77291a(bArr, m77290a(C24998OooO0O0.OooO0o0(str))));
        } catch (NoSuchAlgorithmException unused) {
            str2 = "encrypt(): getInstance - No such algorithm,transformation";
            C18030y.m77591f("hmsSdk", str2);
            return "";
        } catch (InvalidKeySpecException unused2) {
            str2 = "encrypt(): Invalid key specification";
            C18030y.m77591f("hmsSdk", str2);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static PublicKey m77290a(byte[] bArr) {
        return KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new X509EncodedKeySpec(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m77291a(byte[] bArr, PublicKey publicKey) {
        String str;
        try {
            if (publicKey == null) {
                throw new UnsupportedEncodingException("The loaded public key is null");
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (UnsupportedEncodingException unused) {
            str = "rsaEncrypt(): getBytes - Unsupported coding format!";
            C18030y.m77591f("hmsSdk", str);
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            str = "rsaEncrypt(): init - Invalid key!";
            C18030y.m77591f("hmsSdk", str);
            return new byte[0];
        } catch (NoSuchAlgorithmException unused3) {
            str = "rsaEncrypt(): getInstance - No such algorithm,transformation";
            C18030y.m77591f("hmsSdk", str);
            return new byte[0];
        } catch (BadPaddingException unused4) {
            str = "rsaEncrypt():False filling parameters!";
            C18030y.m77591f("hmsSdk", str);
            return new byte[0];
        } catch (IllegalBlockSizeException unused5) {
            str = "rsaEncrypt(): doFinal - The provided block is not filled with";
            C18030y.m77591f("hmsSdk", str);
            return new byte[0];
        } catch (NoSuchPaddingException unused6) {
            str = "rsaEncrypt():  No such filling parameters ";
            C18030y.m77591f("hmsSdk", str);
            return new byte[0];
        }
    }
}
