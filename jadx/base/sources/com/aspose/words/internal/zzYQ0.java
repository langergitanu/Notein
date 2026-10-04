package com.aspose.words.internal;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYQ0 extends zzYNB {
    protected zzYN4 zzVUy;
    private final String zzVWA;

    public zzYQ0(String str) {
        this.zzVWA = str;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.zzVUy = new zzYN4(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL());
        } else {
            if (!(algorithmParameterSpec instanceof zzYN4)) {
                throw new InvalidParameterSpecException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("DHParameterSpec/DHDomainParameterSpec required to initialize "), this.zzVWA, " AlgorithmParameters"));
            }
            this.zzVUy = (zzYN4) algorithmParameterSpec;
        }
    }

    @Override // com.aspose.words.internal.zzYQK
    public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class) {
            return new DHParameterSpec(this.zzVUy.getP(), this.zzVUy.getG(), this.zzVUy.getL());
        }
        if (cls == zzYN4.class || cls == AlgorithmParameterSpec.class) {
            return this.zzVUy;
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
    }
}
