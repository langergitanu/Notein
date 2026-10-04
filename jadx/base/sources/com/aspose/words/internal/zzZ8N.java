package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8N extends zzZDB {
    zzZ8P zzWtB;
    zzZDM zzWtt;
    zzZDA zzWtu;
    zzZ7T zzWtv;
    zzZDD zzWFn = new zzZDD(1);
    zzZDD zzWtx = null;

    public zzZ8N(zzZ8P zzz8p, zzZDA zzzda, zzZDD zzzdd, zzZDM zzzdm, zzZ7T zzz7t) {
        this.zzWtB = zzz8p;
        this.zzWtu = zzzda;
        this.zzWtt = zzzdm;
        this.zzWtv = zzz7t;
    }

    public final zzZ7T zzXIH() {
        return this.zzWtv;
    }

    public final zzZDA zzXII() {
        return this.zzWtu;
    }

    public final zzZDD zzXIJ() {
        return this.zzWtx;
    }

    public final zzZ8P zzXIM() {
        return this.zzWtB;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFn);
        zzzdj.zzZ(this.zzWtB);
        zzZDA zzzda = this.zzWtu;
        if (zzzda != null) {
            zzzdj.zzZ(zzzda);
        }
        zzZDD zzzdd = this.zzWtx;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzZDM zzzdm = this.zzWtt;
        if (zzzdm != null && zzzdm.zzXL1()) {
            zzzdj.zzZ(this.zzWtt);
        }
        zzZ7T zzz7t = this.zzWtv;
        if (zzz7t != null) {
            zzzdj.zzZ(new zzZBX(false, 0, zzz7t));
        }
        return new zzZC2(zzzdj);
    }
}
