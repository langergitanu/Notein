package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzPP extends zzL4 {
    private double zzE0;

    public zzPP(double d) {
        super(10, Double.valueOf(d));
        this.zzE0 = d;
    }

    @Override // com.aspose.words.zzL4
    public final double getDoubleValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0}deg", com.aspose.words.internal.zzJB.zzZU(this.zzE0));
    }

    @Override // com.aspose.words.zzL4
    public final boolean zzU(zzL4 zzl4) {
        if (zzl4 instanceof zzPP) {
            return com.aspose.words.internal.zzAN.zzQ(this.zzE0, ((zzPP) zzl4).zzE0, 0.005d);
        }
        return false;
    }
}
