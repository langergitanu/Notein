package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzC extends com.aspose.words.internal.zz4 {
    private zzZCM zzZFM;
    private zzZCJ zzZFN;

    public zzC(zzZCJ zzzcj, zzZCM zzzcm) {
        this.zzZFN = zzzcj;
        this.zzZFM = zzzcm;
    }

    @Override // com.aspose.words.internal.zz4
    public final void zzZ(com.aspose.words.internal.zzEI zzei) throws Exception {
        this.zzZFN.zzZ(zzei, com.aspose.words.internal.zzEF.zzZU(zzei.getImageBytes()), this.zzZFM);
    }

    @Override // com.aspose.words.internal.zz4, com.aspose.words.internal.zzH5
    public final com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv) {
        return this.zzZFN.zzZ(zzpv, this.zzZFM);
    }
}
