package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz1C extends zz7X {
    private zzBW zzZh4;

    public zz1C() {
    }

    @Override // com.aspose.words.zz7X
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zz1C) obj).zzZQX(), zzZQX());
        }
        return false;
    }

    @Override // com.aspose.words.zz7X
    public int hashCode() {
        return super.hashCode() ^ zzZQX().hashCode();
    }

    @Override // com.aspose.words.zz7X
    public final void zzP(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    @Override // com.aspose.words.zz7X
    public final void zzV(zzBW zzbw) {
        zzZQX().zzV(zzbw);
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) throws Exception {
        return zzYCL.zzZI(zzY(zzgr));
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) throws Exception {
        return zzZQX().zzZ(zzgr.getThemeProvider(), zzgr.zzZPL());
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        return new com.aspose.words.internal.zzOI(zzY(zzgr));
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBn() {
        return zzZQX();
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 5;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        zz1C zz1c = new zz1C();
        zz1c.zzZh4 = zzZQX().zzZHt();
        return zz1c;
    }

    public final zzBW zzZQX() {
        if (this.zzZh4 == null) {
            this.zzZh4 = new zz6S();
        }
        return this.zzZh4;
    }

    public zz1C(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }
}
