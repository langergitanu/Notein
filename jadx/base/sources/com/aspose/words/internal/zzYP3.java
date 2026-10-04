package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYO1;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYZA;
import com.aspose.words.internal.zzZ4K;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYP3 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYP3";
    private zzYP7 zzVWq = new zzYP7() { // from class: com.aspose.words.internal.zzYP3.1
        @Override // com.aspose.words.internal.zzYP7
        public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            return zzYZA.zzWb3;
        }
    };
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYP3.2
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYP3.this.zzVWq;
        }
    };

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("Cipher.ARC4", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Base"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 0, zzYZA.zzWb3).zzW(new Class[0]).zzZ(zzYP3.this.zzVU0, new zzYZA.zzX(), (zzZ5Z) null).zzXBD();
            }
        }));
        zzZDA zzzda = zzZ96.zzWy8;
        zzyq8.zzZ("Cipher", "ARC4", zzzda);
        zzyq8.zzXp("Alg.Alias.Cipher.ARCFOUR", "ARC4");
        zzyq8.zzXp("Alg.Alias.Cipher.RC4", "ARC4");
        zzyq8.zzZ("KeyGenerator.ARC4", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "RC4", 128, new zzYPL() { // from class: com.aspose.words.internal.zzYP3.4.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZA.zzY(i, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyGenerator.RC4", "ARC4");
        zzyq8.zzZ("KeyGenerator", "ARC4", zzzda);
        zzyq8.zzZ("Cipher.PBEWITHSHAAND40BITRC4", C21111o0ooOoO.OooO0Oo(str, "$PBEWithSHAAnd40BitKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 0, zzYZA.zzWb3).zzeZ(40).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYP3.this.zzVU0, new zzYZA.zzX(), (zzZ5Z) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
            }
        }));
        zzZDA zzzda2 = zzZ96.zzWwA;
        zzyq8.zzZ("Cipher", "PBEWITHSHAAND40BITRC4", zzzda2);
        zzyq8.zzZ("Cipher.PBEWITHSHAAND128BITRC4", C21111o0ooOoO.OooO0Oo(str, "$PBEWithSHAAnd128BitKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 0, zzYZA.zzWb3).zzeZ(128).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYP3.this.zzVU0, new zzYZA.zzX(), (zzZ5Z) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
            }
        }));
        zzZDA zzzda3 = zzZ96.zzWwB;
        zzyq8.zzZ("Cipher", "PBEWITHSHAAND128BITRC4", zzzda3);
        zzyq8.zzZ("SecretKeyFactory.ARC4", C21111o0ooOoO.OooO0Oo(str, "$ARC4KFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("RC4", zzYZA.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYP3.7.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 8 || length > 1024) {
                            throw new InvalidKeySpecException("Provided key data wrong size for ARC4");
                        }
                        return bArr;
                    }
                });
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "ARC4", "RC4");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND128BITRC4", C21111o0ooOoO.OooO0Oo(str, "PBE128RC4"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("RC4", zzZ4K.zzZ.CIPHER, 128);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND128BITRC4", "PBEWITHSHA1AND128BITRC4", "PBEWITHSHA-1AND128BITRC4");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND40BITRC4", C21111o0ooOoO.OooO0Oo(str, "PBE40RC4"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP3.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("RC4", zzZ4K.zzZ.CIPHER, 40);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND40BITRC4", "PBEWITHSHA1AND40BITRC4", "PBEWITHSHA-1AND40BITRC4");
        zzyq8.zzZ("AlgorithmParameters", "PBKDF-PKCS12", zzzda2, zzzda3);
    }
}
