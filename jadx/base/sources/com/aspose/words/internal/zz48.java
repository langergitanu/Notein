package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz48 extends zz5J {
    private zz3C zzip;
    private zz46 zziq;

    public zz48(zz4W zz4w, zzZQ4 zzzq4, zzK zzk) throws Exception {
        super(zz4w, zzzq4, zzk.getFileName());
        this.zziq = new zz46(zz4w, zzk);
        zz3C zz3c = new zz3C(zz4w);
        this.zzip = zz3c;
        zz3c.zzX(new zzZQ4(0.0f, 0.0f, zzzq4.getWidth(), zzzq4.getHeight()));
    }

    @Override // com.aspose.words.internal.zz5J
    public final String getSubType() {
        return "/FileAttachment";
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzU(zzFY zzfy) throws Exception {
        zzfy.zzZ("/FS", this.zziq);
        zzfy.zzYY("/AP");
        zzfy.zzFd();
        zzfy.zzZ("/N", this.zzip);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzZ(zzFX zzfx, zzZYG<zz4R> zzzyg) throws Exception {
        zzY(zzfx);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzip.zzY(zzfx);
        this.zziq.zzY(zzfx);
    }
}
