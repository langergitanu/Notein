package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYWL;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNZ extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYNZ";

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("KeyGenerator.POLY1305", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "POLY1305", 256, true, new zzYPL() { // from class: com.aspose.words.internal.zzYNZ.1.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYWL.zzY(secureRandom);
                    }
                });
            }
        }));
        zzZ(zzyq8, AES256KeyLoader.AES_ALGORITHM);
        zzZ(zzyq8, "CAMELLIA");
        zzZ(zzyq8, "SEED");
        zzZ(zzyq8, "SERPENT");
        zzZ(zzyq8, "TWOFISH");
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Mac.POLY1305", C21111o0ooOoO.OooO0Oo(str, "POLY1305"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWL.zzZ zzz = zzYWL.zzW4N;
                return new zzYQE(zzz, new zzYWL.zzX(), new zzYQN(zzz));
            }
        }), str);
        sbOooO0OO.append("POLY1305-AES");
        zzyq8.zzZ("Mac.POLY1305-AES", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWL.zzZ zzz = zzYWL.zzW4M;
                return new zzYQE(zzz, new zzYWL.zzX(), new zzYQN(zzz));
            }
        }));
        zzyq8.zzZ("Mac", "POLY1305-AES", "POLY1305AES");
        zzyq8.zzZ("Mac.POLY1305-CAMELLIA", C21111o0ooOoO.OooO0Oo(str, "POLY1305-CAMELLIA"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWL.zzZ zzz = zzYWL.zzW4L;
                return new zzYQE(zzz, new zzYWL.zzX(), new zzYQN(zzz));
            }
        }));
        zzyq8.zzZ("Mac", "POLY1305-CAMELLIA", "POLY1305CAMELLIA");
        zzyq8.zzZ("Mac.POLY1305-SEED", C21111o0ooOoO.OooO0Oo(str, "POLY1305-SEED"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWL.zzZ zzz = zzYWL.zzW4K;
                return new zzYQE(zzz, new zzYWL.zzX(), new zzYQN(zzz));
            }
        }));
        zzyq8.zzZ("Mac", "POLY1305-SEED", "POLY1305SEED");
        zzyq8.zzZ("Mac.POLY1305-SERPENT", C21111o0ooOoO.OooO0Oo(str, "POLY1305-SERPENT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWL.zzZ zzz = zzYWL.zzW4J;
                return new zzYQE(zzz, new zzYWL.zzX(), new zzYQN(zzz));
            }
        }));
        zzyq8.zzZ("Mac", "POLY1305-SERPENT", "POLY1305SERPENT");
        zzyq8.zzZ("Mac.POLY1305-TWOFISH", C21111o0ooOoO.OooO0Oo(str, "POLY1305-TWOFISH"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNZ.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWL.zzZ zzz = zzYWL.zzW4I;
                return new zzYQE(zzz, new zzYWL.zzX(), new zzYQN(zzz));
            }
        }));
        zzyq8.zzZ("Mac", "POLY1305-TWOFISH", "POLY1305TWOFISH");
    }

    private static void zzZ(zzYQ8 zzyq8, String str) {
        zzyq8.zzZ("KeyGenerator", "POLY1305", com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("POLY1305-", str), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("POLY1305", str));
    }
}
