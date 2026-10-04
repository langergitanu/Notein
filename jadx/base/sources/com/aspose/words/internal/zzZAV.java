package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAV extends zzZDB {
    private zzZD2 zzWFY;
    private zzZDA zzWFZ;

    private zzZAV(zzZD4 zzzd4) {
        this.zzWFZ = (zzZDA) zzzd4.zzg6(0);
        this.zzWFY = (zzZD2) zzzd4.zzg6(1);
    }

    public static zzZAV zzYf(Object obj) {
        if (obj instanceof zzZAV) {
            return (zzZAV) obj;
        }
        if (obj != null) {
            return new zzZAV(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZD2 zzXK0() {
        return this.zzWFY;
    }

    public final zzZDA zzXK1() {
        return this.zzWFZ;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFZ);
        zzzdj.zzZ(this.zzWFY);
        return new zzZC2(zzzdj);
    }

    public zzZAV(zzZDA zzzda, zzZD2 zzzd2) {
        this.zzWFZ = zzzda;
        this.zzWFY = zzzd2;
    }
}
