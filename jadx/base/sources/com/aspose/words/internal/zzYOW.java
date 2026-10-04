package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYO1;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYVR;
import com.aspose.words.internal.zzZ0I;
import com.aspose.words.internal.zzZ4K;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOW extends zzYQR {
    private static final String PREFIX;
    private static final Map<String, String> zzVSZ;
    private Class[] zzVVU = {IvParameterSpec.class};
    private zzYP6<zzZ0S> zzVU1 = new zzYP6<zzZ0S>() { // from class: com.aspose.words.internal.zzYOW.1
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.words.internal.zzYP6
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public zzYP7 zzW(final zzZ0S zzz0s) {
            return zzYNC.zzT(zzz0s.zzXF4()) ? new zzYQN((zzZ5P) zzz0s) : zzz0s.zzXF4().equals(zzZ0I.zzWcL.zzXF4()) ? new zzYP7() { // from class: com.aspose.words.internal.zzYOW.1.1
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                    return algorithmParameterSpec instanceof zzYM9 ? ((zzZ0I.zzS) zzz0s).zzOL(((zzYM9) algorithmParameterSpec).zzXzQ()) : zzz0s;
                }
            } : new zzYPM((zzZ4L) zzz0s);
        }
    };
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYOW.12
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };
    private zzZ0I.zzU zzVSY = new zzZ0I.zzU();
    private zzZ0I.zzW zzVSX = new zzZ0I.zzW();

    public static class zzZ extends zzYQC {
        public zzZ() {
            super("DESede", zzZ0I.zzWjd, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYOW.zzZ.1
                @Override // com.aspose.words.internal.zzYQC.zzZ
                public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                    int length = bArr.length * 8;
                    if (length != 128 && length != 192) {
                        throw new InvalidKeySpecException("Provided key data wrong size for DESede");
                    }
                    zzYT0.zzW0(bArr);
                    return bArr;
                }
            });
        }

        @Override // com.aspose.words.internal.zzYQC, javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESedeKeySpec ? new zzYNP(new zzYUD(zzZ0I.zzWjd, this.zzVVE.zzVT(((DESedeKeySpec) keySpec).getKey()))) : super.engineGenerateSecret(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQC, javax.crypto.SecretKeyFactorySpi
        public final KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (!DESedeKeySpec.class.isAssignableFrom(cls)) {
                return super.engineGetKeySpec(secretKey, cls);
            }
            byte[] encoded = secretKey.getEncoded();
            try {
                if (encoded.length != 16) {
                    return new DESedeKeySpec(this.zzVVE.zzVT(encoded));
                }
                byte[] bArr = new byte[24];
                System.arraycopy(encoded, 0, bArr, 0, 16);
                System.arraycopy(encoded, 0, bArr, 16, 8);
                return new DESedeKeySpec(bArr);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.getMessage(), e);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        zzVSZ = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", "RAW");
        PREFIX = zzYOW.class.getName().concat(".");
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB");
        Map<String, String> map = zzVSZ;
        zzyq8.zzZ("Cipher.DESEDE", strOooO0OO, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOW.16
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return zzZ5L.zzXH0() ? new zzYQJ.zzZ(zzyq8, 64, zzZ0I.zzWd3, zzZ0I.zzWd4, zzZ0I.zzWd2, zzZ0I.zzWd0, zzZ0I.zzWcZ, zzZ0I.zzWd1, zzZ0I.zzWcY, zzZ0I.zzWcX, zzZ0I.zzWcW, zzZ0I.zzWcU, zzZ0I.zzWcT, zzZ0I.zzWcV, zzZ0I.zzWcS, zzZ0I.zzWcR, zzZ0I.zzWcQ, zzZ0I.zzWcO, zzZ0I.zzWcP, zzZ0I.zzWcN, zzZ0I.zzWcM).zzZ(zzYOW.this.zzVU1, (zzZ0J) zzYOW.this.zzVSY, (zzZ1U) null).zzW(zzYOW.this.zzVVU).zzXBD() : new zzYQJ.zzZ(zzyq8, 64, zzZ0I.zzWd3, zzZ0I.zzWd4, zzZ0I.zzWd2, zzZ0I.zzWd0, zzZ0I.zzWcZ, zzZ0I.zzWd1, zzZ0I.zzWcY, zzZ0I.zzWcX, zzZ0I.zzWcW, zzZ0I.zzWcU, zzZ0I.zzWcT, zzZ0I.zzWcV, zzZ0I.zzWcS, zzZ0I.zzWcR, zzZ0I.zzWcQ, zzZ0I.zzWcO, zzZ0I.zzWcP, zzZ0I.zzWcN, zzZ0I.zzWcM, zzYVR.zzW0H, zzYVR.zzW0G).zzZ(zzYOW.this.zzVU1, (zzZ0J) zzYOW.this.zzVSY, (zzZ1U) null).zzZ(zzYOW.this.zzVU0, (zzZ44) null, new zzYVR.zzZ()).zzW(zzYOW.this.zzVVU).zzXBD();
            }
        });
        zzZDA zzzda = zzZ96.zzWya;
        zzyq8.zzZ("Cipher", zzzda, C21111o0ooOoO.OooO0Oo(str, "$CBC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYOW.17
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzZ0I.zzWcX).zzZ(zzYOW.this.zzVU1, (zzZ0J) zzYOW.this.zzVSY, (zzZ1U) null).zzW(zzYOW.this.zzVVU).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher.DESEDEWRAP", C21111o0ooOoO.OooO0Oo(str, "$Wrap"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYOW.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ0I.zzWcL).zzZ(zzYOW.this.zzVU1, (zzZ18) zzYOW.this.zzVSX).zzU(zzYOW.this.zzVVU).zzXBu();
            }
        });
        zzyq8.zzXp("Alg.Alias.Cipher.DESEDETKW", "DESEDEWRAP");
        if (!zzZ5L.zzXH0()) {
            zzyq8.zzZ("Cipher.DESEDERFC3217WRAP", C21111o0ooOoO.OooO0Oo(str, "$RFC3217Wrap"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.19
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQ9.zzZ(zzyq8, zzYVR.zzW0F).zzZ(zzYOW.this.zzVU0, new zzYVR.zzX()).zzU(zzYOW.this.zzVVU).zzXBu();
                }
            }));
            zzyq8.zzZ("Cipher", "DESEDERFC3217WRAP", zzZ96.zzWwu);
            zzyq8.zzZ("Cipher.DESEDERFC3211WRAP", C21111o0ooOoO.OooO0Oo(str, "$RFC3211Wrap"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.20
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQ9.zzZ(zzyq8, zzYVR.zzW0E).zzZ(zzYOW.this.zzVU0, new zzYVR.zzX()).zzU(zzYOW.this.zzVVU).zzXBu();
                }
            }));
            zzyq8.zzZ("Cipher.DESEDE/OPENPGPCFB/NOPADDING", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$OpenPGP"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.21
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 64, zzYVR.zzW0H).zzZ(zzYOW.this.zzVU0, new zzYVR.zzV(), (zzZ5Z) null).zzW(zzYOW.this.zzVVU).zzXBD();
                }
            }));
            StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$PBEWithSHAAndDES3Key"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.22
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 64, zzZ0I.zzWcX).zzeZ(192).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYOW.this.zzVU1, (zzZ0J) zzYOW.this.zzVSY, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }), str);
            sbOooO0OO.append("$PBEWithSHAAndDES2Key");
            zzyq8.zzZ("Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 64, zzZ0I.zzWcX).zzeZ(128).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYOW.this.zzVU1, (zzZ0J) zzYOW.this.zzVSY, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }));
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND3-KEYDESEDE-CBC", zzZ96.zzWwz);
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3KEYTRIPLEDES");
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND2-KEYDESEDE-CBC", zzZ96.zzWwy);
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2KEYTRIPLEDES");
            zzyq8.zzXp("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYDESEDE-CBC");
            zzyq8.zzXp("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYDESEDE-CBC");
            zzyq8.zzXp("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYDESEDE-CBC");
            zzyq8.zzXp("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYDESEDE-CBC");
            zzyq8.zzXp("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYDESEDE-CBC");
        }
        zzyq8.zzZ("KeyGenerator.DESEDE", C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYOW.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "DESede", 168, new zzYPL() { // from class: com.aspose.words.internal.zzYOW.3.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzZ0I.zzX(i, secureRandom);
                    }
                });
            }
        });
        zzyq8.zzZ("KeyGenerator", "DESEDE", "TRIPLEDES");
        zzZDA zzzda2 = zzZ9K.zzWyX;
        zzyq8.zzZ("KeyGenerator", "DESEDE", zzzda2);
        zzyq8.zzZ("KeyGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator3"), new zzYPS() { // from class: com.aspose.words.internal.zzYOW.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "DESede", 168, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOW.4.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzZ0I.zzX(zzZ0I.zzWcY, secureRandom);
                    }
                });
            }
        });
        zzyq8.zzZ("Mac.DESEDECMAC", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$CMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYOW.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ0I.zzZ zzz = zzZ0I.zzWcK;
                return new zzYQE(zzz, new zzZ0I.zzV(), new zzYQN(zzz));
            }
        });
        zzyq8.zzZ("Mac", "DESEDECMAC", "DESEDE-CMAC");
        zzyq8.zzZ("AlgorithmParameters.DESEDE", C21111o0ooOoO.OooO0Oo(str, ".util.IvAlgorithmParameters"), new zzYPS() { // from class: com.aspose.words.internal.zzYOW.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPN();
            }
        });
        zzyq8.zzZ("AlgorithmParameters", "DESEDE", zzzda);
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPS() { // from class: com.aspose.words.internal.zzYOW.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "DESede", 8);
            }
        });
        zzyq8.zzZ("SecretKeyFactory.DESEDE", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$KeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYOW.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        });
        zzyq8.zzZ("SecretKeyFactory", "DESEDE", "TDEA", "TRIPLEDES");
        zzyq8.zzZ("Cipher", "DESEDE", "TDEA");
        zzyq8.zzZ("Cipher", "DESEDEWRAP", "TDEAWRAP");
        zzyq8.zzZ("KeyGenerator", "DESEDE", "TDEA");
        zzyq8.zzZ("AlgorithmParameters", "DESEDE", "TDEA");
        if (zzZ5L.zzXH0()) {
            return;
        }
        zzyq8.zzZ("Mac.DESEDEMAC", C21111o0ooOoO.OooO0Oo(str, "$CBCMAC"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVR.zzY zzy = zzYVR.zzW0K;
                return new zzYQE(zzy, new zzYVR.zzW(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
        zzyq8.zzZ("Mac.DESEDEMAC/CFB8", str + "$DESedeCFB8", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVR.zzY zzy = zzYVR.zzW0I;
                return new zzYQE(zzy, new zzYVR.zzW(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "DESEDEMAC/CFB8", "DESEDE/CFB8");
        zzyq8.zzZ("Mac.DESEDEMAC64", C21111o0ooOoO.OooO0Oo(str, "$DESede64"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYVR.zzW0K, new zzYVR.zzW(), new zzYPG() { // from class: com.aspose.words.internal.zzYOW.11.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return zzYVR.zzW0K.zzg1(64);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return zzYVR.zzW0K.zzg1(64);
                    }
                });
            }
        }));
        zzyq8.zzZ("Mac", "DESEDEMAC64", "DESEDE64");
        zzyq8.zzZ("Mac.DESEDEMAC64WITHISO7816-4PADDING", C21111o0ooOoO.OooO0Oo(str, "$DESede64with7816d4"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYVR.zzW0J, new zzYVR.zzW(), new zzYPG() { // from class: com.aspose.words.internal.zzYOW.13.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return zzYVR.zzW0J.zzg1(64);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return zzYVR.zzW0J.zzg1(64);
                    }
                });
            }
        }));
        zzyq8.zzZ("Mac", "DESEDEMAC64WITHISO7816-4PADDING", "DESEDE64WITHISO7816-4PADDING");
        zzyq8.zzZ("Mac", "DESEDEMAC64WITHISO7816-4PADDING", "DESEDEISO9797ALG1MACWITHISO7816-4PADDING");
        zzyq8.zzZ("Mac", "DESEDEMAC64WITHISO7816-4PADDING", "DESEDEISO9797ALG1WITHISO7816-4PADDING");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES", C21111o0ooOoO.OooO0Oo(str, "$PBEWithSHAAndDES2KeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("DESede", zzZ4K.zzZ.CIPHER, 128);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND2-KEYTRIPLEDES", "PBEWITHSHA1AND2-KEYTRIPLEDES", "PBEWITHSHA-1AND2-KEYTRIPLEDES", "PBEWITHSHAAND2-KEYDESEDE", "PBEWITHSHA1AND2-KEYDESEDE", "PBEWITHSHA-1AND2-KEYDESEDE");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES", C21111o0ooOoO.OooO0Oo(str, "$PBEWithSHAAndDES3KeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOW.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("DESede", zzZ4K.zzZ.CIPHER, 192);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND3-KEYTRIPLEDES", "PBEWITHSHA1AND3-KEYTRIPLEDES", "PBEWITHSHA-1AND3-KEYTRIPLEDES", "PBEWITHSHAAND3-KEYDESEDE", "PBEWITHSHA1AND3-KEYDESEDE", "PBEWITHSHA-1AND3-KEYDESEDE", "PBEWITHSHA1ANDDESEDE");
        zzyq8.zzZ("SecretKeyFactory", "DESEDE", zzzda2);
        zzyq8.zzZ("AlgorithmParameters", "PBKDF-PKCS12", zzZ96.zzWwy, zzZ96.zzWwz);
    }
}
