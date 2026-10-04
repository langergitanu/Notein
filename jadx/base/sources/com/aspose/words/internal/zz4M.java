package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz4M implements zzFX {
    private zzFY zzjb;
    private zz4U zzjz;

    public zz4M(zzFY zzfy, zz4U zz4u) {
        this.zzjb = zzfy;
        this.zzjz = zz4u;
    }

    @Override // com.aspose.words.internal.zzFX
    public final zzFY zzF2() {
        return this.zzjb;
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzF3() throws Exception {
        this.zzjb.zzFb();
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzY(zz33 zz33Var) throws Exception {
        this.zzjz.zzZT(zz33Var.zztR(), (int) this.zzjb.zzF4());
        this.zzjb.zzWc(zz33Var.zztR());
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzY(zz2V zz2v) {
        this.zzjb.zzZ(zz2v);
    }
}
