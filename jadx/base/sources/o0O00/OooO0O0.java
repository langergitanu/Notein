package o0O00;

import android.security.keystore.KeyGenParameterSpec;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 {
    public static SecretKey OooO00o(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key != null && (key instanceof SecretKey)) {
                return (SecretKey) key;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES256KeyLoader.AES_ALGORITHM, "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setKeySize(256).build());
            return keyGenerator.generateKey();
        } catch (RuntimeException unused) {
            C34370OooO0o0.OooO0Oo("KeyStoreEncryptAndDecrypt", "RuntimeException");
            return null;
        } catch (Exception unused2) {
            C34370OooO0o0.OooO0OO("KeyStoreEncryptAndDecrypt", "Generate key exception ");
            return null;
        }
    }
}
