package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2I extends zz33 {
    private zz2B zzgn;

    public zz2I(zz4W zz4w) {
        super(zz4w);
        this.zzgn = new zz2B();
    }

    public final int getCount() {
        return this.zzgn.getCount();
    }

    public final void zzXM(String str) {
        this.zzgn.add(str);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Pages");
        zzfy.zzM("/Count", this.zzgn.getCount());
        zzfy.zzYY("/Kids");
        this.zzgn.zzW(zzfy);
        zzfy.zzFc();
    }

    public final String zztl() {
        return this.zzgn.getCount() == 0 ? "" : this.zzgn.zztj();
    }
}
