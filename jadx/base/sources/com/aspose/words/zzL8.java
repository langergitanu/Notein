package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: loaded from: classes6.dex */
final class zzL8 extends zzM5 {
    private static zzMA zzZrQ = new zzMA(0, 0, 0);
    private zzNQ zzZnv;

    public zzL8(zzNQ zznq) {
        this.zzZnv = zznq;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        return this.zzZnv.matches(zzzbm.zzZ2G());
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return "any";
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return zzZrQ;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return this.zzZnv.zzZx(C18358t1.g.f56183c, zzNQ.zzZpB.getName());
    }
}
