package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9G extends zzZDB {
    zzZDD zzWEp;
    zzZDD zzWyO;
    zzZDD zzWz5;

    public zzZ9G(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.zzWEp = new zzZDD(bigInteger);
        this.zzWz5 = new zzZDD(bigInteger2);
        if (i != 0) {
            this.zzWyO = new zzZDD(i);
        } else {
            this.zzWyO = null;
        }
    }

    public static zzZ9G zzXR(Object obj) {
        if (obj instanceof zzZ9G) {
            return (zzZ9G) obj;
        }
        if (obj != null) {
            return new zzZ9G(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger getG() {
        return this.zzWz5.zzXKM();
    }

    public final BigInteger getP() {
        return this.zzWEp.zzXKM();
    }

    public final BigInteger zzXJm() {
        zzZDD zzzdd = this.zzWyO;
        if (zzzdd == null) {
            return null;
        }
        return zzzdd.zzXKM();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEp);
        zzzdj.zzZ(this.zzWz5);
        if (zzXJm() != null) {
            zzzdj.zzZ(this.zzWyO);
        }
        return new zzZC2(zzzdj);
    }

    private zzZ9G(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWEp = zzZDD.zzYB(enumerationZzXKE.nextElement());
        this.zzWz5 = zzZDD.zzYB(enumerationZzXKE.nextElement());
        if (enumerationZzXKE.hasMoreElements()) {
            this.zzWyO = (zzZDD) enumerationZzXKE.nextElement();
        } else {
            this.zzWyO = null;
        }
    }
}
