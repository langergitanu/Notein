package com.aspose.words.internal;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYH7 {

    /* JADX INFO: renamed from: dL */
    private zzYH5 f50870dL = new zzYH5(new zzYM7());

    /* JADX INFO: renamed from: dM */
    private String f50871dM;

    /* JADX INFO: renamed from: dN */
    private AlgorithmParameterSpec f50872dN;
    private SecureRandom zzWk5;
    private zzZ86 zzWqU;

    public zzYH7(String str) {
        this.f50871dM = str;
        new zzYHI();
        this.zzWqU = zzYHI.zzwe(str);
        this.f50872dN = null;
    }

    public final zzYHL zzW(PrivateKey privateKey) throws zzYHB {
        try {
            Signature signatureZzK = this.f50870dL.zzK(this.zzWqU);
            zzZ86 zzz86 = this.zzWqU;
            SecureRandom secureRandom = this.zzWk5;
            if (secureRandom != null) {
                signatureZzK.initSign(privateKey, secureRandom);
            } else {
                signatureZzK.initSign(privateKey);
            }
            return new zzYHL(signatureZzK, zzz86) { // from class: com.aspose.words.internal.zzYH7.1

                /* JADX INFO: renamed from: dO */
                private OutputStream f50873dO;

                /* JADX INFO: renamed from: dP */
                final /* synthetic */ Signature f50874dP;

                /* JADX INFO: renamed from: dQ */
                final /* synthetic */ zzZ86 f50875dQ;

                {
                    this.f50874dP = signatureZzK;
                    this.f50875dQ = zzz86;
                    this.f50873dO = zzYH4.zzZ(signatureZzK);
                }

                @Override // com.aspose.words.internal.zzYHL
                public final OutputStream getOutputStream() {
                    return this.f50873dO;
                }

                @Override // com.aspose.words.internal.zzYHL
                public final byte[] getSignature() {
                    try {
                        return this.f50874dP.sign();
                    } catch (SignatureException e) {
                        throw new zzYH8("exception obtaining signature: " + e.getMessage(), e);
                    }
                }

                @Override // com.aspose.words.internal.zzYHL
                public final zzZ86 zzXyu() {
                    return this.f50875dQ;
                }
            };
        } catch (GeneralSecurityException e) {
            throw new zzYHB("cannot create signer: " + e.getMessage(), e);
        }
    }
}
