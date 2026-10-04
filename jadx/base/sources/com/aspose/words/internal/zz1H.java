package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1H extends zz3Q {
    private zz3E zzfD;
    private zz3M zzfE;

    public zz1H(zz4W zz4w, boolean z, boolean z2, zz3P zz3p) {
        super(zz4w, z, z2, new zz1E(), zz3p);
        this.zzfD = new zz3E(zz4w);
        this.zzfE = new zz3M(zz4w, this, zz3p);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zz5G zz5gZzum = zzuo().zzum();
        this.zzfD.zzU(zz5gZzum.zzw0());
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Font");
        zzfy.zzH("/Subtype", "/TrueType");
        zzfy.zzF("/BaseFont", zzus());
        zzun().zzI(zzfy);
        zzfy.zzM("/FirstChar", zz5gZzum.zzw2());
        zzfy.zzM("/LastChar", zz5gZzum.zzw1());
        zzfy.zzZ("/Widths", this.zzfD);
        zzfy.zzZ("/FontDescriptor", this.zzfE);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzfD.zzY(zzfx);
        this.zzfE.zzY(zzfx);
    }
}
