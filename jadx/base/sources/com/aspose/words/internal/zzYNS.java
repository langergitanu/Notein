package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYW4;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYNS extends zzYND {
    private static final String PREFIX = "com.aspose.words.internal.zzYNS";
    private zzYW4.zzV zzVQl;
    private zzYW4.zzZ zzVQm;
    private zzYW4.zzT zzVQn;
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYNS.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(final zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : (zzz4m.zzXGV().equals(zzYW4.zzW2S.zzXGV()) || zzz4m.zzXGV().equals(zzYW4.zzW2R.zzXGV())) ? new zzYP7() { // from class: com.aspose.words.internal.zzYNS.1.1
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                    return algorithmParameterSpec instanceof zzYM9 ? ((zzYW4.zzR) zzz4m).zzOJ(((zzYM9) algorithmParameterSpec).zzXzQ()) : zzz4m;
                }
            } : new zzYPM((zzZ4L) zzz4m);
        }
    };

    public static class zzZ extends zzYPN {
        @Override // com.aspose.words.internal.zzYPN, java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "SEED IV";
        }
    }

    public zzYNS() {
        if (zzZ5L.zzXH0()) {
            return;
        }
        this.zzVQm = new zzYW4.zzZ();
        this.zzVQl = new zzYW4.zzV();
        this.zzVQn = new zzYW4.zzT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzYW4.zzT zzXAl() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        return this.zzVQn;
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final Class[] clsArrZzXBb = zzYPQ.zzXBb();
        final Class[] clsArr = {IvParameterSpec.class};
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.SEED", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzZDA zzzda = zzZ9X.zzWBz;
        zzyq8.zzZ("AlgorithmParameters", "SEED", zzzda);
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.SEED", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "SEED", 16);
            }
        })), str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYW4.zzW3g, zzYW4.zzW3h, zzYW4.zzW3f, zzYW4.zzW3d, zzYW4.zzW3c, zzYW4.zzW3e, zzYW4.zzW3b, zzYW4.zzW3a, zzYW4.zzW39, zzYW4.zzW37, zzYW4.zzW36, zzYW4.zzW38, zzYW4.zzW35, zzYW4.zzW34, zzYW4.zzW33, zzYW4.zzW32, zzYW4.zzW31, zzYW4.zzW30, zzYW4.zzW2Z, zzYW4.zzW2Y, zzYW4.zzW2X, zzYW4.zzW2W, zzYW4.zzW2V).zzZ(zzYNS.this.zzVU0, zzYNS.this.zzXAl(), zzYNS.this.zzVQm).zzW(clsArrZzXBb).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$CBC");
        zzyq8.zzZ("Cipher.SEEDWRAP", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzYW4.zzW3a).zzW(clsArr).zzZ(zzYNS.this.zzVU0, zzYNS.this.zzXAl(), (zzZ5Z) null).zzXBD();
            }
        })), str, "$Wrap"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYW4.zzW2S).zzZ(zzYNS.this.zzVU0, zzYNS.this.zzVQl).zzU(clsArr).zzXBu();
            }
        }));
        zzZDA zzzda2 = zzZ9X.zzWBw;
        zzyq8.zzZ("Cipher", "SEEDWRAP", zzzda2);
        zzyq8.zzXp("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
        zzyq8.zzZ("Cipher.SEEDKWP", str + "$WrapWithPad", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYW4.zzW2R).zzZ(zzYNS.this.zzVU0, zzYNS.this.zzVQl).zzU(clsArr).zzXBu();
            }
        }));
        zzyq8.zzXp("Alg.Alias.Cipher.SEEDWRAPPAD", "SEEDKWP");
        zzyq8.zzZ("KeyGenerator.SEED", str + "$KeyGen", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "SEED", 128, true, new zzYPL() { // from class: com.aspose.words.internal.zzYNS.11.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYW4.zzW(secureRandom);
                    }
                });
            }
        }));
        zzZDA zzzda3 = zzZ9X.zzWBy;
        zzyq8.zzZ("KeyGenerator", "SEED", zzzda, zzzda2, zzzda3);
        zzyq8.zzZ("Mac.SEEDGMAC", C21111o0ooOoO.OooO0Oo(str, "$GMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYW4.zzY zzy = zzYW4.zzW2T;
                return new zzYQE(zzy, new zzYW4.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "SEEDGMAC", "SEED-GMAC");
        zzyq8.zzZ("Mac.SEEDCMAC", C21111o0ooOoO.OooO0Oo(str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYW4.zzY zzy = zzYW4.zzW2U;
                return new zzYQE(zzy, new zzYW4.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "SEEDCMAC", "SEED-CMAC");
        zzyq8.zzZ("Mac.SEEDCCMMAC", C21111o0ooOoO.OooO0Oo(str, "$SEEDCCMMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYW4.zzY zzy = zzYW4.zzW2X;
                return new zzYQE(zzy, new zzYW4.zzU(), new zzYQN(zzy.zzg1(128)));
            }
        }));
        zzyq8.zzZ("Mac", "SEEDCCMMAC", "SEED-CCMMAC");
        zzyq8.zzZ("SecretKeyFactory.SEED", C21111o0ooOoO.OooO0Oo(str, "$SEEDKFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNS.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("SEED", zzYW4.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNS.4.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        if (bArr.length * 8 == 128) {
                            return bArr;
                        }
                        throw new InvalidKeySpecException("Provided key data wrong size for SEED");
                    }
                });
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "SEED", zzzda, zzzda3);
    }
}
