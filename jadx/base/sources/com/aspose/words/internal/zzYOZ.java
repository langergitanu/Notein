package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYZ4;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYOZ extends zzYND {
    private static final String PREFIX = "com.aspose.words.internal.zzYOZ";
    private zzYZ4.zzV zzVTg;
    private zzYZ4.zzZ zzVTh;
    private zzYZ4.zzT zzVTi;
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYOZ.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(final zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : (zzz4m.zzXGV().equals(zzYZ4.zzW9p.zzXGV()) || zzz4m.zzXGV().equals(zzYZ4.zzW9o.zzXGV())) ? new zzYP7() { // from class: com.aspose.words.internal.zzYOZ.1.1
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                    return algorithmParameterSpec instanceof zzYM9 ? ((zzYZ4.zzR) zzz4m).zzOK(((zzYM9) algorithmParameterSpec).zzXzQ()) : zzz4m;
                }
            } : new zzYPM((zzZ4L) zzz4m);
        }
    };

    public zzYOZ() {
        if (zzZ5L.zzXH0()) {
            return;
        }
        this.zzVTh = new zzYZ4.zzZ();
        this.zzVTg = new zzYZ4.zzV();
        this.zzVTi = new zzYZ4.zzT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzYZ4.zzT zzXB6() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        return this.zzVTi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzYQC zzeU(final int i) {
        return new zzYQC("Camellia", zzYZ4.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYOZ.17
            @Override // com.aspose.words.internal.zzYQC.zzZ
            public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                if (bArr.length * 8 == i) {
                    return bArr;
                }
                throw new InvalidKeySpecException("Provided key data wrong size for Camellia-" + i);
            }
        });
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final Class[] clsArrZzXBb = zzYPQ.zzXBb();
        final Class[] clsArr = {IvParameterSpec.class};
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.CAMELLIA", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("Camellia");
            }
        }));
        zzZDA zzzda = zzZ9M.zzWzb;
        zzZDA zzzda2 = zzZ9M.zzWza;
        zzZDA zzzda3 = zzZ9M.zzWz9;
        zzyq8.zzZ("AlgorithmParameters", "CAMELLIA", zzzda, zzzda2, zzzda3);
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "Camellia", 16);
            }
        }));
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda.getId(), zzzda2, zzzda3);
        zzyq8.zzZ("SecretKeyFactory.CAMELLIA", C21111o0ooOoO.OooO0Oo(str, "$CAMELLIAKFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.19
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("Camellia", zzYZ4.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYOZ.19.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length == 128 || length == 192 || length == 256) {
                            return bArr;
                        }
                        throw new InvalidKeySpecException("Provided key data wrong size for Camellia");
                    }
                });
            }
        }));
        zzYPP zzypp = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.20
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return zzYOZ.this.zzeU(128);
            }
        });
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, "SKF");
        zzZDA zzzda4 = zzZ9M.zzWz8;
        zzYND.zzZ(zzyq8, strOooO0Oo, zzypp, zzzda, zzzda4);
        zzYPP zzypp2 = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.21
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return zzYOZ.this.zzeU(192);
            }
        });
        String strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(str, "SKF");
        zzZDA zzzda5 = zzZ9M.zzWz7;
        zzYND.zzZ(zzyq8, strOooO0Oo2, zzypp2, zzzda2, zzzda5);
        zzYPP zzypp3 = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.22
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return zzYOZ.this.zzeU(256);
            }
        });
        String strOooO0Oo3 = C21111o0ooOoO.OooO0Oo(str, "SKF");
        zzZDA zzzda6 = zzZ9M.zzWz6;
        zzYND.zzZ(zzyq8, strOooO0Oo3, zzypp3, zzzda3, zzzda6);
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.CAMELLIA", C21111o0ooOoO.OooO0Oo(str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.23
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYZ4.zzW9O, zzYZ4.zzW9P, zzYZ4.zzW9N, zzYZ4.zzW9L, zzYZ4.zzW9K, zzYZ4.zzW9M, zzYZ4.zzW9J, zzYZ4.zzW9I, zzYZ4.zzW9H, zzYZ4.zzW9F, zzYZ4.zzW9E, zzYZ4.zzW9G, zzYZ4.zzW9D, zzYZ4.zzW9C, zzYZ4.zzW9B, zzYZ4.zzW9z, zzYZ4.zzW9A, zzYZ4.zzW9x, zzYZ4.zzW9y, zzYZ4.zzW9w, zzYZ4.zzW9v, zzYZ4.zzW9u, zzYZ4.zzW9t, zzYZ4.zzW9s).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzXB6(), zzYOZ.this.zzVTh).zzW(clsArrZzXBb).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$CBC128");
        StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.CAMELLIAKW", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda3, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda2, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.24
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYZ4.zzW9I).zzW(clsArr).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTi, (zzZ5Z) null).zzeZ(128).zzXBD();
            }
        })), str, "$CBC192"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYZ4.zzW9I).zzW(clsArr).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTi, (zzZ5Z) null).zzeZ(192).zzXBD();
            }
        })), str, "$CBC256"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYZ4.zzW9I).zzW(clsArr).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTi, (zzZ5Z) null).zzeZ(256).zzXBD();
            }
        })), str, "$Wrap"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYZ4.zzW9p).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTg).zzU(clsArr).zzXBu();
            }
        }), str);
        sbOooO0OO2.append("$Wrap128");
        zzyq8.zzZ("Cipher", zzzda6, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda5, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda4, sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) throws NoSuchAlgorithmException {
                return new zzYQ9.zzZ(zzyq8, zzYZ4.zzW9p).zzeW(128).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTg).zzU(clsArr).zzXBu();
            }
        })), str, "$Wrap192"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) throws NoSuchAlgorithmException {
                return new zzYQ9.zzZ(zzyq8, zzYZ4.zzW9p).zzeW(192).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTg).zzU(clsArr).zzXBu();
            }
        })), str, "$Wrap256"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) throws NoSuchAlgorithmException {
                return new zzYQ9.zzZ(zzyq8, zzYZ4.zzW9p).zzeW(256).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTg).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "CAMELLIAKW", "CAMELLIAWRAP");
        zzyq8.zzZ("Cipher.CAMELLIAKWP", C21111o0ooOoO.OooO0Oo(str, "$WrapWithPad"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYZ4.zzW9o).zzZ(zzYOZ.this.zzVU0, zzYOZ.this.zzVTg).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "CAMELLIAKWP", "CAMELLIAWRAPPAD");
        zzyq8.zzZ("KeyGenerator.CAMELLIA", C21111o0ooOoO.OooO0Oo(str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Camellia", 128, false, new zzYPL() { // from class: com.aspose.words.internal.zzYOZ.9.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ4.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzYND.zzY(zzyq8, str, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Camellia", 128, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOZ.10.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ4.zzW(128, secureRandom);
                    }
                });
            }
        }), zzzda, zzzda4);
        zzYND.zzY(zzyq8, str, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Camellia", 192, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOZ.11.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ4.zzW(192, secureRandom);
                    }
                });
            }
        }), zzzda2, zzzda5);
        zzYND.zzY(zzyq8, str, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Camellia", 256, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOZ.13.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ4.zzW(256, secureRandom);
                    }
                });
            }
        }), zzzda3, zzzda6);
        zzyq8.zzZ("Mac.CAMELLIAGMAC", C21111o0ooOoO.OooO0Oo(str, "$GMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYZ4.zzY zzy = zzYZ4.zzW9q;
                return new zzYQE(zzy, new zzYZ4.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "CAMELLIAGMAC", "CAMELLIA-GMAC");
        zzyq8.zzZ("Mac.CAMELLIACMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYZ4.zzY zzy = zzYZ4.zzW9r;
                return new zzYQE(zzy, new zzYZ4.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "CAMELLIACMAC", "CAMELLIA-CMAC");
        zzyq8.zzZ("Mac.CAMELLIACCMMAC", C21111o0ooOoO.OooO0Oo(str, "$CAEMLLIACCMMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOZ.16
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYZ4.zzY zzy = zzYZ4.zzW9u;
                return new zzYQE(zzy, new zzYZ4.zzU(), new zzYQN(zzy.zzg1(128)));
            }
        }));
        zzyq8.zzZ("Mac", "CAMELLIACCMMAC", "CAMELLIA-CCMMAC");
    }
}
