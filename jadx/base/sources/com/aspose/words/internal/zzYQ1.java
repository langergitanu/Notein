package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1M;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQ1 extends AlgorithmParameterGeneratorSpi {
    private final String zzVWA;
    private final zzYQ8 zzVWk;
    protected SecureRandom zzWk5;
    protected int zzWk4 = 2048;
    private int zzWtn = 0;

    public zzYQ1(zzYQ8 zzyq8, String str) {
        this.zzVWk = zzyq8;
        this.zzVWA = str;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public final AlgorithmParameters engineGenerateParameters() {
        zzZ38 zzz38ZzXFH = (this.zzWk5 != null ? new zzZ1M.zzR(new zzZ1M.zzS(this.zzWk4), this.zzWk5) : new zzZ1M.zzR(new zzZ1M.zzS(this.zzWk4), this.zzVWk.zzXBp())).zzXFH();
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.zzVWA, this.zzVWk);
            algorithmParameters.init(new zzYN4(zzz38ZzXFH.getP(), zzz38ZzXFH.getQ(), zzz38ZzXFH.getG(), zzz38ZzXFH.zzXHB(), this.zzWtn, zzz38ZzXFH.zzXGq()));
            return algorithmParameters;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public final void engineInit(int i, SecureRandom secureRandom) {
        this.zzWk4 = i;
        this.zzWk5 = secureRandom;
        if (zzZ5L.zzXH0() && i < 2048) {
            throw new InvalidParameterException("Attempt to initialize parameter generation of less than 2048 bits in approved mode");
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.zzWk4 = dHGenParameterSpec.getPrimeSize();
            if (zzZ5L.zzXH0() && this.zzWk4 < 2048) {
                throw new InvalidAlgorithmParameterException("Attempt to initialize parameter generation of less than 2048 bits in approved mode");
            }
            this.zzWtn = dHGenParameterSpec.getExponentSize();
            this.zzWk5 = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzVWA, " parameter generator requires a DHGenParameterSpec for initialization"));
    }
}
