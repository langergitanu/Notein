package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYZ8;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYP1 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYP1";
    private Class[] zzVVU = {IvParameterSpec.class};
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYP1.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("Cipher.BLOWFISH", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYZ8.zzWaV, zzYZ8.zzWaW, zzYZ8.zzWaU, zzYZ8.zzWaS, zzYZ8.zzWaR, zzYZ8.zzWaT, zzYZ8.zzWaQ, zzYZ8.zzWaP, zzYZ8.zzWaO, zzYZ8.zzWaM, zzYZ8.zzWaL, zzYZ8.zzWaN, zzYZ8.zzWaK, zzYZ8.zzWaJ, zzYZ8.zzWaI, zzYZ8.zzWaG, zzYZ8.zzWaH, zzYZ8.zzWaF, zzYZ8.zzWaC, zzYZ8.zzWaE, zzYZ8.zzWaD).zzZ(zzYP1.this.zzVU0, new zzYZ8.zzU(), new zzYZ8.zzZ()).zzW(zzYP1.this.zzVVU).zzXBD();
            }
        }));
        zzZDA zzzda = zzZ9U.zzWB4;
        zzyq8.zzZ("KeyGenerator.BLOWFISH", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, C21111o0ooOoO.OooO0Oo(str, "$CBC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYZ8.zzWaP).zzZ(zzYP1.this.zzVU0, new zzYZ8.zzU(), (zzZ5Z) null).zzW(zzYP1.this.zzVVU).zzXBD();
            }
        })), str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "Blowfish", 128, new zzYPL() { // from class: com.aspose.words.internal.zzYP1.4.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ8.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "BLOWFISH", zzzda);
        zzyq8.zzZ("Mac.BLOWFISHCMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYZ8.zzY zzy = zzYZ8.zzWaB;
                return new zzYQE(zzy, new zzYZ8.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "BLOWFISHCMAC", "BLOWFISH-CMAC");
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.BLOWFISH", C21111o0ooOoO.OooO0Oo(str, "$BLOWFISHKFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("Blowfish", zzYZ8.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYP1.6.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 32 || length > 448) {
                            throw new InvalidKeySpecException("Blowfish key must be between 32 and 448 bits inclusive");
                        }
                        return bArr;
                    }
                });
            }
        }), str);
        sbOooO0OO.append("$AlgParams");
        zzyq8.zzZ("AlgorithmParameters.BLOWFISH", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("Blowfish");
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "BLOWFISH", zzzda);
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP1.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "Blowfish", 8);
            }
        }));
    }
}
