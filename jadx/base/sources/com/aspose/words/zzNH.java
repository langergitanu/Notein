package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzNH extends zzL4 {
    private double zzE0;

    public zzNH(double d) {
        super(3, Double.valueOf(d));
        this.zzE0 = d;
    }

    @Override // com.aspose.words.zzL4
    public final double getDoubleValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzZU(this.zzE0));
    }

    public final double zzZVM() {
        return new zzOI(this.zzE0, 6).zzZVW();
    }
}
