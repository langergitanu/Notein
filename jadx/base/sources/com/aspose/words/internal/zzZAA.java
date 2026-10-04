package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAA extends zzZDB {
    zzZDD zzWEn;
    zzZDD zzWEo;
    zzZDD zzWEp;
    int zzWEq = 1024;

    public zzZAA(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzWEp = new zzZDD(bigInteger);
        this.zzWEo = new zzZDD(bigInteger2);
        this.zzWEn = new zzZDD(bigInteger3);
    }

    public final BigInteger getA() {
        return this.zzWEn.zzXKM();
    }

    public final int getKeySize() {
        return this.zzWEq;
    }

    public final BigInteger getP() {
        return this.zzWEp.zzXKM();
    }

    public final BigInteger getQ() {
        return this.zzWEo.zzXKM();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(this.zzWEq));
        zzzdj.zzZ(this.zzWEp);
        zzzdj.zzZ(this.zzWEo);
        zzzdj.zzZ(this.zzWEn);
        return new zzZC2(zzzdj);
    }
}
