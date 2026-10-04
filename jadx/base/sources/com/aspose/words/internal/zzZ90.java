package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ90 extends zzZDB {
    private BigInteger zzWwe;
    private BigInteger zzWwf;

    public zzZ90(BigInteger bigInteger, BigInteger bigInteger2) {
        this.zzWwf = bigInteger;
        this.zzWwe = bigInteger2;
    }

    public static zzZ90 zzXC(Object obj) {
        if (obj instanceof zzZ90) {
            return (zzZ90) obj;
        }
        if (obj != null) {
            return new zzZ90(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger getModulus() {
        return this.zzWwf;
    }

    public final BigInteger getPublicExponent() {
        return this.zzWwe;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(this.zzWwf));
        zzzdj.zzZ(new zzZDD(this.zzWwe));
        return new zzZC2(zzzdj);
    }

    private zzZ90(zzZD4 zzzd4) {
        if (zzzd4.size() == 2) {
            Enumeration enumerationZzXKE = zzzd4.zzXKE();
            this.zzWwf = zzZDD.zzYB(enumerationZzXKE.nextElement()).zzXKM();
            this.zzWwe = zzZDD.zzYB(enumerationZzXKE.nextElement()).zzXKM();
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
    }
}
