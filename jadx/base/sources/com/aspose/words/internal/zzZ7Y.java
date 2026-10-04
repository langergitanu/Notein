package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7Y extends zzZDB {
    zzZDD zzWEo;
    zzZDD zzWEp;
    zzZDD zzWz5;

    public zzZ7Y(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzWEp = new zzZDD(bigInteger);
        this.zzWEo = new zzZDD(bigInteger2);
        this.zzWz5 = new zzZDD(bigInteger3);
    }

    public static zzZ7Y zzXf(Object obj) {
        if (obj instanceof zzZ7Y) {
            return (zzZ7Y) obj;
        }
        if (obj != null) {
            return new zzZ7Y(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger getG() {
        return this.zzWz5.zzXKM();
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
        zzzdj.zzZ(this.zzWEp);
        zzzdj.zzZ(this.zzWEo);
        zzzdj.zzZ(this.zzWz5);
        return new zzZC2(zzzdj);
    }

    private zzZ7Y(zzZD4 zzzd4) {
        if (zzzd4.size() == 3) {
            Enumeration enumerationZzXKE = zzzd4.zzXKE();
            this.zzWEp = zzZDD.zzYB(enumerationZzXKE.nextElement());
            this.zzWEo = zzZDD.zzYB(enumerationZzXKE.nextElement());
            this.zzWz5 = zzZDD.zzYB(enumerationZzXKE.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
    }
}
