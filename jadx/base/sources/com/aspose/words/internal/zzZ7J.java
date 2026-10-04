package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7J extends zzZDB {
    private final zzZDA zzWpU;
    private final zzZDK zzWsx;

    private zzZ7J(zzZD4 zzzd4) {
        this.zzWpU = zzZDA.zzYA(zzzd4.zzg6(0));
        this.zzWsx = zzZCY.zzYw(zzzd4.zzg6(1)).zzXKw();
    }

    public static zzZ7J zzX2(Object obj) {
        if (obj instanceof zzZ7J) {
            return (zzZ7J) obj;
        }
        if (obj != null) {
            return new zzZ7J(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDA zzXHM() {
        return this.zzWpU;
    }

    public final zzZDK zzXIs() {
        return this.zzWsx;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWpU);
        zzzdj.zzZ(new zzZBX(true, 0, this.zzWsx));
        return new zzZC2(zzzdj);
    }
}
