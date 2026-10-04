package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAK extends zzZDB {
    private final BigInteger zzWFs;
    private final zzZ86 zzWFt;

    private zzZAK(zzZD4 zzzd4) {
        if (zzzd4.size() != 2) {
            throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.zzWFt = zzZ86.zzXm(zzzd4.zzg6(0));
        this.zzWFs = zzZDD.zzYB(zzzd4.zzg6(1)).zzXKZ();
    }

    public static zzZAK zzY9(Object obj) {
        if (obj instanceof zzZAK) {
            return (zzZAK) obj;
        }
        if (obj != null) {
            return new zzZAK(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger zzXJO() {
        return this.zzWFs;
    }

    public final zzZ86 zzXJP() {
        return this.zzWFt;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFt);
        zzzdj.zzZ(new zzZDD(this.zzWFs));
        return new zzZC2(zzzdj);
    }

    public zzZAK(zzZ86 zzz86, int i) {
        this.zzWFt = zzz86;
        this.zzWFs = BigInteger.valueOf(i);
    }
}
