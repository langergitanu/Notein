package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2H extends zz33 {
    private int zzgl;
    private zzZYV<zz1Z> zzgm;

    public zz2H(zz4W zz4w) {
        super(zz4w);
        this.zzgm = new zzZYV<>();
    }

    public final void zzTI(int i) {
        this.zzgl = i;
    }

    public final void zzZ(zz1Z zz1z) {
        this.zzgm.set(zz1z.zzw7(), zz1z);
    }

    public final int zztk() {
        return this.zzgl;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzYY("/Nums");
        zzfy.zzFf();
        for (int i = 0; i < this.zzgm.getCount(); i++) {
            this.zzgm.zzVY(i).zzC(zzfy);
            if (i < this.zzgm.getCount() - 1) {
                zzfy.zzFh();
            }
        }
        zzfy.zzFe();
        zzfy.zzFc();
    }
}
