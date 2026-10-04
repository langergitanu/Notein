package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZA9 extends zzZDB {
    private zzZDA zzWEk;
    private zzZDA zzWEl;
    private zzZDA zzWEm;

    public zzZA9(zzZDA zzzda, zzZDA zzzda2) {
        this.zzWEm = zzzda;
        this.zzWEl = zzzda2;
        this.zzWEk = null;
    }

    public static zzZA9 zzY3(Object obj) {
        if (obj instanceof zzZA9) {
            return (zzZA9) obj;
        }
        if (obj != null) {
            return new zzZA9(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDA zzXJv() {
        return this.zzWEl;
    }

    public final zzZDA zzXJw() {
        return this.zzWEm;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEm);
        zzzdj.zzZ(this.zzWEl);
        zzZDA zzzda = this.zzWEk;
        if (zzzda != null) {
            zzzdj.zzZ(zzzda);
        }
        return new zzZC2(zzzdj);
    }

    public zzZA9(zzZDA zzzda, zzZDA zzzda2, zzZDA zzzda3) {
        this.zzWEm = zzzda;
        this.zzWEl = zzzda2;
        this.zzWEk = zzzda3;
    }

    private zzZA9(zzZD4 zzzd4) {
        this.zzWEm = (zzZDA) zzzd4.zzg6(0);
        this.zzWEl = (zzZDA) zzzd4.zzg6(1);
        if (zzzd4.size() > 2) {
            this.zzWEk = (zzZDA) zzzd4.zzg6(2);
        }
    }
}
