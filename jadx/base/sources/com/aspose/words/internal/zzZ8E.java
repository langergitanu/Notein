package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8E extends zzZDB {
    private zzZDK zzWsx;
    private zzZDA zzWsy;

    private zzZ8E(zzZD4 zzzd4) {
        this.zzWsy = (zzZDA) zzzd4.zzg6(0);
        this.zzWsx = zzzd4.zzg6(1);
    }

    public static zzZ8E zzXp(Object obj) {
        if (obj instanceof zzZ8E) {
            return (zzZ8E) obj;
        }
        if (obj != null) {
            return new zzZ8E(zzZD4.zzYy(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public final zzZDK zzXIs() {
        return this.zzWsx;
    }

    public final zzZDA zzXIt() {
        return this.zzWsy;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWsy);
        zzzdj.zzZ(this.zzWsx);
        return new zzZC2(zzzdj);
    }
}
