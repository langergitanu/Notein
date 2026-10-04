package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYZ2;
import java.security.SecureRandom;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOY extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYOY";
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYOY.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return new zzYPM((zzZ4L) zzz4m);
        }
    };

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("KeyGenerator.CHACHA20", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOY.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "ChaCha20", 256, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOY.2.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ2.zzY(secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "CHACHA20", "CHACHA7539");
        zzyq8.zzZ("AlgorithmParameters.CHACHA20", C21111o0ooOoO.OooO0Oo(str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOY.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("ChaCha20");
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "CHACHA20", "CHACHA7539");
        zzyq8.zzZ("AlgorithmParameterGenerator.CHACHA20", C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOY.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "ChaCha20", 12);
            }
        }));
        zzyq8.zzZ("AlgorithmParameterGenerator", "CHACHA20", "CHACHA7539");
        final Class[] clsArr = {IvParameterSpec.class};
        zzyq8.zzZ("Cipher.CHACHA20", C21111o0ooOoO.OooO0Oo(str, "$Base"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOY.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 96, zzYZ2.zzW9a).zzW(clsArr).zzZ(zzYOY.this.zzVU0, new zzYZ2.zzX(), (zzZ5Z) null).zzXBD();
            }
        }));
        zzyq8.zzZ("Cipher", "CHACHA20", "CHACHA7539");
    }
}
