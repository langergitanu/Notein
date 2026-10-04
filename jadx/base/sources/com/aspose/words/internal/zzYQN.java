package com.aspose.words.internal;

import com.aspose.words.internal.zzZ5P;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQN<T extends zzZ5P> implements zzYP7, zzYPG {
    private final zzZ5P<zzZ5P> zzVWx;

    public zzYQN(zzZ5P zzz5p) {
        this.zzVWx = zzz5p;
    }

    @Override // com.aspose.words.internal.zzYPG
    public final zzZ5Q zzXBE() {
        return this.zzVWx;
    }

    @Override // com.aspose.words.internal.zzYP7
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof zzYN5) {
            zzYN5 zzyn5 = (zzYN5) algorithmParameterSpec;
            return (zzZ5Q) this.zzVWx.zzXg(zzyn5.getIV()).zzg1(zzyn5.zzXAa());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            return this.zzVWx.zzXg(((IvParameterSpec) algorithmParameterSpec).getIV());
        }
        if (zzYPQ.zzZ(algorithmParameterSpec)) {
            try {
                zzZAN zzzanZzY = zzYPQ.zzY(algorithmParameterSpec);
                return (zzZ5Q) this.zzVWx.zzXg(zzzanZzY.zzXJY()).zzg1(zzzanZzY.zzXJX() * 8);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot process GCMParameterSpec: ")), e);
            }
        }
        if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            return this.zzVWx.zzXg(((RC2ParameterSpec) algorithmParameterSpec).getIV());
        }
        if (algorithmParameterSpec == null) {
            return (z && this.zzVWx.zzXGV().zzXH5()) ? this.zzVWx.zzW(secureRandom) : this.zzVWx;
        }
        throw new InvalidAlgorithmParameterException("Unknown AlgorithmParameterSpec found: ".concat(algorithmParameterSpec.getClass().getName()));
    }
}
