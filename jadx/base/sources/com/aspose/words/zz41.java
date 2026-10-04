package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz41 extends zz7X {
    private zzBW zzZ0l;
    private int zzZ0m;
    private zzBW zzZ0n;

    private com.aspose.words.internal.zzPV zzL(zzGR zzgr) throws Exception {
        return zzZwK().zzZ(zzgr.getThemeProvider(), zzgr.zzZPL());
    }

    private com.aspose.words.internal.zzPV zzM(zzGR zzgr) throws Exception {
        return zzZwJ().zzZ(zzgr.getThemeProvider(), zzgr.zzZPL());
    }

    @Override // com.aspose.words.zz7X
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz41 zz41Var = (zz41) obj;
        return zz41Var.zzZ0m == this.zzZ0m && com.aspose.words.internal.zzZKO.equals(zz41Var.zzZwK(), zzZwK()) && com.aspose.words.internal.zzZKO.equals(zz41Var.zzZwJ(), zzZwJ());
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final int getFillType() {
        return 1;
    }

    @Override // com.aspose.words.zz7X
    public final int hashCode() {
        return ((super.hashCode() ^ this.zzZ0m) ^ zzZwK().hashCode()) ^ zzZwJ().hashCode();
    }

    public final void zzHf(int i) {
        this.zzZ0m = i;
    }

    public final void zzN(zzBW zzbw) {
        this.zzZ0n = zzbw;
    }

    @Override // com.aspose.words.zz7X
    public final void zzO(zzBW zzbw) {
        this.zzZ0n = zzbw;
    }

    @Override // com.aspose.words.zz7X
    public final void zzP(zzBW zzbw) {
        this.zzZ0l = zzbw;
    }

    @Override // com.aspose.words.zz7X
    public final void zzV(zzBW zzbw) {
        zzZwJ().zzV(zzbw);
        zzZwK().zzV(zzbw);
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) throws Exception {
        return zzYCL.zzZ(this.zzZ0m, zzM(zzgr), zzL(zzgr));
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) throws Exception {
        return zzM(zzgr);
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        return new com.aspose.words.internal.zzPK(zzZO0.zzBK(this.zzZ0m), zzM(zzgr), zzL(zzgr));
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBm() {
        return zzZwK();
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBn() {
        return zzZwJ();
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 4;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        zz41 zz41Var = new zz41();
        zz41Var.zzZ0m = this.zzZ0m;
        zz41Var.zzZ0n = zzZwK().zzZHt();
        zz41Var.zzZ0l = zzZwJ().zzZHt();
        return zz41Var;
    }

    public final zzBW zzZwJ() {
        if (this.zzZ0l == null) {
            this.zzZ0l = new zz6S();
        }
        return this.zzZ0l;
    }

    public final zzBW zzZwK() {
        if (this.zzZ0n == null) {
            this.zzZ0n = new zz6S();
        }
        return this.zzZ0n;
    }

    public final int zzZwL() {
        return this.zzZ0m;
    }

    public final void zzM(zzBW zzbw) {
        this.zzZ0l = zzbw;
    }
}
