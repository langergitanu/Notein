package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5A extends zz3M {
    private zz58 zzk7;

    public zz5A(zz4W zz4w, zz3Q zz3q, zz3P zz3p, zz3H zz3h) throws Exception {
        super(zz4w, zz3q, zz3p);
        if (zz3h.zzHo() || !zzuN().zzv7().zzvx()) {
            return;
        }
        this.zzk7 = new zz58(zz4w, zz3h);
    }

    @Override // com.aspose.words.internal.zz3M
    public final void zzN(zzFY zzfy) throws Exception {
        super.zzN(zzfy);
        zz58 zz58Var = this.zzk7;
        if (zz58Var != null) {
            zzfy.zzZ("/CIDSet", zz58Var);
        }
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        zz58 zz58Var = this.zzk7;
        if (zz58Var != null) {
            zz58Var.zzvP();
            this.zzk7.zzY(zzfx);
        }
    }
}
