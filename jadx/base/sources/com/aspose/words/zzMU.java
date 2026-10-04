package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzMU extends zzL4 {
    private double zzE0;

    public zzMU(double d) {
        super(5, Double.valueOf(d));
        this.zzE0 = d;
    }

    @Override // com.aspose.words.zzL4
    public final double getDoubleValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0}%", com.aspose.words.internal.zzJB.zzZU(this.zzE0));
    }
}
