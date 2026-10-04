package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVM implements zzZBQ {
    private com.aspose.words.internal.zzOU zzYMj;

    @Override // com.aspose.words.zzZBQ
    public final void zzQ(com.aspose.words.internal.zzPY zzpy) {
    }

    @Override // com.aspose.words.zzZBQ
    public final void zzX(com.aspose.words.internal.zzOU zzou) {
        if (zzou != null) {
            com.aspose.words.internal.zzOU zzouZzNQ = zzou.zzNQ();
            this.zzYMj = zzouZzNQ;
            zzouZzNQ.setWidth(0.15f);
        }
    }

    @Override // com.aspose.words.zzZBQ
    public final com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzQG zzqg, com.aspose.words.internal.zzQB zzqb, com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzOU zzou = this.zzYMj;
        if (zzou == null) {
            zzou = new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa, 0.15f);
        }
        zzzg.zzX(zzou);
        return zzzg;
    }
}
