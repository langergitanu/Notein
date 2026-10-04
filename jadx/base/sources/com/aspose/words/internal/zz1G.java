package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1G extends zz3Q {
    private zz5F zzfA;
    private zz21 zzfB;
    private zz5B zzfC;
    private zz3H zzhX;

    public zz1G(zz4W zz4w, boolean z, boolean z2, zz3O zz3o) throws Exception {
        super(zz4w, z, z2, new zz35(zz3o.zzuk()), zz3o);
        zz3H zz3hZzuk = zz3o.zzuk();
        this.zzhX = zz3hZzuk;
        this.zzfA = new zz5F(zz3hZzuk);
        this.zzfC = new zz5B(zz4w, this);
        this.zzfB = new zz21(zz4w);
    }

    private void zzU(zzFX zzfx) throws Exception {
        this.zzfA.zzZ(this.zzfB.zzq(), "Adobe-Identity-UCS");
        this.zzfB.zzY(zzfx);
    }

    public final void zzZ(zz59 zz59Var) {
        zz59Var.zzZ(this.zzhX.zzuc(), this.zzhX.zzug().zzPl(), 1000);
    }

    public final zz3H zzuk() {
        return this.zzhX;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Font");
        zzfy.zzH("/Subtype", "/Type0");
        zzun().zzI(zzfy);
        zzfy.zzF("/BaseFont", zzus());
        zzfy.zzYY("/DescendantFonts");
        zzfy.zzFf();
        zzfy.zzZ(this.zzfC);
        zzfy.zzFe();
        zzfy.zzZ("/ToUnicode", this.zzfB);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzfC.zzY(zzfx);
        zzU(zzfx);
    }
}
