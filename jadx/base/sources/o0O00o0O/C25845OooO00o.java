package o0O00o0O;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C24999OooO0OO;

/* JADX INFO: renamed from: o0O00o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25845OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f88193OooO00o = new HashMap();

    public static SecretKey OooO00o(String str) {
        SecretKey secretKeyGenerateKey = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = f88193OooO00o;
        if (map.get(str) == null) {
            Log.i("SecurityComp10200303: ".concat("GCMKS"), "load key");
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                Key key = keyStore.getKey(str, null);
                if (key instanceof SecretKey) {
                    secretKeyGenerateKey = (SecretKey) key;
                } else {
                    Log.i("SecurityComp10200303: ".concat("GCMKS"), "generate key");
                    KeyGenerator keyGenerator = KeyGenerator.getInstance(AES256KeyLoader.AES_ALGORITHM, "AndroidKeyStore");
                    keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build());
                    secretKeyGenerateKey = keyGenerator.generateKey();
                }
            } catch (IOException e) {
                C24999OooO0OO.OooO0O0("GCMKS", "IOException : " + e.getMessage());
            } catch (InvalidAlgorithmParameterException e2) {
                C24999OooO0OO.OooO0O0("GCMKS", "InvalidAlgorithmParameterException : " + e2.getMessage());
            } catch (KeyStoreException e3) {
                C24999OooO0OO.OooO0O0("GCMKS", "KeyStoreException : " + e3.getMessage());
            } catch (NoSuchAlgorithmException e4) {
                C24999OooO0OO.OooO0O0("GCMKS", "NoSuchAlgorithmException : " + e4.getMessage());
            } catch (NoSuchProviderException e5) {
                C24999OooO0OO.OooO0O0("GCMKS", "NoSuchProviderException : " + e5.getMessage());
            } catch (UnrecoverableKeyException e6) {
                C24999OooO0OO.OooO0O0("GCMKS", "UnrecoverableKeyException : " + e6.getMessage());
            } catch (CertificateException e7) {
                C24999OooO0OO.OooO0O0("GCMKS", "CertificateException : " + e7.getMessage());
            } catch (Exception e8) {
                C24999OooO0OO.OooO0O0("GCMKS", "Exception: " + e8.getMessage());
            }
            map.put(str, secretKeyGenerateKey);
        }
        return (SecretKey) map.get(str);
    }

    public static String OooO0O0(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C24999OooO0OO.OooO0O0("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(OooO0OO(str, C24998OooO0O0.OooO0o0(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C24999OooO0OO.OooO0O0("GCMKS", "decrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static byte[] OooO0OO(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str)) {
            C24999OooO0OO.OooO0O0("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        if (bArr.length <= 12) {
            C24999OooO0OO.OooO0O0("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
        SecretKey secretKeyOooO00o = OooO00o(str);
        byte[] bArr3 = new byte[0];
        if (secretKeyOooO00o == null) {
            C24999OooO0OO.OooO0O0("GCMKS", "Decrypt secret key is null");
            return bArr3;
        }
        if (bArr.length <= 12) {
            C24999OooO0OO.OooO0O0("GCMKS", "Decrypt source data is invalid.");
            return bArr3;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeyOooO00o, new GCMParameterSpec(128, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e) {
            C24999OooO0OO.OooO0O0("GCMKS", "InvalidAlgorithmParameterException : " + e.getMessage());
            return bArr3;
        } catch (InvalidKeyException e2) {
            C24999OooO0OO.OooO0O0("GCMKS", "InvalidKeyException : " + e2.getMessage());
            return bArr3;
        } catch (NoSuchAlgorithmException e3) {
            C24999OooO0OO.OooO0O0("GCMKS", "NoSuchAlgorithmException : " + e3.getMessage());
            return bArr3;
        } catch (BadPaddingException e4) {
            C24999OooO0OO.OooO0O0("GCMKS", "BadPaddingException : " + e4.getMessage());
            return bArr3;
        } catch (IllegalBlockSizeException e5) {
            C24999OooO0OO.OooO0O0("GCMKS", "IllegalBlockSizeException : " + e5.getMessage());
            return bArr3;
        } catch (NoSuchPaddingException e6) {
            C24999OooO0OO.OooO0O0("GCMKS", "NoSuchPaddingException : " + e6.getMessage());
            return bArr3;
        } catch (Exception e7) {
            C24999OooO0OO.OooO0O0("GCMKS", "Exception: " + e7.getMessage());
            return bArr3;
        }
    }

    public static String OooO0Oo(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C24999OooO0OO.OooO0O0("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return C24998OooO0O0.OooO0OO(OooO0o0(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            C24999OooO0OO.OooO0O0("GCMKS", "encrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static byte[] OooO0o0(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            C24999OooO0OO.OooO0O0("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        SecretKey secretKeyOooO00o = OooO00o(str);
        byte[] bArr3 = new byte[0];
        if (secretKeyOooO00o == null) {
            C24999OooO0OO.OooO0O0("GCMKS", "secret key is null");
            return bArr3;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyOooO00o);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            C24999OooO0OO.OooO0O0("GCMKS", "IV is invalid.");
            return bArr3;
        } catch (InvalidKeyException e) {
            C24999OooO0OO.OooO0O0("GCMKS", "InvalidKeyException : " + e.getMessage());
            return bArr3;
        } catch (NoSuchAlgorithmException e2) {
            C24999OooO0OO.OooO0O0("GCMKS", "NoSuchAlgorithmException : " + e2.getMessage());
            return bArr3;
        } catch (BadPaddingException e3) {
            C24999OooO0OO.OooO0O0("GCMKS", "BadPaddingException : " + e3.getMessage());
            return bArr3;
        } catch (IllegalBlockSizeException e4) {
            C24999OooO0OO.OooO0O0("GCMKS", "IllegalBlockSizeException : " + e4.getMessage());
            return bArr3;
        } catch (NoSuchPaddingException e5) {
            C24999OooO0OO.OooO0O0("GCMKS", "NoSuchPaddingException : " + e5.getMessage());
            return bArr3;
        } catch (Exception e6) {
            C24999OooO0OO.OooO0O0("GCMKS", "Exception: " + e6.getMessage());
            return bArr3;
        }
    }
}
