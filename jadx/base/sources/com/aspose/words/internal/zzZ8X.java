package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8X extends zzZDB implements zzZ96 {
    private zzZD2 zzWFi;
    private zzZD2 zzWFj = null;
    private zzZD2 zzWFk;
    private zzZD2 zzWFm;
    private zzZDD zzWFn;
    private zzZ9H zzWwq;

    public zzZ8X(zzZDD zzzdd, zzZD2 zzzd2, zzZ9H zzz9h, zzZD2 zzzd22, zzZD2 zzzd23) {
        this.zzWFn = zzzdd;
        this.zzWFm = zzzd2;
        this.zzWwq = zzz9h;
        this.zzWFk = zzzd22;
        this.zzWFi = zzzd23;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFn);
        zzzdj.zzZ(this.zzWFm);
        zzzdj.zzZ(this.zzWwq);
        zzZD2 zzzd2 = this.zzWFk;
        if (zzzd2 != null) {
            zzzdj.zzZ(new zzZBX(false, 0, zzzd2));
        }
        zzZD2 zzzd22 = this.zzWFj;
        if (zzzd22 != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzzd22));
        }
        zzzdj.zzZ(this.zzWFi);
        return new zzZCP(zzzdj);
    }
}
