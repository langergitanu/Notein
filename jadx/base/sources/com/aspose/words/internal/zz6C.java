package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz6C {
    private zz63 zzlp;
    private zz62 zzlr;
    private zz69 zzls;
    private zz67 zzlq = new zz67(this);
    private zz6A zzlo = new zz6A(this);

    public zz6C(zz69 zz69Var, zz62 zz62Var) {
        this.zzls = zz69Var;
        this.zzlr = zz62Var;
        this.zzlp = new zz63(zz62Var.zzww());
    }

    public final void zzT(int i, String str) {
        this.zzlr.zzI().zzZ(i, 13, str);
    }

    public final zz6A zzwI() {
        return this.zzlo;
    }

    public final zz63 zzwJ() {
        return this.zzlp;
    }

    public final zz67 zzwK() {
        return this.zzlq;
    }

    public final zz62 zzwL() {
        return this.zzlr;
    }

    public final zz69 zzwM() {
        return this.zzls;
    }
}
