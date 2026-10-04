package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNJ extends zzYQP {
    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyFactory.X.509", "org.bouncycastle.jcajce.provider.asymmetric.x509.KeyFactory", new zzYPS() { // from class: com.aspose.words.internal.zzYNJ.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYN7(zzyq8);
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyFactory.X509", "X.509");
        zzyq8.zzZ("CertificateFactory.X.509", "org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory", new zzYPS() { // from class: com.aspose.words.internal.zzYNJ.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ4(zzyq8);
            }
        });
        zzyq8.zzXp("Alg.Alias.CertificateFactory.X509", "X.509");
    }
}
