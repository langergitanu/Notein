package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYW2;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes5.dex */
class zzYNR extends zzYND {
    private static final String PREFIX = "com.aspose.words.internal.zzYNR";
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYNR.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final Class[] clsArrZzXBb = zzYPQ.zzXBb();
        final zzYW2.zzU zzu = new zzYW2.zzU();
        final zzYW2.zzZ zzz = new zzYW2.zzZ();
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("Cipher.SHACAL-2", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNR.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 256, zzYW2.zzW2H, zzYW2.zzW2I, zzYW2.zzW2G, zzYW2.zzW2E, zzYW2.zzW2D, zzYW2.zzW2F, zzYW2.zzW2C, zzYW2.zzW2B, zzYW2.zzW2A, zzYW2.zzW2y, zzYW2.zzW2x, zzYW2.zzW2z, zzYW2.zzW2w, zzYW2.zzW2v, zzYW2.zzW2u, zzYW2.zzW2s, zzYW2.zzW2t, zzYW2.zzW2r, zzYW2.zzW2q, zzYW2.zzW2p).zzZ(zzYNR.this.zzVU0, zzu, zzz).zzW(clsArrZzXBb).zzXBD();
            }
        }));
        zzyq8.zzZ("Cipher", "SHACAL-2", "SHACAL2");
        zzyq8.zzZ("KeyGenerator.SHACAL-2", C21111o0ooOoO.OooO0Oo(str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNR.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "SHACAL-2", 128, false, new zzYPL() { // from class: com.aspose.words.internal.zzYNR.3.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYW2.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "SHACAL-2", "SHACAL2");
        zzyq8.zzZ("AlgorithmParameters.SHACAL-2", C21111o0ooOoO.OooO0Oo(str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNR.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("SHACAL-2");
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "SHACAL-2", "SHACAL2");
        zzyq8.zzZ("Mac.SHACAL-2CMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNR.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYW2.zzY zzy = zzYW2.zzW2o;
                return new zzYQE(zzy, new zzYW2.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "SHACAL-2CMAC", "SHACAL-2-CMAC");
        zzyq8.zzZ("SecretKeyFactory.SHACAL-2", C21111o0ooOoO.OooO0Oo(str, "$SHACAL2KFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNR.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("SHACAL-2", zzYW2.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNR.6.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length == 0 || length > 512 || length < 128 || length % 64 != 0) {
                            throw new InvalidKeySpecException("SHACAL-2 key must be 128 - 512 bits and a multiple of 64");
                        }
                        return bArr;
                    }
                });
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "SHACAL-2", "SHACAL2");
    }
}
