package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB2 extends zzZDB {
    private final String zzWGD;
    private final zzZDF zzWGF;
    private final zzZDF zzWGG;
    private final zzZB4 zzWGx;
    private final zzZ86 zzWGy;
    private final BigInteger zzWGz;

    public zzZB2(zzZ86 zzz86, Date date, Date date2, zzZB4 zzzb4) {
        this.zzWGz = BigInteger.valueOf(1L);
        this.zzWGy = zzz86;
        this.zzWGG = new zzZCB(date);
        this.zzWGF = new zzZCB(date2);
        this.zzWGx = zzzb4;
        this.zzWGD = null;
    }

    public static zzZB2 zzYl(Object obj) {
        if (obj instanceof zzZB2) {
            return (zzZB2) obj;
        }
        if (obj != null) {
            return new zzZB2(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZB4 zzXK9() {
        return this.zzWGx;
    }

    public final zzZ86 zzXKa() {
        return this.zzWGy;
    }

    public final zzZDF zzXKe() {
        return this.zzWGF;
    }

    public final zzZDF zzXKf() {
        return this.zzWGG;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(this.zzWGz));
        zzzdj.zzZ(this.zzWGy);
        zzzdj.zzZ(this.zzWGG);
        zzzdj.zzZ(this.zzWGF);
        zzzdj.zzZ(this.zzWGx);
        String str = this.zzWGD;
        if (str != null) {
            zzzdj.zzZ(new zzZBV(str));
        }
        return new zzZC2(zzzdj);
    }

    private zzZB2(zzZD4 zzzd4) {
        this.zzWGz = zzZDD.zzYB(zzzd4.zzg6(0)).zzXKZ();
        this.zzWGy = zzZ86.zzXm(zzzd4.zzg6(1));
        this.zzWGG = zzZDF.zzYC(zzzd4.zzg6(2));
        this.zzWGF = zzZDF.zzYC(zzzd4.zzg6(3));
        this.zzWGx = zzZB4.zzYn(zzzd4.zzg6(4));
        this.zzWGD = zzzd4.size() == 6 ? zzZBV.zzYs(zzzd4.zzg6(5)).getString() : null;
    }
}
