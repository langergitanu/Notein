package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9F extends zzZDB {
    zzZD4 zzWyN;

    private zzZ9F(zzZD4 zzzd4) {
        if (((zzZDD) zzzd4.zzg6(0)).zzXKZ().intValue() != 0) {
            throw new IllegalArgumentException("sequence not version 0");
        }
        this.zzWyN = zzZD4.zzYy(zzzd4.zzg6(1));
    }

    public static zzZ9F zzXQ(Object obj) {
        if (obj instanceof zzZ9F) {
            return (zzZ9F) obj;
        }
        if (obj != null) {
            return new zzZ9F(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZD9 zzXJl() {
        if (this.zzWyN.size() == 3) {
            return zzZD9.zzY(zzZCY.zzYw(this.zzWyN.zzg6(2)), false);
        }
        return null;
    }

    public final zzZ86 zzXKk() {
        return zzZ86.zzXm(this.zzWyN.zzg6(1));
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(0L));
        zzzdj.zzZ(this.zzWyN);
        return new zzZCP(zzzdj);
    }

    public zzZ9F(zzZDA zzzda, zzZ86 zzz86, zzZDK zzzdk) {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(zzzda);
        zzzdj.zzZ(zzz86.zzXL0());
        zzzdj.zzZ(new zzZCL(false, 0, zzzdk));
        this.zzWyN = new zzZCP(zzzdj);
    }
}
