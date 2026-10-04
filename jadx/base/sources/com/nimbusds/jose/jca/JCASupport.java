package com.nimbusds.jose.jca;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes9.dex */
public final class JCASupport {
    private JCASupport() {
    }

    public static boolean isSupported(Algorithm algorithm) {
        if (algorithm instanceof JWSAlgorithm) {
            return isSupported((JWSAlgorithm) algorithm);
        }
        if (algorithm instanceof JWEAlgorithm) {
            return isSupported((JWEAlgorithm) algorithm);
        }
        if (algorithm instanceof EncryptionMethod) {
            return isSupported((EncryptionMethod) algorithm);
        }
        throw new IllegalArgumentException("Unexpected algorithm class: " + algorithm.getClass().getCanonicalName());
    }

    public static boolean isUnlimitedStrength() {
        try {
            return Cipher.getMaxAllowedKeyLength(AES256KeyLoader.AES_ALGORITHM) >= 256;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static boolean isSupported(Algorithm algorithm, Provider provider) {
        if (algorithm instanceof JWSAlgorithm) {
            return isSupported((JWSAlgorithm) algorithm, provider);
        }
        if (algorithm instanceof JWEAlgorithm) {
            return isSupported((JWEAlgorithm) algorithm, provider);
        }
        if (algorithm instanceof EncryptionMethod) {
            return isSupported((EncryptionMethod) algorithm, provider);
        }
        throw new IllegalArgumentException("Unexpected algorithm class: " + algorithm.getClass().getCanonicalName());
    }

    public static boolean isSupported(JWSAlgorithm jWSAlgorithm) {
        if (jWSAlgorithm.getName().equals(Algorithm.NONE.getName())) {
            return true;
        }
        for (Provider provider : Security.getProviders()) {
            if (isSupported(jWSAlgorithm, provider)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(JWSAlgorithm jWSAlgorithm, Provider provider) {
        String str;
        String str2;
        String str3;
        String str4;
        if (JWSAlgorithm.Family.HMAC_SHA.contains(jWSAlgorithm)) {
            if (jWSAlgorithm.equals(JWSAlgorithm.HS256)) {
                str4 = "HMACSHA256";
            } else if (jWSAlgorithm.equals(JWSAlgorithm.HS384)) {
                str4 = "HMACSHA384";
            } else {
                if (jWSAlgorithm.equals(JWSAlgorithm.HS512)) {
                    str4 = "HMACSHA512";
                }
            }
            return provider.getService("KeyGenerator", str4) != null;
        }
        if (JWSAlgorithm.Family.RSA.contains(jWSAlgorithm)) {
            String str5 = null;
            if (jWSAlgorithm.equals(JWSAlgorithm.RS256)) {
                str3 = "SHA256withRSA";
            } else if (jWSAlgorithm.equals(JWSAlgorithm.RS384)) {
                str3 = "SHA384withRSA";
            } else if (jWSAlgorithm.equals(JWSAlgorithm.RS512)) {
                str3 = "SHA512withRSA";
            } else {
                if (jWSAlgorithm.equals(JWSAlgorithm.PS256)) {
                    str2 = "SHA256withRSAandMGF1";
                } else if (jWSAlgorithm.equals(JWSAlgorithm.PS384)) {
                    str2 = "SHA384withRSAandMGF1";
                } else {
                    if (!jWSAlgorithm.equals(JWSAlgorithm.PS512)) {
                        return false;
                    }
                    str2 = "SHA512withRSAandMGF1";
                }
                str5 = str2;
                str3 = "RSASSA-PSS";
            }
            return (provider.getService(RequestParameters.SIGNATURE, str3) == null && (str5 == null || provider.getService(RequestParameters.SIGNATURE, str5) == null)) ? false : true;
        }
        if (JWSAlgorithm.Family.f57384EC.contains(jWSAlgorithm)) {
            if (jWSAlgorithm.equals(JWSAlgorithm.ES256)) {
                str = "SHA256withECDSA";
            } else if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
                str = "SHA384withECDSA";
            } else if (jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
                str = "SHA512withECDSA";
            }
            if (provider.getService(RequestParameters.SIGNATURE, str) != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(JWEAlgorithm jWEAlgorithm) {
        for (Provider provider : Security.getProviders()) {
            if (isSupported(jWEAlgorithm, provider)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(JWEAlgorithm jWEAlgorithm, Provider provider) {
        String str;
        String str2;
        if (JWEAlgorithm.Family.RSA.contains(jWEAlgorithm)) {
            if (jWEAlgorithm.equals(JWEAlgorithm.RSA1_5)) {
                str2 = "RSA/ECB/PKCS1Padding";
            } else if (jWEAlgorithm.equals(JWEAlgorithm.RSA_OAEP)) {
                str2 = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
            } else {
                if (jWEAlgorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
                    str2 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
                }
                return false;
            }
            try {
                Cipher.getInstance(str2, provider);
                return true;
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            }
        } else {
            if (JWEAlgorithm.Family.AES_KW.contains(jWEAlgorithm)) {
                return provider.getService("Cipher", "AESWrap") != null;
            }
            if (JWEAlgorithm.Family.ECDH_ES.contains(jWEAlgorithm)) {
                return provider.getService("KeyAgreement", "ECDH") != null;
            }
            if (JWEAlgorithm.Family.AES_GCM_KW.contains(jWEAlgorithm)) {
                try {
                    Cipher.getInstance("AES/GCM/NoPadding", provider);
                    return true;
                } catch (NoSuchAlgorithmException | NoSuchPaddingException unused2) {
                    return false;
                }
            }
            if (JWEAlgorithm.Family.PBES2.contains(jWEAlgorithm)) {
                if (jWEAlgorithm.equals(JWEAlgorithm.PBES2_HS256_A128KW)) {
                    str = KeyUtil.HMAC_ALGORITHM;
                } else if (jWEAlgorithm.equals(JWEAlgorithm.PBES2_HS384_A192KW)) {
                    str = "HmacSHA384";
                } else {
                    str = "HmacSHA512";
                }
                return provider.getService("KeyGenerator", str) != null;
            }
            return JWEAlgorithm.DIR.equals(jWEAlgorithm);
        }
    }

    public static boolean isSupported(EncryptionMethod encryptionMethod) {
        for (Provider provider : Security.getProviders()) {
            if (isSupported(encryptionMethod, provider)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(EncryptionMethod encryptionMethod, Provider provider) {
        String str;
        if (EncryptionMethod.Family.AES_CBC_HMAC_SHA.contains(encryptionMethod)) {
            try {
                Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
                if (encryptionMethod.equals(EncryptionMethod.A128CBC_HS256)) {
                    str = KeyUtil.HMAC_ALGORITHM;
                } else if (encryptionMethod.equals(EncryptionMethod.A192CBC_HS384)) {
                    str = "HmacSHA384";
                } else {
                    str = "HmacSHA512";
                }
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            }
            return provider.getService("KeyGenerator", str) != null;
        }
        if (EncryptionMethod.Family.AES_GCM.contains(encryptionMethod)) {
            try {
                Cipher.getInstance("AES/GCM/NoPadding", provider);
                return true;
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused2) {
            }
        }
        return false;
    }
}
