package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR0 implements zzZCZ {
    private zzZR1 zzYFN;

    public zzZR0(zzZR1 zzzr1) {
        this.zzYFN = zzzr1;
    }

    @Override // com.aspose.words.zzZCZ
    public final String getComparisonOperator() {
        return this.zzYFN.zzT(1, false, false);
    }

    @Override // com.aspose.words.zzZCZ
    public final String getLeftExpression() {
        return this.zzYFN.zzT(0, false, false);
    }

    @Override // com.aspose.words.zzZCZ
    public final String getRightExpression() {
        return this.zzYFN.zzT(2, false, false);
    }

    @Override // com.aspose.words.zzZCZ
    public final zzZR8 zzZfl() {
        return this.zzYFN.zzDH(2);
    }

    @Override // com.aspose.words.zzZCZ
    public final zzZR8 zzZfm() {
        return this.zzYFN.zzDH(0);
    }
}
