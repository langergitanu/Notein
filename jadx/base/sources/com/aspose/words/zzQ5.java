package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;

/* JADX INFO: loaded from: classes6.dex */
class zzQ5 extends zzQB {
    private zzQB zzZqA;
    private zzM5 zzZqB;

    public zzQ5(zzM5 zzm5, zzQB zzqb) {
        this.zzZqB = zzm5;
        this.zzZqA = zzqb;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        return this.zzZqB.zzZ(zzzbm, i) && this.zzZqA.zzZ(zzzbm, i);
    }

    public final zzQB zzZWq() {
        return this.zzZqA;
    }

    public final zzM5 zzZWr() {
        return this.zzZqB;
    }

    @Override // com.aspose.words.zzMD
    public final int zzZWt() {
        return this.zzZqA.zzZWt();
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZWv() {
        return this.zzZqA.zzZWv();
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return this.zzZqB.zzZXt() + C18115b5.CONNECTOR + this.zzZqA.zzZXt();
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return this.zzZqB.zzZXs().zzZ(this.zzZqA.zzZXs());
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return this.zzZqB.zzZXu() + this.zzZqA.zzZXu();
    }
}
