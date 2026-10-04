package com.microsoft.identity.common.internal.platform;

import android.security.keystore.KeyInfo;
import com.microsoft.identity.common.java.crypto.SecureHardwareState;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.platform.AbstractKeyStoreKeyManager;
import com.microsoft.identity.common.logging.Logger;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStore.Entry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidDeviceKeyManager<K extends KeyStore.Entry> extends AbstractKeyStoreKeyManager<K> {
    private static final String TAG = "AndroidDeviceKeyManager";

    public static class AndroidDeviceKeyManagerBuilder<K extends KeyStore.Entry> {
        private String keyAlias;
        private KeyStore keyStore;

        public AndroidDeviceKeyManager<K> build() throws KeyStoreException {
            return new AndroidDeviceKeyManager<>(this.keyStore, this.keyAlias);
        }

        public AndroidDeviceKeyManagerBuilder<K> keyAlias(String str) {
            if (str == null) {
                throw new NullPointerException("keyAlias is marked non-null but is null");
            }
            this.keyAlias = str;
            return this;
        }

        public AndroidDeviceKeyManagerBuilder<K> keyStore(KeyStore keyStore) {
            if (keyStore == null) {
                throw new NullPointerException("keyStore is marked non-null but is null");
            }
            this.keyStore = keyStore;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AndroidDeviceKeyManager.AndroidDeviceKeyManagerBuilder(keyStore=");
            sb.append(this.keyStore);
            sb.append(", keyAlias=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.keyAlias, ")");
        }
    }

    public AndroidDeviceKeyManager(KeyStore keyStore, String str) throws KeyStoreException {
        super(keyStore, str, null);
        if (keyStore == null) {
            throw new NullPointerException("keyStore is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("keyAlias is marked non-null but is null");
        }
    }

    public static <K extends KeyStore.Entry> AndroidDeviceKeyManagerBuilder<K> builder() {
        return new AndroidDeviceKeyManagerBuilder<>();
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyStoreKeyManager
    public SecureHardwareState getSecureHardwareState() throws ClientException {
        String str;
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getSecureHardwareState");
        try {
            try {
                K entry = getEntry();
                if (entry instanceof KeyStore.PrivateKeyEntry) {
                    try {
                        PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
                        boolean zIsInsideSecureHardware = ((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), this.mKeyStore.getProvider()).getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
                        Logger.info(strOooO0OO, "PrivateKey is secure hardware backed? " + zIsInsideSecureHardware);
                        return zIsInsideSecureHardware ? SecureHardwareState.TRUE_UNATTESTED : SecureHardwareState.FALSE;
                    } catch (NoSuchAlgorithmException e) {
                        e = e;
                        Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
                        return SecureHardwareState.UNKNOWN_QUERY_ERROR;
                    } catch (InvalidKeySpecException e2) {
                        e = e2;
                        Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
                        return SecureHardwareState.UNKNOWN_QUERY_ERROR;
                    }
                }
                if (!(entry instanceof KeyStore.SecretKeyEntry)) {
                    throw new ClientException("unknown_error", "Cannot handle entries of type " + entry.getClass().getCanonicalName());
                }
                try {
                    SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
                    boolean zIsInsideSecureHardware2 = ((KeyInfo) SecretKeyFactory.getInstance(secretKey.getAlgorithm(), this.mKeyStore.getProvider()).getKeySpec(secretKey, KeyInfo.class)).isInsideSecureHardware();
                    Logger.info(strOooO0OO, "SecretKey is secure hardware backed? " + zIsInsideSecureHardware2);
                    return zIsInsideSecureHardware2 ? SecureHardwareState.TRUE_UNATTESTED : SecureHardwareState.FALSE;
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
                    return SecureHardwareState.UNKNOWN_QUERY_ERROR;
                } catch (InvalidKeySpecException e4) {
                    e = e4;
                    Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
                    return SecureHardwareState.UNKNOWN_QUERY_ERROR;
                }
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                str = "no_such_algorithm";
                ClientException clientException = new ClientException(str, e.getMessage(), e);
                Logger.error(strOooO0OO, str, e);
                throw clientException;
            }
        } catch (KeyStoreException e6) {
            e = e6;
            str = ClientException.KEYSTORE_NOT_INITIALIZED;
            ClientException clientException2 = new ClientException(str, e.getMessage(), e);
            Logger.error(strOooO0OO, str, e);
            throw clientException2;
        } catch (UnrecoverableEntryException e7) {
            e = e7;
            str = ClientException.INVALID_PROTECTION_PARAMS;
            ClientException clientException22 = new ClientException(str, e.getMessage(), e);
            Logger.error(strOooO0OO, str, e);
            throw clientException22;
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyStoreKeyManager
    public void storeAsymmetricKey(PrivateKey privateKey, Certificate[] certificateArr) {
        if (privateKey == null) {
            throw new NullPointerException("privateKey is marked non-null but is null");
        }
        if (certificateArr != null) {
            throw new UnsupportedOperationException("This is not currently supported");
        }
        throw new NullPointerException("certChain is marked non-null but is null");
    }
}
