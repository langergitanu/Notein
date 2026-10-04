package com.aspose.words.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertStoreParameters;

/* JADX INFO: loaded from: classes5.dex */
final class zzYO0 extends zzYQP {
    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYO0.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYP9(zzyq8);
            }
        });
        zzyq8.zzZ("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYO0.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPA(zzyq8);
            }
        });
        zzyq8.zzZ("CertStore.COLLECTION", "org.bouncycastle.jce.provider.CertStoreCollectionSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYO0.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) throws NoSuchAlgorithmException {
                try {
                    return new zzYQ5((CertStoreParameters) obj);
                } catch (InvalidAlgorithmParameterException e) {
                    throw new NoSuchAlgorithmException("Unable to construct CertStore implementation: " + e.getMessage(), e);
                }
            }
        });
    }
}
