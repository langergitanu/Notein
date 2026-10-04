package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.C21590OooO0o0;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: androidx.biometric.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21593OooO0oo {

    /* JADX INFO: renamed from: androidx.biometric.OooO0oo$OooO00o */
    public static class OooO00o {
        public static KeyGenParameterSpec OooO00o(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        public static KeyGenParameterSpec.Builder OooO0O0(String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        public static void OooO0OO(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void OooO0Oo(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        public static void OooO0o0(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0oo$OooO0O0 */
    public static class OooO0O0 {
        public static BiometricPrompt.CryptoObject OooO00o(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public static BiometricPrompt.CryptoObject OooO0O0(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public static BiometricPrompt.CryptoObject OooO0OO(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        public static Cipher OooO0Oo(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        public static Signature OooO0o(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        public static Mac OooO0o0(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0oo$OooO0OO */
    public static class OooO0OO {
        public static BiometricPrompt.CryptoObject OooO00o(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential OooO0O0(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public static class C21594OooO0Oo {
        public static BiometricPrompt.CryptoObject OooO00o(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        public static PresentationSession OooO0O0(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    public static C21590OooO0o0.OooO0OO OooO00o() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderOooO0O0 = OooO00o.OooO0O0("androidxBiometric", 3);
            OooO00o.OooO0Oo(builderOooO0O0);
            OooO00o.OooO0o0(builderOooO0O0);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES256KeyLoader.AES_ALGORITHM, "AndroidKeyStore");
            OooO00o.OooO0OO(keyGenerator, OooO00o.OooO00o(builderOooO0O0));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new C21590OooO0o0.OooO0OO(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject OooO0O0(C21590OooO0o0.OooO0OO oooO0OO) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (oooO0OO == null) {
            return null;
        }
        Cipher cipher = oooO0OO.f63234OooO0O0;
        if (cipher != null) {
            return OooO0O0.OooO0O0(cipher);
        }
        Signature signature = oooO0OO.f63233OooO00o;
        if (signature != null) {
            return OooO0O0.OooO00o(signature);
        }
        Mac mac = oooO0OO.f63235OooO0OO;
        if (mac != null) {
            return OooO0O0.OooO0OO(mac);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (identityCredential = oooO0OO.f63236OooO0Oo) != null) {
            return OooO0OO.OooO00o(identityCredential);
        }
        if (i < 33 || (presentationSession = oooO0OO.f63237OooO0o0) == null) {
            return null;
        }
        return C21594OooO0Oo.OooO00o(presentationSession);
    }
}
