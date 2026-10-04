package com.microsoft.identity.common.internal.platform;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.StrongBoxUnavailableException;
import com.microsoft.identity.common.internal.util.AndroidKeyStoreUtil;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.IKeyStoreKeyManager;
import com.microsoft.identity.common.java.crypto.SecureHardwareState;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.microsoft.identity.common.java.util.ported.DateUtilities;
import com.microsoft.identity.common.logging.Logger;
import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidDevicePopManager extends AbstractDevicePopManager {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    public static final String FAILED_TO_GENERATE_ATTESTATION_CERTIFICATE_CHAIN = "Failed to generate attestation certificate chain";
    public static final String NEGATIVE_THOUSAND_INTERNAL_ERROR = "internal Keystore code: -1000";
    private static final int RSA_KEY_SIZE = 2048;
    public static final String STRONG_BOX_UNAVAILABLE_EXCEPTION = "StrongBoxUnavailableException";
    private static final String TAG = "AndroidDevicePopManager";
    private final Context mContext;

    public AndroidDevicePopManager(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this(context, AbstractDevicePopManager.DEFAULT_KEYSTORE_ENTRY_ALIAS);
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
    }

    private static KeyGenParameterSpec.Builder applyHardwareIsolation(KeyGenParameterSpec.Builder builder) {
        return builder.setIsStrongBoxBacked(true);
    }

    private static IKeyStoreKeyManager<KeyStore.PrivateKeyEntry> createKeyStoreKeyManager(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (str == null) {
            throw new NullPointerException("alias is marked non-null but is null");
        }
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
        keyStore.load(null);
        return AndroidDeviceKeyManager.builder().keyAlias(str).keyStore(keyStore).build();
    }

    private KeyPair generateNewKeyPair(Context context, boolean z, boolean z2, boolean z3) throws NoSuchAlgorithmException, StrongBoxUnavailableException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPair keyPairGenerateKeyPair;
        synchronized ((DateUtilities.isLocaleCalendarNonGregorian(Locale.getDefault()) ? DateUtilities.LOCALE_CHANGE_LOCK : new Object())) {
            try {
                Locale locale = Locale.getDefault();
                AndroidKeyStoreUtil.applyKeyStoreLocaleWorkarounds(locale);
                try {
                    keyPairGenerateKeyPair = getInitializedRsaKeyPairGenerator(context, 2048, z, z2, z3).generateKeyPair();
                } finally {
                    Locale.setDefault(locale);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return keyPairGenerateKeyPair;
    }

    private KeyPairGenerator getInitializedRsaKeyPairGenerator(Context context, int i, boolean z, boolean z2, boolean z3) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, ANDROID_KEYSTORE);
        initialize(context, keyPairGenerator, i, z, z2, z3);
        return keyPairGenerator;
    }

    private void initialize(Context context, KeyPairGenerator keyPairGenerator, int i, boolean z, boolean z2, boolean z3) throws InvalidAlgorithmParameterException {
        if (Build.VERSION.SDK_INT < 28) {
            initialize23(keyPairGenerator, i, z, z3);
        } else {
            initialize28(keyPairGenerator, i, z, z2, z3);
        }
    }

    private void initialize23(KeyPairGenerator keyPairGenerator, int i, boolean z, boolean z2) throws InvalidAlgorithmParameterException {
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(this.mKeyManager.getKeyAlias(), 15).setKeySize(i).setSignaturePaddings("PKCS1").setDigests("NONE", IDevicePopManager.SHA_1, KeyUtil.HMAC_KEY_HASH_ALGORITHM).setEncryptionPaddings("OAEPPadding", "PKCS1Padding");
        if (z2) {
            encryptionPaddings = setAttestationChallenge(encryptionPaddings);
        }
        if (Build.VERSION.SDK_INT >= 28 && z) {
            Logger.verbose(TAG, "Attempting to apply StrongBox isolation.");
            encryptionPaddings = applyHardwareIsolation(encryptionPaddings);
        }
        keyPairGenerator.initialize(encryptionPaddings.build());
    }

    private void initialize28(KeyPairGenerator keyPairGenerator, int i, boolean z, boolean z2, boolean z3) throws InvalidAlgorithmParameterException {
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(this.mKeyManager.getKeyAlias(), (!z2 || Build.VERSION.SDK_INT < 28) ? 15 : 47).setKeySize(i).setSignaturePaddings("PKCS1").setDigests("NONE", IDevicePopManager.SHA_1, KeyUtil.HMAC_KEY_HASH_ALGORITHM).setEncryptionPaddings("OAEPPadding", "PKCS1Padding");
        if (z3) {
            encryptionPaddings = setAttestationChallenge(encryptionPaddings);
        }
        if (Build.VERSION.SDK_INT >= 28 && z) {
            Logger.verbose(TAG, "Attempting to apply StrongBox isolation.");
            encryptionPaddings = applyHardwareIsolation(encryptionPaddings);
        }
        keyPairGenerator.initialize(encryptionPaddings.build());
    }

    private void initializePre23(Context context, KeyPairGenerator keyPairGenerator, int i) throws InvalidAlgorithmParameterException {
        Calendar calendar = Calendar.getInstance();
        Date now = AbstractDevicePopManager.getNow(calendar);
        calendar.add(1, 99);
        KeyPairGeneratorSpec.Builder subject = new KeyPairGeneratorSpec.Builder(context).setAlias(this.mKeyManager.getKeyAlias()).setStartDate(now).setEndDate(calendar.getTime()).setSerialNumber(AbstractDevicePopManager.CertificateProperties.SERIAL_NUMBER).setSubject(new X500Principal(AbstractDevicePopManager.CertificateProperties.COMMON_NAME));
        subject.setAlgorithmParameterSpec(new RSAKeyGenParameterSpec(i, RSAKeyGenParameterSpec.F4));
        keyPairGenerator.initialize(subject.build());
    }

    private static boolean isNegativeInternalError(Throwable th) {
        boolean z = th.getMessage() != null && th.getMessage().contains(NEGATIVE_THOUSAND_INTERNAL_ERROR);
        if (z) {
            Logger.error(TAG, "StrongBox not supported. internal Keystore code: -1000", th);
        }
        return z;
    }

    private static boolean isStrongBoxUnavailableException(Throwable th) {
        boolean zEquals = th.getClass().getSimpleName().equals("StrongBoxUnavailableException");
        if (zEquals) {
            Logger.error(TAG + ":isStrongBoxUnavailableException", "StrongBox not supported.", th);
        }
        return zEquals;
    }

    private KeyGenParameterSpec.Builder setAttestationChallenge(KeyGenParameterSpec.Builder builder) {
        return builder.setAttestationChallenge(null);
    }

    @Override // com.microsoft.identity.common.java.platform.AbstractDevicePopManager
    public KeyPair generateNewRsaKeyPair(int i) throws UnsupportedOperationException, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return generateNewRsaKeyPair(this.mContext, i);
    }

    @Override // com.microsoft.identity.common.java.platform.AbstractDevicePopManager
    public SecureHardwareState getSecureHardwareState(KeyPair keyPair) {
        if (keyPair == null) {
            throw new NullPointerException("kp is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getSecureHardwareState");
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            boolean zIsInsideSecureHardware = ((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), ANDROID_KEYSTORE).getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
            Logger.info(strOooO0OO, "SecretKey is secure hardware backed? " + zIsInsideSecureHardware);
            return zIsInsideSecureHardware ? SecureHardwareState.TRUE_UNATTESTED : SecureHardwareState.FALSE;
        } catch (NoSuchAlgorithmException e) {
            e = e;
            Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
            return SecureHardwareState.UNKNOWN_QUERY_ERROR;
        } catch (NoSuchProviderException e2) {
            e = e2;
            Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
            return SecureHardwareState.UNKNOWN_QUERY_ERROR;
        } catch (InvalidKeySpecException e3) {
            e = e3;
            Logger.error(strOooO0OO, "Failed to query secure hardware state.", e);
            return SecureHardwareState.UNKNOWN_QUERY_ERROR;
        }
    }

    @Override // com.microsoft.identity.common.java.platform.AbstractDevicePopManager
    public void performCleanupIfMintShrFails(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("e is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":performCleanupIfMintShrFails");
        if (exc.getCause() instanceof KeyPermanentlyInvalidatedException) {
            Logger.warn(strOooO0OO, "Unable to access asymmetric key - clearing.");
            clearAsymmetricKey();
        }
    }

    private KeyPair generateNewRsaKeyPair(Context context, int i) throws UnsupportedOperationException, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        boolean z;
        ProviderException e;
        for (int i2 = 0; i2 < 4; i2++) {
            KeyPair keyPairGenerateNewKeyPair = null;
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            boolean z5 = false;
            while (!z5) {
                try {
                    keyPairGenerateNewKeyPair = generateNewKeyPair(context, z2, z3, z4);
                } catch (ProviderException e2) {
                    z = z5;
                    e = e2;
                }
                try {
                    Logger.info(TAG, "Key pair generated successfully (StrongBox [" + z2 + "], Import [" + z3 + "], Attestation Challenge [" + z4 + "])");
                    z5 = true;
                } catch (ProviderException e3) {
                    e = e3;
                    z = true;
                    if (z2 && isStrongBoxUnavailableException(e)) {
                        Logger.error(TAG, "StrongBox unavailable. Skipping StrongBox then retry.", e);
                    } else {
                        if (z3 && e.getClass().getSimpleName().equals("SecureKeyImportUnavailableException")) {
                            Logger.error(TAG, "Import unsupported. Skipping import flag then retry.", e);
                            if (z2 && e.getCause() != null && (isStrongBoxUnavailableException(e.getCause()) || isNegativeInternalError(e.getCause()))) {
                                z2 = false;
                            }
                            z3 = false;
                        } else if (z4 && FAILED_TO_GENERATE_ATTESTATION_CERTIFICATE_CHAIN.equalsIgnoreCase(e.getMessage())) {
                            Logger.error(TAG, "Failed to generate attestation cert. Skipping attestation then retry.", e);
                            z4 = false;
                        } else {
                            if (!z2 || Build.VERSION.SDK_INT < 34 || e.getCause() == null || !isNegativeInternalError(e.getCause())) {
                                clearAsymmetricKey();
                                throw e;
                            }
                            Logger.error(TAG, "Android 14 Internal Key store error with StrongBox. Skipping strongbox then retry.", e);
                        }
                        z5 = z;
                    }
                    z2 = false;
                    z5 = z;
                }
            }
            int iKeyBitLength = RSAKeyUtils.keyBitLength(keyPairGenerateNewKeyPair.getPrivate());
            if (iKeyBitLength >= i || iKeyBitLength < 0) {
                getSecureHardwareState(keyPairGenerateNewKeyPair);
                return keyPairGenerateNewKeyPair;
            }
        }
        clearAsymmetricKey();
        throw new UnsupportedOperationException("Failed to generate valid KeyPair. Attempted 4 times.");
    }

    public AndroidDevicePopManager(Context context, String str) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        super(createKeyStoreKeyManager(str));
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        if (str != null) {
            this.mContext = context;
            return;
        }
        throw new NullPointerException("alias is marked non-null but is null");
    }
}
