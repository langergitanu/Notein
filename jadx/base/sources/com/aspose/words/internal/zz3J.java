package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3J extends zz3L {
    private String zzhT;

    public zz3J(zz4W zz4w, String str, zz3H zz3h) throws Exception {
        super(zz4w, zz3h);
        this.zzhT = str;
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Subtype", this.zzhT);
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        zzuk().zzY(zzq());
    }

    @Override // com.aspose.words.internal.zz3L
    public final String zzuj() {
        return "/FontFile3";
    }
}
