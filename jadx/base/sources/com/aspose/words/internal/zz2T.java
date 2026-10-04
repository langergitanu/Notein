package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2T implements zzFX {
    private zz2U zzh7;
    private zzFX zzh8;
    private zz4W zzkV;

    public zz2T(zz4W zz4w, zzFX zzfx) throws Exception {
        this.zzkV = zz4w;
        this.zzh8 = zzfx;
        this.zzh7 = new zz2U(zz4w);
    }

    @Override // com.aspose.words.internal.zzFX
    public final zzFY zzF2() {
        return this.zzh7.zzF2();
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzF3() throws Exception {
        this.zzh7.zzF3();
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzY(zz2V zz2v) {
    }

    public final void zztG() throws Exception {
        this.zzh7.zzY(this.zzh8);
        this.zzh7 = null;
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzY(zz33 zz33Var) throws Exception {
        if (this.zzh7.zztH() >= 500) {
            zztG();
            this.zzh7 = new zz2U(this.zzkV);
        }
        this.zzh7.zzY(zz33Var);
    }
}
