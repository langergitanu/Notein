package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8Y extends zzZDB {
    private zzZD2 zzWw0;
    private zzZDK zzWw1;
    private zzZDA zzWw2;

    public zzZ8Y(zzZDA zzzda, zzZDK zzzdk, zzZD2 zzzd2) {
        this.zzWw2 = zzzda;
        this.zzWw1 = zzzdk;
        this.zzWw0 = zzzd2;
    }

    public static zzZ8Y zzXA(Object obj) {
        if (obj instanceof zzZ8Y) {
            return (zzZ8Y) obj;
        }
        if (obj != null) {
            return new zzZ8Y(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZD2 zzXIR() {
        return this.zzWw0;
    }

    public final zzZDK zzXIS() {
        return this.zzWw1;
    }

    public final zzZDA zzXIT() {
        return this.zzWw2;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWw2);
        zzzdj.zzZ(new zzZBL(true, 0, this.zzWw1));
        zzZD2 zzzd2 = this.zzWw0;
        if (zzzd2 != null) {
            zzzdj.zzZ(zzzd2);
        }
        return new zzZBN(zzzdj);
    }

    private zzZ8Y(zzZD4 zzzd4) {
        this.zzWw2 = (zzZDA) zzzd4.zzg6(0);
        this.zzWw1 = ((zzZCY) zzzd4.zzg6(1)).zzXKw();
        if (zzzd4.size() == 3) {
            this.zzWw0 = (zzZD2) zzzd4.zzg6(2);
        }
    }
}
