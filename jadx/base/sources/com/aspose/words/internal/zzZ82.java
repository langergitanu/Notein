package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ82 extends zzZDB {
    private BigInteger zzWqZ;

    public zzZ82(BigInteger bigInteger) {
        this.zzWqZ = bigInteger;
    }

    public final String toString() {
        return "CRLNumber: " + this.zzWqZ;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return new zzZDD(this.zzWqZ);
    }
}
