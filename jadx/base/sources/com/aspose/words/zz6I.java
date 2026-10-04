package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6I extends zz8E {
    private double zzZ2T;
    private double zzZ2U;
    private zzHK zzZ2V = new zzHK();

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz6I zz6i = (zz6I) obj;
        return com.aspose.words.internal.zzZKO.equals(zz6i.zzZ2V, this.zzZ2V) && com.aspose.words.internal.zzAN.zzL(zz6i.zzZ2U, this.zzZ2U) && com.aspose.words.internal.zzAN.zzL(zz6i.zzZ2T, this.zzZ2T);
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 14;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return ((super.hashCode() ^ this.zzZ2V.hashCode()) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ2U)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ2T);
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
