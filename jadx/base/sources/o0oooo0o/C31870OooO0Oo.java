package o0oooo0o;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: o0oooo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31870OooO0Oo {

    /* JADX INFO: renamed from: o0oooo0o.OooO0Oo$OooO00o */
    public static class OooO00o extends Exception {
    }

    /* JADX INFO: renamed from: o0oooo0o.OooO0Oo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f113566OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f113567OooO0O0;
    }

    public static OooO0O0 OooO00o(String str) throws OooO00o {
        OooO0O0 oooO0O0 = new OooO0O0();
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES256KeyLoader.AES_ALGORITHM);
            keyGenerator.init(new SecureRandom());
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            try {
                if (TextUtils.isEmpty("-----BEGIN CERTIFICATE-----\nMIICDzCCAXigAwIBAgIEWBw0IzANBgkqhkiG9w0BAQUFADBMMQswCQYDVQQGEwJD\nTjEPMA0GA1UEChMGeGlhb21pMQ8wDQYDVQQLEwZ4aWFvbWkxGzAZBgNVBAMTEmFj\nY291bnQueGlhb21pLmNvbTAeFw0xNjExMDQwNzA5MjNaFw0xNzExMDQwNzA5MjNa\nMEwxCzAJBgNVBAYTAkNOMQ8wDQYDVQQKEwZ4aWFvbWkxDzANBgNVBAsTBnhpYW9t\naTEbMBkGA1UEAxMSYWNjb3VudC54aWFvbWkuY29tMIGfMA0GCSqGSIb3DQEBAQUA\nA4GNADCBiQKBgQCHcPEm9Wo8/LWHL8mohOV5YalTgZLzng+nWCEkIRP//6GohYlI\nh3dvGpueJvQ3Sany/3dLx0x6MQKA34NxRyoO37R/LgPZUfe6eWzHQeColBBHxTED\nbCqDh46Gv5vogjqHRl4+q2WGCmZOIfmPjNHQWG8sMIZyTqFCLc6gk9vSewIDAQAB\nMA0GCSqGSIb3DQEBBQUAA4GBAHaPnscaxSPh0N0Z5OgQ6PcWr5uYPLMweatYGZRH\nSFxwSqYXpqIowuRxmrBj+oE5rG5rzFCtNjCBoeMVy/7JXZr9Juaw9NCWaTaqrmIV\nP4nK/0kizCvkx3088OOCGextGeZUC9/PCbVUEcRvGLwSrvgqiC1KG4ufeIdQWBaJ\n8ZlG\n-----END CERTIFICATE-----\n")) {
                    throw new IllegalStateException("public key should not be empty");
                }
                try {
                    try {
                        String strEncodeToString = Base64.encodeToString(C31871OooO0o0.OooO00o(Base64.encode(secretKeyGenerateKey.getEncoded(), 10), C31871OooO0o0.OooO0O0("-----BEGIN CERTIFICATE-----\nMIICDzCCAXigAwIBAgIEWBw0IzANBgkqhkiG9w0BAQUFADBMMQswCQYDVQQGEwJD\nTjEPMA0GA1UEChMGeGlhb21pMQ8wDQYDVQQLEwZ4aWFvbWkxGzAZBgNVBAMTEmFj\nY291bnQueGlhb21pLmNvbTAeFw0xNjExMDQwNzA5MjNaFw0xNzExMDQwNzA5MjNa\nMEwxCzAJBgNVBAYTAkNOMQ8wDQYDVQQKEwZ4aWFvbWkxDzANBgNVBAsTBnhpYW9t\naTEbMBkGA1UEAxMSYWNjb3VudC54aWFvbWkuY29tMIGfMA0GCSqGSIb3DQEBAQUA\nA4GNADCBiQKBgQCHcPEm9Wo8/LWHL8mohOV5YalTgZLzng+nWCEkIRP//6GohYlI\nh3dvGpueJvQ3Sany/3dLx0x6MQKA34NxRyoO37R/LgPZUfe6eWzHQeColBBHxTED\nbCqDh46Gv5vogjqHRl4+q2WGCmZOIfmPjNHQWG8sMIZyTqFCLc6gk9vSewIDAQAB\nMA0GCSqGSIb3DQEBBQUAA4GBAHaPnscaxSPh0N0Z5OgQ6PcWr5uYPLMweatYGZRH\nSFxwSqYXpqIowuRxmrBj+oE5rG5rzFCtNjCBoeMVy/7JXZr9Juaw9NCWaTaqrmIV\nP4nK/0kizCvkx3088OOCGextGeZUC9/PCbVUEcRvGLwSrvgqiC1KG4ufeIdQWBaJ\n8ZlG\n-----END CERTIFICATE-----\n".getBytes("UTF-8"))), 10);
                        byte[] encoded = secretKeyGenerateKey.getEncoded();
                        C31867OooO00o c31867OooO00o = new C31867OooO00o();
                        if (encoded == null) {
                            throw new SecurityException("aes key is null");
                        }
                        if (encoded.length != 16) {
                            Log.e("AESCoder", "aesKey is invalid");
                        }
                        c31867OooO00o.f113565OooO00o = new SecretKeySpec(encoded, AES256KeyLoader.AES_ALGORITHM);
                        try {
                            oooO0O0.f113566OooO00o = c31867OooO00o.OooO00o(str);
                            oooO0O0.f113567OooO0O0 = strEncodeToString;
                            return oooO0O0;
                        } catch (C31868OooO0O0 e) {
                            throw new OooO00o(e);
                        }
                    } catch (C31869OooO0OO e2) {
                        throw new C31869OooO0OO("encrypt", e2.getCause());
                    }
                } catch (UnsupportedEncodingException e3) {
                    throw new C31869OooO0OO("getPublicKey", e3.getCause());
                }
            } catch (C31869OooO0OO e4) {
                throw new OooO00o(e4);
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new OooO00o(e5);
        }
    }
}
