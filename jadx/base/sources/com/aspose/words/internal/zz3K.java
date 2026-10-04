package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3K extends zz3L {
    private zz20 zzhU;

    public zz3K(zz4W zz4w, zz3H zz3h) throws Exception {
        super(zz4w, zz3h);
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzZ("/Length1", this.zzhU);
    }

    @Override // com.aspose.words.internal.zz21, com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzhU.zzY(zzfx);
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        zzuk().zzY(zzq());
        zz20 zz20Var = new zz20(zzuN());
        this.zzhU = zz20Var;
        zz20Var.setLength((int) zzq().getLength());
    }

    @Override // com.aspose.words.internal.zz3L
    public final String zzuj() {
        return "/FontFile2";
    }
}
