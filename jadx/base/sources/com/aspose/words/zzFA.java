package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzFA extends zzCF {
    private double zzE0;
    private boolean zzXu;

    public zzFA(int i, double d) {
        this(i, d, true);
    }

    @Override // com.aspose.words.zzCF
    public final String getStringValue() {
        return "";
    }

    @Override // com.aspose.words.zzCF
    public final double getValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zzCF
    public final boolean isVisible() {
        return this.zzXu;
    }

    public zzFA(int i, double d, boolean z) {
        super(i, 0);
        this.zzE0 = d;
        this.zzXu = z;
    }
}
