package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz4B extends zz33 implements zzFW {
    private String zzkn;

    public zz4B(zz4W zz4w, String str) {
        super(zz4w);
        this.zzkn = str;
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    public abstract void zzN(zzFY zzfy) throws Exception;

    public abstract void zzZ(zz3A zz3a) throws Exception;

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/ExtGState");
        zzN(zzfy);
        zzfy.zzFc();
    }
}
