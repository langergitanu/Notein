package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1O extends zz1X {
    private zz2H zzfS;
    private zz36 zzhk;

    public zz1O(zz4W zz4w) {
        super(zz4w);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/StructTreeRoot");
        zz36 zz36Var = this.zzhk;
        if (zz36Var != null && !zz36Var.isEmpty()) {
            zzfy.zzYY("/IDTree");
            this.zzhk.zzH(zzfy);
        }
        zzfy.zzM("/ParentTreeNextKey", this.zzfS.zztk());
        zzfy.zzZ("/ParentTree", this.zzfS);
        zzfy.zzYY("/RoleMap");
        zzfy.zzFd();
        zz2Z.zzD(zzfy);
        zzfy.zzFc();
        zzy(zzfy);
        zzfy.zzFc();
    }

    public final void zzZ(zz2H zz2h) {
        this.zzfS = zz2h;
    }

    public final void zzZ(zz36 zz36Var) {
        this.zzhk = zz36Var;
    }

    @Override // com.aspose.words.internal.zz1X, com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzfS.zzY(zzfx);
        super.zzZ(zzfx);
    }
}
