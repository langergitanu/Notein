package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz46 extends zz33 {
    private String zzZS;
    private zz4J zzim;

    public zz46(zz4W zz4w, zzK zzk) throws Exception {
        super(zz4w);
        this.zzZS = zzk.getFileName();
        this.zzim = new zz4J(zz4w, zzk);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Filespec");
        zzfy.zzYY("/EF");
        zzfy.zzFd();
        zzfy.zzZ("/F", this.zzim);
        zzfy.zzFc();
        zzfy.zzC("/F", this.zzZS);
        zzfy.zzC("/UF", this.zzZS);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzim.zzY(zzfx);
    }
}
