package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ95 extends zzZDB implements zzZ96 {
    private zzZ9B zzWwp;
    private zzZ9H zzWwq;

    private zzZ95(zzZD4 zzzd4) {
        this.zzWwp = null;
        if (zzZDD.zzYB(zzzd4.zzg6(0)).zzXKZ().intValue() != 3) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        this.zzWwq = zzZ9H.zzXS(zzzd4.zzg6(1));
        if (zzzd4.size() == 3) {
            this.zzWwp = zzZ9B.zzXM(zzzd4.zzg6(2));
        }
    }

    public static zzZ95 zzXH(Object obj) {
        if (obj instanceof zzZ95) {
            return (zzZ95) obj;
        }
        if (obj != null) {
            return new zzZ95(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ9B zzXJa() {
        return this.zzWwp;
    }

    public final zzZ9H zzXJb() {
        return this.zzWwq;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(3L));
        zzzdj.zzZ(this.zzWwq);
        zzZ9B zzz9b = this.zzWwp;
        if (zzz9b != null) {
            zzzdj.zzZ(zzz9b);
        }
        return new zzZCP(zzzdj);
    }

    public zzZ95(zzZ9H zzz9h, zzZ9B zzz9b) {
        this.zzWwq = zzz9h;
        this.zzWwp = zzz9b;
    }
}
