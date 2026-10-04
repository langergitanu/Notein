package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4L;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPM<T extends zzZ4L> implements zzYP7 {
    private final zzZ4L zzVUr;

    public zzYPM(zzZ4L zzz4l) {
        this.zzVUr = zzz4l;
    }

    @Override // com.aspose.words.internal.zzYP7
    public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        return algorithmParameterSpec instanceof IvParameterSpec ? this.zzVUr.zzXg(((IvParameterSpec) algorithmParameterSpec).getIV()) : (z && this.zzVUr.zzXGV().zzXH5()) ? this.zzVUr.zzW(secureRandom) : this.zzVUr;
    }
}
