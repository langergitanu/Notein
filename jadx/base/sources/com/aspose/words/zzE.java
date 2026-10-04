package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzE implements zzZD9 {
    private int zzZFR;
    private int zzZP;
    private com.aspose.words.internal.zzBI zzZQ;

    public zzE(int i, com.aspose.words.internal.zzBI zzbi, int i2) {
        this.zzZQ = zzbi;
        this.zzZP = i;
        this.zzZFR = i2;
    }

    @Override // com.aspose.words.zzZD9
    public final com.aspose.words.internal.zz7 zzbH() {
        return new com.aspose.words.internal.zzJ(this.zzZP, this.zzZQ, this.zzZFR);
    }
}
