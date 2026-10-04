package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3Y extends zzBW {
    private double zzZ0e;
    private double zzZ0f;
    private double zzZ0g;

    @Override // com.aspose.words.zzBW
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz3Y zz3y = (zz3Y) obj;
        return com.aspose.words.internal.zzAN.zzL(zz3y.zzZ0e, this.zzZ0e) && com.aspose.words.internal.zzAN.zzL(zz3y.zzZ0f, this.zzZ0f) && com.aspose.words.internal.zzAN.zzL(zz3y.zzZ0g, this.zzZ0g);
    }

    @Override // com.aspose.words.zzBW
    public final int hashCode() {
        return ((super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0e)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0f)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0g);
    }

    public final void zzXB(double d) {
        this.zzZ0g = d;
    }

    public final void zzXC(double d) {
        this.zzZ0f = d;
    }

    public final void zzXD(double d) {
        this.zzZ0e = d;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        return new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzAN.zzZG(this.zzZ0e * 255.0d), com.aspose.words.internal.zzAN.zzZG(this.zzZ0f * 255.0d), com.aspose.words.internal.zzAN.zzZG(this.zzZ0g * 255.0d));
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 2;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz3Y zz3y = new zz3Y();
        zz3y.zzZ0e = this.zzZ0e;
        zz3y.zzZ0f = this.zzZ0f;
        zz3y.zzZ0g = this.zzZ0g;
        zzU(zz3y);
        return zz3y;
    }

    public final double zzZwB() {
        return this.zzZ0g;
    }

    public final double zzZwC() {
        return this.zzZ0f;
    }

    public final double zzZwD() {
        return this.zzZ0e;
    }
}
