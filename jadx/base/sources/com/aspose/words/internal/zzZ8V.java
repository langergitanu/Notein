package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8V extends zzZDB {
    private zzZD4 zzWvF;

    private zzZ8V(zzZD4 zzzd4) {
        this.zzWvF = zzzd4;
    }

    private zzZD5 zzXIO() {
        Enumeration enumerationZzXKE = this.zzWvF.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzZDK zzzdk = (zzZDK) enumerationZzXKE.nextElement();
            if (zzzdk instanceof zzZCY) {
                zzZCY zzzcy = (zzZCY) zzzdk;
                if (zzzcy.zzXKy() == 1) {
                    return zzzcy.zzXKw().zzXL0();
                }
            }
        }
        return null;
    }

    public static zzZ8V zzXz(Object obj) {
        if (obj instanceof zzZ8V) {
            return (zzZ8V) obj;
        }
        if (obj != null) {
            return new zzZ8V(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZCG zzXIP() {
        return (zzZCG) zzXIO();
    }

    public final BigInteger zzXIQ() {
        return new BigInteger(1, ((zzZD9) this.zzWvF.zzg6(1)).zzXL5());
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWvF;
    }

    public zzZ8V(int i, BigInteger bigInteger, zzZDK zzzdk) {
        this(i, bigInteger, null, zzzdk);
    }

    public zzZ8V(int i, BigInteger bigInteger, zzZCG zzzcg, zzZDK zzzdk) {
        byte[] bArrZzU = zzYGT.zzU((i + 7) / 8, bigInteger);
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(1L));
        zzzdj.zzZ(new zzZC6(bArrZzU));
        if (zzzdk != null) {
            zzzdj.zzZ(new zzZBX(true, 0, zzzdk));
        }
        if (zzzcg != null) {
            zzzdj.zzZ(new zzZBX(true, 1, zzzcg));
        }
        this.zzWvF = new zzZC2(zzzdj);
    }
}
