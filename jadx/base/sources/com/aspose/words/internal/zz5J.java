package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz5J extends zz33 {
    private zzZQ4 zzZV;
    private int zzkA;
    private String zzkz;

    public zz5J(zz4W zz4w, zzZQ4 zzzq4, String str) {
        super(zz4w);
        this.zzkA = -1;
        zzZQ4 zzzq42 = zzZQ4.zz2T;
        this.zzZV = zzzq4;
        this.zzkz = str;
    }

    public abstract String getSubType();

    public abstract void zzU(zzFY zzfy) throws Exception;

    public final void zzUb(int i) {
        this.zzkA = i;
    }

    public abstract void zzZ(zzFX zzfx, zzZYG<zz4R> zzzyg) throws Exception;

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Annot");
        zzfy.zzH("/Subtype", getSubType());
        zzfy.zzZ("/Rect", this.zzZV);
        if (zzZYD.zzXk(this.zzkz)) {
            zzfy.zzC("/Contents", this.zzkz);
        }
        zzU(zzfy);
        zzfy.zzFc();
    }

    public final int zzw7() {
        return this.zzkA;
    }
}
