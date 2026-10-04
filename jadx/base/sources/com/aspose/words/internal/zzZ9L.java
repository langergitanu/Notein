package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9L extends zzZDB {
    zzZDD zzWEp;
    zzZDD zzWz5;

    public zzZ9L(BigInteger bigInteger, BigInteger bigInteger2) {
        this.zzWEp = new zzZDD(bigInteger);
        this.zzWz5 = new zzZDD(bigInteger2);
    }

    public static zzZ9L zzXV(Object obj) {
        if (obj instanceof zzZ9L) {
            return (zzZ9L) obj;
        }
        if (obj != null) {
            return new zzZ9L(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger getG() {
        return this.zzWz5.zzXKM();
    }

    public final BigInteger getP() {
        return this.zzWEp.zzXKM();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEp);
        zzzdj.zzZ(this.zzWz5);
        return new zzZC2(zzzdj);
    }

    private zzZ9L(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWEp = (zzZDD) enumerationZzXKE.nextElement();
        this.zzWz5 = (zzZDD) enumerationZzXKE.nextElement();
    }
}
