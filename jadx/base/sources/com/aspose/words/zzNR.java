package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNR extends zzL4 {
    private int zzZpD;

    public zzNR(int i) {
        super(11, Integer.valueOf(i));
        this.zzZpD = i;
    }

    public final int getIntValue() {
        return this.zzZpD;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        sb.append('#');
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWu(this.zzZpD));
    }
}
