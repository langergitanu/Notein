package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzQC extends zzL4 {
    private com.aspose.words.internal.zzPV zzZqK;

    public zzQC(com.aspose.words.internal.zzPV zzpv) {
        super(2, zzpv);
        this.zzZqK = zzpv;
    }

    @Override // com.aspose.words.zzL4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.zzZqK;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzZ(sb, "#{0:x2}{1:x2}{2:x2}", Integer.valueOf(this.zzZqK.zzPC()), Integer.valueOf(this.zzZqK.zzPB()), Integer.valueOf(this.zzZqK.zzPA()));
    }

    @Override // com.aspose.words.zzL4
    public final boolean zzU(zzL4 zzl4) {
        zzQC zzqc = (zzQC) zzl4;
        return this.zzZqK.zzPC() == zzqc.zzZqK.zzPC() && this.zzZqK.zzPB() == zzqc.zzZqK.zzPB() && this.zzZqK.zzPA() == zzqc.zzZqK.zzPA();
    }

    public final com.aspose.words.internal.zzPV zzZWw() {
        return this.zzZqK;
    }
}
