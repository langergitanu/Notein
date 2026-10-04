package com.aspose.words.internal;

import java.security.SecureRandom;
import java.security.SecureRandomSpi;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNT extends zzYQP {
    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] zzXBl() {
        return zzYGU.zzV(zzYGI.zzwb("NonceAndIV"), zzYGN.zzWW(Thread.currentThread().getId()), zzYGN.zzWW(System.currentTimeMillis()));
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("SecureRandom.DEFAULT", "org.bouncycastle.jcajce.provider.random.DefSecureRandom", new zzYPS() { // from class: com.aspose.words.internal.zzYNT.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                final SecureRandom secureRandomZzXBp = zzyq8.zzXBp();
                return new SecureRandomSpi() { // from class: com.aspose.words.internal.zzYNT.1.1
                    @Override // java.security.SecureRandomSpi
                    public final byte[] engineGenerateSeed(int i) {
                        return secureRandomZzXBp.generateSeed(i);
                    }

                    @Override // java.security.SecureRandomSpi
                    public final void engineNextBytes(byte[] bArr) {
                        secureRandomZzXBp.nextBytes(bArr);
                    }

                    @Override // java.security.SecureRandomSpi
                    public final void engineSetSeed(byte[] bArr) {
                        secureRandomZzXBp.setSeed(bArr);
                    }
                };
            }
        });
        zzyq8.zzZ("SecureRandom.NONCEANDIV", "org.bouncycastle.jcajce.provider.random.NonceAndIVSecureRandom", new zzYPS() { // from class: com.aspose.words.internal.zzYNT.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                SecureRandom secureRandomZzXBo = zzyq8.zzXBo();
                final zzZ0O zzz0oZzZ = zzyq8.zzXBq().zzZ(secureRandomZzXBo, true).zzX3(zzYNT.zzXBl()).zzZ(secureRandomZzXBo.generateSeed((zzyq8.zzXBr() / 16) + 1), false, zzYGI.zzwb("Bouncy Castle FIPS Provider Nonce/IV"));
                return new SecureRandomSpi() { // from class: com.aspose.words.internal.zzYNT.2.1
                    @Override // java.security.SecureRandomSpi
                    public final byte[] engineGenerateSeed(int i) {
                        return zzz0oZzZ.generateSeed(i);
                    }

                    @Override // java.security.SecureRandomSpi
                    public final void engineNextBytes(byte[] bArr) {
                        zzz0oZzZ.nextBytes(bArr);
                    }

                    @Override // java.security.SecureRandomSpi
                    public final void engineSetSeed(byte[] bArr) {
                        zzz0oZzZ.setSeed(bArr);
                    }
                };
            }
        });
    }
}
