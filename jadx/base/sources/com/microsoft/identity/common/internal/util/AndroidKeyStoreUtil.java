package com.microsoft.identity.common.internal.util;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.util.ported.DateUtilities;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidKeyStoreUtil {
    private static final String ANDROID_KEY_STORE_TYPE = "AndroidKeyStore";
    private static final String TAG = "AndroidKeyStoreUtil";
    private static KeyStore mKeyStore;

    private AndroidKeyStoreUtil() {
    }

    public static synchronized void applyKeyStoreLocaleWorkarounds(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("currentLocale is marked non-null but is null");
        }
    }

    public static synchronized boolean canLoadKey(String str) {
        if (str == null) {
            throw new NullPointerException("keyAlias is marked non-null but is null");
        }
        String str2 = TAG + ":hasKey";
        try {
            return getKeyStore().containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            Logger.error(str2, "Failed to check keystore key", e);
            return false;
        }
    }

    public static synchronized void deleteKey(String str) throws ClientException {
        String str2;
        try {
            if (str == null) {
                throw new NullPointerException("aliasOfKeyToDelete is marked non-null but is null");
            }
            String str3 = TAG + ":deleteKeyFromKeyStore";
            try {
                KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_TYPE);
                keyStore.load(null);
                keyStore.deleteEntry(str);
            } catch (IOException e) {
                e = e;
                str2 = "io_error";
                ClientException clientException = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException;
            } catch (KeyStoreException e2) {
                e = e2;
                str2 = ClientException.ANDROID_KEYSTORE_UNAVAILABLE;
                ClientException clientException2 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException2;
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                str2 = "no_such_algorithm";
                ClientException clientException22 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException22;
            } catch (CertificateException e4) {
                e = e4;
                str2 = ClientException.CERTIFICATE_LOAD_FAILURE;
                ClientException clientException222 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException222;
            } catch (Throwable th) {
                e = th;
                str2 = ClientException.UNKNOWN_CRYPTO_ERROR;
                ClientException clientException2222 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException2222;
            }
        } finally {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static synchronized KeyPair generateKeyPair(String str, AlgorithmParameterSpec algorithmParameterSpec) throws ClientException {
        String str2;
        KeyPair keyPairGenerateKeyPair;
        try {
            if (str == null) {
                throw new NullPointerException("algorithm is marked non-null but is null");
            }
            if (algorithmParameterSpec == null) {
                throw new NullPointerException("algorithmSpec is marked non-null but is null");
            }
            String str3 = TAG + ":generateKeyPair";
            synchronized ((DateUtilities.isLocaleCalendarNonGregorian(Locale.getDefault()) ? DateUtilities.LOCALE_CHANGE_LOCK : new Object())) {
                Locale locale = Locale.getDefault();
                applyKeyStoreLocaleWorkarounds(locale);
                try {
                    Logger.info(str3, "Generating KeyPair from KeyStore");
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, ANDROID_KEY_STORE_TYPE);
                    keyPairGenerator.initialize(algorithmParameterSpec);
                    keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                    if (keyPairGenerateKeyPair == null) {
                        Logger.error(str3, "Failed to generate a keypair. The way we're generating it might be incorrect.", null);
                        throw new ClientException(ClientException.INVALID_KEY, "Failed to generate a keypair");
                    }
                    Locale.setDefault(locale);
                } catch (IllegalStateException e) {
                    e = e;
                    str2 = ClientException.ANDROID_KEYSTORE_UNAVAILABLE;
                    Locale.setDefault(locale);
                    ClientException clientException = new ClientException(str2, e.getMessage(), e);
                    Logger.error(str3, str2, e);
                    throw clientException;
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    str2 = ClientException.INVALID_ALG_PARAMETER;
                    Locale.setDefault(locale);
                    ClientException clientException2 = new ClientException(str2, e.getMessage(), e);
                    Logger.error(str3, str2, e);
                    throw clientException2;
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    str2 = "no_such_algorithm";
                    Locale.setDefault(locale);
                    ClientException clientException22 = new ClientException(str2, e.getMessage(), e);
                    Logger.error(str3, str2, e);
                    throw clientException22;
                } catch (NoSuchProviderException e4) {
                    e = e4;
                    str2 = ClientException.NO_SUCH_PROVIDER;
                    Locale.setDefault(locale);
                    ClientException clientException222 = new ClientException(str2, e.getMessage(), e);
                    Logger.error(str3, str2, e);
                    throw clientException222;
                } catch (Throwable th) {
                    e = th;
                    str2 = ClientException.UNKNOWN_CRYPTO_ERROR;
                    Locale.setDefault(locale);
                    ClientException clientException2222 = new ClientException(str2, e.getMessage(), e);
                    Logger.error(str3, str2, e);
                    throw clientException2222;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return keyPairGenerateKeyPair;
    }

    private static synchronized KeyStore getKeyStore() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            if (mKeyStore == null) {
                KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_TYPE);
                mKeyStore = keyStore;
                keyStore.load(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mKeyStore;
    }

    public static synchronized KeyPair readKey(String str) throws ClientException {
        String str2;
        try {
            if (str == null) {
                throw new NullPointerException("keyAlias is marked non-null but is null");
            }
            String str3 = TAG + ":readKeyPair";
            try {
                KeyStore keyStore = getKeyStore();
                if (!keyStore.containsAlias(str)) {
                    Logger.verbose(str3, "Alias doesn't exist.");
                    return null;
                }
                Key key = keyStore.getKey(str, null);
                if (key == null) {
                    Logger.verbose(str3, "Private key entry doesn't exist.");
                    return null;
                }
                Certificate certificate = keyStore.getCertificate(str);
                if (certificate == null) {
                    Logger.verbose(str3, "Public key entry doesn't exist.");
                    return null;
                }
                return new KeyPair(certificate.getPublicKey(), (PrivateKey) key);
            } catch (IOException e) {
                e = e;
                str2 = "io_error";
                ClientException clientException = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException;
            } catch (RuntimeException e2) {
                e = e2;
                str2 = ClientException.ANDROID_KEYSTORE_UNAVAILABLE;
                ClientException clientException2 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException2;
            } catch (KeyStoreException e3) {
                e = e3;
                str2 = ClientException.ANDROID_KEYSTORE_UNAVAILABLE;
                ClientException clientException22 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException22;
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                str2 = "no_such_algorithm";
                ClientException clientException222 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException222;
            } catch (UnrecoverableKeyException e5) {
                e = e5;
                str2 = ClientException.INVALID_KEY_MISSING;
                ClientException clientException2222 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException2222;
            } catch (CertificateException e6) {
                e = e6;
                str2 = ClientException.CERTIFICATE_LOAD_FAILURE;
                ClientException clientException22222 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException22222;
            } catch (Throwable th) {
                e = th;
                str2 = ClientException.UNKNOWN_CRYPTO_ERROR;
                ClientException clientException222222 = new ClientException(str2, e.getMessage(), e);
                Logger.error(str3, str2, e);
                throw clientException222222;
            }
        } finally {
        }
    }

    public static SecretKey unwrap(byte[] bArr, String str, KeyPair keyPair, String str2) throws ClientException {
        String str3;
        if (bArr == null) {
            throw new NullPointerException("wrappedKeyBlob is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("wrappedKeyAlgorithm is marked non-null but is null");
        }
        if (keyPair == null) {
            throw new NullPointerException("keyPairForUnwrapping is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("wrapAlgorithm is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":unwrap");
        try {
            Cipher cipher = Cipher.getInstance(str2);
            cipher.init(4, keyPair.getPrivate());
            return (SecretKey) cipher.unwrap(bArr, str, 3);
        } catch (IllegalArgumentException e) {
            e = e;
            str3 = ClientException.ANDROID_KEYSTORE_UNAVAILABLE;
            ClientException clientException = new ClientException(str3, e.getMessage(), e);
            Logger.error(strOooO0OO, str3, e);
            throw clientException;
        } catch (InvalidKeyException e2) {
            e = e2;
            str3 = ClientException.INVALID_KEY;
            ClientException clientException2 = new ClientException(str3, e.getMessage(), e);
            Logger.error(strOooO0OO, str3, e);
            throw clientException2;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str3 = "no_such_algorithm";
            ClientException clientException22 = new ClientException(str3, e.getMessage(), e);
            Logger.error(strOooO0OO, str3, e);
            throw clientException22;
        } catch (NoSuchPaddingException e4) {
            e = e4;
            str3 = ClientException.NO_SUCH_PADDING;
            ClientException clientException222 = new ClientException(str3, e.getMessage(), e);
            Logger.error(strOooO0OO, str3, e);
            throw clientException222;
        } catch (Throwable th) {
            e = th;
            str3 = ClientException.UNKNOWN_CRYPTO_ERROR;
            ClientException clientException2222 = new ClientException(str3, e.getMessage(), e);
            Logger.error(strOooO0OO, str3, e);
            throw clientException2222;
        }
    }

    public static byte[] wrap(SecretKey secretKey, KeyPair keyPair, String str) throws ClientException {
        String str2;
        if (secretKey == null) {
            throw new NullPointerException("key is marked non-null but is null");
        }
        if (keyPair == null) {
            throw new NullPointerException("keyToWrap is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("wrapAlgorithm is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":wrap");
        try {
            Logger.verbose(strOooO0OO, "Wrap secret key with a KeyPair.");
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(3, keyPair.getPublic());
            return cipher.wrap(secretKey);
        } catch (InvalidKeyException e) {
            e = e;
            str2 = ClientException.INVALID_KEY;
            ClientException clientException = new ClientException(str2, e.getMessage(), e);
            Logger.error(strOooO0OO, str2, e);
            throw clientException;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            str2 = "no_such_algorithm";
            ClientException clientException2 = new ClientException(str2, e.getMessage(), e);
            Logger.error(strOooO0OO, str2, e);
            throw clientException2;
        } catch (IllegalBlockSizeException e3) {
            e = e3;
            str2 = ClientException.INVALID_BLOCK_SIZE;
            ClientException clientException22 = new ClientException(str2, e.getMessage(), e);
            Logger.error(strOooO0OO, str2, e);
            throw clientException22;
        } catch (NoSuchPaddingException e4) {
            e = e4;
            str2 = ClientException.NO_SUCH_PADDING;
            ClientException clientException222 = new ClientException(str2, e.getMessage(), e);
            Logger.error(strOooO0OO, str2, e);
            throw clientException222;
        } catch (Throwable th) {
            e = th;
            str2 = ClientException.UNKNOWN_CRYPTO_ERROR;
            ClientException clientException2222 = new ClientException(str2, e.getMessage(), e);
            Logger.error(strOooO0OO, str2, e);
            throw clientException2222;
        }
    }
}
