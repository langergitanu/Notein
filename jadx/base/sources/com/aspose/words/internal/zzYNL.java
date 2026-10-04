package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1D;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.security.internal.spec.TlsKeyMaterialParameterSpec;
import sun.security.internal.spec.TlsKeyMaterialSpec;
import sun.security.internal.spec.TlsMasterSecretParameterSpec;
import sun.security.internal.spec.TlsPrfParameterSpec;
import sun.security.internal.spec.TlsRsaPremasterSecretParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNL extends zzYQP {
    private static final boolean zzVPg = ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: com.aspose.words.internal.zzYNL.1
        private static Boolean zzXBi() {
            try {
                return Boolean.valueOf(zzYQ8.class.getClassLoader().loadClass("sun.security.internal.spec.TlsPrfParameterSpec").getMethod("getPRFHashAlg", new Class[0]) != null);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // java.security.PrivilegedAction
        public final /* synthetic */ Boolean run() {
            return zzXBi();
        }
    })).booleanValue();
    private static final boolean zzVPe = ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: com.aspose.words.internal.zzYNL.5
        private static Boolean zzXBi() {
            try {
                return Boolean.valueOf(zzYQ8.class.getClassLoader().loadClass("sun.security.internal.spec.TlsRsaPremasterSecretParameterSpec").getMethod("getEncodedSecret", new Class[0]) != null);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // java.security.PrivilegedAction
        public final /* synthetic */ Boolean run() {
            return zzXBi();
        }
    })).booleanValue();
    private static final Constructor zzVPf = (Constructor) AccessController.doPrivileged(new PrivilegedAction<Constructor>() { // from class: com.aspose.words.internal.zzYNL.6
        private static Constructor zzXAf() {
            try {
                return zzYQ8.class.getClassLoader().loadClass("sun.security.internal.spec.TlsPrfParameterSpec").getConstructors()[0];
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.security.PrivilegedAction
        public final /* synthetic */ Constructor run() {
            return zzXAf();
        }
    });

    public static final class zzU extends zzZ {
        private TlsRsaPremasterSecretParameterSpec zzVP2;

        @Override // javax.crypto.KeyGeneratorSpi
        public final SecretKey engineGenerateKey() {
            return (SecretKey) AccessController.doPrivileged(new PrivilegedAction<SecretKey>() { // from class: com.aspose.words.internal.zzYNL.zzU.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXBB, reason: merged with bridge method [inline-methods] */
                public SecretKey run() {
                    if (!zzYNL.zzVPe) {
                        byte[] bArr = new byte[48];
                        zzU.this.zzVPc.nextBytes(bArr);
                        bArr[0] = (byte) zzU.this.zzVP2.getMajorVersion();
                        bArr[1] = (byte) zzU.this.zzVP2.getMinorVersion();
                        return new SecretKeySpec(bArr, "TlsPreMasterSecret");
                    }
                    try {
                        byte[] bArr2 = (byte[]) zzYQ8.class.getClassLoader().loadClass("sun.security.internal.spec.TlsRsaPremasterSecretParameterSpec").getMethod("getEncodedSecret", new Class[0]).invoke(zzU.this.zzVP2, new Object[0]);
                        if (bArr2 == null) {
                            bArr2 = new byte[48];
                            zzU.this.zzVPc.nextBytes(bArr2);
                            bArr2[0] = (byte) zzU.this.zzVP2.getMajorVersion();
                            bArr2[1] = (byte) zzU.this.zzVP2.getMinorVersion();
                        }
                        return new SecretKeySpec(bArr2, "TlsPreMasterSecret");
                    } catch (Exception e) {
                        throw new IllegalStateException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("internal error, profile of TlsRSAPremasterSecretParameterSpec has changed: ")), e);
                    }
                }
            });
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public final void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYNL.zzU.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    zzU.this.zzVP2 = algorithmParameterSpec;
                    zzU.this.zzVPc = secureRandom;
                    return null;
                }
            });
        }
    }

    public static final class zzV extends zzZ {
        private TlsPrfParameterSpec zzVP4;

        @Override // javax.crypto.KeyGeneratorSpi
        public final SecretKey engineGenerateKey() {
            return (SecretKey) AccessController.doPrivileged(new PrivilegedAction<SecretKey>() { // from class: com.aspose.words.internal.zzYNL.zzV.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXBB, reason: merged with bridge method [inline-methods] */
                public SecretKey run() {
                    return zzZ.zzZ(zzV.this.zzVP4, "DUMMY");
                }
            });
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public final void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYNL.zzV.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    zzV.this.zzVP4 = algorithmParameterSpec;
                    zzV.this.zzVPc = secureRandom;
                    return null;
                }
            });
        }
    }

    public static final class zzW extends zzZ {
        private TlsMasterSecretParameterSpec zzVPb;

        @Override // javax.crypto.KeyGeneratorSpi
        public final SecretKey engineGenerateKey() {
            return (SecretKey) AccessController.doPrivileged(new PrivilegedAction<SecretKey>() { // from class: com.aspose.words.internal.zzYNL.zzW.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXBB, reason: merged with bridge method [inline-methods] */
                public SecretKey run() {
                    byte[] bArrZzn = zzYGU.zzn(zzW.this.zzVPb.getClientRandom(), zzW.this.zzVPb.getServerRandom());
                    return zzZ.zzZ(zzYNL.zzVPg ? zzYNL.zzZ(zzW.this.zzVPb.getPremasterSecret(), "master secret", bArrZzn, 48, zzW.this.zzVPb.getPRFHashAlg(), zzW.this.zzVPb.getPRFHashLength(), zzW.this.zzVPb.getPRFBlockSize()) : zzYNL.zzZ(zzW.this.zzVPb.getPremasterSecret(), "master secret", bArrZzn, 48, (String) null, 0, 0), "TlsMasterSecret");
                }
            });
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public final void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYNL.zzW.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    zzW.this.zzVPb = algorithmParameterSpec;
                    zzW.this.zzVPc = secureRandom;
                    return null;
                }
            });
        }
    }

    public static final class zzX extends zzZ {
        private TlsKeyMaterialParameterSpec zzVP7;

        @Override // javax.crypto.KeyGeneratorSpi
        public final SecretKey engineGenerateKey() {
            return (SecretKey) AccessController.doPrivileged(new PrivilegedAction<SecretKey>() { // from class: com.aspose.words.internal.zzYNL.zzX.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXBB, reason: merged with bridge method [inline-methods] */
                public SecretKey run() {
                    SecretKeySpec secretKeySpec;
                    SecretKeySpec secretKeySpec2;
                    SecretKeySpec secretKeySpec3;
                    SecretKeySpec secretKeySpec4;
                    IvParameterSpec ivParameterSpec;
                    IvParameterSpec ivParameterSpec2;
                    if (zzX.this.zzVP7.getExpandedCipherKeyLength() > 0) {
                        throw new UnsupportedOperationException();
                    }
                    int cipherKeyLength = zzX.this.zzVP7.getCipherKeyLength();
                    int ivLength = zzX.this.zzVP7.getIvLength();
                    int macKeyLength = zzX.this.zzVP7.getMacKeyLength();
                    int i = (cipherKeyLength + ivLength + macKeyLength) * 2;
                    byte[] bArrZzn = zzYGU.zzn(zzX.this.zzVP7.getServerRandom(), zzX.this.zzVP7.getClientRandom());
                    byte[] encoded = zzZ.zzZ(zzYNL.zzVPg ? zzYNL.zzZ(zzX.this.zzVP7.getMasterSecret(), "key expansion", bArrZzn, i, zzX.this.zzVP7.getPRFHashAlg(), zzX.this.zzVP7.getPRFHashLength(), zzX.this.zzVP7.getPRFBlockSize()) : zzYNL.zzZ(zzX.this.zzVP7.getMasterSecret(), "key expansion", bArrZzn, i, (String) null, 0, 0), "DUMMY").getEncoded();
                    int i2 = 0;
                    if (macKeyLength > 0) {
                        SecretKeySpec secretKeySpec5 = new SecretKeySpec(encoded, 0, macKeyLength, "DUMMY");
                        secretKeySpec2 = new SecretKeySpec(encoded, macKeyLength, macKeyLength, "DUMMY");
                        secretKeySpec = secretKeySpec5;
                        i2 = macKeyLength + macKeyLength;
                    } else {
                        secretKeySpec = null;
                        secretKeySpec2 = null;
                    }
                    if (cipherKeyLength > 0) {
                        String cipherAlgorithm = zzX.this.zzVP7.getCipherAlgorithm();
                        SecretKeySpec secretKeySpec6 = new SecretKeySpec(encoded, i2, cipherKeyLength, cipherAlgorithm);
                        int i3 = i2 + cipherKeyLength;
                        SecretKeySpec secretKeySpec7 = new SecretKeySpec(encoded, i3, cipherKeyLength, cipherAlgorithm);
                        i2 = i3 + cipherKeyLength;
                        secretKeySpec3 = secretKeySpec6;
                        secretKeySpec4 = secretKeySpec7;
                    } else {
                        secretKeySpec3 = null;
                        secretKeySpec4 = null;
                    }
                    if (ivLength > 0) {
                        IvParameterSpec ivParameterSpec3 = new IvParameterSpec(encoded, i2, ivLength);
                        int i4 = i2 + ivLength;
                        IvParameterSpec ivParameterSpec4 = new IvParameterSpec(encoded, i4, ivLength);
                        i2 = i4 + ivLength;
                        ivParameterSpec2 = ivParameterSpec4;
                        ivParameterSpec = ivParameterSpec3;
                    } else {
                        ivParameterSpec = null;
                        ivParameterSpec2 = null;
                    }
                    if (i2 == i) {
                        return new TlsKeyMaterialSpec(secretKeySpec, secretKeySpec2, secretKeySpec3, ivParameterSpec, secretKeySpec4, ivParameterSpec2);
                    }
                    throw new IllegalStateException();
                }
            });
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public final void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYNL.zzX.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    zzX.this.zzVP7 = algorithmParameterSpec;
                    zzX.this.zzVPc = secureRandom;
                    return null;
                }
            });
        }
    }

    public static final class zzY extends zzZ {
        private TlsMasterSecretParameterSpec zzVPb;

        @Override // javax.crypto.KeyGeneratorSpi
        public final SecretKey engineGenerateKey() {
            return (SecretKey) AccessController.doPrivileged(new PrivilegedAction<SecretKey>() { // from class: com.aspose.words.internal.zzYNL.zzY.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXBB, reason: merged with bridge method [inline-methods] */
                public SecretKey run() {
                    byte[] extendedMasterSecretSessionHash = zzY.this.zzVPb.getExtendedMasterSecretSessionHash();
                    return zzZ.zzZ(((zzY.this.zzVPb.getMajorVersion() << 8) | zzY.this.zzVPb.getMinorVersion()) >= 771 ? zzYNL.zzZ(zzY.this.zzVPb.getPremasterSecret(), "extended master secret", extendedMasterSecretSessionHash, 48, zzY.this.zzVPb.getPRFHashAlg(), zzY.this.zzVPb.getPRFHashLength(), zzY.this.zzVPb.getPRFBlockSize()) : zzYNL.zzZ(zzY.this.zzVPb.getPremasterSecret(), "extended master secret", extendedMasterSecretSessionHash, 48, "NONE", 0, 0), "TlsMasterSecret");
                }
            });
        }

        @Override // com.aspose.words.internal.zzYNL.zzZ, javax.crypto.KeyGeneratorSpi
        public final void engineInit(SecureRandom secureRandom) {
            throw new InvalidParameterException("only initialise with TlsMasterSecretParameterSpec");
        }

        @Override // com.aspose.words.internal.zzYNL.zzZ, javax.crypto.KeyGeneratorSpi
        public final void engineInit(int i, SecureRandom secureRandom) {
            throw new InvalidParameterException("only initialise with TlsMasterSecretParameterSpec");
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public final void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYNL.zzY.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    zzY.this.zzVPb = algorithmParameterSpec;
                    zzY.this.zzVPc = secureRandom;
                    return null;
                }
            });
        }
    }

    public static abstract class zzZ extends KeyGeneratorSpi {
        protected SecureRandom zzVPc = null;

        public static SecretKey zzZ(TlsPrfParameterSpec tlsPrfParameterSpec, String str) {
            zzZ1D.zzD zzdZzwl;
            zzZ1D.zzB zzbZzY = (!zzYNL.zzVPg || (zzdZzwl = zzYNL.zzwl(tlsPrfParameterSpec.getPRFHashAlg())) == null) ? zzZ1D.zzWgz : zzZ1D.zzWgy.zzY(zzdZzwl);
            zzZ5A<zzZ1D.zzC> zzz5aZzY = new zzZ1D.zzE().zzY(zzbZzY.zzZ(tlsPrfParameterSpec.getSecret().getEncoded(), tlsPrfParameterSpec.getLabel(), tlsPrfParameterSpec.getSeed()));
            byte[] bArr = new byte[tlsPrfParameterSpec.getOutputLength()];
            zzz5aZzY.zzXi(bArr);
            return new SecretKeySpec(bArr, str);
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public void engineInit(SecureRandom secureRandom) {
            throw new UnsupportedOperationException();
        }

        @Override // javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ1D.zzD zzwl(String str) {
        if (str.equals("NONE")) {
            return null;
        }
        if (str.equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            return zzZ1D.zzD.SHA256_HMAC;
        }
        if (str.equals("SHA-384")) {
            return zzZ1D.zzD.SHA384_HMAC;
        }
        if (str.equals("SHA-512")) {
            return zzZ1D.zzD.SHA512_HMAC;
        }
        throw new IllegalStateException("Unknown PRF: ".concat(str));
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyGenerator.SUNTLSRSAPREMASTERSECRET", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLSKeyGeneratorPremaster", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzU();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLS12RSAPREMASTERSECRET", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLS12KeyGeneratorPremaster", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzU();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLSMASTERSECRET", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLSKeyGeneratorMaster", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLSEXTENDEDMASTERSECRET", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLSExtendedKeyGeneratorMaster", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLS12MASTERSECRET", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLS12KeyGeneratorMaster", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLSKEYMATERIAL", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLSKeyGeneratorKeyMaterial", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLS12KEYMATERIAL", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLS12KeyGeneratorKeyMaterial", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLSPRF", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLSKeyGeneratorPRF", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzV();
            }
        });
        zzyq8.zzZ("KeyGenerator.SUNTLS12PRF", "org.bouncycastle.jcajce.provider.symmetric.kdf.SunTLS12KeyGeneratorPRF", new zzYPS() { // from class: com.aspose.words.internal.zzYNL.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzV();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TlsPrfParameterSpec zzZ(SecretKey secretKey, String str, byte[] bArr, int i, String str2, int i2, int i3) {
        Object[] objArr;
        if (zzVPg) {
            objArr = new Object[]{secretKey, str, bArr, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)};
        } else {
            objArr = new Object[]{secretKey, str, bArr, Integer.valueOf(i)};
        }
        try {
            return (TlsPrfParameterSpec) zzVPf.newInstance(objArr);
        } catch (Exception e) {
            throw new IllegalStateException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to construct TlsPrfParameterSpec: ")), e);
        }
    }
}
