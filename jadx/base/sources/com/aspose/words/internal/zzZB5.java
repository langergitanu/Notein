package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB5 extends zzZDB {
    private final String zzWGD;
    private final zzZD9 zzWGE;
    private final zzZDF zzWGF;
    private final zzZDF zzWGG;
    private final BigInteger zzWGH;
    private final String zzWIr;

    private zzZB5(zzZD4 zzzd4) {
        this.zzWGH = zzZDD.zzYB(zzzd4.zzg6(0)).zzXKZ();
        this.zzWIr = zzZBV.zzYs(zzzd4.zzg6(1)).getString();
        this.zzWGG = zzZDF.zzYC(zzzd4.zzg6(2));
        this.zzWGF = zzZDF.zzYC(zzzd4.zzg6(3));
        this.zzWGE = zzZD9.zzYz(zzzd4.zzg6(4));
        this.zzWGD = zzzd4.size() == 6 ? zzZBV.zzYs(zzzd4.zzg6(5)).getString() : null;
    }

    public static zzZB5 zzYo(Object obj) {
        if (obj instanceof zzZB5) {
            return (zzZB5) obj;
        }
        if (obj != null) {
            return new zzZB5(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getData() {
        return zzYGU.zzVI(this.zzWGE.zzXL5());
    }

    public final String getIdentifier() {
        return this.zzWIr;
    }

    public final BigInteger zzXKd() {
        return this.zzWGH;
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
        zzzdj.zzZ(new zzZDD(this.zzWGH));
        zzzdj.zzZ(new zzZBV(this.zzWIr));
        zzzdj.zzZ(this.zzWGG);
        zzzdj.zzZ(this.zzWGF);
        zzzdj.zzZ(this.zzWGE);
        String str = this.zzWGD;
        if (str != null) {
            zzzdj.zzZ(new zzZBV(str));
        }
        return new zzZC2(zzzdj);
    }

    public zzZB5(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr) {
        this.zzWGH = bigInteger;
        this.zzWIr = str;
        this.zzWGG = new zzZCB(date);
        this.zzWGF = new zzZCB(date2);
        this.zzWGE = new zzZC6(zzYGU.zzVI(bArr));
        this.zzWGD = null;
    }
}
