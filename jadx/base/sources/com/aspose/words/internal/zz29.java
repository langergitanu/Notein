package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz29 extends zz3B {
    private zzU zzgb;

    private zz29(zz4W zz4w, zzU zzu) throws Exception {
        super(zz4w, zzu.zzz(), zzu.zzy(), zzu.zzD(), zzu.zzC());
        this.zzgb = zzu;
    }

    public static zz29 zzX(zz4W zz4w, zzPA zzpa) throws Exception {
        return new zz29(zz4w, zzU.zzY(zzpa));
    }

    public static zz29 zzY(zz4W zz4w, zzPA zzpa) throws Exception {
        return new zz29(zz4w, zzU.zzZ(zzpa));
    }

    @Override // com.aspose.words.internal.zz3B, com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        super.zzN(zzfy);
        zzfy.zzZ("/Size", new int[]{this.zzgb.zzA()});
        zzfy.zzM("/BitsPerSample", this.zzgb.zzB());
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        this.zzgb.zzY(zzq());
    }
}
