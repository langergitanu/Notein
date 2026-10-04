package com.aspose.words.internal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPO extends zzYQL {
    private final int zzVUs;
    private final String zzVWA;

    public zzYPO(zzYQ8 zzyq8, String str, int i) {
        super(zzyq8, 0);
        this.zzVWA = str;
        this.zzVUs = i;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public final AlgorithmParameters engineGenerateParameters() {
        byte[] bArr = new byte[this.zzVUs];
        this.zzWk5.nextBytes(bArr);
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.zzVWA, this.zzVWk);
            algorithmParameters.init(new IvParameterSpec(bArr));
            return algorithmParameters;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("No supported AlgorithmParameterSpec for "), this.zzVWA, " parameter generation"));
    }
}
