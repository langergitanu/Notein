package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYVU;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNM extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYNM";

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("Mac.SIPHASH-2-4", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Mac24"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNM.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYVU.zzW16, new zzYVU.zzX(), new zzYPG() { // from class: com.aspose.words.internal.zzYNM.1.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return new zzYVU.zzZ(zzYVU.zzW16);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return new zzYVU.zzZ(zzYVU.zzW16);
                    }
                });
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Mac.SIPHASH-4-8", str + "$Mac48", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNM.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQE(zzYVU.zzW15, new zzYVU.zzX(), new zzYPG() { // from class: com.aspose.words.internal.zzYNM.2.1
                    @Override // com.aspose.words.internal.zzYPG
                    public final zzZ5Q zzXBE() {
                        return new zzYVU.zzZ(zzYVU.zzW15);
                    }

                    @Override // com.aspose.words.internal.zzYPG
                    /* JADX INFO: renamed from: zzZ */
                    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        return new zzYVU.zzZ(zzYVU.zzW15);
                    }
                });
            }
        }), str);
        sbOooO0OO.append("$SIPHASHKFACT");
        zzyq8.zzZ("SecretKeyFactory.SIPHASH", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNM.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("SipHash", zzYVU.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNM.3.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        if (bArr.length * 8 == 128) {
                            return bArr;
                        }
                        throw new InvalidKeySpecException("SipHash key must be of length 128 bits");
                    }
                });
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "SIPHASH", "SIPHASH-2-4", "SIPHASH-4-8");
        zzyq8.zzZ("KeyGenerator.SIPHASH", C21111o0ooOoO.OooO0Oo(str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNM.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "SipHash", 128, true, new zzYPL() { // from class: com.aspose.words.internal.zzYNM.4.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYVU.zzY(zzYVU.zzWb4, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "SIPHASH", "SIPHASH-2-4", "SIPHASH-4-8");
    }
}
