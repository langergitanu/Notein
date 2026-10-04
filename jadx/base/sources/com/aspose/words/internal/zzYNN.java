package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYVY;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYNN extends zzYND {
    private static final String PREFIX = "com.aspose.words.internal.zzYNN";
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYNN.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(final zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : (zzz4m.zzXGV().equals(zzYVY.zzW1d.zzXGV()) || zzz4m.zzXGV().equals(zzYVY.zzW1c.zzXGV())) ? new zzYP7() { // from class: com.aspose.words.internal.zzYNN.1.1
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                    return algorithmParameterSpec instanceof zzYM9 ? ((zzYVY.zzR) zzz4m).zzOI(((zzYM9) algorithmParameterSpec).zzXzQ()) : zzz4m;
                }
            } : new zzYPM((zzZ4L) zzz4m);
        }
    };

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final zzYVY.zzT zzt = new zzYVY.zzT();
        final zzYVY.zzZ zzz = new zzYVY.zzZ();
        final zzYVY.zzV zzv = new zzYVY.zzV();
        final Class[] clsArrZzXBb = zzYPQ.zzXBb();
        final Class[] clsArr = {IvParameterSpec.class};
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.SERPENT", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1B, zzYVY.zzW1C, zzYVY.zzW1A, zzYVY.zzW1y, zzYVY.zzW1x, zzYVY.zzW1z, zzYVY.zzW1w, zzYVY.zzW1v, zzYVY.zzW1u, zzYVY.zzW1s, zzYVY.zzW1r, zzYVY.zzW1t, zzYVY.zzW1q, zzYVY.zzW1p, zzYVY.zzW1o, zzYVY.zzW1m, zzYVY.zzW1n, zzYVY.zzW1l, zzYVY.zzW1k, zzYVY.zzW1j, zzYVY.zzW1i, zzYVY.zzW1h, zzYVY.zzW1g).zzZ(zzYNN.this.zzVU0, zzt, zzz).zzW(clsArrZzXBb).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$KeyGen");
        zzyq8.zzZ("KeyGenerator.SERPENT", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.20
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Serpent", 128, false, new zzYPL() { // from class: com.aspose.words.internal.zzYNN.20.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYVY.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "SERPENT", zzZA1.zzWCz);
        zzYPP zzypp = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.21
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Serpent", 128, true, new zzYPL() { // from class: com.aspose.words.internal.zzYNN.21.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYVY.zzW(128, secureRandom);
                    }
                });
            }
        });
        zzZDA zzzda = zzZA1.zzWCx;
        zzZDA zzzda2 = zzZA1.zzWCv;
        zzZDA zzzda3 = zzZA1.zzWCy;
        zzZDA zzzda4 = zzZA1.zzWCw;
        zzYND.zzY(zzyq8, str, zzypp, zzzda, zzzda2, zzzda3, zzzda4);
        zzYPP zzypp2 = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.22
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Serpent", 192, true, new zzYPL() { // from class: com.aspose.words.internal.zzYNN.22.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYVY.zzW(192, secureRandom);
                    }
                });
            }
        });
        zzZDA zzzda5 = zzZA1.zzWCt;
        zzZDA zzzda6 = zzZA1.zzWCr;
        zzZDA zzzda7 = zzZA1.zzWCu;
        zzZDA zzzda8 = zzZA1.zzWCs;
        zzYND.zzY(zzyq8, str, zzypp2, zzzda5, zzzda6, zzzda7, zzzda8);
        zzYPP zzypp3 = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.23
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Serpent", 256, true, new zzYPL() { // from class: com.aspose.words.internal.zzYNN.23.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYVY.zzW(256, secureRandom);
                    }
                });
            }
        });
        zzZDA zzzda9 = zzZA1.zzWCp;
        zzZDA zzzda10 = zzZA1.zzWCn;
        zzZDA zzzda11 = zzZA1.zzWCq;
        zzZDA zzzda12 = zzZA1.zzWCo;
        zzYND.zzY(zzyq8, str, zzypp3, zzzda9, zzzda10, zzzda11, zzzda12);
        zzyq8.zzZ("AlgorithmParameters.SERPENT", C21111o0ooOoO.OooO0Oo(str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.24
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("Serpent");
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "SERPENT", zzzda, zzzda5, zzzda9, zzzda2, zzzda6, zzzda10, zzzda4, zzzda8, zzzda12);
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.25
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "Serpent", 16);
            }
        }));
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda.getId(), zzzda5, zzzda9, zzzda2, zzzda6, zzzda10, zzzda4, zzzda8, zzzda12);
        zzyq8.zzZ("Mac.SERPENTGMAC", C21111o0ooOoO.OooO0Oo(str, "$GMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.26
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVY.zzY zzy = zzYVY.zzW1e;
                return new zzYQE(zzy, new zzYVY.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "SERPENTGMAC", "SERPENT-GMAC");
        zzyq8.zzZ("Mac.SERPENTCMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVY.zzY zzy = zzYVY.zzW1f;
                return new zzYQE(zzy, new zzYVY.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "SERPENTCMAC", "SERPENT-CMAC");
        zzyq8.zzZ("Mac.SERPENTCCMMAC", C21111o0ooOoO.OooO0Oo(str, "$SERPENTCCMMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYVY.zzY zzy = zzYVY.zzW1i;
                return new zzYQE(zzy, new zzYVY.zzU(), new zzYQN(zzy.zzg1(128)));
            }
        }));
        zzyq8.zzZ("Mac", "SERPENTCCMMAC", "SERPENT-CCMMAC");
        zzyq8.zzZ("Cipher.SERPENTKW", C21111o0ooOoO.OooO0Oo(str, "$Wrap"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYVY.zzW1d).zzZ(zzYNN.this.zzVU0, zzv).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "SERPENTKW", "SERPENTWRAP");
        zzyq8.zzZ("Cipher.SERPENTKWP", C21111o0ooOoO.OooO0Oo(str, "$WrapWithPad"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYVY.zzW1c).zzZ(zzYNN.this.zzVU0, zzv).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "SERPENTKWP", "SERPENTWRAPPAD");
        StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.SERPENT", C21111o0ooOoO.OooO0Oo(str, "$SERPENTKFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("Serpent", zzYVY.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNN.6.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 32 || length % 32 != 0 || length > 256) {
                            throw new InvalidKeySpecException("Serpent key must be a multiple of 32 bits");
                        }
                        return bArr;
                    }
                });
            }
        }), str);
        sbOooO0OO2.append("ECB128");
        zzyq8.zzZ("Cipher", zzzda12, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda8, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda4, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda10, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda6, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda2, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda9, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda5, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda11, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda7, androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda3, sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1B).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(128).zzXBD();
            }
        })), str, "ECB192"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1B).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(192).zzXBD();
            }
        })), str, "ECB256"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1B).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(256).zzXBD();
            }
        })), str, "CBC128"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1v).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(128).zzXBD();
            }
        })), str, "CBC192"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1v).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(192).zzXBD();
            }
        })), str, "CBC256"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1v).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(256).zzXBD();
            }
        })), str, "CFB128"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1m).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(128).zzXBD();
            }
        })), str, "CFB192"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1m).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(192).zzXBD();
            }
        })), str, "CFB256"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.16
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1m).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(256).zzXBD();
            }
        })), str, "OFB128"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.17
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1l).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(128).zzXBD();
            }
        })), str, "OFB192"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1l).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(192).zzXBD();
            }
        })), str, "OFB256"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNN.19
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYVY.zzW1l).zzW(clsArr).zzZ(zzYNN.this.zzVU0, zzt, (zzZ5Z) null).zzeZ(256).zzXBD();
            }
        }));
    }
}
