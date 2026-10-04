package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6M extends zzBW {
    private double zzZ2T;
    private double zzZ2U;
    private zzHK zzZ2V = new zzHK();

    @Override // com.aspose.words.zzBW
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz6M zz6m = (zz6M) obj;
        return com.aspose.words.internal.zzZKO.equals(zz6m.zzZ2V, this.zzZ2V) && com.aspose.words.internal.zzAN.zzL(zz6m.zzZ2U, this.zzZ2U) && com.aspose.words.internal.zzAN.zzL(zz6m.zzZ2T, this.zzZ2T);
    }

    @Override // com.aspose.words.zzBW
    public final int hashCode() {
        return ((super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ2V.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ2U)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ2T);
    }

    public final void zzW(zzHK zzhk) {
        this.zzZ2V = zzhk;
    }

    public final void zzXO(double d) {
        this.zzZ2U = d;
    }

    public final void zzXP(double d) {
        this.zzZ2T = d;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        return new com.aspose.words.internal.zzIP(this.zzZ2V.zzZQQ() / 360.0d, this.zzZ2T, this.zzZ2U).zzGx();
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 1;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz6M zz6m = new zz6M();
        zz6m.zzZ2T = this.zzZ2T;
        zz6m.zzZ2U = this.zzZ2U;
        zz6m.zzZ2V = this.zzZ2V;
        zzU(zz6m);
        return zz6m;
    }

    public final zzHK zzZzQ() {
        return this.zzZ2V;
    }

    public final double zzZzR() {
        return this.zzZ2U;
    }

    public final double zzZzS() {
        return this.zzZ2T;
    }
}
