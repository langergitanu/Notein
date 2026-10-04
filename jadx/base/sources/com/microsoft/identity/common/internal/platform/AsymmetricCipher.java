package com.microsoft.identity.common.internal.platform;

import com.microsoft.identity.common.java.crypto.AsymmetricAlgorithm;
import com.microsoft.identity.common.java.crypto.CryptoSuite;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.SigningAlgorithm;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes9.dex */
public enum AsymmetricCipher implements CryptoSuite {
    RSA_NONE_OAEPWithSHA_1AndMGF1PaddingAndHmacSha256 { // from class: com.microsoft.identity.common.internal.platform.AsymmetricCipher.1
        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public boolean isAsymmetric() {
            return true;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public Class<? extends KeyStore.Entry> keyClass() {
            return KeyStore.PrivateKeyEntry.class;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public int keySize() {
            return 2048;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public String macName() {
            return KeyUtil.HMAC_ALGORITHM;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public SigningAlgorithm signingAlgorithm() {
            return SigningAlgorithm.SHA_256_WITH_RSA;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public AsymmetricAlgorithm cipher() {
            return IDevicePopManager.Cipher.RSA_NONE_OAEPWithSHA_1AndMGF1Padding;
        }
    },
    RSA_ECB_PKCS1_PADDING_HMACSHA256 { // from class: com.microsoft.identity.common.internal.platform.AsymmetricCipher.2
        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public boolean isAsymmetric() {
            return true;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public Class<? extends KeyStore.Entry> keyClass() {
            return KeyStore.PrivateKeyEntry.class;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public int keySize() {
            return 2048;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public String macName() {
            return KeyUtil.HMAC_ALGORITHM;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public SigningAlgorithm signingAlgorithm() {
            return SigningAlgorithm.SHA_256_WITH_RSA;
        }

        @Override // com.microsoft.identity.common.java.crypto.CryptoSuite
        public AsymmetricAlgorithm cipher() {
            return AsymmetricAlgorithm.Builder.m80239of("RSA/ECB/PKCS1Padding");
        }
    }
}
