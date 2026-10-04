package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzD implements zzZD9 {
    private String zzZFO;
    private com.aspose.words.internal.zzBG zzZFP;
    private zzZ3T zzZFQ;

    public zzD(zzZ3T zzz3t, com.aspose.words.internal.zzBG zzbg, String str) {
        this.zzZFQ = zzz3t;
        this.zzZFP = zzbg;
        this.zzZFO = str;
    }

    public final com.aspose.words.internal.zzBG zzbG() {
        return this.zzZFP;
    }

    @Override // com.aspose.words.zzZD9
    public final com.aspose.words.internal.zz7 zzbH() {
        com.aspose.words.internal.zzZN zzzn = new com.aspose.words.internal.zzZN(this.zzZFO, this.zzZFQ.zzYNx());
        this.zzZFP.zzX(new com.aspose.words.internal.zzBJ(zzzn.getId()));
        return zzzn;
    }
}
