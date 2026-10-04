package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMN implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: t */
    private zzZ2Z f51221t;

    public zzYMN(zzZ2Z zzz2z) {
        this.f51221t = zzz2z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzYMN) {
            return this.f51221t.equals(((zzYMN) obj).f51221t);
        }
        return false;
    }

    public final BigInteger getA() {
        return this.f51221t.getA();
    }

    public final int getKeySize() {
        return this.f51221t.getKeySize();
    }

    public final BigInteger getP() {
        return this.f51221t.getP();
    }

    public final BigInteger getQ() {
        return this.f51221t.getQ();
    }

    public final int hashCode() {
        return this.f51221t.hashCode();
    }
}
