package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYO3;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYYY;
import com.aspose.words.internal.zzZ0P;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOX extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYOX";
    private Class[] zzVVU = {IvParameterSpec.class};
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYOX.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };

    public static class zzZ extends zzYQC {
        public zzZ() {
            super("DES", zzYYY.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYOX.zzZ.1
                @Override // com.aspose.words.internal.zzYQC.zzZ
                public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                    if (bArr.length * 8 != 64) {
                        throw new InvalidKeySpecException("Provided key data wrong size for DES");
                    }
                    zzYT0.zzW0(bArr);
                    return bArr;
                }
            });
        }

        @Override // com.aspose.words.internal.zzYQC, javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESKeySpec ? new zzYNP(new zzYUD(zzYYY.zzWb4, this.zzVVE.zzVT(((DESKeySpec) keySpec).getKey()))) : super.engineGenerateSecret(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQC, javax.crypto.SecretKeyFactorySpi
        public final KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (!DESKeySpec.class.isAssignableFrom(cls)) {
                return super.engineGetKeySpec(secretKey, cls);
            }
            try {
                return new DESKeySpec(this.zzVVE.zzVT(secretKey.getEncoded()));
            } catch (InvalidKeyException e) {
                throw new InvalidKeySpecException(e.getMessage(), e);
            }
        }
    }

    private static void zzY(zzYQ8 zzyq8, zzZDA zzzda, String str) {
        zzyq8.zzZ("KeyGenerator", str, zzzda);
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("Cipher.DES", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYYY.zzW94, zzYYY.zzW95, zzYYY.zzW93, zzYYY.zzW91, zzYYY.zzW90, zzYYY.zzW92, zzYYY.zzW8Z, zzYYY.zzW8Y, zzYYY.zzW8X, zzYYY.zzW8V, zzYYY.zzW8U, zzYYY.zzW8W, zzYYY.zzW8T, zzYYY.zzW8S, zzYYY.zzW8R, zzYYY.zzW8P, zzYYY.zzW8Q, zzYYY.zzW8O, zzYYY.zzW8L, zzYYY.zzW8N, zzYYY.zzW8M).zzeZ(64).zzZ(zzYOX.this.zzVU0, new zzYYY.zzU(), new zzYYY.zzZ()).zzW(zzYOX.this.zzVVU).zzXBD();
            }
        }));
        zzZDA zzzda = zzZ9K.zzWz0;
        zzyq8.zzZ("KeyGenerator.DES", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, C21111o0ooOoO.OooO0Oo(str, "$CBC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYYY.zzW8Y).zzeZ(64).zzZ(zzYOX.this.zzVU0, new zzYYY.zzU(), (zzZ5Z) null).zzW(zzYOX.this.zzVVU).zzXBD();
            }
        })), str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "DES", 56, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOX.13.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYYY.zzW(secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "DES", "DEA");
        zzyq8.zzZ("SecretKeyFactory.DES", C21111o0ooOoO.OooO0Oo(str, "$KeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "DES", "DEA");
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Mac.DESCMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYYY.zzY zzy = zzYYY.zzW8K;
                return new zzYQE(zzy, new zzYYY.zzV(), new zzYQN(zzy));
            }
        }), str);
        sbOooO0OO.append("$CBCMAC");
        zzyq8.zzZ("Mac.DESMAC", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.16
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYYY.zzY zzy = zzYYY.zzW8J;
                return new zzYQE(zzy, new zzYYY.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.DES", "DESMAC");
        zzyq8.zzZ("Mac.DESMAC/CFB8", str + "$DESCFB8", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.17
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYYY.zzY zzy = zzYYY.zzW8F;
                return new zzYQE(zzy, new zzYYY.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
        zzyq8.zzZ("Mac.DESMAC64", str + "$DES64", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYYY.zzW8J, new zzYYY.zzV(), new zzYPG() { // from class: com.aspose.words.internal.zzYOX.18.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return zzYYY.zzW8J.zzg1(64);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return zzYYY.zzW8J.zzg1(64);
                    }
                });
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.DES64", "DESMAC64");
        zzyq8.zzZ("Mac.DESMAC64WITHISO7816-4PADDING", str + "$DES64with7816d4", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYYY.zzW8I, new zzYYY.zzV(), new zzYPG() { // from class: com.aspose.words.internal.zzYOX.2.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return zzYYY.zzW8I.zzg1(64);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return zzYYY.zzW8I.zzg1(64);
                    }
                });
            }
        }));
        zzyq8.zzZ("Mac", "DESMAC64WITHISO7816-4PADDING", "DES64WITHISO7816-4PADDING");
        zzyq8.zzZ("Mac", "DESMAC64WITHISO7816-4PADDING", "DESISO9797ALG1MACWITHISO7816-4PADDING");
        zzyq8.zzZ("Mac", "DESMAC64WITHISO7816-4PADDING", "DESISO9797ALG1WITHISO7816-4PADDING");
        zzyq8.zzZ("Mac.DESWITHISO9797", C21111o0ooOoO.OooO0Oo(str, "$DES9797Alg3"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYYY.zzW8H, new zzYYY.zzV(), new zzYPG() { // from class: com.aspose.words.internal.zzYOX.3.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return zzYYY.zzW8H;
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return zzYYY.zzW8H;
                    }
                });
            }
        }));
        zzyq8.zzZ("Mac", "DESWITHISO9797", "DESISO9797MAC", "ISO9797ALG3", "ISO9797ALG3MAC");
        zzyq8.zzZ("Mac.ISO9797ALG3WITHISO7816-4PADDING", C21111o0ooOoO.OooO0Oo(str, "$DES9797Alg3with7816d4"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYYY.zzW8G, new zzYYY.zzV(), new zzYPG() { // from class: com.aspose.words.internal.zzYOX.4.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return zzYYY.zzW8G.zzg1(64);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return zzYYY.zzW8G.zzg1(64);
                    }
                });
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        zzyq8.zzZ("AlgorithmParameters.DES", str + ".util.IvAlgorithmParameters", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPN();
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "DES", zzzda);
        StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHMD5ANDDES-CBC", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "DES", 8);
            }
        })), str, "$PBEWithMD5"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYYY.zzW8Y).zzZ(zzYOX.this.zzVU0, new zzYYY.zzU(), (zzZ5Z) null).zzeZ(64).zzeY(zzYPF.PBKDF1$3a317ada).zzQ(zzYW0.zzZ.zzW1W).zzW(zzYOX.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO2.append("$PBEWithSHA1");
        zzyq8.zzZ("Cipher.PBEWITHSHA1ANDDES-CBC", sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYYY.zzW8Y).zzZ(zzYOX.this.zzVU0, new zzYYY.zzU(), (zzZ5Z) null).zzeZ(64).zzeY(zzYPF.PBKDF1$3a317ada).zzQ(zzZ0P.zzZ.zzWdL).zzW(zzYOX.this.zzVVU).zzXBD();
            }
        }));
        zzyq8.zzZ("Cipher", "PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        zzyq8.zzZ("Cipher", "PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        zzyq8.zzZ("Cipher", "PBEWITHMD5ANDDES-CBC", zzZ96.zzWyg);
        zzyq8.zzZ("Cipher", "PBEWITHSHA1ANDDES-CBC", zzZ96.zzWye);
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAANDDES", C21111o0ooOoO.OooO0Oo(str, "PBESHADES"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO3.zzY("DES", zzZ4I.ASCII, zzZ0P.zzZ.zzWdL);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAANDDES", "PBEWITHSHA1ANDDES", "PBEWITHSHA-1ANDDES");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHMD5ANDDES", C21111o0ooOoO.OooO0Oo(str, "PBEMD5DES"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOX.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO3.zzY("DES", zzZ4I.ASCII, zzYW0.zzZ.zzW1W);
            }
        }));
        zzY(zzyq8, zzzda, "DES");
    }
}
