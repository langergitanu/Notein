package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYO1;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYVQ;
import com.aspose.words.internal.zzZ4K;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYNK extends zzYND {
    private static final String PREFIX = "com.aspose.words.internal.zzYNK";
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYNK.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(final zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : (zzz4m.zzXGV().equals(zzYVQ.zzW0c.zzXGV()) || zzz4m.zzXGV().equals(zzYVQ.zzW0b.zzXGV())) ? new zzYP7() { // from class: com.aspose.words.internal.zzYNK.1.1
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                    return algorithmParameterSpec instanceof zzYM9 ? ((zzYVQ.zzR) zzz4m).zzOH(((zzYM9) algorithmParameterSpec).zzXzQ()) : zzz4m;
                }
            } : new zzYPM((zzZ4L) zzz4m);
        }
    };

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final zzYVQ.zzZ zzz = new zzYVQ.zzZ();
        final zzYVQ.zzV zzv = new zzYVQ.zzV();
        final zzYVQ.zzT zzt = new zzYVQ.zzT();
        final Class[] clsArrZzXBb = zzYPQ.zzXBb();
        final Class[] clsArr = {IvParameterSpec.class};
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.TWOFISH", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVQ.zzW0B, zzYVQ.zzW0C, zzYVQ.zzW0A, zzYVQ.zzW0y, zzYVQ.zzW0x, zzYVQ.zzW0z, zzYVQ.zzW0w, zzYVQ.zzW0v, zzYVQ.zzW0u, zzYVQ.zzW0s, zzYVQ.zzW0r, zzYVQ.zzW0t, zzYVQ.zzW0q, zzYVQ.zzW0p, zzYVQ.zzW0o, zzYVQ.zzW0m, zzYVQ.zzW0n, zzYVQ.zzW0l, zzYVQ.zzW0f, zzYVQ.zzW0k, zzYVQ.zzW0j, zzYVQ.zzW0i, zzYVQ.zzW0h, zzYVQ.zzW0g).zzZ(zzYNK.this.zzVU0, zzt, zzz).zzW(clsArrZzXBb).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$KeyGen");
        StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "KeyGenerator.TWOFISH", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Twofish", 128, false, new zzYPL() { // from class: com.aspose.words.internal.zzYNK.6.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYVQ.zzW(i, secureRandom);
                    }
                });
            }
        }), str);
        sbOooO0OO2.append("$AlgParams");
        StringBuilder sbOooO0OO3 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "AlgorithmParameters.TWOFISH", sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("Twofish");
            }
        }), str);
        sbOooO0OO3.append("$PBESHA256WithTWOFISHCBC");
        StringBuilder sbOooO0OO4 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAANDTWOFISH-CBC", sbOooO0OO3.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVQ.zzW0v).zzeZ(256).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYNK.this.zzVU0, zzt, (zzZ5Z) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
            }
        }), str);
        sbOooO0OO4.append("$GMAC");
        zzyq8.zzZ("Mac.TWOFISHGMAC", sbOooO0OO4.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVQ.zzY zzy = zzYVQ.zzW0d;
                return new zzYQE(zzy, new zzYVQ.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "TWOFISHGMAC", "TWOFISH-GMAC");
        zzyq8.zzZ("Mac.TWOFISHCMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVQ.zzY zzy = zzYVQ.zzW0e;
                return new zzYQE(zzy, new zzYVQ.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "TWOFISHCMAC", "TWOFISH-CMAC");
        zzyq8.zzZ("Mac.TWOFISHCCMMAC", C21111o0ooOoO.OooO0Oo(str, "$TWOFISHCCMMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVQ.zzY zzy = zzYVQ.zzW0i;
                return new zzYQE(zzy, new zzYVQ.zzU(), new zzYQN(zzy.zzg1(128)));
            }
        }));
        zzyq8.zzZ("Mac", "TWOFISHCCMMAC", "TWOFISH-CCMMAC");
        zzyq8.zzZ("Cipher.TWOFISHKW", C21111o0ooOoO.OooO0Oo(str, "$Wrap"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYVQ.zzW0c).zzZ(zzYNK.this.zzVU0, zzv).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "TWOFISHKW", "TWOFISHWRAP");
        zzyq8.zzZ("Cipher.TWOFISHKWP", C21111o0ooOoO.OooO0Oo(str, "$WrapWithPad"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYVQ.zzW0b).zzZ(zzYNK.this.zzVU0, zzv).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "TWOFISHKWP", "TWOFISHWRAPPAD");
        StringBuilder sbOooO0OO5 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.TWOFISH", C21111o0ooOoO.OooO0Oo(str, "$TWOFISHKFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("Twofish", zzYVQ.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNK.3.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 64 || length > 256) {
                            throw new InvalidKeySpecException("Twofish key must be of length 64-256 bits");
                        }
                        return bArr;
                    }
                });
            }
        }), str);
        sbOooO0OO5.append("PBE128TWOFISH");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND256BITTWOFISH-BC", sbOooO0OO5.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNK.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("Twofish", zzZ4K.zzZ.CIPHER, 256);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND256BITTWOFISH-BC", "PBEWITHSHA1AND256BITTWOFISH-BC", "PBEWITHSHA-1AND256BITTWOFISH-BC", "PBEWITHSHAANDTWOFISH");
    }
}
