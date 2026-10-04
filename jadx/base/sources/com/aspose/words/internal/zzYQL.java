package com.aspose.words.internal;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYQL extends AlgorithmParameterGeneratorSpi {
    protected final zzYQ8 zzVWk;
    protected int zzWk4;
    protected SecureRandom zzWk5;

    public zzYQL(zzYQ8 zzyq8, int i) {
        this.zzVWk = zzyq8;
        this.zzWk4 = i;
        this.zzWk5 = zzyq8.zzXBp();
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.zzWk4 = i;
        this.zzWk5 = secureRandom;
    }
}
