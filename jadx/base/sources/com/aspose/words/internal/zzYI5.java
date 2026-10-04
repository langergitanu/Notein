package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYI5 implements zzYIB {

    /* JADX INFO: renamed from: dj */
    protected final BigInteger f50906dj;

    public zzYI5(BigInteger bigInteger) {
        this.f50906dj = bigInteger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzYI5) {
            return this.f50906dj.equals(((zzYI5) obj).f50906dj);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50906dj.hashCode();
    }

    @Override // com.aspose.words.internal.zzYIB
    public final BigInteger zzXyD() {
        return this.f50906dj;
    }

    @Override // com.aspose.words.internal.zzYIB
    public final int zzYxQ() {
        return 1;
    }
}
