package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9I extends zzZDB {
    private zzZDK zzWyP;
    private zzZDA zzWyQ;

    private zzZ9I(zzZD4 zzzd4) {
        this.zzWyQ = (zzZDA) zzzd4.zzg6(0);
        this.zzWyP = ((zzZBX) zzzd4.zzg6(1)).zzXKw();
    }

    public static zzZ9I zzXT(Object obj) {
        if (obj instanceof zzZ9I) {
            return (zzZ9I) obj;
        }
        if (obj != null) {
            return new zzZ9I(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDK zzXJn() {
        return this.zzWyP;
    }

    public final zzZDA zzXJo() {
        return this.zzWyQ;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyQ);
        zzzdj.zzZ(new zzZBX(this.zzWyP));
        return new zzZC2(zzzdj);
    }

    public zzZ9I(zzZDA zzzda, zzZDK zzzdk) {
        this.zzWyQ = zzzda;
        this.zzWyP = zzzdk;
    }
}
