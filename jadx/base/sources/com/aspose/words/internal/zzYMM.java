package com.aspose.words.internal;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMM<T extends AlgorithmParameterSpec> implements AlgorithmParameterSpec {
    private zzZ2Y zzW81;

    public zzYMM(zzZ2Y zzz2y) {
        this.zzW81 = zzz2y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzYMM) {
            return this.zzW81.equals(((zzYMM) obj).zzW81);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzW81.hashCode();
    }

    public final T zzXA3() {
        return this.zzW81.zzXGk() instanceof zzZ2Z ? new zzYMN((zzZ2Z) this.zzW81.zzXGk()) : new zzYMV((zzZ33) this.zzW81.zzXGk());
    }

    public final zzZDA zzXJv() {
        return this.zzW81.zzXJv();
    }

    public final zzZDA zzXJw() {
        return this.zzW81.zzXJw();
    }
}
